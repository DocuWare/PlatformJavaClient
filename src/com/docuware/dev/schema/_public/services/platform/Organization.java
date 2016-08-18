//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.08.18 um 09:47:39 AM CEST 
//


package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;
import com.docuware.dev.schema._public.services.platform.FileCabinets;
import com.docuware.dev.schema._public.services.platform.Users;
import com.docuware.dev.schema._public.services.platform.Roles;
import com.docuware.dev.schema._public.services.platform.Groups;
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


/**
 * Definition for DocuWare organization.
 * 
 * <p>Java-Klasse f�r Organization complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Organization">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdditionalInfo" type="{http://dev.docuware.com/schema/public/services/platform}AdditionalOrganizationInfo" minOccurs="0"/>
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Organization", propOrder = {
"proxy",
    "additionalInfo",
    "links"
})
public class Organization  implements IRelationsWithProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "AdditionalInfo")
    protected AdditionalOrganizationInfo additionalInfo;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "Id", required = true)
    protected String id;

    /**
     * Ruft den Wert der additionalInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalOrganizationInfo }
     *     
     */
    public AdditionalOrganizationInfo getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Legt den Wert der additionalInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalOrganizationInfo }
     *     
     */
    public void setAdditionalInfo(AdditionalOrganizationInfo value) {
        this.additionalInfo = value;
    }

    /**
     * Ruft den Wert der links-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Links }
     *     
     */
    public Links getLinks() {
        return links;
    }

    /**
     * Legt den Wert der links-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Links }
     *     
     */
    public void setLinks(Links value) {
        this.links = value;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    public HttpClientProxy getProxy() {
	return this.proxy;
    }

    public void setProxy(HttpClientProxy proxy) {
	this.proxy = proxy;
    }

    public URI getBaseUri() {
	return RelationsWithProxyExtensions.getBaseUri(this);
    }

    public Link getLink(String relationName) {
	return RelationExtension.getLink(this, relationName);
    }

    public String getRelationUri(String relationName) {
	return RelationExtension.getRelationUri(this, relationName);
    }

    public String getRelationUriOrThrow(String relationName) {
	return RelationExtension.getRelationUriOrThrow(this, relationName);
    }

    public boolean hasRelationUri(String relationName) {
	return RelationExtension.hasRelationUri(this, relationName);
    }

    public URI getFilecabinetsRelationLink() {
        return MethodInvocation.getLink(this, links, "filecabinets");
    }

    public FileCabinets getFileCabinetsFromFilecabinetsRelation() {
        return MethodInvocation.<FileCabinets>get(this, links, "filecabinets", FileCabinets.class);
    }

    public Future<DeserializedHttpResponseGen<FileCabinets>> getFileCabinetsFromFilecabinetsRelationAsync() {
        return MethodInvocation.<FileCabinets>getAsync(this, links, "filecabinets", FileCabinets.class);
    }

    public Future<DeserializedHttpResponseGen<FileCabinets>> getFileCabinetsFromFilecabinetsRelationAsync(CancellationToken ct) {
        return MethodInvocation.<FileCabinets>getAsync(this, links, "filecabinets", FileCabinets.class, ct);
    }

    public URI getUsersRelationLink() {
        return MethodInvocation.getLink(this, links, "users");
    }

    public Users getUsersFromUsersRelation() {
        return MethodInvocation.<Users>get(this, links, "users", Users.class);
    }

    public Future<DeserializedHttpResponseGen<Users>> getUsersFromUsersRelationAsync() {
        return MethodInvocation.<Users>getAsync(this, links, "users", Users.class);
    }

    public Future<DeserializedHttpResponseGen<Users>> getUsersFromUsersRelationAsync(CancellationToken ct) {
        return MethodInvocation.<Users>getAsync(this, links, "users", Users.class, ct);
    }

    public URI getRolesRelationLink() {
        return MethodInvocation.getLink(this, links, "roles");
    }

    public Roles getRolesFromRolesRelation() {
        return MethodInvocation.<Roles>get(this, links, "roles", Roles.class);
    }

    public Future<DeserializedHttpResponseGen<Roles>> getRolesFromRolesRelationAsync() {
        return MethodInvocation.<Roles>getAsync(this, links, "roles", Roles.class);
    }

    public Future<DeserializedHttpResponseGen<Roles>> getRolesFromRolesRelationAsync(CancellationToken ct) {
        return MethodInvocation.<Roles>getAsync(this, links, "roles", Roles.class, ct);
    }

    public URI getGroupsRelationLink() {
        return MethodInvocation.getLink(this, links, "groups");
    }

    public Groups getGroupsFromGroupsRelation() {
        return MethodInvocation.<Groups>get(this, links, "groups", Groups.class);
    }

    public Future<DeserializedHttpResponseGen<Groups>> getGroupsFromGroupsRelationAsync() {
        return MethodInvocation.<Groups>getAsync(this, links, "groups", Groups.class);
    }

    public Future<DeserializedHttpResponseGen<Groups>> getGroupsFromGroupsRelationAsync(CancellationToken ct) {
        return MethodInvocation.<Groups>getAsync(this, links, "groups", Groups.class, ct);
    }

    public URI getWebSettingsRelationLink() {
        return MethodInvocation.getLink(this, links, "webSettings");
    }

    public WebSettings getWebSettingsFromWebSettingsRelation() {
        return MethodInvocation.<WebSettings>get(this, links, "webSettings", WebSettings.class);
    }

    public Future<DeserializedHttpResponseGen<WebSettings>> getWebSettingsFromWebSettingsRelationAsync() {
        return MethodInvocation.<WebSettings>getAsync(this, links, "webSettings", WebSettings.class);
    }

    public Future<DeserializedHttpResponseGen<WebSettings>> getWebSettingsFromWebSettingsRelationAsync(CancellationToken ct) {
        return MethodInvocation.<WebSettings>getAsync(this, links, "webSettings", WebSettings.class, ct);
    }

    public WebSettings postToWebSettingsRelationForWebSettings(WebSettings data) {
        return MethodInvocation.<WebSettings,WebSettings>post(this, links, "webSettings", WebSettings.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "WebSettings"), WebSettings.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<WebSettings>> postToWebSettingsRelationForWebSettingsAsync(WebSettings data) {
        return MethodInvocation.<WebSettings, WebSettings >postAsync(this, links, "webSettings", WebSettings.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "WebSettings"), WebSettings.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<WebSettings>> postToWebSettingsRelationForWebSettingsAsync(WebSettings data, CancellationToken ct) {
        return MethodInvocation.<WebSettings, WebSettings >postAsync(this, links, "webSettings", WebSettings.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "WebSettings"), WebSettings.class, null, data), ct);
    }

    public URI getSelfRelationLink() {
        return MethodInvocation.getLink(this, links, "self");
    }

    public Organization getOrganizationFromSelfRelation() {
        return MethodInvocation.<Organization>get(this, links, "self", Organization.class);
    }

    public Future<DeserializedHttpResponseGen<Organization>> getOrganizationFromSelfRelationAsync() {
        return MethodInvocation.<Organization>getAsync(this, links, "self", Organization.class);
    }

    public Future<DeserializedHttpResponseGen<Organization>> getOrganizationFromSelfRelationAsync(CancellationToken ct) {
        return MethodInvocation.<Organization>getAsync(this, links, "self", Organization.class, ct);
    }

    public URI getLoginTokenRelationLink() {
        return MethodInvocation.getLink(this, links, "loginToken");
    }

    public String postToLoginTokenRelationForString(TokenDescription data) {
        return MethodInvocation.<String,TokenDescription>post(this, links, "loginToken", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "TokenDescription"), TokenDescription.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<String>> postToLoginTokenRelationForStringAsync(TokenDescription data) {
        return MethodInvocation.<String, TokenDescription >postAsync(this, links, "loginToken", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "TokenDescription"), TokenDescription.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<String>> postToLoginTokenRelationForStringAsync(TokenDescription data, CancellationToken ct) {
        return MethodInvocation.<String, TokenDescription >postAsync(this, links, "loginToken", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "TokenDescription"), TokenDescription.class, null, data), ct);
    }

    public URI getDialogsRelationLink() {
        return MethodInvocation.getLink(this, links, "dialogs");
    }

    public DialogInfos getDialogInfosFromDialogsRelation() {
        return MethodInvocation.<DialogInfos>get(this, links, "dialogs", DialogInfos.class);
    }

    public Future<DeserializedHttpResponseGen<DialogInfos>> getDialogInfosFromDialogsRelationAsync() {
        return MethodInvocation.<DialogInfos>getAsync(this, links, "dialogs", DialogInfos.class);
    }

    public Future<DeserializedHttpResponseGen<DialogInfos>> getDialogInfosFromDialogsRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DialogInfos>getAsync(this, links, "dialogs", DialogInfos.class, ct);
    }

    public DialogInfos postToDialogsRelationForDialogInfos(RequestDialogQuery data) {
        return MethodInvocation.<DialogInfos,RequestDialogQuery>post(this, links, "dialogs", DialogInfos.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "RequestDialogQuery"), RequestDialogQuery.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<DialogInfos>> postToDialogsRelationForDialogInfosAsync(RequestDialogQuery data) {
        return MethodInvocation.<DialogInfos, RequestDialogQuery >postAsync(this, links, "dialogs", DialogInfos.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "RequestDialogQuery"), RequestDialogQuery.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<DialogInfos>> postToDialogsRelationForDialogInfosAsync(RequestDialogQuery data, CancellationToken ct) {
        return MethodInvocation.<DialogInfos, RequestDialogQuery >postAsync(this, links, "dialogs", DialogInfos.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "RequestDialogQuery"), RequestDialogQuery.class, null, data), ct);
    }

    public URI getUserInfoRelationLink() {
        return MethodInvocation.getLink(this, links, "userInfo");
    }

    public UserInfo getUserInfoFromUserInfoRelation() {
        return MethodInvocation.<UserInfo>get(this, links, "userInfo", UserInfo.class);
    }

    public Future<DeserializedHttpResponseGen<UserInfo>> getUserInfoFromUserInfoRelationAsync() {
        return MethodInvocation.<UserInfo>getAsync(this, links, "userInfo", UserInfo.class);
    }

    public Future<DeserializedHttpResponseGen<UserInfo>> getUserInfoFromUserInfoRelationAsync(CancellationToken ct) {
        return MethodInvocation.<UserInfo>getAsync(this, links, "userInfo", UserInfo.class, ct);
    }

    public User postToUserInfoRelationForUser(User data) {
        return MethodInvocation.<User,User>post(this, links, "userInfo", User.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "User"), User.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<User>> postToUserInfoRelationForUserAsync(User data) {
        return MethodInvocation.<User, User >postAsync(this, links, "userInfo", User.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "User"), User.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<User>> postToUserInfoRelationForUserAsync(User data, CancellationToken ct) {
        return MethodInvocation.<User, User >postAsync(this, links, "userInfo", User.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "User"), User.class, null, data), ct);
    }

    public User postToUserInfoRelationForUser(NewUser data) {
        return MethodInvocation.<User,NewUser>post(this, links, "userInfo", User.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "NewUser"), NewUser.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<User>> postToUserInfoRelationForUserAsync(NewUser data) {
        return MethodInvocation.<User, NewUser >postAsync(this, links, "userInfo", User.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "NewUser"), NewUser.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<User>> postToUserInfoRelationForUserAsync(NewUser data, CancellationToken ct) {
        return MethodInvocation.<User, NewUser >postAsync(this, links, "userInfo", User.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "NewUser"), NewUser.class, null, data), ct);
    }



}
