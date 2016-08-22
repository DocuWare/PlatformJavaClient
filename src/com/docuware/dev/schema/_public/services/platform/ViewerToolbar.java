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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r ViewerToolbar complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ViewerToolbar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Controls" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ToolbarControl" type="{http://dev.docuware.com/schema/public/services/platform}ViewerToolbarControl" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" use="required" type="{http://dev.docuware.com/schema/public/services/platform}ViewerToolbarType" />
 *       &lt;attribute name="Position" use="required" type="{http://dev.docuware.com/schema/public/services/platform}ToolbarPosition" />
 *       &lt;attribute name="Visibility" use="required" type="{http://dev.docuware.com/schema/public/services/platform}ToolbarVisibility" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewerToolbar", propOrder = {
    "controls"
})
public class ViewerToolbar  {

    @XmlElement(name = "Controls")
    protected ViewerToolbar.Controls controls;
    @XmlAttribute(name = "Type", required = true)
    protected ViewerToolbarType type;
    @XmlAttribute(name = "Position", required = true)
    protected ToolbarPosition position;
    @XmlAttribute(name = "Visibility", required = true)
    protected ToolbarVisibility visibility;

    /**
     * Ruft den Wert der controls-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ViewerToolbar.Controls }
     *     
     */
    public ViewerToolbar.Controls getControls() {
        return controls;
    }

    /**
     * Legt den Wert der controls-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewerToolbar.Controls }
     *     
     */
    public void setControls(ViewerToolbar.Controls value) {
        this.controls = value;
    }

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ViewerToolbarType }
     *     
     */
    public ViewerToolbarType getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewerToolbarType }
     *     
     */
    public void setType(ViewerToolbarType value) {
        this.type = value;
    }

    /**
     * Ruft den Wert der position-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ToolbarPosition }
     *     
     */
    public ToolbarPosition getPosition() {
        return position;
    }

    /**
     * Legt den Wert der position-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ToolbarPosition }
     *     
     */
    public void setPosition(ToolbarPosition value) {
        this.position = value;
    }

    /**
     * Ruft den Wert der visibility-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ToolbarVisibility }
     *     
     */
    public ToolbarVisibility getVisibility() {
        return visibility;
    }

    /**
     * Legt den Wert der visibility-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ToolbarVisibility }
     *     
     */
    public void setVisibility(ToolbarVisibility value) {
        this.visibility = value;
    }


    /**
     * <p>Java-Klasse f�r anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ToolbarControl" type="{http://dev.docuware.com/schema/public/services/platform}ViewerToolbarControl" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "toolbarControl"
    })
    public static class Controls {

        @XmlElement(name = "ToolbarControl")
        protected List<ViewerToolbarControl> toolbarControl;

        /**
         * Gets the value of the toolbarControl property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the toolbarControl property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getToolbarControl().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ViewerToolbarControl }
         * 
         * 
         */
        public List<ViewerToolbarControl> getToolbarControl() {
            if (toolbarControl == null) {
                toolbarControl = new ArrayList<ViewerToolbarControl>();
            }
            return this.toolbarControl;
        }

    }



}
