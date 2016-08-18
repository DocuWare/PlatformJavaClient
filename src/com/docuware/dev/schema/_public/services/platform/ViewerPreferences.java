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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r ViewerPreferences complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ViewerPreferences">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Annotations">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AnnotationTool" type="{http://dev.docuware.com/schema/public/services/platform}AnnotationToolSettings" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Toolbars">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Toolbar" type="{http://dev.docuware.com/schema/public/services/platform}ViewerToolbar" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LeftToolbarState" use="required" type="{http://dev.docuware.com/schema/public/services/platform}ToolbarVisibility" />
 *       &lt;attribute name="RightToolbarState" use="required" type="{http://dev.docuware.com/schema/public/services/platform}ToolbarVisibility" />
 *       &lt;attribute name="ExpandStatusbar" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewerPreferences", propOrder = {
    "annotations",
    "toolbars"
})
public class ViewerPreferences  {

    @XmlElement(name = "Annotations", required = true)
    protected ViewerPreferences.Annotations annotations;
    @XmlElement(name = "Toolbars", required = true)
    protected ViewerPreferences.Toolbars toolbars;
    @XmlAttribute(name = "Id", required = true)
    protected String id;
    @XmlAttribute(name = "LeftToolbarState", required = true)
    protected ToolbarVisibility leftToolbarState;
    @XmlAttribute(name = "RightToolbarState", required = true)
    protected ToolbarVisibility rightToolbarState;
    @XmlAttribute(name = "ExpandStatusbar", required = true)
    protected boolean expandStatusbar;

    /**
     * Ruft den Wert der annotations-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ViewerPreferences.Annotations }
     *     
     */
    public ViewerPreferences.Annotations getAnnotations() {
        return annotations;
    }

    /**
     * Legt den Wert der annotations-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewerPreferences.Annotations }
     *     
     */
    public void setAnnotations(ViewerPreferences.Annotations value) {
        this.annotations = value;
    }

    /**
     * Ruft den Wert der toolbars-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ViewerPreferences.Toolbars }
     *     
     */
    public ViewerPreferences.Toolbars getToolbars() {
        return toolbars;
    }

    /**
     * Legt den Wert der toolbars-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewerPreferences.Toolbars }
     *     
     */
    public void setToolbars(ViewerPreferences.Toolbars value) {
        this.toolbars = value;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der leftToolbarState-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ToolbarVisibility }
     *     
     */
    public ToolbarVisibility getLeftToolbarState() {
        return leftToolbarState;
    }

    /**
     * Legt den Wert der leftToolbarState-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ToolbarVisibility }
     *     
     */
    public void setLeftToolbarState(ToolbarVisibility value) {
        this.leftToolbarState = value;
    }

    /**
     * Ruft den Wert der rightToolbarState-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ToolbarVisibility }
     *     
     */
    public ToolbarVisibility getRightToolbarState() {
        return rightToolbarState;
    }

    /**
     * Legt den Wert der rightToolbarState-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ToolbarVisibility }
     *     
     */
    public void setRightToolbarState(ToolbarVisibility value) {
        this.rightToolbarState = value;
    }

    /**
     * Ruft den Wert der expandStatusbar-Eigenschaft ab.
     * 
     */
    public boolean isExpandStatusbar() {
        return expandStatusbar;
    }

    /**
     * Legt den Wert der expandStatusbar-Eigenschaft fest.
     * 
     */
    public void setExpandStatusbar(boolean value) {
        this.expandStatusbar = value;
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
     *         &lt;element name="AnnotationTool" type="{http://dev.docuware.com/schema/public/services/platform}AnnotationToolSettings" maxOccurs="unbounded" minOccurs="0"/>
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
        "annotationTool"
    })
    public static class Annotations {

        @XmlElement(name = "AnnotationTool")
        protected List<AnnotationToolSettings> annotationTool;

        /**
         * Gets the value of the annotationTool property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the annotationTool property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAnnotationTool().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AnnotationToolSettings }
         * 
         * 
         */
        public List<AnnotationToolSettings> getAnnotationTool() {
            if (annotationTool == null) {
                annotationTool = new ArrayList<AnnotationToolSettings>();
            }
            return this.annotationTool;
        }

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
     *         &lt;element name="Toolbar" type="{http://dev.docuware.com/schema/public/services/platform}ViewerToolbar" maxOccurs="unbounded" minOccurs="0"/>
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
        "toolbar"
    })
    public static class Toolbars {

        @XmlElement(name = "Toolbar")
        protected List<ViewerToolbar> toolbar;

        /**
         * Gets the value of the toolbar property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the toolbar property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getToolbar().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ViewerToolbar }
         * 
         * 
         */
        public List<ViewerToolbar> getToolbar() {
            if (toolbar == null) {
                toolbar = new ArrayList<ViewerToolbar>();
            }
            return this.toolbar;
        }

    }



}
