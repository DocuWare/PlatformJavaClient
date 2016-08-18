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
import javax.xml.bind.annotation.XmlType;


/**
 * Defines the parameters of a documents transfer.
 * 
 * <p>Java-Klasse f�r DocumentsTransferInfo complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DocumentsTransferInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Documents">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Document" type="{http://dev.docuware.com/schema/public/services/platform}Document" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="SourceFileCabinetId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="UseDefaultDialog" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="KeepSource" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="FillIntellix" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentsTransferInfo", propOrder = {
"proxy",
    "documents"
})
public class DocumentsTransferInfo  implements IHttpClientProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Documents", required = true)
    protected DocumentsTransferInfo.Documents documents;
    @XmlAttribute(name = "SourceFileCabinetId", required = true)
    protected String sourceFileCabinetId;
    @XmlAttribute(name = "UseDefaultDialog")
    protected Boolean useDefaultDialog;
    @XmlAttribute(name = "KeepSource")
    protected Boolean keepSource;
    @XmlAttribute(name = "FillIntellix")
    protected Boolean fillIntellix;

    /**
     * Ruft den Wert der documents-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DocumentsTransferInfo.Documents }
     *     
     */
    public DocumentsTransferInfo.Documents getDocuments() {
        return documents;
    }

    /**
     * Legt den Wert der documents-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentsTransferInfo.Documents }
     *     
     */
    public void setDocuments(DocumentsTransferInfo.Documents value) {
        this.documents = value;
    }

    /**
     * Ruft den Wert der sourceFileCabinetId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceFileCabinetId() {
        return sourceFileCabinetId;
    }

    /**
     * Legt den Wert der sourceFileCabinetId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceFileCabinetId(String value) {
        this.sourceFileCabinetId = value;
    }

    /**
     * Ruft den Wert der useDefaultDialog-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUseDefaultDialog() {
        if (useDefaultDialog == null) {
            return false;
        } else {
            return useDefaultDialog;
        }
    }

    /**
     * Legt den Wert der useDefaultDialog-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseDefaultDialog(Boolean value) {
        this.useDefaultDialog = value;
    }

    /**
     * Ruft den Wert der keepSource-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isKeepSource() {
        if (keepSource == null) {
            return false;
        } else {
            return keepSource;
        }
    }

    /**
     * Legt den Wert der keepSource-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeepSource(Boolean value) {
        this.keepSource = value;
    }

    /**
     * Ruft den Wert der fillIntellix-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFillIntellix() {
        if (fillIntellix == null) {
            return false;
        } else {
            return fillIntellix;
        }
    }

    /**
     * Legt den Wert der fillIntellix-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFillIntellix(Boolean value) {
        this.fillIntellix = value;
    }


    /**
     * <p>Java-Klasse f�r anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Document" type="{http://dev.docuware.com/schema/public/services/platform}Document" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "document"
    })
    public static class Documents {

        @XmlElement(name = "Document")
        protected List<Document> document;

        /**
         * Gets the value of the document property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the document property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocument().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Document }
         * 
         * 
         */
        public List<Document> getDocument() {
            if (document == null) {
                document = new ArrayList<Document>();
            }
            return this.document;
        }

    }

    public HttpClientProxy getProxy() {
	return this.proxy;
    }

    public void setProxy(HttpClientProxy proxy) {
	this.proxy = proxy;
	if(this.documents!=null) {  
        for (int i = 0; (i < this.documents.getDocument().size()); i = (i + 1)) {
            this.documents.getDocument().get(i).setProxy(proxy);
        }
	}
    }



}
