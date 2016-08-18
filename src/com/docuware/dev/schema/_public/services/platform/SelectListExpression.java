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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Query definition for a select list
 * 
 * <p>Java-Klasse f�r SelectListExpression complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SelectListExpression">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DialogExpression" type="{http://dev.docuware.com/schema/public/services/platform}DialogExpression" minOccurs="0"/>
 *         &lt;element name="ValuePrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="FieldName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *       &lt;attribute name="Limit" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *       &lt;attribute name="SortDirection" type="{http://dev.docuware.com/schema/public/services/platform}SortDirection" default="Default" />
 *       &lt;attribute name="ExcludeExternal" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectListExpression", propOrder = {
    "dialogExpression",
    "valuePrefix"
})
public class SelectListExpression  {

    @XmlElement(name = "DialogExpression")
    protected DialogExpression dialogExpression;
    @XmlElement(name = "ValuePrefix")
    protected String valuePrefix;
    @XmlAttribute(name = "FieldName", required = true)
    protected String fieldName;
    @XmlAttribute(name = "Count")
    protected Integer count;
    @XmlAttribute(name = "Start")
    protected Integer start;
    @XmlAttribute(name = "Limit")
    protected Integer limit;
    @XmlAttribute(name = "SortDirection")
    protected SortDirection sortDirection;
    @XmlAttribute(name = "ExcludeExternal")
    protected Boolean excludeExternal;

    /**
     * Ruft den Wert der dialogExpression-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DialogExpression }
     *     
     */
    public DialogExpression getDialogExpression() {
        return dialogExpression;
    }

    /**
     * Legt den Wert der dialogExpression-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DialogExpression }
     *     
     */
    public void setDialogExpression(DialogExpression value) {
        this.dialogExpression = value;
    }

    /**
     * Ruft den Wert der valuePrefix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValuePrefix() {
        return valuePrefix;
    }

    /**
     * Legt den Wert der valuePrefix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValuePrefix(String value) {
        this.valuePrefix = value;
    }

    /**
     * Ruft den Wert der fieldName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Legt den Wert der fieldName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldName(String value) {
        this.fieldName = value;
    }

    /**
     * Ruft den Wert der count-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getCount() {
        if (count == null) {
            return  0;
        } else {
            return count;
        }
    }

    /**
     * Legt den Wert der count-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCount(Integer value) {
        this.count = value;
    }

    /**
     * Ruft den Wert der start-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getStart() {
        if (start == null) {
            return  0;
        } else {
            return start;
        }
    }

    /**
     * Legt den Wert der start-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStart(Integer value) {
        this.start = value;
    }

    /**
     * Ruft den Wert der limit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getLimit() {
        if (limit == null) {
            return  0;
        } else {
            return limit;
        }
    }

    /**
     * Legt den Wert der limit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLimit(Integer value) {
        this.limit = value;
    }

    /**
     * Ruft den Wert der sortDirection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SortDirection }
     *     
     */
    public SortDirection getSortDirection() {
        if (sortDirection == null) {
            return SortDirection.DEFAULT;
        } else {
            return sortDirection;
        }
    }

    /**
     * Legt den Wert der sortDirection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SortDirection }
     *     
     */
    public void setSortDirection(SortDirection value) {
        this.sortDirection = value;
    }

    /**
     * Ruft den Wert der excludeExternal-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isExcludeExternal() {
        if (excludeExternal == null) {
            return false;
        } else {
            return excludeExternal;
        }
    }

    /**
     * Legt den Wert der excludeExternal-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcludeExternal(Boolean value) {
        this.excludeExternal = value;
    }



}
