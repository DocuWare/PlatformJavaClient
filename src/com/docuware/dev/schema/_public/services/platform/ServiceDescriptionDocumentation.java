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
import com.docuware.dev.schema._public.services.platform.XmlSchemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.schema._public.services.Links;


/**
 * <p>Java-Klasse f�r ServiceDescriptionDocumentation complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ServiceDescriptionDocumentation">
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
@XmlType(name = "ServiceDescriptionDocumentation", propOrder = {
"proxy",
    "links"
})
public class ServiceDescriptionDocumentation  implements IRelationsWithProxy {
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
    * Gets the Uri of the Link for the relation "LinkModelOverview".
    * Returns the Uri of the Link for the relation "LinkModelOverview", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getLinkModelOverviewRelationLink() {
        return MethodInvocation.getLink(this, links, "linkModelOverview");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "LinkModelOverview".
    */
    public URI getURIFromLinkModelOverviewRelation() {
        return MethodInvocation.<URI>get(this, links, "linkModelOverview", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "LinkModelOverview" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromLinkModelOverviewRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "linkModelOverview", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "LinkModelOverview" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromLinkModelOverviewRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "linkModelOverview", URI.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Schemas".
    * Returns the Uri of the Link for the relation "Schemas", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getSchemasRelationLink() {
        return MethodInvocation.getLink(this, links, "schemas");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Schemas".
    */
    public XmlSchemas getXmlSchemasFromSchemasRelation() {
        return MethodInvocation.<XmlSchemas>get(this, links, "schemas", XmlSchemas.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Schemas" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<XmlSchemas>> getXmlSchemasFromSchemasRelationAsync() {
        return MethodInvocation.<XmlSchemas>getAsync(this, links, "schemas", XmlSchemas.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Schemas" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<XmlSchemas>> getXmlSchemasFromSchemasRelationAsync(CancellationToken ct) {
        return MethodInvocation.<XmlSchemas>getAsync(this, links, "schemas", XmlSchemas.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "SchemaSearch".
    * Returns the Uri of the Link for the relation "SchemaSearch", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getSchemaSearchRelationLink() {
        return MethodInvocation.getLink(this, links, "schemaSearch");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "SchemaSearch".
    */
    public URI getURIFromSchemaSearchRelation() {
        return MethodInvocation.<URI>get(this, links, "schemaSearch", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "SchemaSearch" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromSchemaSearchRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "schemaSearch", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "SchemaSearch" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromSchemaSearchRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "schemaSearch", URI.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "UriTemplatesDocumentation".
    * Returns the Uri of the Link for the relation "UriTemplatesDocumentation", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getUriTemplatesDocumentationRelationLink() {
        return MethodInvocation.getLink(this, links, "uriTemplatesDocumentation");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "UriTemplatesDocumentation".
    */
    public URI getURIFromUriTemplatesDocumentationRelation() {
        return MethodInvocation.<URI>get(this, links, "uriTemplatesDocumentation", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "UriTemplatesDocumentation" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromUriTemplatesDocumentationRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "uriTemplatesDocumentation", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "UriTemplatesDocumentation" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromUriTemplatesDocumentationRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "uriTemplatesDocumentation", URI.class, ct);
    }



}
