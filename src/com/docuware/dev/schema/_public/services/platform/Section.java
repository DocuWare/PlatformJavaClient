

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;
import com.docuware.dev.schema._public.services.platform.Document;
import java.io.InputStream;
import com.docuware.dev.schema._public.services.platform.WordSearchResult;
import com.docuware.dev.schema._public.services.platform.SearchPositionQuery;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import com.docuware.dev._public.intellix.DocumentContent;
import com.docuware.dev.schema._public.services.platform.Section;
import com.docuware.dev.schema._public.services.platform.FileDownload;
import com.docuware.dev.schema._public.services.platform.Pages;
import com.docuware.dev.schema._public.services.platform.PagesBlockQuery;

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
@XmlType(name = "Section", propOrder = {
"proxy",
    "signatureStatus",
    "pages",
    "thumbnails",
    "fileChunk",
    "links"
})
public class Section  implements IRelationsWithProxy, IChunkable {
private HttpClientProxy proxy;//test


    @XmlElement(name = "SignatureStatus")
    @XmlSchemaType(name = "string")
    protected List<SignatureStatus> signatureStatus;
    @XmlElement(name = "Pages")
    protected Pages pages;
    @XmlElement(name = "Thumbnails")
    protected Pages thumbnails;
    @XmlElement(name = "FileChunk")
    protected UploadedFileChunk fileChunk;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services")
    protected Links links;
    @XmlAttribute(name = "Id")
    protected String id;
    @XmlAttribute(name = "ContentType")
    protected String contentType;
    @XmlAttribute(name = "HaveMorePages")
    protected Boolean haveMorePages;
    @XmlAttribute(name = "PageCount")
    protected Integer pageCount;
    @XmlAttribute(name = "FileSize")
    protected Long fileSize;
    @XmlAttribute(name = "OriginalFileName")
    protected String originalFileName;
    @XmlAttribute(name = "ContentModified", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar contentModified;
    @XmlAttribute(name = "HasTextAnnotation")
    protected Boolean hasTextAnnotation;

    /**Define allowed operations when there is signature*/
    public List<SignatureStatus> getSignatureStatus() {
        if (signatureStatus == null) {
            signatureStatus = new ArrayList<SignatureStatus>();
        }
        return this.signatureStatus;
    }

    /**Contains one or more pages of the document, if there are pages available.*/
    public Pages getPages() {
        return pages;
    }

    /**Contains one or more pages of the document, if there are pages available.*/
    public void setPages(Pages value) {
        this.pages = value;
    }

    /**Contains one or more pages of the document, if there are pages available.*/
    public Pages getThumbnails() {
        return thumbnails;
    }

    /**Contains one or more pages of the document, if there are pages available.*/
    public void setThumbnails(Pages value) {
        this.thumbnails = value;
    }

    /**Contains data for a file chunk during a big file upload. This data is created on the server of every chunk request.*/
    @Eagle
    public UploadedFileChunk getFileChunk() {
        return fileChunk;
    }

    /**Contains data for a file chunk during a big file upload. This data is created on the server of every chunk request.*/
    @Eagle
    public void setFileChunk(UploadedFileChunk value) {
        this.fileChunk = value;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links value) {
        this.links = value;
    }

    /**Identity of the section*/
    public String getId() {
        return id;
    }

    /**Identity of the section*/
    public void setId(String value) {
        this.id = value;
    }

    /**The Internet media type of the section. If there is no section this value is missing.*/
    public String getContentType() {
        return contentType;
    }

    /**The Internet media type of the section. If there is no section this value is missing.*/
    public void setContentType(String value) {
        this.contentType = value;
    }

    /**Contains one or more pages of the document, if there are pages available.*/
    public boolean isHaveMorePages() {
        if (haveMorePages == null) {
            return false;
        } else {
            return haveMorePages;
        }
    }

    /**Contains one or more pages of the document, if there are pages available.*/
    public void setHaveMorePages(Boolean value) {
        this.haveMorePages = value;
    }

    /**The number of pages of this section, if known. If it is unknown, this value is -1.*/
    public int getPageCount() {
        if (pageCount == null) {
            return -1;
        } else {
            return pageCount;
        }
    }

    /**The number of pages of this section, if known. If it is unknown, this value is -1.*/
    public void setPageCount(Integer value) {
        this.pageCount = value;
    }

    /**The size of the file in bytes.*/
    public long getFileSize() {
        if (fileSize == null) {
            return  0L;
        } else {
            return fileSize;
        }
    }

    /**The size of the file in bytes.*/
    public void setFileSize(Long value) {
        this.fileSize = value;
    }

    /**Time when content is last modified*/
    public String getOriginalFileName() {
        return originalFileName;
    }

    /**Time when content is last modified*/
    public void setOriginalFileName(String value) {
        this.originalFileName = value;
    }

    /**Time when content is last modified*/
    @Dolphin
    public XMLGregorianCalendar getContentModified() {
        return contentModified;
    }

    /**Time when content is last modified*/
    @Dolphin
    public void setContentModified(XMLGregorianCalendar value) {
        this.contentModified = value;
    }

    /**Contains true if the section has text annotation.*/
    @Eagle
    public boolean isHasTextAnnotation() {
        if (hasTextAnnotation == null) {
            return false;
        } else {
            return hasTextAnnotation;
        }
    }

    /**Contains true if the section has text annotation.*/
    @Eagle
    public void setHasTextAnnotation(Boolean value) {
        this.hasTextAnnotation = value;
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
    if ((pages != null)) { 
        pages.setProxy(proxy); 
    }
    if ((thumbnails != null)) {
        thumbnails.setProxy(proxy);
    }
    if ((fileChunk != null)) {
		fileChunk.setProxy(proxy);
    }
    }


	/**
	* Replaces the content of a section with the passed file. Upload the specified file in chunks.
	* 
	* @param file	The file
	* @param chunkSize	[optional/ set this parameter to 0 if you want to use default value] The size of the chunk in bytes
	* @return	 The changed section's metadata
	*/
    public Section chunkUploadSection(java.io.File file,int chunkSize) {
	return FileCabinetExtensionsBase.chunkUploadSection(this, FileWrapper.toFileInfoWrapper(file), chunkSize);
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
    * Gets the Uri of the Link for the relation "Document".
    * Returns the Uri of the Link for the relation "Document", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getDocumentRelationLink() {
        return MethodInvocation.getLink(this, links, "document");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Document".
    */
    public Document getDocumentFromDocumentRelation() {
        return MethodInvocation.<Document>get(this, links, "document", Document.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Document" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Document>> getDocumentFromDocumentRelationAsync() {
        return MethodInvocation.<Document>getAsync(this, links, "document", Document.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Document" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Document>> getDocumentFromDocumentRelationAsync(CancellationToken ct) {
        return MethodInvocation.<Document>getAsync(this, links, "document", Document.class, ct);
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
    public Future<DeserializedHttpResponseGen<InputStream>> getInputStreamFromDeepZoomImageRelationAsync() {
        return MethodInvocation.<InputStream>getAsync(this, links, "deepZoomImage", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "DeepZoomImage" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<InputStream>> getInputStreamFromDeepZoomImageRelationAsync(CancellationToken ct) {
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
    public Future<DeserializedHttpResponseGen<InputStream>> getInputStreamFromDeepZoomImageWithAnnotationRelationAsync() {
        return MethodInvocation.<InputStream>getAsync(this, links, "deepZoomImageWithAnnotation", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "DeepZoomImageWithAnnotation" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<InputStream>> getInputStreamFromDeepZoomImageWithAnnotationRelationAsync(CancellationToken ct) {
        return MethodInvocation.<InputStream>getAsync(this, links, "deepZoomImageWithAnnotation", InputStream.class, ct);
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
    public WordSearchResult getWordSearchResultFromPositionsRelation() {
        return MethodInvocation.<WordSearchResult>get(this, links, "positions", WordSearchResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Positions" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<WordSearchResult>> getWordSearchResultFromPositionsRelationAsync() {
        return MethodInvocation.<WordSearchResult>getAsync(this, links, "positions", WordSearchResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Positions" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<WordSearchResult>> getWordSearchResultFromPositionsRelationAsync(CancellationToken ct) {
        return MethodInvocation.<WordSearchResult>getAsync(this, links, "positions", WordSearchResult.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Positions".
    */
    public WordSearchResult postToPositionsRelationForWordSearchResult(SearchPositionQuery data) {
        return MethodInvocation.<WordSearchResult,SearchPositionQuery>post(this, links, "positions", WordSearchResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "SearchPositionQuery"), SearchPositionQuery.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Positions" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<WordSearchResult>> postToPositionsRelationForWordSearchResultAsync(SearchPositionQuery data) {
        return MethodInvocation.<WordSearchResult, SearchPositionQuery >postAsync(this, links, "positions", WordSearchResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "SearchPositionQuery"), SearchPositionQuery.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Positions" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<WordSearchResult>> postToPositionsRelationForWordSearchResultAsync(SearchPositionQuery data, CancellationToken ct) {
        return MethodInvocation.<WordSearchResult, SearchPositionQuery >postAsync(this, links, "positions", WordSearchResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "SearchPositionQuery"), SearchPositionQuery.class, null, data), ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Textshot".
    * Returns the Uri of the Link for the relation "Textshot", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getTextshotRelationLink() {
        return MethodInvocation.getLink(this, links, "textshot");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Textshot".
    */
    public DocumentContent getDocumentContentFromTextshotRelation() {
        return MethodInvocation.<DocumentContent>get(this, links, "textshot", DocumentContent.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Textshot" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentContent>> getDocumentContentFromTextshotRelationAsync() {
        return MethodInvocation.<DocumentContent>getAsync(this, links, "textshot", DocumentContent.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Textshot" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentContent>> getDocumentContentFromTextshotRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DocumentContent>getAsync(this, links, "textshot", DocumentContent.class, ct);
    }

    /**
    * Calls the HTTP put Method on the link for the relation "Textshot".
    */
    public String putToTextshotRelationForString(DocumentContent data) {
        return MethodInvocation.<String,DocumentContent>put(this, links, "textshot", String.class, new JAXBElement(new QName("http://dev.docuware.com/public/intellix", "Document"), DocumentContent.class, null, data));
    }

    /**
    * Calls the HTTP put Method on the link for the relation "Textshot" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> putToTextshotRelationForStringAsync(DocumentContent data) {
        return MethodInvocation.<String, DocumentContent >putAsync(this, links, "textshot", String.class, new JAXBElement(new QName("http://dev.docuware.com/public/intellix", "Document"), DocumentContent.class, null, data));
    }

    /**
    * Calls the HTTP put Method on the link for the relation "Textshot" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> putToTextshotRelationForStringAsync(DocumentContent data, CancellationToken ct) {
        return MethodInvocation.<String, DocumentContent >putAsync(this, links, "textshot", String.class, new JAXBElement(new QName("http://dev.docuware.com/public/intellix", "Document"), DocumentContent.class, null, data), ct);
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
    public Future<DeserializedHttpResponseGen<InputStream>> getInputStreamFromContentRelationAsync() {
        return MethodInvocation.<InputStream>getAsync(this, links, "content", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Content" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<InputStream>> getInputStreamFromContentRelationAsync(CancellationToken ct) {
        return MethodInvocation.<InputStream>getAsync(this, links, "content", InputStream.class, ct);
    }

    /**
    * Calls the HTTP put Method on the link for the relation "Content".
    */
    public Section putToContentRelationForSection(InputStream data, String bodyContentType) {
        return MethodInvocation.<Section, InputStream>put(this, links, "content", Section.class, data, bodyContentType);
    }

    /**
    * Calls the HTTP put Method on the link for the relation "Content" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Section>> putToContentRelationForSectionAsync(InputStream data, String bodyContentType) { 
        return MethodInvocation.<Section, InputStream>putAsync(this, links, "content", Section.class, data, bodyContentType);
}

    /**
    * Calls the HTTP put Method on the link for the relation "Content" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Section>> putToContentRelationForSectionAsync(InputStream data, String bodyContentType, CancellationToken ct) { 
        return MethodInvocation.<Section, InputStream>putAsync(this, links, "content", Section.class, data, bodyContentType, ct);
}

    /**
    * Calls the HTTP post Method on the link for the relation "Content".
    */
    public Section postToContentRelationForSection(InputStream data, String bodyContentType) {
        return MethodInvocation.<Section, InputStream>post(this, links, "content", Section.class, data, bodyContentType);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Content" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Section>> postToContentRelationForSectionAsync(InputStream data, String bodyContentType) { 
        return MethodInvocation.<Section, InputStream>postAsync(this, links, "content", Section.class, data, bodyContentType);
}

    /**
    * Calls the HTTP post Method on the link for the relation "Content" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Section>> postToContentRelationForSectionAsync(InputStream data, String bodyContentType, CancellationToken ct) { 
        return MethodInvocation.<Section, InputStream>postAsync(this, links, "content", Section.class, data, bodyContentType, ct);
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
    public Future<DeserializedHttpResponseGen<InputStream>> getInputStreamFromFileDownloadRelationAsync() {
        return MethodInvocation.<InputStream>getAsync(this, links, "fileDownload", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "FileDownload" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<InputStream>> getInputStreamFromFileDownloadRelationAsync(CancellationToken ct) {
        return MethodInvocation.<InputStream>getAsync(this, links, "fileDownload", InputStream.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "FileDownload".
    */
    public String postToFileDownloadRelationForString(FileDownload data) {
        return MethodInvocation.<String,FileDownload>post(this, links, "fileDownload", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "FileDownload"), FileDownload.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "FileDownload" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> postToFileDownloadRelationForStringAsync(FileDownload data) {
        return MethodInvocation.<String, FileDownload >postAsync(this, links, "fileDownload", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "FileDownload"), FileDownload.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "FileDownload" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> postToFileDownloadRelationForStringAsync(FileDownload data, CancellationToken ct) {
        return MethodInvocation.<String, FileDownload >postAsync(this, links, "fileDownload", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "FileDownload"), FileDownload.class, null, data), ct);
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
    public Section getSectionFromSelfRelation() {
        return MethodInvocation.<Section>get(this, links, "self", Section.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Self" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Section>> getSectionFromSelfRelationAsync() {
        return MethodInvocation.<Section>getAsync(this, links, "self", Section.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Self" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Section>> getSectionFromSelfRelationAsync(CancellationToken ct) {
        return MethodInvocation.<Section>getAsync(this, links, "self", Section.class, ct);
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
    public Future<DeserializedHttpResponseGen<InputStream>> getInputStreamFromThumbnailRelationAsync() {
        return MethodInvocation.<InputStream>getAsync(this, links, "thumbnail", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Thumbnail" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<InputStream>> getInputStreamFromThumbnailRelationAsync(CancellationToken ct) {
        return MethodInvocation.<InputStream>getAsync(this, links, "thumbnail", InputStream.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Icon".
    * Returns the Uri of the Link for the relation "Icon", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getIconRelationLink() {
        return MethodInvocation.getLink(this, links, "icon");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Icon".
    */
    public InputStream getInputStreamFromIconRelation() {
        return MethodInvocation.<InputStream>get(this, links, "icon", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Icon" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<InputStream>> getInputStreamFromIconRelationAsync() {
        return MethodInvocation.<InputStream>getAsync(this, links, "icon", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Icon" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<InputStream>> getInputStreamFromIconRelationAsync(CancellationToken ct) {
        return MethodInvocation.<InputStream>getAsync(this, links, "icon", InputStream.class, ct);
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
    public Future<DeserializedHttpResponseGen<InputStream>> getInputStreamFromTextAnnotationRelationAsync() {
        return MethodInvocation.<InputStream>getAsync(this, links, "textAnnotation", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "TextAnnotation" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<InputStream>> getInputStreamFromTextAnnotationRelationAsync(CancellationToken ct) {
        return MethodInvocation.<InputStream>getAsync(this, links, "textAnnotation", InputStream.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "TextAnnotation".
    */
    public String postToTextAnnotationRelationForString(InputStream data, String bodyContentType) {
        return MethodInvocation.<String, InputStream>post(this, links, "textAnnotation", String.class, data, bodyContentType);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "TextAnnotation" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> postToTextAnnotationRelationForStringAsync(InputStream data, String bodyContentType) { 
        return MethodInvocation.<String, InputStream>postAsync(this, links, "textAnnotation", String.class, data, bodyContentType);
}

    /**
    * Calls the HTTP post Method on the link for the relation "TextAnnotation" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> postToTextAnnotationRelationForStringAsync(InputStream data, String bodyContentType, CancellationToken ct) { 
        return MethodInvocation.<String, InputStream>postAsync(this, links, "textAnnotation", String.class, data, bodyContentType, ct);
}

    /**
    * Gets the Uri of the Link for the relation "PagesBlock".
    * Returns the Uri of the Link for the relation "PagesBlock", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getPagesBlockRelationLink() {
        return MethodInvocation.getLink(this, links, "pagesBlock");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "PagesBlock".
    */
    public Pages postToPagesBlockRelationForPages(PagesBlockQuery data) {
        return MethodInvocation.<Pages,PagesBlockQuery>post(this, links, "pagesBlock", Pages.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "PagesBlockQuery"), PagesBlockQuery.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "PagesBlock" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Pages>> postToPagesBlockRelationForPagesAsync(PagesBlockQuery data) {
        return MethodInvocation.<Pages, PagesBlockQuery >postAsync(this, links, "pagesBlock", Pages.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "PagesBlockQuery"), PagesBlockQuery.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "PagesBlock" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Pages>> postToPagesBlockRelationForPagesAsync(PagesBlockQuery data, CancellationToken ct) {
        return MethodInvocation.<Pages, PagesBlockQuery >postAsync(this, links, "pagesBlock", Pages.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "PagesBlockQuery"), PagesBlockQuery.class, null, data), ct);
    }

    /**
    * Gets the Uri of the Link for the relation "AnnotationAsSvg".
    * Returns the Uri of the Link for the relation "AnnotationAsSvg", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getAnnotationAsSvgRelationLink() {
        return MethodInvocation.getLink(this, links, "annotationAsSvg");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "AnnotationAsSvg".
    */
    public InputStream getInputStreamFromAnnotationAsSvgRelation() {
        return MethodInvocation.<InputStream>get(this, links, "annotationAsSvg", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "AnnotationAsSvg" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<InputStream>> getInputStreamFromAnnotationAsSvgRelationAsync() {
        return MethodInvocation.<InputStream>getAsync(this, links, "annotationAsSvg", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "AnnotationAsSvg" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<InputStream>> getInputStreamFromAnnotationAsSvgRelationAsync(CancellationToken ct) {
        return MethodInvocation.<InputStream>getAsync(this, links, "annotationAsSvg", InputStream.class, ct);
    }



}
