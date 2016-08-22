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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Bitmap stamp. Png encoded image.
 * 
 * <p>Java-Klasse f�r BitmapStampEntry complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BitmapStampEntry">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}StampBase">
 *       &lt;sequence>
 *         &lt;element name="PngData" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DpiX" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="DpiY" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BitmapStampEntry", propOrder = {
    "pngData"
})
public class BitmapStampEntry
    extends StampBase
 {

    @XmlElement(name = "PngData", required = true)
    protected byte[] pngData;
    @XmlAttribute(name = "DpiX", required = true)
    protected int dpiX;
    @XmlAttribute(name = "DpiY", required = true)
    protected int dpiY;

    /**
     * Ruft den Wert der pngData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPngData() {
        return pngData;
    }

    /**
     * Legt den Wert der pngData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPngData(byte[] value) {
        this.pngData = value;
    }

    /**
     * Ruft den Wert der dpiX-Eigenschaft ab.
     * 
     */
    public int getDpiX() {
        return dpiX;
    }

    /**
     * Legt den Wert der dpiX-Eigenschaft fest.
     * 
     */
    public void setDpiX(int value) {
        this.dpiX = value;
    }

    /**
     * Ruft den Wert der dpiY-Eigenschaft ab.
     * 
     */
    public int getDpiY() {
        return dpiY;
    }

    /**
     * Legt den Wert der dpiY-Eigenschaft fest.
     * 
     */
    public void setDpiY(int value) {
        this.dpiY = value;
    }



}
