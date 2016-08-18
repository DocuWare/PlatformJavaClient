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
import com.docuware.dev.schema._public.services.platform.Dialog;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.schema._public.services.Links;


/**
 * Dialog properties specific for Tree list
 * 
 * <p>Java-Klasse f�r DialogPropertiesTreeView complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DialogPropertiesTreeView">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}DialogProperties">
 *       &lt;sequence>
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links"/>
 *       &lt;/sequence>
 *       &lt;attribute name="StoreDialogId" type="{http://www.w3.org/2001/XMLSchema}string" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DialogPropertiesTreeView", propOrder = {
"proxy",
    "links"
})
public class DialogPropertiesTreeView
    extends DialogProperties
 implements IRelationsWithProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;
    @XmlAttribute(name = "StoreDialogId")
    protected String storeDialogId;

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
     * Ruft den Wert der storeDialogId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoreDialogId() {
        if (storeDialogId == null) {
            return "false";
        } else {
            return storeDialogId;
        }
    }

    /**
     * Legt den Wert der storeDialogId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoreDialogId(String value) {
        this.storeDialogId = value;
    }

    public HttpClientProxy getProxy() {
	return this.proxy;
    }

    public void setProxy(HttpClientProxy proxy) {
	super.setProxy(proxy);
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

    public URI getStoreDialogRelationLink() {
        return MethodInvocation.getLink(this, links, "storeDialog");
    }

    public Dialog getDialogFromStoreDialogRelation() {
        return MethodInvocation.<Dialog>get(this, links, "storeDialog", Dialog.class);
    }

    public Future<DeserializedHttpResponseGen<Dialog>> getDialogFromStoreDialogRelationAsync() {
        return MethodInvocation.<Dialog>getAsync(this, links, "storeDialog", Dialog.class);
    }

    public Future<DeserializedHttpResponseGen<Dialog>> getDialogFromStoreDialogRelationAsync(CancellationToken ct) {
        return MethodInvocation.<Dialog>getAsync(this, links, "storeDialog", Dialog.class, ct);
    }



}
