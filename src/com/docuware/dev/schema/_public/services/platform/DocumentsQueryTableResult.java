

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;
import com.docuware.dev.schema._public.services.platform.DocumentsQueryTableResult;
import com.docuware.dev.schema._public.services.platform.BatchUpdateIndexFieldsResult;
import com.docuware.dev.schema._public.services.platform.BatchUpdateProcessData;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import com.docuware.dev.schema._public.services.platform.Dialog;
import com.docuware.dev.schema._public.services.platform.UserDefinedSearchInfo;
import java.io.InputStream;
import com.docuware.dev.schema._public.services.platform.ExportSettings;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.docuware.dev.schema._public.services.Links;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentsQueryTableResult", propOrder = {
"proxy",
    "count",
    "headers",
    "rows",
    "links"
})
public class DocumentsQueryTableResult  implements IRelationsWithProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Count")
    protected CountPlusValue count;
    @XmlElement(name = "Headers", required = true)
    protected DocumentsQueryTableResult.Headers headers;
    @XmlElement(name = "Rows", required = true)
    protected DocumentsQueryTableResult.Rows rows;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;
    @XmlAttribute(name = "TimeStamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected GregorianCalendar timeStamp;

    /**Gets the number of items of the query leading to this result.*/
    public CountPlusValue getCount() {
        return count;
    }

    /**Gets the number of items of the query leading to this result.*/
    public void setCount(CountPlusValue value) {
        this.count = value;
    }

    /**Collection of headers for the result*/
    public DocumentsQueryTableResult.Headers getHeaders() {
        return headers;
    }

    /**Collection of headers for the result*/
    public void setHeaders(DocumentsQueryTableResult.Headers value) {
        this.headers = value;
    }

    /**Collection of the rows for the result*/
    public DocumentsQueryTableResult.Rows getRows() {
        return rows;
    }

    /**Collection of the rows for the result*/
    public void setRows(DocumentsQueryTableResult.Rows value) {
        this.rows = value;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links value) {
        this.links = value;
    }

    /**TimeStamp of the result.*/
    public GregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**TimeStamp of the result.*/
    public void setTimeStamp(GregorianCalendar value) {
        this.timeStamp = value;
    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "header"
    })
    public static class Headers {

        @XmlElement(name = "Header")
        protected List<TableResultHeader> header;

    /**ArrayList is required for the XML-Marshalling */
    public void setHeader(ArrayList<TableResultHeader> value) {
        header=value;
    }

    /**Define a specific result header*/
        public List<TableResultHeader> getHeader() {
            if (header == null) {
                header = new ArrayList<TableResultHeader>();
            }
            return this.header;
        }

    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "r"
    })
    public static class Rows {

        @XmlElement(name = "R")
        protected List<TableResultRow> r;

    /**ArrayList is required for the XML-Marshalling */
    public void setR(ArrayList<TableResultRow> value) {
        r=value;
    }

    /**Define a specific result row*/
        public List<TableResultRow> getR() {
            if (r == null) {
                r = new ArrayList<TableResultRow>();
            }
            return this.r;
        }

    }


	/**
	* Gets the proxy.
	* 
	* @return	The proxy
	*/
    @Extension
    public HttpClientProxy getProxy() {
	return this.proxy;
    }


	/**
	* Sets the HTTP Communication Proxy which is used in futher HTTP communication.
	* 
	* @param proxy	The new proxy
	*/
    @Extension
    public void setProxy(HttpClientProxy proxy) {
	this.proxy = proxy;
	//if(this.rows!=null) {
    //    for (int i = 0; (i < this.rows.getRow().size()); i = (i + 1)) {
    //        this.rows.getRow().get(i).setProxy(proxy);
    //    }
	//}
    }


	/**
	* Gets the base URI of the specified relations instance.
	* 
	* @return	The base URI of the specified relations instance.
	*/
    @Extension
    public URI getBaseUri() {
	return RelationsWithProxyExtensions.getBaseUri(this);
    }


	/**
	* Gets the link by its name.
	* 
	* @param relationName	Name of the relation
	* @return	The link, if it exists; null otherwise.
	*/
    @Extension
    public Link getLink(String relationName) {
	return RelationExtension.getLink(this, relationName);
    }


	/**
	* Gets the URI of the relation specified by the name.
	* 
	* @param relationName	Name of the relation
	* @return	The link, if it exists; null otherwise.
	*/
    @Extension
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
    @Extension
    public String getRelationUriOrThrow(String relationName) {
	return RelationExtension.getRelationUriOrThrow(this, relationName);
    }


	/**
	* Determines whether the specified link exists.
	* 
	* @param relationName	Name of the relation
	* @return	 True, if the specified link exists; otherwise, False.
	*/
    @Extension
    public boolean hasRelationUri(String relationName) {
	return RelationExtension.hasRelationUri(this, relationName);
    }

    /**
    * Gets the Uri of the Link for the relation "Next".
    * Returns the Uri of the Link for the relation "Next", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getNextRelationLink() {
        return MethodInvocation.getLink(this, links, "next");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Next".
    */
    public DocumentsQueryTableResult getDocumentsQueryTableResultFromNextRelation() {
        return MethodInvocation.<DocumentsQueryTableResult>get(this, links, "next", DocumentsQueryTableResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Next" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentsQueryTableResult>> getDocumentsQueryTableResultFromNextRelationAsync() {
        return MethodInvocation.<DocumentsQueryTableResult>getAsync(this, links, "next", DocumentsQueryTableResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Next" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentsQueryTableResult>> getDocumentsQueryTableResultFromNextRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DocumentsQueryTableResult>getAsync(this, links, "next", DocumentsQueryTableResult.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Prev".
    * Returns the Uri of the Link for the relation "Prev", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getPrevRelationLink() {
        return MethodInvocation.getLink(this, links, "prev");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Prev".
    */
    public DocumentsQueryTableResult getDocumentsQueryTableResultFromPrevRelation() {
        return MethodInvocation.<DocumentsQueryTableResult>get(this, links, "prev", DocumentsQueryTableResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Prev" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentsQueryTableResult>> getDocumentsQueryTableResultFromPrevRelationAsync() {
        return MethodInvocation.<DocumentsQueryTableResult>getAsync(this, links, "prev", DocumentsQueryTableResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Prev" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentsQueryTableResult>> getDocumentsQueryTableResultFromPrevRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DocumentsQueryTableResult>getAsync(this, links, "prev", DocumentsQueryTableResult.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Self".
    * Returns the Uri of the Link for the relation "Self", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getSelfRelationLink() {
        return MethodInvocation.getLink(this, links, "self");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Self".
    */
    public DocumentsQueryTableResult getDocumentsQueryTableResultFromSelfRelation() {
        return MethodInvocation.<DocumentsQueryTableResult>get(this, links, "self", DocumentsQueryTableResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Self" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentsQueryTableResult>> getDocumentsQueryTableResultFromSelfRelationAsync() {
        return MethodInvocation.<DocumentsQueryTableResult>getAsync(this, links, "self", DocumentsQueryTableResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Self" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentsQueryTableResult>> getDocumentsQueryTableResultFromSelfRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DocumentsQueryTableResult>getAsync(this, links, "self", DocumentsQueryTableResult.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "First".
    * Returns the Uri of the Link for the relation "First", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getFirstRelationLink() {
        return MethodInvocation.getLink(this, links, "first");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "First".
    */
    public DocumentsQueryTableResult getDocumentsQueryTableResultFromFirstRelation() {
        return MethodInvocation.<DocumentsQueryTableResult>get(this, links, "first", DocumentsQueryTableResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "First" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentsQueryTableResult>> getDocumentsQueryTableResultFromFirstRelationAsync() {
        return MethodInvocation.<DocumentsQueryTableResult>getAsync(this, links, "first", DocumentsQueryTableResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "First" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentsQueryTableResult>> getDocumentsQueryTableResultFromFirstRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DocumentsQueryTableResult>getAsync(this, links, "first", DocumentsQueryTableResult.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Feed".
    * Returns the Uri of the Link for the relation "Feed", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getFeedRelationLink() {
        return MethodInvocation.getLink(this, links, "feed");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Feed".
    */
    public XElementWrapper getXElementWrapperFromFeedRelation() {
        return MethodInvocation.<XElementWrapper>get(this, links, "feed", XElementWrapper.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Feed" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<XElementWrapper>> getXElementWrapperFromFeedRelationAsync() {
        return MethodInvocation.<XElementWrapper>getAsync(this, links, "feed", XElementWrapper.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Feed" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<XElementWrapper>> getXElementWrapperFromFeedRelationAsync(CancellationToken ct) {
        return MethodInvocation.<XElementWrapper>getAsync(this, links, "feed", XElementWrapper.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Download".
    * Returns the Uri of the Link for the relation "Download", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getDownloadRelationLink() {
        return MethodInvocation.getLink(this, links, "download");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Download".
    */
    public DocumentsQueryTableResult getDocumentsQueryTableResultFromDownloadRelation() {
        return MethodInvocation.<DocumentsQueryTableResult>get(this, links, "download", DocumentsQueryTableResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Download" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentsQueryTableResult>> getDocumentsQueryTableResultFromDownloadRelationAsync() {
        return MethodInvocation.<DocumentsQueryTableResult>getAsync(this, links, "download", DocumentsQueryTableResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Download" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentsQueryTableResult>> getDocumentsQueryTableResultFromDownloadRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DocumentsQueryTableResult>getAsync(this, links, "download", DocumentsQueryTableResult.class, ct);
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
    public BatchUpdateIndexFieldsResult postToBatchUpdateRelationForBatchUpdateIndexFieldsResult(BatchUpdateProcessData data) {
        return MethodInvocation.<BatchUpdateIndexFieldsResult, BatchUpdateProcessData> post(this, links, "batchUpdate", BatchUpdateIndexFieldsResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "BatchUpdateProcessData"), BatchUpdateProcessData.class, null, data), "application/vnd.docuware.platform.batchupdateprocessdata+xml", "application/vnd.docuware.platform.batchupdateindexfieldsresult+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "BatchUpdate" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<BatchUpdateIndexFieldsResult>> postToBatchUpdateRelationForBatchUpdateIndexFieldsResultAsync(BatchUpdateProcessData data) {
        return MethodInvocation.<BatchUpdateIndexFieldsResult, BatchUpdateProcessData >postAsync(this, links, "batchUpdate", BatchUpdateIndexFieldsResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "BatchUpdateProcessData"), BatchUpdateProcessData.class, null, data), "application/vnd.docuware.platform.batchupdateprocessdata+xml", "application/vnd.docuware.platform.batchupdateindexfieldsresult+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "BatchUpdate" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<BatchUpdateIndexFieldsResult>> postToBatchUpdateRelationForBatchUpdateIndexFieldsResultAsync(CancellationToken ct, BatchUpdateProcessData data) {
        return MethodInvocation.<BatchUpdateIndexFieldsResult, BatchUpdateProcessData >postAsync(this, links, "batchUpdate", BatchUpdateIndexFieldsResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "BatchUpdateProcessData"), BatchUpdateProcessData.class, null, data), "application/vnd.docuware.platform.batchupdateprocessdata+xml", "application/vnd.docuware.platform.batchupdateindexfieldsresult+xml", ct);
    }

    /**
    * Gets the Uri of the Link for the relation "CreateUserDefinedSearch".
    * Returns the Uri of the Link for the relation "CreateUserDefinedSearch", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getCreateUserDefinedSearchRelationLink() {
        return MethodInvocation.getLink(this, links, "createUserDefinedSearch");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "CreateUserDefinedSearch".
    */
    public Dialog postToCreateUserDefinedSearchRelationForDialog(UserDefinedSearchInfo data) {
        return MethodInvocation.<Dialog, UserDefinedSearchInfo> post(this, links, "createUserDefinedSearch", Dialog.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "UserDefinedSearchInfo"), UserDefinedSearchInfo.class, null, data), "application/xml", "application/vnd.docuware.platform.dialog+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "CreateUserDefinedSearch" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Dialog>> postToCreateUserDefinedSearchRelationForDialogAsync(UserDefinedSearchInfo data) {
        return MethodInvocation.<Dialog, UserDefinedSearchInfo >postAsync(this, links, "createUserDefinedSearch", Dialog.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "UserDefinedSearchInfo"), UserDefinedSearchInfo.class, null, data), "application/xml", "application/vnd.docuware.platform.dialog+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "CreateUserDefinedSearch" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Dialog>> postToCreateUserDefinedSearchRelationForDialogAsync(CancellationToken ct, UserDefinedSearchInfo data) {
        return MethodInvocation.<Dialog, UserDefinedSearchInfo >postAsync(this, links, "createUserDefinedSearch", Dialog.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "UserDefinedSearchInfo"), UserDefinedSearchInfo.class, null, data), "application/xml", "application/vnd.docuware.platform.dialog+xml", ct);
    }

    /**
    * Gets the Uri of the Link for the relation "ExportDocuments".
    * Returns the Uri of the Link for the relation "ExportDocuments", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getExportDocumentsRelationLink() {
        return MethodInvocation.getLink(this, links, "exportDocuments");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "ExportDocuments".
    */
    public InputStream postToExportDocumentsRelationForInputStream(ExportSettings data) {
        return MethodInvocation.<InputStream, ExportSettings> post(this, links, "exportDocuments", InputStream.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ExportSettings"), ExportSettings.class, null, data), "application/vnd.docuware.platform.exportsettings+xml", "application/xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "ExportDocuments" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> postToExportDocumentsRelationForInputStreamAsync(ExportSettings data) {
        return MethodInvocation.<InputStream, ExportSettings >postAsync(this, links, "exportDocuments", InputStream.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ExportSettings"), ExportSettings.class, null, data), "application/vnd.docuware.platform.exportsettings+xml", "application/xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "ExportDocuments" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> postToExportDocumentsRelationForInputStreamAsync(CancellationToken ct, ExportSettings data) {
        return MethodInvocation.<InputStream, ExportSettings >postAsync(this, links, "exportDocuments", InputStream.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ExportSettings"), ExportSettings.class, null, data), "application/vnd.docuware.platform.exportsettings+xml", "application/xml", ct);
    }



}
