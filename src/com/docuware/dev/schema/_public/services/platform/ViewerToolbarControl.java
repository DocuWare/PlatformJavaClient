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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r ViewerToolbarControl complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ViewerToolbarControl">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Type" use="required" type="{http://dev.docuware.com/schema/public/services/platform}ToolbarControlType" />
 *       &lt;attribute name="Checked" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="State" use="required" type="{http://dev.docuware.com/schema/public/services/platform}ToolbarControlState" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewerToolbarControl")
public class ViewerToolbarControl  {

    @XmlAttribute(name = "Type", required = true)
    protected ToolbarControlType type;
    @XmlAttribute(name = "Checked", required = true)
    protected boolean checked;
    @XmlAttribute(name = "State", required = true)
    protected ToolbarControlState state;

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ToolbarControlType }
     *     
     */
    public ToolbarControlType getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ToolbarControlType }
     *     
     */
    public void setType(ToolbarControlType value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der checked-Eigenschaft ab.
     * 
     */
    public boolean isChecked() {
        return checked;
    }

    /**
     * Legt den Wert der checked-Eigenschaft fest.
     * 
     */
    public void setChecked(boolean value) {
        this.checked = value;
    }

    /**
     * Ruft den Wert der state-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ToolbarControlState }
     *     
     */
    public ToolbarControlState getState() {
        return state;
    }

    /**
     * Legt den Wert der state-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ToolbarControlState }
     *     
     */
    public void setState(ToolbarControlState value) {
        this.state = value;
    }



}
