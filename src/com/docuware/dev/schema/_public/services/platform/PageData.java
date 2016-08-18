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

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.settings.common.DWRectangle;


/**
 * Define a metadata for a page
 * 
 * <p>Java-Klasse f�r PageData complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PageData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LowQualitySize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TileSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RenderedImageFormat" type="{http://dev.docuware.com/schema/public/services/platform}PlatformImageFormat"/>
 *         &lt;element name="ContentArea" type="{http://dev.docuware.com/settings/common}DWRectangle" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DpiX" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="DpiY" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Width" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Height" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PageData", propOrder = {
    "lowQualitySize",
    "tileSize",
    "renderedImageFormat",
    "contentArea"
})
public class PageData  {

    @XmlElement(name = "LowQualitySize")
    protected int lowQualitySize;
    @XmlElement(name = "TileSize")
    protected int tileSize;
    @XmlElement(name = "RenderedImageFormat", required = true)
    @XmlSchemaType(name = "string")
    protected PlatformImageFormat renderedImageFormat;
    @XmlElementRef(name = "ContentArea", namespace = "http://dev.docuware.com/schema/public/services/platform", type = JAXBElement.class, required = false)
    protected JAXBElement<DWRectangle> contentArea;
    @XmlAttribute(name = "DpiX", required = true)
    protected int dpiX;
    @XmlAttribute(name = "DpiY", required = true)
    protected int dpiY;
    @XmlAttribute(name = "Width", required = true)
    protected int width;
    @XmlAttribute(name = "Height", required = true)
    protected int height;

    /**
     * Ruft den Wert der lowQualitySize-Eigenschaft ab.
     * 
     */
    public int getLowQualitySize() {
        return lowQualitySize;
    }

    /**
     * Legt den Wert der lowQualitySize-Eigenschaft fest.
     * 
     */
    public void setLowQualitySize(int value) {
        this.lowQualitySize = value;
    }

    /**
     * Ruft den Wert der tileSize-Eigenschaft ab.
     * 
     */
    public int getTileSize() {
        return tileSize;
    }

    /**
     * Legt den Wert der tileSize-Eigenschaft fest.
     * 
     */
    public void setTileSize(int value) {
        this.tileSize = value;
    }

    /**
     * Ruft den Wert der renderedImageFormat-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PlatformImageFormat }
     *     
     */
    public PlatformImageFormat getRenderedImageFormat() {
        return renderedImageFormat;
    }

    /**
     * Legt den Wert der renderedImageFormat-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PlatformImageFormat }
     *     
     */
    public void setRenderedImageFormat(PlatformImageFormat value) {
        this.renderedImageFormat = value;
    }

    /**
     * Ruft den Wert der contentArea-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DWRectangle }{@code >}
     *     
     */
    public JAXBElement<DWRectangle> getContentArea() {
        return contentArea;
    }

    /**
     * Legt den Wert der contentArea-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DWRectangle }{@code >}
     *     
     */
    public void setContentArea(JAXBElement<DWRectangle> value) {
        this.contentArea = value;
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
     * Ruft den Wert der height-Eigenschaft ab.
     * 
     */
    public int getHeight() {
        return height;
    }

    /**
     * Legt den Wert der height-Eigenschaft fest.
     * 
     */
    public void setHeight(int value) {
        this.height = value;
    }



}
