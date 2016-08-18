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
import com.docuware.dev.schema._public.services.platform.WordSearchResult;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.schema._public.services.Links;


/**
 * Define a a set of words and locations where they are found in a section
 * 
 * <p>Java-Klasse f�r WordSearchResult complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="WordSearchResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Search" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PageHits" type="{http://dev.docuware.com/schema/public/services/platform}PageHits"/>
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
@XmlType(name = "WordSearchResult", propOrder = {
"proxy",
    "search",
    "pageHits",
    "links"
})
public class WordSearchResult  implements IRelationsWithProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Search", required = true)
    protected String search;
    @XmlElement(name = "PageHits", required = true)
    protected PageHits pageHits;
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

    public WordSearchResult getWordSearchResultFromNextRelation() {
        return MethodInvocation.<WordSearchResult>get(this, links, "next", WordSearchResult.class);
    }

    public Future<DeserializedHttpResponseGen<WordSearchResult>> getWordSearchResultFromNextRelationAsync() {
        return MethodInvocation.<WordSearchResult>getAsync(this, links, "next", WordSearchResult.class);
    }

    public Future<DeserializedHttpResponseGen<WordSearchResult>> getWordSearchResultFromNextRelationAsync(CancellationToken ct) {
        return MethodInvocation.<WordSearchResult>getAsync(this, links, "next", WordSearchResult.class, ct);
    }



}
