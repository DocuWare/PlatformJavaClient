

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;
import com.docuware.dev.schema._public.services.platform.SelectListResult;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.schema._public.services.Links;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectListResult", propOrder = {
"proxy",
    "value",
    "typedValue",
    "links"
})
public class SelectListResult  implements IRelationsWithProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Value")
    protected List<String> value;
    @XmlElement(name = "TypedValue")
    protected List<DocumentIndexFieldValue> typedValue;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;

    /**ArrayList is required for the XML-Marshalling */
    public void setValue(ArrayList<String> value) {
        value=value;
    }

    /**Select list values.*/
    public List<String> getValue() {
        if (value == null) {
            value = new ArrayList<String>();
        }
        return this.value;
    }

    /**ArrayList is required for the XML-Marshalling */
    public void setTypedValue(ArrayList<DocumentIndexFieldValue> value) {
        typedValue=value;
    }

    public List<DocumentIndexFieldValue> getTypedValue() {
        if (typedValue == null) {
            typedValue = new ArrayList<DocumentIndexFieldValue>();
        }
        return this.typedValue;
    }

    @Eagle
    public Links getLinks() {
        return links;
    }

    @Eagle
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
    * Gets the Uri of the Link for the relation "Next".
    * Returns the Uri of the Link for the relation "Next", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getNextRelationLink() {
        return MethodInvocation.getLink(this, links, "next");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Next".
    */
    public SelectListResult getSelectListResultFromNextRelation() {
        return MethodInvocation.<SelectListResult>get(this, links, "next", SelectListResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Next" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<SelectListResult>> getSelectListResultFromNextRelationAsync() {
        return MethodInvocation.<SelectListResult>getAsync(this, links, "next", SelectListResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Next" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<SelectListResult>> getSelectListResultFromNextRelationAsync(CancellationToken ct) {
        return MethodInvocation.<SelectListResult>getAsync(this, links, "next", SelectListResult.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Prev".
    * Returns the Uri of the Link for the relation "Prev", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getPrevRelationLink() {
        return MethodInvocation.getLink(this, links, "prev");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Prev".
    */
    public SelectListResult getSelectListResultFromPrevRelation() {
        return MethodInvocation.<SelectListResult>get(this, links, "prev", SelectListResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Prev" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<SelectListResult>> getSelectListResultFromPrevRelationAsync() {
        return MethodInvocation.<SelectListResult>getAsync(this, links, "prev", SelectListResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Prev" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<SelectListResult>> getSelectListResultFromPrevRelationAsync(CancellationToken ct) {
        return MethodInvocation.<SelectListResult>getAsync(this, links, "prev", SelectListResult.class, ct);
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
    public SelectListResult getSelectListResultFromSelfRelation() {
        return MethodInvocation.<SelectListResult>get(this, links, "self", SelectListResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Self" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<SelectListResult>> getSelectListResultFromSelfRelationAsync() {
        return MethodInvocation.<SelectListResult>getAsync(this, links, "self", SelectListResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Self" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<SelectListResult>> getSelectListResultFromSelfRelationAsync(CancellationToken ct) {
        return MethodInvocation.<SelectListResult>getAsync(this, links, "self", SelectListResult.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "First".
    * Returns the Uri of the Link for the relation "First", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getFirstRelationLink() {
        return MethodInvocation.getLink(this, links, "first");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "First".
    */
    public SelectListResult getSelectListResultFromFirstRelation() {
        return MethodInvocation.<SelectListResult>get(this, links, "first", SelectListResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "First" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<SelectListResult>> getSelectListResultFromFirstRelationAsync() {
        return MethodInvocation.<SelectListResult>getAsync(this, links, "first", SelectListResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "First" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<SelectListResult>> getSelectListResultFromFirstRelationAsync(CancellationToken ct) {
        return MethodInvocation.<SelectListResult>getAsync(this, links, "first", SelectListResult.class, ct);
    }



}
