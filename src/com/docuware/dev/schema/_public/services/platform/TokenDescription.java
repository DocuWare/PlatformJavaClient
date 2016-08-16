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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import com.docuware.dev.settings.interop.DWProductTypes;


/**
 * Define a purpose of the token. Can define some restrictions
 * 
 * <p>Java-Klasse f�r TokenDescription complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TokenDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TargetProducts" type="{http://dev.docuware.com/settings/interop}DWProductTypes" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Usage" use="required" type="{http://dev.docuware.com/schema/public/services/platform}TokenUsage" />
 *       &lt;attribute name="Lifetime" use="required" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TokenDescription", propOrder = {
    "targetProducts"
})
public class TokenDescription  {

    @XmlElement(name = "TargetProducts")
    @XmlSchemaType(name = "string")
    protected List<DWProductTypes> targetProducts;
    @XmlAttribute(name = "Usage", required = true)
    protected TokenUsage usage;
    @XmlAttribute(name = "Lifetime", required = true)
    protected Duration lifetime;

    /**
     * Gets the value of the targetProducts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetProducts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetProducts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DWProductTypes }
     * 
     * 
     */
    public List<DWProductTypes> getTargetProducts() {
        if (targetProducts == null) {
            targetProducts = new ArrayList<DWProductTypes>();
        }
        return this.targetProducts;
    }

    /**
     * Ruft den Wert der usage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TokenUsage }
     *     
     */
    public TokenUsage getUsage() {
        return usage;
    }

    /**
     * Legt den Wert der usage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TokenUsage }
     *     
     */
    public void setUsage(TokenUsage value) {
        this.usage = value;
    }

    /**
     * Ruft den Wert der lifetime-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getLifetime() {
        return lifetime;
    }

    /**
     * Legt den Wert der lifetime-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setLifetime(Duration value) {
        this.lifetime = value;
    }



}
