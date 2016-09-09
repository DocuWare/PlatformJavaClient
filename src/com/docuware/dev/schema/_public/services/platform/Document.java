

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;
import com.docuware.dev.schema._public.services.platform.Document;
import java.io.InputStream;
import com.docuware.dev.schema._public.services.platform.DocumentsQueryResult;
import com.docuware.dev.schema._public.services.platform.ContentDivideOperationInfo;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import com.docuware.dev.schema._public.services.platform.IntegerList;
import com.docuware.dev.schema._public.services.platform.DocumentWordSearchResult;
import com.docuware.dev.schema._public.services.platform.SearchPositionQuery;
import com.docuware.dev.schema._public.services.platform.LockInfo;
import com.docuware.dev.schema._public.services.platform.DocumentIndexFields;
import com.docuware.dev.schema._public.services.platform.UpdateIndexFieldsInfo;
import com.docuware.dev.schema._public.services.platform.SuggestionFields;
import com.docuware.dev.schema._public.services.platform.Sections;
import com.docuware.dev.schema._public.services.platform.Section;
import com.docuware.dev.schema._public.services.platform.FileDownload;
import com.docuware.dev.schema._public.services.platform.DocumentActionInfo;
import com.docuware.dev.schema._public.services.platform.DocumentApplicationProperties;
import com.docuware.dev.schema._public.services.platform.DocumentLinks;
import com.docuware.dev.schema._public.services.platform.ResultListQuery;
import com.docuware.dev.schema._public.services.platform.CheckOutResult;
import com.docuware.dev.schema._public.services.platform.CheckOutToFileSystemInfo;
import com.docuware.dev.schema._public.services.platform.ExportSettings;
import com.docuware.dev.schema._public.services.platform.DocumentAnnotations;
import com.docuware.dev.schema._public.services.platform.DocumentAnnotationsPlacement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.docuware.dev._public.intellix.DocumentContent;
import com.docuware.dev.schema._public.services.Links;
import org.w3c.dom.Element;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
"proxy",
"lastModifiedSpecified",
"createdAtSpecified",
    "fields",
    "suggestions",
    "flags",
    "version",
    "textShot",
    "links",
    "sections",
    "preview",
    "contentType",
    "fileChunk",
    "applicationProperties"
})
public class Document  implements IRelationsWithProxy, IStringContent, IChunkable {
private HttpClientProxy proxy;//test

private boolean lastModifiedSpecified;//test

private boolean createdAtSpecified;//test


    @XmlElement(name = "Fields", required = true)
    protected DocumentIndexFields fields;
    @XmlElement(name = "Suggestions")
    protected SuggestionFields suggestions;
    @XmlElement(name = "Flags")
    protected DocumentFlags flags;
    @XmlElement(name = "Version")
    protected DocumentVersion version;
    @XmlElement(name = "TextShot")
    protected List<DocumentContent> textShot;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services")
    protected Links links;
    @XmlElement(name = "Sections")
    protected Sections sections;
    @XmlElement(name = "Preview")
    protected Document.Preview preview;
    @XmlElement(name = "ContentType")
    protected String contentType;
    @XmlElement(name = "FileChunk")
    protected UploadedFileChunk fileChunk;
    @XmlElement(name = "ApplicationProperties")
    protected DocumentApplicationProperties applicationProperties;
    @XmlAttribute(name = "HaveMoreTotalPages")
    protected Boolean haveMoreTotalPages;
    @XmlAttribute(name = "HasTextAnnotation")
    protected Boolean hasTextAnnotation;
    @XmlAttribute(name = "HasXmlDigitalSignatures")
    protected Boolean hasXmlDigitalSignatures;
    @XmlAttribute(name = "TotalPages")
    protected Integer totalPages;
    @XmlAttribute(name = "Id")
    protected Integer id;
    @XmlAttribute(name = "Title")
    protected String title;
    @XmlAttribute(name = "LastModified")
    @XmlSchemaType(name = "dateTime")
    protected GregorianCalendar lastModified;
    @XmlAttribute(name = "CreatedAt")
    @XmlSchemaType(name = "dateTime")
    protected GregorianCalendar createdAt;
    @XmlAttribute(name = "FileSize")
    protected Long fileSize;
    @XmlAttribute(name = "SectionCount")
    protected Integer sectionCount;
    @XmlAttribute(name = "IntellixTrust")
    protected IntellixTrust intellixTrust;
    @XmlAttribute(name = "VersionStatus")
    protected VersionManagementStatus versionStatus;

    /**Fields of a document*/
    public DocumentIndexFields getFields() {
        return fields;
    }

    /**Fields of a document*/
    public void setFields(DocumentIndexFields value) {
        this.fields = value;
    }

    /**Fields of a document*/
    public SuggestionFields getSuggestions() {
        return suggestions;
    }

    /**Fields of a document*/
    public void setSuggestions(SuggestionFields value) {
        this.suggestions = value;
    }

    /**Flags of a document*/
    public DocumentFlags getFlags() {
        return flags;
    }

    /**Flags of a document*/
    public void setFlags(DocumentFlags value) {
        this.flags = value;
    }

    /**Version of a document*/
    public DocumentVersion getVersion() {
        return version;
    }

    /**Version of a document*/
    public void setVersion(DocumentVersion value) {
        this.version = value;
    }

    /**ArrayList is required for the XML-Marshalling */
    public void setTextShot(ArrayList<DocumentContent> value) {
        textShot=value;
    }

    /**Obsolete. Use TextShots property. Content textshot (OCR) of the document*/
    @Dolphin
    public List<DocumentContent> getTextShot() {
        if (textShot == null) {
            textShot = new ArrayList<DocumentContent>();
        }
        return this.textShot;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links value) {
        this.links = value;
    }

    /**Sections of the document. Contain no sections if document is DBRecord*/
    public Sections getSections() {
        return sections;
    }

    /**Sections of the document. Contain no sections if document is DBRecord*/
    public void setSections(Sections value) {
        this.sections = value;
    }

    /**Contains an XHTML preview of the document. This can be used to display a part of text which contains the hits of a full-text query.*/
    public Document.Preview getPreview() {
        return preview;
    }

    /**Contains an XHTML preview of the document. This can be used to display a part of text which contains the hits of a full-text query.*/
    public void setPreview(Document.Preview value) {
        this.preview = value;
    }

    /**The internet media type of the document. If there is no section this value is missing.*/
    public String getContentType() {
        return contentType;
    }

    /**The internet media type of the document. If there is no section this value is missing.*/
    public void setContentType(String value) {
        this.contentType = value;
    }

    /**Contains data for a file chunk during a big file upload. This data is created on the server of every chunk request.*/
    public UploadedFileChunk getFileChunk() {
        return fileChunk;
    }

    /**Contains data for a file chunk during a big file upload. This data is created on the server of every chunk request.*/
    public void setFileChunk(UploadedFileChunk value) {
        this.fileChunk = value;
    }

    /**Define application specific properties. Different applications store specific application here*/
    public DocumentApplicationProperties getApplicationProperties() {
        return applicationProperties;
    }

    /**Define application specific properties. Different applications store specific application here*/
    public void setApplicationProperties(DocumentApplicationProperties value) {
        this.applicationProperties = value;
    }

    /**Contains true if all pages are known so PageCount contains exact number the pages in section. If the value is set to false there are more pagesm but at least the number set in PageCount*/
    public boolean isHaveMoreTotalPages() {
        if (haveMoreTotalPages == null) {
            return false;
        } else {
            return haveMoreTotalPages;
        }
    }

    /**The number of pages of this section, if known. If it is unknown, this value is -1.*/
    public void setHaveMoreTotalPages(Boolean value) {
        this.haveMoreTotalPages = value;
    }

    /**Contains true if document has a text annotation (the first section of the document has text annotation)*/
    public boolean isHasTextAnnotation() {
        if (hasTextAnnotation == null) {
            return false;
        } else {
            return hasTextAnnotation;
        }
    }

    /**Contains true if document has a text annotation (the first section of the document has text annotation)*/
    public void setHasTextAnnotation(Boolean value) {
        this.hasTextAnnotation = value;
    }

    /**Contains true if document contains at least one XML Digital signature*/
    @Eagle
    public boolean isHasXmlDigitalSignatures() {
        if (hasXmlDigitalSignatures == null) {
            return false;
        } else {
            return hasXmlDigitalSignatures;
        }
    }

    /**Contains true if document contains at least one XML Digital signature*/
    @Eagle
    public void setHasXmlDigitalSignatures(Boolean value) {
        this.hasXmlDigitalSignatures = value;
    }

    public int getTotalPages() {
        if (totalPages == null) {
            return  0;
        } else {
            return totalPages;
        }
    }

    public void setTotalPages(Integer value) {
        this.totalPages = value;
    }

    /**Document identity*/
    public int getId() {
        if (id == null) {
            return -1;
        } else {
            return id;
        }
    }

    /**Document identity*/
    public void setId(Integer value) {
        this.id = value;
    }

    /**The title of the document, if it exists.*/
    public String getTitle() {
        return title;
    }

    /**The title of the document, if it exists.*/
    public void setTitle(String value) {
        this.title = value;
    }

    /**Contains last modification date of the document*/
    public GregorianCalendar getLastModified() {
        return lastModified;
    }

    /**Contains last modification date of the document*/
    public void setLastModified(GregorianCalendar value) {
        this.lastModified = value;
    }

    /**Contains creation date of the document*/
    public GregorianCalendar getCreatedAt() {
        return createdAt;
    }

    /**Contains creation date of the document*/
    public void setCreatedAt(GregorianCalendar value) {
        this.createdAt = value;
    }

    /**The sum of the size of all section files and document header.*/
    public long getFileSize() {
        if (fileSize == null) {
            return  0L;
        } else {
            return fileSize;
        }
    }

    /**The sum of the size of all section files and document header.*/
    public void setFileSize(Long value) {
        this.fileSize = value;
    }

    /**The number of sections of this document. This number is equal to the sequence length of the Sections element.*/
    public int getSectionCount() {
        if (sectionCount == null) {
            return  0;
        } else {
            return sectionCount;
        }
    }

    /**The number of sections of this document. This number is equal to the sequence length of the Sections element.*/
    public void setSectionCount(Integer value) {
        this.sectionCount = value;
    }

    /**Intellix status*/
    public IntellixTrust getIntellixTrust() {
        if (intellixTrust == null) {
            return IntellixTrust.NONE;
        } else {
            return intellixTrust;
        }
    }

    /**Intellix status*/
    public void setIntellixTrust(IntellixTrust value) {
        this.intellixTrust = value;
    }

    /**Version management status of the document*/
    public VersionManagementStatus getVersionStatus() {
        if (versionStatus == null) {
            return VersionManagementStatus.DISABLE;
        } else {
            return versionStatus;
        }
    }

    /**Version management status of the document*/
    public void setVersionStatus(VersionManagementStatus value) {
        this.versionStatus = value;
    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class Preview {

        @XmlAnyElement
        protected XElementWrapper any;

        public XElementWrapper getAny() {
            return any;
        }

        public void setAny(XElementWrapper value) {
            this.any = value;
        }

    }

    @Extension
    public boolean isCreatedAtSpecified() {
	return createdAtSpecified;
    }

    @Extension
    public void setCreatedAtSpecified(boolean value) {
	createdAtSpecified=value;
    }

    @Extension
    public boolean isLastModifiedSpecified() {
	return lastModifiedSpecified;
    }

    @Extension
    public void setLastModifiedSpecified(boolean value) {
	lastModifiedSpecified=value;
    }


	/**
	* Returns a String that represents that instance.
	* 
	* @return	A String representing that instance
	*/
    @Extension
    public String toString() {
	return Extensions.documentToString(this);
    }


	/**
	* Gets the DocumentIndexField with the specified name.
	* 
	* @param fieldName	Name of the Field
	* @return	The documentIndeField
	*/
    @Extension
    public DocumentIndexField getDocumentIndexField(String fieldName) {
	return Extensions.getDocumentIndexFieldByNameFromDocument(this, fieldName);
    }


	/**
	* Sets the DocumentIndexField with the specified name.
	* 
	* @param fieldName	Name of the Field
	* @param value	The value
	*/
    @Extension
    public void setDocumentIndexField(String fieldName,DocumentIndexField value) {
	Extensions.setDocumentIndexFieldByNameFromDocument(this, fieldName, value);
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
	if(this.sections!=null) { 
		for (int i = 0; (i < this.sections.getSection().size()); i = (i + 1)) {
			this.sections.getSection().get(i).setProxy(proxy);
		}
	}
       if ((fileChunk != null)) {
           fileChunk.setProxy(proxy);
       }
    }


	/**
	* Adds a section to a document using chunked upload
	*
	* @param file	The file
	* @param chunkSize	[optional/ set this parameter to 0 if you want to use default value] The size of the chunk in bytes
	* @return	The new section's metadata
	*/
    @Extension
    public Section chunkAddSection(java.io.File file,int chunkSize) {
	return FileCabinetExtensionsBase.chunkAddSection(this, FileWrapper.toFileInfoWrapper(file), chunkSize);
    }


	/**
	* Appends one or more new sections to the specified document
	*
	* @param file	The file
	* @return	The modified document
	*/
    @Extension
    public Document addDocumentSection(java.io.File... file) {
	return FileCabinetExtensionsBase.addDocumentSections(this, FileWrapper.toFileInfoWrapper(file));
    }


	/**
	* Appends one or more new sections to the specified document asynchronously
	*
	* @param file	The file
	* @return	A CompletableFuture which uploads the document and returns the uploaded document's metadata.
	*/
    @Extension
    public CompletableFuture<DeserializedHttpResponseGen<Document>> addDocumentSectionAsync(java.io.File... file) {
	return FileCabinetExtensionsBase.addDocumentSectionsAsync(this, FileWrapper.toFileInfoWrapper(file));
    }


	/**
	* Appends one section to the specified document asynchronously
	*
	* @param file	The file
	* @return	A CompletableFuture which uploads the document and returns the uploaded section's metadata.
	*/
    @Extension
    public CompletableFuture<DeserializedHttpResponseGen<Section>> uploadSectionAsync(java.io.File file) {
	return FileCabinetExtensionsBase.uploadSectionAsync(this, FileWrapper.toFileInfoWrapper(file));
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
    * Gets the Uri of the Link for the relation "ContentDivideOperation".
    * Returns the Uri of the Link for the relation "ContentDivideOperation", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getContentDivideOperationRelationLink() {
        return MethodInvocation.getLink(this, links, "contentDivideOperation");
    }

    /**
    * Calls the HTTP put Method on the link for the relation "ContentDivideOperation".
    */
    public DocumentsQueryResult putToContentDivideOperationRelationForDocumentsQueryResult(ContentDivideOperationInfo data) {
        return MethodInvocation.<DocumentsQueryResult, ContentDivideOperationInfo> put(this, links, "contentDivideOperation", DocumentsQueryResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ContentDivideOperationInfo"), ContentDivideOperationInfo.class, null, data), "application/vnd.docuware.platform.contentdivideoperationinfo+xml", "application/vnd.docuware.platform.documents+xml");
    }

    /**
    * Calls the HTTP put Method on the link for the relation "ContentDivideOperation" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentsQueryResult>> putToContentDivideOperationRelationForDocumentsQueryResultAsync(ContentDivideOperationInfo data) {
        return MethodInvocation.<DocumentsQueryResult, ContentDivideOperationInfo >putAsync(this, links, "contentDivideOperation", DocumentsQueryResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ContentDivideOperationInfo"), ContentDivideOperationInfo.class, null, data), "application/vnd.docuware.platform.contentdivideoperationinfo+xml", "application/vnd.docuware.platform.documents+xml");
    }

    /**
    * Calls the HTTP put Method on the link for the relation "ContentDivideOperation" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentsQueryResult>> putToContentDivideOperationRelationForDocumentsQueryResultAsync(CancellationToken ct, ContentDivideOperationInfo data) {
        return MethodInvocation.<DocumentsQueryResult, ContentDivideOperationInfo >putAsync(this, links, "contentDivideOperation", DocumentsQueryResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ContentDivideOperationInfo"), ContentDivideOperationInfo.class, null, data), "application/vnd.docuware.platform.contentdivideoperationinfo+xml", "application/vnd.docuware.platform.documents+xml", ct);
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
    * Gets the Uri of the Link for the relation "Unclip".
    * Returns the Uri of the Link for the relation "Unclip", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getUnclipRelationLink() {
        return MethodInvocation.getLink(this, links, "unclip");
    }

    /**
    * Calls the HTTP put Method on the link for the relation "Unclip".
    */
    public DocumentsQueryResult putToUnclipRelationForDocumentsQueryResult(InputStream data) { 
        return MethodInvocation.<DocumentsQueryResult, InputStream>put(this, links, "unclip", DocumentsQueryResult.class, data, "application/xml", "application/vnd.docuware.platform.documents+xml");
}

    /**
    * Calls the HTTP put Method on the link for the relation "Unclip" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentsQueryResult>> putToUnclipRelationForDocumentsQueryResultAsync(InputStream data) { 
        return MethodInvocation.<DocumentsQueryResult, InputStream>putAsync(this, links, "unclip", DocumentsQueryResult.class, data, "application/xml", "application/vnd.docuware.platform.documents+xml");
}

    /**
    * Calls the HTTP put Method on the link for the relation "Unclip" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentsQueryResult>> putToUnclipRelationForDocumentsQueryResultAsync(CancellationToken ct, InputStream data) { 
        return MethodInvocation.<DocumentsQueryResult, InputStream>putAsync(this, links, "unclip", DocumentsQueryResult.class, data, "application/xml", "application/vnd.docuware.platform.documents+xml", ct);
}

    /**
    * Gets the Uri of the Link for the relation "Positions".
    * Returns the Uri of the Link for the relation "Positions", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getPositionsRelationLink() {
        return MethodInvocation.getLink(this, links, "positions");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Positions".
    */
    public DocumentWordSearchResult getDocumentWordSearchResultFromPositionsRelation() {
        return MethodInvocation.<DocumentWordSearchResult>get(this, links, "positions", DocumentWordSearchResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Positions" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentWordSearchResult>> getDocumentWordSearchResultFromPositionsRelationAsync() {
        return MethodInvocation.<DocumentWordSearchResult>getAsync(this, links, "positions", DocumentWordSearchResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Positions" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentWordSearchResult>> getDocumentWordSearchResultFromPositionsRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DocumentWordSearchResult>getAsync(this, links, "positions", DocumentWordSearchResult.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Positions".
    */
    public DocumentWordSearchResult postToPositionsRelationForDocumentWordSearchResult(SearchPositionQuery data) {
        return MethodInvocation.<DocumentWordSearchResult, SearchPositionQuery> post(this, links, "positions", DocumentWordSearchResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "SearchPositionQuery"), SearchPositionQuery.class, null, data), "application/vnd.docuware.platform.searchpositionquery+xml", "application/vnd.docuware.platform.section.documentwordsearchresult+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Positions" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentWordSearchResult>> postToPositionsRelationForDocumentWordSearchResultAsync(SearchPositionQuery data) {
        return MethodInvocation.<DocumentWordSearchResult, SearchPositionQuery >postAsync(this, links, "positions", DocumentWordSearchResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "SearchPositionQuery"), SearchPositionQuery.class, null, data), "application/vnd.docuware.platform.searchpositionquery+xml", "application/vnd.docuware.platform.section.documentwordsearchresult+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Positions" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentWordSearchResult>> postToPositionsRelationForDocumentWordSearchResultAsync(CancellationToken ct, SearchPositionQuery data) {
        return MethodInvocation.<DocumentWordSearchResult, SearchPositionQuery >postAsync(this, links, "positions", DocumentWordSearchResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "SearchPositionQuery"), SearchPositionQuery.class, null, data), "application/vnd.docuware.platform.searchpositionquery+xml", "application/vnd.docuware.platform.section.documentwordsearchresult+xml", ct);
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
    * Gets the Uri of the Link for the relation "DeepZoomImage".
    * Returns the Uri of the Link for the relation "DeepZoomImage", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getDeepZoomImageRelationLink() {
        return MethodInvocation.getLink(this, links, "deepZoomImage");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "DeepZoomImage".
    */
    public InputStream getInputStreamFromDeepZoomImageRelation() {
        return MethodInvocation.<InputStream>get(this, links, "deepZoomImage", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "DeepZoomImage" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromDeepZoomImageRelationAsync() {
        return MethodInvocation.<InputStream>getAsync(this, links, "deepZoomImage", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "DeepZoomImage" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromDeepZoomImageRelationAsync(CancellationToken ct) {
        return MethodInvocation.<InputStream>getAsync(this, links, "deepZoomImage", InputStream.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "DeepZoomImageWithAnnotation".
    * Returns the Uri of the Link for the relation "DeepZoomImageWithAnnotation", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getDeepZoomImageWithAnnotationRelationLink() {
        return MethodInvocation.getLink(this, links, "deepZoomImageWithAnnotation");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "DeepZoomImageWithAnnotation".
    */
    public InputStream getInputStreamFromDeepZoomImageWithAnnotationRelation() {
        return MethodInvocation.<InputStream>get(this, links, "deepZoomImageWithAnnotation", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "DeepZoomImageWithAnnotation" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromDeepZoomImageWithAnnotationRelationAsync() {
        return MethodInvocation.<InputStream>getAsync(this, links, "deepZoomImageWithAnnotation", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "DeepZoomImageWithAnnotation" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromDeepZoomImageWithAnnotationRelationAsync(CancellationToken ct) {
        return MethodInvocation.<InputStream>getAsync(this, links, "deepZoomImageWithAnnotation", InputStream.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "ResultListIcon".
    * Returns the Uri of the Link for the relation "ResultListIcon", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getResultListIconRelationLink() {
        return MethodInvocation.getLink(this, links, "resultListIcon");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "ResultListIcon".
    */
    public InputStream getInputStreamFromResultListIconRelation() {
        return MethodInvocation.<InputStream>get(this, links, "resultListIcon", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "ResultListIcon" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromResultListIconRelationAsync() {
        return MethodInvocation.<InputStream>getAsync(this, links, "resultListIcon", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "ResultListIcon" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromResultListIconRelationAsync(CancellationToken ct) {
        return MethodInvocation.<InputStream>getAsync(this, links, "resultListIcon", InputStream.class, ct);
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
    * Gets the Uri of the Link for the relation "Content".
    * Returns the Uri of the Link for the relation "Content", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getContentRelationLink() {
        return MethodInvocation.getLink(this, links, "content");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Content".
    */
    public InputStream getInputStreamFromContentRelation() {
        return MethodInvocation.<InputStream>get(this, links, "content", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Content" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromContentRelationAsync() {
        return MethodInvocation.<InputStream>getAsync(this, links, "content", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Content" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromContentRelationAsync(CancellationToken ct) {
        return MethodInvocation.<InputStream>getAsync(this, links, "content", InputStream.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Content".
    */
    public InputStream postToContentRelationForInputStream(IntegerList data) {
        return MethodInvocation.<InputStream, IntegerList> post(this, links, "content", InputStream.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "IntegerList"), IntegerList.class, null, data), "application/vnd.docuware.platform.integerlist+xml", "application/xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Content" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> postToContentRelationForInputStreamAsync(IntegerList data) {
        return MethodInvocation.<InputStream, IntegerList >postAsync(this, links, "content", InputStream.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "IntegerList"), IntegerList.class, null, data), "application/vnd.docuware.platform.integerlist+xml", "application/xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Content" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> postToContentRelationForInputStreamAsync(CancellationToken ct, IntegerList data) {
        return MethodInvocation.<InputStream, IntegerList >postAsync(this, links, "content", InputStream.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "IntegerList"), IntegerList.class, null, data), "application/vnd.docuware.platform.integerlist+xml", "application/xml", ct);
    }

    /**
    * Gets the Uri of the Link for the relation "FileDownload".
    * Returns the Uri of the Link for the relation "FileDownload", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getFileDownloadRelationLink() {
        return MethodInvocation.getLink(this, links, "fileDownload");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "FileDownload".
    */
    public InputStream getInputStreamFromFileDownloadRelation() {
        return MethodInvocation.<InputStream>get(this, links, "fileDownload", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "FileDownload" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromFileDownloadRelationAsync() {
        return MethodInvocation.<InputStream>getAsync(this, links, "fileDownload", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "FileDownload" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromFileDownloadRelationAsync(CancellationToken ct) {
        return MethodInvocation.<InputStream>getAsync(this, links, "fileDownload", InputStream.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "FileDownload".
    */
    public InputStream postToFileDownloadRelationForInputStream(FileDownload data) {
        return MethodInvocation.<InputStream, FileDownload> post(this, links, "fileDownload", InputStream.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "FileDownload"), FileDownload.class, null, data), "application/xml", "application/xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "FileDownload" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> postToFileDownloadRelationForInputStreamAsync(FileDownload data) {
        return MethodInvocation.<InputStream, FileDownload >postAsync(this, links, "fileDownload", InputStream.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "FileDownload"), FileDownload.class, null, data), "application/xml", "application/xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "FileDownload" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> postToFileDownloadRelationForInputStreamAsync(CancellationToken ct, FileDownload data) {
        return MethodInvocation.<InputStream, FileDownload >postAsync(this, links, "fileDownload", InputStream.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "FileDownload"), FileDownload.class, null, data), "application/xml", "application/xml", ct);
    }

    /**
    * Gets the Uri of the Link for the relation "TextAnnotation".
    * Returns the Uri of the Link for the relation "TextAnnotation", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getTextAnnotationRelationLink() {
        return MethodInvocation.getLink(this, links, "textAnnotation");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "TextAnnotation".
    */
    public InputStream getInputStreamFromTextAnnotationRelation() {
        return MethodInvocation.<InputStream>get(this, links, "textAnnotation", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "TextAnnotation" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromTextAnnotationRelationAsync() {
        return MethodInvocation.<InputStream>getAsync(this, links, "textAnnotation", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "TextAnnotation" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromTextAnnotationRelationAsync(CancellationToken ct) {
        return MethodInvocation.<InputStream>getAsync(this, links, "textAnnotation", InputStream.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "TextAnnotation".
    */
    public InputStream postToTextAnnotationRelationForInputStream(InputStream data) { 
        return MethodInvocation.<InputStream, InputStream>post(this, links, "textAnnotation", InputStream.class, data, "text/string", "application/xml");
}

    /**
    * Calls the HTTP post Method on the link for the relation "TextAnnotation" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> postToTextAnnotationRelationForInputStreamAsync(InputStream data) { 
        return MethodInvocation.<InputStream, InputStream>postAsync(this, links, "textAnnotation", InputStream.class, data, "text/string", "application/xml");
}

    /**
    * Calls the HTTP post Method on the link for the relation "TextAnnotation" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> postToTextAnnotationRelationForInputStreamAsync(CancellationToken ct, InputStream data) { 
        return MethodInvocation.<InputStream, InputStream>postAsync(this, links, "textAnnotation", InputStream.class, data, "text/string", "application/xml", ct);
}

    /**
    * Gets the Uri of the Link for the relation "ChecksumStatus".
    * Returns the Uri of the Link for the relation "ChecksumStatus", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getChecksumStatusRelationLink() {
        return MethodInvocation.getLink(this, links, "checksumStatus");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "ChecksumStatus".
    */
    public InputStream getInputStreamFromChecksumStatusRelation() {
        return MethodInvocation.<InputStream>get(this, links, "checksumStatus", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "ChecksumStatus" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromChecksumStatusRelationAsync() {
        return MethodInvocation.<InputStream>getAsync(this, links, "checksumStatus", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "ChecksumStatus" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromChecksumStatusRelationAsync(CancellationToken ct) {
        return MethodInvocation.<InputStream>getAsync(this, links, "checksumStatus", InputStream.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "XmlDSigContent".
    * Returns the Uri of the Link for the relation "XmlDSigContent", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getXmlDSigContentRelationLink() {
        return MethodInvocation.getLink(this, links, "xmlDSigContent");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "XmlDSigContent".
    */
    public InputStream getInputStreamFromXmlDSigContentRelation() {
        return MethodInvocation.<InputStream>get(this, links, "xmlDSigContent", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "XmlDSigContent" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromXmlDSigContentRelationAsync() {
        return MethodInvocation.<InputStream>getAsync(this, links, "xmlDSigContent", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "XmlDSigContent" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromXmlDSigContentRelationAsync(CancellationToken ct) {
        return MethodInvocation.<InputStream>getAsync(this, links, "xmlDSigContent", InputStream.class, ct);
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
    * Gets the Uri of the Link for the relation "ProcessDocumentAction".
    * Returns the Uri of the Link for the relation "ProcessDocumentAction", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getProcessDocumentActionRelationLink() {
        return MethodInvocation.getLink(this, links, "processDocumentAction");
    }

    /**
    * Calls the HTTP put Method on the link for the relation "ProcessDocumentAction".
    */
    public Document putToProcessDocumentActionRelationForDocument(DocumentActionInfo data) {
        return MethodInvocation.<Document, DocumentActionInfo> put(this, links, "processDocumentAction", Document.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentActionInfo"), DocumentActionInfo.class, null, data), "application/xml", "application/vnd.docuware.platform.document+xml");
    }

    /**
    * Calls the HTTP put Method on the link for the relation "ProcessDocumentAction" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Document>> putToProcessDocumentActionRelationForDocumentAsync(DocumentActionInfo data) {
        return MethodInvocation.<Document, DocumentActionInfo >putAsync(this, links, "processDocumentAction", Document.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentActionInfo"), DocumentActionInfo.class, null, data), "application/xml", "application/vnd.docuware.platform.document+xml");
    }

    /**
    * Calls the HTTP put Method on the link for the relation "ProcessDocumentAction" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Document>> putToProcessDocumentActionRelationForDocumentAsync(CancellationToken ct, DocumentActionInfo data) {
        return MethodInvocation.<Document, DocumentActionInfo >putAsync(this, links, "processDocumentAction", Document.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentActionInfo"), DocumentActionInfo.class, null, data), "application/xml", "application/vnd.docuware.platform.document+xml", ct);
    }

    /**
    * Gets the Uri of the Link for the relation "AppProperties".
    * Returns the Uri of the Link for the relation "AppProperties", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getAppPropertiesRelationLink() {
        return MethodInvocation.getLink(this, links, "appProperties");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "AppProperties".
    */
    public DocumentApplicationProperties getDocumentApplicationPropertiesFromAppPropertiesRelation() {
        return MethodInvocation.<DocumentApplicationProperties>get(this, links, "appProperties", DocumentApplicationProperties.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "AppProperties" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentApplicationProperties>> getDocumentApplicationPropertiesFromAppPropertiesRelationAsync() {
        return MethodInvocation.<DocumentApplicationProperties>getAsync(this, links, "appProperties", DocumentApplicationProperties.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "AppProperties" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentApplicationProperties>> getDocumentApplicationPropertiesFromAppPropertiesRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DocumentApplicationProperties>getAsync(this, links, "appProperties", DocumentApplicationProperties.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "AppProperties".
    */
    public DocumentApplicationProperties postToAppPropertiesRelationForDocumentApplicationProperties(DocumentApplicationProperties data) {
        return MethodInvocation.<DocumentApplicationProperties, DocumentApplicationProperties> post(this, links, "appProperties", DocumentApplicationProperties.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentApplicationProperties"), DocumentApplicationProperties.class, null, data), "application/vnd.docuware.platform.documentapplicationproperties+xml", "application/vnd.docuware.platform.documentapplicationproperties+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "AppProperties" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentApplicationProperties>> postToAppPropertiesRelationForDocumentApplicationPropertiesAsync(DocumentApplicationProperties data) {
        return MethodInvocation.<DocumentApplicationProperties, DocumentApplicationProperties >postAsync(this, links, "appProperties", DocumentApplicationProperties.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentApplicationProperties"), DocumentApplicationProperties.class, null, data), "application/vnd.docuware.platform.documentapplicationproperties+xml", "application/vnd.docuware.platform.documentapplicationproperties+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "AppProperties" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentApplicationProperties>> postToAppPropertiesRelationForDocumentApplicationPropertiesAsync(CancellationToken ct, DocumentApplicationProperties data) {
        return MethodInvocation.<DocumentApplicationProperties, DocumentApplicationProperties >postAsync(this, links, "appProperties", DocumentApplicationProperties.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentApplicationProperties"), DocumentApplicationProperties.class, null, data), "application/vnd.docuware.platform.documentapplicationproperties+xml", "application/vnd.docuware.platform.documentapplicationproperties+xml", ct);
    }

    /**
    * Gets the Uri of the Link for the relation "DocumentLinks".
    * Returns the Uri of the Link for the relation "DocumentLinks", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getDocumentLinksRelationLink() {
        return MethodInvocation.getLink(this, links, "documentLinks");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "DocumentLinks".
    */
    public DocumentLinks getDocumentLinksFromDocumentLinksRelation() {
        return MethodInvocation.<DocumentLinks>get(this, links, "documentLinks", DocumentLinks.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "DocumentLinks" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentLinks>> getDocumentLinksFromDocumentLinksRelationAsync() {
        return MethodInvocation.<DocumentLinks>getAsync(this, links, "documentLinks", DocumentLinks.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "DocumentLinks" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentLinks>> getDocumentLinksFromDocumentLinksRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DocumentLinks>getAsync(this, links, "documentLinks", DocumentLinks.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "LatestVersion".
    * Returns the Uri of the Link for the relation "LatestVersion", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getLatestVersionRelationLink() {
        return MethodInvocation.getLink(this, links, "latestVersion");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "LatestVersion".
    */
    public Document getDocumentFromLatestVersionRelation() {
        return MethodInvocation.<Document>get(this, links, "latestVersion", Document.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "LatestVersion" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Document>> getDocumentFromLatestVersionRelationAsync() {
        return MethodInvocation.<Document>getAsync(this, links, "latestVersion", Document.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "LatestVersion" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Document>> getDocumentFromLatestVersionRelationAsync(CancellationToken ct) {
        return MethodInvocation.<Document>getAsync(this, links, "latestVersion", Document.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "VersionHistory".
    * Returns the Uri of the Link for the relation "VersionHistory", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getVersionHistoryRelationLink() {
        return MethodInvocation.getLink(this, links, "versionHistory");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "VersionHistory".
    */
    public DocumentsQueryResult getDocumentsQueryResultFromVersionHistoryRelation() {
        return MethodInvocation.<DocumentsQueryResult>get(this, links, "versionHistory", DocumentsQueryResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "VersionHistory" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentsQueryResult>> getDocumentsQueryResultFromVersionHistoryRelationAsync() {
        return MethodInvocation.<DocumentsQueryResult>getAsync(this, links, "versionHistory", DocumentsQueryResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "VersionHistory" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentsQueryResult>> getDocumentsQueryResultFromVersionHistoryRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DocumentsQueryResult>getAsync(this, links, "versionHistory", DocumentsQueryResult.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "VersionHistory".
    */
    public DocumentsQueryResult postToVersionHistoryRelationForDocumentsQueryResult(ResultListQuery data) {
        return MethodInvocation.<DocumentsQueryResult, ResultListQuery> post(this, links, "versionHistory", DocumentsQueryResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ResultListQuery"), ResultListQuery.class, null, data), "application/vnd.docuware.platform.resultlistquery+xml", "application/vnd.docuware.platform.documents+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "VersionHistory" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentsQueryResult>> postToVersionHistoryRelationForDocumentsQueryResultAsync(ResultListQuery data) {
        return MethodInvocation.<DocumentsQueryResult, ResultListQuery >postAsync(this, links, "versionHistory", DocumentsQueryResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ResultListQuery"), ResultListQuery.class, null, data), "application/vnd.docuware.platform.resultlistquery+xml", "application/vnd.docuware.platform.documents+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "VersionHistory" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentsQueryResult>> postToVersionHistoryRelationForDocumentsQueryResultAsync(CancellationToken ct, ResultListQuery data) {
        return MethodInvocation.<DocumentsQueryResult, ResultListQuery >postAsync(this, links, "versionHistory", DocumentsQueryResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ResultListQuery"), ResultListQuery.class, null, data), "application/vnd.docuware.platform.resultlistquery+xml", "application/vnd.docuware.platform.documents+xml", ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Intellix".
    * Returns the Uri of the Link for the relation "Intellix", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getIntellixRelationLink() {
        return MethodInvocation.getLink(this, links, "intellix");
    }

    /**
    * Gets the Uri of the Link for the relation "CheckoutDocument".
    * Returns the Uri of the Link for the relation "CheckoutDocument", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getCheckoutDocumentRelationLink() {
        return MethodInvocation.getLink(this, links, "checkoutDocument");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "CheckoutDocument".
    */
    public CheckOutResult postToCheckoutDocumentRelationForCheckOutResult(CheckOutToFileSystemInfo data) {
        return MethodInvocation.<CheckOutResult, CheckOutToFileSystemInfo> post(this, links, "checkoutDocument", CheckOutResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "CheckOutToFileSystemInfo"), CheckOutToFileSystemInfo.class, null, data), "application/xml", "application/xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "CheckoutDocument" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<CheckOutResult>> postToCheckoutDocumentRelationForCheckOutResultAsync(CheckOutToFileSystemInfo data) {
        return MethodInvocation.<CheckOutResult, CheckOutToFileSystemInfo >postAsync(this, links, "checkoutDocument", CheckOutResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "CheckOutToFileSystemInfo"), CheckOutToFileSystemInfo.class, null, data), "application/xml", "application/xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "CheckoutDocument" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<CheckOutResult>> postToCheckoutDocumentRelationForCheckOutResultAsync(CancellationToken ct, CheckOutToFileSystemInfo data) {
        return MethodInvocation.<CheckOutResult, CheckOutToFileSystemInfo >postAsync(this, links, "checkoutDocument", CheckOutResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "CheckOutToFileSystemInfo"), CheckOutToFileSystemInfo.class, null, data), "application/xml", "application/xml", ct);
    }

    /**
    * Gets the Uri of the Link for the relation "CheckoutToFileSystem".
    * Returns the Uri of the Link for the relation "CheckoutToFileSystem", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getCheckoutToFileSystemRelationLink() {
        return MethodInvocation.getLink(this, links, "checkoutToFileSystem");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "CheckoutToFileSystem".
    */
    public InputStream postToCheckoutToFileSystemRelationForInputStream(CheckOutToFileSystemInfo data) {
        return MethodInvocation.<InputStream, CheckOutToFileSystemInfo> post(this, links, "checkoutToFileSystem", InputStream.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "CheckOutToFileSystemInfo"), CheckOutToFileSystemInfo.class, null, data), "application/xml", "application/xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "CheckoutToFileSystem" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> postToCheckoutToFileSystemRelationForInputStreamAsync(CheckOutToFileSystemInfo data) {
        return MethodInvocation.<InputStream, CheckOutToFileSystemInfo >postAsync(this, links, "checkoutToFileSystem", InputStream.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "CheckOutToFileSystemInfo"), CheckOutToFileSystemInfo.class, null, data), "application/xml", "application/xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "CheckoutToFileSystem" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> postToCheckoutToFileSystemRelationForInputStreamAsync(CancellationToken ct, CheckOutToFileSystemInfo data) {
        return MethodInvocation.<InputStream, CheckOutToFileSystemInfo >postAsync(this, links, "checkoutToFileSystem", InputStream.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "CheckOutToFileSystemInfo"), CheckOutToFileSystemInfo.class, null, data), "application/xml", "application/xml", ct);
    }

    /**
    * Gets the Uri of the Link for the relation "CheckInFromFileSystem".
    * Returns the Uri of the Link for the relation "CheckInFromFileSystem", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getCheckInFromFileSystemRelationLink() {
        return MethodInvocation.getLink(this, links, "checkInFromFileSystem");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "CheckInFromFileSystem".
    */
    public Document postToCheckInFromFileSystemRelationForDocument(InputStream data) { 
        return MethodInvocation.<Document, InputStream>post(this, links, "checkInFromFileSystem", Document.class, data, "multipart/form-data", "application/vnd.docuware.platform.document+xml");
}

    /**
    * Calls the HTTP post Method on the link for the relation "CheckInFromFileSystem" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Document>> postToCheckInFromFileSystemRelationForDocumentAsync(InputStream data) { 
        return MethodInvocation.<Document, InputStream>postAsync(this, links, "checkInFromFileSystem", Document.class, data, "multipart/form-data", "application/vnd.docuware.platform.document+xml");
}

    /**
    * Calls the HTTP post Method on the link for the relation "CheckInFromFileSystem" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Document>> postToCheckInFromFileSystemRelationForDocumentAsync(CancellationToken ct, InputStream data) { 
        return MethodInvocation.<Document, InputStream>postAsync(this, links, "checkInFromFileSystem", Document.class, data, "multipart/form-data", "application/vnd.docuware.platform.document+xml", ct);
}

    /**
    * Gets the Uri of the Link for the relation "DownloadAsArchive".
    * Returns the Uri of the Link for the relation "DownloadAsArchive", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getDownloadAsArchiveRelationLink() {
        return MethodInvocation.getLink(this, links, "downloadAsArchive");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "DownloadAsArchive".
    */
    public InputStream postToDownloadAsArchiveRelationForInputStream(ExportSettings data) {
        return MethodInvocation.<InputStream, ExportSettings> post(this, links, "downloadAsArchive", InputStream.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ExportSettings"), ExportSettings.class, null, data), "application/vnd.docuware.platform.exportsettings+xml", "application/xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "DownloadAsArchive" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> postToDownloadAsArchiveRelationForInputStreamAsync(ExportSettings data) {
        return MethodInvocation.<InputStream, ExportSettings >postAsync(this, links, "downloadAsArchive", InputStream.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ExportSettings"), ExportSettings.class, null, data), "application/vnd.docuware.platform.exportsettings+xml", "application/xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "DownloadAsArchive" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> postToDownloadAsArchiveRelationForInputStreamAsync(CancellationToken ct, ExportSettings data) {
        return MethodInvocation.<InputStream, ExportSettings >postAsync(this, links, "downloadAsArchive", InputStream.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ExportSettings"), ExportSettings.class, null, data), "application/vnd.docuware.platform.exportsettings+xml", "application/xml", ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Annotation".
    * Returns the Uri of the Link for the relation "Annotation", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getAnnotationRelationLink() {
        return MethodInvocation.getLink(this, links, "annotation");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Annotation".
    */
    public DocumentAnnotations getDocumentAnnotationsFromAnnotationRelation() {
        return MethodInvocation.<DocumentAnnotations>get(this, links, "annotation", DocumentAnnotations.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Annotation" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentAnnotations>> getDocumentAnnotationsFromAnnotationRelationAsync() {
        return MethodInvocation.<DocumentAnnotations>getAsync(this, links, "annotation", DocumentAnnotations.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Annotation" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentAnnotations>> getDocumentAnnotationsFromAnnotationRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DocumentAnnotations>getAsync(this, links, "annotation", DocumentAnnotations.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Annotation".
    */
    public DocumentAnnotations postToAnnotationRelationForDocumentAnnotations(DocumentAnnotationsPlacement data) {
        return MethodInvocation.<DocumentAnnotations, DocumentAnnotationsPlacement> post(this, links, "annotation", DocumentAnnotations.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentAnnotationsPlacement"), DocumentAnnotationsPlacement.class, null, data), "application/vnd.docuware.platform.documentannotationsplacement+xml", "application/vnd.docuware.platform.documentannotations+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Annotation" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentAnnotations>> postToAnnotationRelationForDocumentAnnotationsAsync(DocumentAnnotationsPlacement data) {
        return MethodInvocation.<DocumentAnnotations, DocumentAnnotationsPlacement >postAsync(this, links, "annotation", DocumentAnnotations.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentAnnotationsPlacement"), DocumentAnnotationsPlacement.class, null, data), "application/vnd.docuware.platform.documentannotationsplacement+xml", "application/vnd.docuware.platform.documentannotations+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Annotation" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentAnnotations>> postToAnnotationRelationForDocumentAnnotationsAsync(CancellationToken ct, DocumentAnnotationsPlacement data) {
        return MethodInvocation.<DocumentAnnotations, DocumentAnnotationsPlacement >postAsync(this, links, "annotation", DocumentAnnotations.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentAnnotationsPlacement"), DocumentAnnotationsPlacement.class, null, data), "application/vnd.docuware.platform.documentannotationsplacement+xml", "application/vnd.docuware.platform.documentannotations+xml", ct);
    }



}
