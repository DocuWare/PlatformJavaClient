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
import com.docuware.dev.schema._public.services.platform.Document;
import com.docuware.dev.schema._public.services.platform.WordSearchResult;
import com.docuware.dev.schema._public.services.platform.SearchPositionQuery;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import com.docuware.dev._public.intellix.DocumentContent;
import com.docuware.dev.schema._public.services.platform.Section;
import java.io.InputStream;
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


/**
 * Define a single section of a document
 * 
 * <p>Java-Klasse f�r Section complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Section">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SignatureStatus" type="{http://dev.docuware.com/schema/public/services/platform}SignatureStatus" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Pages" type="{http://dev.docuware.com/schema/public/services/platform}Pages" minOccurs="0"/>
 *         &lt;element name="Thumbnails" type="{http://dev.docuware.com/schema/public/services/platform}Pages" minOccurs="0"/>
 *         &lt;element name="FileChunk" type="{http://dev.docuware.com/schema/public/services/platform}UploadedFileChunk" minOccurs="0"/>
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ContentType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="HaveMorePages" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="PageCount" type="{http://www.w3.org/2001/XMLSchema}int" default="-1" />
 *       &lt;attribute name="FileSize" type="{http://www.w3.org/2001/XMLSchema}long" default="0" />
 *       &lt;attribute name="OriginalFileName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ContentModified" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="HasTextAnnotation" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
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

    /**
     * Gets the value of the signatureStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signatureStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignatureStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SignatureStatus }
     * 
     * 
     */
    public List<SignatureStatus> getSignatureStatus() {
        if (signatureStatus == null) {
            signatureStatus = new ArrayList<SignatureStatus>();
        }
        return this.signatureStatus;
    }

    /**
     * Ruft den Wert der pages-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Pages }
     *     
     */
    public Pages getPages() {
        return pages;
    }

    /**
     * Legt den Wert der pages-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Pages }
     *     
     */
    public void setPages(Pages value) {
        this.pages = value;
    }

    /**
     * Ruft den Wert der thumbnails-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Pages }
     *     
     */
    public Pages getThumbnails() {
        return thumbnails;
    }

    /**
     * Legt den Wert der thumbnails-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Pages }
     *     
     */
    public void setThumbnails(Pages value) {
        this.thumbnails = value;
    }

    /**
     * Ruft den Wert der fileChunk-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UploadedFileChunk }
     *     
     */
    public UploadedFileChunk getFileChunk() {
        return fileChunk;
    }

    /**
     * Legt den Wert der fileChunk-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UploadedFileChunk }
     *     
     */
    public void setFileChunk(UploadedFileChunk value) {
        this.fileChunk = value;
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
     * Ruft den Wert der contentType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Legt den Wert der contentType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentType(String value) {
        this.contentType = value;
    }

    /**
     * Ruft den Wert der haveMorePages-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isHaveMorePages() {
        if (haveMorePages == null) {
            return false;
        } else {
            return haveMorePages;
        }
    }

    /**
     * Legt den Wert der haveMorePages-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHaveMorePages(Boolean value) {
        this.haveMorePages = value;
    }

    /**
     * Ruft den Wert der pageCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getPageCount() {
        if (pageCount == null) {
            return -1;
        } else {
            return pageCount;
        }
    }

    /**
     * Legt den Wert der pageCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPageCount(Integer value) {
        this.pageCount = value;
    }

    /**
     * Ruft den Wert der fileSize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public long getFileSize() {
        if (fileSize == null) {
            return  0L;
        } else {
            return fileSize;
        }
    }

    /**
     * Legt den Wert der fileSize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFileSize(Long value) {
        this.fileSize = value;
    }

    /**
     * Ruft den Wert der originalFileName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalFileName() {
        return originalFileName;
    }

    /**
     * Legt den Wert der originalFileName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalFileName(String value) {
        this.originalFileName = value;
    }

    /**
     * Ruft den Wert der contentModified-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContentModified() {
        return contentModified;
    }

    /**
     * Legt den Wert der contentModified-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContentModified(XMLGregorianCalendar value) {
        this.contentModified = value;
    }

    /**
     * Ruft den Wert der hasTextAnnotation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isHasTextAnnotation() {
        if (hasTextAnnotation == null) {
            return false;
        } else {
            return hasTextAnnotation;
        }
    }

    /**
     * Legt den Wert der hasTextAnnotation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasTextAnnotation(Boolean value) {
        this.hasTextAnnotation = value;
    }

    public HttpClientProxy getProxy() {
	return this.proxy;
    }

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

    public Section chunkUploadSection(java.io.File file,int chunkSize) {
	return FileCabinetExtensionsBase.chunkUploadSection(this, FileWrapper.toFileInfoWrapper(file), chunkSize);
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

    public URI getDocumentRelationLink() {
        return MethodInvocation.getLink(this, links, "document");
    }

    public Document getDocumentFromDocumentRelation() {
        return MethodInvocation.<Document>get(this, links, "document", Document.class);
    }

    public Future<DeserializedHttpResponseGen<Document>> getDocumentFromDocumentRelationAsync() {
        return MethodInvocation.<Document>getAsync(this, links, "document", Document.class);
    }

    public Future<DeserializedHttpResponseGen<Document>> getDocumentFromDocumentRelationAsync(CancellationToken ct) {
        return MethodInvocation.<Document>getAsync(this, links, "document", Document.class, ct);
    }

    public URI getDeepZoomImageRelationLink() {
        return MethodInvocation.getLink(this, links, "deepZoomImage");
    }

    public URI getURIFromDeepZoomImageRelation() {
        return MethodInvocation.<URI>get(this, links, "deepZoomImage", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromDeepZoomImageRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "deepZoomImage", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromDeepZoomImageRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "deepZoomImage", URI.class, ct);
    }

    public URI getDeepZoomImageWithAnnotationRelationLink() {
        return MethodInvocation.getLink(this, links, "deepZoomImageWithAnnotation");
    }

    public URI getURIFromDeepZoomImageWithAnnotationRelation() {
        return MethodInvocation.<URI>get(this, links, "deepZoomImageWithAnnotation", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromDeepZoomImageWithAnnotationRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "deepZoomImageWithAnnotation", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromDeepZoomImageWithAnnotationRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "deepZoomImageWithAnnotation", URI.class, ct);
    }

    public URI getPositionsRelationLink() {
        return MethodInvocation.getLink(this, links, "positions");
    }

    public WordSearchResult getWordSearchResultFromPositionsRelation() {
        return MethodInvocation.<WordSearchResult>get(this, links, "positions", WordSearchResult.class);
    }

    public Future<DeserializedHttpResponseGen<WordSearchResult>> getWordSearchResultFromPositionsRelationAsync() {
        return MethodInvocation.<WordSearchResult>getAsync(this, links, "positions", WordSearchResult.class);
    }

    public Future<DeserializedHttpResponseGen<WordSearchResult>> getWordSearchResultFromPositionsRelationAsync(CancellationToken ct) {
        return MethodInvocation.<WordSearchResult>getAsync(this, links, "positions", WordSearchResult.class, ct);
    }

    public WordSearchResult postToPositionsRelationForWordSearchResult(SearchPositionQuery data) {
        return MethodInvocation.<WordSearchResult,SearchPositionQuery>post(this, links, "positions", WordSearchResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "SearchPositionQuery"), SearchPositionQuery.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<WordSearchResult>> postToPositionsRelationForWordSearchResultAsync(SearchPositionQuery data) {
        return MethodInvocation.<WordSearchResult, SearchPositionQuery >postAsync(this, links, "positions", WordSearchResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "SearchPositionQuery"), SearchPositionQuery.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<WordSearchResult>> postToPositionsRelationForWordSearchResultAsync(SearchPositionQuery data, CancellationToken ct) {
        return MethodInvocation.<WordSearchResult, SearchPositionQuery >postAsync(this, links, "positions", WordSearchResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "SearchPositionQuery"), SearchPositionQuery.class, null, data), ct);
    }

    public URI getTextshotRelationLink() {
        return MethodInvocation.getLink(this, links, "textshot");
    }

    public DocumentContent getDocumentContentFromTextshotRelation() {
        return MethodInvocation.<DocumentContent>get(this, links, "textshot", DocumentContent.class);
    }

    public Future<DeserializedHttpResponseGen<DocumentContent>> getDocumentContentFromTextshotRelationAsync() {
        return MethodInvocation.<DocumentContent>getAsync(this, links, "textshot", DocumentContent.class);
    }

    public Future<DeserializedHttpResponseGen<DocumentContent>> getDocumentContentFromTextshotRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DocumentContent>getAsync(this, links, "textshot", DocumentContent.class, ct);
    }

    public String putToTextshotRelationForString(DocumentContent data) {
        return MethodInvocation.<String,DocumentContent>put(this, links, "textshot", String.class, new JAXBElement(new QName("http://dev.docuware.com/public/intellix", "Document"), DocumentContent.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<String>> putToTextshotRelationForStringAsync(DocumentContent data) {
        return MethodInvocation.<String, DocumentContent >putAsync(this, links, "textshot", String.class, new JAXBElement(new QName("http://dev.docuware.com/public/intellix", "Document"), DocumentContent.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<String>> putToTextshotRelationForStringAsync(DocumentContent data, CancellationToken ct) {
        return MethodInvocation.<String, DocumentContent >putAsync(this, links, "textshot", String.class, new JAXBElement(new QName("http://dev.docuware.com/public/intellix", "Document"), DocumentContent.class, null, data), ct);
    }

    public URI getContentRelationLink() {
        return MethodInvocation.getLink(this, links, "content");
    }

    public URI getURIFromContentRelation() {
        return MethodInvocation.<URI>get(this, links, "content", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromContentRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "content", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromContentRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "content", URI.class, ct);
    }

    public Section putToContentRelationForSection(InputStream data, String bodyContentType) {
        return MethodInvocation.<Section, InputStream>put(this, links, "content", Section.class, data, bodyContentType);
    }

    public Future<DeserializedHttpResponseGen<Section>> putToContentRelationForSectionAsync(InputStream data, String bodyContentType) { 
        return MethodInvocation.<Section, InputStream>putAsync(this, links, "content", Section.class, data, bodyContentType);
}

    public Future<DeserializedHttpResponseGen<Section>> putToContentRelationForSectionAsync(InputStream data, String bodyContentType, CancellationToken ct) { 
        return MethodInvocation.<Section, InputStream>putAsync(this, links, "content", Section.class, data, bodyContentType, ct);
}

    public Section postToContentRelationForSection(InputStream data, String bodyContentType) {
        return MethodInvocation.<Section, InputStream>post(this, links, "content", Section.class, data, bodyContentType);
    }

    public Future<DeserializedHttpResponseGen<Section>> postToContentRelationForSectionAsync(InputStream data, String bodyContentType) { 
        return MethodInvocation.<Section, InputStream>postAsync(this, links, "content", Section.class, data, bodyContentType);
}

    public Future<DeserializedHttpResponseGen<Section>> postToContentRelationForSectionAsync(InputStream data, String bodyContentType, CancellationToken ct) { 
        return MethodInvocation.<Section, InputStream>postAsync(this, links, "content", Section.class, data, bodyContentType, ct);
}

    public URI getFileDownloadRelationLink() {
        return MethodInvocation.getLink(this, links, "fileDownload");
    }

    public URI getURIFromFileDownloadRelation() {
        return MethodInvocation.<URI>get(this, links, "fileDownload", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromFileDownloadRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "fileDownload", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromFileDownloadRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "fileDownload", URI.class, ct);
    }

    public String postToFileDownloadRelationForString(FileDownload data) {
        return MethodInvocation.<String,FileDownload>post(this, links, "fileDownload", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "FileDownload"), FileDownload.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<String>> postToFileDownloadRelationForStringAsync(FileDownload data) {
        return MethodInvocation.<String, FileDownload >postAsync(this, links, "fileDownload", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "FileDownload"), FileDownload.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<String>> postToFileDownloadRelationForStringAsync(FileDownload data, CancellationToken ct) {
        return MethodInvocation.<String, FileDownload >postAsync(this, links, "fileDownload", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "FileDownload"), FileDownload.class, null, data), ct);
    }

    public URI getSelfRelationLink() {
        return MethodInvocation.getLink(this, links, "self");
    }

    public Section getSectionFromSelfRelation() {
        return MethodInvocation.<Section>get(this, links, "self", Section.class);
    }

    public Future<DeserializedHttpResponseGen<Section>> getSectionFromSelfRelationAsync() {
        return MethodInvocation.<Section>getAsync(this, links, "self", Section.class);
    }

    public Future<DeserializedHttpResponseGen<Section>> getSectionFromSelfRelationAsync(CancellationToken ct) {
        return MethodInvocation.<Section>getAsync(this, links, "self", Section.class, ct);
    }

    public URI getThumbnailRelationLink() {
        return MethodInvocation.getLink(this, links, "thumbnail");
    }

    public URI getURIFromThumbnailRelation() {
        return MethodInvocation.<URI>get(this, links, "thumbnail", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromThumbnailRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "thumbnail", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromThumbnailRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "thumbnail", URI.class, ct);
    }

    public URI getIconRelationLink() {
        return MethodInvocation.getLink(this, links, "icon");
    }

    public URI getURIFromIconRelation() {
        return MethodInvocation.<URI>get(this, links, "icon", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromIconRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "icon", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromIconRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "icon", URI.class, ct);
    }

    public URI getTextAnnotationRelationLink() {
        return MethodInvocation.getLink(this, links, "textAnnotation");
    }

    public URI getURIFromTextAnnotationRelation() {
        return MethodInvocation.<URI>get(this, links, "textAnnotation", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromTextAnnotationRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "textAnnotation", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromTextAnnotationRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "textAnnotation", URI.class, ct);
    }

    public String postToTextAnnotationRelationForString(InputStream data, String bodyContentType) {
        return MethodInvocation.<String, InputStream>post(this, links, "textAnnotation", String.class, data, bodyContentType);
    }

    public Future<DeserializedHttpResponseGen<String>> postToTextAnnotationRelationForStringAsync(InputStream data, String bodyContentType) { 
        return MethodInvocation.<String, InputStream>postAsync(this, links, "textAnnotation", String.class, data, bodyContentType);
}

    public Future<DeserializedHttpResponseGen<String>> postToTextAnnotationRelationForStringAsync(InputStream data, String bodyContentType, CancellationToken ct) { 
        return MethodInvocation.<String, InputStream>postAsync(this, links, "textAnnotation", String.class, data, bodyContentType, ct);
}

    public URI getPagesBlockRelationLink() {
        return MethodInvocation.getLink(this, links, "pagesBlock");
    }

    public Pages postToPagesBlockRelationForPages(PagesBlockQuery data) {
        return MethodInvocation.<Pages,PagesBlockQuery>post(this, links, "pagesBlock", Pages.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "PagesBlockQuery"), PagesBlockQuery.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<Pages>> postToPagesBlockRelationForPagesAsync(PagesBlockQuery data) {
        return MethodInvocation.<Pages, PagesBlockQuery >postAsync(this, links, "pagesBlock", Pages.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "PagesBlockQuery"), PagesBlockQuery.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<Pages>> postToPagesBlockRelationForPagesAsync(PagesBlockQuery data, CancellationToken ct) {
        return MethodInvocation.<Pages, PagesBlockQuery >postAsync(this, links, "pagesBlock", Pages.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "PagesBlockQuery"), PagesBlockQuery.class, null, data), ct);
    }

    public URI getAnnotationAsSvgRelationLink() {
        return MethodInvocation.getLink(this, links, "annotationAsSvg");
    }

    public URI getURIFromAnnotationAsSvgRelation() {
        return MethodInvocation.<URI>get(this, links, "annotationAsSvg", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromAnnotationAsSvgRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "annotationAsSvg", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromAnnotationAsSvgRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "annotationAsSvg", URI.class, ct);
    }



}
