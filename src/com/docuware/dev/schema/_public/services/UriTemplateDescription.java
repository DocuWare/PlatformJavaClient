//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.08.22 um 03:45:48 PM CEST 
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
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java-Klasse f�r UriTemplateDescription complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UriTemplateDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Parameter" type="{http://dev.docuware.com/schema/public/services}UriTemplateParameter" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Invoke" type="{http://dev.docuware.com/schema/public/services}UriInvocation" maxOccurs="unbounded"/>
 *         &lt;element name="HtmlDescription" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any processContents='skip'/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="UriPattern" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FurtherReading" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UriTemplateDescription", propOrder = {
    "parameter",
    "invoke",
    "htmlDescription"
})
public class UriTemplateDescription  {

    @XmlElement(name = "Parameter")
    protected List<UriTemplateParameter> parameter;
    @XmlElement(name = "Invoke", required = true)
    protected List<UriInvocation> invoke;
    @XmlElement(name = "HtmlDescription")
    protected UriTemplateDescription.HtmlDescription htmlDescription;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "UriPattern")
    protected String uriPattern;
    @XmlAttribute(name = "FurtherReading")
    @XmlSchemaType(name = "anyURI")
    protected String furtherReading;

    /**
     * Gets the value of the parameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UriTemplateParameter }
     * 
     * 
     */
    public List<UriTemplateParameter> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<UriTemplateParameter>();
        }
        return this.parameter;
    }

    /**
     * Gets the value of the invoke property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoke property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoke().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UriInvocation }
     * 
     * 
     */
    public List<UriInvocation> getInvoke() {
        if (invoke == null) {
            invoke = new ArrayList<UriInvocation>();
        }
        return this.invoke;
    }

    /**
     * Ruft den Wert der htmlDescription-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UriTemplateDescription.HtmlDescription }
     *     
     */
    public UriTemplateDescription.HtmlDescription getHtmlDescription() {
        return htmlDescription;
    }

    /**
     * Legt den Wert der htmlDescription-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UriTemplateDescription.HtmlDescription }
     *     
     */
    public void setHtmlDescription(UriTemplateDescription.HtmlDescription value) {
        this.htmlDescription = value;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der uriPattern-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUriPattern() {
        return uriPattern;
    }

    /**
     * Legt den Wert der uriPattern-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUriPattern(String value) {
        this.uriPattern = value;
    }

    /**
     * Ruft den Wert der furtherReading-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFurtherReading() {
        return furtherReading;
    }

    /**
     * Legt den Wert der furtherReading-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFurtherReading(String value) {
        this.furtherReading = value;
    }


    /**
     * <p>Java-Klasse f�r anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;any processContents='skip'/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class HtmlDescription {

        @XmlAnyElement
        protected Element any;

        /**
         * Ruft den Wert der any-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Element }
         *     
         */
        public Element getAny() {
            return any;
        }

        /**
         * Legt den Wert der any-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Element }
         *     
         */
        public void setAny(Element value) {
            this.any = value;
        }

    }



}
