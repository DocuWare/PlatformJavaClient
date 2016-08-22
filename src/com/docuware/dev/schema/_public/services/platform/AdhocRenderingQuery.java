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
import com.docuware.dev.settings.common.DWSize;


/**
 * In case you do not specify the size or resolution a default rendering resolution of 72 dpi is assumed.
 * 
 * <p>Java-Klasse f�r AdhocRenderingQuery complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AdhocRenderingQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Size" type="{http://dev.docuware.com/settings/common}DWSize" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Page" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *       &lt;attribute name="Dpi" type="{http://www.w3.org/2001/XMLSchema}float" default="72" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdhocRenderingQuery", propOrder = {
    "size"
})
public class AdhocRenderingQuery  {

    @XmlElement(name = "Size")
    protected DWSize size;
    @XmlAttribute(name = "Page")
    protected Integer page;
    @XmlAttribute(name = "Dpi")
    protected Float dpi;

    /**
     * Ruft den Wert der size-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DWSize }
     *     
     */
    public DWSize getSize() {
        return size;
    }

    /**
     * Legt den Wert der size-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DWSize }
     *     
     */
    public void setSize(DWSize value) {
        this.size = value;
    }

    /**
     * Ruft den Wert der page-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getPage() {
        if (page == null) {
            return  0;
        } else {
            return page;
        }
    }

    /**
     * Legt den Wert der page-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPage(Integer value) {
        this.page = value;
    }

    /**
     * Ruft den Wert der dpi-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public float getDpi() {
        if (dpi == null) {
            return  72.0F;
        } else {
            return dpi;
        }
    }

    /**
     * Legt den Wert der dpi-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setDpi(Float value) {
        this.dpi = value;
    }



}
