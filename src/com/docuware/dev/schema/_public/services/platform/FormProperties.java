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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Definition of Form Properties
 * 
 * <p>Java-Klasse f�r FormProperties complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FormProperties">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FormWidth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FormAlignment" type="{http://dev.docuware.com/schema/public/services/platform}AlignmentType"/>
 *         &lt;element name="WebPageBackgroundColor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormProperties", propOrder = {
    "formWidth",
    "formAlignment",
    "webPageBackgroundColor"
})
public class FormProperties  {

    @XmlElement(name = "FormWidth")
    protected int formWidth;
    @XmlElement(name = "FormAlignment", required = true)
    @XmlSchemaType(name = "string")
    protected AlignmentType formAlignment;
    @XmlElement(name = "WebPageBackgroundColor", required = true)
    protected String webPageBackgroundColor;

    /**
     * Ruft den Wert der formWidth-Eigenschaft ab.
     * 
     */
    public int getFormWidth() {
        return formWidth;
    }

    /**
     * Legt den Wert der formWidth-Eigenschaft fest.
     * 
     */
    public void setFormWidth(int value) {
        this.formWidth = value;
    }

    /**
     * Ruft den Wert der formAlignment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AlignmentType }
     *     
     */
    public AlignmentType getFormAlignment() {
        return formAlignment;
    }

    /**
     * Legt den Wert der formAlignment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AlignmentType }
     *     
     */
    public void setFormAlignment(AlignmentType value) {
        this.formAlignment = value;
    }

    /**
     * Ruft den Wert der webPageBackgroundColor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebPageBackgroundColor() {
        return webPageBackgroundColor;
    }

    /**
     * Legt den Wert der webPageBackgroundColor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebPageBackgroundColor(String value) {
        this.webPageBackgroundColor = value;
    }



}
