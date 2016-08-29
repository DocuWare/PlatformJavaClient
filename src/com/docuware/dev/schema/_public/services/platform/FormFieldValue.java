

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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormFieldValue", propOrder = {
    "typedValue"
})
@XmlSeeAlso({
    DecisionFormFieldValue.class
})
public class FormFieldValue  {

    @XmlElement(name = "TypedValue")
    protected DocumentIndexFieldValue typedValue;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Value")
    protected String value;

    /**Get or sets the form field value casted to the index field type.*/
    public DocumentIndexFieldValue getTypedValue() {
        return typedValue;
    }

    /**Get or sets the display value of the form field.*/
    public void setTypedValue(DocumentIndexFieldValue value) {
        this.typedValue = value;
    }

    /**Get or sets the name of the form field.*/
    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }



}
