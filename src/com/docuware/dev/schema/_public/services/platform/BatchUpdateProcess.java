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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A class which contains data for batch update processes.
 * 
 * <p>Java-Klasse f�r BatchUpdateProcess complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="BatchUpdateProcess">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Source" type="{http://dev.docuware.com/schema/public/services/platform}BatchUpdateSource"/>
 *         &lt;element name="Data" type="{http://dev.docuware.com/schema/public/services/platform}BatchUpdateProcessData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchUpdateProcess", propOrder = {
    "source",
    "data"
})
public class BatchUpdateProcess  {

    @XmlElement(name = "Source", required = true)
    protected BatchUpdateSource source;
    @XmlElement(name = "Data", required = true)
    protected BatchUpdateProcessData data;

    /**
     * Ruft den Wert der source-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BatchUpdateSource }
     *     
     */
    public BatchUpdateSource getSource() {
        return source;
    }

    /**
     * Legt den Wert der source-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchUpdateSource }
     *     
     */
    public void setSource(BatchUpdateSource value) {
        this.source = value;
    }

    /**
     * Ruft den Wert der data-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BatchUpdateProcessData }
     *     
     */
    public BatchUpdateProcessData getData() {
        return data;
    }

    /**
     * Legt den Wert der data-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchUpdateProcessData }
     *     
     */
    public void setData(BatchUpdateProcessData value) {
        this.data = value;
    }



}
