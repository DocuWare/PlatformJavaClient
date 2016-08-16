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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Information about the action pereformed on document
 * 
 * <p>Java-Klasse f�r DocumentActionInfo complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DocumentActionInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocumentActionParameters" type="{http://dev.docuware.com/schema/public/services/platform}DocumentActionParameters"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DocumentAction" use="required" type="{http://dev.docuware.com/schema/public/services/platform}DocumentAction" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentActionInfo", propOrder = {
    "documentActionParameters"
})
public class DocumentActionInfo  {

    @XmlElement(name = "DocumentActionParameters", required = true)
    protected DocumentActionParameters documentActionParameters;
    @XmlAttribute(name = "DocumentAction", required = true)
    protected DocumentAction documentAction;

    /**
     * Ruft den Wert der documentActionParameters-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DocumentActionParameters }
     *     
     */
    public DocumentActionParameters getDocumentActionParameters() {
        return documentActionParameters;
    }

    /**
     * Legt den Wert der documentActionParameters-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentActionParameters }
     *     
     */
    public void setDocumentActionParameters(DocumentActionParameters value) {
        this.documentActionParameters = value;
    }

    /**
     * Ruft den Wert der documentAction-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DocumentAction }
     *     
     */
    public DocumentAction getDocumentAction() {
        return documentAction;
    }

    /**
     * Legt den Wert der documentAction-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentAction }
     *     
     */
    public void setDocumentAction(DocumentAction value) {
        this.documentAction = value;
    }



}
