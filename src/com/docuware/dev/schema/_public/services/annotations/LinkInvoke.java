//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.08.18 um 09:47:39 AM CEST 
//


package com.docuware.dev.schema._public.services.annotations;

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
 * <p>Java-Klasse f�r LinkInvoke complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LinkInvoke">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Accepts" type="{http://dev.docuware.com/schema/public/services/annotations}ContentTypeList" minOccurs="0"/>
 *         &lt;element name="Produces" type="{http://dev.docuware.com/schema/public/services/annotations}ContentTypeList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Verb" type="{http://dev.docuware.com/schema/public/services/annotations}HttpMethod" default="Get" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkInvoke", propOrder = {
    "accepts",
    "produces"
})
public class LinkInvoke  {

    @XmlElement(name = "Accepts")
    protected ContentTypeList accepts;
    @XmlElement(name = "Produces")
    protected ContentTypeList produces;
    @XmlAttribute(name = "Verb")
    protected HttpMethod verb;

    /**
     * Ruft den Wert der accepts-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContentTypeList }
     *     
     */
    public ContentTypeList getAccepts() {
        return accepts;
    }

    /**
     * Legt den Wert der accepts-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentTypeList }
     *     
     */
    public void setAccepts(ContentTypeList value) {
        this.accepts = value;
    }

    /**
     * Ruft den Wert der produces-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ContentTypeList }
     *     
     */
    public ContentTypeList getProduces() {
        return produces;
    }

    /**
     * Legt den Wert der produces-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentTypeList }
     *     
     */
    public void setProduces(ContentTypeList value) {
        this.produces = value;
    }

    /**
     * Ruft den Wert der verb-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link HttpMethod }
     *     
     */
    public HttpMethod getVerb() {
        if (verb == null) {
            return HttpMethod.GET;
        } else {
            return verb;
        }
    }

    /**
     * Legt den Wert der verb-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link HttpMethod }
     *     
     */
    public void setVerb(HttpMethod value) {
        this.verb = value;
    }



}
