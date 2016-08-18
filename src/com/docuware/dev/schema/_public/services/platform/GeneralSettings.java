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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r GeneralSettings complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="GeneralSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="StartWith" type="{http://dev.docuware.com/schema/public/services/platform}WorkAreaType" default="None" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralSettings")
public class GeneralSettings  {

    @XmlAttribute(name = "StartWith")
    protected WorkAreaType startWith;

    /**
     * Ruft den Wert der startWith-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link WorkAreaType }
     *     
     */
    public WorkAreaType getStartWith() {
        if (startWith == null) {
            return WorkAreaType.NONE;
        } else {
            return startWith;
        }
    }

    /**
     * Legt den Wert der startWith-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkAreaType }
     *     
     */
    public void setStartWith(WorkAreaType value) {
        this.startWith = value;
    }



}
