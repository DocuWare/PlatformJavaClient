

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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.schema._public.services.Links;


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
    @XmlAttribute(name = "ExcludeSystemFields")
    protected Boolean excludeSystemFields;
    @XmlAttribute(name = "IncludeSuggestions")
    protected Boolean includeSuggestions;

    /**Determine if result list is retrieved from the cache when ForceRefresh is set to false (default) or always a new one is executed when ForceRefresh is set to true.*/
    @Dolphin
    public Boolean isForceRefresh() {
        return forceRefresh;
    }

    /**Determine if result list is retrieved from the cache when ForceRefresh is set to false (default) or always a new one is executed when ForceRefresh is set to true.*/
    @Dolphin
    public void setForceRefresh(Boolean value) {
        this.forceRefresh = value;
    }

    /**Gets or sets the query expression.*/
    public String getExpression() {
        return expression;
    }

    /**Gets or sets the query expression.*/
    public void setExpression(String value) {
        this.expression = value;
    }

    /**Gets or sets the fields which are returned by this query.*/
    public FieldsList getFields() {
        return fields;
    }

    /**Gets or sets the fields which are returned by this query.*/
    public void setFields(FieldsList value) {
        this.fields = value;
    }

    /**Gets or sets the fields which are returned by this query.*/
    public SortedFieldsList getSortOrder() {
        return sortOrder;
    }

    /**Gets or sets the fields which are returned by this query.*/
    public void setSortOrder(SortedFieldsList value) {
        this.sortOrder = value;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links value) {
        this.links = value;
    }

    /**Gets or sets the fields which are returned by this query.*/
    public boolean isExcludeSystemFields() {
        if (excludeSystemFields == null) {
            return false;
        } else {
            return excludeSystemFields;
        }
    }

    /**Gets or sets the fields which are returned by this query.*/
    public void setExcludeSystemFields(Boolean value) {
        this.excludeSystemFields = value;
    }

    public boolean isIncludeSuggestions() {
        if (includeSuggestions == null) {
            return false;
        } else {
            return includeSuggestions;
        }
    }

    public void setIncludeSuggestions(Boolean value) {
        this.includeSuggestions = value;
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
    * Gets the Uri of the Link for the relation "DialogExpression".
    * Returns the Uri of the Link for the relation "DialogExpression", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getDialogExpressionRelationLink() {
        return MethodInvocation.getLink(this, links, "dialogExpression");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "DialogExpression".
    */
    public DocumentsQueryResult postToDialogExpressionRelationForDocumentsQueryResult(DialogExpression data) {
        return MethodInvocation.<DocumentsQueryResult,DialogExpression>post(this, links, "dialogExpression", DocumentsQueryResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DialogExpression"), DialogExpression.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "DialogExpression" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentsQueryResult>> postToDialogExpressionRelationForDocumentsQueryResultAsync(DialogExpression data) {
        return MethodInvocation.<DocumentsQueryResult, DialogExpression >postAsync(this, links, "dialogExpression", DocumentsQueryResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DialogExpression"), DialogExpression.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "DialogExpression" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentsQueryResult>> postToDialogExpressionRelationForDocumentsQueryResultAsync(DialogExpression data, CancellationToken ct) {
        return MethodInvocation.<DocumentsQueryResult, DialogExpression >postAsync(this, links, "dialogExpression", DocumentsQueryResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DialogExpression"), DialogExpression.class, null, data), ct);
    }

    /**
    * Gets the Uri of the Link for the relation "TableResult".
    * Returns the Uri of the Link for the relation "TableResult", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getTableResultRelationLink() {
        return MethodInvocation.getLink(this, links, "tableResult");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "TableResult".
    */
    public DocumentsQueryTableResult getDocumentsQueryTableResultFromTableResultRelation() {
        return MethodInvocation.<DocumentsQueryTableResult>get(this, links, "tableResult", DocumentsQueryTableResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "TableResult" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentsQueryTableResult>> getDocumentsQueryTableResultFromTableResultRelationAsync() {
        return MethodInvocation.<DocumentsQueryTableResult>getAsync(this, links, "tableResult", DocumentsQueryTableResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "TableResult" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentsQueryTableResult>> getDocumentsQueryTableResultFromTableResultRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DocumentsQueryTableResult>getAsync(this, links, "tableResult", DocumentsQueryTableResult.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "TableDialogExpression".
    * Returns the Uri of the Link for the relation "TableDialogExpression", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getTableDialogExpressionRelationLink() {
        return MethodInvocation.getLink(this, links, "tableDialogExpression");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "TableDialogExpression".
    */
    public DocumentsQueryTableResult postToTableDialogExpressionRelationForDocumentsQueryTableResult(DialogExpression data) {
        return MethodInvocation.<DocumentsQueryTableResult,DialogExpression>post(this, links, "tableDialogExpression", DocumentsQueryTableResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DialogExpression"), DialogExpression.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "TableDialogExpression" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentsQueryTableResult>> postToTableDialogExpressionRelationForDocumentsQueryTableResultAsync(DialogExpression data) {
        return MethodInvocation.<DocumentsQueryTableResult, DialogExpression >postAsync(this, links, "tableDialogExpression", DocumentsQueryTableResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DialogExpression"), DialogExpression.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "TableDialogExpression" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentsQueryTableResult>> postToTableDialogExpressionRelationForDocumentsQueryTableResultAsync(DialogExpression data, CancellationToken ct) {
        return MethodInvocation.<DocumentsQueryTableResult, DialogExpression >postAsync(this, links, "tableDialogExpression", DocumentsQueryTableResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DialogExpression"), DialogExpression.class, null, data), ct);
    }

    /**
    * Gets the Uri of the Link for the relation "BatchUpdate".
    * Returns the Uri of the Link for the relation "BatchUpdate", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getBatchUpdateRelationLink() {
        return MethodInvocation.getLink(this, links, "batchUpdate");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "BatchUpdate".
    */
    public BatchUpdateIndexFieldsResult postToBatchUpdateRelationForBatchUpdateIndexFieldsResult(BatchUpdateProcess data) {
        return MethodInvocation.<BatchUpdateIndexFieldsResult,BatchUpdateProcess>post(this, links, "batchUpdate", BatchUpdateIndexFieldsResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "BatchUpdateProcess"), BatchUpdateProcess.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "BatchUpdate" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<BatchUpdateIndexFieldsResult>> postToBatchUpdateRelationForBatchUpdateIndexFieldsResultAsync(BatchUpdateProcess data) {
        return MethodInvocation.<BatchUpdateIndexFieldsResult, BatchUpdateProcess >postAsync(this, links, "batchUpdate", BatchUpdateIndexFieldsResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "BatchUpdateProcess"), BatchUpdateProcess.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "BatchUpdate" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<BatchUpdateIndexFieldsResult>> postToBatchUpdateRelationForBatchUpdateIndexFieldsResultAsync(BatchUpdateProcess data, CancellationToken ct) {
        return MethodInvocation.<BatchUpdateIndexFieldsResult, BatchUpdateProcess >postAsync(this, links, "batchUpdate", BatchUpdateIndexFieldsResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "BatchUpdateProcess"), BatchUpdateProcess.class, null, data), ct);
    }



}
