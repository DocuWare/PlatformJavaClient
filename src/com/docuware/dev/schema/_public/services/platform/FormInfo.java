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
 * Form object used for displaying form
 * 
 * <p>Java-Klasse f�r FormInfo complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FormInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ConfigId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Fields" type="{http://dev.docuware.com/schema/public/services/platform}WebFormControls"/>
 *         &lt;element name="FormProperties" type="{http://dev.docuware.com/schema/public/services/platform}FormProperties"/>
 *         &lt;element name="SubmissionOptions" type="{http://dev.docuware.com/schema/public/services/platform}SubmissionOptions"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Public" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormInfo", propOrder = {
    "configId",
    "name",
    "fields",
    "formProperties",
    "submissionOptions"
})
public class FormInfo  {

    @XmlElement(name = "ConfigId", required = true)
    protected String configId;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Fields", required = true)
    protected WebFormControls fields;
    @XmlElement(name = "FormProperties", required = true)
    protected FormProperties formProperties;
    @XmlElement(name = "SubmissionOptions", required = true)
    protected SubmissionOptions submissionOptions;
    @XmlAttribute(name = "Public")
    protected Boolean _public;

    /**
     * Ruft den Wert der configId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigId() {
        return configId;
    }

    /**
     * Legt den Wert der configId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigId(String value) {
        this.configId = value;
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
     * Ruft den Wert der fields-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link WebFormControls }
     *     
     */
    public WebFormControls getFields() {
        return fields;
    }

    /**
     * Legt den Wert der fields-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link WebFormControls }
     *     
     */
    public void setFields(WebFormControls value) {
        this.fields = value;
    }

    /**
     * Ruft den Wert der formProperties-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FormProperties }
     *     
     */
    public FormProperties getFormProperties() {
        return formProperties;
    }

    /**
     * Legt den Wert der formProperties-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FormProperties }
     *     
     */
    public void setFormProperties(FormProperties value) {
        this.formProperties = value;
    }

    /**
     * Ruft den Wert der submissionOptions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SubmissionOptions }
     *     
     */
    public SubmissionOptions getSubmissionOptions() {
        return submissionOptions;
    }

    /**
     * Legt den Wert der submissionOptions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmissionOptions }
     *     
     */
    public void setSubmissionOptions(SubmissionOptions value) {
        this.submissionOptions = value;
    }

    /**
     * Ruft den Wert der public-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPublic() {
        return _public;
    }

    /**
     * Legt den Wert der public-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPublic(Boolean value) {
        this._public = value;
    }



}
