

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DialogExpression", propOrder = {
    "condition",
    "additionalCabinets"
})
public class DialogExpression
    extends ResultListQuery
 {

    @XmlElement(name = "Condition")
    protected List<DialogExpressionCondition> condition;
    @XmlElement(name = "AdditionalCabinets")
    protected List<String> additionalCabinets;
    @XmlAttribute(name = "Operation", required = true)
    protected DialogExpressionOperation operation;

    /**Gets or sets the conditions which are checked to obtain the search result.*/
    public List<DialogExpressionCondition> getCondition() {
        if (condition == null) {
            condition = new ArrayList<DialogExpressionCondition>();
        }
        return this.condition;
    }

    /**Gets or sets the additional cabinets to search in.*/
    @Eagle
    public List<String> getAdditionalCabinets() {
        if (additionalCabinets == null) {
            additionalCabinets = new ArrayList<String>();
        }
        return this.additionalCabinets;
    }

    /**Specifies the operation between the conditions of the dialog expression.*/
    public DialogExpressionOperation getOperation() {
        return operation;
    }

    /**Specifies the operation between the conditions of the dialog expression.*/
    public void setOperation(DialogExpressionOperation value) {
        this.operation = value;
    }



}
