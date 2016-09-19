

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;
import com.docuware.dev.schema._public.services.platform.BatchUpdateIndexFieldsResult;
import com.docuware.dev.schema._public.services.platform.BatchUpdateProcessData;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.schema._public.services.Links;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchUpdateIndexFieldsResult", propOrder = {
"proxy",
    "item",
    "links"
})
public class BatchUpdateIndexFieldsResult  implements IRelationsWithProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Item")
    protected List<BatchUpdateResultItem> item;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;
    @XmlAttribute(name = "SuccessCount", required = true)
    protected int successCount;

    /**ArrayList is required for the XML-Marshalling */
    public void setItem(ArrayList<BatchUpdateResultItem> value) {
        item=value;
    }

    /**List of the resulting documents and errors.*/
    public List<BatchUpdateResultItem> getItem() {
        if (item == null) {
            item = new ArrayList<BatchUpdateResultItem>();
        }
        return this.item;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links value) {
        this.links = value;
    }

    /**The number of successfull updated documents.*/
    public int getSuccessCount() {
        return successCount;
    }

    /**The number of successfull updated documents.*/
    public void setSuccessCount(int value) {
        this.successCount = value;
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
	if(this.item!=null) { 
        for (int i = 0; (i < this.item.size()); i = (i + 1)) {
            this.item.get(i).setProxy(proxy);
        }
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
    * Gets the Uri of the Link for the relation "Next".
    * Returns the Uri of the Link for the relation "Next", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getNextRelationLink() {
        return MethodInvocation.getLink(this, links, "next");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Next".
    */
    public BatchUpdateIndexFieldsResult postToNextRelationForBatchUpdateIndexFieldsResult(BatchUpdateProcessData data) {
        return MethodInvocation.<BatchUpdateIndexFieldsResult, BatchUpdateProcessData> post(this, links, "next", BatchUpdateIndexFieldsResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "BatchUpdateProcessData"), BatchUpdateProcessData.class, null, data), "application/vnd.docuware.platform.batchupdateprocessdata+xml", "application/vnd.docuware.platform.batchupdateindexfieldsresult+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Next" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<BatchUpdateIndexFieldsResult>> postToNextRelationForBatchUpdateIndexFieldsResultAsync(BatchUpdateProcessData data) {
        return MethodInvocation.<BatchUpdateIndexFieldsResult, BatchUpdateProcessData >postAsync(this, links, "next", BatchUpdateIndexFieldsResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "BatchUpdateProcessData"), BatchUpdateProcessData.class, null, data), "application/vnd.docuware.platform.batchupdateprocessdata+xml", "application/vnd.docuware.platform.batchupdateindexfieldsresult+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Next" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<BatchUpdateIndexFieldsResult>> postToNextRelationForBatchUpdateIndexFieldsResultAsync(CancellationToken ct, BatchUpdateProcessData data) {
        return MethodInvocation.<BatchUpdateIndexFieldsResult, BatchUpdateProcessData >postAsync(this, links, "next", BatchUpdateIndexFieldsResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "BatchUpdateProcessData"), BatchUpdateProcessData.class, null, data), "application/vnd.docuware.platform.batchupdateprocessdata+xml", "application/vnd.docuware.platform.batchupdateindexfieldsresult+xml", ct);
    }



}
