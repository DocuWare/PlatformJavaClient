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
import com.docuware.dev.schema._public.services.platform.AdhocRenderingFile;
import com.docuware.dev.schema._public.services.platform.AdhocRenderingQuery;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.schema._public.services.Links;
import com.docuware.dev.settings.common.KeyValuePairs;


/**
 * Main class for managing adhoc rendering file.
 * 
 * <p>Java-Klasse f�r AdhocRenderingFile complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="AdhocRenderingFile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MetaData" type="{http://dev.docuware.com/settings/common}KeyValuePairs"/>
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services/platform}Pages" minOccurs="0"/>
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PageCount" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdhocRenderingFile", propOrder = {
"proxy",
    "metaData",
    "pages",
    "links"
})
public class AdhocRenderingFile  implements IRelationsWithProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "MetaData", required = true)
    protected KeyValuePairs metaData;
    @XmlElement(name = "Pages")
    protected Pages pages;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;
    @XmlAttribute(name = "Id", required = true)
    protected String id;
    @XmlAttribute(name = "PageCount", required = true)
    protected int pageCount;

    /**
     * Ruft den Wert der metaData-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePairs }
     *     
     */
    public KeyValuePairs getMetaData() {
        return metaData;
    }

    /**
     * Legt den Wert der metaData-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePairs }
     *     
     */
    public void setMetaData(KeyValuePairs value) {
        this.metaData = value;
    }

    /**
     * Gets the pages of this file up to a server defined limit.
     * 
     * @return
     *     possible object is
     *     {@link Pages }
     *     
     */
    public Pages getPages() {
        return pages;
    }

    /**
     * Legt den Wert der pages-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Pages }
     *     
     */
    public void setPages(Pages value) {
        this.pages = value;
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
     * Ruft den Wert der pageCount-Eigenschaft ab.
     * 
     */
    public int getPageCount() {
        return pageCount;
    }

    /**
     * Legt den Wert der pageCount-Eigenschaft fest.
     * 
     */
    public void setPageCount(int value) {
        this.pageCount = value;
    }


	/**
	* Gets the proxy.
	* 
	* @return	The proxy
	*/
    public HttpClientProxy getProxy() {
	return this.proxy;
    }


	/**
	* Sets the HTTP Communication Proxy which is used in futher HTTP communication.
	* 
	* @param proxy	The new proxy
	*/
    public void setProxy(HttpClientProxy proxy) {
	this.proxy = proxy;
    if ((pages != null)) {
        pages.setProxy(proxy);
    }
    }


	/**
	* Gets the base URI of the specified relations instance.
	* 
	* @return	The base URI of the specified relations instance.
	*/
    public URI getBaseUri() {
	return RelationsWithProxyExtensions.getBaseUri(this);
    }


	/**
	* Gets the link by its name.
	* 
	* @param relationName	Name of the relation
	* @return	The link, if it exists; null otherwise.
	*/
    public Link getLink(String relationName) {
	return RelationExtension.getLink(this, relationName);
    }


	/**
	* Gets the URI of the relation specified by the name.
	* 
	* @param relationName	Name of the relation
	* @return	The link, if it exists; null otherwise.
	*/
    public String getRelationUri(String relationName) {
	return RelationExtension.getRelationUri(this, relationName);
    }


	/**
	* Gets the URI of the relation specified by the name.
	* 
	* @param relationName	Name of the relation
	* @return	The link, if it exists.
	* @throws	RuntimeException: The specified Link is not found
	*/
    public String getRelationUriOrThrow(String relationName) {
	return RelationExtension.getRelationUriOrThrow(this, relationName);
    }


	/**
	* Determines whether the specified link exists.
	* 
	* @param relationName	Name of the relation
	* @return	 True, if the specified link exists; otherwise, False.
	*/
    public boolean hasRelationUri(String relationName) {
	return RelationExtension.hasRelationUri(this, relationName);
    }

    /**
    * Gets the Uri of the Link for the relation "Self".
    * Returns the Uri of the Link for the relation "Self", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getSelfRelationLink() {
        return MethodInvocation.getLink(this, links, "self");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Self".
    */
    public AdhocRenderingFile getAdhocRenderingFileFromSelfRelation() {
        return MethodInvocation.<AdhocRenderingFile>get(this, links, "self", AdhocRenderingFile.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Self" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<AdhocRenderingFile>> getAdhocRenderingFileFromSelfRelationAsync() {
        return MethodInvocation.<AdhocRenderingFile>getAsync(this, links, "self", AdhocRenderingFile.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Self" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<AdhocRenderingFile>> getAdhocRenderingFileFromSelfRelationAsync(CancellationToken ct) {
        return MethodInvocation.<AdhocRenderingFile>getAsync(this, links, "self", AdhocRenderingFile.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Rendering".
    * Returns the Uri of the Link for the relation "Rendering", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getRenderingRelationLink() {
        return MethodInvocation.getLink(this, links, "rendering");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Rendering".
    */
    public String postToRenderingRelationForString(AdhocRenderingQuery data) {
        return MethodInvocation.<String,AdhocRenderingQuery>post(this, links, "rendering", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "AdhocRenderingQuery"), AdhocRenderingQuery.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Rendering" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> postToRenderingRelationForStringAsync(AdhocRenderingQuery data) {
        return MethodInvocation.<String, AdhocRenderingQuery >postAsync(this, links, "rendering", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "AdhocRenderingQuery"), AdhocRenderingQuery.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Rendering" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> postToRenderingRelationForStringAsync(AdhocRenderingQuery data, CancellationToken ct) {
        return MethodInvocation.<String, AdhocRenderingQuery >postAsync(this, links, "rendering", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "AdhocRenderingQuery"), AdhocRenderingQuery.class, null, data), ct);
    }



}
