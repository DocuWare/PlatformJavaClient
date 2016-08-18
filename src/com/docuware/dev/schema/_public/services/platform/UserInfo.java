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
import com.docuware.dev.schema._public.services.platform.UserValidation;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.schema._public.services.Links;


/**
 * Information related to a user
 * 
 * <p>Java-Klasse f�r UserInfo complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UserInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="User" type="{http://dev.docuware.com/schema/public/services/platform}User"/>
 *         &lt;element name="LoginInfo" type="{http://dev.docuware.com/schema/public/services/platform}LoginInfo"/>
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
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

    /**
     * Ruft den Wert der user-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * Legt den Wert der user-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
    }

    /**
     * Ruft den Wert der loginInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LoginInfo }
     *     
     */
    public LoginInfo getLoginInfo() {
        return loginInfo;
    }

    /**
     * Legt den Wert der loginInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginInfo }
     *     
     */
    public void setLoginInfo(LoginInfo value) {
        this.loginInfo = value;
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

    public HttpClientProxy getProxy() {
	return this.proxy;
    }

    public void setProxy(HttpClientProxy proxy) {
	this.proxy = proxy;
    if ((user != null)) {
		user.setProxy(proxy);
    }
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

    public URI getValidateRelationLink() {
        return MethodInvocation.getLink(this, links, "validate");
    }

    public String postToValidateRelationForString(UserValidation data) {
        return MethodInvocation.<String,UserValidation>post(this, links, "validate", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "UserValidation"), UserValidation.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<String>> postToValidateRelationForStringAsync(UserValidation data) {
        return MethodInvocation.<String, UserValidation >postAsync(this, links, "validate", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "UserValidation"), UserValidation.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<String>> postToValidateRelationForStringAsync(UserValidation data, CancellationToken ct) {
        return MethodInvocation.<String, UserValidation >postAsync(this, links, "validate", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "UserValidation"), UserValidation.class, null, data), ct);
    }



}
