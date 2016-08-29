

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
@XmlType(name = "FileCabinetField", propOrder = {
    "fixedEntry",
    "fieldInfoText"
})
public class FileCabinetField  {

    @XmlElement(name = "FixedEntry")
    protected String fixedEntry;
    @XmlElement(name = "FieldInfoText")
    protected String fieldInfoText;
    @XmlAttribute(name = "Scope")
    protected FileCabinetFieldScope scope;
    @XmlAttribute(name = "DWFieldType", required = true)
    protected DWFieldType dwFieldType;
    @XmlAttribute(name = "Length")
    protected Integer length;
    @XmlAttribute(name = "DBFieldName")
    protected String dbFieldName;
    @XmlAttribute(name = "DisplayName")
    protected String displayName;
    @XmlAttribute(name = "DropLeadingZero")
    protected Boolean dropLeadingZero;
    @XmlAttribute(name = "DropLeadingBlanks")
    protected Boolean dropLeadingBlanks;
    @XmlAttribute(name = "UsedAsDocumentName")
    protected Boolean usedAsDocumentName;
    @XmlAttribute(name = "NotEmpty")
    protected Boolean notEmpty;
    @XmlAttribute(name = "Precision")
    protected Integer precision;

    /**Fixed value of the field.If it's null the field has no fixed value.*/
    public String getFixedEntry() {
        return fixedEntry;
    }

    /**Fixed value of the field.If it's null the field has no fixed value.*/
    public void setFixedEntry(String value) {
        this.fixedEntry = value;
    }

    /**Description of the field.*/
    public String getFieldInfoText() {
        return fieldInfoText;
    }

    /**Description of the field.*/
    public void setFieldInfoText(String value) {
        this.fieldInfoText = value;
    }

    /**Gets whether the field is a user or a system field.*/
    public FileCabinetFieldScope getScope() {
        if (scope == null) {
            return FileCabinetFieldScope.USER;
        } else {
            return scope;
        }
    }

    /**Gets whether the field is a user or a system field.*/
    public void setScope(FileCabinetFieldScope value) {
        this.scope = value;
    }

    /**The DocuWare type of the field*/
    public DWFieldType getDWFieldType() {
        return dwFieldType;
    }

    /**The DocuWare type of the field*/
    public void setDWFieldType(DWFieldType value) {
        this.dwFieldType = value;
    }

    /**Lenght of the field (for text fields).*/
    public int getLength() {
        if (length == null) {
            return  0;
        } else {
            return length;
        }
    }

    /**Lenght of the field (for text fields).*/
    public void setLength(Integer value) {
        this.length = value;
    }

    /**The name of the database column for the field.*/
    public String getDBFieldName() {
        return dbFieldName;
    }

    /**The name of the database column for the field.*/
    public void setDBFieldName(String value) {
        this.dbFieldName = value;
    }

    /**Label (display name) of the field.*/
    public String getDisplayName() {
        return displayName;
    }

    /**Label (display name) of the field.*/
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**Determines whether the system will automatically remove any leading zeros. If both the Remove leading spaces and Remove leading zeros options are enabled, both leading spaces and zeros are removed: _07896 becomes 7896.*/
    public boolean isDropLeadingZero() {
        if (dropLeadingZero == null) {
            return false;
        } else {
            return dropLeadingZero;
        }
    }

    /**Determines whether the system will automatically remove any leading zeros. If both the Remove leading spaces and Remove leading zeros options are enabled, both leading spaces and zeros are removed: _07896 becomes 7896.*/
    public void setDropLeadingZero(Boolean value) {
        this.dropLeadingZero = value;
    }

    /**Determines whether the system will automatically remove any leading spaces. If both the Remove leading spaces and Remove leading zeros options are enabled, both leading spaces and zeros are removed: _07896 becomes 7896.*/
    public boolean isDropLeadingBlanks() {
        if (dropLeadingBlanks == null) {
            return false;
        } else {
            return dropLeadingBlanks;
        }
    }

    /**Determines whether the system will automatically remove any leading spaces. If both the Remove leading spaces and Remove leading zeros options are enabled, both leading spaces and zeros are removed: _07896 becomes 7896.*/
    public void setDropLeadingBlanks(Boolean value) {
        this.dropLeadingBlanks = value;
    }

    /**Determines whether the field is used as document name.*/
    public boolean isUsedAsDocumentName() {
        if (usedAsDocumentName == null) {
            return false;
        } else {
            return usedAsDocumentName;
        }
    }

    /**Determines whether the field is used as document name.*/
    public void setUsedAsDocumentName(Boolean value) {
        this.usedAsDocumentName = value;
    }

    /**If this flag is true then this field must have an entry, otherwise the document cannot be stored.*/
    public boolean isNotEmpty() {
        if (notEmpty == null) {
            return false;
        } else {
            return notEmpty;
        }
    }

    /**If this flag is true then this field must have an entry, otherwise the document cannot be stored.*/
    public void setNotEmpty(Boolean value) {
        this.notEmpty = value;
    }

    /**The number of decimal places that can be entered after the decimal point of a numeric field.*/
    public int getPrecision() {
        if (precision == null) {
            return  0;
        } else {
            return precision;
        }
    }

    /**The number of decimal places that can be entered after the decimal point of a numeric field.*/
    public void setPrecision(Integer value) {
        this.precision = value;
    }



}
