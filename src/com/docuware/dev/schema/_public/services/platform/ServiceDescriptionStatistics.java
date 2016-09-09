

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;
import java.io.InputStream;
import com.docuware.dev.schema._public.services.platform.CFSStatisticGeneral;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.schema._public.services.Links;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDescriptionStatistics", propOrder = {
"proxy",
    "links"
})
public class ServiceDescriptionStatistics  implements IRelationsWithProxy {
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
    * Gets the Uri of the Link for the relation "Cfs".
    * Returns the Uri of the Link for the relation "Cfs", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getCfsRelationLink() {
        return MethodInvocation.getLink(this, links, "cfs");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Cfs".
    */
    public InputStream postToCfsRelationForInputStream(CFSStatisticGeneral data) {
        return MethodInvocation.<InputStream, CFSStatisticGeneral> post(this, links, "cfs", InputStream.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "CFSStatistic"), CFSStatisticGeneral.class, null, data), "application/xml", "application/xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Cfs" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> postToCfsRelationForInputStreamAsync(CFSStatisticGeneral data) {
        return MethodInvocation.<InputStream, CFSStatisticGeneral >postAsync(this, links, "cfs", InputStream.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "CFSStatistic"), CFSStatisticGeneral.class, null, data), "application/xml", "application/xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Cfs" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> postToCfsRelationForInputStreamAsync(CancellationToken ct, CFSStatisticGeneral data) {
        return MethodInvocation.<InputStream, CFSStatisticGeneral >postAsync(this, links, "cfs", InputStream.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "CFSStatistic"), CFSStatisticGeneral.class, null, data), "application/xml", "application/xml", ct);
    }



}
