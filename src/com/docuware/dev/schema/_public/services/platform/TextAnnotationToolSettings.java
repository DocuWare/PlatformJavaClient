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
 * <p>Java-Klasse f�r TextAnnotationToolSettings complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TextAnnotationToolSettings">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}AnnotationToolSettings">
 *       &lt;sequence>
 *         &lt;element name="FontSettings" type="{http://dev.docuware.com/schema/public/services/platform}FontSettings"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextAnnotationToolSettings", propOrder = {
    "fontSettings"
})
public class TextAnnotationToolSettings
    extends AnnotationToolSettings
 {

    @XmlElement(name = "FontSettings", required = true)
    protected FontSettings fontSettings;

    /**
     * Ruft den Wert der fontSettings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FontSettings }
     *     
     */
    public FontSettings getFontSettings() {
        return fontSettings;
    }

    /**
     * Legt den Wert der fontSettings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FontSettings }
     *     
     */
    public void setFontSettings(FontSettings value) {
        this.fontSettings = value;
    }



}
