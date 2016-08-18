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
 * Parameters for CheckIn action
 * 
 * <p>Java-Klasse f�r CheckInActionParameters complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CheckInActionParameters">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}DocumentActionParameters">
 *       &lt;sequence>
 *         &lt;element name="DocumentVersion" type="{http://dev.docuware.com/schema/public/services/platform}DocumentVersion"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckInActionParameters", propOrder = {
    "documentVersion"
})
public class CheckInActionParameters
    extends DocumentActionParameters
 {

    @XmlElement(name = "DocumentVersion", required = true)
    protected DocumentVersion documentVersion;
    @XmlAttribute(name = "Comments")
    protected String comments;

    /**
     * Ruft den Wert der documentVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DocumentVersion }
     *     
     */
    public DocumentVersion getDocumentVersion() {
        return documentVersion;
    }

    /**
     * Legt den Wert der documentVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentVersion }
     *     
     */
    public void setDocumentVersion(DocumentVersion value) {
        this.documentVersion = value;
    }

    /**
     * Ruft den Wert der comments-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Legt den Wert der comments-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }



}
