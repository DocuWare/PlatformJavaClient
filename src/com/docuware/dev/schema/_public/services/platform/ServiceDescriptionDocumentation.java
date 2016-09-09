

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;
import java.io.InputStream;
import com.docuware.dev.schema._public.services.platform.XmlSchemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.schema._public.services.Links;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDescriptionDocumentation", propOrder = {
"proxy",
    "links"
})
public class ServiceDescriptionDocumentation  implements IRelationsWithProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links value) {
        this.links = value;
    }


	/**
	* Gets the proxy.
	* 
	* @return	The proxy
	*/
    @Extension
    public HttpClientProxy getProxy() {
	return this.proxy;
    }


	/**
	* Sets the HTTP Communication Proxy which is used in futher HTTP communication.
	* 
	* @param proxy	The new proxy
	*/
    @Extension
    public void setProxy(HttpClientProxy proxy) {
	this.proxy = proxy;
    }


	/**
	* Gets the base URI of the specified relations instance.
	* 
	* @return	The base URI of the specified relations instance.
	*/
    @Extension
    public URI getBaseUri() {
	return RelationsWithProxyExtensions.getBaseUri(this);
    }


	/**
	* Gets the link by its name.
	* 
	* @param relationName	Name of the relation
	* @return	The link, if it exists; null otherwise.
	*/
    @Extension
    public Link getLink(String relationName) {
	return RelationExtension.getLink(this, relationName);
    }


	/**
	* Gets the URI of the relation specified by the name.
	* 
	* @param relationName	Name of the relation
	* @return	The link, if it exists; null otherwise.
	*/
    @Extension
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
    @Extension
    public String getRelationUriOrThrow(String relationName) {
	return RelationExtension.getRelationUriOrThrow(this, relationName);
    }


	/**
	* Determines whether the specified link exists.
	* 
	* @param relationName	Name of the relation
	* @return	 True, if the specified link exists; otherwise, False.
	*/
    @Extension
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
    public InputStream getInputStreamFromLinkModelOverviewRelation() {
        return MethodInvocation.<InputStream>get(this, links, "linkModelOverview", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "LinkModelOverview" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromLinkModelOverviewRelationAsync() {
        return MethodInvocation.<InputStream>getAsync(this, links, "linkModelOverview", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "LinkModelOverview" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromLinkModelOverviewRelationAsync(CancellationToken ct) {
        return MethodInvocation.<InputStream>getAsync(this, links, "linkModelOverview", InputStream.class, ct);
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
    public CompletableFuture<DeserializedHttpResponseGen<XmlSchemas>> getXmlSchemasFromSchemasRelationAsync() {
        return MethodInvocation.<XmlSchemas>getAsync(this, links, "schemas", XmlSchemas.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Schemas" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<XmlSchemas>> getXmlSchemasFromSchemasRelationAsync(CancellationToken ct) {
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
    public InputStream getInputStreamFromSchemaSearchRelation() {
        return MethodInvocation.<InputStream>get(this, links, "schemaSearch", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "SchemaSearch" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromSchemaSearchRelationAsync() {
        return MethodInvocation.<InputStream>getAsync(this, links, "schemaSearch", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "SchemaSearch" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromSchemaSearchRelationAsync(CancellationToken ct) {
        return MethodInvocation.<InputStream>getAsync(this, links, "schemaSearch", InputStream.class, ct);
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
    public InputStream getInputStreamFromUriTemplatesDocumentationRelation() {
        return MethodInvocation.<InputStream>get(this, links, "uriTemplatesDocumentation", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "UriTemplatesDocumentation" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromUriTemplatesDocumentationRelationAsync() {
        return MethodInvocation.<InputStream>getAsync(this, links, "uriTemplatesDocumentation", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "UriTemplatesDocumentation" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromUriTemplatesDocumentationRelationAsync(CancellationToken ct) {
        return MethodInvocation.<InputStream>getAsync(this, links, "uriTemplatesDocumentation", InputStream.class, ct);
    }



}
