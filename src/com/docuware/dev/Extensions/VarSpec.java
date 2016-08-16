/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docuware.dev.Extensions;

/**
 *
 * @author Patrick
 */
class VarSpec {

    private OperatorInfo _operatorInfo;
    public StringBuilder VarName = new StringBuilder();
    public boolean Explode = false;
    public int PrefixLength = 0;
    public boolean First = true;

    public VarSpec(OperatorInfo operatorInfo) {
        _operatorInfo = operatorInfo;
    }

    private OperatorInfo OperatorInfo;

    public OperatorInfo getOperatorInfo() {
        return _operatorInfo;
    }

}
