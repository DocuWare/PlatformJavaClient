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
import com.docuware.dev.schema._public.services.platform.DocumentWordSearchResult;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.schema._public.services.Links;


/**
 * <p>Java-Klasse f�r DocumentWordSearchResult complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DocumentWordSearchResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Search" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SectionHits" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PageHits" type="{http://dev.docuware.com/schema/public/services/platform}PageHits"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="SectionId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentWordSearchResult", propOrder = {
"proxy",
    "search",
    "sectionHits",
    "links"
})
public class DocumentWordSearchResult  implements IRelationsWithProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Search", required = true)
    protected String search;
    @XmlElement(name = "SectionHits")
    protected List<DocumentWordSearchResult.SectionHits> sectionHits;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;

    /**
     * Ruft den Wert der search-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearch() {
        return search;
    }

    /**
     * Legt den Wert der search-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearch(String value) {
        this.search = value;
    }

    /**
     * Gets the value of the sectionHits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sectionHits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSectionHits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentWordSearchResult.SectionHits }
     * 
     * 
     */
    public List<DocumentWordSearchResult.SectionHits> getSectionHits() {
        if (sectionHits == null) {
            sectionHits = new ArrayList<DocumentWordSearchResult.SectionHits>();
        }
        return this.sectionHits;
    }

    /**
     * Ruft den Wert der links-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Links }
     *     
     */
    public Links getLinks() {
        return links;
    }

    /**
     * Legt den Wert der links-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Links }
     *     
     */
    public void setLinks(Links value) {
        this.links = value;
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
     *         &lt;element name="PageHits" type="{http://dev.docuware.com/schema/public/services/platform}PageHits"/>
     *       &lt;/sequence>
     *       &lt;attribute name="SectionId" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "pageHits"
    })
    public static class SectionHits {

        @XmlElement(name = "PageHits", required = true)
        protected PageHits pageHits;
        @XmlAttribute(name = "SectionId")
        protected String sectionId;

        /**
         * Ruft den Wert der pageHits-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link PageHits }
         *     
         */
        public PageHits getPageHits() {
            return pageHits;
        }

        /**
         * Legt den Wert der pageHits-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link PageHits }
         *     
         */
        public void setPageHits(PageHits value) {
            this.pageHits = value;
        }

        /**
         * Ruft den Wert der sectionId-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSectionId() {
            return sectionId;
        }

        /**
         * Legt den Wert der sectionId-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSectionId(String value) {
            this.sectionId = value;
        }

    }

    public HttpClientProxy getProxy() {
	return this.proxy;
    }

    public void setProxy(HttpClientProxy proxy) {
	this.proxy = proxy;
    }

    public URI getBaseUri() {
	return RelationsWithProxyExtensions.getBaseUri(this);
    }

    public Link getLink(String relationName) {
	return RelationExtension.getLink(this, relationName);
    }

    public String getRelationUri(String relationName) {
	return RelationExtension.getRelationUri(this, relationName);
    }

    public String getRelationUriOrThrow(String relationName) {
	return RelationExtension.getRelationUriOrThrow(this, relationName);
    }

    public boolean hasRelationUri(String relationName) {
	return RelationExtension.hasRelationUri(this, relationName);
    }

    public URI getNextRelationLink() {
        return MethodInvocation.getLink(this, links, "next");
    }

    public DocumentWordSearchResult getDocumentWordSearchResultFromNextRelation() {
        return MethodInvocation.<DocumentWordSearchResult>get(this, links, "next", DocumentWordSearchResult.class);
    }

    public Future<DeserializedHttpResponseGen<DocumentWordSearchResult>> getDocumentWordSearchResultFromNextRelationAsync() {
        return MethodInvocation.<DocumentWordSearchResult>getAsync(this, links, "next", DocumentWordSearchResult.class);
    }

    public Future<DeserializedHttpResponseGen<DocumentWordSearchResult>> getDocumentWordSearchResultFromNextRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DocumentWordSearchResult>getAsync(this, links, "next", DocumentWordSearchResult.class, ct);
    }



}
