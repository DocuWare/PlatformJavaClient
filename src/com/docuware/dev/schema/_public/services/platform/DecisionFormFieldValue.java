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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r DecisionFormFieldValue complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DecisionFormFieldValue">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}FormFieldValue">
 *       &lt;attribute name="BpwDataType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IsMultiSelect" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="IsMandatory" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="SelectListOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="SelectListGuid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FilterGuid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AdditionalParameter" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="VariableName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecisionFormFieldValue")
public class DecisionFormFieldValue
    extends FormFieldValue
 {

    @XmlAttribute(name = "BpwDataType")
    protected String bpwDataType;
    @XmlAttribute(name = "IsMultiSelect")
    protected Boolean isMultiSelect;
    @XmlAttribute(name = "IsMandatory")
    protected Boolean isMandatory;
    @XmlAttribute(name = "SelectListOnly")
    protected Boolean selectListOnly;
    @XmlAttribute(name = "SelectListGuid")
    protected String selectListGuid;
    @XmlAttribute(name = "FilterGuid")
    protected String filterGuid;
    @XmlAttribute(name = "AdditionalParameter", required = true)
    protected int additionalParameter;
    @XmlAttribute(name = "VariableName")
    protected String variableName;

    /**
     * Ruft den Wert der bpwDataType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBpwDataType() {
        return bpwDataType;
    }

    /**
     * Legt den Wert der bpwDataType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBpwDataType(String value) {
        this.bpwDataType = value;
    }

    /**
     * Ruft den Wert der isMultiSelect-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsMultiSelect() {
        if (isMultiSelect == null) {
            return false;
        } else {
            return isMultiSelect;
        }
    }

    /**
     * Legt den Wert der isMultiSelect-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMultiSelect(Boolean value) {
        this.isMultiSelect = value;
    }

    /**
     * Ruft den Wert der isMandatory-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsMandatory() {
        if (isMandatory == null) {
            return false;
        } else {
            return isMandatory;
        }
    }

    /**
     * Legt den Wert der isMandatory-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMandatory(Boolean value) {
        this.isMandatory = value;
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
     * Ruft den Wert der selectListGuid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectListGuid() {
        return selectListGuid;
    }

    /**
     * Legt den Wert der selectListGuid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectListGuid(String value) {
        this.selectListGuid = value;
    }

    /**
     * Ruft den Wert der filterGuid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterGuid() {
        return filterGuid;
    }

    /**
     * Legt den Wert der filterGuid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterGuid(String value) {
        this.filterGuid = value;
    }

    /**
     * Ruft den Wert der additionalParameter-Eigenschaft ab.
     * 
     */
    public int getAdditionalParameter() {
        return additionalParameter;
    }

    /**
     * Legt den Wert der additionalParameter-Eigenschaft fest.
     * 
     */
    public void setAdditionalParameter(int value) {
        this.additionalParameter = value;
    }

    /**
     * Ruft den Wert der variableName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariableName() {
        return variableName;
    }

    /**
     * Legt den Wert der variableName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariableName(String value) {
        this.variableName = value;
    }



}
