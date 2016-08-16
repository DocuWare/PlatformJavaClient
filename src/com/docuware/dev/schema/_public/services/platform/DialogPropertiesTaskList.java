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
 * Dialog properties specific for Task lists
 * 
 * <p>Java-Klasse f�r DialogPropertiesTaskList complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DialogPropertiesTaskList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}DialogPropertiesResultList">
 *       &lt;sequence>
 *         &lt;element name="Conditions" type="{http://dev.docuware.com/schema/public/services/platform}DialogExpression"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ConditionString" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Private" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="AutoRefresh" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DialogPropertiesTaskList", propOrder = {
    "conditions"
})
public class DialogPropertiesTaskList
    extends DialogPropertiesResultList
 {

    @XmlElement(name = "Conditions", required = true)
    protected DialogExpression conditions;
    @XmlAttribute(name = "ConditionString")
    protected String conditionString;
    @XmlAttribute(name = "Private")
    protected Boolean _private;
    @XmlAttribute(name = "AutoRefresh")
    protected Boolean autoRefresh;

    /**
     * Ruft den Wert der conditions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DialogExpression }
     *     
     */
    public DialogExpression getConditions() {
        return conditions;
    }

    /**
     * Legt den Wert der conditions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DialogExpression }
     *     
     */
    public void setConditions(DialogExpression value) {
        this.conditions = value;
    }

    /**
     * Ruft den Wert der conditionString-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionString() {
        return conditionString;
    }

    /**
     * Legt den Wert der conditionString-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionString(String value) {
        this.conditionString = value;
    }

    /**
     * Ruft den Wert der private-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isPrivate() {
        if (_private == null) {
            return false;
        } else {
            return _private;
        }
    }

    /**
     * Legt den Wert der private-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrivate(Boolean value) {
        this._private = value;
    }

    /**
     * Ruft den Wert der autoRefresh-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAutoRefresh() {
        if (autoRefresh == null) {
            return true;
        } else {
            return autoRefresh;
        }
    }

    /**
     * Legt den Wert der autoRefresh-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoRefresh(Boolean value) {
        this.autoRefresh = value;
    }



}
