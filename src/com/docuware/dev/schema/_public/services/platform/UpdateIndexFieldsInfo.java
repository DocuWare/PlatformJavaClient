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
 * Structure for updating index fields, including the index fields values and the dialog used for updating.
 * 
 * <p>Java-Klasse f�r UpdateIndexFieldsInfo complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UpdateIndexFieldsInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}DocumentIndexFields">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="DialogId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="NormalizeCoordinates" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateIndexFieldsInfo")
public class UpdateIndexFieldsInfo
    extends DocumentIndexFields
 {

    @XmlAttribute(name = "DialogId")
    protected String dialogId;
    @XmlAttribute(name = "NormalizeCoordinates")
    protected Boolean normalizeCoordinates;

    /**
     * Ruft den Wert der dialogId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDialogId() {
        return dialogId;
    }

    /**
     * Legt den Wert der dialogId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDialogId(String value) {
        this.dialogId = value;
    }

    /**
     * Ruft den Wert der normalizeCoordinates-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNormalizeCoordinates() {
        if (normalizeCoordinates == null) {
            return false;
        } else {
            return normalizeCoordinates;
        }
    }

    /**
     * Legt den Wert der normalizeCoordinates-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNormalizeCoordinates(Boolean value) {
        this.normalizeCoordinates = value;
    }



}
