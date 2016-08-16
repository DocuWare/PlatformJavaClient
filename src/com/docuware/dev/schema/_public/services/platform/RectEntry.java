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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Rectangle or Ellipse annotation
 * 
 * <p>Java-Klasse f�r RectEntry complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RectEntry">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}EntryBase">
 *       &lt;sequence>
 *         &lt;element name="Location" type="{http://dev.docuware.com/schema/public/services/platform}AnnotationRectangle"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Filled" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="Ellipse" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RectEntry", propOrder = {
    "location"
})
public class RectEntry
    extends EntryBase
 {

    @XmlElement(name = "Location", required = true)
    protected AnnotationRectangle location;
    @XmlAttribute(name = "Filled")
    protected Boolean filled;
    @XmlAttribute(name = "Ellipse")
    protected Boolean ellipse;

    /**
     * Ruft den Wert der location-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AnnotationRectangle }
     *     
     */
    public AnnotationRectangle getLocation() {
        return location;
    }

    /**
     * Legt den Wert der location-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnotationRectangle }
     *     
     */
    public void setLocation(AnnotationRectangle value) {
        this.location = value;
    }

    /**
     * Ruft den Wert der filled-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFilled() {
        if (filled == null) {
            return true;
        } else {
            return filled;
        }
    }

    /**
     * Legt den Wert der filled-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFilled(Boolean value) {
        this.filled = value;
    }

    /**
     * Ruft den Wert der ellipse-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isEllipse() {
        if (ellipse == null) {
            return false;
        } else {
            return ellipse;
        }
    }

    /**
     * Legt den Wert der ellipse-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEllipse(Boolean value) {
        this.ellipse = value;
    }



}
