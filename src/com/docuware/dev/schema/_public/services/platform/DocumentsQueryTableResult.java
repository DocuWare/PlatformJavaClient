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
import com.docuware.dev.schema._public.services.platform.DocumentsQueryTableResult;
import com.docuware.dev.schema._public.services.platform.BatchUpdateIndexFieldsResult;
import com.docuware.dev.schema._public.services.platform.BatchUpdateProcessData;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import com.docuware.dev.schema._public.services.platform.Dialog;
import com.docuware.dev.schema._public.services.platform.UserDefinedSearchInfo;
import com.docuware.dev.schema._public.services.platform.ExportSettings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.schema._public.services.Links;


/**
 * Define table result from document query
 * 
 * <p>Java-Klasse f�r DocumentsQueryTableResult complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DocumentsQueryTableResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Headers">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Header" type="{http://dev.docuware.com/schema/public/services/platform}DocumentsQueryTableResultHeader" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="Items" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
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
@XmlType(name = "DocumentsQueryTableResult", propOrder = {
"proxy",
    "headers",
    "items",
    "links"
})
public class DocumentsQueryTableResult  implements IRelationsWithProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Headers", required = true)
    protected DocumentsQueryTableResult.Headers headers;
    @XmlElement(name = "Items")
    protected List<Object> items;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;

    /**
     * Ruft den Wert der headers-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DocumentsQueryTableResult.Headers }
     *     
     */
    public DocumentsQueryTableResult.Headers getHeaders() {
        return headers;
    }

    /**
     * Legt den Wert der headers-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentsQueryTableResult.Headers }
     *     
     */
    public void setHeaders(DocumentsQueryTableResult.Headers value) {
        this.headers = value;
    }

    /**
     * Gets the value of the items property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the items property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getItems() {
        if (items == null) {
            items = new ArrayList<Object>();
        }
        return this.items;
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
     * <p>Java-Klasse f�r anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Header" type="{http://dev.docuware.com/schema/public/services/platform}DocumentsQueryTableResultHeader" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "header"
    })
    public static class Headers {

        @XmlElement(name = "Header")
        protected List<DocumentsQueryTableResultHeader> header;

        /**
         * Gets the value of the header property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the header property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHeader().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DocumentsQueryTableResultHeader }
         * 
         * 
         */
        public List<DocumentsQueryTableResultHeader> getHeader() {
            if (header == null) {
                header = new ArrayList<DocumentsQueryTableResultHeader>();
            }
            return this.header;
        }

    }

    public HttpClientProxy getProxy() {
	return this.proxy;
    }

    public void setProxy(HttpClientProxy proxy) {
	this.proxy = proxy;
	//if(this.rows!=null) {
    //    for (int i = 0; (i < this.rows.getRow().size()); i = (i + 1)) {
    //        this.rows.getRow().get(i).setProxy(proxy);
    //    }
	//}
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

    public URI getNextRelationLink() {
        return MethodInvocation.getLink(this, links, "next");
    }

    public DocumentsQueryTableResult getDocumentsQueryTableResultFromNextRelation() {
        return MethodInvocation.<DocumentsQueryTableResult>get(this, links, "next", DocumentsQueryTableResult.class);
    }

    public Future<DeserializedHttpResponseGen<DocumentsQueryTableResult>> getDocumentsQueryTableResultFromNextRelationAsync() {
        return MethodInvocation.<DocumentsQueryTableResult>getAsync(this, links, "next", DocumentsQueryTableResult.class);
    }

    public Future<DeserializedHttpResponseGen<DocumentsQueryTableResult>> getDocumentsQueryTableResultFromNextRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DocumentsQueryTableResult>getAsync(this, links, "next", DocumentsQueryTableResult.class, ct);
    }

    public URI getPrevRelationLink() {
        return MethodInvocation.getLink(this, links, "prev");
    }

    public DocumentsQueryTableResult getDocumentsQueryTableResultFromPrevRelation() {
        return MethodInvocation.<DocumentsQueryTableResult>get(this, links, "prev", DocumentsQueryTableResult.class);
    }

    public Future<DeserializedHttpResponseGen<DocumentsQueryTableResult>> getDocumentsQueryTableResultFromPrevRelationAsync() {
        return MethodInvocation.<DocumentsQueryTableResult>getAsync(this, links, "prev", DocumentsQueryTableResult.class);
    }

    public Future<DeserializedHttpResponseGen<DocumentsQueryTableResult>> getDocumentsQueryTableResultFromPrevRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DocumentsQueryTableResult>getAsync(this, links, "prev", DocumentsQueryTableResult.class, ct);
    }

    public URI getSelfRelationLink() {
        return MethodInvocation.getLink(this, links, "self");
    }

    public DocumentsQueryTableResult getDocumentsQueryTableResultFromSelfRelation() {
        return MethodInvocation.<DocumentsQueryTableResult>get(this, links, "self", DocumentsQueryTableResult.class);
    }

    public Future<DeserializedHttpResponseGen<DocumentsQueryTableResult>> getDocumentsQueryTableResultFromSelfRelationAsync() {
        return MethodInvocation.<DocumentsQueryTableResult>getAsync(this, links, "self", DocumentsQueryTableResult.class);
    }

    public Future<DeserializedHttpResponseGen<DocumentsQueryTableResult>> getDocumentsQueryTableResultFromSelfRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DocumentsQueryTableResult>getAsync(this, links, "self", DocumentsQueryTableResult.class, ct);
    }

    public URI getFirstRelationLink() {
        return MethodInvocation.getLink(this, links, "first");
    }

    public DocumentsQueryTableResult getDocumentsQueryTableResultFromFirstRelation() {
        return MethodInvocation.<DocumentsQueryTableResult>get(this, links, "first", DocumentsQueryTableResult.class);
    }

    public Future<DeserializedHttpResponseGen<DocumentsQueryTableResult>> getDocumentsQueryTableResultFromFirstRelationAsync() {
        return MethodInvocation.<DocumentsQueryTableResult>getAsync(this, links, "first", DocumentsQueryTableResult.class);
    }

    public Future<DeserializedHttpResponseGen<DocumentsQueryTableResult>> getDocumentsQueryTableResultFromFirstRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DocumentsQueryTableResult>getAsync(this, links, "first", DocumentsQueryTableResult.class, ct);
    }

    public URI getFeedRelationLink() {
        return MethodInvocation.getLink(this, links, "feed");
    }

    public URI getURIFromFeedRelation() {
        return MethodInvocation.<URI>get(this, links, "feed", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromFeedRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "feed", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromFeedRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "feed", URI.class, ct);
    }

    public URI getDownloadRelationLink() {
        return MethodInvocation.getLink(this, links, "download");
    }

    public DocumentsQueryTableResult getDocumentsQueryTableResultFromDownloadRelation() {
        return MethodInvocation.<DocumentsQueryTableResult>get(this, links, "download", DocumentsQueryTableResult.class);
    }

    public Future<DeserializedHttpResponseGen<DocumentsQueryTableResult>> getDocumentsQueryTableResultFromDownloadRelationAsync() {
        return MethodInvocation.<DocumentsQueryTableResult>getAsync(this, links, "download", DocumentsQueryTableResult.class);
    }

    public Future<DeserializedHttpResponseGen<DocumentsQueryTableResult>> getDocumentsQueryTableResultFromDownloadRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DocumentsQueryTableResult>getAsync(this, links, "download", DocumentsQueryTableResult.class, ct);
    }

    public URI getBatchUpdateRelationLink() {
        return MethodInvocation.getLink(this, links, "batchUpdate");
    }

    public BatchUpdateIndexFieldsResult postToBatchUpdateRelationForBatchUpdateIndexFieldsResult(BatchUpdateProcessData data) {
        return MethodInvocation.<BatchUpdateIndexFieldsResult,BatchUpdateProcessData>post(this, links, "batchUpdate", BatchUpdateIndexFieldsResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "BatchUpdateProcessData"), BatchUpdateProcessData.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<BatchUpdateIndexFieldsResult>> postToBatchUpdateRelationForBatchUpdateIndexFieldsResultAsync(BatchUpdateProcessData data) {
        return MethodInvocation.<BatchUpdateIndexFieldsResult, BatchUpdateProcessData >postAsync(this, links, "batchUpdate", BatchUpdateIndexFieldsResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "BatchUpdateProcessData"), BatchUpdateProcessData.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<BatchUpdateIndexFieldsResult>> postToBatchUpdateRelationForBatchUpdateIndexFieldsResultAsync(BatchUpdateProcessData data, CancellationToken ct) {
        return MethodInvocation.<BatchUpdateIndexFieldsResult, BatchUpdateProcessData >postAsync(this, links, "batchUpdate", BatchUpdateIndexFieldsResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "BatchUpdateProcessData"), BatchUpdateProcessData.class, null, data), ct);
    }

    public URI getCreateUserDefinedSearchRelationLink() {
        return MethodInvocation.getLink(this, links, "createUserDefinedSearch");
    }

    public Dialog postToCreateUserDefinedSearchRelationForDialog(UserDefinedSearchInfo data) {
        return MethodInvocation.<Dialog,UserDefinedSearchInfo>post(this, links, "createUserDefinedSearch", Dialog.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "UserDefinedSearchInfo"), UserDefinedSearchInfo.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<Dialog>> postToCreateUserDefinedSearchRelationForDialogAsync(UserDefinedSearchInfo data) {
        return MethodInvocation.<Dialog, UserDefinedSearchInfo >postAsync(this, links, "createUserDefinedSearch", Dialog.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "UserDefinedSearchInfo"), UserDefinedSearchInfo.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<Dialog>> postToCreateUserDefinedSearchRelationForDialogAsync(UserDefinedSearchInfo data, CancellationToken ct) {
        return MethodInvocation.<Dialog, UserDefinedSearchInfo >postAsync(this, links, "createUserDefinedSearch", Dialog.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "UserDefinedSearchInfo"), UserDefinedSearchInfo.class, null, data), ct);
    }

    public URI getExportDocumentsRelationLink() {
        return MethodInvocation.getLink(this, links, "exportDocuments");
    }

    public String postToExportDocumentsRelationForString(ExportSettings data) {
        return MethodInvocation.<String,ExportSettings>post(this, links, "exportDocuments", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ExportSettings"), ExportSettings.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<String>> postToExportDocumentsRelationForStringAsync(ExportSettings data) {
        return MethodInvocation.<String, ExportSettings >postAsync(this, links, "exportDocuments", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ExportSettings"), ExportSettings.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<String>> postToExportDocumentsRelationForStringAsync(ExportSettings data, CancellationToken ct) {
        return MethodInvocation.<String, ExportSettings >postAsync(this, links, "exportDocuments", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ExportSettings"), ExportSettings.class, null, data), ct);
    }



}
