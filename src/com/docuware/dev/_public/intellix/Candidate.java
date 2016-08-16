//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.08.16 um 09:04:54 AM CEST 
//


package com.docuware.dev._public.intellix;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse f�r Candidate complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Candidate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OriginalValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FoundValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="L" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="T" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="W" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="H" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Line" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Index" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Length" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;choice>
 *           &lt;element name="Decimal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *           &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *           &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *         &lt;element name="FoundWithLanguages" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CorrectLanguageTo" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ImpliesCultures" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Candidate", propOrder = {
    "type",
    "originalValue",
    "foundValue",
    "l",
    "t",
    "w",
    "h",
    "line",
    "index",
    "length",
    "decimalOrDateOrText",
    "foundWithLanguages",
    "correctLanguageTo",
    "impliesCultures"
})
public class Candidate  {

    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "OriginalValue", required = true)
    protected String originalValue;
    @XmlElement(name = "FoundValue", required = true)
    protected String foundValue;
    @XmlElement(name = "L")
    protected int l;
    @XmlElement(name = "T")
    protected int t;
    @XmlElement(name = "W")
    protected int w;
    @XmlElement(name = "H")
    protected int h;
    @XmlElement(name = "Line")
    protected int line;
    @XmlElement(name = "Index")
    protected int index;
    @XmlElement(name = "Length")
    protected int length;
    @XmlElements({
        @XmlElement(name = "Decimal", type = BigDecimal.class),
        @XmlElement(name = "Date", type = XMLGregorianCalendar.class),
        @XmlElement(name = "Text", type = String.class)
    })
    protected Object decimalOrDateOrText;
    @XmlElement(name = "FoundWithLanguages")
    protected List<String> foundWithLanguages;
    @XmlElement(name = "CorrectLanguageTo")
    protected List<String> correctLanguageTo;
    @XmlElement(name = "ImpliesCultures")
    protected List<String> impliesCultures;

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der originalValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalValue() {
        return originalValue;
    }

    /**
     * Legt den Wert der originalValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalValue(String value) {
        this.originalValue = value;
    }

    /**
     * Ruft den Wert der foundValue-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoundValue() {
        return foundValue;
    }

    /**
     * Legt den Wert der foundValue-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoundValue(String value) {
        this.foundValue = value;
    }

    /**
     * Ruft den Wert der l-Eigenschaft ab.
     * 
     */
    public int getL() {
        return l;
    }

    /**
     * Legt den Wert der l-Eigenschaft fest.
     * 
     */
    public void setL(int value) {
        this.l = value;
    }

    /**
     * Ruft den Wert der t-Eigenschaft ab.
     * 
     */
    public int getT() {
        return t;
    }

    /**
     * Legt den Wert der t-Eigenschaft fest.
     * 
     */
    public void setT(int value) {
        this.t = value;
    }

    /**
     * Ruft den Wert der w-Eigenschaft ab.
     * 
     */
    public int getW() {
        return w;
    }

    /**
     * Legt den Wert der w-Eigenschaft fest.
     * 
     */
    public void setW(int value) {
        this.w = value;
    }

    /**
     * Ruft den Wert der h-Eigenschaft ab.
     * 
     */
    public int getH() {
        return h;
    }

    /**
     * Legt den Wert der h-Eigenschaft fest.
     * 
     */
    public void setH(int value) {
        this.h = value;
    }

    /**
     * Ruft den Wert der line-Eigenschaft ab.
     * 
     */
    public int getLine() {
        return line;
    }

    /**
     * Legt den Wert der line-Eigenschaft fest.
     * 
     */
    public void setLine(int value) {
        this.line = value;
    }

    /**
     * Ruft den Wert der index-Eigenschaft ab.
     * 
     */
    public int getIndex() {
        return index;
    }

    /**
     * Legt den Wert der index-Eigenschaft fest.
     * 
     */
    public void setIndex(int value) {
        this.index = value;
    }

    /**
     * Ruft den Wert der length-Eigenschaft ab.
     * 
     */
    public int getLength() {
        return length;
    }

    /**
     * Legt den Wert der length-Eigenschaft fest.
     * 
     */
    public void setLength(int value) {
        this.length = value;
    }

    /**
     * Ruft den Wert der decimalOrDateOrText-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     {@link XMLGregorianCalendar }
     *     {@link String }
     *     
     */
    public Object getDecimalOrDateOrText() {
        return decimalOrDateOrText;
    }

    /**
     * Legt den Wert der decimalOrDateOrText-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     {@link XMLGregorianCalendar }
     *     {@link String }
     *     
     */
    public void setDecimalOrDateOrText(Object value) {
        this.decimalOrDateOrText = value;
    }

    /**
     * Gets the value of the foundWithLanguages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the foundWithLanguages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFoundWithLanguages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFoundWithLanguages() {
        if (foundWithLanguages == null) {
            foundWithLanguages = new ArrayList<String>();
        }
        return this.foundWithLanguages;
    }

    /**
     * Gets the value of the correctLanguageTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the correctLanguageTo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorrectLanguageTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCorrectLanguageTo() {
        if (correctLanguageTo == null) {
            correctLanguageTo = new ArrayList<String>();
        }
        return this.correctLanguageTo;
    }

    /**
     * Gets the value of the impliesCultures property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the impliesCultures property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImpliesCultures().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getImpliesCultures() {
        if (impliesCultures == null) {
            impliesCultures = new ArrayList<String>();
        }
        return this.impliesCultures;
    }



}
