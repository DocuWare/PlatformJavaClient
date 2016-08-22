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
import com.docuware.dev.schema._public.services.platform.StampPlacement;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import com.docuware.dev.schema._public.services.platform.DialogExpression;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.schema._public.services.Links;


/**
 * <p>Java-Klasse f�r ServiceDescriptionTests complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ServiceDescriptionTests">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
@XmlType(name = "ServiceDescriptionTests", propOrder = {
"proxy",
    "links"
})
public class ServiceDescriptionTests  implements IRelationsWithProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;

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
    * Gets the Uri of the Link for the relation "HtmlTestClient".
    * Returns the Uri of the Link for the relation "HtmlTestClient", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getHtmlTestClientRelationLink() {
        return MethodInvocation.getLink(this, links, "htmlTestClient");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "HtmlTestClient".
    */
    public URI getURIFromHtmlTestClientRelation() {
        return MethodInvocation.<URI>get(this, links, "htmlTestClient", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "HtmlTestClient" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromHtmlTestClientRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "htmlTestClient", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "HtmlTestClient" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromHtmlTestClientRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "htmlTestClient", URI.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "ReflectStampPlacement".
    * Returns the Uri of the Link for the relation "ReflectStampPlacement", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getReflectStampPlacementRelationLink() {
        return MethodInvocation.getLink(this, links, "reflectStampPlacement");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "ReflectStampPlacement".
    */
    public StampPlacement postToReflectStampPlacementRelationForStampPlacement(StampPlacement data) {
        return MethodInvocation.<StampPlacement,StampPlacement>post(this, links, "reflectStampPlacement", StampPlacement.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "StampPlacement"), StampPlacement.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "ReflectStampPlacement" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<StampPlacement>> postToReflectStampPlacementRelationForStampPlacementAsync(StampPlacement data) {
        return MethodInvocation.<StampPlacement, StampPlacement >postAsync(this, links, "reflectStampPlacement", StampPlacement.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "StampPlacement"), StampPlacement.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "ReflectStampPlacement" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<StampPlacement>> postToReflectStampPlacementRelationForStampPlacementAsync(StampPlacement data, CancellationToken ct) {
        return MethodInvocation.<StampPlacement, StampPlacement >postAsync(this, links, "reflectStampPlacement", StampPlacement.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "StampPlacement"), StampPlacement.class, null, data), ct);
    }

    /**
    * Gets the Uri of the Link for the relation "ReflectDialogQuery".
    * Returns the Uri of the Link for the relation "ReflectDialogQuery", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getReflectDialogQueryRelationLink() {
        return MethodInvocation.getLink(this, links, "reflectDialogQuery");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "ReflectDialogQuery".
    */
    public DialogExpression postToReflectDialogQueryRelationForDialogExpression(DialogExpression data) {
        return MethodInvocation.<DialogExpression,DialogExpression>post(this, links, "reflectDialogQuery", DialogExpression.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DialogExpression"), DialogExpression.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "ReflectDialogQuery" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DialogExpression>> postToReflectDialogQueryRelationForDialogExpressionAsync(DialogExpression data) {
        return MethodInvocation.<DialogExpression, DialogExpression >postAsync(this, links, "reflectDialogQuery", DialogExpression.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DialogExpression"), DialogExpression.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "ReflectDialogQuery" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DialogExpression>> postToReflectDialogQueryRelationForDialogExpressionAsync(DialogExpression data, CancellationToken ct) {
        return MethodInvocation.<DialogExpression, DialogExpression >postAsync(this, links, "reflectDialogQuery", DialogExpression.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DialogExpression"), DialogExpression.class, null, data), ct);
    }

    /**
    * Gets the Uri of the Link for the relation "QueryString".
    * Returns the Uri of the Link for the relation "QueryString", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getQueryStringRelationLink() {
        return MethodInvocation.getLink(this, links, "queryString");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "QueryString".
    */
    public URI getURIFromQueryStringRelation() {
        return MethodInvocation.<URI>get(this, links, "queryString", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "QueryString" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromQueryStringRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "queryString", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "QueryString" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromQueryStringRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "queryString", URI.class, ct);
    }



}
