/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docuware.dev.Extensions;

import com.docuware.dev.schema._public.services.Link;
import com.docuware.dev.schema._public.services.platform.DialogExpressionCondition;
import com.docuware.dev.schema._public.services.platform.DialogInfo;
import com.docuware.dev.schema._public.services.platform.Document;
import com.docuware.dev.schema._public.services.platform.DocumentIndexField;
import com.docuware.dev.schema._public.services.platform.DocumentIndexFieldKeywords;
import com.docuware.dev.schema._public.services.platform.DocumentIndexFields;
import com.docuware.dev.schema._public.services.platform.SortDirection;
import com.docuware.dev.schema._public.services.platform.SortedField;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author Patrick
 */
public class Extensions {

    //intern helper methods
    private static DocumentIndexField findDocumentIndexFieldInList(List<DocumentIndexField> list, String fieldName) {
        for (DocumentIndexField dif : list) {
            if (dif.getFieldName().equals(fieldName)) {
                return dif;
            }
        }
        return null;
    }

    //PlatformServerClientExtensions
    //Extensions for DocoumentIndexField
    static public DocumentIndexField create(String fieldName, String value) {
        DocumentIndexField d = new DocumentIndexField();
        d.setFieldName(fieldName);
        d.setIntOrDecimalOrString(value);
        return d;
    }

    public static DocumentIndexField create(String fieldName, GregorianCalendar value) {
        DocumentIndexField d = new DocumentIndexField();
        d.setFieldName(fieldName);
        d.setIntOrDecimalOrString(value);
        return d;
    }

    public static DocumentIndexField create(String fieldName, double value) {
        DocumentIndexField d = new DocumentIndexField();
        d.setFieldName(fieldName);
        d.setIntOrDecimalOrString(value);
        return d;
    }

    public static DocumentIndexField create(String fieldName, int value) {
        DocumentIndexField d = new DocumentIndexField();
        d.setFieldName(fieldName);
        d.setIntOrDecimalOrString(value);
        return d;
    }

    public static DocumentIndexField create(String fieldName, DocumentIndexFieldKeywords value) {
        DocumentIndexField d = new DocumentIndexField();
        d.setFieldName(fieldName);
        d.setIntOrDecimalOrString(value);
        return d;
    }

    public static DocumentIndexField createDate(String fieldName, GregorianCalendar value) {
        DocumentIndexField d = new DocumentIndexField();
        d.setFieldName(fieldName);
        d.setIntOrDecimalOrString(value);
        return d;
    }

    public static DocumentIndexField createDate(String fieldName, double value) {
        DocumentIndexField d = new DocumentIndexField();
        d.setFieldName(fieldName);
        d.setIntOrDecimalOrString(value);
        return d;
    }

    public static DocumentIndexField createDate(String fieldName, DocumentIndexFieldKeywords value) {
        DocumentIndexField d = new DocumentIndexField();
        d.setFieldName(fieldName);
        d.setIntOrDecimalOrString(value);
        return d;
    }

    public static DocumentIndexField createDate(String fieldName, int value) {
        DocumentIndexField d = new DocumentIndexField();
        d.setFieldName(fieldName);
        d.setIntOrDecimalOrString(value);
        return d;
    }

    public static String linkToString(Link link) {
        return link.getRel() + ":" + link.getRel();
    }

    public static String documentIndexFieldToString(DocumentIndexField dif) {
        StringBuilder sb = new StringBuilder(dif.getFieldName());
        sb.append(" (")
                .append(dif.getIntOrDecimalOrString().getClass().getSimpleName())
                .append("): ");

        if (dif.isIsNull()) {
            sb.append("null");
        } else {
            sb.append(dif.getIntOrDecimalOrString());
        }

        return sb.toString();
    }

    //Extensions for DialogInfo
    public static String dialogInfoToString(DialogInfo di) {
        return di.getDisplayName() + " (" + di.getFileCabinetName() + ")";
    }

    //FieldExtensions
    public static DocumentIndexField getField(List<DocumentIndexField> fields, String fieldName) {
        DocumentIndexField field = null;
        for (DocumentIndexField dif : fields) {
            if (dif.getFieldName().equals(fieldName)) {
                field = dif;
                break;
            }

        }
        if (field == null) {
            throw new RuntimeException("The field with the name '" + fieldName + "' is not part of the fields.");
        }
        return field;
    }

    public static void createOrUpdate(List<DocumentIndexField> fields, String fieldName, DocumentIndexField value) {
        int i = -1;
        for (int j = 0; j < fields.size(); j++) {
            if (fields.get(j).getFieldName().equals(fieldName)) {
                i = j;
                break;
            }
            if (i == -1) {
                fields.add(value);
            } else {
                fields.set(i, value);
            }
        }
    }

    //DocumentIndexFields
    public static DocumentIndexField getDocumentIndexFieldByNameFromDocumentIndexFields(DocumentIndexFields difs, String fieldName) {
        if (difs.getField() == null) {
            difs.getField();
        }
        return findDocumentIndexFieldInList(difs.getField(), fieldName);
    }

    public static void setDocumentIndexFieldByNameFromDocumentIndexFields(DocumentIndexFields difs, String fieldName, DocumentIndexField value) {

        if (difs.getField() == null) {
            difs.getField();
        }
        Extensions.createOrUpdate(difs.getField(), fieldName, value);
    }

    //Document
    public static DocumentIndexField getDocumentIndexFieldByNameFromDocument(Document doc, String fieldName) {
        if (doc.getFields().getField() == null) {
            doc.getFields().getField();
        }

        return findDocumentIndexFieldInList(doc.getFields().getField(), fieldName);
    }

    public static void setDocumentIndexFieldByNameFromDocument(Document doc, String fieldName, DocumentIndexField value) {
        if (doc.getFields().getField() == null) {
            doc.getFields().getField();
        }
        Extensions.createOrUpdate(doc.getFields().getField(), fieldName, value);
    }

    public static String documentToString(Document doc) {
        return doc.getId() +": "+ doc.getTitle() != null ? doc.getTitle() : doc.getCreatedAt().toString();
    }

    //SortedField
    public static SortedField create(String fieldName, SortDirection direction) {
        SortedField sf = new SortedField();
        sf.setDirection(direction);
        sf.setField(fieldName);
        return sf;
    }

    public static SortedField create(String fieldName) {
        return Extensions.create(fieldName, SortDirection.ASC);
    }

    //DialogExpressionCondition
    public static DialogExpressionCondition createDia(String fieldName, String value) {
        DialogExpressionCondition dec = new DialogExpressionCondition();
        dec.setDBName(fieldName);
        dec.getValue().add(value);
        return dec;

    }

    public static DialogExpressionCondition create(String fieldName, String valueFrom, String valueTo) {
        DialogExpressionCondition dec = new DialogExpressionCondition();
        dec.setDBName(fieldName);
        dec.getValue().add(valueFrom);
        dec.getValue().add(valueTo);
        return dec;
    }

}
