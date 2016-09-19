

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;
import com.docuware.dev.schema._public.services.platform.User;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import com.docuware.dev.schema._public.services.platform.FileCabinet;
import com.docuware.dev.schema._public.services.platform.Groups;
import com.docuware.dev.schema._public.services.platform.AssignmentOperation;
import com.docuware.dev.schema._public.services.platform.Roles;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.schema._public.services.Links;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "User", propOrder = {
"proxy",
    "eMail",
    "defaultWebBasket",
    "outOfOffice",
    "regionalSettings",
    "links"
})
public class User  implements IRelationsWithProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "EMail")
    protected String eMail;
    @XmlElement(name = "DefaultWebBasket", defaultValue = "00000000-0000-0000-0000-000000000000")
    protected String defaultWebBasket;
    @XmlElement(name = "OutOfOffice", required = true)
    protected OutOfOffice outOfOffice;
    @XmlElement(name = "RegionalSettings", required = true)
    protected RegionalSettings regionalSettings;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;
    @XmlAttribute(name = "Id", required = true)
    protected String id;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "DBName", required = true)
    protected String dbName;
    @XmlAttribute(name = "Active", required = true)
    protected boolean active;
    @XmlAttribute(name = "NetworkId")
    protected String networkId;

    /**The email address of the user.*/
    public String getEMail() {
        return eMail;
    }

    /**The email address of the user.*/
    public void setEMail(String value) {
        this.eMail = value;
    }

    /**Default Web Basket*/
    public String getDefaultWebBasket() {
        return defaultWebBasket;
    }

    /**Default Web Basket*/
    public void setDefaultWebBasket(String value) {
        this.defaultWebBasket = value;
    }

    /**Out of office settings*/
    public OutOfOffice getOutOfOffice() {
        return outOfOffice;
    }

    public void setOutOfOffice(OutOfOffice value) {
        this.outOfOffice = value;
    }

    /**Regional settings*/
    public RegionalSettings getRegionalSettings() {
        return regionalSettings;
    }

    public void setRegionalSettings(RegionalSettings value) {
        this.regionalSettings = value;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links value) {
        this.links = value;
    }

    /**The ID of the user.*/
    public String getId() {
        return id;
    }

    /**The ID of the user.*/
    public void setId(String value) {
        this.id = value;
    }

    /**The display name of the user.*/
    public String getName() {
        return name;
    }

    /**The display name of the user.*/
    public void setName(String value) {
        this.name = value;
    }

    /**The databasename of the user.*/
    public String getDBName() {
        return dbName;
    }

    /**The databasename of the user.*/
    public void setDBName(String value) {
        this.dbName = value;
    }

    /**The value indicates whether the user is active or not.*/
    public boolean isActive() {
        return active;
    }

    /**The value indicates whether the user is active or not.*/
    public void setActive(boolean value) {
        this.active = value;
    }

    /**The networkId of the user.*/
    public String getNetworkId() {
        return networkId;
    }

    /**The networkId of the user.*/
    public void setNetworkId(String value) {
        this.networkId = value;
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
    public User getUserFromSelfRelation() {
        return MethodInvocation.<User>get(this, links, "self", User.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Self" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<User>> getUserFromSelfRelationAsync() {
        return MethodInvocation.<User>getAsync(this, links, "self", User.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Self" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<User>> getUserFromSelfRelationAsync(CancellationToken ct) {
        return MethodInvocation.<User>getAsync(this, links, "self", User.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Self".
    */
    public User postToSelfRelationForUser(User data) {
        return MethodInvocation.<User, User> post(this, links, "self", User.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "User"), User.class, null, data), "application/vnd.docuware.platform.user+xml", "application/vnd.docuware.platform.user+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Self" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<User>> postToSelfRelationForUserAsync(User data) {
        return MethodInvocation.<User, User >postAsync(this, links, "self", User.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "User"), User.class, null, data), "application/vnd.docuware.platform.user+xml", "application/vnd.docuware.platform.user+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Self" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<User>> postToSelfRelationForUserAsync(CancellationToken ct, User data) {
        return MethodInvocation.<User, User >postAsync(this, links, "self", User.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "User"), User.class, null, data), "application/vnd.docuware.platform.user+xml", "application/vnd.docuware.platform.user+xml", ct);
    }

    /**
    * Gets the Uri of the Link for the relation "DefaultWebBasket".
    * Returns the Uri of the Link for the relation "DefaultWebBasket", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getDefaultWebBasketRelationLink() {
        return MethodInvocation.getLink(this, links, "defaultWebBasket");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "DefaultWebBasket".
    */
    public FileCabinet getFileCabinetFromDefaultWebBasketRelation() {
        return MethodInvocation.<FileCabinet>get(this, links, "defaultWebBasket", FileCabinet.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "DefaultWebBasket" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<FileCabinet>> getFileCabinetFromDefaultWebBasketRelationAsync() {
        return MethodInvocation.<FileCabinet>getAsync(this, links, "defaultWebBasket", FileCabinet.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "DefaultWebBasket" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<FileCabinet>> getFileCabinetFromDefaultWebBasketRelationAsync(CancellationToken ct) {
        return MethodInvocation.<FileCabinet>getAsync(this, links, "defaultWebBasket", FileCabinet.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Groups".
    * Returns the Uri of the Link for the relation "Groups", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getGroupsRelationLink() {
        return MethodInvocation.getLink(this, links, "groups");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Groups".
    */
    public Groups getGroupsFromGroupsRelation() {
        return MethodInvocation.<Groups>get(this, links, "groups", Groups.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Groups" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Groups>> getGroupsFromGroupsRelationAsync() {
        return MethodInvocation.<Groups>getAsync(this, links, "groups", Groups.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Groups" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Groups>> getGroupsFromGroupsRelationAsync(CancellationToken ct) {
        return MethodInvocation.<Groups>getAsync(this, links, "groups", Groups.class, ct);
    }

    /**
    * Calls the HTTP put Method on the link for the relation "Groups".
    */
    public String putToGroupsRelationForString(AssignmentOperation data) {
        return MethodInvocation.<String, AssignmentOperation> put(this, links, "groups", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "AssignmentOperation"), AssignmentOperation.class, null, data), "application/xml", "text/plain");
    }

    /**
    * Calls the HTTP put Method on the link for the relation "Groups" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<String>> putToGroupsRelationForStringAsync(AssignmentOperation data) {
        return MethodInvocation.<String, AssignmentOperation >putAsync(this, links, "groups", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "AssignmentOperation"), AssignmentOperation.class, null, data), "application/xml", "text/plain");
    }

    /**
    * Calls the HTTP put Method on the link for the relation "Groups" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<String>> putToGroupsRelationForStringAsync(CancellationToken ct, AssignmentOperation data) {
        return MethodInvocation.<String, AssignmentOperation >putAsync(this, links, "groups", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "AssignmentOperation"), AssignmentOperation.class, null, data), "application/xml", "text/plain", ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Roles".
    * Returns the Uri of the Link for the relation "Roles", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getRolesRelationLink() {
        return MethodInvocation.getLink(this, links, "roles");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Roles".
    */
    public Roles getRolesFromRolesRelation() {
        return MethodInvocation.<Roles>get(this, links, "roles", Roles.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Roles" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Roles>> getRolesFromRolesRelationAsync() {
        return MethodInvocation.<Roles>getAsync(this, links, "roles", Roles.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Roles" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Roles>> getRolesFromRolesRelationAsync(CancellationToken ct) {
        return MethodInvocation.<Roles>getAsync(this, links, "roles", Roles.class, ct);
    }

    /**
    * Calls the HTTP put Method on the link for the relation "Roles".
    */
    public String putToRolesRelationForString(AssignmentOperation data) {
        return MethodInvocation.<String, AssignmentOperation> put(this, links, "roles", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "AssignmentOperation"), AssignmentOperation.class, null, data), "application/xml", "text/plain");
    }

    /**
    * Calls the HTTP put Method on the link for the relation "Roles" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<String>> putToRolesRelationForStringAsync(AssignmentOperation data) {
        return MethodInvocation.<String, AssignmentOperation >putAsync(this, links, "roles", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "AssignmentOperation"), AssignmentOperation.class, null, data), "application/xml", "text/plain");
    }

    /**
    * Calls the HTTP put Method on the link for the relation "Roles" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<String>> putToRolesRelationForStringAsync(CancellationToken ct, AssignmentOperation data) {
        return MethodInvocation.<String, AssignmentOperation >putAsync(this, links, "roles", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "AssignmentOperation"), AssignmentOperation.class, null, data), "application/xml", "text/plain", ct);
    }



}
