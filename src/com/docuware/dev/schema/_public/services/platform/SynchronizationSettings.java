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


/**
 * <p>Java-Klasse f�r SynchronizationSettings complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SynchronizationSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FieldMappings" type="{http://dev.docuware.com/schema/public/services/platform}FieldMappings" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SynchronizationOperation" type="{http://dev.docuware.com/schema/public/services/platform}SynchronizationOperation" default="Add" />
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}int" default="-1" />
 *       &lt;attribute name="PreserveSystemFields" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ImportNotMappedFields" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SynchronizationSettings", propOrder = {
    "fieldMappings"
})
public class SynchronizationSettings  implements IStringContent {

    @XmlElement(name = "FieldMappings")
    protected FieldMappings fieldMappings;
    @XmlAttribute(name = "SynchronizationOperation")
    protected SynchronizationOperation synchronizationOperation;
    @XmlAttribute(name = "Id")
    protected Integer id;
    @XmlAttribute(name = "PreserveSystemFields")
    protected Boolean preserveSystemFields;
    @XmlAttribute(name = "ImportNotMappedFields")
    protected Boolean importNotMappedFields;

    /**
     * Ruft den Wert der fieldMappings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldMappings }
     *     
     */
    public FieldMappings getFieldMappings() {
        return fieldMappings;
    }

    /**
     * Legt den Wert der fieldMappings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldMappings }
     *     
     */
    public void setFieldMappings(FieldMappings value) {
        this.fieldMappings = value;
    }

    /**
     * Ruft den Wert der synchronizationOperation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SynchronizationOperation }
     *     
     */
    public SynchronizationOperation getSynchronizationOperation() {
        if (synchronizationOperation == null) {
            return SynchronizationOperation.ADD;
        } else {
            return synchronizationOperation;
        }
    }

    /**
     * Legt den Wert der synchronizationOperation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SynchronizationOperation }
     *     
     */
    public void setSynchronizationOperation(SynchronizationOperation value) {
        this.synchronizationOperation = value;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getId() {
        if (id == null) {
            return -1;
        } else {
            return id;
        }
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der preserveSystemFields-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPreserveSystemFields() {
        if (preserveSystemFields == null) {
            return false;
        } else {
            return preserveSystemFields;
        }
    }

    /**
     * Legt den Wert der preserveSystemFields-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreserveSystemFields(Boolean value) {
        this.preserveSystemFields = value;
    }

    /**
     * Ruft den Wert der importNotMappedFields-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isImportNotMappedFields() {
        if (importNotMappedFields == null) {
            return false;
        } else {
            return importNotMappedFields;
        }
    }

    /**
     * Legt den Wert der importNotMappedFields-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setImportNotMappedFields(Boolean value) {
        this.importNotMappedFields = value;
    }



}
