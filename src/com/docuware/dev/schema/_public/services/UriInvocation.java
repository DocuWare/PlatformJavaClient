//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.08.16 um 09:04:54 AM CEST 
//


package com.docuware.dev.schema._public.services;

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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r UriInvocation complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UriInvocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcceptedType" type="{http://dev.docuware.com/schema/public/services}TypeReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProducedType" type="{http://dev.docuware.com/schema/public/services}TypeReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Tag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Verb" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" default="GET" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UriInvocation", propOrder = {
    "acceptedType",
    "producedType",
    "tag"
})
public class UriInvocation  {

    @XmlElement(name = "AcceptedType")
    protected List<TypeReference> acceptedType;
    @XmlElement(name = "ProducedType")
    protected List<TypeReference> producedType;
    @XmlElement(name = "Tag")
    protected String tag;
    @XmlAttribute(name = "Verb")
    @XmlSchemaType(name = "anySimpleType")
    protected String verb;

    /**
     * Gets the value of the acceptedType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acceptedType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcceptedType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeReference }
     * 
     * 
     */
    public List<TypeReference> getAcceptedType() {
        if (acceptedType == null) {
            acceptedType = new ArrayList<TypeReference>();
        }
        return this.acceptedType;
    }

    /**
     * Gets the value of the producedType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the producedType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProducedType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeReference }
     * 
     * 
     */
    public List<TypeReference> getProducedType() {
        if (producedType == null) {
            producedType = new ArrayList<TypeReference>();
        }
        return this.producedType;
    }

    /**
     * Ruft den Wert der tag-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag() {
        return tag;
    }

    /**
     * Legt den Wert der tag-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag(String value) {
        this.tag = value;
    }

    /**
     * Ruft den Wert der verb-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerb() {
        if (verb == null) {
            return "GET";
        } else {
            return verb;
        }
    }

    /**
     * Legt den Wert der verb-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerb(String value) {
        this.verb = value;
    }



}
