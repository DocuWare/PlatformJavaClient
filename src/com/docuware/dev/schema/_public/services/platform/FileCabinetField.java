//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.08.16 um 09:04:54 AM CEST 
//


package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.settings.interop.DWFieldType;


/**
 * <p>Java-Klasse f�r FileCabinetField complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FileCabinetField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FixedEntry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FieldInfoText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Scope" type="{http://dev.docuware.com/schema/public/services/platform}FileCabinetFieldScope" default="User" />
 *       &lt;attribute name="DWFieldType" use="required" type="{http://dev.docuware.com/settings/interop}DWFieldType" />
 *       &lt;attribute name="Length" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *       &lt;attribute name="DBFieldName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DropLeadingZero" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="DropLeadingBlanks" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="UsedAsDocumentName" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="NotEmpty" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Precision" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
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

    /**
     * Ruft den Wert der fixedEntry-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFixedEntry() {
        return fixedEntry;
    }

    /**
     * Legt den Wert der fixedEntry-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFixedEntry(String value) {
        this.fixedEntry = value;
    }

    /**
     * Ruft den Wert der fieldInfoText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldInfoText() {
        return fieldInfoText;
    }

    /**
     * Legt den Wert der fieldInfoText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldInfoText(String value) {
        this.fieldInfoText = value;
    }

    /**
     * Ruft den Wert der scope-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FileCabinetFieldScope }
     *     
     */
    public FileCabinetFieldScope getScope() {
        if (scope == null) {
            return FileCabinetFieldScope.USER;
        } else {
            return scope;
        }
    }

    /**
     * Legt den Wert der scope-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FileCabinetFieldScope }
     *     
     */
    public void setScope(FileCabinetFieldScope value) {
        this.scope = value;
    }

    /**
     * Ruft den Wert der dwFieldType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DWFieldType }
     *     
     */
    public DWFieldType getDWFieldType() {
        return dwFieldType;
    }

    /**
     * Legt den Wert der dwFieldType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DWFieldType }
     *     
     */
    public void setDWFieldType(DWFieldType value) {
        this.dwFieldType = value;
    }

    /**
     * Ruft den Wert der length-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getLength() {
        if (length == null) {
            return  0;
        } else {
            return length;
        }
    }

    /**
     * Legt den Wert der length-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLength(Integer value) {
        this.length = value;
    }

    /**
     * Ruft den Wert der dbFieldName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBFieldName() {
        return dbFieldName;
    }

    /**
     * Legt den Wert der dbFieldName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDBFieldName(String value) {
        this.dbFieldName = value;
    }

    /**
     * Ruft den Wert der displayName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Legt den Wert der displayName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Ruft den Wert der dropLeadingZero-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDropLeadingZero() {
        if (dropLeadingZero == null) {
            return false;
        } else {
            return dropLeadingZero;
        }
    }

    /**
     * Legt den Wert der dropLeadingZero-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDropLeadingZero(Boolean value) {
        this.dropLeadingZero = value;
    }

    /**
     * Ruft den Wert der dropLeadingBlanks-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDropLeadingBlanks() {
        if (dropLeadingBlanks == null) {
            return false;
        } else {
            return dropLeadingBlanks;
        }
    }

    /**
     * Legt den Wert der dropLeadingBlanks-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDropLeadingBlanks(Boolean value) {
        this.dropLeadingBlanks = value;
    }

    /**
     * Ruft den Wert der usedAsDocumentName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUsedAsDocumentName() {
        if (usedAsDocumentName == null) {
            return false;
        } else {
            return usedAsDocumentName;
        }
    }

    /**
     * Legt den Wert der usedAsDocumentName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsedAsDocumentName(Boolean value) {
        this.usedAsDocumentName = value;
    }

    /**
     * Ruft den Wert der notEmpty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNotEmpty() {
        if (notEmpty == null) {
            return false;
        } else {
            return notEmpty;
        }
    }

    /**
     * Legt den Wert der notEmpty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotEmpty(Boolean value) {
        this.notEmpty = value;
    }

    /**
     * Ruft den Wert der precision-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getPrecision() {
        if (precision == null) {
            return  0;
        } else {
            return precision;
        }
    }

    /**
     * Legt den Wert der precision-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrecision(Integer value) {
        this.precision = value;
    }



}
