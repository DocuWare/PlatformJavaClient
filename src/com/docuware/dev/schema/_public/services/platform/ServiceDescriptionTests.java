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
import com.docuware.dev.schema._public.services.platform.StampPlacement;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import com.docuware.dev.schema._public.services.platform.DialogExpression;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.schema._public.services.Links;


/**
 * <p>Java-Klasse f�r ServiceDescriptionTests complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="ServiceDescriptionTests">
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
@XmlType(name = "ServiceDescriptionTests", propOrder = {
"proxy",
    "links"
})
public class ServiceDescriptionTests  implements IRelationsWithProxy {
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

    public URI getHtmlTestClientRelationLink() {
        return MethodInvocation.getLink(this, links, "htmlTestClient");
    }

    public URI getURIFromHtmlTestClientRelation() {
        return MethodInvocation.<URI>get(this, links, "htmlTestClient", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromHtmlTestClientRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "htmlTestClient", URI.class);
    }

    public URI getReflectStampPlacementRelationLink() {
        return MethodInvocation.getLink(this, links, "reflectStampPlacement");
    }

    public StampPlacement postToReflectStampPlacementRelationForStampPlacement(StampPlacement data) {
        return MethodInvocation.<StampPlacement,StampPlacement>post(this, links, "reflectStampPlacement", StampPlacement.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "StampPlacement"), StampPlacement.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<StampPlacement>> postToReflectStampPlacementRelationForStampPlacementAsync(StampPlacement data) {
        return MethodInvocation.<StampPlacement, StampPlacement >postAsync(this, links, "reflectStampPlacement", StampPlacement.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "StampPlacement"), StampPlacement.class, null, data));
    }

    public URI getReflectDialogQueryRelationLink() {
        return MethodInvocation.getLink(this, links, "reflectDialogQuery");
    }

    public DialogExpression postToReflectDialogQueryRelationForDialogExpression(DialogExpression data) {
        return MethodInvocation.<DialogExpression,DialogExpression>post(this, links, "reflectDialogQuery", DialogExpression.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DialogExpression"), DialogExpression.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<DialogExpression>> postToReflectDialogQueryRelationForDialogExpressionAsync(DialogExpression data) {
        return MethodInvocation.<DialogExpression, DialogExpression >postAsync(this, links, "reflectDialogQuery", DialogExpression.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DialogExpression"), DialogExpression.class, null, data));
    }

    public URI getQueryStringRelationLink() {
        return MethodInvocation.getLink(this, links, "queryString");
    }

    public URI getURIFromQueryStringRelation() {
        return MethodInvocation.<URI>get(this, links, "queryString", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromQueryStringRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "queryString", URI.class);
    }



}
