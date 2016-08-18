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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r Favorites complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Favorites">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Baskets" type="{http://dev.docuware.com/schema/public/services/platform}FavoriteItems"/>
 *         &lt;element name="StoreDialogs" type="{http://dev.docuware.com/schema/public/services/platform}FavoriteItems"/>
 *         &lt;element name="SearchDialogs" type="{http://dev.docuware.com/schema/public/services/platform}FavoriteItems"/>
 *         &lt;element name="TaskLists" type="{http://dev.docuware.com/schema/public/services/platform}FavoriteItems"/>
 *         &lt;element name="MultiFCSearches" type="{http://dev.docuware.com/schema/public/services/platform}FavoriteItems"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Favorites", propOrder = {
    "baskets",
    "storeDialogs",
    "searchDialogs",
    "taskLists",
    "multiFCSearches"
})
public class Favorites  {

    @XmlElement(name = "Baskets", required = true)
    protected FavoriteItems baskets;
    @XmlElement(name = "StoreDialogs", required = true)
    protected FavoriteItems storeDialogs;
    @XmlElement(name = "SearchDialogs", required = true)
    protected FavoriteItems searchDialogs;
    @XmlElement(name = "TaskLists", required = true)
    protected FavoriteItems taskLists;
    @XmlElement(name = "MultiFCSearches", required = true)
    protected FavoriteItems multiFCSearches;

    /**
     * Ruft den Wert der baskets-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FavoriteItems }
     *     
     */
    public FavoriteItems getBaskets() {
        return baskets;
    }

    /**
     * Legt den Wert der baskets-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FavoriteItems }
     *     
     */
    public void setBaskets(FavoriteItems value) {
        this.baskets = value;
    }

    /**
     * Ruft den Wert der storeDialogs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FavoriteItems }
     *     
     */
    public FavoriteItems getStoreDialogs() {
        return storeDialogs;
    }

    /**
     * Legt den Wert der storeDialogs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FavoriteItems }
     *     
     */
    public void setStoreDialogs(FavoriteItems value) {
        this.storeDialogs = value;
    }

    /**
     * Ruft den Wert der searchDialogs-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FavoriteItems }
     *     
     */
    public FavoriteItems getSearchDialogs() {
        return searchDialogs;
    }

    /**
     * Legt den Wert der searchDialogs-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FavoriteItems }
     *     
     */
    public void setSearchDialogs(FavoriteItems value) {
        this.searchDialogs = value;
    }

    /**
     * Ruft den Wert der taskLists-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FavoriteItems }
     *     
     */
    public FavoriteItems getTaskLists() {
        return taskLists;
    }

    /**
     * Legt den Wert der taskLists-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FavoriteItems }
     *     
     */
    public void setTaskLists(FavoriteItems value) {
        this.taskLists = value;
    }

    /**
     * Ruft den Wert der multiFCSearches-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FavoriteItems }
     *     
     */
    public FavoriteItems getMultiFCSearches() {
        return multiFCSearches;
    }

    /**
     * Legt den Wert der multiFCSearches-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FavoriteItems }
     *     
     */
    public void setMultiFCSearches(FavoriteItems value) {
        this.multiFCSearches = value;
    }



}
