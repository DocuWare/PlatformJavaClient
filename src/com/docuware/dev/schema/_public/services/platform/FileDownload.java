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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Define how a document can be downloaded
 * 
 * <p>Java-Klasse f�r FileDownload complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FileDownload">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}FileDownloadBase">
 *       &lt;attribute name="TargetFileType" type="{http://dev.docuware.com/schema/public/services/platform}FileDownloadType" default="Auto" />
 *       &lt;attribute name="DirectDownload" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="AutoPrint" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileDownload")
public class FileDownload
    extends FileDownloadBase
 {

    @XmlAttribute(name = "TargetFileType")
    protected FileDownloadType targetFileType;
    @XmlAttribute(name = "DirectDownload")
    protected Boolean directDownload;
    @XmlAttribute(name = "AutoPrint")
    protected Boolean autoPrint;

    /**
     * Ruft den Wert der targetFileType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FileDownloadType }
     *     
     */
    public FileDownloadType getTargetFileType() {
        if (targetFileType == null) {
            return FileDownloadType.AUTO;
        } else {
            return targetFileType;
        }
    }

    /**
     * Legt den Wert der targetFileType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FileDownloadType }
     *     
     */
    public void setTargetFileType(FileDownloadType value) {
        this.targetFileType = value;
    }

    /**
     * Ruft den Wert der directDownload-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDirectDownload() {
        if (directDownload == null) {
            return false;
        } else {
            return directDownload;
        }
    }

    /**
     * Legt den Wert der directDownload-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDirectDownload(Boolean value) {
        this.directDownload = value;
    }

    /**
     * Ruft den Wert der autoPrint-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAutoPrint() {
        if (autoPrint == null) {
            return false;
        } else {
            return autoPrint;
        }
    }

    /**
     * Legt den Wert der autoPrint-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoPrint(Boolean value) {
        this.autoPrint = value;
    }



}
