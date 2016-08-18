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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r ApplicationPreferencesHolder complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ApplicationPreferencesHolder">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AppPrefs" type="{http://dev.docuware.com/schema/public/services/platform}ApplicationPreferences" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationPreferencesHolder", propOrder = {
    "appPrefs"
})
public class ApplicationPreferencesHolder  {

    @XmlElement(name = "AppPrefs")
    protected ApplicationPreferences appPrefs;

    /**
     * Ruft den Wert der appPrefs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ApplicationPreferences }
     *     
     */
    public ApplicationPreferences getAppPrefs() {
        return appPrefs;
    }

    /**
     * Legt den Wert der appPrefs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicationPreferences }
     *     
     */
    public void setAppPrefs(ApplicationPreferences value) {
        this.appPrefs = value;
    }



}
