//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.08.16 um 09:04:54 AM CEST 
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

    public URI getSelfRelationLink() {
        return MethodInvocation.getLink(this, links, "self");
    }

    public User getUserFromSelfRelation() {
        return MethodInvocation.<User>get(this, links, "self", User.class);
    }

    public Future<DeserializedHttpResponseGen<User>> getUserFromSelfRelationAsync() {
        return MethodInvocation.<User>getAsync(this, links, "self", User.class);
    }

    public User postToSelfRelationForUser(User data) {
        return MethodInvocation.<User,User>post(this, links, "self", User.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "User"), User.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<User>> postToSelfRelationForUserAsync(User data) {
        return MethodInvocation.<User, User >postAsync(this, links, "self", User.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "User"), User.class, null, data));
    }

    public URI getDefaultWebBasketRelationLink() {
        return MethodInvocation.getLink(this, links, "defaultWebBasket");
    }

    public FileCabinet getFileCabinetFromDefaultWebBasketRelation() {
        return MethodInvocation.<FileCabinet>get(this, links, "defaultWebBasket", FileCabinet.class);
    }

    public Future<DeserializedHttpResponseGen<FileCabinet>> getFileCabinetFromDefaultWebBasketRelationAsync() {
        return MethodInvocation.<FileCabinet>getAsync(this, links, "defaultWebBasket", FileCabinet.class);
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

    public String putToGroupsRelationForString(AssignmentOperation data) {
        return MethodInvocation.<String,AssignmentOperation>put(this, links, "groups", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "AssignmentOperation"), AssignmentOperation.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<String>> putToGroupsRelationForStringAsync(AssignmentOperation data) {
        return MethodInvocation.<String, AssignmentOperation >putAsync(this, links, "groups", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "AssignmentOperation"), AssignmentOperation.class, null, data));
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

    public String putToRolesRelationForString(AssignmentOperation data) {
        return MethodInvocation.<String,AssignmentOperation>put(this, links, "roles", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "AssignmentOperation"), AssignmentOperation.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<String>> putToRolesRelationForStringAsync(AssignmentOperation data) {
        return MethodInvocation.<String, AssignmentOperation >putAsync(this, links, "roles", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "AssignmentOperation"), AssignmentOperation.class, null, data));
    }



}
