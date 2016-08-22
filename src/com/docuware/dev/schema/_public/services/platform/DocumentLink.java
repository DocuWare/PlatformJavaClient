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
import com.docuware.dev.schema._public.services.platform.DocumentsQueryResult;
import com.docuware.dev.schema._public.services.platform.ResultListQuery;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import com.docuware.dev.schema._public.services.platform.Dialog;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.schema._public.services.Links;


/**
 * Define a query that link one documnet to another document from same or different file cabinet
 * 
 * <p>Java-Klasse f�r DocumentLink complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DocumentLink">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TargetFileCabinet" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TargetResultList" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentLink", propOrder = {
"proxy",
    "links"
})
public class DocumentLink  implements IRelationsWithProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services")
    protected Links links;
    @XmlAttribute(name = "Id", required = true)
    protected String id;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "TargetFileCabinet", required = true)
    protected String targetFileCabinet;
    @XmlAttribute(name = "TargetResultList", required = true)
    protected String targetResultList;

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
     * Ruft den Wert der targetFileCabinet-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetFileCabinet() {
        return targetFileCabinet;
    }

    /**
     * Legt den Wert der targetFileCabinet-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetFileCabinet(String value) {
        this.targetFileCabinet = value;
    }

    /**
     * Ruft den Wert der targetResultList-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetResultList() {
        return targetResultList;
    }

    /**
     * Legt den Wert der targetResultList-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetResultList(String value) {
        this.targetResultList = value;
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
    * Gets the Uri of the Link for the relation "Result".
    * Returns the Uri of the Link for the relation "Result", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getResultRelationLink() {
        return MethodInvocation.getLink(this, links, "result");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Result".
    */
    public DocumentsQueryResult getDocumentsQueryResultFromResultRelation() {
        return MethodInvocation.<DocumentsQueryResult>get(this, links, "result", DocumentsQueryResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Result" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentsQueryResult>> getDocumentsQueryResultFromResultRelationAsync() {
        return MethodInvocation.<DocumentsQueryResult>getAsync(this, links, "result", DocumentsQueryResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Result" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentsQueryResult>> getDocumentsQueryResultFromResultRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DocumentsQueryResult>getAsync(this, links, "result", DocumentsQueryResult.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Result".
    */
    public DocumentsQueryResult postToResultRelationForDocumentsQueryResult(ResultListQuery data) {
        return MethodInvocation.<DocumentsQueryResult,ResultListQuery>post(this, links, "result", DocumentsQueryResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ResultListQuery"), ResultListQuery.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Result" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentsQueryResult>> postToResultRelationForDocumentsQueryResultAsync(ResultListQuery data) {
        return MethodInvocation.<DocumentsQueryResult, ResultListQuery >postAsync(this, links, "result", DocumentsQueryResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ResultListQuery"), ResultListQuery.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Result" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentsQueryResult>> postToResultRelationForDocumentsQueryResultAsync(ResultListQuery data, CancellationToken ct) {
        return MethodInvocation.<DocumentsQueryResult, ResultListQuery >postAsync(this, links, "result", DocumentsQueryResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ResultListQuery"), ResultListQuery.class, null, data), ct);
    }

    /**
    * Gets the Uri of the Link for the relation "ResultDialog".
    * Returns the Uri of the Link for the relation "ResultDialog", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getResultDialogRelationLink() {
        return MethodInvocation.getLink(this, links, "resultDialog");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "ResultDialog".
    */
    public Dialog getDialogFromResultDialogRelation() {
        return MethodInvocation.<Dialog>get(this, links, "resultDialog", Dialog.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "ResultDialog" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Dialog>> getDialogFromResultDialogRelationAsync() {
        return MethodInvocation.<Dialog>getAsync(this, links, "resultDialog", Dialog.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "ResultDialog" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Dialog>> getDialogFromResultDialogRelationAsync(CancellationToken ct) {
        return MethodInvocation.<Dialog>getAsync(this, links, "resultDialog", Dialog.class, ct);
    }



}
