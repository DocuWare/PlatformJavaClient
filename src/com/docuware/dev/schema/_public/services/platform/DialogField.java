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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.schema._public.services.Links;
import com.docuware.dev.settings.interop.DWFieldType;


/**
 * <p>Java-Klasse f�r DialogField complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DialogField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Mask" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaskErrorText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SampleEditText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PrefillValue" type="{http://dev.docuware.com/schema/public/services/platform}DocumentIndexFieldValue" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="DynamicPrefillValue" type="{http://dev.docuware.com/schema/public/services/platform}DynamicValueType" maxOccurs="2" minOccurs="0"/>
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DBFieldName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DlgLabel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DWFieldType" use="required" type="{http://dev.docuware.com/settings/interop}DWFieldType" />
 *       &lt;attribute name="Locked" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ReadOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="NotEmpty" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Visible" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Length" type="{http://www.w3.org/2001/XMLSchema}int" default="-1" />
 *       &lt;attribute name="Precision" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *       &lt;attribute name="AllowExtendedSearch" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="UsedAsDocumentName" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="IsHierarchy" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="AllowFiltering" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="SelectListOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="SelectListType" type="{http://dev.docuware.com/schema/public/services/platform}SelectListType" default="Standard" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DialogField", propOrder = {
"proxy",
    "mask",
    "maskErrorText",
    "sampleEditText",
    "prefillValue",
    "dynamicPrefillValue",
    "links"
})
public class DialogField  implements IRelationsWithProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Mask")
    protected String mask;
    @XmlElement(name = "MaskErrorText", required = true)
    protected String maskErrorText;
    @XmlElement(name = "SampleEditText", required = true)
    protected String sampleEditText;
    @XmlElement(name = "PrefillValue")
    protected List<DocumentIndexFieldValue> prefillValue;
    @XmlElement(name = "DynamicPrefillValue")
    @XmlSchemaType(name = "string")
    protected List<DynamicValueType> dynamicPrefillValue;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services")
    protected Links links;
    @XmlAttribute(name = "DBFieldName", required = true)
    protected String dbFieldName;
    @XmlAttribute(name = "DlgLabel")
    protected String dlgLabel;
    @XmlAttribute(name = "DWFieldType", required = true)
    protected DWFieldType dwFieldType;
    @XmlAttribute(name = "Locked")
    protected Boolean locked;
    @XmlAttribute(name = "ReadOnly")
    protected Boolean readOnly;
    @XmlAttribute(name = "NotEmpty")
    protected Boolean notEmpty;
    @XmlAttribute(name = "Visible")
    protected Boolean visible;
    @XmlAttribute(name = "Length")
    protected Integer length;
    @XmlAttribute(name = "Precision")
    protected Integer precision;
    @XmlAttribute(name = "AllowExtendedSearch")
    protected Boolean allowExtendedSearch;
    @XmlAttribute(name = "UsedAsDocumentName")
    protected Boolean usedAsDocumentName;
    @XmlAttribute(name = "IsHierarchy")
    protected Boolean isHierarchy;
    @XmlAttribute(name = "AllowFiltering")
    protected Boolean allowFiltering;
    @XmlAttribute(name = "SelectListOnly")
    protected Boolean selectListOnly;
    @XmlAttribute(name = "SelectListType")
    protected SelectListType selectListType;

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

    /**
     * Gets the value of the prefillValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prefillValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrefillValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentIndexFieldValue }
     * 
     * 
     */
    public List<DocumentIndexFieldValue> getPrefillValue() {
        if (prefillValue == null) {
            prefillValue = new ArrayList<DocumentIndexFieldValue>();
        }
        return this.prefillValue;
    }

    /**
     * Gets the value of the dynamicPrefillValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dynamicPrefillValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDynamicPrefillValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DynamicValueType }
     * 
     * 
     */
    public List<DynamicValueType> getDynamicPrefillValue() {
        if (dynamicPrefillValue == null) {
            dynamicPrefillValue = new ArrayList<DynamicValueType>();
        }
        return this.dynamicPrefillValue;
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
     * Ruft den Wert der dbFieldName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBFieldName() {
        return dbFieldName;
    }

    /**
     * Legt den Wert der dbFieldName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDBFieldName(String value) {
        this.dbFieldName = value;
    }

    /**
     * Ruft den Wert der dlgLabel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlgLabel() {
        return dlgLabel;
    }

    /**
     * Legt den Wert der dlgLabel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDlgLabel(String value) {
        this.dlgLabel = value;
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
        return dwFieldType;
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
     * Ruft den Wert der locked-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isLocked() {
        if (locked == null) {
            return false;
        } else {
            return locked;
        }
    }

    /**
     * Legt den Wert der locked-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocked(Boolean value) {
        this.locked = value;
    }

    /**
     * Ruft den Wert der readOnly-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReadOnly() {
        if (readOnly == null) {
            return false;
        } else {
            return readOnly;
        }
    }

    /**
     * Legt den Wert der readOnly-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReadOnly(Boolean value) {
        this.readOnly = value;
    }

    /**
     * Ruft den Wert der notEmpty-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNotEmpty() {
        if (notEmpty == null) {
            return false;
        } else {
            return notEmpty;
        }
    }

    /**
     * Legt den Wert der notEmpty-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotEmpty(Boolean value) {
        this.notEmpty = value;
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
            return false;
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
     * Ruft den Wert der length-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getLength() {
        if (length == null) {
            return -1;
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
     * Ruft den Wert der allowExtendedSearch-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAllowExtendedSearch() {
        if (allowExtendedSearch == null) {
            return false;
        } else {
            return allowExtendedSearch;
        }
    }

    /**
     * Legt den Wert der allowExtendedSearch-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowExtendedSearch(Boolean value) {
        this.allowExtendedSearch = value;
    }

    /**
     * Ruft den Wert der usedAsDocumentName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUsedAsDocumentName() {
        if (usedAsDocumentName == null) {
            return false;
        } else {
            return usedAsDocumentName;
        }
    }

    /**
     * Legt den Wert der usedAsDocumentName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsedAsDocumentName(Boolean value) {
        this.usedAsDocumentName = value;
    }

    /**
     * Ruft den Wert der isHierarchy-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsHierarchy() {
        if (isHierarchy == null) {
            return false;
        } else {
            return isHierarchy;
        }
    }

    /**
     * Legt den Wert der isHierarchy-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsHierarchy(Boolean value) {
        this.isHierarchy = value;
    }

    /**
     * Ruft den Wert der allowFiltering-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAllowFiltering() {
        if (allowFiltering == null) {
            return false;
        } else {
            return allowFiltering;
        }
    }

    /**
     * Legt den Wert der allowFiltering-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowFiltering(Boolean value) {
        this.allowFiltering = value;
    }

    /**
     * Ruft den Wert der selectListOnly-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSelectListOnly() {
        if (selectListOnly == null) {
            return false;
        } else {
            return selectListOnly;
        }
    }

    /**
     * Legt den Wert der selectListOnly-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSelectListOnly(Boolean value) {
        this.selectListOnly = value;
    }

    /**
     * Ruft den Wert der selectListType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SelectListType }
     *     
     */
    public SelectListType getSelectListType() {
        if (selectListType == null) {
            return SelectListType.STANDARD;
        } else {
            return selectListType;
        }
    }

    /**
     * Legt den Wert der selectListType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectListType }
     *     
     */
    public void setSelectListType(SelectListType value) {
        this.selectListType = value;
    }

    public HttpClientProxy getProxy() {
	return this.proxy;
    }

    public void setProxy(HttpClientProxy proxy) {
	this.proxy = proxy;
	/*if(this.selectListInfos!=null) { 
        for (int i = 0; (i < this.selectListInfos.size()); i = (i + 1)) {
            this.selectListInfos.get(i).setProxy(proxy);
        }
	}*/
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
