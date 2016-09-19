

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;
import com.docuware.dev.schema._public.services.platform.Dialog;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.schema._public.services.Links;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DialogPropertiesTreeView", propOrder = {
"proxy",
    "links"
})
public class DialogPropertiesTreeView
    extends DialogProperties
 implements IRelationsWithProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;
    @XmlAttribute(name = "StoreDialogId")
    protected String storeDialogId;

    @Dolphin
    public Links getLinks() {
        return links;
    }

    @Dolphin
    public void setLinks(Links value) {
        this.links = value;
    }

    /**Id of the store dialog to be used for storing documents in the tree view.*/
    @Dolphin
    public String getStoreDialogId() {
        if (storeDialogId == null) {
            return "false";
        } else {
            return storeDialogId;
        }
    }

    /**Id of the store dialog to be used for storing documents in the tree view.*/
    @Dolphin
    public void setStoreDialogId(String value) {
        this.storeDialogId = value;
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
	super.setProxy(proxy);
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
    * Gets the Uri of the Link for the relation "StoreDialog".
    * Returns the Uri of the Link for the relation "StoreDialog", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getStoreDialogRelationLink() {
        return MethodInvocation.getLink(this, links, "storeDialog");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "StoreDialog".
    */
    public Dialog getDialogFromStoreDialogRelation() {
        return MethodInvocation.<Dialog>get(this, links, "storeDialog", Dialog.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "StoreDialog" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Dialog>> getDialogFromStoreDialogRelationAsync() {
        return MethodInvocation.<Dialog>getAsync(this, links, "storeDialog", Dialog.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "StoreDialog" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Dialog>> getDialogFromStoreDialogRelationAsync(CancellationToken ct) {
        return MethodInvocation.<Dialog>getAsync(this, links, "storeDialog", Dialog.class, ct);
    }



}
