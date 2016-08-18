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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * A line is a sequence of words.
 * 
 * <p>Java-Klasse f�r Line complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Line">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.docuware.com/public/intellix}RectangleBase">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="Sp" type="{http://dev.docuware.com/public/intellix}Space"/>
 *           &lt;element name="Wd" type="{http://dev.docuware.com/public/intellix}Word"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://dev.docuware.com/public/intellix}FontDescriptionAttributes"/>
 *       &lt;attribute name="BaseLine" type="{http://dev.docuware.com/public/intellix}DistanceType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Line", propOrder = {
    "spOrWd"
})
public class Line
    extends RectangleBase
 {

    @XmlElements({
        @XmlElement(name = "Sp", type = Space.class),
        @XmlElement(name = "Wd", type = Word.class)
    })
    protected List<Object> spOrWd;
    @XmlAttribute(name = "BaseLine")
    protected Integer baseLine;
    @XmlAttribute(name = "bold")
    protected Boolean bold;
    @XmlAttribute(name = "fontSize")
    protected Integer fontSize;

    /**
     * Gets the value of the spOrWd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spOrWd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpOrWd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Space }
     * {@link Word }
     * 
     * 
     */
    public List<Object> getSpOrWd() {
        if (spOrWd == null) {
            spOrWd = new ArrayList<Object>();
        }
        return this.spOrWd;
    }

    /**
     * Ruft den Wert der baseLine-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBaseLine() {
        return baseLine;
    }

    /**
     * Legt den Wert der baseLine-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBaseLine(Integer value) {
        this.baseLine = value;
    }

    /**
     * Ruft den Wert der bold-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBold() {
        return bold;
    }

    /**
     * Legt den Wert der bold-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBold(Boolean value) {
        this.bold = value;
    }

    /**
     * Ruft den Wert der fontSize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFontSize() {
        return fontSize;
    }

    /**
     * Legt den Wert der fontSize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFontSize(Integer value) {
        this.fontSize = value;
    }



}
