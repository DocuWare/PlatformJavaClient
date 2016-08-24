

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;
import com.docuware.dev.schema._public.services.platform.DocumentsQueryResult;
import java.io.InputStream;
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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.docuware.dev.schema._public.services.Links;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentsQueryResult", propOrder = {
"proxy",
    "count",
    "items",
    "links"
})
public class DocumentsQueryResult  implements IRelationsWithProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Count")
    protected CountPlusValue count;
    @XmlElement(name = "Items", required = true)
    protected DocumentsQueryResult.Items items;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;
    @XmlAttribute(name = "Title")
    protected String title;
    @XmlAttribute(name = "TimeStamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeStamp;

    /**Gets the number of items of the query leading to this result.*/
    public CountPlusValue getCount() {
        return count;
    }

    /**Gets the number of items of the query leading to this result.*/
    public void setCount(CountPlusValue value) {
        this.count = value;
    }

    /**Collection of documents from result*/
    public DocumentsQueryResult.Items getItems() {
        return items;
    }

    /**Collection of documents from result*/
    public void setItems(DocumentsQueryResult.Items value) {
        this.items = value;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links value) {
        this.links = value;
    }

    /**The title of the document collection, if it exists.*/
    public String getTitle() {
        return title;
    }

    /**The title of the document collection, if it exists.*/
    public void setTitle(String value) {
        this.title = value;
    }

    /**TimeStamp of the result.*/
    public XMLGregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**TimeStamp of the result.*/
    public void setTimeStamp(XMLGregorianCalendar value) {
        this.timeStamp = value;
    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class Items {

        @XmlElement(name = "Item")
        protected List<Document> item;

    /**Define a specific document from result*/
        public List<Document> getItem() {
            if (item == null) {
                item = new ArrayList<Document>();
            }
            return this.item;
        }

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
	if(this.items!=null) {  
        for (int i = 0; (i < this.items.getItem().size()); i = (i + 1)) {
            this.items.getItem().get(i).setProxy(proxy);
        }
	}
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
    public DocumentsQueryResult getDocumentsQueryResultFromNextRelation() {
        return MethodInvocation.<DocumentsQueryResult>get(this, links, "next", DocumentsQueryResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Next" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentsQueryResult>> getDocumentsQueryResultFromNextRelationAsync() {
        return MethodInvocation.<DocumentsQueryResult>getAsync(this, links, "next", DocumentsQueryResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Next" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentsQueryResult>> getDocumentsQueryResultFromNextRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DocumentsQueryResult>getAsync(this, links, "next", DocumentsQueryResult.class, ct);
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
    public DocumentsQueryResult getDocumentsQueryResultFromPrevRelation() {
        return MethodInvocation.<DocumentsQueryResult>get(this, links, "prev", DocumentsQueryResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Prev" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentsQueryResult>> getDocumentsQueryResultFromPrevRelationAsync() {
        return MethodInvocation.<DocumentsQueryResult>getAsync(this, links, "prev", DocumentsQueryResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Prev" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentsQueryResult>> getDocumentsQueryResultFromPrevRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DocumentsQueryResult>getAsync(this, links, "prev", DocumentsQueryResult.class, ct);
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
    public DocumentsQueryResult getDocumentsQueryResultFromSelfRelation() {
        return MethodInvocation.<DocumentsQueryResult>get(this, links, "self", DocumentsQueryResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Self" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentsQueryResult>> getDocumentsQueryResultFromSelfRelationAsync() {
        return MethodInvocation.<DocumentsQueryResult>getAsync(this, links, "self", DocumentsQueryResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Self" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentsQueryResult>> getDocumentsQueryResultFromSelfRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DocumentsQueryResult>getAsync(this, links, "self", DocumentsQueryResult.class, ct);
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
    public DocumentsQueryResult getDocumentsQueryResultFromFirstRelation() {
        return MethodInvocation.<DocumentsQueryResult>get(this, links, "first", DocumentsQueryResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "First" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentsQueryResult>> getDocumentsQueryResultFromFirstRelationAsync() {
        return MethodInvocation.<DocumentsQueryResult>getAsync(this, links, "first", DocumentsQueryResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "First" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentsQueryResult>> getDocumentsQueryResultFromFirstRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DocumentsQueryResult>getAsync(this, links, "first", DocumentsQueryResult.class, ct);
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
    public InputStream getInputStreamFromFeedRelation() {
        return MethodInvocation.<InputStream>get(this, links, "feed", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Feed" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<InputStream>> getInputStreamFromFeedRelationAsync() {
        return MethodInvocation.<InputStream>getAsync(this, links, "feed", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Feed" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<InputStream>> getInputStreamFromFeedRelationAsync(CancellationToken ct) {
        return MethodInvocation.<InputStream>getAsync(this, links, "feed", InputStream.class, ct);
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
    public DocumentsQueryResult getDocumentsQueryResultFromDownloadRelation() {
        return MethodInvocation.<DocumentsQueryResult>get(this, links, "download", DocumentsQueryResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Download" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentsQueryResult>> getDocumentsQueryResultFromDownloadRelationAsync() {
        return MethodInvocation.<DocumentsQueryResult>getAsync(this, links, "download", DocumentsQueryResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Download" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentsQueryResult>> getDocumentsQueryResultFromDownloadRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DocumentsQueryResult>getAsync(this, links, "download", DocumentsQueryResult.class, ct);
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
        return MethodInvocation.<BatchUpdateIndexFieldsResult,BatchUpdateProcessData>post(this, links, "batchUpdate", BatchUpdateIndexFieldsResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "BatchUpdateProcessData"), BatchUpdateProcessData.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "BatchUpdate" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<BatchUpdateIndexFieldsResult>> postToBatchUpdateRelationForBatchUpdateIndexFieldsResultAsync(BatchUpdateProcessData data) {
        return MethodInvocation.<BatchUpdateIndexFieldsResult, BatchUpdateProcessData >postAsync(this, links, "batchUpdate", BatchUpdateIndexFieldsResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "BatchUpdateProcessData"), BatchUpdateProcessData.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "BatchUpdate" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<BatchUpdateIndexFieldsResult>> postToBatchUpdateRelationForBatchUpdateIndexFieldsResultAsync(BatchUpdateProcessData data, CancellationToken ct) {
        return MethodInvocation.<BatchUpdateIndexFieldsResult, BatchUpdateProcessData >postAsync(this, links, "batchUpdate", BatchUpdateIndexFieldsResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "BatchUpdateProcessData"), BatchUpdateProcessData.class, null, data), ct);
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
        return MethodInvocation.<Dialog,UserDefinedSearchInfo>post(this, links, "createUserDefinedSearch", Dialog.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "UserDefinedSearchInfo"), UserDefinedSearchInfo.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "CreateUserDefinedSearch" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Dialog>> postToCreateUserDefinedSearchRelationForDialogAsync(UserDefinedSearchInfo data) {
        return MethodInvocation.<Dialog, UserDefinedSearchInfo >postAsync(this, links, "createUserDefinedSearch", Dialog.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "UserDefinedSearchInfo"), UserDefinedSearchInfo.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "CreateUserDefinedSearch" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Dialog>> postToCreateUserDefinedSearchRelationForDialogAsync(UserDefinedSearchInfo data, CancellationToken ct) {
        return MethodInvocation.<Dialog, UserDefinedSearchInfo >postAsync(this, links, "createUserDefinedSearch", Dialog.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "UserDefinedSearchInfo"), UserDefinedSearchInfo.class, null, data), ct);
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
    public String postToExportDocumentsRelationForString(ExportSettings data) {
        return MethodInvocation.<String,ExportSettings>post(this, links, "exportDocuments", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ExportSettings"), ExportSettings.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "ExportDocuments" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> postToExportDocumentsRelationForStringAsync(ExportSettings data) {
        return MethodInvocation.<String, ExportSettings >postAsync(this, links, "exportDocuments", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ExportSettings"), ExportSettings.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "ExportDocuments" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> postToExportDocumentsRelationForStringAsync(ExportSettings data, CancellationToken ct) {
        return MethodInvocation.<String, ExportSettings >postAsync(this, links, "exportDocuments", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ExportSettings"), ExportSettings.class, null, data), ct);
    }



}
