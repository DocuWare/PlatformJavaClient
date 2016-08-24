

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;
import com.docuware.dev.schema._public.services.platform.Pages;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.schema._public.services.Links;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pages", propOrder = {
"proxy",
    "page",
    "links"
})
public class Pages  implements IRelationsWithProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Page")
    protected List<Page> page;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services")
    protected Links links;

    /**A collection of pages*/
    public List<Page> getPage() {
        if (page == null) {
            page = new ArrayList<Page>();
        }
        return this.page;
    }

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
	if(this.page!=null) { 
        for (int i = 0; (i < this.page.size()); i = (i + 1)) {
            this.page.get(i).setProxy(proxy);
        }
	}
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
    * Gets the Uri of the Link for the relation "NextBlock".
    * Returns the Uri of the Link for the relation "NextBlock", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getNextBlockRelationLink() {
        return MethodInvocation.getLink(this, links, "nextBlock");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "NextBlock".
    */
    public Pages getPagesFromNextBlockRelation() {
        return MethodInvocation.<Pages>get(this, links, "nextBlock", Pages.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "NextBlock" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Pages>> getPagesFromNextBlockRelationAsync() {
        return MethodInvocation.<Pages>getAsync(this, links, "nextBlock", Pages.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "NextBlock" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Pages>> getPagesFromNextBlockRelationAsync(CancellationToken ct) {
        return MethodInvocation.<Pages>getAsync(this, links, "nextBlock", Pages.class, ct);
    }



}
