/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docuware.dev.Extensions;

import com.docuware.dev.Extensions.FileCabinetExtensionsBase.EasyUploadDefaults;
import com.docuware.dev.schema._public.services.platform.DialogInfo;
import com.docuware.dev.schema._public.services.platform.Document;
import com.docuware.dev.schema._public.services.platform.DocumentIndexField;
import com.docuware.dev.schema._public.services.platform.DocumentIndexFields;
import com.docuware.dev.schema._public.services.platform.FileCabinet;
import com.docuware.dev.schema._public.services.platform.ImportResult;
import com.docuware.dev.schema._public.services.platform.ImportSettings;
import com.docuware.dev.schema._public.services.platform.Section;
import com.docuware.dev.schema._public.services.platform.SynchronizationSettings;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import java.io.InputStream;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import javax.ws.rs.core.HttpHeaders;

/**
 *
 * @author Patrick
 */
public class EasyFileUploadExtensionsBase {
       
    /**
     * Uploads the specified file as new document to a basket asynchronously <p>
     * 
     * Remarks: The document is uploaded as optimal as possible. 
     * That is, if the document is small enough it is uploaded with a single request. 
     * If the file is large, the upload is done chunkwise.
     * 
     * @param fileCabinet   The file cabinet
     * @param file  The file
     * @param documentMetaData  The document meta data. Currently only the fields are used
     * @return  The uploaded document's metadata
     */
    public static CompletableFuture<DeserializedHttpResponseGen<Document>> EasyUploadSingleDocumentAsync(FileCabinet fileCabinet, IFileUploadInfo file, Document documentMetaData) {
        if (file.getLength() > EasyUploadDefaults.maxSingleFileChunkSize) {
            return FileCabinetExtensionsBase.chunkUploadDocumentAsync(fileCabinet, documentMetaData, file, EasyUploadDefaults.chunkSize);
        } else {
            return FileCabinetExtensionsBase.uploadDocumentAsync(fileCabinet, documentMetaData, new IFileUploadInfo[]{file});
        }
    }

    /**
     * Uploads the specified file as new document to a basket <p>
     * 
     * Remarks: The document is uploaded as optimal as possible. 
     * That is, if the document is small enough it is uploaded with a single request. 
     * If the file is large, the upload is done chunkwise.
     * 
     * @param fileCabinet   The file cabinet
     * @param file  The document meta data. Currently only the fields are used
     * @param documentMetaData  The file
     * @return  The uploaded document's metadata
     */
    public static Document EasyUploadSingleDocument(FileCabinet fileCabinet, IFileUploadInfo file, Document documentMetaData) {
        if (file.getLength() > EasyUploadDefaults.maxSingleFileChunkSize) {
            return FileCabinetExtensionsBase.chunkUploadDocument(fileCabinet, documentMetaData, file, EasyUploadDefaults.chunkSize);
        } else {
            return FileCabinetExtensionsBase.uploadDocument(fileCabinet, documentMetaData, new IFileUploadInfo[]{file});
        }
    }

    /**
     * Uploads the specified file as new document to a basket or to a file cabinet asynchronously <p>
     * 
     * Remarks: The document is uploaded as optimal as possible. 
     * That is, if the document is small enough it is uploaded with a single request. 
     * If the file is large, the upload is done chunkwise.
     * 
     * @param fileCabinet   The file cabinet
     * @param file  The document meta data. Currently only the fields are used
     * @param indexFields   The index fields
     * @return  The uploaded document's metadata
     */
    public static CompletableFuture<DeserializedHttpResponseGen<Document>> EasyUploadSingleDocumentAsync(FileCabinet fileCabinet, IFileUploadInfo file, DocumentIndexField... indexFields) {
        CompletableFuture<DeserializedHttpResponseGen<Document>> result;
        if (indexFields != null && indexFields.length > 0) {
            Document md = new Document();
            DocumentIndexFields difs = new DocumentIndexFields();
            for (int i = 0; i < indexFields.length; i++) {
                difs.getField().add(indexFields[i]);
            }
            md.setFields(difs);
            if (file.getLength() > EasyUploadDefaults.maxSingleFileChunkSize) {
                result = FileCabinetExtensionsBase.chunkUploadDocumentAsync(fileCabinet, md, file, EasyUploadDefaults.chunkSize);
            } else {
                result = FileCabinetExtensionsBase.uploadDocumentAsync(fileCabinet, md, new IFileUploadInfo[]{file});
            }
        } else {
            if (file.getLength() > EasyUploadDefaults.maxSingleFileChunkSize) {
                result = FileCabinetExtensionsBase.chunkUploadDocumentAsync(fileCabinet, file, EasyUploadDefaults.chunkSize);
            } else {
                result = FileCabinetExtensionsBase.uploadDocumentAsync(fileCabinet, new IFileUploadInfo[]{file});
            }
        }

        return result;
    }

    /**
     * Uploads the specified file as new document to a basket or to a file cabinet <p>
     * 
     * Remarks: The document is uploaded as optimal as possible. 
     * That is, if the document is small enough it is uploaded with a single request. 
     * If the file is large, the upload is done chunkwise.
     * 
     * @param fileCabinet   The file cabinet
     * @param file  The file
     * @param indexFields   The index fields
     * @return  The uploaded document's metadata
     */
    public static Document EasyUploadSingleDocument(FileCabinet fileCabinet, IFileUploadInfo file, DocumentIndexField... indexFields) {
        Document result;
        if (indexFields != null && indexFields.length > 0) {
            Document md = new Document();
            DocumentIndexFields difs = new DocumentIndexFields();
            for (int i = 0; i < indexFields.length; i++) {
                difs.getField().add(indexFields[i]);
            }
            md.setFields(difs);
            if (file.getLength() > EasyUploadDefaults.maxSingleFileChunkSize) {
                result = FileCabinetExtensionsBase.chunkUploadDocument(fileCabinet, md, file, EasyUploadDefaults.chunkSize);
            } else {
                result = FileCabinetExtensionsBase.uploadDocument(fileCabinet, md, new IFileUploadInfo[]{file});
            }
        } else {
            if (file.getLength() > EasyUploadDefaults.maxSingleFileChunkSize) {
                result = FileCabinetExtensionsBase.chunkUploadDocument(fileCabinet, file, EasyUploadDefaults.chunkSize);
            } else {
                result = FileCabinetExtensionsBase.uploadDocument(fileCabinet, new IFileUploadInfo[]{file});
            }
        }

        return result;
    }

    /**
     * Imports the specified file into a file cabinet
     * 
     * @param fileCabinet   The file cabinet
     * @param file  The file
     * @param importSettings    The settings of the import
     * @return  Returns the result of the import operation
     */
    public static ImportResult EasyImportArchive(FileCabinet fileCabinet, IFileUploadInfo file, ImportSettings importSettings) {
        if (file.getLength() > EasyUploadDefaults.maxSingleFileChunkSize) {
            return FileCabinetExtensionsBase.chunkImportArchive(fileCabinet, importSettings, file, EasyUploadDefaults.chunkSize);
        } else {
            return FileCabinetExtensionsBase.importArchive(fileCabinet, importSettings, file);
        }
    }

    /**
     * Imports asynchronously the specified file into a file cabinet
     * 
     * @param fileCabinet   The file cabinet
     * @param file  The file
     * @param importSettings    The settings of the import
     * @return  Returns the result of the import operation
     */
    public static CompletableFuture<DeserializedHttpResponseGen<ImportResult>> EasyImportArchiveAsync(FileCabinet fileCabinet, IFileUploadInfo file, ImportSettings importSettings) {
        if (file.getLength() > EasyUploadDefaults.maxSingleFileChunkSize) {
            return FileCabinetExtensionsBase.chunkImportArchiveAsync(fileCabinet, importSettings, file, EasyUploadDefaults.chunkSize);
        } else {
            return FileCabinetExtensionsBase.importArchiveAsync(fileCabinet, importSettings, file);
        }
    }

    /**
     * Synchronizes the specified file into a file cabinet
     * 
     * @param fileCabinet   The file cabinet
     * @param file  The file
     * @param synchronizeSettings   The settings of the synchronization
     * @return  Returns the result of the synchronization operation
     */
    public static ImportResult EasySynchronize(FileCabinet fileCabinet, IFileUploadInfo file, SynchronizationSettings synchronizeSettings) {
        if (file.getLength() > EasyUploadDefaults.maxSingleFileChunkSize) {
            return FileCabinetExtensionsBase.chunkSynchronize(fileCabinet, synchronizeSettings, file, EasyUploadDefaults.chunkSize);
        } else {
            return FileCabinetExtensionsBase.synchronize(fileCabinet, synchronizeSettings, file);
        }
    }

    /**
     * Synchronizes asynchronously the specified file into a file cabinet
     * 
     * @param fileCabinet   The file cabinet
     * @param file  The file
     * @param synchronizeSettings   The settings of the synchronization
     * @return  Returns the result of the synchronization operation
     */
    public static CompletableFuture<DeserializedHttpResponseGen<ImportResult>> EasySynchronizeAsync(FileCabinet fileCabinet, IFileUploadInfo file, SynchronizationSettings synchronizeSettings) {
        if (file.getLength() > EasyUploadDefaults.maxSingleFileChunkSize) {
            return FileCabinetExtensionsBase.chunkSynchronizeAsync(fileCabinet, synchronizeSettings, file, EasyUploadDefaults.chunkSize);
        } else {
            return FileCabinetExtensionsBase.synchronizeAsync(fileCabinet, synchronizeSettings, file);
        }
    }

    /**
     * Uploads array of files as new document asynchronously <p>
     * 
     * Remarks: The document is uploaded as optimal as possible. 
     * That is, if the document is small enough it is uploaded with a single request. 
     * If the file is large, the upload is done chunkwise.
     * 
     * @param fileCabinet   The file cabinet
     * @param files The files
     * @param documentMetaData  The document meta data. Currently only the fields are used
     * @return  The uploaded document's metadata
     */
    public static CompletableFuture<DeserializedHttpResponseGen<Document>> EasyUploadDocumentAsync(FileCabinet fileCabinet, IFileUploadInfo[] files, Document documentMetaData) {
        long sum = 0;
        for (IFileUploadInfo f : files) {
            sum += f.getLength();
        }
        if (sum > EasyUploadDefaults.maxSingleFileChunkSize) {
            return FileCabinetExtensionsBase.chunkUploadDocumentAsync(fileCabinet, documentMetaData, files, EasyUploadDefaults.chunkSize);
        } else {
            return FileCabinetExtensionsBase.uploadDocumentAsync(fileCabinet, documentMetaData, files);
        }
    }

    /**
     * Uploads array of files as new document <p>
     * 
     * Remarks: The document is uploaded as optimal as possible. 
     * That is, if the document is small enough it is uploaded with a single request. 
     * If the file is large, the upload is done chunkwise.
     * 
     * @param fileCabinet   The file cabinet
     * @param files The files
     * @param documentMetaData  The document meta data. Currently only the fields are used
     * @return  The uploaded document's metadata
     */
    public static Document EasyUploadDocument(FileCabinet fileCabinet, IFileUploadInfo[] files, Document documentMetaData) {
        long sum = 0;
        for (IFileUploadInfo f : files) {
            sum += f.getLength();
        }
        if (sum > EasyUploadDefaults.maxSingleFileChunkSize) {
            return FileCabinetExtensionsBase.chunkUploadDocument(fileCabinet, documentMetaData, files, EasyUploadDefaults.chunkSize);
        } else {
            return FileCabinetExtensionsBase.uploadDocument(fileCabinet, documentMetaData, files);
        }
    }

    /**
     * Uploads array of files as new document asynchronously <p>
     * 
     * Remarks: The document is uploaded as optimal as possible. 
     * That is, if the document is small enough it is uploaded with a single request. 
     * If the file is large, the upload is done chunkwise.
     * 
     * @param fileCabinet   The file cabinet
     * @param files The files
     * @param indexFields   The index fields
     * @return  The uploaded document's metadata
     */
    public static CompletableFuture<DeserializedHttpResponseGen<Document>> EasyUploadDocumentAsync(FileCabinet fileCabinet, IFileUploadInfo[] files, DocumentIndexField... indexFields) {
        long sum = 0;
        for (IFileUploadInfo f : files) {
            sum += f.getLength();
        }
        if (indexFields != null && indexFields.length > 0) {
            Document md = new Document();
            DocumentIndexFields difs = new DocumentIndexFields();
            for (int i = 0; i < indexFields.length; i++) {
                difs.getField().add(indexFields[i]);
            }
            md.setFields(difs);
            if (sum > EasyUploadDefaults.maxSingleFileChunkSize) {
                return FileCabinetExtensionsBase.chunkUploadDocumentAsync(fileCabinet, md, files, EasyUploadDefaults.chunkSize);
            } else {
                return FileCabinetExtensionsBase.uploadDocumentAsync(fileCabinet, md, files);
            }
        } else {
            if (sum > EasyUploadDefaults.maxSingleFileChunkSize) {
                return FileCabinetExtensionsBase.chunkUploadDocumentAsync(fileCabinet, files, EasyUploadDefaults.chunkSize);
            } else {
                return FileCabinetExtensionsBase.uploadDocumentAsync(fileCabinet, files);
            }
        }
    }

    /**
     * Uploads array of files as new document <p>
     * 
     * Remarks: The document is uploaded as optimal as possible. 
     * That is, if the document is small enough it is uploaded with a single request. 
     * If the file is large, the upload is done chunkwise.
     * 
     * @param fileCabinet   The file cabinet
     * @param files The files
     * @param indexFields   The index fields
     * @return  The uploaded document's metadata
     */
    public static Document EasyUploadDocument(FileCabinet fileCabinet, IFileUploadInfo[] files, DocumentIndexField... indexFields) {
        long sum = 0;
        for (IFileUploadInfo f : files) {
            sum += f.getLength();
        }
        if (indexFields != null && indexFields.length > 0) {
            Document md = new Document();
            DocumentIndexFields difs = new DocumentIndexFields();
            for (int i = 0; i < indexFields.length; i++) {
                difs.getField().add(indexFields[i]);
            }
            md.setFields(difs);
            if (sum > EasyUploadDefaults.maxSingleFileChunkSize) {
                return FileCabinetExtensionsBase.chunkUploadDocument(fileCabinet, md, files, EasyUploadDefaults.chunkSize);
            } else {
                return FileCabinetExtensionsBase.uploadDocument(fileCabinet, md, files);
            }
        } else {
            if (sum > EasyUploadDefaults.maxSingleFileChunkSize) {
                return FileCabinetExtensionsBase.chunkUploadDocument(fileCabinet, files, EasyUploadDefaults.chunkSize);
            } else {
                return FileCabinetExtensionsBase.uploadDocument(fileCabinet, files);
            }
        }
    }

    /**
     * Uploads array of files as new document via a store dialog asynchronously <p>
     * 
     * Remarks: The document is uploaded as optimal as possible. 
     * That is, if the document is small enough it is uploaded with a single request. 
     * If the file is large, the upload is done chunkwise.
     * 
     * @param dialogInfo    The store dialog
     * @param files The array of files
     * @param documentMetaData  The document meta data. Currently only the fields are used
     * @return  The uploaded document's metadata
     */
    public static CompletableFuture<DeserializedHttpResponseGen<Document>> EasyUploadDocumentAsync(DialogInfo dialogInfo, IFileUploadInfo[] files, Document documentMetaData) {
        long sum = 0;
        for (IFileUploadInfo f : files) {
            sum += f.getLength();
        }
        if (sum > EasyUploadDefaults.maxSingleFileChunkSize) {
            return FileCabinetExtensionsBase.chunkUploadDocumentAsync(dialogInfo, documentMetaData, files, EasyUploadDefaults.chunkSize);
        } else {
            return FileCabinetExtensionsBase.uploadDocumentAsync(dialogInfo, documentMetaData, files);
        }
    }

    /**
     * Uploads array of files as new document via a store dialog <p>
     * 
     * Remarks: The document is uploaded as optimal as possible. 
     * That is, if the document is small enough it is uploaded with a single request. 
     * If the file is large, the upload is done chunkwise.
     * 
     * @param dialogInfo    The store dialog
     * @param files The array of files
     * @param documentMetaData   The document meta data. Currently only the fields are used
     * @return  The uploaded document's metadata
     */
    public static Document EasyUploadDocument(DialogInfo dialogInfo, IFileUploadInfo[] files, Document documentMetaData) {
        long sum = 0;
        for (IFileUploadInfo f : files) {
            sum += f.getLength();
        }
        if (sum > EasyUploadDefaults.maxSingleFileChunkSize) {
            return FileCabinetExtensionsBase.chunkUploadDocument(dialogInfo, documentMetaData, files, EasyUploadDefaults.chunkSize);
        } else {
            return FileCabinetExtensionsBase.uploadDocument(dialogInfo, documentMetaData, files);
        }
    }

        /// <summary>
    /// Uploads the specified file as new section to the specified document asynchronously.
    /// </summary>
    /// <param name="document">The document.</param>
    /// <param name="file">The file.</param>
    /// <returns>The metadata of the added section.</returns>
    public static CompletableFuture<DeserializedHttpResponseGen<Section>> EasyUploadFileAsync(Document document, IFileUploadInfo file) {
        if (file.getLength() > EasyUploadDefaults.maxSingleFileChunkSize) {
            return FileCabinetExtensionsBase.chunkAddSectionAsync(document, file, EasyUploadDefaults.chunkSize);
        } else {
            return FileCabinetExtensionsBase.uploadSectionAsync(document, file);
        }
    }

        /// <summary>
    /// Uploads the specified file as new section to the specified document.
    /// </summary>
    /// <param name="document">The document.</param>
    /// <param name="file">The file.</param>
    /// <returns>The metadata of the added section.</returns>
    /**
     * Uploads the specified file as new section to the specified document
     * 
     * @param document  The document
     * @param file  The file
     * @return  The metadata of the added section
     */
    public static Section EasyUploadFile(Document document, IFileUploadInfo file) {
        try {
            return EasyUploadFileAsync(document, file).get().getContent();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    /**
     * Uploads the specified file as new section to the specified document asynchronously
     * 
     * @param section   The section to modify
     * @param file  The file marking the new content of the section
     * @return  The metadata of the modified section
     */
    public static CompletableFuture<DeserializedHttpResponseGen<Section>> EasyReplaceFileAsync(Section section, IFileUploadInfo file) {
        if (file.getLength() > EasyUploadDefaults.maxSingleFileChunkSize) {
            return FileCabinetExtensionsBase.chunkUploadSectionAsync(section, file, EasyUploadDefaults.chunkSize);
        } else {
            //var ct = ContentTypeMapping.Default.GetContentTypeFromFileExtension(file.Extension);
            String ct = file.getContentType();
            //using (var stream = File.Open(file.FullName, FileMode.Open, FileAccess.Read, FileShare.ReadWrite))

            return EasyReplaceFileResultAsync(section.getContentRelationLink().toString(), ((IRelationsWithProxy) section).getProxy(), section, file);
        }
    }

    /**
     * Uploads the specified file as new section to the specified document
     * 
     * @param section   The section to modify
     * @param file  The file marking the new content of the section
     * @return  The metadata of the modified section
     */
    public static Section EasyReplaceFile(Section section, IFileUploadInfo file) {
        try {
            return EasyReplaceFileAsync(section, file).get().getContent();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    private static CompletableFuture<DeserializedHttpResponseGen<Section>> EasyReplaceFileResultAsync(String link, HttpClientProxy httpClientProxy, Section section, IFileUploadInfo file) {
        return CompletableFuture.<DeserializedHttpResponseGen<Section>>supplyAsync(() -> {
            try (InputStream stream = file.createStream()) {
                WebResource web = httpClientProxy.getHttpClient().getClient().resource(GenerateFullUrl(link, httpClientProxy));
                ClientResponse resp = web
                        .header(HttpHeaders.CONTENT_TYPE, file.getContentType())
                        .header("Content-Disposition", "attachment; filename=\"" + file.getName() + "\"; ModificationDate=\"" + file.getLastWriteTimeUtc().toString() + "\";")
                        .post(ClientResponse.class, stream);
                if(resp.getStatus()<200||resp.getStatus()>399) {
                HttpClientRequestException e = HttpClientRequestException.create(resp);
                return new DeserializedHttpResponseGen(resp, e);
                   }
            else {
                return new DeserializedHttpResponseGen<>(resp, resp.getEntity(Section.class));}
            } catch (Exception e) {
                throw new RuntimeException(e.getMessage());
            }
        });
    }

    private static String GenerateFullUrl(String link, HttpClientProxy httpClient) {
        return httpClient.getBaseAddress().resolve(link).toString();
    }
}
