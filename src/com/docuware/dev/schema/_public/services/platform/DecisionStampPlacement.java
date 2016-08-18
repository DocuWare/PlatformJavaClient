//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.08.18 um 09:47:39 AM CEST 
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
 * <p>Java-Klasse f�r DecisionStampPlacement complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DecisionStampPlacement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}StampPlacement">
 *       &lt;attribute name="DecisionId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TaskId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IsController" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecisionStampPlacement")
public class DecisionStampPlacement
    extends StampPlacement
 {

    @XmlAttribute(name = "DecisionId")
    protected String decisionId;
    @XmlAttribute(name = "TaskId")
    protected String taskId;
    @XmlAttribute(name = "IsController", required = true)
    protected boolean isController;

    /**
     * Ruft den Wert der decisionId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionId() {
        return decisionId;
    }

    /**
     * Legt den Wert der decisionId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionId(String value) {
        this.decisionId = value;
    }

    /**
     * Ruft den Wert der taskId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * Legt den Wert der taskId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskId(String value) {
        this.taskId = value;
    }

    /**
     * Ruft den Wert der isController-Eigenschaft ab.
     * 
     */
    public boolean isIsController() {
        return isController;
    }

    /**
     * Legt den Wert der isController-Eigenschaft fest.
     * 
     */
    public void setIsController(boolean value) {
        this.isController = value;
    }



}
