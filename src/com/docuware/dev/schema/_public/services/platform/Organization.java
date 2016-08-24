

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;
import com.docuware.dev.schema._public.services.platform.FileCabinets;
import com.docuware.dev.schema._public.services.platform.Users;
import com.docuware.dev.schema._public.services.platform.Roles;
import com.docuware.dev.schema._public.services.platform.Groups;
import com.docuware.dev.schema._public.services.platform.SelectListInfos;
import com.docuware.dev.schema._public.services.platform.WebSettings;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import com.docuware.dev.schema._public.services.platform.Organization;
import com.docuware.dev.schema._public.services.platform.TokenDescription;
import com.docuware.dev.schema._public.services.platform.DialogInfos;
import com.docuware.dev.schema._public.services.platform.RequestDialogQuery;
import com.docuware.dev.schema._public.services.platform.UserInfo;
import com.docuware.dev.schema._public.services.platform.User;
import com.docuware.dev.schema._public.services.platform.NewUser;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.schema._public.services.Links;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization", propOrder = {
"proxy",
    "additionalInfo",
    "links",
    "configurationRights"
})
public class Organization  implements IRelationsWithProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "AdditionalInfo")
    protected AdditionalOrganizationInfo additionalInfo;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;
    @XmlElement(name = "ConfigurationRights")
    protected ConfigurationRights configurationRights;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "Id", required = true)
    protected String id;

    public AdditionalOrganizationInfo getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(AdditionalOrganizationInfo value) {
        this.additionalInfo = value;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links value) {
        this.links = value;
    }

    /**List of the rights that the current user has for this cabinet.*/
    @Hawk
    public ConfigurationRights getConfigurationRights() {
        return configurationRights;
    }

    /**List of the rights that the current user has for this cabinet.*/
    @Hawk
    public void setConfigurationRights(ConfigurationRights value) {
        this.configurationRights = value;
    }

    /**Name of the organization*/
    public String getName() {
        return name;
    }

    /**Name of the organization*/
    public void setName(String value) {
        this.name = value;
    }

    /**Identity of the organization*/
    public String getId() {
        return id;
    }

    /**Identity of the organization*/
    public void setId(String value) {
        this.id = value;
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
    * Gets the Uri of the Link for the relation "Filecabinets".
    * Returns the Uri of the Link for the relation "Filecabinets", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getFilecabinetsRelationLink() {
        return MethodInvocation.getLink(this, links, "filecabinets");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Filecabinets".
    */
    public FileCabinets getFileCabinetsFromFilecabinetsRelation() {
        return MethodInvocation.<FileCabinets>get(this, links, "filecabinets", FileCabinets.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Filecabinets" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<FileCabinets>> getFileCabinetsFromFilecabinetsRelationAsync() {
        return MethodInvocation.<FileCabinets>getAsync(this, links, "filecabinets", FileCabinets.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Filecabinets" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<FileCabinets>> getFileCabinetsFromFilecabinetsRelationAsync(CancellationToken ct) {
        return MethodInvocation.<FileCabinets>getAsync(this, links, "filecabinets", FileCabinets.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Users".
    * Returns the Uri of the Link for the relation "Users", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getUsersRelationLink() {
        return MethodInvocation.getLink(this, links, "users");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Users".
    */
    public Users getUsersFromUsersRelation() {
        return MethodInvocation.<Users>get(this, links, "users", Users.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Users" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Users>> getUsersFromUsersRelationAsync() {
        return MethodInvocation.<Users>getAsync(this, links, "users", Users.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Users" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Users>> getUsersFromUsersRelationAsync(CancellationToken ct) {
        return MethodInvocation.<Users>getAsync(this, links, "users", Users.class, ct);
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
    public Future<DeserializedHttpResponseGen<Roles>> getRolesFromRolesRelationAsync() {
        return MethodInvocation.<Roles>getAsync(this, links, "roles", Roles.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Roles" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Roles>> getRolesFromRolesRelationAsync(CancellationToken ct) {
        return MethodInvocation.<Roles>getAsync(this, links, "roles", Roles.class, ct);
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
    public Future<DeserializedHttpResponseGen<Groups>> getGroupsFromGroupsRelationAsync() {
        return MethodInvocation.<Groups>getAsync(this, links, "groups", Groups.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Groups" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Groups>> getGroupsFromGroupsRelationAsync(CancellationToken ct) {
        return MethodInvocation.<Groups>getAsync(this, links, "groups", Groups.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "SelectListInfos".
    * Returns the Uri of the Link for the relation "SelectListInfos", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getSelectListInfosRelationLink() {
        return MethodInvocation.getLink(this, links, "selectListInfos");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "SelectListInfos".
    */
    public SelectListInfos getSelectListInfosFromSelectListInfosRelation() {
        return MethodInvocation.<SelectListInfos>get(this, links, "selectListInfos", SelectListInfos.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "SelectListInfos" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<SelectListInfos>> getSelectListInfosFromSelectListInfosRelationAsync() {
        return MethodInvocation.<SelectListInfos>getAsync(this, links, "selectListInfos", SelectListInfos.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "SelectListInfos" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<SelectListInfos>> getSelectListInfosFromSelectListInfosRelationAsync(CancellationToken ct) {
        return MethodInvocation.<SelectListInfos>getAsync(this, links, "selectListInfos", SelectListInfos.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "WebSettings".
    * Returns the Uri of the Link for the relation "WebSettings", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getWebSettingsRelationLink() {
        return MethodInvocation.getLink(this, links, "webSettings");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "WebSettings".
    */
    public WebSettings getWebSettingsFromWebSettingsRelation() {
        return MethodInvocation.<WebSettings>get(this, links, "webSettings", WebSettings.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "WebSettings" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<WebSettings>> getWebSettingsFromWebSettingsRelationAsync() {
        return MethodInvocation.<WebSettings>getAsync(this, links, "webSettings", WebSettings.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "WebSettings" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<WebSettings>> getWebSettingsFromWebSettingsRelationAsync(CancellationToken ct) {
        return MethodInvocation.<WebSettings>getAsync(this, links, "webSettings", WebSettings.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "WebSettings".
    */
    public WebSettings postToWebSettingsRelationForWebSettings(WebSettings data) {
        return MethodInvocation.<WebSettings,WebSettings>post(this, links, "webSettings", WebSettings.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "WebSettings"), WebSettings.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "WebSettings" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<WebSettings>> postToWebSettingsRelationForWebSettingsAsync(WebSettings data) {
        return MethodInvocation.<WebSettings, WebSettings >postAsync(this, links, "webSettings", WebSettings.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "WebSettings"), WebSettings.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "WebSettings" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<WebSettings>> postToWebSettingsRelationForWebSettingsAsync(WebSettings data, CancellationToken ct) {
        return MethodInvocation.<WebSettings, WebSettings >postAsync(this, links, "webSettings", WebSettings.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "WebSettings"), WebSettings.class, null, data), ct);
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
    public Organization getOrganizationFromSelfRelation() {
        return MethodInvocation.<Organization>get(this, links, "self", Organization.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Self" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Organization>> getOrganizationFromSelfRelationAsync() {
        return MethodInvocation.<Organization>getAsync(this, links, "self", Organization.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Self" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Organization>> getOrganizationFromSelfRelationAsync(CancellationToken ct) {
        return MethodInvocation.<Organization>getAsync(this, links, "self", Organization.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "LoginToken".
    * Returns the Uri of the Link for the relation "LoginToken", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getLoginTokenRelationLink() {
        return MethodInvocation.getLink(this, links, "loginToken");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "LoginToken".
    */
    public String postToLoginTokenRelationForString(TokenDescription data) {
        return MethodInvocation.<String,TokenDescription>post(this, links, "loginToken", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "TokenDescription"), TokenDescription.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "LoginToken" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> postToLoginTokenRelationForStringAsync(TokenDescription data) {
        return MethodInvocation.<String, TokenDescription >postAsync(this, links, "loginToken", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "TokenDescription"), TokenDescription.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "LoginToken" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> postToLoginTokenRelationForStringAsync(TokenDescription data, CancellationToken ct) {
        return MethodInvocation.<String, TokenDescription >postAsync(this, links, "loginToken", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "TokenDescription"), TokenDescription.class, null, data), ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Dialogs".
    * Returns the Uri of the Link for the relation "Dialogs", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getDialogsRelationLink() {
        return MethodInvocation.getLink(this, links, "dialogs");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Dialogs".
    */
    public DialogInfos getDialogInfosFromDialogsRelation() {
        return MethodInvocation.<DialogInfos>get(this, links, "dialogs", DialogInfos.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Dialogs" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DialogInfos>> getDialogInfosFromDialogsRelationAsync() {
        return MethodInvocation.<DialogInfos>getAsync(this, links, "dialogs", DialogInfos.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Dialogs" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DialogInfos>> getDialogInfosFromDialogsRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DialogInfos>getAsync(this, links, "dialogs", DialogInfos.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Dialogs".
    */
    public DialogInfos postToDialogsRelationForDialogInfos(RequestDialogQuery data) {
        return MethodInvocation.<DialogInfos,RequestDialogQuery>post(this, links, "dialogs", DialogInfos.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "RequestDialogQuery"), RequestDialogQuery.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Dialogs" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DialogInfos>> postToDialogsRelationForDialogInfosAsync(RequestDialogQuery data) {
        return MethodInvocation.<DialogInfos, RequestDialogQuery >postAsync(this, links, "dialogs", DialogInfos.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "RequestDialogQuery"), RequestDialogQuery.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Dialogs" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DialogInfos>> postToDialogsRelationForDialogInfosAsync(RequestDialogQuery data, CancellationToken ct) {
        return MethodInvocation.<DialogInfos, RequestDialogQuery >postAsync(this, links, "dialogs", DialogInfos.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "RequestDialogQuery"), RequestDialogQuery.class, null, data), ct);
    }

    /**
    * Gets the Uri of the Link for the relation "UserInfo".
    * Returns the Uri of the Link for the relation "UserInfo", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getUserInfoRelationLink() {
        return MethodInvocation.getLink(this, links, "userInfo");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "UserInfo".
    */
    public UserInfo getUserInfoFromUserInfoRelation() {
        return MethodInvocation.<UserInfo>get(this, links, "userInfo", UserInfo.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "UserInfo" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<UserInfo>> getUserInfoFromUserInfoRelationAsync() {
        return MethodInvocation.<UserInfo>getAsync(this, links, "userInfo", UserInfo.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "UserInfo" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<UserInfo>> getUserInfoFromUserInfoRelationAsync(CancellationToken ct) {
        return MethodInvocation.<UserInfo>getAsync(this, links, "userInfo", UserInfo.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "UserInfo".
    */
    public User postToUserInfoRelationForUser(User data) {
        return MethodInvocation.<User,User>post(this, links, "userInfo", User.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "User"), User.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "UserInfo" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<User>> postToUserInfoRelationForUserAsync(User data) {
        return MethodInvocation.<User, User >postAsync(this, links, "userInfo", User.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "User"), User.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "UserInfo" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<User>> postToUserInfoRelationForUserAsync(User data, CancellationToken ct) {
        return MethodInvocation.<User, User >postAsync(this, links, "userInfo", User.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "User"), User.class, null, data), ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "UserInfo".
    */
    public User postToUserInfoRelationForUser(NewUser data) {
        return MethodInvocation.<User,NewUser>post(this, links, "userInfo", User.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "NewUser"), NewUser.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "UserInfo" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<User>> postToUserInfoRelationForUserAsync(NewUser data) {
        return MethodInvocation.<User, NewUser >postAsync(this, links, "userInfo", User.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "NewUser"), NewUser.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "UserInfo" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<User>> postToUserInfoRelationForUserAsync(NewUser data, CancellationToken ct) {
        return MethodInvocation.<User, NewUser >postAsync(this, links, "userInfo", User.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "NewUser"), NewUser.class, null, data), ct);
    }



}
