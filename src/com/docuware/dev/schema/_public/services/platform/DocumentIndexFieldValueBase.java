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

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse f�r DocumentIndexFieldValueBase complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DocumentIndexFieldValueBase">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Int" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Decimal" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="String" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Keywords" type="{http://dev.docuware.com/schema/public/services/platform}DocumentIndexFieldKeywords"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentIndexFieldValueBase", propOrder = {
    "intOrDecimalOrString"
})
@XmlSeeAlso({
    SuggestionValue.class,
    DocumentIndexFieldValue.class,
    DocumentIndexField.class
})
public abstract class DocumentIndexFieldValueBase  {

    @XmlElements({
        @XmlElement(name = "Int", type = Long.class),
        @XmlElement(name = "Decimal", type = BigDecimal.class),
        @XmlElement(name = "String", type = String.class),
        @XmlElement(name = "Date", type = XMLGregorianCalendar.class),
        @XmlElement(name = "Keywords", type = DocumentIndexFieldKeywords.class)
    })
    protected Object intOrDecimalOrString;

    /**
     * Ruft den Wert der intOrDecimalOrString-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     {@link BigDecimal }
     *     {@link String }
     *     {@link XMLGregorianCalendar }
     *     {@link DocumentIndexFieldKeywords }
     *     
     */
    public Object getIntOrDecimalOrString() {
        return intOrDecimalOrString;
    }

    /**
     * Legt den Wert der intOrDecimalOrString-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     {@link BigDecimal }
     *     {@link String }
     *     {@link XMLGregorianCalendar }
     *     {@link DocumentIndexFieldKeywords }
     *     
     */
    public void setIntOrDecimalOrString(Object value) {
        this.intOrDecimalOrString = value;
    }



}
