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
import com.docuware.dev.schema._public.services.platform.XmlSchemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.schema._public.services.Links;


/**
 * <p>Java-Klasse f�r ServiceDescriptionDocumentation complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ServiceDescriptionDocumentation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
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
@XmlType(name = "ServiceDescriptionDocumentation", propOrder = {
"proxy",
    "links"
})
public class ServiceDescriptionDocumentation  implements IRelationsWithProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;

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

    public URI getLinkModelOverviewRelationLink() {
        return MethodInvocation.getLink(this, links, "linkModelOverview");
    }

    public URI getURIFromLinkModelOverviewRelation() {
        return MethodInvocation.<URI>get(this, links, "linkModelOverview", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromLinkModelOverviewRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "linkModelOverview", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromLinkModelOverviewRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "linkModelOverview", URI.class, ct);
    }

    public URI getSchemasRelationLink() {
        return MethodInvocation.getLink(this, links, "schemas");
    }

    public XmlSchemas getXmlSchemasFromSchemasRelation() {
        return MethodInvocation.<XmlSchemas>get(this, links, "schemas", XmlSchemas.class);
    }

    public Future<DeserializedHttpResponseGen<XmlSchemas>> getXmlSchemasFromSchemasRelationAsync() {
        return MethodInvocation.<XmlSchemas>getAsync(this, links, "schemas", XmlSchemas.class);
    }

    public Future<DeserializedHttpResponseGen<XmlSchemas>> getXmlSchemasFromSchemasRelationAsync(CancellationToken ct) {
        return MethodInvocation.<XmlSchemas>getAsync(this, links, "schemas", XmlSchemas.class, ct);
    }

    public URI getSchemaSearchRelationLink() {
        return MethodInvocation.getLink(this, links, "schemaSearch");
    }

    public URI getURIFromSchemaSearchRelation() {
        return MethodInvocation.<URI>get(this, links, "schemaSearch", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromSchemaSearchRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "schemaSearch", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromSchemaSearchRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "schemaSearch", URI.class, ct);
    }

    public URI getUriTemplatesDocumentationRelationLink() {
        return MethodInvocation.getLink(this, links, "uriTemplatesDocumentation");
    }

    public URI getURIFromUriTemplatesDocumentationRelation() {
        return MethodInvocation.<URI>get(this, links, "uriTemplatesDocumentation", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromUriTemplatesDocumentationRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "uriTemplatesDocumentation", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromUriTemplatesDocumentationRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "uriTemplatesDocumentation", URI.class, ct);
    }



}
