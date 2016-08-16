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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Define a query for searching words in phrase
 * 
 * <p>Java-Klasse f�r SearchPositionQuery complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SearchPositionQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Phrase" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="IgnoreCase" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="WholeWord" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="StartPage" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *       &lt;attribute name="StartSectionNumber" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *       &lt;attribute name="PageCount" type="{http://www.w3.org/2001/XMLSchema}int" default="1" />
 *       &lt;attribute name="Backward" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="RangeSearch" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Normalize" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchPositionQuery", propOrder = {
    "phrase"
})
public class SearchPositionQuery  {

    @XmlElement(name = "Phrase", required = true)
    protected String phrase;
    @XmlAttribute(name = "IgnoreCase")
    protected Boolean ignoreCase;
    @XmlAttribute(name = "WholeWord")
    protected Boolean wholeWord;
    @XmlAttribute(name = "StartPage")
    protected Integer startPage;
    @XmlAttribute(name = "StartSectionNumber")
    protected Integer startSectionNumber;
    @XmlAttribute(name = "PageCount")
    protected Integer pageCount;
    @XmlAttribute(name = "Backward")
    protected Boolean backward;
    @XmlAttribute(name = "RangeSearch")
    protected Boolean rangeSearch;
    @XmlAttribute(name = "Normalize")
    protected Boolean normalize;

    /**
     * Ruft den Wert der phrase-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhrase() {
        return phrase;
    }

    /**
     * Legt den Wert der phrase-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhrase(String value) {
        this.phrase = value;
    }

    /**
     * Ruft den Wert der ignoreCase-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIgnoreCase() {
        if (ignoreCase == null) {
            return true;
        } else {
            return ignoreCase;
        }
    }

    /**
     * Legt den Wert der ignoreCase-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreCase(Boolean value) {
        this.ignoreCase = value;
    }

    /**
     * Ruft den Wert der wholeWord-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isWholeWord() {
        if (wholeWord == null) {
            return false;
        } else {
            return wholeWord;
        }
    }

    /**
     * Legt den Wert der wholeWord-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWholeWord(Boolean value) {
        this.wholeWord = value;
    }

    /**
     * Ruft den Wert der startPage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getStartPage() {
        if (startPage == null) {
            return  0;
        } else {
            return startPage;
        }
    }

    /**
     * Legt den Wert der startPage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartPage(Integer value) {
        this.startPage = value;
    }

    /**
     * Ruft den Wert der startSectionNumber-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getStartSectionNumber() {
        if (startSectionNumber == null) {
            return  0;
        } else {
            return startSectionNumber;
        }
    }

    /**
     * Legt den Wert der startSectionNumber-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStartSectionNumber(Integer value) {
        this.startSectionNumber = value;
    }

    /**
     * Ruft den Wert der pageCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getPageCount() {
        if (pageCount == null) {
            return  1;
        } else {
            return pageCount;
        }
    }

    /**
     * Legt den Wert der pageCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageCount(Integer value) {
        this.pageCount = value;
    }

    /**
     * Ruft den Wert der backward-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isBackward() {
        if (backward == null) {
            return false;
        } else {
            return backward;
        }
    }

    /**
     * Legt den Wert der backward-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBackward(Boolean value) {
        this.backward = value;
    }

    /**
     * Ruft den Wert der rangeSearch-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRangeSearch() {
        if (rangeSearch == null) {
            return false;
        } else {
            return rangeSearch;
        }
    }

    /**
     * Legt den Wert der rangeSearch-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRangeSearch(Boolean value) {
        this.rangeSearch = value;
    }

    /**
     * Ruft den Wert der normalize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isNormalize() {
        if (normalize == null) {
            return false;
        } else {
            return normalize;
        }
    }

    /**
     * Legt den Wert der normalize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNormalize(Boolean value) {
        this.normalize = value;
    }



}
