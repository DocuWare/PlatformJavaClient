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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r BatchUpdateProcessData complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BatchUpdateProcessData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Field" type="{http://dev.docuware.com/schema/public/services/platform}DocumentIndexField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StoreDialogId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BatchSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BreakOnError" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchUpdateProcessData", propOrder = {
    "field",
    "storeDialogId",
    "batchSize",
    "breakOnError"
})
public class BatchUpdateProcessData  {

    @XmlElement(name = "Field")
    protected List<DocumentIndexField> field;
    @XmlElement(name = "StoreDialogId")
    protected String storeDialogId;
    @XmlElement(name = "BatchSize", required = true, type = Integer.class, nillable = true)
    protected Integer batchSize;
    @XmlElement(name = "BreakOnError", defaultValue = "true")
    protected boolean breakOnError;

    /**
     * Gets the value of the field property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the field property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentIndexField }
     * 
     * 
     */
    public List<DocumentIndexField> getField() {
        if (field == null) {
            field = new ArrayList<DocumentIndexField>();
        }
        return this.field;
    }

    /**
     * Ruft den Wert der storeDialogId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreDialogId() {
        return storeDialogId;
    }

    /**
     * Legt den Wert der storeDialogId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreDialogId(String value) {
        this.storeDialogId = value;
    }

    /**
     * Ruft den Wert der batchSize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBatchSize() {
        return batchSize;
    }

    /**
     * Legt den Wert der batchSize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBatchSize(Integer value) {
        this.batchSize = value;
    }

    /**
     * Ruft den Wert der breakOnError-Eigenschaft ab.
     * 
     */
    public boolean isBreakOnError() {
        return breakOnError;
    }

    /**
     * Legt den Wert der breakOnError-Eigenschaft fest.
     * 
     */
    public void setBreakOnError(boolean value) {
        this.breakOnError = value;
    }



}