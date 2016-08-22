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
 * Definition of a Template Zone
 * 
 * <p>Java-Klasse f�r Zone complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Zone">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ZoneID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PageNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="X" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Y" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="W" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="H" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MappedWebFormFieldName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SampleText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FontType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FontSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FontColor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FontWeightBold" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="FontWeightItalic" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="FontWeightUnderlined" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="TextAlignment" type="{http://dev.docuware.com/schema/public/services/platform}AlignmentType"/>
 *         &lt;element name="OriginalImageWidth" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="WrapText" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Zone", propOrder = {
    "zoneID",
    "type",
    "pageNumber",
    "x",
    "y",
    "w",
    "h",
    "mappedWebFormFieldName",
    "sampleText",
    "fontType",
    "fontSize",
    "fontColor",
    "fontWeightBold",
    "fontWeightItalic",
    "fontWeightUnderlined",
    "textAlignment",
    "originalImageWidth",
    "wrapText"
})
public class Zone  {

    @XmlElement(name = "ZoneID")
    protected int zoneID;
    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "PageNumber")
    protected int pageNumber;
    @XmlElement(name = "X")
    protected int x;
    @XmlElement(name = "Y")
    protected int y;
    @XmlElement(name = "W")
    protected int w;
    @XmlElement(name = "H")
    protected int h;
    @XmlElement(name = "MappedWebFormFieldName", required = true)
    protected String mappedWebFormFieldName;
    @XmlElement(name = "SampleText", required = true)
    protected String sampleText;
    @XmlElement(name = "FontType", required = true)
    protected String fontType;
    @XmlElement(name = "FontSize")
    protected int fontSize;
    @XmlElement(name = "FontColor", required = true)
    protected String fontColor;
    @XmlElement(name = "FontWeightBold")
    protected boolean fontWeightBold;
    @XmlElement(name = "FontWeightItalic")
    protected boolean fontWeightItalic;
    @XmlElement(name = "FontWeightUnderlined")
    protected boolean fontWeightUnderlined;
    @XmlElement(name = "TextAlignment", required = true)
    @XmlSchemaType(name = "string")
    protected AlignmentType textAlignment;
    @XmlElement(name = "OriginalImageWidth")
    protected int originalImageWidth;
    @XmlElement(name = "WrapText")
    protected boolean wrapText;

    /**
     * Ruft den Wert der zoneID-Eigenschaft ab.
     * 
     */
    public int getZoneID() {
        return zoneID;
    }

    /**
     * Legt den Wert der zoneID-Eigenschaft fest.
     * 
     */
    public void setZoneID(int value) {
        this.zoneID = value;
    }

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der pageNumber-Eigenschaft ab.
     * 
     */
    public int getPageNumber() {
        return pageNumber;
    }

    /**
     * Legt den Wert der pageNumber-Eigenschaft fest.
     * 
     */
    public void setPageNumber(int value) {
        this.pageNumber = value;
    }

    /**
     * Ruft den Wert der x-Eigenschaft ab.
     * 
     */
    public int getX() {
        return x;
    }

    /**
     * Legt den Wert der x-Eigenschaft fest.
     * 
     */
    public void setX(int value) {
        this.x = value;
    }

    /**
     * Ruft den Wert der y-Eigenschaft ab.
     * 
     */
    public int getY() {
        return y;
    }

    /**
     * Legt den Wert der y-Eigenschaft fest.
     * 
     */
    public void setY(int value) {
        this.y = value;
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

    /**
     * Ruft den Wert der mappedWebFormFieldName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMappedWebFormFieldName() {
        return mappedWebFormFieldName;
    }

    /**
     * Legt den Wert der mappedWebFormFieldName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMappedWebFormFieldName(String value) {
        this.mappedWebFormFieldName = value;
    }

    /**
     * Ruft den Wert der sampleText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSampleText() {
        return sampleText;
    }

    /**
     * Legt den Wert der sampleText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSampleText(String value) {
        this.sampleText = value;
    }

    /**
     * Ruft den Wert der fontType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontType() {
        return fontType;
    }

    /**
     * Legt den Wert der fontType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontType(String value) {
        this.fontType = value;
    }

    /**
     * Ruft den Wert der fontSize-Eigenschaft ab.
     * 
     */
    public int getFontSize() {
        return fontSize;
    }

    /**
     * Legt den Wert der fontSize-Eigenschaft fest.
     * 
     */
    public void setFontSize(int value) {
        this.fontSize = value;
    }

    /**
     * Ruft den Wert der fontColor-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontColor() {
        return fontColor;
    }

    /**
     * Legt den Wert der fontColor-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontColor(String value) {
        this.fontColor = value;
    }

    /**
     * Ruft den Wert der fontWeightBold-Eigenschaft ab.
     * 
     */
    public boolean isFontWeightBold() {
        return fontWeightBold;
    }

    /**
     * Legt den Wert der fontWeightBold-Eigenschaft fest.
     * 
     */
    public void setFontWeightBold(boolean value) {
        this.fontWeightBold = value;
    }

    /**
     * Ruft den Wert der fontWeightItalic-Eigenschaft ab.
     * 
     */
    public boolean isFontWeightItalic() {
        return fontWeightItalic;
    }

    /**
     * Legt den Wert der fontWeightItalic-Eigenschaft fest.
     * 
     */
    public void setFontWeightItalic(boolean value) {
        this.fontWeightItalic = value;
    }

    /**
     * Ruft den Wert der fontWeightUnderlined-Eigenschaft ab.
     * 
     */
    public boolean isFontWeightUnderlined() {
        return fontWeightUnderlined;
    }

    /**
     * Legt den Wert der fontWeightUnderlined-Eigenschaft fest.
     * 
     */
    public void setFontWeightUnderlined(boolean value) {
        this.fontWeightUnderlined = value;
    }

    /**
     * Ruft den Wert der textAlignment-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AlignmentType }
     *     
     */
    public AlignmentType getTextAlignment() {
        return textAlignment;
    }

    /**
     * Legt den Wert der textAlignment-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AlignmentType }
     *     
     */
    public void setTextAlignment(AlignmentType value) {
        this.textAlignment = value;
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
     * Ruft den Wert der wrapText-Eigenschaft ab.
     * 
     */
    public boolean isWrapText() {
        return wrapText;
    }

    /**
     * Legt den Wert der wrapText-Eigenschaft fest.
     * 
     */
    public void setWrapText(boolean value) {
        this.wrapText = value;
    }



}
