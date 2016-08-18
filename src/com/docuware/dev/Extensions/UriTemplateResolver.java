/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docuware.dev.Extensions;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Patrick
 */
class UriTemplateResolver {

    private static final String _UriReservedSymbols = ":/?#[]@!$&'()*+,;=";
    private static final String _UriUnreservedSymbols = "-._~";
    private static final HashMap<Character, OperatorInfo> _Operators = new HashMap<>();

    private static void initiateOperators() {
        _Operators.put('\u0000', new OperatorInfo(true, "", ',', false, "", false));
        _Operators.put('+', new OperatorInfo(false, "", ',', false, "", true));
        _Operators.put('.', new OperatorInfo(false, ".", '.', false, "", false));
        _Operators.put('/', new OperatorInfo(false, "/", '/', false, "", false));
        _Operators.put(';', new OperatorInfo(false, ";", ';', true, "", false));
        _Operators.put('?', new OperatorInfo(false, "?", '&', true, "=", false));
        _Operators.put('&', new OperatorInfo(false, "&", '&', true, "=", false));
        _Operators.put('#', new OperatorInfo(false, "#", ',', false, "", true));
    }

    private final String _template;
    private final HashMap<String, Object> _Parameters = new HashMap<>();

    private enum States {

        CopyingLiterals, ParsingExpression
    }
    private boolean _ErrorDetected = false;
    private StringBuilder _Result;
    private List<String> _ParameterNames;

    public UriTemplateResolver(String template) {
        _template = template;
    }

    public void SetParameter(String name, Object value) {
        _Parameters.put(name, value);
    }

    public Iterable<String> GetParameterNames() {
        List<String> parameterNames = new LinkedList<>();
        _ParameterNames = parameterNames;
        Resolve();
        _ParameterNames = null;
        return parameterNames;
    }

    public String Resolve() {
        States currentState = States.CopyingLiterals;
        _Result = new StringBuilder();
        StringBuilder currentExpression = null;
        for (char character : _template.toCharArray()) {
            switch (currentState) {
                case CopyingLiterals:
                    if (character == '{') {
                        currentState = States.ParsingExpression;
                        currentExpression = new StringBuilder();
                    } else {
                        _Result.append(character);
                    }
                    break;
                case ParsingExpression:
                    if (character == '}') {
                        ProcessExpression(currentExpression);

                        currentState = States.CopyingLiterals;
                    } else {
                        currentExpression.append(character);
                    }

                    break;
            }
        }
        if (currentState == States.ParsingExpression) {
            _Result.append("{");
            _Result.append(currentExpression.toString());

            throw new RuntimeException("Malformed template : " + _Result.toString());
        }

        if (_ErrorDetected) {
            throw new RuntimeException("Malformed template : " + _Result.toString());
        }
        return _Result.toString();
    }

    private void ProcessExpression(StringBuilder currentExpression) {

        if (currentExpression.length() == 0) {
            _ErrorDetected = true;
            _Result.append("{}");
            return;
        }

        OperatorInfo op = GetOperator(currentExpression.charAt(0));

        int firstChar = op.isDefault() ? 0 : 1;

        VarSpec varSpec = new VarSpec(op);
        for (int i = firstChar; i < currentExpression.length(); i++) {
            char currentChar = currentExpression.charAt(i);
            switch (currentChar) {
                case '*':
                    varSpec.Explode = true;
                    break;
                case ':':  // Parse Prefix Modifier
                    StringBuilder prefixText = new StringBuilder();
                    currentChar = currentExpression.charAt(++i);
                    while (currentChar >= '0' && currentChar <= '9' && i < currentExpression.length()) {
                        prefixText.append(currentChar);
                        i++;
                        if (i < currentExpression.length()) {
                            currentChar = currentExpression.charAt(i);
                        }
                    }
                    varSpec.PrefixLength = Integer.parseInt(prefixText.toString());
                    i--;
                    break;
                case ',':
                    boolean success = ProcessVariable(varSpec);
                    boolean isFirst = varSpec.First;
                    // Reset for new variable
                    varSpec = new VarSpec(op);
                    if (success || !isFirst) {
                        varSpec.First = false;
                    }

                    break;
                default:
                    varSpec.VarName.append(currentChar);
                    break;
            }
        }
        ProcessVariable(varSpec);

    }

    private boolean ProcessVariable(VarSpec varSpec) {
        String varname = varSpec.VarName.toString();
        if (_ParameterNames != null) {
            _ParameterNames.add(varname);
        }

        if (!_Parameters.containsKey(varname)
                || _Parameters.get(varname) == null
                || (_Parameters.get(varname) instanceof Collection && ((Collection) _Parameters.get(varname)).size() == 0)) {
            return false;
        }

        if (varSpec.First) {
            _Result.append(varSpec.getOperatorInfo().getFirst());
        } else {
            _Result.append(varSpec.getOperatorInfo().getSeperator());
        }

        Object value = _Parameters.get(varname);
        Map dictionary = null;
        try {
            dictionary = (Map) value;
        } catch (Exception e) {
        }
        if (dictionary != null) {
            if (varSpec.getOperatorInfo().isNamed() && !varSpec.Explode) // exploding will prefix with list name
            {
                AppendName(varname, varSpec.getOperatorInfo(), dictionary.isEmpty());
            }
            AppendDictionary(varSpec.getOperatorInfo(), varSpec.Explode, dictionary);
        } else {
            Collection list = null;
            try {
                list = (Collection) value;
            } catch (Exception e) {
            }
            if (list != null) {
                if (varSpec.getOperatorInfo().isNamed() && !varSpec.Explode) // exploding will prefix with list name
                {
                    AppendName(varname, varSpec.getOperatorInfo(), list.isEmpty());
                }
                AppendList(varSpec.getOperatorInfo(), varSpec.Explode, varname, list);
            } else {
                boolean isNullOrEmpty = value == null;
                if (!isNullOrEmpty) {
                    String stringValue = null;
                    try {
                        stringValue = (String) value;
                    } catch (Exception e) {
                    }
                    if (stringValue != null) {
                        isNullOrEmpty = stringValue.equals("");
                    }
                }
                if (varSpec.getOperatorInfo().isNamed()) {
                    AppendName(varname, varSpec.getOperatorInfo(), isNullOrEmpty);
                }
                AppendValue(value, varSpec.PrefixLength, varSpec.getOperatorInfo().isAllowReserved());
            }
        }

        return true;
    }

    private void AppendDictionary(OperatorInfo op, boolean explode, Map<String, Object> dictionary) {
        for (String key : dictionary.keySet()) {
            _Result.append(key);
            _Result.append(explode ? '=' : ',');

            AppendValue(dictionary.get(key), 0, op.isAllowReserved());

            if (explode) {
                _Result.append(op.getSeperator());
            } else {
                _Result.append(',');
            }
        }
        if (dictionary.size() > 0) {
            _Result = _Result.delete(_Result.length() - 1, _Result.length());
        }
    }

    private void AppendList(OperatorInfo op, boolean explode, String variable, Collection list) {
        for (Object item : list) {
            if (op.isNamed() && explode) {
                _Result.append(variable);
                _Result.append("=");
            }
            AppendValue(item, 0, op.isAllowReserved());

            _Result.append(explode ? op.getSeperator() : ',');
        }
        if (list.size() > 0) {
            _Result = _Result.delete(_Result.length() - 1, _Result.length());
        }
    }

    private void AppendValue(Object v, int prefixLength, boolean allowReserved) {
        String value;
        if (v instanceof String) {
            value = (String) v;
        } else {
            value = v.toString();
        }

        if (prefixLength != 0) {
            if (prefixLength < value.length()) {
                value = value.substring(0, prefixLength);
            }
        }

        _Result.append(Encode(value, allowReserved));

    }

    private void AppendName(String variable, OperatorInfo op, boolean valueIsEmpty) {
        _Result.append(variable);
        _Result.append(valueIsEmpty ? op.getIfEmpty() : "=");
    }

    private static String Encode(String p, boolean allowReserved) {
        StringBuilder result = new StringBuilder();
        for (char c : p.toCharArray()) {
            if ((c >= 'A' && c <= 'z') //Alpha
                    || (c >= '0' && c <= '9') // Digit
                    || _UriUnreservedSymbols.indexOf(c) != -1 // Unreserved symbols  - These should never be percent encoded
                    || (allowReserved && _UriReservedSymbols.indexOf(c) != -1)) // Reserved symbols - should be included if requested (+)
            {
                result.append(c);
            } else {
                ;
                result.append("%").append(Integer.toHexString((int) c));
            }
        }

        return result.toString();
    }

    private static OperatorInfo GetOperator(char operatorIndicator) {
        if (_Operators.isEmpty()) {
            initiateOperators();
        }
        OperatorInfo op;
        switch (operatorIndicator) {
            case '+':
            case ';':
            case '/':
            case '#':
            case '&':
            case '?':
            case '.':
                op = _Operators.get(operatorIndicator);
                break;

            default:
                op = _Operators.get('\0');
                break;
        }
        return op;
    }
}
