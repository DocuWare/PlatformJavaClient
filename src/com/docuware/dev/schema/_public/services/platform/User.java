//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.08.22 um 03:45:48 PM CEST 
//


package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
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


/**
 * User details and settings
 * 
 * <p>Java-Klasse f�r User complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="User">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EMail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DefaultWebBasket" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OutOfOffice" type="{http://dev.docuware.com/schema/public/services/platform}OutOfOffice"/>
 *         &lt;element name="RegionalSettings" type="{http://dev.docuware.com/schema/public/services/platform}RegionalSettings"/>
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DBName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Active" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="NetworkId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
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

    /**
     * Ruft den Wert der eMail-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMail() {
        return eMail;
    }

    /**
     * Legt den Wert der eMail-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMail(String value) {
        this.eMail = value;
    }

    /**
     * Ruft den Wert der defaultWebBasket-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultWebBasket() {
        return defaultWebBasket;
    }

    /**
     * Legt den Wert der defaultWebBasket-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultWebBasket(String value) {
        this.defaultWebBasket = value;
    }

    /**
     * Ruft den Wert der outOfOffice-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link OutOfOffice }
     *     
     */
    public OutOfOffice getOutOfOffice() {
        return outOfOffice;
    }

    /**
     * Legt den Wert der outOfOffice-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link OutOfOffice }
     *     
     */
    public void setOutOfOffice(OutOfOffice value) {
        this.outOfOffice = value;
    }

    /**
     * Ruft den Wert der regionalSettings-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RegionalSettings }
     *     
     */
    public RegionalSettings getRegionalSettings() {
        return regionalSettings;
    }

    /**
     * Legt den Wert der regionalSettings-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RegionalSettings }
     *     
     */
    public void setRegionalSettings(RegionalSettings value) {
        this.regionalSettings = value;
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
     * Ruft den Wert der dbName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBName() {
        return dbName;
    }

    /**
     * Legt den Wert der dbName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDBName(String value) {
        this.dbName = value;
    }

    /**
     * Ruft den Wert der active-Eigenschaft ab.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Legt den Wert der active-Eigenschaft fest.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
    }

    /**
     * Ruft den Wert der networkId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetworkId() {
        return networkId;
    }

    /**
     * Legt den Wert der networkId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetworkId(String value) {
        this.networkId = value;
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
    public Future<DeserializedHttpResponseGen<User>> getUserFromSelfRelationAsync() {
        return MethodInvocation.<User>getAsync(this, links, "self", User.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Self" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<User>> getUserFromSelfRelationAsync(CancellationToken ct) {
        return MethodInvocation.<User>getAsync(this, links, "self", User.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Self".
    */
    public User postToSelfRelationForUser(User data) {
        return MethodInvocation.<User,User>post(this, links, "self", User.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "User"), User.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Self" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<User>> postToSelfRelationForUserAsync(User data) {
        return MethodInvocation.<User, User >postAsync(this, links, "self", User.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "User"), User.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Self" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<User>> postToSelfRelationForUserAsync(User data, CancellationToken ct) {
        return MethodInvocation.<User, User >postAsync(this, links, "self", User.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "User"), User.class, null, data), ct);
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
    public Future<DeserializedHttpResponseGen<FileCabinet>> getFileCabinetFromDefaultWebBasketRelationAsync() {
        return MethodInvocation.<FileCabinet>getAsync(this, links, "defaultWebBasket", FileCabinet.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "DefaultWebBasket" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<FileCabinet>> getFileCabinetFromDefaultWebBasketRelationAsync(CancellationToken ct) {
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
    * Calls the HTTP put Method on the link for the relation "Groups".
    */
    public String putToGroupsRelationForString(AssignmentOperation data) {
        return MethodInvocation.<String,AssignmentOperation>put(this, links, "groups", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "AssignmentOperation"), AssignmentOperation.class, null, data));
    }

    /**
    * Calls the HTTP put Method on the link for the relation "Groups" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> putToGroupsRelationForStringAsync(AssignmentOperation data) {
        return MethodInvocation.<String, AssignmentOperation >putAsync(this, links, "groups", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "AssignmentOperation"), AssignmentOperation.class, null, data));
    }

    /**
    * Calls the HTTP put Method on the link for the relation "Groups" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> putToGroupsRelationForStringAsync(AssignmentOperation data, CancellationToken ct) {
        return MethodInvocation.<String, AssignmentOperation >putAsync(this, links, "groups", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "AssignmentOperation"), AssignmentOperation.class, null, data), ct);
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
    * Calls the HTTP put Method on the link for the relation "Roles".
    */
    public String putToRolesRelationForString(AssignmentOperation data) {
        return MethodInvocation.<String,AssignmentOperation>put(this, links, "roles", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "AssignmentOperation"), AssignmentOperation.class, null, data));
    }

    /**
    * Calls the HTTP put Method on the link for the relation "Roles" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> putToRolesRelationForStringAsync(AssignmentOperation data) {
        return MethodInvocation.<String, AssignmentOperation >putAsync(this, links, "roles", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "AssignmentOperation"), AssignmentOperation.class, null, data));
    }

    /**
    * Calls the HTTP put Method on the link for the relation "Roles" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> putToRolesRelationForStringAsync(AssignmentOperation data, CancellationToken ct) {
        return MethodInvocation.<String, AssignmentOperation >putAsync(this, links, "roles", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "AssignmentOperation"), AssignmentOperation.class, null, data), ct);
    }



}
