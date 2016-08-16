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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r ViewerDialog complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ViewerDialog">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Mode" type="{http://dev.docuware.com/schema/public/services/platform}ViewerDialogModes" default="AdHocEditMode" />
 *       &lt;attribute name="MarkFulltextSearchHits" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewerDialog")
public class ViewerDialog  {

    @XmlAttribute(name = "Mode")
    protected ViewerDialogModes mode;
    @XmlAttribute(name = "MarkFulltextSearchHits")
    protected Boolean markFulltextSearchHits;

    /**
     * Ruft den Wert der mode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ViewerDialogModes }
     *     
     */
    public ViewerDialogModes getMode() {
        if (mode == null) {
            return ViewerDialogModes.AD_HOC_EDIT_MODE;
        } else {
            return mode;
        }
    }

    /**
     * Legt den Wert der mode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewerDialogModes }
     *     
     */
    public void setMode(ViewerDialogModes value) {
        this.mode = value;
    }

    /**
     * Ruft den Wert der markFulltextSearchHits-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isMarkFulltextSearchHits() {
        if (markFulltextSearchHits == null) {
            return true;
        } else {
            return markFulltextSearchHits;
        }
    }

    /**
     * Legt den Wert der markFulltextSearchHits-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMarkFulltextSearchHits(Boolean value) {
        this.markFulltextSearchHits = value;
    }



}
