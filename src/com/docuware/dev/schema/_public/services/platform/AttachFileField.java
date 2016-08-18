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
 * <p>Java-Klasse f�r AttachFileField complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AttachFileField">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}WebFormField">
 *       &lt;sequence>
 *         &lt;element name="FileTypes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MaxFileSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MinFileCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="MaxFileCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachFileField", propOrder = {
    "fileTypes",
    "maxFileSize",
    "minFileCount",
    "maxFileCount"
})
public class AttachFileField
    extends WebFormField
 {

    @XmlElement(name = "FileTypes", required = true)
    protected String fileTypes;
    @XmlElement(name = "MaxFileSize")
    protected int maxFileSize;
    @XmlElement(name = "MinFileCount")
    protected int minFileCount;
    @XmlElement(name = "MaxFileCount")
    protected int maxFileCount;

    /**
     * Ruft den Wert der fileTypes-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileTypes() {
        return fileTypes;
    }

    /**
     * Legt den Wert der fileTypes-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileTypes(String value) {
        this.fileTypes = value;
    }

    /**
     * Ruft den Wert der maxFileSize-Eigenschaft ab.
     * 
     */
    public int getMaxFileSize() {
        return maxFileSize;
    }

    /**
     * Legt den Wert der maxFileSize-Eigenschaft fest.
     * 
     */
    public void setMaxFileSize(int value) {
        this.maxFileSize = value;
    }

    /**
     * Ruft den Wert der minFileCount-Eigenschaft ab.
     * 
     */
    public int getMinFileCount() {
        return minFileCount;
    }

    /**
     * Legt den Wert der minFileCount-Eigenschaft fest.
     * 
     */
    public void setMinFileCount(int value) {
        this.minFileCount = value;
    }

    /**
     * Ruft den Wert der maxFileCount-Eigenschaft ab.
     * 
     */
    public int getMaxFileCount() {
        return maxFileCount;
    }

    /**
     * Legt den Wert der maxFileCount-Eigenschaft fest.
     * 
     */
    public void setMaxFileCount(int value) {
        this.maxFileCount = value;
    }



}
