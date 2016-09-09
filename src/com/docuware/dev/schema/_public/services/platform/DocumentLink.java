

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;
import com.docuware.dev.schema._public.services.platform.DocumentsQueryResult;
import com.docuware.dev.schema._public.services.platform.ResultListQuery;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import com.docuware.dev.schema._public.services.platform.Dialog;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.schema._public.services.Links;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentLink", propOrder = {
"proxy",
    "links"
})
public class DocumentLink  implements IRelationsWithProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services")
    protected Links links;
    @XmlAttribute(name = "Id", required = true)
    protected String id;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "TargetFileCabinet", required = true)
    protected String targetFileCabinet;
    @XmlAttribute(name = "TargetResultList", required = true)
    protected String targetResultList;

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links value) {
        this.links = value;
    }

    /**Identity of the document link*/
    public String getId() {
        return id;
    }

    /**Identity of the document link*/
    public void setId(String value) {
        this.id = value;
    }

    /**Name of the document link*/
    public String getName() {
        return name;
    }

    /**Name of the document link*/
    public void setName(String value) {
        this.name = value;
    }

    /**File cabinet that the document is linked to*/
    public String getTargetFileCabinet() {
        return targetFileCabinet;
    }

    /**File cabinet that the document is linked to*/
    public void setTargetFileCabinet(String value) {
        this.targetFileCabinet = value;
    }

    /**Identity of the result list that will be used to show the linked documents*/
    public String getTargetResultList() {
        return targetResultList;
    }

    /**Identity of the result list that will be used to show the linked documents*/
    public void setTargetResultList(String value) {
        this.targetResultList = value;
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
    * Gets the Uri of the Link for the relation "Result".
    * Returns the Uri of the Link for the relation "Result", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getResultRelationLink() {
        return MethodInvocation.getLink(this, links, "result");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Result".
    */
    public DocumentsQueryResult getDocumentsQueryResultFromResultRelation() {
        return MethodInvocation.<DocumentsQueryResult>get(this, links, "result", DocumentsQueryResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Result" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentsQueryResult>> getDocumentsQueryResultFromResultRelationAsync() {
        return MethodInvocation.<DocumentsQueryResult>getAsync(this, links, "result", DocumentsQueryResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Result" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentsQueryResult>> getDocumentsQueryResultFromResultRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DocumentsQueryResult>getAsync(this, links, "result", DocumentsQueryResult.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Result".
    */
    public DocumentsQueryResult postToResultRelationForDocumentsQueryResult(ResultListQuery data) {
        return MethodInvocation.<DocumentsQueryResult, ResultListQuery> post(this, links, "result", DocumentsQueryResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ResultListQuery"), ResultListQuery.class, null, data), "application/vnd.docuware.platform.resultlistquery+xml", "application/vnd.docuware.platform.documents+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Result" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentsQueryResult>> postToResultRelationForDocumentsQueryResultAsync(ResultListQuery data) {
        return MethodInvocation.<DocumentsQueryResult, ResultListQuery >postAsync(this, links, "result", DocumentsQueryResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ResultListQuery"), ResultListQuery.class, null, data), "application/vnd.docuware.platform.resultlistquery+xml", "application/vnd.docuware.platform.documents+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Result" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentsQueryResult>> postToResultRelationForDocumentsQueryResultAsync(CancellationToken ct, ResultListQuery data) {
        return MethodInvocation.<DocumentsQueryResult, ResultListQuery >postAsync(this, links, "result", DocumentsQueryResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ResultListQuery"), ResultListQuery.class, null, data), "application/vnd.docuware.platform.resultlistquery+xml", "application/vnd.docuware.platform.documents+xml", ct);
    }

    /**
    * Gets the Uri of the Link for the relation "ResultDialog".
    * Returns the Uri of the Link for the relation "ResultDialog", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getResultDialogRelationLink() {
        return MethodInvocation.getLink(this, links, "resultDialog");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "ResultDialog".
    */
    public Dialog getDialogFromResultDialogRelation() {
        return MethodInvocation.<Dialog>get(this, links, "resultDialog", Dialog.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "ResultDialog" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Dialog>> getDialogFromResultDialogRelationAsync() {
        return MethodInvocation.<Dialog>getAsync(this, links, "resultDialog", Dialog.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "ResultDialog" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Dialog>> getDialogFromResultDialogRelationAsync(CancellationToken ct) {
        return MethodInvocation.<Dialog>getAsync(this, links, "resultDialog", Dialog.class, ct);
    }



}
