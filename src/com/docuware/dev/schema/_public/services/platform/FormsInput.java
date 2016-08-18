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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Input used to submit form and store in DocuWare
 * 
 * <p>Java-Klasse f�r FormsInput complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FormsInput">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FormInfo" type="{http://dev.docuware.com/schema/public/services/platform}FormInfo"/>
 *         &lt;element name="HTML" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormsInput", propOrder = {
    "formInfo",
    "html"
})
public class FormsInput  {

    @XmlElement(name = "FormInfo", required = true)
    protected FormInfo formInfo;
    @XmlElement(name = "HTML", required = true)
    protected String html;

    /**
     * Ruft den Wert der formInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FormInfo }
     *     
     */
    public FormInfo getFormInfo() {
        return formInfo;
    }

    /**
     * Legt den Wert der formInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FormInfo }
     *     
     */
    public void setFormInfo(FormInfo value) {
        this.formInfo = value;
    }

    /**
     * Ruft den Wert der html-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHTML() {
        return html;
    }

    /**
     * Legt den Wert der html-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHTML(String value) {
        this.html = value;
    }



}
