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
 * Describes how to place a set of annotations and stamps on a section.
 * 
 * <p>Java-Klasse f�r SectionAnnotationsPlacement complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SectionAnnotationsPlacement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AnnotationsPlacement" type="{http://dev.docuware.com/schema/public/services/platform}AnnotationsPlacement"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SectionNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="PageNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SectionAnnotationsPlacement", propOrder = {
    "annotationsPlacement"
})
public class SectionAnnotationsPlacement  {

    @XmlElement(name = "AnnotationsPlacement", required = true)
    protected AnnotationsPlacement annotationsPlacement;
    @XmlAttribute(name = "SectionNumber", required = true)
    protected int sectionNumber;
    @XmlAttribute(name = "PageNumber", required = true)
    protected int pageNumber;

    /**
     * Ruft den Wert der annotationsPlacement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AnnotationsPlacement }
     *     
     */
    public AnnotationsPlacement getAnnotationsPlacement() {
        return annotationsPlacement;
    }

    /**
     * Legt den Wert der annotationsPlacement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnotationsPlacement }
     *     
     */
    public void setAnnotationsPlacement(AnnotationsPlacement value) {
        this.annotationsPlacement = value;
    }

    /**
     * Ruft den Wert der sectionNumber-Eigenschaft ab.
     * 
     */
    public int getSectionNumber() {
        return sectionNumber;
    }

    /**
     * Legt den Wert der sectionNumber-Eigenschaft fest.
     * 
     */
    public void setSectionNumber(int value) {
        this.sectionNumber = value;
    }

    /**
     * Ruft den Wert der pageNumber-Eigenschaft ab.
     * 
     */
    public int getPageNumber() {
        return pageNumber;
    }

    /**
     * Legt den Wert der pageNumber-Eigenschaft fest.
     * 
     */
    public void setPageNumber(int value) {
        this.pageNumber = value;
    }



}
