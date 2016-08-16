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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Stamp base type. Inherited by 3 types: TextStamp, BitmapStamp, PolyLineStamp
 * 
 * <p>Java-Klasse f�r StampBase complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="StampBase">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}EntryBase">
 *       &lt;sequence>
 *         &lt;element name="Location" type="{http://dev.docuware.com/schema/public/services/platform}AnnotationRectangle"/>
 *         &lt;element name="HeadFont" type="{http://dev.docuware.com/schema/public/services/platform}Font"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Signature" type="{http://dev.docuware.com/schema/public/services/platform}StampSignatureType" default="No" />
 *       &lt;attribute name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Visible" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="Frame" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="ShowUser" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="ShowDate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="ShowTime" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="SigScopeInfo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StampBase", propOrder = {
    "location",
    "headFont"
})
@XmlSeeAlso({
    TextStampEntry.class,
    BitmapStampEntry.class,
    PolyLineStampEntry.class
})
public class StampBase
    extends EntryBase
 {

    @XmlElement(name = "Location", required = true)
    protected AnnotationRectangle location;
    @XmlElement(name = "HeadFont", required = true)
    protected Font headFont;
    @XmlAttribute(name = "Signature")
    protected StampSignatureType signature;
    @XmlAttribute(name = "UserName")
    protected String userName;
    @XmlAttribute(name = "Visible")
    protected Boolean visible;
    @XmlAttribute(name = "Frame")
    protected Boolean frame;
    @XmlAttribute(name = "ShowUser")
    protected Boolean showUser;
    @XmlAttribute(name = "ShowDate")
    protected Boolean showDate;
    @XmlAttribute(name = "ShowTime")
    protected Boolean showTime;
    @XmlAttribute(name = "SigScopeInfo")
    protected String sigScopeInfo;

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
     * Ruft den Wert der headFont-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Font }
     *     
     */
    public Font getHeadFont() {
        return headFont;
    }

    /**
     * Legt den Wert der headFont-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Font }
     *     
     */
    public void setHeadFont(Font value) {
        this.headFont = value;
    }

    /**
     * Ruft den Wert der signature-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link StampSignatureType }
     *     
     */
    public StampSignatureType getSignature() {
        if (signature == null) {
            return StampSignatureType.NO;
        } else {
            return signature;
        }
    }

    /**
     * Legt den Wert der signature-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link StampSignatureType }
     *     
     */
    public void setSignature(StampSignatureType value) {
        this.signature = value;
    }

    /**
     * Ruft den Wert der userName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Legt den Wert der userName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Ruft den Wert der visible-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isVisible() {
        if (visible == null) {
            return true;
        } else {
            return visible;
        }
    }

    /**
     * Legt den Wert der visible-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVisible(Boolean value) {
        this.visible = value;
    }

    /**
     * Ruft den Wert der frame-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFrame() {
        if (frame == null) {
            return true;
        } else {
            return frame;
        }
    }

    /**
     * Legt den Wert der frame-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFrame(Boolean value) {
        this.frame = value;
    }

    /**
     * Ruft den Wert der showUser-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowUser() {
        if (showUser == null) {
            return true;
        } else {
            return showUser;
        }
    }

    /**
     * Legt den Wert der showUser-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowUser(Boolean value) {
        this.showUser = value;
    }

    /**
     * Ruft den Wert der showDate-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowDate() {
        if (showDate == null) {
            return true;
        } else {
            return showDate;
        }
    }

    /**
     * Legt den Wert der showDate-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowDate(Boolean value) {
        this.showDate = value;
    }

    /**
     * Ruft den Wert der showTime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowTime() {
        if (showTime == null) {
            return true;
        } else {
            return showTime;
        }
    }

    /**
     * Legt den Wert der showTime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowTime(Boolean value) {
        this.showTime = value;
    }

    /**
     * Ruft den Wert der sigScopeInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSigScopeInfo() {
        return sigScopeInfo;
    }

    /**
     * Legt den Wert der sigScopeInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSigScopeInfo(String value) {
        this.sigScopeInfo = value;
    }



}
