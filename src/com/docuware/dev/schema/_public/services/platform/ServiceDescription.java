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
import com.docuware.dev.schema._public.services.platform.Organizations;
import java.io.InputStream;
import com.docuware.dev.schema._public.services.UriTemplateDescriptions;
import com.docuware.dev.schema._public.services.platform.AdhocRenderingFiles;
import com.docuware.dev.schema._public.services.platform.AdhocRenderingFile;
import com.docuware.dev.schema._public.services.LogMessages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.schema._public.services.Links;
import com.docuware.dev.schema._public.services.UriTemplateDescriptions;


/**
 * Root object that define platform structure.
 * 
 * <p>Java-Klasse f�r ServiceDescription complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ServiceDescription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links"/>
 *         &lt;element name="Tests" type="{http://dev.docuware.com/schema/public/services/platform}ServiceDescriptionTests"/>
 *         &lt;element name="Documentation" type="{http://dev.docuware.com/schema/public/services/platform}ServiceDescriptionDocumentation"/>
 *         &lt;element name="Resources" type="{http://dev.docuware.com/schema/public/services}UriTemplateDescriptions"/>
 *         &lt;element name="Statistics" type="{http://dev.docuware.com/schema/public/services/platform}ServiceDescriptionStatistics"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDescription", propOrder = {
"proxy",
    "links",
    "tests",
    "documentation",
    "resources",
    "statistics"
})
public class ServiceDescription  implements IRelationsWithProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;
    @XmlElement(name = "Tests", required = true)
    protected ServiceDescriptionTests tests;
    @XmlElement(name = "Documentation", required = true)
    protected ServiceDescriptionDocumentation documentation;
    @XmlElement(name = "Resources", required = true)
    protected UriTemplateDescriptions resources;
    @XmlElement(name = "Statistics", required = true)
    protected ServiceDescriptionStatistics statistics;
    @XmlAttribute(name = "Version")
    protected String version;

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
     * Ruft den Wert der tests-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDescriptionTests }
     *     
     */
    public ServiceDescriptionTests getTests() {
        return tests;
    }

    /**
     * Legt den Wert der tests-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDescriptionTests }
     *     
     */
    public void setTests(ServiceDescriptionTests value) {
        this.tests = value;
    }

    /**
     * Ruft den Wert der documentation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDescriptionDocumentation }
     *     
     */
    public ServiceDescriptionDocumentation getDocumentation() {
        return documentation;
    }

    /**
     * Legt den Wert der documentation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDescriptionDocumentation }
     *     
     */
    public void setDocumentation(ServiceDescriptionDocumentation value) {
        this.documentation = value;
    }

    /**
     * Ruft den Wert der resources-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UriTemplateDescriptions }
     *     
     */
    public UriTemplateDescriptions getResources() {
        return resources;
    }

    /**
     * Legt den Wert der resources-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UriTemplateDescriptions }
     *     
     */
    public void setResources(UriTemplateDescriptions value) {
        this.resources = value;
    }

    /**
     * Ruft den Wert der statistics-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDescriptionStatistics }
     *     
     */
    public ServiceDescriptionStatistics getStatistics() {
        return statistics;
    }

    /**
     * Legt den Wert der statistics-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDescriptionStatistics }
     *     
     */
    public void setStatistics(ServiceDescriptionStatistics value) {
        this.statistics = value;
    }

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }


	/**
	* Gets the proxy.
	* 
	* @return	The proxy
	*/
    public HttpClientProxy getProxy() { return this.proxy; 
    }


	/**
	* Sets the HTTP Communication Proxy which is used in futher HTTP communication.
	* 
	* @param proxy	The new proxy
	*/
    public void setProxy(HttpClientProxy proxy) {
	this.proxy = proxy;
    if ((tests != null)) {
        tests.setProxy(proxy);
    }
    if ((documentation != null)) {
        documentation.setProxy(proxy);
    }
    if ((statistics != null)) {
        statistics.setProxy(proxy);
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
    * Gets the Uri of the Link for the relation "Organizations".
    * Returns the Uri of the Link for the relation "Organizations", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getOrganizationsRelationLink() {
        return MethodInvocation.getLink(this, links, "organizations");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Organizations".
    */
    public Organizations getOrganizationsFromOrganizationsRelation() {
        return MethodInvocation.<Organizations>get(this, links, "organizations", Organizations.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Organizations" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Organizations>> getOrganizationsFromOrganizationsRelationAsync() {
        return MethodInvocation.<Organizations>getAsync(this, links, "organizations", Organizations.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Organizations" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Organizations>> getOrganizationsFromOrganizationsRelationAsync(CancellationToken ct) {
        return MethodInvocation.<Organizations>getAsync(this, links, "organizations", Organizations.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Login".
    * Returns the Uri of the Link for the relation "Login", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getLoginRelationLink() {
        return MethodInvocation.getLink(this, links, "login");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Login".
    */
    public URI getURIFromLoginRelation() {
        return MethodInvocation.<URI>get(this, links, "login", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Login" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromLoginRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "login", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Login" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromLoginRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "login", URI.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Login".
    */
    public String postToLoginRelationForString(InputStream data, String bodyContentType) {
        return MethodInvocation.<String, InputStream>post(this, links, "login", String.class, data, bodyContentType);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Login" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> postToLoginRelationForStringAsync(InputStream data, String bodyContentType) { 
        return MethodInvocation.<String, InputStream>postAsync(this, links, "login", String.class, data, bodyContentType);
}

    /**
    * Calls the HTTP post Method on the link for the relation "Login" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> postToLoginRelationForStringAsync(InputStream data, String bodyContentType, CancellationToken ct) { 
        return MethodInvocation.<String, InputStream>postAsync(this, links, "login", String.class, data, bodyContentType, ct);
}

    /**
    * Gets the Uri of the Link for the relation "GuestLogin".
    * Returns the Uri of the Link for the relation "GuestLogin", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getGuestLoginRelationLink() {
        return MethodInvocation.getLink(this, links, "guestLogin");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "GuestLogin".
    */
    public URI getURIFromGuestLoginRelation() {
        return MethodInvocation.<URI>get(this, links, "guestLogin", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "GuestLogin" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromGuestLoginRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "guestLogin", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "GuestLogin" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromGuestLoginRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "guestLogin", URI.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "GuestLogin".
    */
    public String postToGuestLoginRelationForString(InputStream data, String bodyContentType) {
        return MethodInvocation.<String, InputStream>post(this, links, "guestLogin", String.class, data, bodyContentType);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "GuestLogin" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> postToGuestLoginRelationForStringAsync(InputStream data, String bodyContentType) { 
        return MethodInvocation.<String, InputStream>postAsync(this, links, "guestLogin", String.class, data, bodyContentType);
}

    /**
    * Calls the HTTP post Method on the link for the relation "GuestLogin" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> postToGuestLoginRelationForStringAsync(InputStream data, String bodyContentType, CancellationToken ct) { 
        return MethodInvocation.<String, InputStream>postAsync(this, links, "guestLogin", String.class, data, bodyContentType, ct);
}

    /**
    * Gets the Uri of the Link for the relation "WindowsLogin".
    * Returns the Uri of the Link for the relation "WindowsLogin", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getWindowsLoginRelationLink() {
        return MethodInvocation.getLink(this, links, "windowsLogin");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "WindowsLogin".
    */
    public URI getURIFromWindowsLoginRelation() {
        return MethodInvocation.<URI>get(this, links, "windowsLogin", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "WindowsLogin" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromWindowsLoginRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "windowsLogin", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "WindowsLogin" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromWindowsLoginRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "windowsLogin", URI.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "WindowsLogin".
    */
    public String postToWindowsLoginRelationForString(InputStream data, String bodyContentType) {
        return MethodInvocation.<String, InputStream>post(this, links, "windowsLogin", String.class, data, bodyContentType);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "WindowsLogin" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> postToWindowsLoginRelationForStringAsync(InputStream data, String bodyContentType) { 
        return MethodInvocation.<String, InputStream>postAsync(this, links, "windowsLogin", String.class, data, bodyContentType);
}

    /**
    * Calls the HTTP post Method on the link for the relation "WindowsLogin" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> postToWindowsLoginRelationForStringAsync(InputStream data, String bodyContentType, CancellationToken ct) { 
        return MethodInvocation.<String, InputStream>postAsync(this, links, "windowsLogin", String.class, data, bodyContentType, ct);
}

    /**
    * Gets the Uri of the Link for the relation "ChangePassword".
    * Returns the Uri of the Link for the relation "ChangePassword", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getChangePasswordRelationLink() {
        return MethodInvocation.getLink(this, links, "changePassword");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "ChangePassword".
    */
    public URI getURIFromChangePasswordRelation() {
        return MethodInvocation.<URI>get(this, links, "changePassword", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "ChangePassword" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromChangePasswordRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "changePassword", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "ChangePassword" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromChangePasswordRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "changePassword", URI.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "ChangePassword".
    */
    public String postToChangePasswordRelationForString(InputStream data, String bodyContentType) {
        return MethodInvocation.<String, InputStream>post(this, links, "changePassword", String.class, data, bodyContentType);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "ChangePassword" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> postToChangePasswordRelationForStringAsync(InputStream data, String bodyContentType) { 
        return MethodInvocation.<String, InputStream>postAsync(this, links, "changePassword", String.class, data, bodyContentType);
}

    /**
    * Calls the HTTP post Method on the link for the relation "ChangePassword" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> postToChangePasswordRelationForStringAsync(InputStream data, String bodyContentType, CancellationToken ct) { 
        return MethodInvocation.<String, InputStream>postAsync(this, links, "changePassword", String.class, data, bodyContentType, ct);
}

    /**
    * Gets the Uri of the Link for the relation "ResetPassword".
    * Returns the Uri of the Link for the relation "ResetPassword", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getResetPasswordRelationLink() {
        return MethodInvocation.getLink(this, links, "resetPassword");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "ResetPassword".
    */
    public URI getURIFromResetPasswordRelation() {
        return MethodInvocation.<URI>get(this, links, "resetPassword", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "ResetPassword" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromResetPasswordRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "resetPassword", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "ResetPassword" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromResetPasswordRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "resetPassword", URI.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "ResetPassword".
    */
    public String postToResetPasswordRelationForString(InputStream data, String bodyContentType) {
        return MethodInvocation.<String, InputStream>post(this, links, "resetPassword", String.class, data, bodyContentType);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "ResetPassword" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> postToResetPasswordRelationForStringAsync(InputStream data, String bodyContentType) { 
        return MethodInvocation.<String, InputStream>postAsync(this, links, "resetPassword", String.class, data, bodyContentType);
}

    /**
    * Calls the HTTP post Method on the link for the relation "ResetPassword" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> postToResetPasswordRelationForStringAsync(InputStream data, String bodyContentType, CancellationToken ct) { 
        return MethodInvocation.<String, InputStream>postAsync(this, links, "resetPassword", String.class, data, bodyContentType, ct);
}

    /**
    * Gets the Uri of the Link for the relation "TokenLogin".
    * Returns the Uri of the Link for the relation "TokenLogin", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getTokenLoginRelationLink() {
        return MethodInvocation.getLink(this, links, "tokenLogin");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "TokenLogin".
    */
    public URI getURIFromTokenLoginRelation() {
        return MethodInvocation.<URI>get(this, links, "tokenLogin", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "TokenLogin" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromTokenLoginRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "tokenLogin", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "TokenLogin" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromTokenLoginRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "tokenLogin", URI.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "TokenLogin".
    */
    public String postToTokenLoginRelationForString(InputStream data, String bodyContentType) {
        return MethodInvocation.<String, InputStream>post(this, links, "tokenLogin", String.class, data, bodyContentType);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "TokenLogin" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> postToTokenLoginRelationForStringAsync(InputStream data, String bodyContentType) { 
        return MethodInvocation.<String, InputStream>postAsync(this, links, "tokenLogin", String.class, data, bodyContentType);
}

    /**
    * Calls the HTTP post Method on the link for the relation "TokenLogin" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> postToTokenLoginRelationForStringAsync(InputStream data, String bodyContentType, CancellationToken ct) { 
        return MethodInvocation.<String, InputStream>postAsync(this, links, "tokenLogin", String.class, data, bodyContentType, ct);
}

    /**
    * Gets the Uri of the Link for the relation "TrustedLogin".
    * Returns the Uri of the Link for the relation "TrustedLogin", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getTrustedLoginRelationLink() {
        return MethodInvocation.getLink(this, links, "trustedLogin");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "TrustedLogin".
    */
    public URI getURIFromTrustedLoginRelation() {
        return MethodInvocation.<URI>get(this, links, "trustedLogin", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "TrustedLogin" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromTrustedLoginRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "trustedLogin", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "TrustedLogin" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromTrustedLoginRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "trustedLogin", URI.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "TrustedLogin".
    */
    public String postToTrustedLoginRelationForString(InputStream data, String bodyContentType) {
        return MethodInvocation.<String, InputStream>post(this, links, "trustedLogin", String.class, data, bodyContentType);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "TrustedLogin" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> postToTrustedLoginRelationForStringAsync(InputStream data, String bodyContentType) { 
        return MethodInvocation.<String, InputStream>postAsync(this, links, "trustedLogin", String.class, data, bodyContentType);
}

    /**
    * Calls the HTTP post Method on the link for the relation "TrustedLogin" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> postToTrustedLoginRelationForStringAsync(InputStream data, String bodyContentType, CancellationToken ct) { 
        return MethodInvocation.<String, InputStream>postAsync(this, links, "trustedLogin", String.class, data, bodyContentType, ct);
}

    /**
    * Gets the Uri of the Link for the relation "Logout".
    * Returns the Uri of the Link for the relation "Logout", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getLogoutRelationLink() {
        return MethodInvocation.getLink(this, links, "logout");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Logout".
    */
    public URI getURIFromLogoutRelation() {
        return MethodInvocation.<URI>get(this, links, "logout", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Logout" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromLogoutRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "logout", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Logout" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromLogoutRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "logout", URI.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Disconnect".
    * Returns the Uri of the Link for the relation "Disconnect", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getDisconnectRelationLink() {
        return MethodInvocation.getLink(this, links, "disconnect");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Disconnect".
    */
    public URI getURIFromDisconnectRelation() {
        return MethodInvocation.<URI>get(this, links, "disconnect", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Disconnect" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromDisconnectRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "disconnect", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Disconnect" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromDisconnectRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "disconnect", URI.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "LoginCookie".
    * Returns the Uri of the Link for the relation "LoginCookie", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getLoginCookieRelationLink() {
        return MethodInvocation.getLink(this, links, "loginCookie");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "LoginCookie".
    */
    public URI getURIFromLoginCookieRelation() {
        return MethodInvocation.<URI>get(this, links, "loginCookie", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "LoginCookie" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromLoginCookieRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "loginCookie", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "LoginCookie" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromLoginCookieRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "loginCookie", URI.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "UriTemplates".
    * Returns the Uri of the Link for the relation "UriTemplates", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getUriTemplatesRelationLink() {
        return MethodInvocation.getLink(this, links, "uriTemplates");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "UriTemplates".
    */
    public UriTemplateDescriptions getUriTemplateDescriptionsFromUriTemplatesRelation() {
        return MethodInvocation.<UriTemplateDescriptions>get(this, links, "uriTemplates", UriTemplateDescriptions.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "UriTemplates" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<UriTemplateDescriptions>> getUriTemplateDescriptionsFromUriTemplatesRelationAsync() {
        return MethodInvocation.<UriTemplateDescriptions>getAsync(this, links, "uriTemplates", UriTemplateDescriptions.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "UriTemplates" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<UriTemplateDescriptions>> getUriTemplateDescriptionsFromUriTemplatesRelationAsync(CancellationToken ct) {
        return MethodInvocation.<UriTemplateDescriptions>getAsync(this, links, "uriTemplates", UriTemplateDescriptions.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "AdhocRendering".
    * Returns the Uri of the Link for the relation "AdhocRendering", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getAdhocRenderingRelationLink() {
        return MethodInvocation.getLink(this, links, "adhocRendering");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "AdhocRendering".
    */
    public AdhocRenderingFiles getAdhocRenderingFilesFromAdhocRenderingRelation() {
        return MethodInvocation.<AdhocRenderingFiles>get(this, links, "adhocRendering", AdhocRenderingFiles.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "AdhocRendering" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<AdhocRenderingFiles>> getAdhocRenderingFilesFromAdhocRenderingRelationAsync() {
        return MethodInvocation.<AdhocRenderingFiles>getAsync(this, links, "adhocRendering", AdhocRenderingFiles.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "AdhocRendering" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<AdhocRenderingFiles>> getAdhocRenderingFilesFromAdhocRenderingRelationAsync(CancellationToken ct) {
        return MethodInvocation.<AdhocRenderingFiles>getAsync(this, links, "adhocRendering", AdhocRenderingFiles.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "AdhocRendering".
    */
    public AdhocRenderingFile postToAdhocRenderingRelationForAdhocRenderingFile(InputStream data, String bodyContentType) {
        return MethodInvocation.<AdhocRenderingFile, InputStream>post(this, links, "adhocRendering", AdhocRenderingFile.class, data, bodyContentType);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "AdhocRendering" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<AdhocRenderingFile>> postToAdhocRenderingRelationForAdhocRenderingFileAsync(InputStream data, String bodyContentType) { 
        return MethodInvocation.<AdhocRenderingFile, InputStream>postAsync(this, links, "adhocRendering", AdhocRenderingFile.class, data, bodyContentType);
}

    /**
    * Calls the HTTP post Method on the link for the relation "AdhocRendering" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<AdhocRenderingFile>> postToAdhocRenderingRelationForAdhocRenderingFileAsync(InputStream data, String bodyContentType, CancellationToken ct) { 
        return MethodInvocation.<AdhocRenderingFile, InputStream>postAsync(this, links, "adhocRendering", AdhocRenderingFile.class, data, bodyContentType, ct);
}

    /**
    * Gets the Uri of the Link for the relation "RootSchema".
    * Returns the Uri of the Link for the relation "RootSchema", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getRootSchemaRelationLink() {
        return MethodInvocation.getLink(this, links, "rootSchema");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "RootSchema".
    */
    public URI getURIFromRootSchemaRelation() {
        return MethodInvocation.<URI>get(this, links, "rootSchema", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "RootSchema" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromRootSchemaRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "rootSchema", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "RootSchema" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromRootSchemaRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "rootSchema", URI.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Log".
    * Returns the Uri of the Link for the relation "Log", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getLogRelationLink() {
        return MethodInvocation.getLink(this, links, "log");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Log".
    */
    public LogMessages getLogMessagesFromLogRelation() {
        return MethodInvocation.<LogMessages>get(this, links, "log", LogMessages.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Log" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<LogMessages>> getLogMessagesFromLogRelationAsync() {
        return MethodInvocation.<LogMessages>getAsync(this, links, "log", LogMessages.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Log" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<LogMessages>> getLogMessagesFromLogRelationAsync(CancellationToken ct) {
        return MethodInvocation.<LogMessages>getAsync(this, links, "log", LogMessages.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "PermanentUrl".
    * Returns the Uri of the Link for the relation "PermanentUrl", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getPermanentUrlRelationLink() {
        return MethodInvocation.getLink(this, links, "permanentUrl");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "PermanentUrl".
    */
    public URI getURIFromPermanentUrlRelation() {
        return MethodInvocation.<URI>get(this, links, "permanentUrl", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "PermanentUrl" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromPermanentUrlRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "permanentUrl", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "PermanentUrl" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromPermanentUrlRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "permanentUrl", URI.class, ct);
    }



}
