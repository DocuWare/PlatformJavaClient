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
 * <p>Java-Klasse f�r ContentAreaPreferences complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ContentAreaPreferences">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Instances" type="{http://dev.docuware.com/schema/public/services/platform}WorkInstance" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AreaType" type="{http://dev.docuware.com/schema/public/services/platform}WorkAreaType" default="None" />
 *       &lt;attribute name="SelectedInstanceIndex" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentAreaPreferences", propOrder = {
    "instances"
})
@XmlSeeAlso({
    WorkflowAreaPreferences.class,
    BasketAreaPreferences.class
})
public class ContentAreaPreferences  {

    @XmlElement(name = "Instances")
    protected List<WorkInstance> instances;
    @XmlAttribute(name = "AreaType")
    protected WorkAreaType areaType;
    @XmlAttribute(name = "SelectedInstanceIndex")
    protected Integer selectedInstanceIndex;

    /**
     * Gets the value of the instances property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instances property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstances().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkInstance }
     * 
     * 
     */
    public List<WorkInstance> getInstances() {
        if (instances == null) {
            instances = new ArrayList<WorkInstance>();
        }
        return this.instances;
    }

    /**
     * Ruft den Wert der areaType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link WorkAreaType }
     *     
     */
    public WorkAreaType getAreaType() {
        if (areaType == null) {
            return WorkAreaType.NONE;
        } else {
            return areaType;
        }
    }

    /**
     * Legt den Wert der areaType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkAreaType }
     *     
     */
    public void setAreaType(WorkAreaType value) {
        this.areaType = value;
    }

    /**
     * Ruft den Wert der selectedInstanceIndex-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSelectedInstanceIndex() {
        return selectedInstanceIndex;
    }

    /**
     * Legt den Wert der selectedInstanceIndex-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSelectedInstanceIndex(Integer value) {
        this.selectedInstanceIndex = value;
    }



}
