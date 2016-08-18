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

    public HttpClientProxy getProxy() { return this.proxy; 
    }

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

    public URI getOrganizationsRelationLink() {
        return MethodInvocation.getLink(this, links, "organizations");
    }

    public Organizations getOrganizationsFromOrganizationsRelation() {
        return MethodInvocation.<Organizations>get(this, links, "organizations", Organizations.class);
    }

    public Future<DeserializedHttpResponseGen<Organizations>> getOrganizationsFromOrganizationsRelationAsync() {
        return MethodInvocation.<Organizations>getAsync(this, links, "organizations", Organizations.class);
    }

    public Future<DeserializedHttpResponseGen<Organizations>> getOrganizationsFromOrganizationsRelationAsync(CancellationToken ct) {
        return MethodInvocation.<Organizations>getAsync(this, links, "organizations", Organizations.class, ct);
    }

    public URI getLoginRelationLink() {
        return MethodInvocation.getLink(this, links, "login");
    }

    public URI getURIFromLoginRelation() {
        return MethodInvocation.<URI>get(this, links, "login", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromLoginRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "login", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromLoginRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "login", URI.class, ct);
    }

    public String postToLoginRelationForString(InputStream data, String bodyContentType) {
        return MethodInvocation.<String, InputStream>post(this, links, "login", String.class, data, bodyContentType);
    }

    public Future<DeserializedHttpResponseGen<String>> postToLoginRelationForStringAsync(InputStream data, String bodyContentType) { 
        return MethodInvocation.<String, InputStream>postAsync(this, links, "login", String.class, data, bodyContentType);
}

    public Future<DeserializedHttpResponseGen<String>> postToLoginRelationForStringAsync(InputStream data, String bodyContentType, CancellationToken ct) { 
        return MethodInvocation.<String, InputStream>postAsync(this, links, "login", String.class, data, bodyContentType, ct);
}

    public URI getGuestLoginRelationLink() {
        return MethodInvocation.getLink(this, links, "guestLogin");
    }

    public URI getURIFromGuestLoginRelation() {
        return MethodInvocation.<URI>get(this, links, "guestLogin", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromGuestLoginRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "guestLogin", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromGuestLoginRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "guestLogin", URI.class, ct);
    }

    public String postToGuestLoginRelationForString(InputStream data, String bodyContentType) {
        return MethodInvocation.<String, InputStream>post(this, links, "guestLogin", String.class, data, bodyContentType);
    }

    public Future<DeserializedHttpResponseGen<String>> postToGuestLoginRelationForStringAsync(InputStream data, String bodyContentType) { 
        return MethodInvocation.<String, InputStream>postAsync(this, links, "guestLogin", String.class, data, bodyContentType);
}

    public Future<DeserializedHttpResponseGen<String>> postToGuestLoginRelationForStringAsync(InputStream data, String bodyContentType, CancellationToken ct) { 
        return MethodInvocation.<String, InputStream>postAsync(this, links, "guestLogin", String.class, data, bodyContentType, ct);
}

    public URI getWindowsLoginRelationLink() {
        return MethodInvocation.getLink(this, links, "windowsLogin");
    }

    public URI getURIFromWindowsLoginRelation() {
        return MethodInvocation.<URI>get(this, links, "windowsLogin", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromWindowsLoginRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "windowsLogin", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromWindowsLoginRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "windowsLogin", URI.class, ct);
    }

    public String postToWindowsLoginRelationForString(InputStream data, String bodyContentType) {
        return MethodInvocation.<String, InputStream>post(this, links, "windowsLogin", String.class, data, bodyContentType);
    }

    public Future<DeserializedHttpResponseGen<String>> postToWindowsLoginRelationForStringAsync(InputStream data, String bodyContentType) { 
        return MethodInvocation.<String, InputStream>postAsync(this, links, "windowsLogin", String.class, data, bodyContentType);
}

    public Future<DeserializedHttpResponseGen<String>> postToWindowsLoginRelationForStringAsync(InputStream data, String bodyContentType, CancellationToken ct) { 
        return MethodInvocation.<String, InputStream>postAsync(this, links, "windowsLogin", String.class, data, bodyContentType, ct);
}

    public URI getChangePasswordRelationLink() {
        return MethodInvocation.getLink(this, links, "changePassword");
    }

    public URI getURIFromChangePasswordRelation() {
        return MethodInvocation.<URI>get(this, links, "changePassword", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromChangePasswordRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "changePassword", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromChangePasswordRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "changePassword", URI.class, ct);
    }

    public String postToChangePasswordRelationForString(InputStream data, String bodyContentType) {
        return MethodInvocation.<String, InputStream>post(this, links, "changePassword", String.class, data, bodyContentType);
    }

    public Future<DeserializedHttpResponseGen<String>> postToChangePasswordRelationForStringAsync(InputStream data, String bodyContentType) { 
        return MethodInvocation.<String, InputStream>postAsync(this, links, "changePassword", String.class, data, bodyContentType);
}

    public Future<DeserializedHttpResponseGen<String>> postToChangePasswordRelationForStringAsync(InputStream data, String bodyContentType, CancellationToken ct) { 
        return MethodInvocation.<String, InputStream>postAsync(this, links, "changePassword", String.class, data, bodyContentType, ct);
}

    public URI getResetPasswordRelationLink() {
        return MethodInvocation.getLink(this, links, "resetPassword");
    }

    public URI getURIFromResetPasswordRelation() {
        return MethodInvocation.<URI>get(this, links, "resetPassword", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromResetPasswordRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "resetPassword", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromResetPasswordRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "resetPassword", URI.class, ct);
    }

    public String postToResetPasswordRelationForString(InputStream data, String bodyContentType) {
        return MethodInvocation.<String, InputStream>post(this, links, "resetPassword", String.class, data, bodyContentType);
    }

    public Future<DeserializedHttpResponseGen<String>> postToResetPasswordRelationForStringAsync(InputStream data, String bodyContentType) { 
        return MethodInvocation.<String, InputStream>postAsync(this, links, "resetPassword", String.class, data, bodyContentType);
}

    public Future<DeserializedHttpResponseGen<String>> postToResetPasswordRelationForStringAsync(InputStream data, String bodyContentType, CancellationToken ct) { 
        return MethodInvocation.<String, InputStream>postAsync(this, links, "resetPassword", String.class, data, bodyContentType, ct);
}

    public URI getTokenLoginRelationLink() {
        return MethodInvocation.getLink(this, links, "tokenLogin");
    }

    public URI getURIFromTokenLoginRelation() {
        return MethodInvocation.<URI>get(this, links, "tokenLogin", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromTokenLoginRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "tokenLogin", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromTokenLoginRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "tokenLogin", URI.class, ct);
    }

    public String postToTokenLoginRelationForString(InputStream data, String bodyContentType) {
        return MethodInvocation.<String, InputStream>post(this, links, "tokenLogin", String.class, data, bodyContentType);
    }

    public Future<DeserializedHttpResponseGen<String>> postToTokenLoginRelationForStringAsync(InputStream data, String bodyContentType) { 
        return MethodInvocation.<String, InputStream>postAsync(this, links, "tokenLogin", String.class, data, bodyContentType);
}

    public Future<DeserializedHttpResponseGen<String>> postToTokenLoginRelationForStringAsync(InputStream data, String bodyContentType, CancellationToken ct) { 
        return MethodInvocation.<String, InputStream>postAsync(this, links, "tokenLogin", String.class, data, bodyContentType, ct);
}

    public URI getTrustedLoginRelationLink() {
        return MethodInvocation.getLink(this, links, "trustedLogin");
    }

    public URI getURIFromTrustedLoginRelation() {
        return MethodInvocation.<URI>get(this, links, "trustedLogin", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromTrustedLoginRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "trustedLogin", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromTrustedLoginRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "trustedLogin", URI.class, ct);
    }

    public String postToTrustedLoginRelationForString(InputStream data, String bodyContentType) {
        return MethodInvocation.<String, InputStream>post(this, links, "trustedLogin", String.class, data, bodyContentType);
    }

    public Future<DeserializedHttpResponseGen<String>> postToTrustedLoginRelationForStringAsync(InputStream data, String bodyContentType) { 
        return MethodInvocation.<String, InputStream>postAsync(this, links, "trustedLogin", String.class, data, bodyContentType);
}

    public Future<DeserializedHttpResponseGen<String>> postToTrustedLoginRelationForStringAsync(InputStream data, String bodyContentType, CancellationToken ct) { 
        return MethodInvocation.<String, InputStream>postAsync(this, links, "trustedLogin", String.class, data, bodyContentType, ct);
}

    public URI getLogoutRelationLink() {
        return MethodInvocation.getLink(this, links, "logout");
    }

    public URI getURIFromLogoutRelation() {
        return MethodInvocation.<URI>get(this, links, "logout", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromLogoutRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "logout", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromLogoutRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "logout", URI.class, ct);
    }

    public URI getDisconnectRelationLink() {
        return MethodInvocation.getLink(this, links, "disconnect");
    }

    public URI getURIFromDisconnectRelation() {
        return MethodInvocation.<URI>get(this, links, "disconnect", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromDisconnectRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "disconnect", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromDisconnectRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "disconnect", URI.class, ct);
    }

    public URI getLoginCookieRelationLink() {
        return MethodInvocation.getLink(this, links, "loginCookie");
    }

    public URI getURIFromLoginCookieRelation() {
        return MethodInvocation.<URI>get(this, links, "loginCookie", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromLoginCookieRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "loginCookie", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromLoginCookieRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "loginCookie", URI.class, ct);
    }

    public URI getUriTemplatesRelationLink() {
        return MethodInvocation.getLink(this, links, "uriTemplates");
    }

    public UriTemplateDescriptions getUriTemplateDescriptionsFromUriTemplatesRelation() {
        return MethodInvocation.<UriTemplateDescriptions>get(this, links, "uriTemplates", UriTemplateDescriptions.class);
    }

    public Future<DeserializedHttpResponseGen<UriTemplateDescriptions>> getUriTemplateDescriptionsFromUriTemplatesRelationAsync() {
        return MethodInvocation.<UriTemplateDescriptions>getAsync(this, links, "uriTemplates", UriTemplateDescriptions.class);
    }

    public Future<DeserializedHttpResponseGen<UriTemplateDescriptions>> getUriTemplateDescriptionsFromUriTemplatesRelationAsync(CancellationToken ct) {
        return MethodInvocation.<UriTemplateDescriptions>getAsync(this, links, "uriTemplates", UriTemplateDescriptions.class, ct);
    }

    public URI getAdhocRenderingRelationLink() {
        return MethodInvocation.getLink(this, links, "adhocRendering");
    }

    public AdhocRenderingFiles getAdhocRenderingFilesFromAdhocRenderingRelation() {
        return MethodInvocation.<AdhocRenderingFiles>get(this, links, "adhocRendering", AdhocRenderingFiles.class);
    }

    public Future<DeserializedHttpResponseGen<AdhocRenderingFiles>> getAdhocRenderingFilesFromAdhocRenderingRelationAsync() {
        return MethodInvocation.<AdhocRenderingFiles>getAsync(this, links, "adhocRendering", AdhocRenderingFiles.class);
    }

    public Future<DeserializedHttpResponseGen<AdhocRenderingFiles>> getAdhocRenderingFilesFromAdhocRenderingRelationAsync(CancellationToken ct) {
        return MethodInvocation.<AdhocRenderingFiles>getAsync(this, links, "adhocRendering", AdhocRenderingFiles.class, ct);
    }

    public AdhocRenderingFile postToAdhocRenderingRelationForAdhocRenderingFile(InputStream data, String bodyContentType) {
        return MethodInvocation.<AdhocRenderingFile, InputStream>post(this, links, "adhocRendering", AdhocRenderingFile.class, data, bodyContentType);
    }

    public Future<DeserializedHttpResponseGen<AdhocRenderingFile>> postToAdhocRenderingRelationForAdhocRenderingFileAsync(InputStream data, String bodyContentType) { 
        return MethodInvocation.<AdhocRenderingFile, InputStream>postAsync(this, links, "adhocRendering", AdhocRenderingFile.class, data, bodyContentType);
}

    public Future<DeserializedHttpResponseGen<AdhocRenderingFile>> postToAdhocRenderingRelationForAdhocRenderingFileAsync(InputStream data, String bodyContentType, CancellationToken ct) { 
        return MethodInvocation.<AdhocRenderingFile, InputStream>postAsync(this, links, "adhocRendering", AdhocRenderingFile.class, data, bodyContentType, ct);
}

    public URI getRootSchemaRelationLink() {
        return MethodInvocation.getLink(this, links, "rootSchema");
    }

    public URI getURIFromRootSchemaRelation() {
        return MethodInvocation.<URI>get(this, links, "rootSchema", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromRootSchemaRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "rootSchema", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromRootSchemaRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "rootSchema", URI.class, ct);
    }

    public URI getLogRelationLink() {
        return MethodInvocation.getLink(this, links, "log");
    }

    public LogMessages getLogMessagesFromLogRelation() {
        return MethodInvocation.<LogMessages>get(this, links, "log", LogMessages.class);
    }

    public Future<DeserializedHttpResponseGen<LogMessages>> getLogMessagesFromLogRelationAsync() {
        return MethodInvocation.<LogMessages>getAsync(this, links, "log", LogMessages.class);
    }

    public Future<DeserializedHttpResponseGen<LogMessages>> getLogMessagesFromLogRelationAsync(CancellationToken ct) {
        return MethodInvocation.<LogMessages>getAsync(this, links, "log", LogMessages.class, ct);
    }

    public URI getPermanentUrlRelationLink() {
        return MethodInvocation.getLink(this, links, "permanentUrl");
    }

    public URI getURIFromPermanentUrlRelation() {
        return MethodInvocation.<URI>get(this, links, "permanentUrl", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromPermanentUrlRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "permanentUrl", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromPermanentUrlRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "permanentUrl", URI.class, ct);
    }



}
