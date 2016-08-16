//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.08.16 um 09:04:54 AM CEST 
//


package com.docuware.dev.settings.common;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r DWRectangle complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DWRectangle">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Left" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="Top" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="Width" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="Height" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DWRectangle")
public class DWRectangle  {

    @XmlAttribute(name = "Left", required = true)
    protected double left;
    @XmlAttribute(name = "Top", required = true)
    protected double top;
    @XmlAttribute(name = "Width", required = true)
    protected double width;
    @XmlAttribute(name = "Height", required = true)
    protected double height;

    /**
     * Ruft den Wert der left-Eigenschaft ab.
     * 
     */
    public double getLeft() {
        return left;
    }

    /**
     * Legt den Wert der left-Eigenschaft fest.
     * 
     */
    public void setLeft(double value) {
        this.left = value;
    }

    /**
     * Ruft den Wert der top-Eigenschaft ab.
     * 
     */
    public double getTop() {
        return top;
    }

    /**
     * Legt den Wert der top-Eigenschaft fest.
     * 
     */
    public void setTop(double value) {
        this.top = value;
    }

    /**
     * Ruft den Wert der width-Eigenschaft ab.
     * 
     */
    public double getWidth() {
        return width;
    }

    /**
     * Legt den Wert der width-Eigenschaft fest.
     * 
     */
    public void setWidth(double value) {
        this.width = value;
    }

    /**
     * Ruft den Wert der height-Eigenschaft ab.
     * 
     */
    public double getHeight() {
        return height;
    }

    /**
     * Legt den Wert der height-Eigenschaft fest.
     * 
     */
    public void setHeight(double value) {
        this.height = value;
    }



}
