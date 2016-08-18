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
import com.docuware.dev.schema._public.services.platform.FormFieldValues;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.schema._public.services.Links;


/**
 * Models a DocuWare stamp.
 * 
 * <p>Java-Klasse f�r Stamp complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Stamp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FormField" type="{http://dev.docuware.com/schema/public/services/platform}StampFormField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Fields" type="{http://dev.docuware.com/schema/public/services/platform}StampField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HeadFont" type="{http://dev.docuware.com/schema/public/services/platform}Font"/>
 *         &lt;choice>
 *           &lt;element name="TextStamp" type="{http://dev.docuware.com/schema/public/services/platform}TextStamp"/>
 *           &lt;element name="StrokeStamp" type="{http://dev.docuware.com/schema/public/services/platform}StrokeStamp"/>
 *           &lt;element name="BitmapStamp" type="{http://dev.docuware.com/schema/public/services/platform}BitmapStamp"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PasswordProtected" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Signature" use="required" type="{http://dev.docuware.com/schema/public/services/platform}StampSignatureType" />
 *       &lt;attribute name="Color" use="required" type="{http://dev.docuware.com/settings/common}Color" />
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DisplayName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Overwrite" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IsHidden" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Autosave" type="{http://www.w3.org/2001/XMLSchema}int" default="-1" />
 *       &lt;attribute name="CloseAfterStampSet" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="AutomaticallyOpenNextDocument" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="KeepStampActive" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Stamp", propOrder = {
"proxy",
    "formField",
    "fields",
    "headFont",
    "textStampOrStrokeStampOrBitmapStamp",
    "links"
})
public class Stamp  implements IRelationsWithProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "FormField")
    protected List<StampFormField> formField;
    @XmlElement(name = "Fields")
    protected List<StampField> fields;
    @XmlElement(name = "HeadFont", required = true)
    protected Font headFont;
    @XmlElements({
        @XmlElement(name = "TextStamp", type = TextStamp.class),
        @XmlElement(name = "StrokeStamp", type = StrokeStamp.class),
        @XmlElement(name = "BitmapStamp", type = BitmapStamp.class)
    })
    protected Object textStampOrStrokeStampOrBitmapStamp;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;
    @XmlAttribute(name = "PasswordProtected", required = true)
    protected boolean passwordProtected;
    @XmlAttribute(name = "Signature", required = true)
    protected StampSignatureType signature;
    @XmlAttribute(name = "Color", required = true)
    protected String color;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "DisplayName", required = true)
    protected String displayName;
    @XmlAttribute(name = "Overwrite")
    protected Boolean overwrite;
    @XmlAttribute(name = "Id", required = true)
    protected String id;
    @XmlAttribute(name = "IsHidden")
    protected Boolean isHidden;
    @XmlAttribute(name = "Autosave")
    protected Integer autosave;
    @XmlAttribute(name = "CloseAfterStampSet")
    protected Boolean closeAfterStampSet;
    @XmlAttribute(name = "AutomaticallyOpenNextDocument")
    protected Boolean automaticallyOpenNextDocument;
    @XmlAttribute(name = "KeepStampActive")
    protected Boolean keepStampActive;

    /**
     * Gets the value of the formField property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formField property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormField().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StampFormField }
     * 
     * 
     */
    public List<StampFormField> getFormField() {
        if (formField == null) {
            formField = new ArrayList<StampFormField>();
        }
        return this.formField;
    }

    /**
     * Gets the value of the fields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StampField }
     * 
     * 
     */
    public List<StampField> getFields() {
        if (fields == null) {
            fields = new ArrayList<StampField>();
        }
        return this.fields;
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
     * Ruft den Wert der textStampOrStrokeStampOrBitmapStamp-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TextStamp }
     *     {@link StrokeStamp }
     *     {@link BitmapStamp }
     *     
     */
    public Object getTextStampOrStrokeStampOrBitmapStamp() {
        return textStampOrStrokeStampOrBitmapStamp;
    }

    /**
     * Legt den Wert der textStampOrStrokeStampOrBitmapStamp-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TextStamp }
     *     {@link StrokeStamp }
     *     {@link BitmapStamp }
     *     
     */
    public void setTextStampOrStrokeStampOrBitmapStamp(Object value) {
        this.textStampOrStrokeStampOrBitmapStamp = value;
    }

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
     * Ruft den Wert der passwordProtected-Eigenschaft ab.
     * 
     */
    public boolean isPasswordProtected() {
        return passwordProtected;
    }

    /**
     * Legt den Wert der passwordProtected-Eigenschaft fest.
     * 
     */
    public void setPasswordProtected(boolean value) {
        this.passwordProtected = value;
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
        return signature;
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
     * Ruft den Wert der color-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Legt den Wert der color-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
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
     * Ruft den Wert der displayName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Legt den Wert der displayName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Ruft den Wert der overwrite-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isOverwrite() {
        if (overwrite == null) {
            return false;
        } else {
            return overwrite;
        }
    }

    /**
     * Legt den Wert der overwrite-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverwrite(Boolean value) {
        this.overwrite = value;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der isHidden-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsHidden() {
        if (isHidden == null) {
            return false;
        } else {
            return isHidden;
        }
    }

    /**
     * Legt den Wert der isHidden-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsHidden(Boolean value) {
        this.isHidden = value;
    }

    /**
     * Ruft den Wert der autosave-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getAutosave() {
        if (autosave == null) {
            return -1;
        } else {
            return autosave;
        }
    }

    /**
     * Legt den Wert der autosave-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAutosave(Integer value) {
        this.autosave = value;
    }

    /**
     * Ruft den Wert der closeAfterStampSet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isCloseAfterStampSet() {
        if (closeAfterStampSet == null) {
            return false;
        } else {
            return closeAfterStampSet;
        }
    }

    /**
     * Legt den Wert der closeAfterStampSet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCloseAfterStampSet(Boolean value) {
        this.closeAfterStampSet = value;
    }

    /**
     * Ruft den Wert der automaticallyOpenNextDocument-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAutomaticallyOpenNextDocument() {
        if (automaticallyOpenNextDocument == null) {
            return false;
        } else {
            return automaticallyOpenNextDocument;
        }
    }

    /**
     * Legt den Wert der automaticallyOpenNextDocument-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutomaticallyOpenNextDocument(Boolean value) {
        this.automaticallyOpenNextDocument = value;
    }

    /**
     * Ruft den Wert der keepStampActive-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isKeepStampActive() {
        if (keepStampActive == null) {
            return false;
        } else {
            return keepStampActive;
        }
    }

    /**
     * Legt den Wert der keepStampActive-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeepStampActive(Boolean value) {
        this.keepStampActive = value;
    }

    public HttpClientProxy getProxy() {
	return this.proxy;
    }

    public void setProxy(HttpClientProxy proxy) {
	this.proxy = proxy;
	if(this.proxy!=null) { 
        for (int i = 0; (i < this.formField.size()); i = (i + 1)) {
            this.formField.get(i).setProxy(proxy);
        }
	}
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

    public URI getAsBitmapRelationLink() {
        return MethodInvocation.getLink(this, links, "asBitmap");
    }

    public URI getURIFromAsBitmapRelation() {
        return MethodInvocation.<URI>get(this, links, "asBitmap", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromAsBitmapRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "asBitmap", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromAsBitmapRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "asBitmap", URI.class, ct);
    }

    public String postToAsBitmapRelationForString(FormFieldValues data) {
        return MethodInvocation.<String,FormFieldValues>post(this, links, "asBitmap", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "StampFormFields"), FormFieldValues.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<String>> postToAsBitmapRelationForStringAsync(FormFieldValues data) {
        return MethodInvocation.<String, FormFieldValues >postAsync(this, links, "asBitmap", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "StampFormFields"), FormFieldValues.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<String>> postToAsBitmapRelationForStringAsync(FormFieldValues data, CancellationToken ct) {
        return MethodInvocation.<String, FormFieldValues >postAsync(this, links, "asBitmap", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "StampFormFields"), FormFieldValues.class, null, data), ct);
    }

    public URI getAsSvgRelationLink() {
        return MethodInvocation.getLink(this, links, "asSvg");
    }

    public URI getURIFromAsSvgRelation() {
        return MethodInvocation.<URI>get(this, links, "asSvg", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromAsSvgRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "asSvg", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromAsSvgRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "asSvg", URI.class, ct);
    }

    public String postToAsSvgRelationForString(FormFieldValues data) {
        return MethodInvocation.<String,FormFieldValues>post(this, links, "asSvg", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "StampFormFields"), FormFieldValues.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<String>> postToAsSvgRelationForStringAsync(FormFieldValues data) {
        return MethodInvocation.<String, FormFieldValues >postAsync(this, links, "asSvg", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "StampFormFields"), FormFieldValues.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<String>> postToAsSvgRelationForStringAsync(FormFieldValues data, CancellationToken ct) {
        return MethodInvocation.<String, FormFieldValues >postAsync(this, links, "asSvg", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "StampFormFields"), FormFieldValues.class, null, data), ct);
    }



}
