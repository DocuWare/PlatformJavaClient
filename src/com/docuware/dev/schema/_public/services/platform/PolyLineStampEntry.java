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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Tablet polyline stamp. Contains one or more strokes. Used as handwriting stamp
 * 
 * <p>Java-Klasse f�r PolyLineStampEntry complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PolyLineStampEntry">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}StampBase">
 *       &lt;sequence>
 *         &lt;element name="Stroke" type="{http://dev.docuware.com/schema/public/services/platform}Stroke" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolyLineStampEntry", propOrder = {
    "stroke"
})
public class PolyLineStampEntry
    extends StampBase
 {

    @XmlElement(name = "Stroke", required = true)
    protected List<Stroke> stroke;

    /**
     * Gets the value of the stroke property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stroke property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStroke().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Stroke }
     * 
     * 
     */
    public List<Stroke> getStroke() {
        if (stroke == null) {
            stroke = new ArrayList<Stroke>();
        }
        return this.stroke;
    }



}
