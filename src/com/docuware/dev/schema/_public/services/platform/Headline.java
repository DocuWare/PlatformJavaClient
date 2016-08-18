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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r Headline complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Headline">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}WebFormField">
 *       &lt;sequence>
 *         &lt;element name="FontSize" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Alignment" type="{http://dev.docuware.com/schema/public/services/platform}AlignmentType"/>
 *         &lt;element name="Subtitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Headline", propOrder = {
    "fontSize",
    "alignment",
    "subtitle"
})
public class Headline
    extends WebFormField
 {

    @XmlElement(name = "FontSize")
    protected double fontSize;
    @XmlElement(name = "Alignment", required = true)
    @XmlSchemaType(name = "string")
    protected AlignmentType alignment;
    @XmlElement(name = "Subtitle", required = true)
    protected String subtitle;

    /**
     * Ruft den Wert der fontSize-Eigenschaft ab.
     * 
     */
    public double getFontSize() {
        return fontSize;
    }

    /**
     * Legt den Wert der fontSize-Eigenschaft fest.
     * 
     */
    public void setFontSize(double value) {
        this.fontSize = value;
    }

    /**
     * Ruft den Wert der alignment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AlignmentType }
     *     
     */
    public AlignmentType getAlignment() {
        return alignment;
    }

    /**
     * Legt den Wert der alignment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AlignmentType }
     *     
     */
    public void setAlignment(AlignmentType value) {
        this.alignment = value;
    }

    /**
     * Ruft den Wert der subtitle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtitle() {
        return subtitle;
    }

    /**
     * Legt den Wert der subtitle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtitle(String value) {
        this.subtitle = value;
    }



}
