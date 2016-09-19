

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
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
import com.docuware.dev.schema._public.services.platform.SequenceResult;
import com.docuware.dev.schema._public.services.platform.SequenceRequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.schema._public.services.Links;


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

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links value) {
        this.links = value;
    }

    /**List of the fields of the cabinet.*/
    public FileCabinetFields getFields() {
        return fields;
    }

    /**List of the fields of the cabinet.*/
    public void setFields(FileCabinetFields value) {
        this.fields = value;
    }

    /**List of the rights that the current user has for this cabinet.*/
    public Rights getRights() {
        return rights;
    }

    /**List of the rights that the current user has for this cabinet.*/
    public void setRights(Rights value) {
        this.rights = value;
    }

    /**Gets or sets the color of the file cabinet icon.*/
    public String getColor() {
        return color;
    }

    public void setColor(String value) {
        this.color = value;
    }

    /**Gets or sets the name of the file cabinet.*/
    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    /**Gets or sets the id of the file.*/
    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
    }

    /**Gets or sets a flag indicating whether this file cabinet is a basket or not.*/
    public boolean isIsBasket() {
        return isBasket;
    }

    public void setIsBasket(boolean value) {
        this.isBasket = value;
    }

    /**Gets or sets if user has usage right for web basket. For file cabinets it's always true*/
    public boolean isUsable() {
        if (usable == null) {
            return true;
        } else {
            return usable;
        }
    }

    public void setUsable(Boolean value) {
        this.usable = value;
    }

    /**Gets or sets a flag indicating whether this cabinet is default or not.*/
    public boolean isDefault() {
        return _default;
    }

    public void setDefault(boolean value) {
        this._default = value;
    }

    /**Gets or sets a flag indicating whether this cabinet is default or not.*/
    public String getAssignedCabinetId() {
        return assignedCabinetId;
    }

    public void setAssignedCabinetId(String value) {
        this.assignedCabinetId = value;
    }

    /**Gets or sets a flag indicating whether this cabinet is default or not.*/
    public String getIntellixDialogId() {
        return intellixDialogId;
    }

    public void setIntellixDialogId(String value) {
        this.intellixDialogId = value;
    }

    /**Version management mode.*/
    public VersionManagementMode getVersionManagement() {
        if (versionManagement == null) {
            return VersionManagementMode.DISABLE;
        } else {
            return versionManagement;
        }
    }

    /**Version management mode.*/
    public void setVersionManagement(VersionManagementMode value) {
        this.versionManagement = value;
    }

    /**Gets the id of version history result list.*/
    public String getVersionHistoryResultListId() {
        return versionHistoryResultListId;
    }

    /**Gets the id of version history result list.*/
    public void setVersionHistoryResultListId(String value) {
        this.versionHistoryResultListId = value;
    }

    /**Gets whether the file cabinet can be accessed by windows explorer client.*/
    @Dolphin
    public boolean isWindowsExplorerClientAccess() {
        if (windowsExplorerClientAccess == null) {
            return false;
        } else {
            return windowsExplorerClientAccess;
        }
    }

    /**Gets whether the file cabinet can be accessed by windows explorer client.*/
    @Dolphin
    public void setWindowsExplorerClientAccess(Boolean value) {
        this.windowsExplorerClientAccess = value;
    }

    /**Gets whether all letters are input in upper case, regardless of how they were entered on the keyboard*/
    @Eagle
    public boolean isAddIndexEntriesInUpperCase() {
        if (addIndexEntriesInUpperCase == null) {
            return false;
        } else {
            return addIndexEntriesInUpperCase;
        }
    }

    /**Gets whether all letters are input in upper case, regardless of how they were entered on the keyboard*/
    @Eagle
    public void setAddIndexEntriesInUpperCase(Boolean value) {
        this.addIndexEntriesInUpperCase = value;
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
	* Uploads the import package in chunks.
	* 
	* @param file	The file
	* @param importSettings	 The settings used by the import
	* @return	 The uploaded document's metadata
	*/
    @Extension
    public ImportResult chunkImportArchive(java.io.File file,ImportSettings importSettings) {
	return FileCabinetExtensionsBase.chunkImportArchive(this,importSettings, new DwxArchiveFileUploadInfo(file) ,0);
    }


	/**
	* Uploads the specified synchronization package in chunks.
	* 
	* @param file	The file
	* @param synchronizationSettings	 The settings used by the synchronization
	* @return	 The uploaded document's metadata
	*/
    @Extension
    public ImportResult chunkSynchronize(java.io.File file,SynchronizationSettings synchronizationSettings) {
	return FileCabinetExtensionsBase.chunkSynchronize(this,synchronizationSettings, new DwxArchiveFileUploadInfo(file) ,0);
    }


	/**
	* Upload the specified document in chunks.
	* 
	* @param file	The file
	* @param chunkSize	 [optional/ set this parameter to 0 if you want to use default value] The size of the chunk in bytes
	* @return	 The uploaded document's metadata
	*/
    @Extension
    public Document chunkUploadDocument(java.io.File file,int chunkSize) {
	return FileCabinetExtensionsBase.chunkUploadDocument(this, FileWrapper.toFileInfoWrapper(file), chunkSize);
    }


	/**
	* Upload the specified document in chunks.
	* 
	* @param files	The files
	* @param chunkSize	 [optional/ set this parameter to 0 if you want to use default value] The size of the chunk in bytes
	* @return	 The uploaded document's metadata
	*/
    @Extension
    public Document chunkUploadDocument(java.io.File[] files,int chunkSize) {
	return FileCabinetExtensionsBase.chunkUploadDocument(this, FileWrapper.toFileInfoWrapper(files), chunkSize);
    }


	/**
	* Upload the specified document in chunks.
	* 
	* @param document	The document
	* @param file	The file
	* @param chunkSize	 [optional/ set this parameter to 0 if you want to use default value] The size of the chunk in bytes
	* @return	 The uploaded document's metadata
	*/
    @Extension
    public Document chunkUploadDocument(Document document,java.io.File file,int chunkSize) {
	return FileCabinetExtensionsBase.chunkUploadDocument(this, document, FileWrapper.toFileInfoWrapper(file), chunkSize);
    }


	/**
	* Upload the specified document in chunks.
	* 
	* @param document	The document
	* @param files	The files
	* @param chunkSize	 [optional/ set this parameter to 0 if you want to use default value] The size of the chunk in bytes
	* @return	 The uploaded document's metadata
	*/
    @Extension
    public Document chunkUploadDocument(Document document,java.io.File[] files,int chunkSize) {
	return FileCabinetExtensionsBase.chunkUploadDocument(this, document, FileWrapper.toFileInfoWrapper(files), chunkSize);
    }


	/**
	* Uploads the specified document.
	* 
	* @param document	The document
	* @param file	The file
	* @return	 The uploaded document's metadata
	*/
    @Extension
    public Document uploadDocument(Document document,java.io.File... file) {
	return FileCabinetExtensionsBase.uploadDocument(this, document, FileWrapper.toFileInfoWrapper(file));
    }


	/**
	* Uploads the specified document asynchronously.
	* 
	* @param document	The document
	* @param file	The file
	* @return	 A CompletableFuture uploads the document and returns the uploaded document's metadata.
	*/
    @Extension
    public CompletableFuture<DeserializedHttpResponseGen<Document>> uploadDocumentAsync(Document document,java.io.File... file) {
	return FileCabinetExtensionsBase.uploadDocumentAsync(this, document, FileWrapper.toFileInfoWrapper(file));
    }


	/**
	* Uploads the specified document asynchronously.
	* 
	* @param file	The file
	* @return	 A CompletableFuture uploads the document and returns the uploaded document's metadata.
	*/
    @Extension
    public CompletableFuture<DeserializedHttpResponseGen<Document>> uploadDocumentAsync(java.io.File... file) {
	return FileCabinetExtensionsBase.uploadDocumentAsync(this, FileWrapper.toFileInfoWrapper(file));
    }


	/**
	* Uploads the specified document.
	* 
	* @param file	The file
	* @return	The uploaded document's metadata.
	*/
    @Extension
    public Document uploadDocument(java.io.File... file) {
	return FileCabinetExtensionsBase.uploadDocument(this, FileWrapper.toFileInfoWrapper(file));
    }


	/**
	* Uploads the specified document.
	* 
	* @param file	The file
	* @return	The uploaded document's metadata.
	*/
    @Extension
    public ImportResult importArchive(java.io.File file) {
	return FileCabinetExtensionsBase.importArchive(this, null, new DwxArchiveFileUploadInfo(file));
    }


	/**
	* Uploads the specified document.
	* 
	* @param file	The file
	* @param importSettings	The settings of the import
	* @return	The uploaded document's metadata.
	*/
    @Extension
    public ImportResult importArchive(java.io.File file,ImportSettings importSettings) {
	return FileCabinetExtensionsBase.importArchive(this, importSettings, new DwxArchiveFileUploadInfo(file));
    }


	/**
	* Uploads the specified document.
	* 
	* @param file	The file
	* @param synchronizationSettings	The settings of the import
	* @return	The uploaded document's metadata.
	*/
    @Extension
    public ImportResult synchronize(java.io.File file,SynchronizationSettings synchronizationSettings) {
	return FileCabinetExtensionsBase.synchronize(this, synchronizationSettings, new DwxArchiveFileUploadInfo(file));
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
    * Gets the Uri of the Link for the relation "Documents".
    * Returns the Uri of the Link for the relation "Documents", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getDocumentsRelationLink() {
        return MethodInvocation.getLink(this, links, "documents");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Documents".
    */
    public DocumentsQueryResult getDocumentsQueryResultFromDocumentsRelation() {
        return MethodInvocation.<DocumentsQueryResult>get(this, links, "documents", DocumentsQueryResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Documents" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentsQueryResult>> getDocumentsQueryResultFromDocumentsRelationAsync() {
        return MethodInvocation.<DocumentsQueryResult>getAsync(this, links, "documents", DocumentsQueryResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Documents" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentsQueryResult>> getDocumentsQueryResultFromDocumentsRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DocumentsQueryResult>getAsync(this, links, "documents", DocumentsQueryResult.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Documents".
    */
    public Document postToDocumentsRelationForDocument(Document data) {
        return MethodInvocation.<Document, Document> post(this, links, "documents", Document.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "Document"), Document.class, null, data), "application/vnd.docuware.platform.document+xml", "application/vnd.docuware.platform.document+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Documents" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Document>> postToDocumentsRelationForDocumentAsync(Document data) {
        return MethodInvocation.<Document, Document >postAsync(this, links, "documents", Document.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "Document"), Document.class, null, data), "application/vnd.docuware.platform.document+xml", "application/vnd.docuware.platform.document+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Documents" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Document>> postToDocumentsRelationForDocumentAsync(CancellationToken ct, Document data) {
        return MethodInvocation.<Document, Document >postAsync(this, links, "documents", Document.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "Document"), Document.class, null, data), "application/vnd.docuware.platform.document+xml", "application/vnd.docuware.platform.document+xml", ct);
    }

    /**
    * Gets the Uri of the Link for the relation "DocumentsTable".
    * Returns the Uri of the Link for the relation "DocumentsTable", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getDocumentsTableRelationLink() {
        return MethodInvocation.getLink(this, links, "documentsTable");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "DocumentsTable".
    */
    public DocumentsQueryTableResult getDocumentsQueryTableResultFromDocumentsTableRelation() {
        return MethodInvocation.<DocumentsQueryTableResult>get(this, links, "documentsTable", DocumentsQueryTableResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "DocumentsTable" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentsQueryTableResult>> getDocumentsQueryTableResultFromDocumentsTableRelationAsync() {
        return MethodInvocation.<DocumentsQueryTableResult>getAsync(this, links, "documentsTable", DocumentsQueryTableResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "DocumentsTable" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentsQueryTableResult>> getDocumentsQueryTableResultFromDocumentsTableRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DocumentsQueryTableResult>getAsync(this, links, "documentsTable", DocumentsQueryTableResult.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "ContentMergeOperation".
    * Returns the Uri of the Link for the relation "ContentMergeOperation", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getContentMergeOperationRelationLink() {
        return MethodInvocation.getLink(this, links, "contentMergeOperation");
    }

    /**
    * Calls the HTTP put Method on the link for the relation "ContentMergeOperation".
    */
    public Document putToContentMergeOperationRelationForDocument(ContentMergeOperationInfo data) {
        return MethodInvocation.<Document, ContentMergeOperationInfo> put(this, links, "contentMergeOperation", Document.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ContentMergeOperationInfo"), ContentMergeOperationInfo.class, null, data), "application/vnd.docuware.platform.contentmergeoperationinfo+xml", "application/vnd.docuware.platform.document+xml");
    }

    /**
    * Calls the HTTP put Method on the link for the relation "ContentMergeOperation" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Document>> putToContentMergeOperationRelationForDocumentAsync(ContentMergeOperationInfo data) {
        return MethodInvocation.<Document, ContentMergeOperationInfo >putAsync(this, links, "contentMergeOperation", Document.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ContentMergeOperationInfo"), ContentMergeOperationInfo.class, null, data), "application/vnd.docuware.platform.contentmergeoperationinfo+xml", "application/vnd.docuware.platform.document+xml");
    }

    /**
    * Calls the HTTP put Method on the link for the relation "ContentMergeOperation" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Document>> putToContentMergeOperationRelationForDocumentAsync(CancellationToken ct, ContentMergeOperationInfo data) {
        return MethodInvocation.<Document, ContentMergeOperationInfo >putAsync(this, links, "contentMergeOperation", Document.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ContentMergeOperationInfo"), ContentMergeOperationInfo.class, null, data), "application/vnd.docuware.platform.contentmergeoperationinfo+xml", "application/vnd.docuware.platform.document+xml", ct);
    }

    /**
    * Gets the Uri of the Link for the relation "AdvancedDocumentUpload".
    * Returns the Uri of the Link for the relation "AdvancedDocumentUpload", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getAdvancedDocumentUploadRelationLink() {
        return MethodInvocation.getLink(this, links, "advancedDocumentUpload");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "AdvancedDocumentUpload".
    */
    public Document postToAdvancedDocumentUploadRelationForDocument(String bodyContentType, InputStream data) { 
        return MethodInvocation.<Document, InputStream>post(this, links, "advancedDocumentUpload", Document.class, data, bodyContentType, "application/vnd.docuware.platform.document+xml");
}

    /**
    * Calls the HTTP post Method on the link for the relation "AdvancedDocumentUpload" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Document>> postToAdvancedDocumentUploadRelationForDocumentAsync(String bodyContentType, InputStream data) { 
        return MethodInvocation.<Document, InputStream>postAsync(this, links, "advancedDocumentUpload", Document.class, data, bodyContentType, "application/vnd.docuware.platform.document+xml");
}

    /**
    * Calls the HTTP post Method on the link for the relation "AdvancedDocumentUpload" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Document>> postToAdvancedDocumentUploadRelationForDocumentAsync(CancellationToken ct, String bodyContentType, InputStream data) { 
        return MethodInvocation.<Document, InputStream>postAsync(this, links, "advancedDocumentUpload", Document.class, data, bodyContentType, "application/vnd.docuware.platform.document+xml", ct);
}

    /**
    * Gets the Uri of the Link for the relation "ImportDocuments".
    * Returns the Uri of the Link for the relation "ImportDocuments", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getImportDocumentsRelationLink() {
        return MethodInvocation.getLink(this, links, "importDocuments");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "ImportDocuments".
    */
    public ImportResult postToImportDocumentsRelationForImportResult(ImportSettings data) {
        return MethodInvocation.<ImportResult, ImportSettings> post(this, links, "importDocuments", ImportResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ImportSettings"), ImportSettings.class, null, data), "application/vnd.docuware.platform.importsettings+xml", "application/vnd.docuware.platform.importresult+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "ImportDocuments" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<ImportResult>> postToImportDocumentsRelationForImportResultAsync(ImportSettings data) {
        return MethodInvocation.<ImportResult, ImportSettings >postAsync(this, links, "importDocuments", ImportResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ImportSettings"), ImportSettings.class, null, data), "application/vnd.docuware.platform.importsettings+xml", "application/vnd.docuware.platform.importresult+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "ImportDocuments" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<ImportResult>> postToImportDocumentsRelationForImportResultAsync(CancellationToken ct, ImportSettings data) {
        return MethodInvocation.<ImportResult, ImportSettings >postAsync(this, links, "importDocuments", ImportResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ImportSettings"), ImportSettings.class, null, data), "application/vnd.docuware.platform.importsettings+xml", "application/vnd.docuware.platform.importresult+xml", ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "ImportDocuments".
    */
    public ImportResult postToImportDocumentsRelationForImportResult(SynchronizationSettings data) {
        return MethodInvocation.<ImportResult, SynchronizationSettings> post(this, links, "importDocuments", ImportResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "SynchronizationSettings"), SynchronizationSettings.class, null, data), "application/vnd.docuware.platform.synchronizationsettings+xml", "application/vnd.docuware.platform.importresult+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "ImportDocuments" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<ImportResult>> postToImportDocumentsRelationForImportResultAsync(SynchronizationSettings data) {
        return MethodInvocation.<ImportResult, SynchronizationSettings >postAsync(this, links, "importDocuments", ImportResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "SynchronizationSettings"), SynchronizationSettings.class, null, data), "application/vnd.docuware.platform.synchronizationsettings+xml", "application/vnd.docuware.platform.importresult+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "ImportDocuments" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<ImportResult>> postToImportDocumentsRelationForImportResultAsync(CancellationToken ct, SynchronizationSettings data) {
        return MethodInvocation.<ImportResult, SynchronizationSettings >postAsync(this, links, "importDocuments", ImportResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "SynchronizationSettings"), SynchronizationSettings.class, null, data), "application/vnd.docuware.platform.synchronizationsettings+xml", "application/vnd.docuware.platform.importresult+xml", ct);
    }

    /**
    * Gets the Uri of the Link for the relation "UnprocessedDocumentUpload".
    * Returns the Uri of the Link for the relation "UnprocessedDocumentUpload", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getUnprocessedDocumentUploadRelationLink() {
        return MethodInvocation.getLink(this, links, "unprocessedDocumentUpload");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "UnprocessedDocumentUpload".
    */
    public Document postToUnprocessedDocumentUploadRelationForDocument(String bodyContentType, InputStream data) { 
        return MethodInvocation.<Document, InputStream>post(this, links, "unprocessedDocumentUpload", Document.class, data, bodyContentType, "application/vnd.docuware.platform.document+xml");
}

    /**
    * Calls the HTTP post Method on the link for the relation "UnprocessedDocumentUpload" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Document>> postToUnprocessedDocumentUploadRelationForDocumentAsync(String bodyContentType, InputStream data) { 
        return MethodInvocation.<Document, InputStream>postAsync(this, links, "unprocessedDocumentUpload", Document.class, data, bodyContentType, "application/vnd.docuware.platform.document+xml");
}

    /**
    * Calls the HTTP post Method on the link for the relation "UnprocessedDocumentUpload" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Document>> postToUnprocessedDocumentUploadRelationForDocumentAsync(CancellationToken ct, String bodyContentType, InputStream data) { 
        return MethodInvocation.<Document, InputStream>postAsync(this, links, "unprocessedDocumentUpload", Document.class, data, bodyContentType, "application/vnd.docuware.platform.document+xml", ct);
}

    /**
    * Gets the Uri of the Link for the relation "Query".
    * Returns the Uri of the Link for the relation "Query", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getQueryRelationLink() {
        return MethodInvocation.getLink(this, links, "query");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Query".
    */
    public DocumentsQueryResult getDocumentsQueryResultFromQueryRelation() {
        return MethodInvocation.<DocumentsQueryResult>get(this, links, "query", DocumentsQueryResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Query" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentsQueryResult>> getDocumentsQueryResultFromQueryRelationAsync() {
        return MethodInvocation.<DocumentsQueryResult>getAsync(this, links, "query", DocumentsQueryResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Query" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentsQueryResult>> getDocumentsQueryResultFromQueryRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DocumentsQueryResult>getAsync(this, links, "query", DocumentsQueryResult.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Dialogs".
    * Returns the Uri of the Link for the relation "Dialogs", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getDialogsRelationLink() {
        return MethodInvocation.getLink(this, links, "dialogs");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Dialogs".
    */
    public DialogInfos getDialogInfosFromDialogsRelation() {
        return MethodInvocation.<DialogInfos>get(this, links, "dialogs", DialogInfos.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Dialogs" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DialogInfos>> getDialogInfosFromDialogsRelationAsync() {
        return MethodInvocation.<DialogInfos>getAsync(this, links, "dialogs", DialogInfos.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Dialogs" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DialogInfos>> getDialogInfosFromDialogsRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DialogInfos>getAsync(this, links, "dialogs", DialogInfos.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Searches".
    * Returns the Uri of the Link for the relation "Searches", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getSearchesRelationLink() {
        return MethodInvocation.getLink(this, links, "searches");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Searches".
    */
    public DialogInfos getDialogInfosFromSearchesRelation() {
        return MethodInvocation.<DialogInfos>get(this, links, "searches", DialogInfos.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Searches" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DialogInfos>> getDialogInfosFromSearchesRelationAsync() {
        return MethodInvocation.<DialogInfos>getAsync(this, links, "searches", DialogInfos.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Searches" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DialogInfos>> getDialogInfosFromSearchesRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DialogInfos>getAsync(this, links, "searches", DialogInfos.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "CustomSearch".
    * Returns the Uri of the Link for the relation "CustomSearch", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getCustomSearchRelationLink() {
        return MethodInvocation.getLink(this, links, "customSearch");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "CustomSearch".
    */
    public Dialog getDialogFromCustomSearchRelation() {
        return MethodInvocation.<Dialog>get(this, links, "customSearch", Dialog.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "CustomSearch" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Dialog>> getDialogFromCustomSearchRelationAsync() {
        return MethodInvocation.<Dialog>getAsync(this, links, "customSearch", Dialog.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "CustomSearch" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Dialog>> getDialogFromCustomSearchRelationAsync(CancellationToken ct) {
        return MethodInvocation.<Dialog>getAsync(this, links, "customSearch", Dialog.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "ResultTrees".
    * Returns the Uri of the Link for the relation "ResultTrees", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getResultTreesRelationLink() {
        return MethodInvocation.getLink(this, links, "resultTrees");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "ResultTrees".
    */
    public DialogInfos getDialogInfosFromResultTreesRelation() {
        return MethodInvocation.<DialogInfos>get(this, links, "resultTrees", DialogInfos.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "ResultTrees" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DialogInfos>> getDialogInfosFromResultTreesRelationAsync() {
        return MethodInvocation.<DialogInfos>getAsync(this, links, "resultTrees", DialogInfos.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "ResultTrees" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DialogInfos>> getDialogInfosFromResultTreesRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DialogInfos>getAsync(this, links, "resultTrees", DialogInfos.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Stores".
    * Returns the Uri of the Link for the relation "Stores", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getStoresRelationLink() {
        return MethodInvocation.getLink(this, links, "stores");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Stores".
    */
    public DialogInfos getDialogInfosFromStoresRelation() {
        return MethodInvocation.<DialogInfos>get(this, links, "stores", DialogInfos.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Stores" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DialogInfos>> getDialogInfosFromStoresRelationAsync() {
        return MethodInvocation.<DialogInfos>getAsync(this, links, "stores", DialogInfos.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Stores" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DialogInfos>> getDialogInfosFromStoresRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DialogInfos>getAsync(this, links, "stores", DialogInfos.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "TaskLists".
    * Returns the Uri of the Link for the relation "TaskLists", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getTaskListsRelationLink() {
        return MethodInvocation.getLink(this, links, "taskLists");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "TaskLists".
    */
    public DialogInfos getDialogInfosFromTaskListsRelation() {
        return MethodInvocation.<DialogInfos>get(this, links, "taskLists", DialogInfos.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "TaskLists" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DialogInfos>> getDialogInfosFromTaskListsRelationAsync() {
        return MethodInvocation.<DialogInfos>getAsync(this, links, "taskLists", DialogInfos.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "TaskLists" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DialogInfos>> getDialogInfosFromTaskListsRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DialogInfos>getAsync(this, links, "taskLists", DialogInfos.class, ct);
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
    public FileCabinet getFileCabinetFromSelfRelation() {
        return MethodInvocation.<FileCabinet>get(this, links, "self", FileCabinet.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Self" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<FileCabinet>> getFileCabinetFromSelfRelationAsync() {
        return MethodInvocation.<FileCabinet>getAsync(this, links, "self", FileCabinet.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Self" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<FileCabinet>> getFileCabinetFromSelfRelationAsync(CancellationToken ct) {
        return MethodInvocation.<FileCabinet>getAsync(this, links, "self", FileCabinet.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Stamps".
    * Returns the Uri of the Link for the relation "Stamps", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getStampsRelationLink() {
        return MethodInvocation.getLink(this, links, "stamps");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Stamps".
    */
    public Stamps getStampsFromStampsRelation() {
        return MethodInvocation.<Stamps>get(this, links, "stamps", Stamps.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Stamps" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Stamps>> getStampsFromStampsRelationAsync() {
        return MethodInvocation.<Stamps>getAsync(this, links, "stamps", Stamps.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Stamps" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Stamps>> getStampsFromStampsRelationAsync(CancellationToken ct) {
        return MethodInvocation.<Stamps>getAsync(this, links, "stamps", Stamps.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Notifications".
    * Returns the Uri of the Link for the relation "Notifications", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getNotificationsRelationLink() {
        return MethodInvocation.getLink(this, links, "notifications");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Notifications".
    */
    public Notifications getNotificationsFromNotificationsRelation() {
        return MethodInvocation.<Notifications>get(this, links, "notifications", Notifications.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Notifications" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Notifications>> getNotificationsFromNotificationsRelationAsync() {
        return MethodInvocation.<Notifications>getAsync(this, links, "notifications", Notifications.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Notifications" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Notifications>> getNotificationsFromNotificationsRelationAsync(CancellationToken ct) {
        return MethodInvocation.<Notifications>getAsync(this, links, "notifications", Notifications.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Notifications".
    */
    public Notifications postToNotificationsRelationForNotifications(Notifications data) {
        return MethodInvocation.<Notifications, Notifications> post(this, links, "notifications", Notifications.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "Notifications"), Notifications.class, null, data), "application/vnd.docuware.platform.notifications+xml", "application/vnd.docuware.platform.notifications+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Notifications" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Notifications>> postToNotificationsRelationForNotificationsAsync(Notifications data) {
        return MethodInvocation.<Notifications, Notifications >postAsync(this, links, "notifications", Notifications.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "Notifications"), Notifications.class, null, data), "application/vnd.docuware.platform.notifications+xml", "application/vnd.docuware.platform.notifications+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Notifications" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Notifications>> postToNotificationsRelationForNotificationsAsync(CancellationToken ct, Notifications data) {
        return MethodInvocation.<Notifications, Notifications >postAsync(this, links, "notifications", Notifications.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "Notifications"), Notifications.class, null, data), "application/vnd.docuware.platform.notifications+xml", "application/vnd.docuware.platform.notifications+xml", ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Transfer".
    * Returns the Uri of the Link for the relation "Transfer", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getTransferRelationLink() {
        return MethodInvocation.getLink(this, links, "transfer");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Transfer".
    */
    public DocumentsQueryResult postToTransferRelationForDocumentsQueryResult(FileCabinetTransferInfo data) {
        return MethodInvocation.<DocumentsQueryResult, FileCabinetTransferInfo> post(this, links, "transfer", DocumentsQueryResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "FileCabinetTransferInfo"), FileCabinetTransferInfo.class, null, data), "application/vnd.docuware.platform.filecabinettransferinfo+xml", "application/vnd.docuware.platform.documents+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Transfer" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentsQueryResult>> postToTransferRelationForDocumentsQueryResultAsync(FileCabinetTransferInfo data) {
        return MethodInvocation.<DocumentsQueryResult, FileCabinetTransferInfo >postAsync(this, links, "transfer", DocumentsQueryResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "FileCabinetTransferInfo"), FileCabinetTransferInfo.class, null, data), "application/vnd.docuware.platform.filecabinettransferinfo+xml", "application/vnd.docuware.platform.documents+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Transfer" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentsQueryResult>> postToTransferRelationForDocumentsQueryResultAsync(CancellationToken ct, FileCabinetTransferInfo data) {
        return MethodInvocation.<DocumentsQueryResult, FileCabinetTransferInfo >postAsync(this, links, "transfer", DocumentsQueryResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "FileCabinetTransferInfo"), FileCabinetTransferInfo.class, null, data), "application/vnd.docuware.platform.filecabinettransferinfo+xml", "application/vnd.docuware.platform.documents+xml", ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Transfer".
    */
    public DocumentsQueryResult postToTransferRelationForDocumentsQueryResult(DocumentsTransferInfo data) {
        return MethodInvocation.<DocumentsQueryResult, DocumentsTransferInfo> post(this, links, "transfer", DocumentsQueryResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentsTransferInfo"), DocumentsTransferInfo.class, null, data), "application/vnd.docuware.platform.documentstransferinfo+xml", "application/vnd.docuware.platform.documents+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Transfer" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentsQueryResult>> postToTransferRelationForDocumentsQueryResultAsync(DocumentsTransferInfo data) {
        return MethodInvocation.<DocumentsQueryResult, DocumentsTransferInfo >postAsync(this, links, "transfer", DocumentsQueryResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentsTransferInfo"), DocumentsTransferInfo.class, null, data), "application/vnd.docuware.platform.documentstransferinfo+xml", "application/vnd.docuware.platform.documents+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Transfer" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentsQueryResult>> postToTransferRelationForDocumentsQueryResultAsync(CancellationToken ct, DocumentsTransferInfo data) {
        return MethodInvocation.<DocumentsQueryResult, DocumentsTransferInfo >postAsync(this, links, "transfer", DocumentsQueryResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentsTransferInfo"), DocumentsTransferInfo.class, null, data), "application/vnd.docuware.platform.documentstransferinfo+xml", "application/vnd.docuware.platform.documents+xml", ct);
    }

    /**
    * Gets the Uri of the Link for the relation "VersionHistoryResultList".
    * Returns the Uri of the Link for the relation "VersionHistoryResultList", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getVersionHistoryResultListRelationLink() {
        return MethodInvocation.getLink(this, links, "versionHistoryResultList");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "VersionHistoryResultList".
    */
    public DialogInfo getDialogInfoFromVersionHistoryResultListRelation() {
        return MethodInvocation.<DialogInfo>get(this, links, "versionHistoryResultList", DialogInfo.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "VersionHistoryResultList" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DialogInfo>> getDialogInfoFromVersionHistoryResultListRelationAsync() {
        return MethodInvocation.<DialogInfo>getAsync(this, links, "versionHistoryResultList", DialogInfo.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "VersionHistoryResultList" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DialogInfo>> getDialogInfoFromVersionHistoryResultListRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DialogInfo>getAsync(this, links, "versionHistoryResultList", DialogInfo.class, ct);
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
        return MethodInvocation.<BatchUpdateIndexFieldsResult, BatchUpdateProcess> post(this, links, "batchUpdate", BatchUpdateIndexFieldsResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "BatchUpdateProcess"), BatchUpdateProcess.class, null, data), "application/vnd.docuware.platform.batchupdateprocess+xml", "application/vnd.docuware.platform.batchupdateindexfieldsresult+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "BatchUpdate" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<BatchUpdateIndexFieldsResult>> postToBatchUpdateRelationForBatchUpdateIndexFieldsResultAsync(BatchUpdateProcess data) {
        return MethodInvocation.<BatchUpdateIndexFieldsResult, BatchUpdateProcess >postAsync(this, links, "batchUpdate", BatchUpdateIndexFieldsResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "BatchUpdateProcess"), BatchUpdateProcess.class, null, data), "application/vnd.docuware.platform.batchupdateprocess+xml", "application/vnd.docuware.platform.batchupdateindexfieldsresult+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "BatchUpdate" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<BatchUpdateIndexFieldsResult>> postToBatchUpdateRelationForBatchUpdateIndexFieldsResultAsync(CancellationToken ct, BatchUpdateProcess data) {
        return MethodInvocation.<BatchUpdateIndexFieldsResult, BatchUpdateProcess >postAsync(this, links, "batchUpdate", BatchUpdateIndexFieldsResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "BatchUpdateProcess"), BatchUpdateProcess.class, null, data), "application/vnd.docuware.platform.batchupdateprocess+xml", "application/vnd.docuware.platform.batchupdateindexfieldsresult+xml", ct);
    }

    /**
    * Gets the Uri of the Link for the relation "FieldValueStatistics".
    * Returns the Uri of the Link for the relation "FieldValueStatistics", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getFieldValueStatisticsRelationLink() {
        return MethodInvocation.getLink(this, links, "fieldValueStatistics");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "FieldValueStatistics".
    */
    public FieldValueStatisticsResult postToFieldValueStatisticsRelationForFieldValueStatisticsResult(FieldValueStatisticsExpression data) {
        return MethodInvocation.<FieldValueStatisticsResult, FieldValueStatisticsExpression> post(this, links, "fieldValueStatistics", FieldValueStatisticsResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "FieldValueStatisticsExpression"), FieldValueStatisticsExpression.class, null, data), "application/vnd.docuware.platform.fieldvaluestatisticsexpression+xml", "application/vnd.docuware.platform.fieldvaluestatisticsresult+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "FieldValueStatistics" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<FieldValueStatisticsResult>> postToFieldValueStatisticsRelationForFieldValueStatisticsResultAsync(FieldValueStatisticsExpression data) {
        return MethodInvocation.<FieldValueStatisticsResult, FieldValueStatisticsExpression >postAsync(this, links, "fieldValueStatistics", FieldValueStatisticsResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "FieldValueStatisticsExpression"), FieldValueStatisticsExpression.class, null, data), "application/vnd.docuware.platform.fieldvaluestatisticsexpression+xml", "application/vnd.docuware.platform.fieldvaluestatisticsresult+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "FieldValueStatistics" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<FieldValueStatisticsResult>> postToFieldValueStatisticsRelationForFieldValueStatisticsResultAsync(CancellationToken ct, FieldValueStatisticsExpression data) {
        return MethodInvocation.<FieldValueStatisticsResult, FieldValueStatisticsExpression >postAsync(this, links, "fieldValueStatistics", FieldValueStatisticsResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "FieldValueStatisticsExpression"), FieldValueStatisticsExpression.class, null, data), "application/vnd.docuware.platform.fieldvaluestatisticsexpression+xml", "application/vnd.docuware.platform.fieldvaluestatisticsresult+xml", ct);
    }

    /**
    * Gets the Uri of the Link for the relation "ReplicationData".
    * Returns the Uri of the Link for the relation "ReplicationData", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getReplicationDataRelationLink() {
        return MethodInvocation.getLink(this, links, "replicationData");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "ReplicationData".
    */
    public InputStream postToReplicationDataRelationForInputStream(InputStream data) { 
        return MethodInvocation.<InputStream, InputStream>post(this, links, "replicationData", InputStream.class, data, "application/octet-stream", "application/xml");
}

    /**
    * Calls the HTTP post Method on the link for the relation "ReplicationData" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> postToReplicationDataRelationForInputStreamAsync(InputStream data) { 
        return MethodInvocation.<InputStream, InputStream>postAsync(this, links, "replicationData", InputStream.class, data, "application/octet-stream", "application/xml");
}

    /**
    * Calls the HTTP post Method on the link for the relation "ReplicationData" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> postToReplicationDataRelationForInputStreamAsync(CancellationToken ct, InputStream data) { 
        return MethodInvocation.<InputStream, InputStream>postAsync(this, links, "replicationData", InputStream.class, data, "application/octet-stream", "application/xml", ct);
}

    /**
    * Gets the Uri of the Link for the relation "ReplicationDeleteData".
    * Returns the Uri of the Link for the relation "ReplicationDeleteData", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getReplicationDeleteDataRelationLink() {
        return MethodInvocation.getLink(this, links, "replicationDeleteData");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "ReplicationDeleteData".
    */
    public InputStream postToReplicationDeleteDataRelationForInputStream(InputStream data) { 
        return MethodInvocation.<InputStream, InputStream>post(this, links, "replicationDeleteData", InputStream.class, data, "application/octet-stream", "application/xml");
}

    /**
    * Calls the HTTP post Method on the link for the relation "ReplicationDeleteData" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> postToReplicationDeleteDataRelationForInputStreamAsync(InputStream data) { 
        return MethodInvocation.<InputStream, InputStream>postAsync(this, links, "replicationDeleteData", InputStream.class, data, "application/octet-stream", "application/xml");
}

    /**
    * Calls the HTTP post Method on the link for the relation "ReplicationDeleteData" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> postToReplicationDeleteDataRelationForInputStreamAsync(CancellationToken ct, InputStream data) { 
        return MethodInvocation.<InputStream, InputStream>postAsync(this, links, "replicationDeleteData", InputStream.class, data, "application/octet-stream", "application/xml", ct);
}

    /**
    * Gets the Uri of the Link for the relation "SetupReplication".
    * Returns the Uri of the Link for the relation "SetupReplication", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getSetupReplicationRelationLink() {
        return MethodInvocation.getLink(this, links, "setupReplication");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "SetupReplication".
    */
    public String postToSetupReplicationRelationForString(InputStream data) { 
        return MethodInvocation.<String, InputStream>post(this, links, "setupReplication", String.class, data, "application/octet-stream", "text/plain");
}

    /**
    * Calls the HTTP post Method on the link for the relation "SetupReplication" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<String>> postToSetupReplicationRelationForStringAsync(InputStream data) { 
        return MethodInvocation.<String, InputStream>postAsync(this, links, "setupReplication", String.class, data, "application/octet-stream", "text/plain");
}

    /**
    * Calls the HTTP post Method on the link for the relation "SetupReplication" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<String>> postToSetupReplicationRelationForStringAsync(CancellationToken ct, InputStream data) { 
        return MethodInvocation.<String, InputStream>postAsync(this, links, "setupReplication", String.class, data, "application/octet-stream", "text/plain", ct);
}

    /**
    * Gets the Uri of the Link for the relation "NextSequenceElement".
    * Returns the Uri of the Link for the relation "NextSequenceElement", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getNextSequenceElementRelationLink() {
        return MethodInvocation.getLink(this, links, "nextSequenceElement");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "NextSequenceElement".
    */
    public SequenceResult postToNextSequenceElementRelationForSequenceResult(SequenceRequest data) {
        return MethodInvocation.<SequenceResult, SequenceRequest> post(this, links, "nextSequenceElement", SequenceResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "SequenceRequest"), SequenceRequest.class, null, data), "application/vnd.docuware.platform.sequencerequest+xml", "application/vnd.docuware.platform.sequenceresult+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "NextSequenceElement" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<SequenceResult>> postToNextSequenceElementRelationForSequenceResultAsync(SequenceRequest data) {
        return MethodInvocation.<SequenceResult, SequenceRequest >postAsync(this, links, "nextSequenceElement", SequenceResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "SequenceRequest"), SequenceRequest.class, null, data), "application/vnd.docuware.platform.sequencerequest+xml", "application/vnd.docuware.platform.sequenceresult+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "NextSequenceElement" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<SequenceResult>> postToNextSequenceElementRelationForSequenceResultAsync(CancellationToken ct, SequenceRequest data) {
        return MethodInvocation.<SequenceResult, SequenceRequest >postAsync(this, links, "nextSequenceElement", SequenceResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "SequenceRequest"), SequenceRequest.class, null, data), "application/vnd.docuware.platform.sequencerequest+xml", "application/vnd.docuware.platform.sequenceresult+xml", ct);
    }



}
