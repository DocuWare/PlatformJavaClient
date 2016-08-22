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
 * <p>Java-Klasse f�r ImageField complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ImageField">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}WebFormField">
 *       &lt;sequence>
 *         &lt;element name="Width" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OriginalImageWidth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OriginalImageSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Alignment" type="{http://dev.docuware.com/schema/public/services/platform}AlignmentType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageField", propOrder = {
    "width",
    "originalImageWidth",
    "originalImageSize",
    "alignment"
})
public class ImageField
    extends WebFormField
 {

    @XmlElement(name = "Width")
    protected int width;
    @XmlElement(name = "OriginalImageWidth")
    protected int originalImageWidth;
    @XmlElement(name = "OriginalImageSize")
    protected int originalImageSize;
    @XmlElement(name = "Alignment", required = true)
    @XmlSchemaType(name = "string")
    protected AlignmentType alignment;

    /**
     * Ruft den Wert der width-Eigenschaft ab.
     * 
     */
    public int getWidth() {
        return width;
    }

    /**
     * Legt den Wert der width-Eigenschaft fest.
     * 
     */
    public void setWidth(int value) {
        this.width = value;
    }

    /**
     * Ruft den Wert der originalImageWidth-Eigenschaft ab.
     * 
     */
    public int getOriginalImageWidth() {
        return originalImageWidth;
    }

    /**
     * Legt den Wert der originalImageWidth-Eigenschaft fest.
     * 
     */
    public void setOriginalImageWidth(int value) {
        this.originalImageWidth = value;
    }

    /**
     * Ruft den Wert der originalImageSize-Eigenschaft ab.
     * 
     */
    public int getOriginalImageSize() {
        return originalImageSize;
    }

    /**
     * Legt den Wert der originalImageSize-Eigenschaft fest.
     * 
     */
    public void setOriginalImageSize(int value) {
        this.originalImageSize = value;
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



}
