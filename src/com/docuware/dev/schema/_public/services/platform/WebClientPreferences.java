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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r WebClientPreferences complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="WebClientPreferences">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}ApplicationPreferences">
 *       &lt;sequence>
 *         &lt;element name="WorkAreas" type="{http://dev.docuware.com/schema/public/services/platform}WorkAreaPreferences" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GeneralSettings" type="{http://dev.docuware.com/schema/public/services/platform}GeneralSettings"/>
 *         &lt;element name="WebClientLayout" type="{http://dev.docuware.com/schema/public/services/platform}WebClientLayout"/>
 *         &lt;element name="Favorites" type="{http://dev.docuware.com/schema/public/services/platform}Favorites"/>
 *         &lt;element name="Viewer" type="{http://dev.docuware.com/schema/public/services/platform}ViewerPreferences"/>
 *         &lt;element name="MultiFCSearches" type="{http://dev.docuware.com/schema/public/services/platform}MultiFCSearches"/>
 *         &lt;element name="LocalStorage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebClientPreferences", propOrder = {
    "workAreas",
    "generalSettings",
    "webClientLayout",
    "favorites",
    "viewer",
    "multiFCSearches",
    "localStorage"
})
public class WebClientPreferences
    extends ApplicationPreferences
 {

    @XmlElement(name = "WorkAreas")
    protected List<WorkAreaPreferences> workAreas;
    @XmlElement(name = "GeneralSettings", required = true)
    protected GeneralSettings generalSettings;
    @XmlElement(name = "WebClientLayout", required = true)
    protected WebClientLayout webClientLayout;
    @XmlElement(name = "Favorites", required = true)
    protected Favorites favorites;
    @XmlElement(name = "Viewer", required = true)
    protected ViewerPreferences viewer;
    @XmlElement(name = "MultiFCSearches", required = true)
    protected MultiFCSearches multiFCSearches;
    @XmlElement(name = "LocalStorage", required = true)
    protected String localStorage;

    /**
     * Gets the value of the workAreas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workAreas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkAreas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkAreaPreferences }
     * 
     * 
     */
    public List<WorkAreaPreferences> getWorkAreas() {
        if (workAreas == null) {
            workAreas = new ArrayList<WorkAreaPreferences>();
        }
        return this.workAreas;
    }

    /**
     * Ruft den Wert der generalSettings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GeneralSettings }
     *     
     */
    public GeneralSettings getGeneralSettings() {
        return generalSettings;
    }

    /**
     * Legt den Wert der generalSettings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralSettings }
     *     
     */
    public void setGeneralSettings(GeneralSettings value) {
        this.generalSettings = value;
    }

    /**
     * Ruft den Wert der webClientLayout-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link WebClientLayout }
     *     
     */
    public WebClientLayout getWebClientLayout() {
        return webClientLayout;
    }

    /**
     * Legt den Wert der webClientLayout-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link WebClientLayout }
     *     
     */
    public void setWebClientLayout(WebClientLayout value) {
        this.webClientLayout = value;
    }

    /**
     * Ruft den Wert der favorites-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Favorites }
     *     
     */
    public Favorites getFavorites() {
        return favorites;
    }

    /**
     * Legt den Wert der favorites-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Favorites }
     *     
     */
    public void setFavorites(Favorites value) {
        this.favorites = value;
    }

    /**
     * Ruft den Wert der viewer-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ViewerPreferences }
     *     
     */
    public ViewerPreferences getViewer() {
        return viewer;
    }

    /**
     * Legt den Wert der viewer-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ViewerPreferences }
     *     
     */
    public void setViewer(ViewerPreferences value) {
        this.viewer = value;
    }

    /**
     * Ruft den Wert der multiFCSearches-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link MultiFCSearches }
     *     
     */
    public MultiFCSearches getMultiFCSearches() {
        return multiFCSearches;
    }

    /**
     * Legt den Wert der multiFCSearches-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiFCSearches }
     *     
     */
    public void setMultiFCSearches(MultiFCSearches value) {
        this.multiFCSearches = value;
    }

    /**
     * Ruft den Wert der localStorage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalStorage() {
        return localStorage;
    }

    /**
     * Legt den Wert der localStorage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalStorage(String value) {
        this.localStorage = value;
    }



}
