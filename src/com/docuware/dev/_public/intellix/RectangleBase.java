//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.08.16 um 09:04:54 AM CEST 
//


package com.docuware.dev._public.intellix;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r RectangleBase complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="RectangleBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://dev.docuware.com/public/intellix}RectangleAttributes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RectangleBase")
@XmlSeeAlso({
    CellZone.class,
    Rulerline.class,
    BarCodeZone.class,
    Line.class,
    TextZone.class,
    TableZone.class,
    PictureZone.class
})
public class RectangleBase  {

    @XmlAttribute(name = "L", required = true)
    protected int l;
    @XmlAttribute(name = "T", required = true)
    protected int t;
    @XmlAttribute(name = "W", required = true)
    protected int w;
    @XmlAttribute(name = "H", required = true)
    protected int h;

    /**
     * Ruft den Wert der l-Eigenschaft ab.
     * 
     */
    public int getL() {
        return l;
    }

    /**
     * Legt den Wert der l-Eigenschaft fest.
     * 
     */
    public void setL(int value) {
        this.l = value;
    }

    /**
     * Ruft den Wert der t-Eigenschaft ab.
     * 
     */
    public int getT() {
        return t;
    }

    /**
     * Legt den Wert der t-Eigenschaft fest.
     * 
     */
    public void setT(int value) {
        this.t = value;
    }

    /**
     * Ruft den Wert der w-Eigenschaft ab.
     * 
     */
    public int getW() {
        return w;
    }

    /**
     * Legt den Wert der w-Eigenschaft fest.
     * 
     */
    public void setW(int value) {
        this.w = value;
    }

    /**
     * Ruft den Wert der h-Eigenschaft ab.
     * 
     */
    public int getH() {
        return h;
    }

    /**
     * Legt den Wert der h-Eigenschaft fest.
     * 
     */
    public void setH(int value) {
        this.h = value;
    }



}
