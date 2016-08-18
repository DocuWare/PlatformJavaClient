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
 * Line/Arrow annotation
 * 
 * <p>Java-Klasse f�r LineEntry complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="LineEntry">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}EntryBase">
 *       &lt;sequence>
 *         &lt;element name="From" type="{http://dev.docuware.com/schema/public/services/platform}AnnotationPoint"/>
 *         &lt;element name="To" type="{http://dev.docuware.com/schema/public/services/platform}AnnotationPoint"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Arrow" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LineEntry", propOrder = {
    "from",
    "to"
})
public class LineEntry
    extends EntryBase
 {

    @XmlElement(name = "From", required = true)
    protected AnnotationPoint from;
    @XmlElement(name = "To", required = true)
    protected AnnotationPoint to;
    @XmlAttribute(name = "Arrow")
    protected Boolean arrow;

    /**
     * Ruft den Wert der from-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AnnotationPoint }
     *     
     */
    public AnnotationPoint getFrom() {
        return from;
    }

    /**
     * Legt den Wert der from-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnotationPoint }
     *     
     */
    public void setFrom(AnnotationPoint value) {
        this.from = value;
    }

    /**
     * Ruft den Wert der to-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AnnotationPoint }
     *     
     */
    public AnnotationPoint getTo() {
        return to;
    }

    /**
     * Legt den Wert der to-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AnnotationPoint }
     *     
     */
    public void setTo(AnnotationPoint value) {
        this.to = value;
    }

    /**
     * Ruft den Wert der arrow-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isArrow() {
        if (arrow == null) {
            return false;
        } else {
            return arrow;
        }
    }

    /**
     * Legt den Wert der arrow-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setArrow(Boolean value) {
        this.arrow = value;
    }



}
