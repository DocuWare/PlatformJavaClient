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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Dialog properties specific for Result List
 * 
 * <p>Java-Klasse f�r DialogPropertiesResultList complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DialogPropertiesResultList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}DialogProperties">
 *       &lt;sequence>
 *         &lt;element name="Functions" type="{http://dev.docuware.com/schema/public/services/platform}ResultDialogFunction" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ViewerDialog" type="{http://dev.docuware.com/schema/public/services/platform}ViewerDialog"/>
 *         &lt;element name="SortOrder" type="{http://dev.docuware.com/schema/public/services/platform}SortedFieldsList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DefaultListTextLetterCase" use="required" type="{http://dev.docuware.com/schema/public/services/platform}LetterCase" />
 *       &lt;attribute name="DisplayFirstDocument" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ShowCheckedOutDocumens" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DialogPropertiesResultList", propOrder = {
    "functions",
    "viewerDialog",
    "sortOrder"
})
@XmlSeeAlso({
    DialogPropertiesTaskList.class
})
public class DialogPropertiesResultList
    extends DialogProperties
 {

    @XmlElement(name = "Functions")
    protected List<ResultDialogFunction> functions;
    @XmlElement(name = "ViewerDialog", required = true)
    protected ViewerDialog viewerDialog;
    @XmlElement(name = "SortOrder")
    protected SortedFieldsList sortOrder;
    @XmlAttribute(name = "DefaultListTextLetterCase", required = true)
    protected LetterCase defaultListTextLetterCase;
    @XmlAttribute(name = "DisplayFirstDocument", required = true)
    protected boolean displayFirstDocument;
    @XmlAttribute(name = "ShowCheckedOutDocumens")
    protected Boolean showCheckedOutDocumens;

    /**
     * Gets the value of the functions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the functions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFunctions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResultDialogFunction }
     * 
     * 
     */
    public List<ResultDialogFunction> getFunctions() {
        if (functions == null) {
            functions = new ArrayList<ResultDialogFunction>();
        }
        return this.functions;
    }

    /**
     * Ruft den Wert der viewerDialog-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ViewerDialog }
     *     
     */
    public ViewerDialog getViewerDialog() {
        return viewerDialog;
    }

    /**
     * Legt den Wert der viewerDialog-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewerDialog }
     *     
     */
    public void setViewerDialog(ViewerDialog value) {
        this.viewerDialog = value;
    }

    /**
     * Ruft den Wert der sortOrder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SortedFieldsList }
     *     
     */
    public SortedFieldsList getSortOrder() {
        return sortOrder;
    }

    /**
     * Legt den Wert der sortOrder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SortedFieldsList }
     *     
     */
    public void setSortOrder(SortedFieldsList value) {
        this.sortOrder = value;
    }

    /**
     * Ruft den Wert der defaultListTextLetterCase-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LetterCase }
     *     
     */
    public LetterCase getDefaultListTextLetterCase() {
        return defaultListTextLetterCase;
    }

    /**
     * Legt den Wert der defaultListTextLetterCase-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LetterCase }
     *     
     */
    public void setDefaultListTextLetterCase(LetterCase value) {
        this.defaultListTextLetterCase = value;
    }

    /**
     * Ruft den Wert der displayFirstDocument-Eigenschaft ab.
     * 
     */
    public boolean isDisplayFirstDocument() {
        return displayFirstDocument;
    }

    /**
     * Legt den Wert der displayFirstDocument-Eigenschaft fest.
     * 
     */
    public void setDisplayFirstDocument(boolean value) {
        this.displayFirstDocument = value;
    }

    /**
     * Ruft den Wert der showCheckedOutDocumens-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowCheckedOutDocumens() {
        if (showCheckedOutDocumens == null) {
            return false;
        } else {
            return showCheckedOutDocumens;
        }
    }

    /**
     * Legt den Wert der showCheckedOutDocumens-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowCheckedOutDocumens(Boolean value) {
        this.showCheckedOutDocumens = value;
    }



}
