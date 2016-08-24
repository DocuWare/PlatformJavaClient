

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

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links value) {
        this.links = value;
    }

    /**Test applications for platform.*/
    public ServiceDescriptionTests getTests() {
        return tests;
    }

    /**Test applications for platform.*/
    public void setTests(ServiceDescriptionTests value) {
        this.tests = value;
    }

    /**Documentation links for platform.*/
    public ServiceDescriptionDocumentation getDocumentation() {
        return documentation;
    }

    /**Documentation links for platform.*/
    public void setDocumentation(ServiceDescriptionDocumentation value) {
        this.documentation = value;
    }

    /**Resource definitions/templates.*/
    public UriTemplateDescriptions getResources() {
        return resources;
    }

    /**Resource definitions/templates.*/
    public void setResources(UriTemplateDescriptions value) {
        this.resources = value;
    }

    /**Test applications for platform.*/
    public ServiceDescriptionStatistics getStatistics() {
        return statistics;
    }

    /**Test applications for platform.*/
    public void setStatistics(ServiceDescriptionStatistics value) {
        this.statistics = value;
    }

    /**Contains the product version of DocuWare.*/
    @Dolphin
    public String getVersion() {
        return version;
    }

    /**Contains the product version of DocuWare.*/
    @Dolphin
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
    public InputStream getInputStreamFromLoginRelation() {
        return MethodInvocation.<InputStream>get(this, links, "login", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Login" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<InputStream>> getInputStreamFromLoginRelationAsync() {
        return MethodInvocation.<InputStream>getAsync(this, links, "login", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Login" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<InputStream>> getInputStreamFromLoginRelationAsync(CancellationToken ct) {
        return MethodInvocation.<InputStream>getAsync(this, links, "login", InputStream.class, ct);
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
    public InputStream getInputStreamFromGuestLoginRelation() {
        return MethodInvocation.<InputStream>get(this, links, "guestLogin", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "GuestLogin" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<InputStream>> getInputStreamFromGuestLoginRelationAsync() {
        return MethodInvocation.<InputStream>getAsync(this, links, "guestLogin", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "GuestLogin" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<InputStream>> getInputStreamFromGuestLoginRelationAsync(CancellationToken ct) {
        return MethodInvocation.<InputStream>getAsync(this, links, "guestLogin", InputStream.class, ct);
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
    public InputStream getInputStreamFromWindowsLoginRelation() {
        return MethodInvocation.<InputStream>get(this, links, "windowsLogin", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "WindowsLogin" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<InputStream>> getInputStreamFromWindowsLoginRelationAsync() {
        return MethodInvocation.<InputStream>getAsync(this, links, "windowsLogin", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "WindowsLogin" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<InputStream>> getInputStreamFromWindowsLoginRelationAsync(CancellationToken ct) {
        return MethodInvocation.<InputStream>getAsync(this, links, "windowsLogin", InputStream.class, ct);
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
    public InputStream getInputStreamFromChangePasswordRelation() {
        return MethodInvocation.<InputStream>get(this, links, "changePassword", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "ChangePassword" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<InputStream>> getInputStreamFromChangePasswordRelationAsync() {
        return MethodInvocation.<InputStream>getAsync(this, links, "changePassword", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "ChangePassword" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<InputStream>> getInputStreamFromChangePasswordRelationAsync(CancellationToken ct) {
        return MethodInvocation.<InputStream>getAsync(this, links, "changePassword", InputStream.class, ct);
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
    public InputStream getInputStreamFromResetPasswordRelation() {
        return MethodInvocation.<InputStream>get(this, links, "resetPassword", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "ResetPassword" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<InputStream>> getInputStreamFromResetPasswordRelationAsync() {
        return MethodInvocation.<InputStream>getAsync(this, links, "resetPassword", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "ResetPassword" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<InputStream>> getInputStreamFromResetPasswordRelationAsync(CancellationToken ct) {
        return MethodInvocation.<InputStream>getAsync(this, links, "resetPassword", InputStream.class, ct);
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
    public InputStream getInputStreamFromTokenLoginRelation() {
        return MethodInvocation.<InputStream>get(this, links, "tokenLogin", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "TokenLogin" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<InputStream>> getInputStreamFromTokenLoginRelationAsync() {
        return MethodInvocation.<InputStream>getAsync(this, links, "tokenLogin", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "TokenLogin" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<InputStream>> getInputStreamFromTokenLoginRelationAsync(CancellationToken ct) {
        return MethodInvocation.<InputStream>getAsync(this, links, "tokenLogin", InputStream.class, ct);
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
    public InputStream getInputStreamFromTrustedLoginRelation() {
        return MethodInvocation.<InputStream>get(this, links, "trustedLogin", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "TrustedLogin" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<InputStream>> getInputStreamFromTrustedLoginRelationAsync() {
        return MethodInvocation.<InputStream>getAsync(this, links, "trustedLogin", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "TrustedLogin" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<InputStream>> getInputStreamFromTrustedLoginRelationAsync(CancellationToken ct) {
        return MethodInvocation.<InputStream>getAsync(this, links, "trustedLogin", InputStream.class, ct);
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
    public InputStream getInputStreamFromLogoutRelation() {
        return MethodInvocation.<InputStream>get(this, links, "logout", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Logout" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<InputStream>> getInputStreamFromLogoutRelationAsync() {
        return MethodInvocation.<InputStream>getAsync(this, links, "logout", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Logout" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<InputStream>> getInputStreamFromLogoutRelationAsync(CancellationToken ct) {
        return MethodInvocation.<InputStream>getAsync(this, links, "logout", InputStream.class, ct);
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
    public InputStream getInputStreamFromDisconnectRelation() {
        return MethodInvocation.<InputStream>get(this, links, "disconnect", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Disconnect" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<InputStream>> getInputStreamFromDisconnectRelationAsync() {
        return MethodInvocation.<InputStream>getAsync(this, links, "disconnect", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Disconnect" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<InputStream>> getInputStreamFromDisconnectRelationAsync(CancellationToken ct) {
        return MethodInvocation.<InputStream>getAsync(this, links, "disconnect", InputStream.class, ct);
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
    public InputStream getInputStreamFromLoginCookieRelation() {
        return MethodInvocation.<InputStream>get(this, links, "loginCookie", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "LoginCookie" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<InputStream>> getInputStreamFromLoginCookieRelationAsync() {
        return MethodInvocation.<InputStream>getAsync(this, links, "loginCookie", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "LoginCookie" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<InputStream>> getInputStreamFromLoginCookieRelationAsync(CancellationToken ct) {
        return MethodInvocation.<InputStream>getAsync(this, links, "loginCookie", InputStream.class, ct);
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
    public InputStream getInputStreamFromRootSchemaRelation() {
        return MethodInvocation.<InputStream>get(this, links, "rootSchema", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "RootSchema" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<InputStream>> getInputStreamFromRootSchemaRelationAsync() {
        return MethodInvocation.<InputStream>getAsync(this, links, "rootSchema", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "RootSchema" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<InputStream>> getInputStreamFromRootSchemaRelationAsync(CancellationToken ct) {
        return MethodInvocation.<InputStream>getAsync(this, links, "rootSchema", InputStream.class, ct);
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
    public InputStream getInputStreamFromPermanentUrlRelation() {
        return MethodInvocation.<InputStream>get(this, links, "permanentUrl", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "PermanentUrl" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<InputStream>> getInputStreamFromPermanentUrlRelationAsync() {
        return MethodInvocation.<InputStream>getAsync(this, links, "permanentUrl", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "PermanentUrl" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<InputStream>> getInputStreamFromPermanentUrlRelationAsync(CancellationToken ct) {
        return MethodInvocation.<InputStream>getAsync(this, links, "permanentUrl", InputStream.class, ct);
    }



}
