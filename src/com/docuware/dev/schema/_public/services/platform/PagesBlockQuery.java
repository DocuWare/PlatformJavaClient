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


/**
 * A query for requesting page blocks.
 * 
 * <p>Java-Klasse f�r PagesBlockQuery complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PagesBlockQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="FirstPage" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="PageCount" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PagesBlockQuery")
public class PagesBlockQuery  {

    @XmlAttribute(name = "FirstPage", required = true)
    protected int firstPage;
    @XmlAttribute(name = "PageCount", required = true)
    protected int pageCount;

    /**
     * Ruft den Wert der firstPage-Eigenschaft ab.
     * 
     */
    public int getFirstPage() {
        return firstPage;
    }

    /**
     * Legt den Wert der firstPage-Eigenschaft fest.
     * 
     */
    public void setFirstPage(int value) {
        this.firstPage = value;
    }

    /**
     * Ruft den Wert der pageCount-Eigenschaft ab.
     * 
     */
    public int getPageCount() {
        return pageCount;
    }

    /**
     * Legt den Wert der pageCount-Eigenschaft fest.
     * 
     */
    public void setPageCount(int value) {
        this.pageCount = value;
    }



}
