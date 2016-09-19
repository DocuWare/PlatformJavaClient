

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;
import com.docuware.dev.schema._public.services.platform.Notifications;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.schema._public.services.Links;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Notifications", propOrder = {
"proxy",
    "notification",
    "links"
})
public class Notifications  implements IRelationsWithProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Notification")
    protected List<Notification> notification;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;
    @XmlAttribute(name = "Timeout")
    protected Integer timeout;

    /**ArrayList is required for the XML-Marshalling */
    public void setNotification(ArrayList<Notification> value) {
        notification=value;
    }

    /**Collection of notifications.*/
    public List<Notification> getNotification() {
        if (notification == null) {
            notification = new ArrayList<Notification>();
        }
        return this.notification;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links value) {
        this.links = value;
    }

    /**Gets or sets the notifications timeout im milliseconds. A positive value lets the server wait for notifications for the specified amount of time. A value of 0 means that the server should respond immediately. A value of -1 indicates that the server should define the timeout.*/
    public int getTimeout() {
        if (timeout == null) {
            return -1;
        } else {
            return timeout;
        }
    }

    public void setTimeout(Integer value) {
        this.timeout = value;
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
    public Notifications getNotificationsFromSelfRelation() {
        return MethodInvocation.<Notifications>get(this, links, "self", Notifications.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Self" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Notifications>> getNotificationsFromSelfRelationAsync() {
        return MethodInvocation.<Notifications>getAsync(this, links, "self", Notifications.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Self" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Notifications>> getNotificationsFromSelfRelationAsync(CancellationToken ct) {
        return MethodInvocation.<Notifications>getAsync(this, links, "self", Notifications.class, ct);
    }



}
