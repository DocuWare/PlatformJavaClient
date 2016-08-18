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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.settings.common.DWPoint;


/**
 * Describes how to place a stamp on a page.
 * 
 * <p>Java-Klasse f�r StampPlacement complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="StampPlacement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Strokes" type="{http://dev.docuware.com/schema/public/services/platform}PolyLineEntry" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://dev.docuware.com/settings/common}DWPoint" minOccurs="0"/>
 *         &lt;element name="Field" type="{http://dev.docuware.com/schema/public/services/platform}FormFieldValue" maxOccurs="5" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="StampId" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Rotation" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *       &lt;attribute name="Layer" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *       &lt;attribute name="Password" type="{http://www.w3.org/2001/XMLSchema}string" default="" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StampPlacement", propOrder = {
    "strokes",
    "location",
    "field"
})
@XmlSeeAlso({
    DecisionStampPlacement.class
})
public class StampPlacement  {

    @XmlElement(name = "Strokes")
    protected PolyLineEntry strokes;
    @XmlElement(name = "Location")
    protected DWPoint location;
    @XmlElement(name = "Field")
    protected List<FormFieldValue> field;
    @XmlAttribute(name = "StampId")
    @XmlSchemaType(name = "anySimpleType")
    protected String stampId;
    @XmlAttribute(name = "Rotation")
    protected Integer rotation;
    @XmlAttribute(name = "Layer")
    protected Integer layer;
    @XmlAttribute(name = "Password")
    protected String password;

    /**
     * Ruft den Wert der strokes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PolyLineEntry }
     *     
     */
    public PolyLineEntry getStrokes() {
        return strokes;
    }

    /**
     * Legt den Wert der strokes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PolyLineEntry }
     *     
     */
    public void setStrokes(PolyLineEntry value) {
        this.strokes = value;
    }

    /**
     * Ruft den Wert der location-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DWPoint }
     *     
     */
    public DWPoint getLocation() {
        return location;
    }

    /**
     * Legt den Wert der location-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DWPoint }
     *     
     */
    public void setLocation(DWPoint value) {
        this.location = value;
    }

    /**
     * Gets the value of the field property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the field property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormFieldValue }
     * 
     * 
     */
    public List<FormFieldValue> getField() {
        if (field == null) {
            field = new ArrayList<FormFieldValue>();
        }
        return this.field;
    }

    /**
     * Ruft den Wert der stampId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStampId() {
        return stampId;
    }

    /**
     * Legt den Wert der stampId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStampId(String value) {
        this.stampId = value;
    }

    /**
     * Ruft den Wert der rotation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getRotation() {
        if (rotation == null) {
            return  0;
        } else {
            return rotation;
        }
    }

    /**
     * Legt den Wert der rotation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRotation(Integer value) {
        this.rotation = value;
    }

    /**
     * Ruft den Wert der layer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getLayer() {
        if (layer == null) {
            return  0;
        } else {
            return layer;
        }
    }

    /**
     * Legt den Wert der layer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLayer(Integer value) {
        this.layer = value;
    }

    /**
     * Ruft den Wert der password-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        if (password == null) {
            return "";
        } else {
            return password;
        }
    }

    /**
     * Legt den Wert der password-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }



}
