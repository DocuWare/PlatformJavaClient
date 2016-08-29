

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;
import com.docuware.dev.schema._public.services.platform.UploadedFileChunk;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.schema._public.services.Links;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UploadedFileChunk", propOrder = {
"proxy",
    "links"
})
public class UploadedFileChunk  implements IRelationsWithProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;
    @XmlAttribute(name = "Finished")
    protected Boolean finished;
    @XmlAttribute(name = "LastChunkId")
    protected String lastChunkId;
    @XmlAttribute(name = "BytesWritten")
    protected Long bytesWritten;

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links value) {
        this.links = value;
    }

    /**Indicates that the last chunk has been uploaded.*/
    public boolean isFinished() {
        if (finished == null) {
            return false;
        } else {
            return finished;
        }
    }

    /**Indicates that the last chunk has been uploaded.*/
    public void setFinished(Boolean value) {
        this.finished = value;
    }

    /**The id of the last uploaded chunk.*/
    public String getLastChunkId() {
        return lastChunkId;
    }

    /**The id of the last uploaded chunk.*/
    public void setLastChunkId(String value) {
        this.lastChunkId = value;
    }

    /**The number of bytes written up to now.*/
    public long getBytesWritten() {
        if (bytesWritten == null) {
            return  0L;
        } else {
            return bytesWritten;
        }
    }

    /**The number of bytes written up to now.*/
    public void setBytesWritten(Long value) {
        this.bytesWritten = value;
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
    public UploadedFileChunk getUploadedFileChunkFromNextRelation() {
        return MethodInvocation.<UploadedFileChunk>get(this, links, "next", UploadedFileChunk.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Next" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<UploadedFileChunk>> getUploadedFileChunkFromNextRelationAsync() {
        return MethodInvocation.<UploadedFileChunk>getAsync(this, links, "next", UploadedFileChunk.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Next" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<UploadedFileChunk>> getUploadedFileChunkFromNextRelationAsync(CancellationToken ct) {
        return MethodInvocation.<UploadedFileChunk>getAsync(this, links, "next", UploadedFileChunk.class, ct);
    }



}
