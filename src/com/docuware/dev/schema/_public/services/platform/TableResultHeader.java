

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TableResultHeader")
public class TableResultHeader  {

    @XmlAttribute(name = "FieldName", required = true)
    protected String fieldName;
    @XmlAttribute(name = "Type", required = true)
    protected String type;
    @XmlAttribute(name = "FieldLabel")
    protected String fieldLabel;
    @XmlAttribute(name = "Kind", required = true)
    protected TableResultFieldKind kind;
    @XmlAttribute(name = "IsDocumentName")
    protected Boolean isDocumentName;

    /**Contains the internal name of the field.*/
    public String getFieldName() {
        return fieldName;
    }

    /**Contains the internal name of the field.*/
    public void setFieldName(String value) {
        this.fieldName = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String value) {
        this.type = value;
    }

    /**Contains the label of the field.*/
    public String getFieldLabel() {
        return fieldLabel;
    }

    /**Contains the label of the field.*/
    public void setFieldLabel(String value) {
        this.fieldLabel = value;
    }

    /**Kind of the field.
          System, index or additional (calculated fields like total page count, special values like text preview etc.).*/
    public TableResultFieldKind getKind() {
        return kind;
    }

    /**Kind of the field.
          System, index or additional (calculated fields like total page count, special values like text preview etc.).*/
    public void setKind(TableResultFieldKind value) {
        this.kind = value;
    }

    /**Indicates whether the field is document name*/
    public boolean isIsDocumentName() {
        if (isDocumentName == null) {
            return false;
        } else {
            return isDocumentName;
        }
    }

    /**Indicates whether the field is document name*/
    public void setIsDocumentName(Boolean value) {
        this.isDocumentName = value;
    }



}
