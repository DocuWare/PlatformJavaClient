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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r DropDownList complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DropDownList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}WebFormField">
 *       &lt;sequence>
 *         &lt;element name="Options" type="{http://dev.docuware.com/schema/public/services/platform}WebFormListOptions"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DropDownList", propOrder = {
    "options"
})
public class DropDownList
    extends WebFormField
 {

    @XmlElement(name = "Options", required = true)
    protected WebFormListOptions options;

    /**
     * Ruft den Wert der options-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link WebFormListOptions }
     *     
     */
    public WebFormListOptions getOptions() {
        return options;
    }

    /**
     * Legt den Wert der options-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link WebFormListOptions }
     *     
     */
    public void setOptions(WebFormListOptions value) {
        this.options = value;
    }



}
