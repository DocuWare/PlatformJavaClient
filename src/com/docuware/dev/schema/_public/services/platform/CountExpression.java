

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountExpression", propOrder = {
    "dialogExpression"
})
public class CountExpression  {

    @XmlElement(name = "DialogExpression")
    protected DialogExpression dialogExpression;
    @XmlAttribute(name = "FieldName")
    protected String fieldName;
    @XmlAttribute(name = "Limit")
    protected Integer limit;

    /**The expression with already filled values.*/
    public DialogExpression getDialogExpression() {
        return dialogExpression;
    }

    /**The expression with already filled values.*/
    public void setDialogExpression(DialogExpression value) {
        this.dialogExpression = value;
    }

    /**The database name of the dialog field whose groups are to be counted. In case
					you want only the number of hits matching the dialog expression just leave this field empty.*/
    public String getFieldName() {
        return fieldName;
    }

    /**The database name of the dialog field whose groups are to be counted. In case
					you want only the number of hits matching the dialog expression just leave this field empty.*/
    public void setFieldName(String value) {
        this.fieldName = value;
    }

    /**Limit the count up to specified value. Used for optimization and currently affecting only general count (when FieldName is not specified)*/
    @Eagle
    public int getLimit() {
        if (limit == null) {
            return  0;
        } else {
            return limit;
        }
    }

    /**Limit the count up to specified value. Used for optimization and currently affecting only general count (when FieldName is not specified)*/
    @Eagle
    public void setLimit(Integer value) {
        this.limit = value;
    }



}
