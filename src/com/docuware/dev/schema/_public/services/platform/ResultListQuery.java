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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Base query definition for a result list
 * 
 * <p>Java-Klasse f�r ResultListQuery complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ResultListQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SortOrder" type="{http://dev.docuware.com/schema/public/services/platform}SortedFieldsList" minOccurs="0"/>
 *         &lt;element name="AdditionalResultFields" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FlagConditions" type="{http://dev.docuware.com/schema/public/services/platform}FlagConditions"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Start" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *       &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultListQuery", propOrder = {
    "sortOrder",
    "additionalResultFields",
    "flagConditions"
})
@XmlSeeAlso({
    DialogExpression.class
})
public class ResultListQuery  {

    @XmlElement(name = "SortOrder")
    protected SortedFieldsList sortOrder;
    @XmlElement(name = "AdditionalResultFields")
    protected List<String> additionalResultFields;
    @XmlElement(name = "FlagConditions", required = true)
    protected FlagConditions flagConditions;
    @XmlAttribute(name = "Start")
    protected Integer start;
    @XmlAttribute(name = "Count")
    protected Integer count;

    /**
     * Ruft den Wert der sortOrder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SortedFieldsList }
     *     
     */
    public SortedFieldsList getSortOrder() {
        return sortOrder;
    }

    /**
     * Legt den Wert der sortOrder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SortedFieldsList }
     *     
     */
    public void setSortOrder(SortedFieldsList value) {
        this.sortOrder = value;
    }

    /**
     * Gets the value of the additionalResultFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalResultFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalResultFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAdditionalResultFields() {
        if (additionalResultFields == null) {
            additionalResultFields = new ArrayList<String>();
        }
        return this.additionalResultFields;
    }

    /**
     * Ruft den Wert der flagConditions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FlagConditions }
     *     
     */
    public FlagConditions getFlagConditions() {
        return flagConditions;
    }

    /**
     * Legt den Wert der flagConditions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FlagConditions }
     *     
     */
    public void setFlagConditions(FlagConditions value) {
        this.flagConditions = value;
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



}
