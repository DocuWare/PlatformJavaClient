//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.08.22 um 03:45:48 PM CEST 
//


package com.docuware.dev._public.intellix;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r CellZone complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="CellZone">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.docuware.com/public/intellix}RectangleBase">
 *       &lt;sequence>
 *         &lt;element name="TextZone" type="{http://dev.docuware.com/public/intellix}TextZone" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CellZone", propOrder = {
    "textZone"
})
public class CellZone
    extends RectangleBase
 {

    @XmlElement(name = "TextZone")
    protected TextZone textZone;

    /**
     * Ruft den Wert der textZone-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TextZone }
     *     
     */
    public TextZone getTextZone() {
        return textZone;
    }

    /**
     * Legt den Wert der textZone-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TextZone }
     *     
     */
    public void setTextZone(TextZone value) {
        this.textZone = value;
    }



}
