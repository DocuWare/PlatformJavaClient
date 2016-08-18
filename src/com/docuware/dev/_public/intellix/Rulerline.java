//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.08.18 um 09:47:39 AM CEST 
//


package com.docuware.dev._public.intellix;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r Rulerline complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Rulerline">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.docuware.com/public/intellix}RectangleBase">
 *       &lt;attribute name="lineWidth" type="{http://dev.docuware.com/public/intellix}DistanceType" default="0" />
 *       &lt;attribute name="style" type="{http://dev.docuware.com/public/intellix}LineStyle" default="none" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rulerline")
public class Rulerline
    extends RectangleBase
 {

    @XmlAttribute(name = "lineWidth")
    protected Integer lineWidth;
    @XmlAttribute(name = "style")
    protected LineStyle style;

    /**
     * Ruft den Wert der lineWidth-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getLineWidth() {
        if (lineWidth == null) {
            return  0;
        } else {
            return lineWidth;
        }
    }

    /**
     * Legt den Wert der lineWidth-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLineWidth(Integer value) {
        this.lineWidth = value;
    }

    /**
     * Ruft den Wert der style-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LineStyle }
     *     
     */
    public LineStyle getStyle() {
        if (style == null) {
            return LineStyle.NONE;
        } else {
            return style;
        }
    }

    /**
     * Legt den Wert der style-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LineStyle }
     *     
     */
    public void setStyle(LineStyle value) {
        this.style = value;
    }



}
