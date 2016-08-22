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
import com.docuware.dev.schema._public.services.platform.SelectListValues;
import com.docuware.dev.schema._public.services.platform.SelectListValuesQuery;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.schema._public.services.Links;


/**
 * Select list information object.
 * 
 * <p>Java-Klasse f�r SelectListInfo complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SelectListInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Guid" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Kind" use="required" type="{http://dev.docuware.com/schema/public/services/platform}SelectListKind" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectListInfo", propOrder = {
"proxy",
    "links"
})
public class SelectListInfo  implements IRelationsWithProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;
    @XmlAttribute(name = "Guid", required = true)
    protected String guid;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Kind", required = true)
    protected SelectListKind kind;

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
     * Ruft den Wert der guid-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Legt den Wert der guid-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
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
     * Ruft den Wert der kind-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SelectListKind }
     *     
     */
    public SelectListKind getKind() {
        return kind;
    }

    /**
     * Legt den Wert der kind-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectListKind }
     *     
     */
    public void setKind(SelectListKind value) {
        this.kind = value;
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
    * Gets the Uri of the Link for the relation "Values".
    * Returns the Uri of the Link for the relation "Values", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getValuesRelationLink() {
        return MethodInvocation.getLink(this, links, "values");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Values".
    */
    public SelectListValues getSelectListValuesFromValuesRelation() {
        return MethodInvocation.<SelectListValues>get(this, links, "values", SelectListValues.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Values" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<SelectListValues>> getSelectListValuesFromValuesRelationAsync() {
        return MethodInvocation.<SelectListValues>getAsync(this, links, "values", SelectListValues.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Values" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<SelectListValues>> getSelectListValuesFromValuesRelationAsync(CancellationToken ct) {
        return MethodInvocation.<SelectListValues>getAsync(this, links, "values", SelectListValues.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Values".
    */
    public SelectListValues postToValuesRelationForSelectListValues(SelectListValuesQuery data) {
        return MethodInvocation.<SelectListValues,SelectListValuesQuery>post(this, links, "values", SelectListValues.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "SelectListValuesQuery"), SelectListValuesQuery.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Values" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<SelectListValues>> postToValuesRelationForSelectListValuesAsync(SelectListValuesQuery data) {
        return MethodInvocation.<SelectListValues, SelectListValuesQuery >postAsync(this, links, "values", SelectListValues.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "SelectListValuesQuery"), SelectListValuesQuery.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Values" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<SelectListValues>> postToValuesRelationForSelectListValuesAsync(SelectListValuesQuery data, CancellationToken ct) {
        return MethodInvocation.<SelectListValues, SelectListValuesQuery >postAsync(this, links, "values", SelectListValues.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "SelectListValuesQuery"), SelectListValuesQuery.class, null, data), ct);
    }



}
