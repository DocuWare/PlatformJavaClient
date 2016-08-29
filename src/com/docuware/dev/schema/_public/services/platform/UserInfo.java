

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;
import com.docuware.dev.schema._public.services.platform.UserValidation;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.schema._public.services.Links;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserInfo", propOrder = {
"proxy",
    "user",
    "loginInfo",
    "links"
})
public class UserInfo  implements IRelationsWithProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "User", required = true)
    protected User user;
    @XmlElement(name = "LoginInfo", required = true)
    protected LoginInfo loginInfo;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;

    /**User details and settings*/
    public User getUser() {
        return user;
    }

    public void setUser(User value) {
        this.user = value;
    }

    /**Details about user login*/
    public LoginInfo getLoginInfo() {
        return loginInfo;
    }

    /**Details about user login*/
    public void setLoginInfo(LoginInfo value) {
        this.loginInfo = value;
    }

    @Dolphin
    public Links getLinks() {
        return links;
    }

    @Dolphin
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
    if ((user != null)) {
		user.setProxy(proxy);
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
    * Gets the Uri of the Link for the relation "Validate".
    * Returns the Uri of the Link for the relation "Validate", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getValidateRelationLink() {
        return MethodInvocation.getLink(this, links, "validate");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Validate".
    */
    public String postToValidateRelationForString(UserValidation data) {
        return MethodInvocation.<String, UserValidation> post(this, links, "validate", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "UserValidation"), UserValidation.class, null, data), "application/vnd.docuware.platform.uservalidation+xml", "text/plain");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Validate" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<String>> postToValidateRelationForStringAsync(UserValidation data) {
        return MethodInvocation.<String, UserValidation >postAsync(this, links, "validate", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "UserValidation"), UserValidation.class, null, data), "application/vnd.docuware.platform.uservalidation+xml", "text/plain");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Validate" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<String>> postToValidateRelationForStringAsync(UserValidation data, CancellationToken ct) {
        return MethodInvocation.<String, UserValidation >postAsync(this, links, "validate", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "UserValidation"), UserValidation.class, null, data), "application/vnd.docuware.platform.uservalidation+xml", "text/plain", ct);
    }



}
