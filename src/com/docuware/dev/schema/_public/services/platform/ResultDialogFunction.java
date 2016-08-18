//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.08.18 um 09:47:39 AM CEST 
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
 * Function of result list
 * 
 * <p>Java-Klasse f�r ResultDialogFunction complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ResultDialogFunction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Type" use="required" type="{http://dev.docuware.com/schema/public/services/platform}ResultDialogFunctionType" />
 *       &lt;attribute name="InToolBar" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="AsButton" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultDialogFunction")
public class ResultDialogFunction  {

    @XmlAttribute(name = "Type", required = true)
    protected ResultDialogFunctionType type;
    @XmlAttribute(name = "InToolBar")
    protected Boolean inToolBar;
    @XmlAttribute(name = "AsButton")
    protected Boolean asButton;

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ResultDialogFunctionType }
     *     
     */
    public ResultDialogFunctionType getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultDialogFunctionType }
     *     
     */
    public void setType(ResultDialogFunctionType value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der inToolBar-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isInToolBar() {
        if (inToolBar == null) {
            return false;
        } else {
            return inToolBar;
        }
    }

    /**
     * Legt den Wert der inToolBar-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInToolBar(Boolean value) {
        this.inToolBar = value;
    }

    /**
     * Ruft den Wert der asButton-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAsButton() {
        if (asButton == null) {
            return false;
        } else {
            return asButton;
        }
    }

    /**
     * Legt den Wert der asButton-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAsButton(Boolean value) {
        this.asButton = value;
    }



}
