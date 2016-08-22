//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.08.22 um 03:45:48 PM CEST 
//


package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Define possible flags for a document
 * 
 * <p>Java-Klasse f�r DocumentFlags complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DocumentFlags">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="IsCold" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="IsDBRecord" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="IsCheckedOut" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="IsCopyRightProtected" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="IsVoiceAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="HasAppendedDocuments" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="IsProtected" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="IsDeleted" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="IsEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentFlags")
public class DocumentFlags  {

    @XmlAttribute(name = "IsCold")
    protected Boolean isCold;
    @XmlAttribute(name = "IsDBRecord")
    protected Boolean isDBRecord;
    @XmlAttribute(name = "IsCheckedOut")
    protected Boolean isCheckedOut;
    @XmlAttribute(name = "IsCopyRightProtected")
    protected Boolean isCopyRightProtected;
    @XmlAttribute(name = "IsVoiceAvailable")
    protected Boolean isVoiceAvailable;
    @XmlAttribute(name = "HasAppendedDocuments")
    protected Boolean hasAppendedDocuments;
    @XmlAttribute(name = "IsProtected")
    protected Boolean isProtected;
    @XmlAttribute(name = "IsDeleted")
    protected Boolean isDeleted;
    @XmlAttribute(name = "IsEmail")
    protected Boolean isEmail;

    /**
     * Ruft den Wert der isCold-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsCold() {
        if (isCold == null) {
            return false;
        } else {
            return isCold;
        }
    }

    /**
     * Legt den Wert der isCold-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCold(Boolean value) {
        this.isCold = value;
    }

    /**
     * Ruft den Wert der isDBRecord-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsDBRecord() {
        if (isDBRecord == null) {
            return false;
        } else {
            return isDBRecord;
        }
    }

    /**
     * Legt den Wert der isDBRecord-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDBRecord(Boolean value) {
        this.isDBRecord = value;
    }

    /**
     * Ruft den Wert der isCheckedOut-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsCheckedOut() {
        if (isCheckedOut == null) {
            return false;
        } else {
            return isCheckedOut;
        }
    }

    /**
     * Legt den Wert der isCheckedOut-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCheckedOut(Boolean value) {
        this.isCheckedOut = value;
    }

    /**
     * Ruft den Wert der isCopyRightProtected-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsCopyRightProtected() {
        if (isCopyRightProtected == null) {
            return false;
        } else {
            return isCopyRightProtected;
        }
    }

    /**
     * Legt den Wert der isCopyRightProtected-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCopyRightProtected(Boolean value) {
        this.isCopyRightProtected = value;
    }

    /**
     * Ruft den Wert der isVoiceAvailable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsVoiceAvailable() {
        if (isVoiceAvailable == null) {
            return false;
        } else {
            return isVoiceAvailable;
        }
    }

    /**
     * Legt den Wert der isVoiceAvailable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsVoiceAvailable(Boolean value) {
        this.isVoiceAvailable = value;
    }

    /**
     * Ruft den Wert der hasAppendedDocuments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isHasAppendedDocuments() {
        if (hasAppendedDocuments == null) {
            return false;
        } else {
            return hasAppendedDocuments;
        }
    }

    /**
     * Legt den Wert der hasAppendedDocuments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasAppendedDocuments(Boolean value) {
        this.hasAppendedDocuments = value;
    }

    /**
     * Ruft den Wert der isProtected-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsProtected() {
        if (isProtected == null) {
            return false;
        } else {
            return isProtected;
        }
    }

    /**
     * Legt den Wert der isProtected-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsProtected(Boolean value) {
        this.isProtected = value;
    }

    /**
     * Ruft den Wert der isDeleted-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsDeleted() {
        if (isDeleted == null) {
            return false;
        } else {
            return isDeleted;
        }
    }

    /**
     * Legt den Wert der isDeleted-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDeleted(Boolean value) {
        this.isDeleted = value;
    }

    /**
     * Ruft den Wert der isEmail-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsEmail() {
        if (isEmail == null) {
            return false;
        } else {
            return isEmail;
        }
    }

    /**
     * Legt den Wert der isEmail-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEmail(Boolean value) {
        this.isEmail = value;
    }



}
