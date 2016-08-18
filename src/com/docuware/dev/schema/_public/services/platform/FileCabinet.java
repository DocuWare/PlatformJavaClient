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
import com.docuware.dev.schema._public.services.platform.Document;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import com.docuware.dev.schema._public.services.platform.DocumentsQueryTableResult;
import com.docuware.dev.schema._public.services.platform.ContentMergeOperationInfo;
import java.io.InputStream;
import com.docuware.dev.schema._public.services.platform.ImportResult;
import com.docuware.dev.schema._public.services.platform.ImportSettings;
import com.docuware.dev.schema._public.services.platform.SynchronizationSettings;
import com.docuware.dev.schema._public.services.platform.DialogInfos;
import com.docuware.dev.schema._public.services.platform.Dialog;
import com.docuware.dev.schema._public.services.platform.FileCabinet;
import com.docuware.dev.schema._public.services.platform.Stamps;
import com.docuware.dev.schema._public.services.platform.Notifications;
import com.docuware.dev.schema._public.services.platform.FileCabinetTransferInfo;
import com.docuware.dev.schema._public.services.platform.DocumentsTransferInfo;
import com.docuware.dev.schema._public.services.platform.DialogInfo;
import com.docuware.dev.schema._public.services.platform.BatchUpdateIndexFieldsResult;
import com.docuware.dev.schema._public.services.platform.BatchUpdateProcess;
import com.docuware.dev.schema._public.services.platform.FieldValueStatisticsResult;
import com.docuware.dev.schema._public.services.platform.FieldValueStatisticsExpression;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.schema._public.services.Links;


/**
 * Models a DocuWare file cabinet or a web basket(document tray).
 * 
 * <p>Java-Klasse f�r FileCabinet complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="FileCabinet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links"/>
 *         &lt;element name="Fields" type="{http://dev.docuware.com/schema/public/services/platform}FileCabinetFields" minOccurs="0"/>
 *         &lt;element name="Rights" type="{http://dev.docuware.com/schema/public/services/platform}Rights" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Color" use="required" type="{http://dev.docuware.com/settings/common}Color" />
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IsBasket" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Usable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="Default" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="AssignedCabinetId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IntellixDialogId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="VersionManagement" type="{http://dev.docuware.com/schema/public/services/platform}VersionManagementMode" default="Disable" />
 *       &lt;attribute name="VersionHistoryResultListId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="WindowsExplorerClientAccess" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="AddIndexEntriesInUpperCase" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileCabinet", propOrder = {
"proxy",
    "links",
    "fields",
    "rights"
})
public class FileCabinet  implements IRelationsWithProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;
    @XmlElement(name = "Fields")
    protected FileCabinetFields fields;
    @XmlElement(name = "Rights")
    protected Rights rights;
    @XmlAttribute(name = "Color", required = true)
    protected String color;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "Id", required = true)
    protected String id;
    @XmlAttribute(name = "IsBasket", required = true)
    protected boolean isBasket;
    @XmlAttribute(name = "Usable")
    protected Boolean usable;
    @XmlAttribute(name = "Default", required = true)
    protected boolean _default;
    @XmlAttribute(name = "AssignedCabinetId")
    protected String assignedCabinetId;
    @XmlAttribute(name = "IntellixDialogId")
    protected String intellixDialogId;
    @XmlAttribute(name = "VersionManagement")
    protected VersionManagementMode versionManagement;
    @XmlAttribute(name = "VersionHistoryResultListId")
    protected String versionHistoryResultListId;
    @XmlAttribute(name = "WindowsExplorerClientAccess")
    protected Boolean windowsExplorerClientAccess;
    @XmlAttribute(name = "AddIndexEntriesInUpperCase")
    protected Boolean addIndexEntriesInUpperCase;

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
     * Ruft den Wert der fields-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link FileCabinetFields }
     *     
     */
    public FileCabinetFields getFields() {
        return fields;
    }

    /**
     * Legt den Wert der fields-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link FileCabinetFields }
     *     
     */
    public void setFields(FileCabinetFields value) {
        this.fields = value;
    }

    /**
     * Ruft den Wert der rights-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Rights }
     *     
     */
    public Rights getRights() {
        return rights;
    }

    /**
     * Legt den Wert der rights-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Rights }
     *     
     */
    public void setRights(Rights value) {
        this.rights = value;
    }

    /**
     * Ruft den Wert der color-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Legt den Wert der color-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
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
     * Ruft den Wert der isBasket-Eigenschaft ab.
     * 
     */
    public boolean isIsBasket() {
        return isBasket;
    }

    /**
     * Legt den Wert der isBasket-Eigenschaft fest.
     * 
     */
    public void setIsBasket(boolean value) {
        this.isBasket = value;
    }

    /**
     * Ruft den Wert der usable-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isUsable() {
        if (usable == null) {
            return true;
        } else {
            return usable;
        }
    }

    /**
     * Legt den Wert der usable-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsable(Boolean value) {
        this.usable = value;
    }

    /**
     * Ruft den Wert der default-Eigenschaft ab.
     * 
     */
    public boolean isDefault() {
        return _default;
    }

    /**
     * Legt den Wert der default-Eigenschaft fest.
     * 
     */
    public void setDefault(boolean value) {
        this._default = value;
    }

    /**
     * Ruft den Wert der assignedCabinetId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignedCabinetId() {
        return assignedCabinetId;
    }

    /**
     * Legt den Wert der assignedCabinetId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignedCabinetId(String value) {
        this.assignedCabinetId = value;
    }

    /**
     * Ruft den Wert der intellixDialogId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntellixDialogId() {
        return intellixDialogId;
    }

    /**
     * Legt den Wert der intellixDialogId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntellixDialogId(String value) {
        this.intellixDialogId = value;
    }

    /**
     * Ruft den Wert der versionManagement-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VersionManagementMode }
     *     
     */
    public VersionManagementMode getVersionManagement() {
        if (versionManagement == null) {
            return VersionManagementMode.DISABLE;
        } else {
            return versionManagement;
        }
    }

    /**
     * Legt den Wert der versionManagement-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionManagementMode }
     *     
     */
    public void setVersionManagement(VersionManagementMode value) {
        this.versionManagement = value;
    }

    /**
     * Ruft den Wert der versionHistoryResultListId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionHistoryResultListId() {
        return versionHistoryResultListId;
    }

    /**
     * Legt den Wert der versionHistoryResultListId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionHistoryResultListId(String value) {
        this.versionHistoryResultListId = value;
    }

    /**
     * Ruft den Wert der windowsExplorerClientAccess-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isWindowsExplorerClientAccess() {
        if (windowsExplorerClientAccess == null) {
            return false;
        } else {
            return windowsExplorerClientAccess;
        }
    }

    /**
     * Legt den Wert der windowsExplorerClientAccess-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWindowsExplorerClientAccess(Boolean value) {
        this.windowsExplorerClientAccess = value;
    }

    /**
     * Ruft den Wert der addIndexEntriesInUpperCase-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isAddIndexEntriesInUpperCase() {
        if (addIndexEntriesInUpperCase == null) {
            return false;
        } else {
            return addIndexEntriesInUpperCase;
        }
    }

    /**
     * Legt den Wert der addIndexEntriesInUpperCase-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddIndexEntriesInUpperCase(Boolean value) {
        this.addIndexEntriesInUpperCase = value;
    }

    public HttpClientProxy getProxy() {
	return this.proxy;
    }

    public void setProxy(HttpClientProxy proxy) {
	this.proxy = proxy;
    }

    public ImportResult chunkImportArchive(java.io.File file,ImportSettings importSettings) {
	return FileCabinetExtensionsBase.chunkImportArchive(this,importSettings, new DwxArchiveFileUploadInfo(file) ,0);
    }

    public ImportResult chunkSynchronize(java.io.File file,SynchronizationSettings synchronizationSettings) {
	return FileCabinetExtensionsBase.chunkSynchronize(this,synchronizationSettings, new DwxArchiveFileUploadInfo(file) ,0);
    }

    public Document chunkUploadDocument(java.io.File file,int chunkSize) {
	return FileCabinetExtensionsBase.chunkUploadDocument(this, FileWrapper.toFileInfoWrapper(file), chunkSize);
    }

    public Document chunkUploadDocument(java.io.File[] files,int chunkSize) {
	return FileCabinetExtensionsBase.chunkUploadDocument(this, FileWrapper.toFileInfoWrapper(files), chunkSize);
    }

    public Document chunkUploadDocument(Document document,java.io.File file,int chunkSize) {
	return FileCabinetExtensionsBase.chunkUploadDocument(this, document, FileWrapper.toFileInfoWrapper(file), chunkSize);
    }

    public Document chunkUploadDocument(Document document,java.io.File[] files,int chunkSize) {
	return FileCabinetExtensionsBase.chunkUploadDocument(this, document, FileWrapper.toFileInfoWrapper(files), chunkSize);
    }

    public Document uploadDocument(Document document,java.io.File... file) {
	return FileCabinetExtensionsBase.uploadDocument(this, document, FileWrapper.toFileInfoWrapper(file));
    }

    public Future<DeserializedHttpResponseGen<Document>> uploadDocumentAsync(Document document,java.io.File... file) {
	return FileCabinetExtensionsBase.uploadDocumentAsync(this, document, FileWrapper.toFileInfoWrapper(file));
    }

    public Future<DeserializedHttpResponseGen<Document>> uploadDocumentAsync(java.io.File... file) {
	return FileCabinetExtensionsBase.uploadDocumentAsync(this, FileWrapper.toFileInfoWrapper(file));
    }

    public Document uploadDocument(java.io.File... file) {
	return FileCabinetExtensionsBase.uploadDocument(this, FileWrapper.toFileInfoWrapper(file));
    }

    public ImportResult importArchive(java.io.File file) {
	return FileCabinetExtensionsBase.importArchive(this, null, new DwxArchiveFileUploadInfo(file));
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

    public URI getDocumentsRelationLink() {
        return MethodInvocation.getLink(this, links, "documents");
    }

    public DocumentsQueryResult getDocumentsQueryResultFromDocumentsRelation() {
        return MethodInvocation.<DocumentsQueryResult>get(this, links, "documents", DocumentsQueryResult.class);
    }

    public Future<DeserializedHttpResponseGen<DocumentsQueryResult>> getDocumentsQueryResultFromDocumentsRelationAsync() {
        return MethodInvocation.<DocumentsQueryResult>getAsync(this, links, "documents", DocumentsQueryResult.class);
    }

    public Future<DeserializedHttpResponseGen<DocumentsQueryResult>> getDocumentsQueryResultFromDocumentsRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DocumentsQueryResult>getAsync(this, links, "documents", DocumentsQueryResult.class, ct);
    }

    public Document postToDocumentsRelationForDocument(Document data) {
        return MethodInvocation.<Document,Document>post(this, links, "documents", Document.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "Document"), Document.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<Document>> postToDocumentsRelationForDocumentAsync(Document data) {
        return MethodInvocation.<Document, Document >postAsync(this, links, "documents", Document.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "Document"), Document.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<Document>> postToDocumentsRelationForDocumentAsync(Document data, CancellationToken ct) {
        return MethodInvocation.<Document, Document >postAsync(this, links, "documents", Document.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "Document"), Document.class, null, data), ct);
    }

    public URI getDocumentsTableRelationLink() {
        return MethodInvocation.getLink(this, links, "documentsTable");
    }

    public DocumentsQueryTableResult getDocumentsQueryTableResultFromDocumentsTableRelation() {
        return MethodInvocation.<DocumentsQueryTableResult>get(this, links, "documentsTable", DocumentsQueryTableResult.class);
    }

    public Future<DeserializedHttpResponseGen<DocumentsQueryTableResult>> getDocumentsQueryTableResultFromDocumentsTableRelationAsync() {
        return MethodInvocation.<DocumentsQueryTableResult>getAsync(this, links, "documentsTable", DocumentsQueryTableResult.class);
    }

    public Future<DeserializedHttpResponseGen<DocumentsQueryTableResult>> getDocumentsQueryTableResultFromDocumentsTableRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DocumentsQueryTableResult>getAsync(this, links, "documentsTable", DocumentsQueryTableResult.class, ct);
    }

    public URI getContentMergeOperationRelationLink() {
        return MethodInvocation.getLink(this, links, "contentMergeOperation");
    }

    public Document putToContentMergeOperationRelationForDocument(ContentMergeOperationInfo data) {
        return MethodInvocation.<Document,ContentMergeOperationInfo>put(this, links, "contentMergeOperation", Document.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ContentMergeOperationInfo"), ContentMergeOperationInfo.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<Document>> putToContentMergeOperationRelationForDocumentAsync(ContentMergeOperationInfo data) {
        return MethodInvocation.<Document, ContentMergeOperationInfo >putAsync(this, links, "contentMergeOperation", Document.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ContentMergeOperationInfo"), ContentMergeOperationInfo.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<Document>> putToContentMergeOperationRelationForDocumentAsync(ContentMergeOperationInfo data, CancellationToken ct) {
        return MethodInvocation.<Document, ContentMergeOperationInfo >putAsync(this, links, "contentMergeOperation", Document.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ContentMergeOperationInfo"), ContentMergeOperationInfo.class, null, data), ct);
    }

    public URI getAdvancedDocumentUploadRelationLink() {
        return MethodInvocation.getLink(this, links, "advancedDocumentUpload");
    }

    public Document postToAdvancedDocumentUploadRelationForDocument(InputStream data, String bodyContentType) {
        return MethodInvocation.<Document, InputStream>post(this, links, "advancedDocumentUpload", Document.class, data, bodyContentType);
    }

    public Future<DeserializedHttpResponseGen<Document>> postToAdvancedDocumentUploadRelationForDocumentAsync(InputStream data, String bodyContentType) { 
        return MethodInvocation.<Document, InputStream>postAsync(this, links, "advancedDocumentUpload", Document.class, data, bodyContentType);
}

    public Future<DeserializedHttpResponseGen<Document>> postToAdvancedDocumentUploadRelationForDocumentAsync(InputStream data, String bodyContentType, CancellationToken ct) { 
        return MethodInvocation.<Document, InputStream>postAsync(this, links, "advancedDocumentUpload", Document.class, data, bodyContentType, ct);
}

    public URI getImportDocumentsRelationLink() {
        return MethodInvocation.getLink(this, links, "importDocuments");
    }

    public ImportResult postToImportDocumentsRelationForImportResult(ImportSettings data) {
        return MethodInvocation.<ImportResult,ImportSettings>post(this, links, "importDocuments", ImportResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ImportSettings"), ImportSettings.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<ImportResult>> postToImportDocumentsRelationForImportResultAsync(ImportSettings data) {
        return MethodInvocation.<ImportResult, ImportSettings >postAsync(this, links, "importDocuments", ImportResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ImportSettings"), ImportSettings.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<ImportResult>> postToImportDocumentsRelationForImportResultAsync(ImportSettings data, CancellationToken ct) {
        return MethodInvocation.<ImportResult, ImportSettings >postAsync(this, links, "importDocuments", ImportResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ImportSettings"), ImportSettings.class, null, data), ct);
    }

    public ImportResult postToImportDocumentsRelationForImportResult(SynchronizationSettings data) {
        return MethodInvocation.<ImportResult,SynchronizationSettings>post(this, links, "importDocuments", ImportResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "SynchronizationSettings"), SynchronizationSettings.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<ImportResult>> postToImportDocumentsRelationForImportResultAsync(SynchronizationSettings data) {
        return MethodInvocation.<ImportResult, SynchronizationSettings >postAsync(this, links, "importDocuments", ImportResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "SynchronizationSettings"), SynchronizationSettings.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<ImportResult>> postToImportDocumentsRelationForImportResultAsync(SynchronizationSettings data, CancellationToken ct) {
        return MethodInvocation.<ImportResult, SynchronizationSettings >postAsync(this, links, "importDocuments", ImportResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "SynchronizationSettings"), SynchronizationSettings.class, null, data), ct);
    }

    public URI getUnprocessedDocumentUploadRelationLink() {
        return MethodInvocation.getLink(this, links, "unprocessedDocumentUpload");
    }

    public Document postToUnprocessedDocumentUploadRelationForDocument(InputStream data, String bodyContentType) {
        return MethodInvocation.<Document, InputStream>post(this, links, "unprocessedDocumentUpload", Document.class, data, bodyContentType);
    }

    public Future<DeserializedHttpResponseGen<Document>> postToUnprocessedDocumentUploadRelationForDocumentAsync(InputStream data, String bodyContentType) { 
        return MethodInvocation.<Document, InputStream>postAsync(this, links, "unprocessedDocumentUpload", Document.class, data, bodyContentType);
}

    public Future<DeserializedHttpResponseGen<Document>> postToUnprocessedDocumentUploadRelationForDocumentAsync(InputStream data, String bodyContentType, CancellationToken ct) { 
        return MethodInvocation.<Document, InputStream>postAsync(this, links, "unprocessedDocumentUpload", Document.class, data, bodyContentType, ct);
}

    public URI getQueryRelationLink() {
        return MethodInvocation.getLink(this, links, "query");
    }

    public DocumentsQueryResult getDocumentsQueryResultFromQueryRelation() {
        return MethodInvocation.<DocumentsQueryResult>get(this, links, "query", DocumentsQueryResult.class);
    }

    public Future<DeserializedHttpResponseGen<DocumentsQueryResult>> getDocumentsQueryResultFromQueryRelationAsync() {
        return MethodInvocation.<DocumentsQueryResult>getAsync(this, links, "query", DocumentsQueryResult.class);
    }

    public Future<DeserializedHttpResponseGen<DocumentsQueryResult>> getDocumentsQueryResultFromQueryRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DocumentsQueryResult>getAsync(this, links, "query", DocumentsQueryResult.class, ct);
    }

    public URI getDialogsRelationLink() {
        return MethodInvocation.getLink(this, links, "dialogs");
    }

    public DialogInfos getDialogInfosFromDialogsRelation() {
        return MethodInvocation.<DialogInfos>get(this, links, "dialogs", DialogInfos.class);
    }

    public Future<DeserializedHttpResponseGen<DialogInfos>> getDialogInfosFromDialogsRelationAsync() {
        return MethodInvocation.<DialogInfos>getAsync(this, links, "dialogs", DialogInfos.class);
    }

    public Future<DeserializedHttpResponseGen<DialogInfos>> getDialogInfosFromDialogsRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DialogInfos>getAsync(this, links, "dialogs", DialogInfos.class, ct);
    }

    public URI getSearchesRelationLink() {
        return MethodInvocation.getLink(this, links, "searches");
    }

    public DialogInfos getDialogInfosFromSearchesRelation() {
        return MethodInvocation.<DialogInfos>get(this, links, "searches", DialogInfos.class);
    }

    public Future<DeserializedHttpResponseGen<DialogInfos>> getDialogInfosFromSearchesRelationAsync() {
        return MethodInvocation.<DialogInfos>getAsync(this, links, "searches", DialogInfos.class);
    }

    public Future<DeserializedHttpResponseGen<DialogInfos>> getDialogInfosFromSearchesRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DialogInfos>getAsync(this, links, "searches", DialogInfos.class, ct);
    }

    public URI getCustomSearchRelationLink() {
        return MethodInvocation.getLink(this, links, "customSearch");
    }

    public Dialog getDialogFromCustomSearchRelation() {
        return MethodInvocation.<Dialog>get(this, links, "customSearch", Dialog.class);
    }

    public Future<DeserializedHttpResponseGen<Dialog>> getDialogFromCustomSearchRelationAsync() {
        return MethodInvocation.<Dialog>getAsync(this, links, "customSearch", Dialog.class);
    }

    public Future<DeserializedHttpResponseGen<Dialog>> getDialogFromCustomSearchRelationAsync(CancellationToken ct) {
        return MethodInvocation.<Dialog>getAsync(this, links, "customSearch", Dialog.class, ct);
    }

    public URI getResultTreesRelationLink() {
        return MethodInvocation.getLink(this, links, "resultTrees");
    }

    public DialogInfos getDialogInfosFromResultTreesRelation() {
        return MethodInvocation.<DialogInfos>get(this, links, "resultTrees", DialogInfos.class);
    }

    public Future<DeserializedHttpResponseGen<DialogInfos>> getDialogInfosFromResultTreesRelationAsync() {
        return MethodInvocation.<DialogInfos>getAsync(this, links, "resultTrees", DialogInfos.class);
    }

    public Future<DeserializedHttpResponseGen<DialogInfos>> getDialogInfosFromResultTreesRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DialogInfos>getAsync(this, links, "resultTrees", DialogInfos.class, ct);
    }

    public URI getStoresRelationLink() {
        return MethodInvocation.getLink(this, links, "stores");
    }

    public DialogInfos getDialogInfosFromStoresRelation() {
        return MethodInvocation.<DialogInfos>get(this, links, "stores", DialogInfos.class);
    }

    public Future<DeserializedHttpResponseGen<DialogInfos>> getDialogInfosFromStoresRelationAsync() {
        return MethodInvocation.<DialogInfos>getAsync(this, links, "stores", DialogInfos.class);
    }

    public Future<DeserializedHttpResponseGen<DialogInfos>> getDialogInfosFromStoresRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DialogInfos>getAsync(this, links, "stores", DialogInfos.class, ct);
    }

    public URI getTaskListsRelationLink() {
        return MethodInvocation.getLink(this, links, "taskLists");
    }

    public DialogInfos getDialogInfosFromTaskListsRelation() {
        return MethodInvocation.<DialogInfos>get(this, links, "taskLists", DialogInfos.class);
    }

    public Future<DeserializedHttpResponseGen<DialogInfos>> getDialogInfosFromTaskListsRelationAsync() {
        return MethodInvocation.<DialogInfos>getAsync(this, links, "taskLists", DialogInfos.class);
    }

    public Future<DeserializedHttpResponseGen<DialogInfos>> getDialogInfosFromTaskListsRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DialogInfos>getAsync(this, links, "taskLists", DialogInfos.class, ct);
    }

    public URI getSelfRelationLink() {
        return MethodInvocation.getLink(this, links, "self");
    }

    public FileCabinet getFileCabinetFromSelfRelation() {
        return MethodInvocation.<FileCabinet>get(this, links, "self", FileCabinet.class);
    }

    public Future<DeserializedHttpResponseGen<FileCabinet>> getFileCabinetFromSelfRelationAsync() {
        return MethodInvocation.<FileCabinet>getAsync(this, links, "self", FileCabinet.class);
    }

    public Future<DeserializedHttpResponseGen<FileCabinet>> getFileCabinetFromSelfRelationAsync(CancellationToken ct) {
        return MethodInvocation.<FileCabinet>getAsync(this, links, "self", FileCabinet.class, ct);
    }

    public URI getStampsRelationLink() {
        return MethodInvocation.getLink(this, links, "stamps");
    }

    public Stamps getStampsFromStampsRelation() {
        return MethodInvocation.<Stamps>get(this, links, "stamps", Stamps.class);
    }

    public Future<DeserializedHttpResponseGen<Stamps>> getStampsFromStampsRelationAsync() {
        return MethodInvocation.<Stamps>getAsync(this, links, "stamps", Stamps.class);
    }

    public Future<DeserializedHttpResponseGen<Stamps>> getStampsFromStampsRelationAsync(CancellationToken ct) {
        return MethodInvocation.<Stamps>getAsync(this, links, "stamps", Stamps.class, ct);
    }

    public URI getNotificationsRelationLink() {
        return MethodInvocation.getLink(this, links, "notifications");
    }

    public Notifications getNotificationsFromNotificationsRelation() {
        return MethodInvocation.<Notifications>get(this, links, "notifications", Notifications.class);
    }

    public Future<DeserializedHttpResponseGen<Notifications>> getNotificationsFromNotificationsRelationAsync() {
        return MethodInvocation.<Notifications>getAsync(this, links, "notifications", Notifications.class);
    }

    public Future<DeserializedHttpResponseGen<Notifications>> getNotificationsFromNotificationsRelationAsync(CancellationToken ct) {
        return MethodInvocation.<Notifications>getAsync(this, links, "notifications", Notifications.class, ct);
    }

    public Notifications postToNotificationsRelationForNotifications(Notifications data) {
        return MethodInvocation.<Notifications,Notifications>post(this, links, "notifications", Notifications.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "Notifications"), Notifications.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<Notifications>> postToNotificationsRelationForNotificationsAsync(Notifications data) {
        return MethodInvocation.<Notifications, Notifications >postAsync(this, links, "notifications", Notifications.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "Notifications"), Notifications.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<Notifications>> postToNotificationsRelationForNotificationsAsync(Notifications data, CancellationToken ct) {
        return MethodInvocation.<Notifications, Notifications >postAsync(this, links, "notifications", Notifications.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "Notifications"), Notifications.class, null, data), ct);
    }

    public URI getTransferRelationLink() {
        return MethodInvocation.getLink(this, links, "transfer");
    }

    public DocumentsQueryResult postToTransferRelationForDocumentsQueryResult(FileCabinetTransferInfo data) {
        return MethodInvocation.<DocumentsQueryResult,FileCabinetTransferInfo>post(this, links, "transfer", DocumentsQueryResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "FileCabinetTransferInfo"), FileCabinetTransferInfo.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<DocumentsQueryResult>> postToTransferRelationForDocumentsQueryResultAsync(FileCabinetTransferInfo data) {
        return MethodInvocation.<DocumentsQueryResult, FileCabinetTransferInfo >postAsync(this, links, "transfer", DocumentsQueryResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "FileCabinetTransferInfo"), FileCabinetTransferInfo.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<DocumentsQueryResult>> postToTransferRelationForDocumentsQueryResultAsync(FileCabinetTransferInfo data, CancellationToken ct) {
        return MethodInvocation.<DocumentsQueryResult, FileCabinetTransferInfo >postAsync(this, links, "transfer", DocumentsQueryResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "FileCabinetTransferInfo"), FileCabinetTransferInfo.class, null, data), ct);
    }

    public DocumentsQueryResult postToTransferRelationForDocumentsQueryResult(DocumentsTransferInfo data) {
        return MethodInvocation.<DocumentsQueryResult,DocumentsTransferInfo>post(this, links, "transfer", DocumentsQueryResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentsTransferInfo"), DocumentsTransferInfo.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<DocumentsQueryResult>> postToTransferRelationForDocumentsQueryResultAsync(DocumentsTransferInfo data) {
        return MethodInvocation.<DocumentsQueryResult, DocumentsTransferInfo >postAsync(this, links, "transfer", DocumentsQueryResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentsTransferInfo"), DocumentsTransferInfo.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<DocumentsQueryResult>> postToTransferRelationForDocumentsQueryResultAsync(DocumentsTransferInfo data, CancellationToken ct) {
        return MethodInvocation.<DocumentsQueryResult, DocumentsTransferInfo >postAsync(this, links, "transfer", DocumentsQueryResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentsTransferInfo"), DocumentsTransferInfo.class, null, data), ct);
    }

    public URI getVersionHistoryResultListRelationLink() {
        return MethodInvocation.getLink(this, links, "versionHistoryResultList");
    }

    public DialogInfo getDialogInfoFromVersionHistoryResultListRelation() {
        return MethodInvocation.<DialogInfo>get(this, links, "versionHistoryResultList", DialogInfo.class);
    }

    public Future<DeserializedHttpResponseGen<DialogInfo>> getDialogInfoFromVersionHistoryResultListRelationAsync() {
        return MethodInvocation.<DialogInfo>getAsync(this, links, "versionHistoryResultList", DialogInfo.class);
    }

    public Future<DeserializedHttpResponseGen<DialogInfo>> getDialogInfoFromVersionHistoryResultListRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DialogInfo>getAsync(this, links, "versionHistoryResultList", DialogInfo.class, ct);
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

    public URI getFieldValueStatisticsRelationLink() {
        return MethodInvocation.getLink(this, links, "fieldValueStatistics");
    }

    public FieldValueStatisticsResult postToFieldValueStatisticsRelationForFieldValueStatisticsResult(FieldValueStatisticsExpression data) {
        return MethodInvocation.<FieldValueStatisticsResult,FieldValueStatisticsExpression>post(this, links, "fieldValueStatistics", FieldValueStatisticsResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "FieldValueStatisticsExpression"), FieldValueStatisticsExpression.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<FieldValueStatisticsResult>> postToFieldValueStatisticsRelationForFieldValueStatisticsResultAsync(FieldValueStatisticsExpression data) {
        return MethodInvocation.<FieldValueStatisticsResult, FieldValueStatisticsExpression >postAsync(this, links, "fieldValueStatistics", FieldValueStatisticsResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "FieldValueStatisticsExpression"), FieldValueStatisticsExpression.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<FieldValueStatisticsResult>> postToFieldValueStatisticsRelationForFieldValueStatisticsResultAsync(FieldValueStatisticsExpression data, CancellationToken ct) {
        return MethodInvocation.<FieldValueStatisticsResult, FieldValueStatisticsExpression >postAsync(this, links, "fieldValueStatistics", FieldValueStatisticsResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "FieldValueStatisticsExpression"), FieldValueStatisticsExpression.class, null, data), ct);
    }

    public URI getReplicationDataRelationLink() {
        return MethodInvocation.getLink(this, links, "replicationData");
    }

    public String postToReplicationDataRelationForString(InputStream data, String bodyContentType) {
        return MethodInvocation.<String, InputStream>post(this, links, "replicationData", String.class, data, bodyContentType);
    }

    public Future<DeserializedHttpResponseGen<String>> postToReplicationDataRelationForStringAsync(InputStream data, String bodyContentType) { 
        return MethodInvocation.<String, InputStream>postAsync(this, links, "replicationData", String.class, data, bodyContentType);
}

    public Future<DeserializedHttpResponseGen<String>> postToReplicationDataRelationForStringAsync(InputStream data, String bodyContentType, CancellationToken ct) { 
        return MethodInvocation.<String, InputStream>postAsync(this, links, "replicationData", String.class, data, bodyContentType, ct);
}

    public URI getReplicationDeleteDataRelationLink() {
        return MethodInvocation.getLink(this, links, "replicationDeleteData");
    }

    public String postToReplicationDeleteDataRelationForString(InputStream data, String bodyContentType) {
        return MethodInvocation.<String, InputStream>post(this, links, "replicationDeleteData", String.class, data, bodyContentType);
    }

    public Future<DeserializedHttpResponseGen<String>> postToReplicationDeleteDataRelationForStringAsync(InputStream data, String bodyContentType) { 
        return MethodInvocation.<String, InputStream>postAsync(this, links, "replicationDeleteData", String.class, data, bodyContentType);
}

    public Future<DeserializedHttpResponseGen<String>> postToReplicationDeleteDataRelationForStringAsync(InputStream data, String bodyContentType, CancellationToken ct) { 
        return MethodInvocation.<String, InputStream>postAsync(this, links, "replicationDeleteData", String.class, data, bodyContentType, ct);
}

    public URI getSetupReplicationRelationLink() {
        return MethodInvocation.getLink(this, links, "setupReplication");
    }

    public String postToSetupReplicationRelationForString(InputStream data, String bodyContentType) {
        return MethodInvocation.<String, InputStream>post(this, links, "setupReplication", String.class, data, bodyContentType);
    }

    public Future<DeserializedHttpResponseGen<String>> postToSetupReplicationRelationForStringAsync(InputStream data, String bodyContentType) { 
        return MethodInvocation.<String, InputStream>postAsync(this, links, "setupReplication", String.class, data, bodyContentType);
}

    public Future<DeserializedHttpResponseGen<String>> postToSetupReplicationRelationForStringAsync(InputStream data, String bodyContentType, CancellationToken ct) { 
        return MethodInvocation.<String, InputStream>postAsync(this, links, "setupReplication", String.class, data, bodyContentType, ct);
}

    public URI getNextSequenceElementRelationLink() {
        return MethodInvocation.getLink(this, links, "nextSequenceElement");
    }

    /*
    public SequenceResult postToNextSequenceElementRelationForSequenceResult(SequenceRequest data) {
        return MethodInvocation.<SequenceResult,SequenceRequest>post(this, links, "nextSequenceElement", SequenceResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "SequenceRequest"), SequenceRequest.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<SequenceResult>> postToNextSequenceElementRelationForSequenceResultAsync(SequenceRequest data) {
        return MethodInvocation.<SequenceResult, SequenceRequest >postAsync(this, links, "nextSequenceElement", SequenceResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "SequenceRequest"), SequenceRequest.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<SequenceResult>> postToNextSequenceElementRelationForSequenceResultAsync(SequenceRequest data, CancellationToken ct) {
        return MethodInvocation.<SequenceResult, SequenceRequest >postAsync(this, links, "nextSequenceElement", SequenceResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "SequenceRequest"), SequenceRequest.class, null, data), ct);
    }
*/


}
