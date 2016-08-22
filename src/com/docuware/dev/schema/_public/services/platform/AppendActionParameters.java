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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Specific data for append action
 * 
 * <p>Java-Klasse f�r AppendActionParameters complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AppendActionParameters">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}DocumentActionParameters">
 *       &lt;sequence>
 *         &lt;element name="RemoveSourceDocuments" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;sequence>
 *           &lt;element name="DocumentsInFront" type="{http://dev.docuware.com/schema/public/services/platform}AppendActionDocuments" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element name="DocumentsAtBack" type="{http://dev.docuware.com/schema/public/services/platform}AppendActionDocuments" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppendActionParameters", propOrder = {
    "removeSourceDocuments",
    "documentsInFront",
    "documentsAtBack"
})
public class AppendActionParameters
    extends DocumentActionParameters
 {

    @XmlElement(name = "RemoveSourceDocuments", defaultValue = "true")
    protected boolean removeSourceDocuments;
    @XmlElement(name = "DocumentsInFront")
    protected List<AppendActionDocuments> documentsInFront;
    @XmlElement(name = "DocumentsAtBack")
    protected List<AppendActionDocuments> documentsAtBack;

    /**
     * Ruft den Wert der removeSourceDocuments-Eigenschaft ab.
     * 
     */
    public boolean isRemoveSourceDocuments() {
        return removeSourceDocuments;
    }

    /**
     * Legt den Wert der removeSourceDocuments-Eigenschaft fest.
     * 
     */
    public void setRemoveSourceDocuments(boolean value) {
        this.removeSourceDocuments = value;
    }

    /**
     * Gets the value of the documentsInFront property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentsInFront property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentsInFront().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppendActionDocuments }
     * 
     * 
     */
    public List<AppendActionDocuments> getDocumentsInFront() {
        if (documentsInFront == null) {
            documentsInFront = new ArrayList<AppendActionDocuments>();
        }
        return this.documentsInFront;
    }

    /**
     * Gets the value of the documentsAtBack property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentsAtBack property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentsAtBack().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AppendActionDocuments }
     * 
     * 
     */
    public List<AppendActionDocuments> getDocumentsAtBack() {
        if (documentsAtBack == null) {
            documentsAtBack = new ArrayList<AppendActionDocuments>();
        }
        return this.documentsAtBack;
    }



}
