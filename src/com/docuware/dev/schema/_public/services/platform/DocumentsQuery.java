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
import com.docuware.dev.schema._public.services.platform.DocumentsQueryResult;
import com.docuware.dev.schema._public.services.platform.DialogExpression;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import com.docuware.dev.schema._public.services.platform.DocumentsQueryTableResult;
import com.docuware.dev.schema._public.services.platform.BatchUpdateIndexFieldsResult;
import com.docuware.dev.schema._public.services.platform.BatchUpdateProcess;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.schema._public.services.Links;


/**
 * Defines a query for documents.
 * 
 * <p>Java-Klasse f�r DocumentsQuery complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DocumentsQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ForceRefresh" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Expression" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Fields" type="{http://dev.docuware.com/schema/public/services/platform}FieldsList" minOccurs="0"/>
 *         &lt;element name="SortOrder" type="{http://dev.docuware.com/schema/public/services/platform}SortedFieldsList" minOccurs="0"/>
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
@XmlType(name = "DocumentsQuery", propOrder = {
"proxy",
    "forceRefresh",
    "expression",
    "fields",
    "sortOrder",
    "links"
})
public class DocumentsQuery  implements IRelationsWithProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "ForceRefresh", defaultValue = "false")
    protected Boolean forceRefresh;
    @XmlElement(name = "Expression")
    protected String expression;
    @XmlElement(name = "Fields")
    protected FieldsList fields;
    @XmlElement(name = "SortOrder")
    protected SortedFieldsList sortOrder;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;

    /**
     * Ruft den Wert der forceRefresh-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForceRefresh() {
        return forceRefresh;
    }

    /**
     * Legt den Wert der forceRefresh-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForceRefresh(Boolean value) {
        this.forceRefresh = value;
    }

    /**
     * Ruft den Wert der expression-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpression() {
        return expression;
    }

    /**
     * Legt den Wert der expression-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpression(String value) {
        this.expression = value;
    }

    /**
     * Ruft den Wert der fields-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FieldsList }
     *     
     */
    public FieldsList getFields() {
        return fields;
    }

    /**
     * Legt den Wert der fields-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldsList }
     *     
     */
    public void setFields(FieldsList value) {
        this.fields = value;
    }

    /**
     * Ruft den Wert der sortOrder-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SortedFieldsList }
     *     
     */
    public SortedFieldsList getSortOrder() {
        return sortOrder;
    }

    /**
     * Legt den Wert der sortOrder-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SortedFieldsList }
     *     
     */
    public void setSortOrder(SortedFieldsList value) {
        this.sortOrder = value;
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

    public URI getResultRelationLink() {
        return MethodInvocation.getLink(this, links, "result");
    }

    public DocumentsQueryResult getDocumentsQueryResultFromResultRelation() {
        return MethodInvocation.<DocumentsQueryResult>get(this, links, "result", DocumentsQueryResult.class);
    }

    public Future<DeserializedHttpResponseGen<DocumentsQueryResult>> getDocumentsQueryResultFromResultRelationAsync() {
        return MethodInvocation.<DocumentsQueryResult>getAsync(this, links, "result", DocumentsQueryResult.class);
    }

    public Future<DeserializedHttpResponseGen<DocumentsQueryResult>> getDocumentsQueryResultFromResultRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DocumentsQueryResult>getAsync(this, links, "result", DocumentsQueryResult.class, ct);
    }

    public URI getDialogExpressionRelationLink() {
        return MethodInvocation.getLink(this, links, "dialogExpression");
    }

    public DocumentsQueryResult postToDialogExpressionRelationForDocumentsQueryResult(DialogExpression data) {
        return MethodInvocation.<DocumentsQueryResult,DialogExpression>post(this, links, "dialogExpression", DocumentsQueryResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DialogExpression"), DialogExpression.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<DocumentsQueryResult>> postToDialogExpressionRelationForDocumentsQueryResultAsync(DialogExpression data) {
        return MethodInvocation.<DocumentsQueryResult, DialogExpression >postAsync(this, links, "dialogExpression", DocumentsQueryResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DialogExpression"), DialogExpression.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<DocumentsQueryResult>> postToDialogExpressionRelationForDocumentsQueryResultAsync(DialogExpression data, CancellationToken ct) {
        return MethodInvocation.<DocumentsQueryResult, DialogExpression >postAsync(this, links, "dialogExpression", DocumentsQueryResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DialogExpression"), DialogExpression.class, null, data), ct);
    }

    public URI getTableResultRelationLink() {
        return MethodInvocation.getLink(this, links, "tableResult");
    }

    public DocumentsQueryTableResult getDocumentsQueryTableResultFromTableResultRelation() {
        return MethodInvocation.<DocumentsQueryTableResult>get(this, links, "tableResult", DocumentsQueryTableResult.class);
    }

    public Future<DeserializedHttpResponseGen<DocumentsQueryTableResult>> getDocumentsQueryTableResultFromTableResultRelationAsync() {
        return MethodInvocation.<DocumentsQueryTableResult>getAsync(this, links, "tableResult", DocumentsQueryTableResult.class);
    }

    public Future<DeserializedHttpResponseGen<DocumentsQueryTableResult>> getDocumentsQueryTableResultFromTableResultRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DocumentsQueryTableResult>getAsync(this, links, "tableResult", DocumentsQueryTableResult.class, ct);
    }

    public URI getTableDialogExpressionRelationLink() {
        return MethodInvocation.getLink(this, links, "tableDialogExpression");
    }

    public DocumentsQueryTableResult postToTableDialogExpressionRelationForDocumentsQueryTableResult(DialogExpression data) {
        return MethodInvocation.<DocumentsQueryTableResult,DialogExpression>post(this, links, "tableDialogExpression", DocumentsQueryTableResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DialogExpression"), DialogExpression.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<DocumentsQueryTableResult>> postToTableDialogExpressionRelationForDocumentsQueryTableResultAsync(DialogExpression data) {
        return MethodInvocation.<DocumentsQueryTableResult, DialogExpression >postAsync(this, links, "tableDialogExpression", DocumentsQueryTableResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DialogExpression"), DialogExpression.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<DocumentsQueryTableResult>> postToTableDialogExpressionRelationForDocumentsQueryTableResultAsync(DialogExpression data, CancellationToken ct) {
        return MethodInvocation.<DocumentsQueryTableResult, DialogExpression >postAsync(this, links, "tableDialogExpression", DocumentsQueryTableResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DialogExpression"), DialogExpression.class, null, data), ct);
    }

    public URI getBatchUpdateRelationLink() {
        return MethodInvocation.getLink(this, links, "batchUpdate");
    }

    public BatchUpdateIndexFieldsResult postToBatchUpdateRelationForBatchUpdateIndexFieldsResult(BatchUpdateProcess data) {
        return MethodInvocation.<BatchUpdateIndexFieldsResult,BatchUpdateProcess>post(this, links, "batchUpdate", BatchUpdateIndexFieldsResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "BatchUpdateProcess"), BatchUpdateProcess.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<BatchUpdateIndexFieldsResult>> postToBatchUpdateRelationForBatchUpdateIndexFieldsResultAsync(BatchUpdateProcess data) {
        return MethodInvocation.<BatchUpdateIndexFieldsResult, BatchUpdateProcess >postAsync(this, links, "batchUpdate", BatchUpdateIndexFieldsResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "BatchUpdateProcess"), BatchUpdateProcess.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<BatchUpdateIndexFieldsResult>> postToBatchUpdateRelationForBatchUpdateIndexFieldsResultAsync(BatchUpdateProcess data, CancellationToken ct) {
        return MethodInvocation.<BatchUpdateIndexFieldsResult, BatchUpdateProcess >postAsync(this, links, "batchUpdate", BatchUpdateIndexFieldsResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "BatchUpdateProcess"), BatchUpdateProcess.class, null, data), ct);
    }



}
