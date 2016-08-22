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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.settings.interop.DWFieldType;


/**
 * <p>Java-Klasse f�r StampField complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="StampField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Value" type="{http://dev.docuware.com/schema/public/services/platform}DocumentIndexFieldValue" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DWType" use="required" type="{http://dev.docuware.com/settings/interop}DWFieldType" />
 *       &lt;attribute name="Length" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="HasFixedEntry" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
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

    /**
     * Ruft den Wert der value-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIndexFieldValue }
     *     
     */
    public DocumentIndexFieldValue getValue() {
        return value;
    }

    /**
     * Legt den Wert der value-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIndexFieldValue }
     *     
     */
    public void setValue(DocumentIndexFieldValue value) {
        this.value = value;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der dwType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DWFieldType }
     *     
     */
    public DWFieldType getDWType() {
        return dwType;
    }

    /**
     * Legt den Wert der dwType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DWFieldType }
     *     
     */
    public void setDWType(DWFieldType value) {
        this.dwType = value;
    }

    /**
     * Ruft den Wert der length-Eigenschaft ab.
     * 
     */
    public int getLength() {
        return length;
    }

    /**
     * Legt den Wert der length-Eigenschaft fest.
     * 
     */
    public void setLength(int value) {
        this.length = value;
    }

    /**
     * Ruft den Wert der hasFixedEntry-Eigenschaft ab.
     * 
     */
    public boolean isHasFixedEntry() {
        return hasFixedEntry;
    }

    /**
     * Legt den Wert der hasFixedEntry-Eigenschaft fest.
     * 
     */
    public void setHasFixedEntry(boolean value) {
        this.hasFixedEntry = value;
    }



}
