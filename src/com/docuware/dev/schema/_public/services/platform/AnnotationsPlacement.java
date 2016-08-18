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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes how to place a set of annotations and stamps on a page.
 * 
 * <p>Java-Klasse f�r AnnotationsPlacement complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AnnotationsPlacement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;choice>
 *           &lt;element name="Annotation" type="{http://dev.docuware.com/schema/public/services/platform}Annotation"/>
 *           &lt;element name="StampPlacement" type="{http://dev.docuware.com/schema/public/services/platform}StampPlacement"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnotationsPlacement", propOrder = {
    "annotationOrStampPlacement"
})
public class AnnotationsPlacement  {

    @XmlElements({
        @XmlElement(name = "Annotation", type = Annotation.class),
        @XmlElement(name = "StampPlacement", type = StampPlacement.class)
    })
    protected List<Object> annotationOrStampPlacement;

    /**
     * Gets the value of the annotationOrStampPlacement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the annotationOrStampPlacement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAnnotationOrStampPlacement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Annotation }
     * {@link StampPlacement }
     * 
     * 
     */
    public List<Object> getAnnotationOrStampPlacement() {
        if (annotationOrStampPlacement == null) {
            annotationOrStampPlacement = new ArrayList<Object>();
        }
        return this.annotationOrStampPlacement;
    }



}
