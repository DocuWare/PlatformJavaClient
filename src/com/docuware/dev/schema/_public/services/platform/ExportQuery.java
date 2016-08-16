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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r ExportQuery complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ExportQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Settings" type="{http://dev.docuware.com/schema/public/services/platform}ExportSettings"/>
 *         &lt;element name="Source" type="{http://dev.docuware.com/schema/public/services/platform}DocumentsQuery"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExportQuery", propOrder = {
"proxy",
    "settings",
    "source"
})
public class ExportQuery  implements IHttpClientProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Settings", required = true)
    protected ExportSettings settings;
    @XmlElement(name = "Source", required = true)
    protected DocumentsQuery source;

    /**
     * Ruft den Wert der settings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ExportSettings }
     *     
     */
    public ExportSettings getSettings() {
        return settings;
    }

    /**
     * Legt den Wert der settings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportSettings }
     *     
     */
    public void setSettings(ExportSettings value) {
        this.settings = value;
    }

    /**
     * Ruft den Wert der source-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DocumentsQuery }
     *     
     */
    public DocumentsQuery getSource() {
        return source;
    }

    /**
     * Legt den Wert der source-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentsQuery }
     *     
     */
    public void setSource(DocumentsQuery value) {
        this.source = value;
    }

    public HttpClientProxy getProxy() {
	return this.proxy;
	
    }

    public void setProxy(HttpClientProxy proxy) {
	this.proxy = proxy;
    if(source != null){ 
		source.setProxy(proxy); 
    }
    }



}
