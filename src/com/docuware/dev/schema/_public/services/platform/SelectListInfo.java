

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;
import com.docuware.dev.schema._public.services.platform.SelectListValues;
import com.docuware.dev.schema._public.services.platform.SelectListValuesQuery;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.schema._public.services.Links;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectListInfo", propOrder = {
"proxy",
    "links"
})
public class SelectListInfo  implements IRelationsWithProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;
    @XmlAttribute(name = "Guid", required = true)
    protected String guid;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Kind", required = true)
    protected SelectListKind kind;

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links value) {
        this.links = value;
    }

    /**The guid of the select list.*/
    public String getGuid() {
        return guid;
    }

    /**The guid of the select list.*/
    public void setGuid(String value) {
        this.guid = value;
    }

    /**The name of the select list.*/
    public String getName() {
        return name;
    }

    /**The name of the select list.*/
    public void setName(String value) {
        this.name = value;
    }

    /**The Kind of the select list.*/
    public SelectListKind getKind() {
        return kind;
    }

    /**The Kind of the select list.*/
    public void setKind(SelectListKind value) {
        this.kind = value;
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
    * Gets the Uri of the Link for the relation "Values".
    * Returns the Uri of the Link for the relation "Values", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getValuesRelationLink() {
        return MethodInvocation.getLink(this, links, "values");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Values".
    */
    public SelectListValues getSelectListValuesFromValuesRelation() {
        return MethodInvocation.<SelectListValues>get(this, links, "values", SelectListValues.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Values" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<SelectListValues>> getSelectListValuesFromValuesRelationAsync() {
        return MethodInvocation.<SelectListValues>getAsync(this, links, "values", SelectListValues.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Values" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<SelectListValues>> getSelectListValuesFromValuesRelationAsync(CancellationToken ct) {
        return MethodInvocation.<SelectListValues>getAsync(this, links, "values", SelectListValues.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Values".
    */
    public SelectListValues postToValuesRelationForSelectListValues(SelectListValuesQuery data) {
        return MethodInvocation.<SelectListValues, SelectListValuesQuery> post(this, links, "values", SelectListValues.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "SelectListValuesQuery"), SelectListValuesQuery.class, null, data), "application/vnd.docuware.platform.selectlistinfoquery+xml", "application/xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Values" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<SelectListValues>> postToValuesRelationForSelectListValuesAsync(SelectListValuesQuery data) {
        return MethodInvocation.<SelectListValues, SelectListValuesQuery >postAsync(this, links, "values", SelectListValues.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "SelectListValuesQuery"), SelectListValuesQuery.class, null, data), "application/vnd.docuware.platform.selectlistinfoquery+xml", "application/xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Values" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<SelectListValues>> postToValuesRelationForSelectListValuesAsync(CancellationToken ct, SelectListValuesQuery data) {
        return MethodInvocation.<SelectListValues, SelectListValuesQuery >postAsync(this, links, "values", SelectListValues.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "SelectListValuesQuery"), SelectListValuesQuery.class, null, data), "application/vnd.docuware.platform.selectlistinfoquery+xml", "application/xml", ct);
    }



}
