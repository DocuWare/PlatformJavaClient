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
import javax.xml.datatype.Duration;
import com.docuware.dev.settings.interop.DWProductTypes;


/**
 * Details abut user login
 * 
 * <p>Java-Klasse f�r LoginInfo complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LoginInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="PasswordExpireNotification" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *       &lt;attribute name="BookedLicense" use="required" type="{http://dev.docuware.com/settings/interop}DWProductTypes" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoginInfo")
public class LoginInfo  {

    @XmlAttribute(name = "PasswordExpireNotification")
    protected Duration passwordExpireNotification;
    @XmlAttribute(name = "BookedLicense", required = true)
    protected DWProductTypes bookedLicense;

    /**
     * Ruft den Wert der passwordExpireNotification-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getPasswordExpireNotification() {
        return passwordExpireNotification;
    }

    /**
     * Legt den Wert der passwordExpireNotification-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setPasswordExpireNotification(Duration value) {
        this.passwordExpireNotification = value;
    }

    /**
     * Ruft den Wert der bookedLicense-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DWProductTypes }
     *     
     */
    public DWProductTypes getBookedLicense() {
        return bookedLicense;
    }

    /**
     * Legt den Wert der bookedLicense-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DWProductTypes }
     *     
     */
    public void setBookedLicense(DWProductTypes value) {
        this.bookedLicense = value;
    }



}
