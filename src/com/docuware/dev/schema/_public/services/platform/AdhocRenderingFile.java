

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;
import com.docuware.dev.schema._public.services.platform.AdhocRenderingFile;
import java.io.InputStream;
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

    /**Gets the meta data for the file. This usually contains the entries from the user dictionary of a PDF file or the meta data settings from a MS word file.*/
    public KeyValuePairs getMetaData() {
        return metaData;
    }

    public void setMetaData(KeyValuePairs value) {
        this.metaData = value;
    }

    /**Gets the pages of this file up to a server defined limit.*/
    public Pages getPages() {
        return pages;
    }

    /**Gets the pages of this file up to a server defined limit.*/
    public void setPages(Pages value) {
        this.pages = value;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links value) {
        this.links = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

    /**Gets the number of pages of this file.*/
    public int getPageCount() {
        return pageCount;
    }

    /**Gets the number of pages of this file.*/
    public void setPageCount(int value) {
        this.pageCount = value;
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
    if ((pages != null)) {
        pages.setProxy(proxy);
    }
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
    public CompletableFuture<DeserializedHttpResponseGen<AdhocRenderingFile>> getAdhocRenderingFileFromSelfRelationAsync() {
        return MethodInvocation.<AdhocRenderingFile>getAsync(this, links, "self", AdhocRenderingFile.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Self" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<AdhocRenderingFile>> getAdhocRenderingFileFromSelfRelationAsync(CancellationToken ct) {
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
    public InputStream postToRenderingRelationForInputStream(AdhocRenderingQuery data) {
        return MethodInvocation.<InputStream, AdhocRenderingQuery> post(this, links, "rendering", InputStream.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "AdhocRenderingQuery"), AdhocRenderingQuery.class, null, data), "application/vnd.docuware.platform.adhocrenderingquery+xml", "application/xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Rendering" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> postToRenderingRelationForInputStreamAsync(AdhocRenderingQuery data) {
        return MethodInvocation.<InputStream, AdhocRenderingQuery >postAsync(this, links, "rendering", InputStream.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "AdhocRenderingQuery"), AdhocRenderingQuery.class, null, data), "application/vnd.docuware.platform.adhocrenderingquery+xml", "application/xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Rendering" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> postToRenderingRelationForInputStreamAsync(CancellationToken ct, AdhocRenderingQuery data) {
        return MethodInvocation.<InputStream, AdhocRenderingQuery >postAsync(this, links, "rendering", InputStream.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "AdhocRenderingQuery"), AdhocRenderingQuery.class, null, data), "application/vnd.docuware.platform.adhocrenderingquery+xml", "application/xml", ct);
    }



}
