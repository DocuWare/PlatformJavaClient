

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;
import com.docuware.dev.schema._public.services.platform.Document;
import java.io.InputStream;
import com.docuware.dev.schema._public.services.platform.DocumentIndexFields;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import com.docuware.dev.schema._public.services.platform.UpdateIndexFieldsInfo;
import com.docuware.dev.schema._public.services.platform.SuggestionFields;
import com.docuware.dev.schema._public.services.platform.IntegerList;
import com.docuware.dev.schema._public.services.platform.Sections;
import com.docuware.dev.schema._public.services.platform.Section;
import com.docuware.dev.schema._public.services.platform.LockInfo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.docuware.dev.schema._public.services.Links;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TableResultRow", propOrder = {
"proxy",
    "items",
    "links",
    "suggestions"
})
public class TableResultRow  implements IRelationsWithProxy {
private HttpClientProxy proxy;//test


    @XmlElements({
        @XmlElement(name = "Int", type = Long.class),
        @XmlElement(name = "Decimal", type = BigDecimal.class),
        @XmlElement(name = "String", type = String.class),
        @XmlElement(name = "DateTime", type = GregorianCalendar.class),
        @XmlElement(name = "Empty", type = NullTableResultValue.class)
    })
    protected List<Object> items;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services")
    protected Links links;
    @XmlElement(name = "Suggestions")
    protected SuggestionFields suggestions;
    @XmlAttribute(name = "Id", required = true)
    protected int id;

    /**ArrayList is required for the XML-Marshalling */
    public void setItems(ArrayList<Object> value) {
        items=value;
    }

    public List<Object> getItems() {
        if (items == null) {
            items = new ArrayList<Object>();
        }
        return this.items;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links value) {
        this.links = value;
    }

    public SuggestionFields getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(SuggestionFields value) {
        this.suggestions = value;
    }

    /**Id of the document represented by the current row.*/
    public int getId() {
        return id;
    }

    /**Id of the document represented by the current row.*/
    public void setId(int value) {
        this.id = value;
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
    public Document getDocumentFromSelfRelation() {
        return MethodInvocation.<Document>get(this, links, "self", Document.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Self" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Document>> getDocumentFromSelfRelationAsync() {
        return MethodInvocation.<Document>getAsync(this, links, "self", Document.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Self" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Document>> getDocumentFromSelfRelationAsync(CancellationToken ct) {
        return MethodInvocation.<Document>getAsync(this, links, "self", Document.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Self".
    */
    public Document postToSelfRelationForDocument(String bodyContentType, InputStream data) { 
        return MethodInvocation.<Document, InputStream>post(this, links, "self", Document.class, data, bodyContentType, "application/vnd.docuware.platform.document+xml");
}

    /**
    * Calls the HTTP post Method on the link for the relation "Self" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Document>> postToSelfRelationForDocumentAsync(String bodyContentType, InputStream data) { 
        return MethodInvocation.<Document, InputStream>postAsync(this, links, "self", Document.class, data, bodyContentType, "application/vnd.docuware.platform.document+xml");
}

    /**
    * Calls the HTTP post Method on the link for the relation "Self" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Document>> postToSelfRelationForDocumentAsync(CancellationToken ct, String bodyContentType, InputStream data) { 
        return MethodInvocation.<Document, InputStream>postAsync(this, links, "self", Document.class, data, bodyContentType, "application/vnd.docuware.platform.document+xml", ct);
}

    /**
    * Calls the HTTP Delete Method on the link for the relation "Self".
    */
    public String deleteSelfRelation() {
        return MethodInvocation.delete(this, links, "self");
    }

    /**
    * Calls the HTTP Delete Method on the link for the relation "Self" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<String>> deleteSelfRelationAsync() {
        return MethodInvocation.deleteAsync(this, links, "self");
    }

    /**
    * Calls the HTTP Delete Method on the link for the relation "Self" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<String>> deleteSelfRelationAsync(CancellationToken ct) {
        return MethodInvocation.deleteAsync(this, links, "self", ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Fields".
    * Returns the Uri of the Link for the relation "Fields", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getFieldsRelationLink() {
        return MethodInvocation.getLink(this, links, "fields");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Fields".
    */
    public DocumentIndexFields getDocumentIndexFieldsFromFieldsRelation() {
        return MethodInvocation.<DocumentIndexFields>get(this, links, "fields", DocumentIndexFields.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Fields" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentIndexFields>> getDocumentIndexFieldsFromFieldsRelationAsync() {
        return MethodInvocation.<DocumentIndexFields>getAsync(this, links, "fields", DocumentIndexFields.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Fields" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentIndexFields>> getDocumentIndexFieldsFromFieldsRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DocumentIndexFields>getAsync(this, links, "fields", DocumentIndexFields.class, ct);
    }

    /**
    * Calls the HTTP put Method on the link for the relation "Fields".
    */
    public DocumentIndexFields putToFieldsRelationForDocumentIndexFields(DocumentIndexFields data) {
        return MethodInvocation.<DocumentIndexFields, DocumentIndexFields> put(this, links, "fields", DocumentIndexFields.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentIndexFields"), DocumentIndexFields.class, null, data), "application/vnd.docuware.platform.documentfields+xml", "application/vnd.docuware.platform.documentfields+xml");
    }

    /**
    * Calls the HTTP put Method on the link for the relation "Fields" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentIndexFields>> putToFieldsRelationForDocumentIndexFieldsAsync(DocumentIndexFields data) {
        return MethodInvocation.<DocumentIndexFields, DocumentIndexFields >putAsync(this, links, "fields", DocumentIndexFields.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentIndexFields"), DocumentIndexFields.class, null, data), "application/vnd.docuware.platform.documentfields+xml", "application/vnd.docuware.platform.documentfields+xml");
    }

    /**
    * Calls the HTTP put Method on the link for the relation "Fields" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentIndexFields>> putToFieldsRelationForDocumentIndexFieldsAsync(CancellationToken ct, DocumentIndexFields data) {
        return MethodInvocation.<DocumentIndexFields, DocumentIndexFields >putAsync(this, links, "fields", DocumentIndexFields.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentIndexFields"), DocumentIndexFields.class, null, data), "application/vnd.docuware.platform.documentfields+xml", "application/vnd.docuware.platform.documentfields+xml", ct);
    }

    /**
    * Calls the HTTP put Method on the link for the relation "Fields".
    */
    public DocumentIndexFields putToFieldsRelationForDocumentIndexFields(UpdateIndexFieldsInfo data) {
        return MethodInvocation.<DocumentIndexFields, UpdateIndexFieldsInfo> put(this, links, "fields", DocumentIndexFields.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "UpdateIndexFieldsInfo"), UpdateIndexFieldsInfo.class, null, data), "application/vnd.docuware.platform.documentfieldsinfo+xml", "application/vnd.docuware.platform.documentfields+xml");
    }

    /**
    * Calls the HTTP put Method on the link for the relation "Fields" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentIndexFields>> putToFieldsRelationForDocumentIndexFieldsAsync(UpdateIndexFieldsInfo data) {
        return MethodInvocation.<DocumentIndexFields, UpdateIndexFieldsInfo >putAsync(this, links, "fields", DocumentIndexFields.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "UpdateIndexFieldsInfo"), UpdateIndexFieldsInfo.class, null, data), "application/vnd.docuware.platform.documentfieldsinfo+xml", "application/vnd.docuware.platform.documentfields+xml");
    }

    /**
    * Calls the HTTP put Method on the link for the relation "Fields" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentIndexFields>> putToFieldsRelationForDocumentIndexFieldsAsync(CancellationToken ct, UpdateIndexFieldsInfo data) {
        return MethodInvocation.<DocumentIndexFields, UpdateIndexFieldsInfo >putAsync(this, links, "fields", DocumentIndexFields.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "UpdateIndexFieldsInfo"), UpdateIndexFieldsInfo.class, null, data), "application/vnd.docuware.platform.documentfieldsinfo+xml", "application/vnd.docuware.platform.documentfields+xml", ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Suggestions".
    * Returns the Uri of the Link for the relation "Suggestions", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getSuggestionsRelationLink() {
        return MethodInvocation.getLink(this, links, "suggestions");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Suggestions".
    */
    public SuggestionFields getSuggestionFieldsFromSuggestionsRelation() {
        return MethodInvocation.<SuggestionFields>get(this, links, "suggestions", SuggestionFields.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Suggestions" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<SuggestionFields>> getSuggestionFieldsFromSuggestionsRelationAsync() {
        return MethodInvocation.<SuggestionFields>getAsync(this, links, "suggestions", SuggestionFields.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Suggestions" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<SuggestionFields>> getSuggestionFieldsFromSuggestionsRelationAsync(CancellationToken ct) {
        return MethodInvocation.<SuggestionFields>getAsync(this, links, "suggestions", SuggestionFields.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "ClippedDocuments".
    * Returns the Uri of the Link for the relation "ClippedDocuments", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getClippedDocumentsRelationLink() {
        return MethodInvocation.getLink(this, links, "clippedDocuments");
    }

    /**
    * Calls the HTTP put Method on the link for the relation "ClippedDocuments".
    */
    public Document putToClippedDocumentsRelationForDocument(IntegerList data) {
        return MethodInvocation.<Document, IntegerList> put(this, links, "clippedDocuments", Document.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "IntegerList"), IntegerList.class, null, data), "application/vnd.docuware.platform.integerlist+xml", "application/vnd.docuware.platform.document+xml");
    }

    /**
    * Calls the HTTP put Method on the link for the relation "ClippedDocuments" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Document>> putToClippedDocumentsRelationForDocumentAsync(IntegerList data) {
        return MethodInvocation.<Document, IntegerList >putAsync(this, links, "clippedDocuments", Document.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "IntegerList"), IntegerList.class, null, data), "application/vnd.docuware.platform.integerlist+xml", "application/vnd.docuware.platform.document+xml");
    }

    /**
    * Calls the HTTP put Method on the link for the relation "ClippedDocuments" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Document>> putToClippedDocumentsRelationForDocumentAsync(CancellationToken ct, IntegerList data) {
        return MethodInvocation.<Document, IntegerList >putAsync(this, links, "clippedDocuments", Document.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "IntegerList"), IntegerList.class, null, data), "application/vnd.docuware.platform.integerlist+xml", "application/vnd.docuware.platform.document+xml", ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Sections".
    * Returns the Uri of the Link for the relation "Sections", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getSectionsRelationLink() {
        return MethodInvocation.getLink(this, links, "sections");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Sections".
    */
    public Sections getSectionsFromSectionsRelation() {
        return MethodInvocation.<Sections>get(this, links, "sections", Sections.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Sections" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Sections>> getSectionsFromSectionsRelationAsync() {
        return MethodInvocation.<Sections>getAsync(this, links, "sections", Sections.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Sections" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Sections>> getSectionsFromSectionsRelationAsync(CancellationToken ct) {
        return MethodInvocation.<Sections>getAsync(this, links, "sections", Sections.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Sections".
    */
    public Section postToSectionsRelationForSection(String bodyContentType, InputStream data) { 
        return MethodInvocation.<Section, InputStream>post(this, links, "sections", Section.class, data, bodyContentType, "application/vnd.docuware.platform.section+xml");
}

    /**
    * Calls the HTTP post Method on the link for the relation "Sections" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Section>> postToSectionsRelationForSectionAsync(String bodyContentType, InputStream data) { 
        return MethodInvocation.<Section, InputStream>postAsync(this, links, "sections", Section.class, data, bodyContentType, "application/vnd.docuware.platform.section+xml");
}

    /**
    * Calls the HTTP post Method on the link for the relation "Sections" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Section>> postToSectionsRelationForSectionAsync(CancellationToken ct, String bodyContentType, InputStream data) { 
        return MethodInvocation.<Section, InputStream>postAsync(this, links, "sections", Section.class, data, bodyContentType, "application/vnd.docuware.platform.section+xml", ct);
}

    /**
    * Gets the Uri of the Link for the relation "Thumbnail".
    * Returns the Uri of the Link for the relation "Thumbnail", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getThumbnailRelationLink() {
        return MethodInvocation.getLink(this, links, "thumbnail");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Thumbnail".
    */
    public InputStream getInputStreamFromThumbnailRelation() {
        return MethodInvocation.<InputStream>get(this, links, "thumbnail", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Thumbnail" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromThumbnailRelationAsync() {
        return MethodInvocation.<InputStream>getAsync(this, links, "thumbnail", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Thumbnail" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromThumbnailRelationAsync(CancellationToken ct) {
        return MethodInvocation.<InputStream>getAsync(this, links, "thumbnail", InputStream.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Lock".
    * Returns the Uri of the Link for the relation "Lock", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getLockRelationLink() {
        return MethodInvocation.getLink(this, links, "lock");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Lock".
    */
    public String postToLockRelationForString(LockInfo data) {
        return MethodInvocation.<String, LockInfo> post(this, links, "lock", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "LockInfo"), LockInfo.class, null, data), "application/xml", "text/plain");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Lock" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<String>> postToLockRelationForStringAsync(LockInfo data) {
        return MethodInvocation.<String, LockInfo >postAsync(this, links, "lock", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "LockInfo"), LockInfo.class, null, data), "application/xml", "text/plain");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Lock" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<String>> postToLockRelationForStringAsync(CancellationToken ct, LockInfo data) {
        return MethodInvocation.<String, LockInfo >postAsync(this, links, "lock", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "LockInfo"), LockInfo.class, null, data), "application/xml", "text/plain", ct);
    }

    /**
    * Calls the HTTP Delete Method on the link for the relation "Lock".
    */
    public String deleteLockRelation() {
        return MethodInvocation.delete(this, links, "lock");
    }

    /**
    * Calls the HTTP Delete Method on the link for the relation "Lock" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<String>> deleteLockRelationAsync() {
        return MethodInvocation.deleteAsync(this, links, "lock");
    }

    /**
    * Calls the HTTP Delete Method on the link for the relation "Lock" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<String>> deleteLockRelationAsync(CancellationToken ct) {
        return MethodInvocation.deleteAsync(this, links, "lock", ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Rights".
    * Returns the Uri of the Link for the relation "Rights", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getRightsRelationLink() {
        return MethodInvocation.getLink(this, links, "rights");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Rights".
    */
    public Section postToRightsRelationForSection(String bodyContentType, InputStream data) { 
        return MethodInvocation.<Section, InputStream>post(this, links, "rights", Section.class, data, bodyContentType, "application/vnd.docuware.platform.section+xml");
}

    /**
    * Calls the HTTP post Method on the link for the relation "Rights" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Section>> postToRightsRelationForSectionAsync(String bodyContentType, InputStream data) { 
        return MethodInvocation.<Section, InputStream>postAsync(this, links, "rights", Section.class, data, bodyContentType, "application/vnd.docuware.platform.section+xml");
}

    /**
    * Calls the HTTP post Method on the link for the relation "Rights" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Section>> postToRightsRelationForSectionAsync(CancellationToken ct, String bodyContentType, InputStream data) { 
        return MethodInvocation.<Section, InputStream>postAsync(this, links, "rights", Section.class, data, bodyContentType, "application/vnd.docuware.platform.section+xml", ct);
}

    /**
    * Gets the Uri of the Link for the relation "Intellix".
    * Returns the Uri of the Link for the relation "Intellix", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getIntellixRelationLink() {
        return MethodInvocation.getLink(this, links, "intellix");
    }



}
