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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Query definition for a dialog result list
 * 
 * <p>Java-Klasse f�r DialogExpression complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DialogExpression">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}ResultListQuery">
 *       &lt;sequence>
 *         &lt;element name="Condition" type="{http://dev.docuware.com/schema/public/services/platform}DialogExpressionCondition" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AdditionalCabinets" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Operation" use="required" type="{http://dev.docuware.com/schema/public/services/platform}DialogExpressionOperation" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DialogExpression", propOrder = {
    "condition",
    "additionalCabinets"
})
public class DialogExpression
    extends ResultListQuery
 {

    @XmlElement(name = "Condition")
    protected List<DialogExpressionCondition> condition;
    @XmlElement(name = "AdditionalCabinets")
    protected List<String> additionalCabinets;
    @XmlAttribute(name = "Operation", required = true)
    protected DialogExpressionOperation operation;

    /**
     * Gets the value of the condition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the condition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DialogExpressionCondition }
     * 
     * 
     */
    public List<DialogExpressionCondition> getCondition() {
        if (condition == null) {
            condition = new ArrayList<DialogExpressionCondition>();
        }
        return this.condition;
    }

    /**
     * Gets the value of the additionalCabinets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalCabinets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalCabinets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAdditionalCabinets() {
        if (additionalCabinets == null) {
            additionalCabinets = new ArrayList<String>();
        }
        return this.additionalCabinets;
    }

    /**
     * Ruft den Wert der operation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DialogExpressionOperation }
     *     
     */
    public DialogExpressionOperation getOperation() {
        return operation;
    }

    /**
     * Legt den Wert der operation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DialogExpressionOperation }
     *     
     */
    public void setOperation(DialogExpressionOperation value) {
        this.operation = value;
    }



}
