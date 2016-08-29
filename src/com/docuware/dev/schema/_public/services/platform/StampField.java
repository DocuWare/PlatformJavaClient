

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
import com.docuware.dev.settings.interop.DWFieldType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StampField", propOrder = {
    "value"
})
public class StampField  {

    @XmlElement(name = "Value")
    protected DocumentIndexFieldValue value;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "DWType", required = true)
    protected DWFieldType dwType;
    @XmlAttribute(name = "Length", required = true)
    protected int length;
    @XmlAttribute(name = "HasFixedEntry", required = true)
    protected boolean hasFixedEntry;

    /**Get or sets the form field value casted to the index field type.*/
    public DocumentIndexFieldValue getValue() {
        return value;
    }

    public void setValue(DocumentIndexFieldValue value) {
        this.value = value;
    }

    /**Name of the index field that will be changed by the stamp.*/
    public String getName() {
        return name;
    }

    /**Name of the index field that will be changed by the stamp.*/
    public void setName(String value) {
        this.name = value;
    }

    /**The DocuWare type of the index field that will be changed by the stamp.*/
    public DWFieldType getDWType() {
        return dwType;
    }

    /**The DocuWare type of the index field that will be changed by the stamp.*/
    public void setDWType(DWFieldType value) {
        this.dwType = value;
    }

    /**Length of the index field that will be changed by the stamp.*/
    public int getLength() {
        return length;
    }

    /**Length of the index field that will be changed by the stamp.*/
    public void setLength(int value) {
        this.length = value;
    }

    /**Determines whether the stamp field has defined fixed entry.*/
    public boolean isHasFixedEntry() {
        return hasFixedEntry;
    }

    /**Determines whether the stamp field has defined fixed entry.*/
    public void setHasFixedEntry(boolean value) {
        this.hasFixedEntry = value;
    }



}
