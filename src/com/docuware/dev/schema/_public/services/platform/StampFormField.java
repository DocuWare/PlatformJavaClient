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
import com.docuware.dev.schema._public.services.platform.SelectListResult;
import com.docuware.dev.schema._public.services.platform.SelectListExpression;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.schema._public.services.Links;
import com.docuware.dev.settings.interop.DWFieldType;


/**
 * A form field for variable text to a text stamp.
 * 
 * <p>Java-Klasse f�r StampFormField complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="StampFormField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Label" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Length" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *       &lt;attribute name="Precision" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *       &lt;attribute name="DWFieldType" type="{http://dev.docuware.com/settings/interop}DWFieldType" default="Text" />
 *       &lt;attribute name="Mask" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MaskErrorText" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SampleEditText" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StampFormField", propOrder = {
"proxy",
    "links"
})
public class StampFormField  implements IRelationsWithProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services")
    protected Links links;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "Label", required = true)
    protected String label;
    @XmlAttribute(name = "Length")
    protected Integer length;
    @XmlAttribute(name = "Precision")
    protected Integer precision;
    @XmlAttribute(name = "DWFieldType")
    protected DWFieldType dwFieldType;
    @XmlAttribute(name = "Mask")
    protected String mask;
    @XmlAttribute(name = "MaskErrorText")
    protected String maskErrorText;
    @XmlAttribute(name = "SampleEditText")
    protected String sampleEditText;

    /**
     * Ruft den Wert der links-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Links }
     *     
     */
    public Links getLinks() {
        return links;
    }

    /**
     * Legt den Wert der links-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Links }
     *     
     */
    public void setLinks(Links value) {
        this.links = value;
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
     * Ruft den Wert der label-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Legt den Wert der label-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Ruft den Wert der length-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getLength() {
        if (length == null) {
            return  0;
        } else {
            return length;
        }
    }

    /**
     * Legt den Wert der length-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLength(Integer value) {
        this.length = value;
    }

    /**
     * Ruft den Wert der precision-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getPrecision() {
        if (precision == null) {
            return  0;
        } else {
            return precision;
        }
    }

    /**
     * Legt den Wert der precision-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPrecision(Integer value) {
        this.precision = value;
    }

    /**
     * Ruft den Wert der dwFieldType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DWFieldType }
     *     
     */
    public DWFieldType getDWFieldType() {
        if (dwFieldType == null) {
            return DWFieldType.TEXT;
        } else {
            return dwFieldType;
        }
    }

    /**
     * Legt den Wert der dwFieldType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DWFieldType }
     *     
     */
    public void setDWFieldType(DWFieldType value) {
        this.dwFieldType = value;
    }

    /**
     * Ruft den Wert der mask-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMask() {
        return mask;
    }

    /**
     * Legt den Wert der mask-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMask(String value) {
        this.mask = value;
    }

    /**
     * Ruft den Wert der maskErrorText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaskErrorText() {
        return maskErrorText;
    }

    /**
     * Legt den Wert der maskErrorText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaskErrorText(String value) {
        this.maskErrorText = value;
    }

    /**
     * Ruft den Wert der sampleEditText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSampleEditText() {
        return sampleEditText;
    }

    /**
     * Legt den Wert der sampleEditText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSampleEditText(String value) {
        this.sampleEditText = value;
    }

    public HttpClientProxy getProxy() {
	return this.proxy;
    }

    public void setProxy(HttpClientProxy proxy) {
	this.proxy = proxy;
    }

    public URI getBaseUri() {
	return RelationsWithProxyExtensions.getBaseUri(this);
    }

    public Link getLink(String relationName) {
	return RelationExtension.getLink(this, relationName);
    }

    public String getRelationUri(String relationName) {
	return RelationExtension.getRelationUri(this, relationName);
    }

    public String getRelationUriOrThrow(String relationName) {
	return RelationExtension.getRelationUriOrThrow(this, relationName);
    }

    public boolean hasRelationUri(String relationName) {
	return RelationExtension.hasRelationUri(this, relationName);
    }

    public URI getSelectListValuesRelationLink() {
        return MethodInvocation.getLink(this, links, "selectListValues");
    }

    public SelectListResult getSelectListResultFromSelectListValuesRelation() {
        return MethodInvocation.<SelectListResult>get(this, links, "selectListValues", SelectListResult.class);
    }

    public Future<DeserializedHttpResponseGen<SelectListResult>> getSelectListResultFromSelectListValuesRelationAsync() {
        return MethodInvocation.<SelectListResult>getAsync(this, links, "selectListValues", SelectListResult.class);
    }

    public SelectListResult postToSelectListValuesRelationForSelectListResult(SelectListExpression data) {
        return MethodInvocation.<SelectListResult,SelectListExpression>post(this, links, "selectListValues", SelectListResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "SelectListExpression"), SelectListExpression.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<SelectListResult>> postToSelectListValuesRelationForSelectListResultAsync(SelectListExpression data) {
        return MethodInvocation.<SelectListResult, SelectListExpression >postAsync(this, links, "selectListValues", SelectListResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "SelectListExpression"), SelectListExpression.class, null, data));
    }

    public URI getSimpleSelectListRelationLink() {
        return MethodInvocation.getLink(this, links, "simpleSelectList");
    }

    public SelectListResult getSelectListResultFromSimpleSelectListRelation() {
        return MethodInvocation.<SelectListResult>get(this, links, "simpleSelectList", SelectListResult.class);
    }

    public Future<DeserializedHttpResponseGen<SelectListResult>> getSelectListResultFromSimpleSelectListRelationAsync() {
        return MethodInvocation.<SelectListResult>getAsync(this, links, "simpleSelectList", SelectListResult.class);
    }

    public SelectListResult postToSimpleSelectListRelationForSelectListResult(SelectListExpression data) {
        return MethodInvocation.<SelectListResult,SelectListExpression>post(this, links, "simpleSelectList", SelectListResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "SelectListExpression"), SelectListExpression.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<SelectListResult>> postToSimpleSelectListRelationForSelectListResultAsync(SelectListExpression data) {
        return MethodInvocation.<SelectListResult, SelectListExpression >postAsync(this, links, "simpleSelectList", SelectListResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "SelectListExpression"), SelectListExpression.class, null, data));
    }



}
