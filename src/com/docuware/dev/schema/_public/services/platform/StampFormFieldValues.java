

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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StampFormFieldValues", propOrder = {
    "field"
})
public class StampFormFieldValues  {

    @XmlElement(name = "Field")
    protected List<FormFieldValue> field;
    @XmlAttribute(name = "StampId")
    @XmlSchemaType(name = "anySimpleType")
    protected String stampId;

    /**The form field values which are applied when placing the stamp.*/
    public List<FormFieldValue> getField() {
        if (field == null) {
            field = new ArrayList<FormFieldValue>();
        }
        return this.field;
    }

    /**The Id of the stamp to place.*/
    public String getStampId() {
        return stampId;
    }

    /**The Id of the stamp to place.*/
    public void setStampId(String value) {
        this.stampId = value;
    }



}
