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
 * Define a a set of words and locations where they are found in a page
 * 
 * <p>Java-Klasse f�r WordSearchResultPageHit complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="WordSearchResultPageHit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Hits" type="{http://dev.docuware.com/schema/public/services/platform}WordSearchResultWordHits"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PageNum" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WordSearchResultPageHit", propOrder = {
    "hits"
})
public class WordSearchResultPageHit  {

    @XmlElement(name = "Hits", required = true)
    protected WordSearchResultWordHits hits;
    @XmlAttribute(name = "PageNum", required = true)
    protected int pageNum;

    /**
     * Ruft den Wert der hits-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link WordSearchResultWordHits }
     *     
     */
    public WordSearchResultWordHits getHits() {
        return hits;
    }

    /**
     * Legt den Wert der hits-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link WordSearchResultWordHits }
     *     
     */
    public void setHits(WordSearchResultWordHits value) {
        this.hits = value;
    }

    /**
     * Ruft den Wert der pageNum-Eigenschaft ab.
     * 
     */
    public int getPageNum() {
        return pageNum;
    }

    /**
     * Legt den Wert der pageNum-Eigenschaft fest.
     * 
     */
    public void setPageNum(int value) {
        this.pageNum = value;
    }



}
