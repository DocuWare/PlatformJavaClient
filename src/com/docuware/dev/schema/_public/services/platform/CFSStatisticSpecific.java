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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r CFSStatisticSpecific complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CFSStatisticSpecific">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SpecificValue" type="{http://dev.docuware.com/schema/public/services/platform}CFSSpecificValue" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Category" use="required" type="{http://dev.docuware.com/schema/public/services/platform}CFSTableNames" />
 *       &lt;attribute name="ObjectID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CFSStatisticSpecific", propOrder = {
    "specificValue"
})
public class CFSStatisticSpecific  {

    @XmlElement(name = "SpecificValue", required = true)
    protected List<CFSSpecificValue> specificValue;
    @XmlAttribute(name = "Category", required = true)
    protected CFSTableNames category;
    @XmlAttribute(name = "ObjectID", required = true)
    protected String objectID;

    /**
     * Gets the value of the specificValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specificValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecificValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CFSSpecificValue }
     * 
     * 
     */
    public List<CFSSpecificValue> getSpecificValue() {
        if (specificValue == null) {
            specificValue = new ArrayList<CFSSpecificValue>();
        }
        return this.specificValue;
    }

    /**
     * Ruft den Wert der category-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link CFSTableNames }
     *     
     */
    public CFSTableNames getCategory() {
        return category;
    }

    /**
     * Legt den Wert der category-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link CFSTableNames }
     *     
     */
    public void setCategory(CFSTableNames value) {
        this.category = value;
    }

    /**
     * Ruft den Wert der objectID-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectID() {
        return objectID;
    }

    /**
     * Legt den Wert der objectID-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectID(String value) {
        this.objectID = value;
    }



}
