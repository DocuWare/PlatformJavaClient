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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r FontSettings complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FontSettings">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Size" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Bold" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Italic" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Underline" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Strikeout" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FontSettings")
public class FontSettings  {

    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "Size", required = true)
    protected String size;
    @XmlAttribute(name = "Bold", required = true)
    protected boolean bold;
    @XmlAttribute(name = "Italic", required = true)
    protected boolean italic;
    @XmlAttribute(name = "Underline", required = true)
    protected boolean underline;
    @XmlAttribute(name = "Strikeout", required = true)
    protected boolean strikeout;

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der size-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSize() {
        return size;
    }

    /**
     * Legt den Wert der size-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSize(String value) {
        this.size = value;
    }

    /**
     * Ruft den Wert der bold-Eigenschaft ab.
     * 
     */
    public boolean isBold() {
        return bold;
    }

    /**
     * Legt den Wert der bold-Eigenschaft fest.
     * 
     */
    public void setBold(boolean value) {
        this.bold = value;
    }

    /**
     * Ruft den Wert der italic-Eigenschaft ab.
     * 
     */
    public boolean isItalic() {
        return italic;
    }

    /**
     * Legt den Wert der italic-Eigenschaft fest.
     * 
     */
    public void setItalic(boolean value) {
        this.italic = value;
    }

    /**
     * Ruft den Wert der underline-Eigenschaft ab.
     * 
     */
    public boolean isUnderline() {
        return underline;
    }

    /**
     * Legt den Wert der underline-Eigenschaft fest.
     * 
     */
    public void setUnderline(boolean value) {
        this.underline = value;
    }

    /**
     * Ruft den Wert der strikeout-Eigenschaft ab.
     * 
     */
    public boolean isStrikeout() {
        return strikeout;
    }

    /**
     * Legt den Wert der strikeout-Eigenschaft fest.
     * 
     */
    public void setStrikeout(boolean value) {
        this.strikeout = value;
    }



}
