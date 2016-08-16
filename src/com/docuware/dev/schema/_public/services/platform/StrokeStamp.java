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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Stamp that allows you to add a signature using an electronic pen.
 * 
 * <p>Java-Klasse f�r StrokeStamp complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="StrokeStamp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="StrokeWidth" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="StrokeColor" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StrokeStamp")
public class StrokeStamp  {

    @XmlAttribute(name = "StrokeWidth", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long strokeWidth;
    @XmlAttribute(name = "StrokeColor", required = true)
    protected String strokeColor;

    /**
     * Ruft den Wert der strokeWidth-Eigenschaft ab.
     * 
     */
    public long getStrokeWidth() {
        return strokeWidth;
    }

    /**
     * Legt den Wert der strokeWidth-Eigenschaft fest.
     * 
     */
    public void setStrokeWidth(long value) {
        this.strokeWidth = value;
    }

    /**
     * Ruft den Wert der strokeColor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrokeColor() {
        return strokeColor;
    }

    /**
     * Legt den Wert der strokeColor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrokeColor(String value) {
        this.strokeColor = value;
    }



}
