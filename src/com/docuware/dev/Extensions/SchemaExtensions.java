/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docuware.dev.Extensions;

import com.docuware.dev.schema._public.services.platform.Annotation;
import com.docuware.dev.schema._public.services.platform.AnnotationsPlacement;
import com.docuware.dev.schema._public.services.platform.BatchUpdateIndexFieldsResult;
import com.docuware.dev.schema._public.services.platform.BatchUpdateProcess;
import com.docuware.dev.schema._public.services.platform.CheckOutResult;
import com.docuware.dev.schema._public.services.platform.CheckOutToFileSystemInfo;
import com.docuware.dev.schema._public.services.platform.Dialog;
import com.docuware.dev.schema._public.services.platform.DialogTypes;
import com.docuware.dev.schema._public.services.platform.Document;
import com.docuware.dev.schema._public.services.platform.DocumentActionInfo;
import com.docuware.dev.schema._public.services.platform.DocumentAnnotations;
import com.docuware.dev.schema._public.services.platform.DocumentAnnotationsPlacement;
import com.docuware.dev.schema._public.services.platform.DocumentIndexFields;
import com.docuware.dev.schema._public.services.platform.DocumentLinks;
import com.docuware.dev.schema._public.services.platform.DocumentsQueryResult;
import com.docuware.dev.schema._public.services.platform.FileCabinet;
import com.docuware.dev.schema._public.services.platform.FileDownloadType;
import com.docuware.dev.schema._public.services.platform.Pages;
import com.docuware.dev.schema._public.services.platform.Rights;
import com.docuware.dev.schema._public.services.platform.SuggestionFields;
import com.docuware.dev.schema._public.services.platform.UpdateIndexFieldsInfo;
import com.docuware.dev.schema._public.services.platform.UserValidation;
import com.sun.jersey.api.client.AsyncWebResource;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.multipart.MultiPart;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

/**
 *
 * @author Patrick
 */
public class SchemaExtensions {

    /*
     public static Future<DeserializedHttpResponseGen<Document>> PutToProcessDocumentActionForDocumentAsync(ServiceConnection serviceConnection, System.Threading.CancellationToken cancellationToken, String fileCabinetId, Int32 docId, DocumentActionInfo data)
     {
     var parameters = new { fileCabinetId, docId };
     var uri = serviceConnection.CreateTemplateUri("processDocumentAction", parameters);
     return serviceConnection.Proxy.Send<Document, DocumentActionInfo>(cancellationToken, uri, System.Net.Http.HttpMethod.Put, "application/xml", data, "application/xml");
     }

     public static System.Threading.Tasks.Task<DocuWare.Services.Http.DeserializedHttpResponse<SequenceResult>> PostToRetrieveSequenceElementForSequenceResultAsync(this ServiceConnection serviceConnection, System.Threading.CancellationToken cancellationToken, String fileCabinetId, SequenceRequest data)
     {
     var parameters = new { fileCabinetId };
     var uri = serviceConnection.CreateTemplateUri("retrieveSequenceElement", parameters);
     return serviceConnection.Proxy.Send<SequenceResult, SequenceRequest>(cancellationToken, uri, System.Net.Http.HttpMethod.Post, "application/xml", data, "application/xml");
     }

     public static System.Threading.Tasks.Task<DocuWare.Services.Http.DeserializedHttpResponse<String>> PostToCreatePermanentUrlForStringAsync(this ServiceConnection serviceConnection, System.Threading.CancellationToken cancellationToken, System.Net.Http.FormUrlEncodedContent data, Boolean? clientSideChecksum = null)
     {
     var parameters = new { clientSideChecksum };
     var uri = serviceConnection.CreateTemplateUri("createPermanentUrl", parameters);
     return serviceConnection.Proxy.Send<String, System.Net.Http.FormUrlEncodedContent>(cancellationToken, uri, System.Net.Http.HttpMethod.Post, "application/x-www-form-urlencoded", data, "text/plain");
     }

     public static System.Threading.Tasks.Task<DocuWare.Services.Http.DeserializedHttpResponse<Dialog>> GetFromDialogForDialogAsync(this ServiceConnection serviceConnection, System.Threading.CancellationToken cancellationToken, String id, String fileCabinetId, DialogTypes[] dialogType = null)
     {
     var parameters = new { id, fileCabinetId, dialogType };
     var uri = serviceConnection.CreateTemplateUri("dialog", parameters);
     return serviceConnection.Proxy.Send<Dialog>(cancellationToken, uri, System.Net.Http.HttpMethod.Get, "application/xml");
     }

     public static System.Threading.Tasks.Task<DocuWare.Services.Http.DeserializedHttpResponse<BatchUpdateIndexFieldsResult>> PostToBatchDialogUpdateFieldsForBatchUpdateIndexFieldsResultAsync(this ServiceConnection serviceConnection, System.Threading.CancellationToken cancellationToken, String fileCabinetId, String id, BatchUpdateProcess data, String[] fields = null, String[] sortOrder = null)
     {
     var parameters = new { fileCabinetId, id, fields, sortOrder };
     var uri = serviceConnection.CreateTemplateUri("batchDialogUpdateFields", parameters);
     return serviceConnection.Proxy.Send<BatchUpdateIndexFieldsResult, BatchUpdateProcess>(cancellationToken, uri, System.Net.Http.HttpMethod.Post, "application/xml", data, "application/xml");
     }

     public static System.Threading.Tasks.Task<DocuWare.Services.Http.DeserializedHttpResponse<String>> DeleteFromDocumentDeleteForStringAsync(this ServiceConnection serviceConnection, System.Threading.CancellationToken cancellationToken, Int32 id, String fileCabinetId)
     {
     var parameters = new { id, fileCabinetId };
     var uri = serviceConnection.CreateTemplateUri("documentDelete", parameters);
     return serviceConnection.Proxy.Send<String>(cancellationToken, uri, System.Net.Http.HttpMethod.Delete, "text/plain");
     }

     public static System.Threading.Tasks.Task<DocuWare.Services.Http.DeserializedHttpResponse<Document>> GetFromDocumentForDocumentAsync(this ServiceConnection serviceConnection, System.Threading.CancellationToken cancellationToken, Int32 id, String fileCabinetId)
     {
     var parameters = new { id, fileCabinetId };
     var uri = serviceConnection.CreateTemplateUri("document", parameters);
     return serviceConnection.Proxy.Send<Document>(cancellationToken, uri, System.Net.Http.HttpMethod.Get, "application/xml");
     }

     public static System.Threading.Tasks.Task<DocuWare.Services.Http.DeserializedHttpResponse<Document>> PostToDocumentAppendFilesForDocumentAsync(this ServiceConnection serviceConnection, System.Threading.CancellationToken cancellationToken, Int32 id, String fileCabinetId, System.Net.Http.MultipartFormDataContent data)
     {
     var parameters = new { id, fileCabinetId };
     var uri = serviceConnection.CreateTemplateUri("documentAppendFiles", parameters);
     return serviceConnection.Proxy.Send<Document, System.Net.Http.MultipartFormDataContent>(cancellationToken, uri, System.Net.Http.HttpMethod.Post, "multipart/form-data", data, "application/xml");
     }

     public static System.Threading.Tasks.Task<DocuWare.Services.Http.DeserializedHttpResponse<DocumentsQueryResult>> GetFromDocumentsForDocumentsQueryResultAsync(this ServiceConnection serviceConnection, System.Threading.CancellationToken cancellationToken, String fileCabinetId, String q = null, String[] fields = null, String[] sortOrder = null, Int32? start = null, Int32? msStart = null, Int32? count = null, String format = null, Boolean? includeSuggestions = null)
     {
     var parameters = new { fileCabinetId, q, fields, sortOrder, start, msStart, count, format, includeSuggestions };
     var uri = serviceConnection.CreateTemplateUri("documents", parameters);
     return serviceConnection.Proxy.Send<DocumentsQueryResult>(cancellationToken, uri, System.Net.Http.HttpMethod.Get, "application/xml");
     }

     public static System.Threading.Tasks.Task<DocuWare.Services.Http.DeserializedHttpResponse<Document>> PostToUploadDocumentForDocumentAsync(this ServiceConnection serviceConnection, System.Threading.CancellationToken cancellationToken, String fileCabinetId, Document data, Boolean? processTextshot = null, Boolean? imageProcessing = null, String redirect = null, String storeDialogId = null, Boolean? checkFileNameForCheckinInfo = null)
     {
     var parameters = new { fileCabinetId, processTextshot, imageProcessing, redirect, storeDialogId, checkFileNameForCheckinInfo };
     var uri = serviceConnection.CreateTemplateUri("uploadDocument", parameters);
     return serviceConnection.Proxy.Send<Document, Document>(cancellationToken, uri, System.Net.Http.HttpMethod.Post, "application/xml", data, "application/xml");
     }

     public static System.Threading.Tasks.Task<DocuWare.Services.Http.DeserializedHttpResponse<Document>> PostToUploadDocumentForDocumentAsync(this ServiceConnection serviceConnection, System.Threading.CancellationToken cancellationToken, String fileCabinetId, Stream data, Boolean? processTextshot = null, Boolean? imageProcessing = null, String redirect = null, String storeDialogId = null, Boolean? checkFileNameForCheckinInfo = null)
     {
     var parameters = new { fileCabinetId, processTextshot, imageProcessing, redirect, storeDialogId, checkFileNameForCheckinInfo };
     var uri = serviceConnection.CreateTemplateUri("uploadDocument", parameters);
     *///      return serviceConnection.Proxy.Send<Document, Stream>(cancellationToken, uri, System.Net.Http.HttpMethod.Post, "*/*", data, "application/xml");
    /*    }

     public static System.Threading.Tasks.Task<DocuWare.Services.Http.DeserializedHttpResponse<DocumentIndexFields>> GetFromDocumentIndexFieldsForDocumentIndexFieldsAsync(this ServiceConnection serviceConnection, System.Threading.CancellationToken cancellationToken, Int32 id, String fileCabinetId)
     {
     var parameters = new { id, fileCabinetId };
     var uri = serviceConnection.CreateTemplateUri("documentIndexFields", parameters);
     return serviceConnection.Proxy.Send<DocumentIndexFields>(cancellationToken, uri, System.Net.Http.HttpMethod.Get, "application/xml");
     }

     public static System.Threading.Tasks.Task<DocuWare.Services.Http.DeserializedHttpResponse<DocumentIndexFields>> PutToDocumentIndexFieldsForDocumentIndexFieldsAsync(this ServiceConnection serviceConnection, System.Threading.CancellationToken cancellationToken, Int32 id, String fileCabinetId, DocumentIndexFields data)
     {
     var parameters = new { id, fileCabinetId };
     var uri = serviceConnection.CreateTemplateUri("documentIndexFields", parameters);
     return serviceConnection.Proxy.Send<DocumentIndexFields, DocumentIndexFields>(cancellationToken, uri, System.Net.Http.HttpMethod.Put, "application/xml", data, "application/xml");
     }

     public static System.Threading.Tasks.Task<DocuWare.Services.Http.DeserializedHttpResponse<DocumentIndexFields>> PutToDocumentIndexFieldsForDocumentIndexFieldsAsync(this ServiceConnection serviceConnection, System.Threading.CancellationToken cancellationToken, Int32 id, String fileCabinetId, UpdateIndexFieldsInfo data)
     {
     var parameters = new { id, fileCabinetId };
     var uri = serviceConnection.CreateTemplateUri("documentIndexFields", parameters);
     return serviceConnection.Proxy.Send<DocumentIndexFields, UpdateIndexFieldsInfo>(cancellationToken, uri, System.Net.Http.HttpMethod.Put, "application/xml", data, "application/xml");
     }

     public static System.Threading.Tasks.Task<DocuWare.Services.Http.DeserializedHttpResponse<DocumentIndexFields>> PostToDocumentIndexFieldsForDocumentIndexFieldsAsync(this ServiceConnection serviceConnection, System.Threading.CancellationToken cancellationToken, Int32 id, String fileCabinetId, DocumentIndexFields data)
     {
     var parameters = new { id, fileCabinetId };
     var uri = serviceConnection.CreateTemplateUri("documentIndexFields", parameters);
     return serviceConnection.Proxy.Send<DocumentIndexFields, DocumentIndexFields>(cancellationToken, uri, System.Net.Http.HttpMethod.Post, "application/xml", data, "application/xml");
     }

     public static System.Threading.Tasks.Task<DocuWare.Services.Http.DeserializedHttpResponse<DocumentIndexFields>> PostToDocumentIndexFieldsForDocumentIndexFieldsAsync(this ServiceConnection serviceConnection, System.Threading.CancellationToken cancellationToken, Int32 id, String fileCabinetId, UpdateIndexFieldsInfo data)
     {
     var parameters = new { id, fileCabinetId };
     var uri = serviceConnection.CreateTemplateUri("documentIndexFields", parameters);
     return serviceConnection.Proxy.Send<DocumentIndexFields, UpdateIndexFieldsInfo>(cancellationToken, uri, System.Net.Http.HttpMethod.Post, "application/xml", data, "application/xml");
     }

     public static System.Threading.Tasks.Task<DocuWare.Services.Http.DeserializedHttpResponse<SuggestionFields>> GetFromIntellixSuggestionsForSuggestionFieldsAsync(this ServiceConnection serviceConnection, System.Threading.CancellationToken cancellationToken, Int32 id, String fileCabinetId, Boolean? normalizeCoordinates = null)
     {
     var parameters = new { id, fileCabinetId, normalizeCoordinates };
     var uri = serviceConnection.CreateTemplateUri("intellixSuggestions", parameters);
     return serviceConnection.Proxy.Send<SuggestionFields>(cancellationToken, uri, System.Net.Http.HttpMethod.Get, "application/xml");
     }

     public static System.Threading.Tasks.Task<DocuWare.Services.Http.DeserializedHttpResponse<Stream>> GetFromDocumentsFileDownloadForStreamAsync(this ServiceConnection serviceConnection, System.Threading.CancellationToken cancellationToken, Int32 id, String fileCabinetId, FileDownloadType? targetFileType = null, Boolean? keepAnnotations = null, Boolean? downloadFile = null, Boolean? autoPrint = null, Int32[] layers = null, Int32[] append = null)
     {
     var parameters = new { id, fileCabinetId, targetFileType, keepAnnotations, downloadFile, autoPrint, layers, append };
     var uri = serviceConnection.CreateTemplateUri("documentsFileDownload", parameters);
     *///        return serviceConnection.Proxy.Send<Stream>(cancellationToken, uri, System.Net.Http.HttpMethod.Get, "*/*");
   /*     }

     public static System.Threading.Tasks.Task<DocuWare.Services.Http.DeserializedHttpResponse<Rights>> PostToDocumentRightsForRightsAsync(this ServiceConnection serviceConnection, System.Threading.CancellationToken cancellationToken, Int32 id, String fileCabinetId, Rights data)
     {
     var parameters = new { id, fileCabinetId };
     var uri = serviceConnection.CreateTemplateUri("documentRights", parameters);
     return serviceConnection.Proxy.Send<Rights, Rights>(cancellationToken, uri, System.Net.Http.HttpMethod.Post, "application/xml", data, "application/xml");
     }

     public static System.Threading.Tasks.Task<DocuWare.Services.Http.DeserializedHttpResponse<DocumentLinks>> GetFromDocumentDocumentLinksForDocumentLinksAsync(this ServiceConnection serviceConnection, System.Threading.CancellationToken cancellationToken, Int32 id, String fileCabinetId)
     {
     var parameters = new { id, fileCabinetId };
     var uri = serviceConnection.CreateTemplateUri("documentDocumentLinks", parameters);
     return serviceConnection.Proxy.Send<DocumentLinks>(cancellationToken, uri, System.Net.Http.HttpMethod.Get, "application/xml");
     }

     public static System.Threading.Tasks.Task<DocuWare.Services.Http.DeserializedHttpResponse<Stream>> PostToCheckoutForStreamAsync(this ServiceConnection serviceConnection, System.Threading.CancellationToken cancellationToken, Int32 id, String fileCabinetId, CheckOutToFileSystemInfo data)
     {
     var parameters = new { id, fileCabinetId };
     var uri = serviceConnection.CreateTemplateUri("checkout", parameters);
     *///        return serviceConnection.Proxy.Send<Stream, CheckOutToFileSystemInfo>(cancellationToken, uri, System.Net.Http.HttpMethod.Post, "application/xml", data, "*/*");
  /*      }

     public static System.Threading.Tasks.Task<DocuWare.Services.Http.DeserializedHttpResponse<CheckOutResult>> PostToCheckoutDocumentForCheckOutResultAsync(this ServiceConnection serviceConnection, System.Threading.CancellationToken cancellationToken, Int32 id, String fileCabinetId, CheckOutToFileSystemInfo data)
     {
     var parameters = new { id, fileCabinetId };
     var uri = serviceConnection.CreateTemplateUri("checkoutDocument", parameters);
     return serviceConnection.Proxy.Send<CheckOutResult, CheckOutToFileSystemInfo>(cancellationToken, uri, System.Net.Http.HttpMethod.Post, "application/xml", data, "application/xml");
     }

     public static System.Threading.Tasks.Task<DocuWare.Services.Http.DeserializedHttpResponse<Document>> PostToCheckinForDocumentAsync(this ServiceConnection serviceConnection, System.Threading.CancellationToken cancellationToken, Int32 id, String fileCabinetId, System.Net.Http.MultipartFormDataContent data)
     {
     var parameters = new { id, fileCabinetId };
     var uri = serviceConnection.CreateTemplateUri("checkin", parameters);
     return serviceConnection.Proxy.Send<Document, System.Net.Http.MultipartFormDataContent>(cancellationToken, uri, System.Net.Http.HttpMethod.Post, "multipart/form-data", data, "application/xml");
     }

     public static System.Threading.Tasks.Task<DocuWare.Services.Http.DeserializedHttpResponse<DocumentAnnotations>> GetFromDocumentAnnotationsForDocumentAnnotationsAsync(this ServiceConnection serviceConnection, System.Threading.CancellationToken cancellationToken, Int32 id, String fileCabinetId)
     {
     var parameters = new { id, fileCabinetId };
     var uri = serviceConnection.CreateTemplateUri("documentAnnotations", parameters);
     return serviceConnection.Proxy.Send<DocumentAnnotations>(cancellationToken, uri, System.Net.Http.HttpMethod.Get, "application/xml");
     }

     public static System.Threading.Tasks.Task<DocuWare.Services.Http.DeserializedHttpResponse<DocumentAnnotations>> PostToDocumentAnnotationsForDocumentAnnotationsAsync(this ServiceConnection serviceConnection, System.Threading.CancellationToken cancellationToken, Int32 id, String fileCabinetId, DocumentAnnotationsPlacement data)
     {
     var parameters = new { id, fileCabinetId };
     var uri = serviceConnection.CreateTemplateUri("documentAnnotations", parameters);
     return serviceConnection.Proxy.Send<DocumentAnnotations, DocumentAnnotationsPlacement>(cancellationToken, uri, System.Net.Http.HttpMethod.Post, "application/xml", data, "application/xml");
     }

     public static System.Threading.Tasks.Task<DocuWare.Services.Http.DeserializedHttpResponse<FileCabinet>> GetFromFileCabinetForFileCabinetAsync(this ServiceConnection serviceConnection, System.Threading.CancellationToken cancellationToken, String fileCabinetId)
     {
     var parameters = new { fileCabinetId };
     var uri = serviceConnection.CreateTemplateUri("fileCabinet", parameters);
     return serviceConnection.Proxy.Send<FileCabinet>(cancellationToken, uri, System.Net.Http.HttpMethod.Get, "application/xml");
     }

     public static System.Threading.Tasks.Task<DocuWare.Services.Http.DeserializedHttpResponse<Pages>> GetFromPagesBlockForPagesAsync(this ServiceConnection serviceConnection, System.Threading.CancellationToken cancellationToken, String id, String fileCabinetId, Int32? start = null, Int32? count = null, Boolean? embedThumbnailData = null, String thumbnailSize = null, Boolean? thumbnailsOnly = null)
     {
     var parameters = new { id, fileCabinetId, start, count, embedThumbnailData, thumbnailSize, thumbnailsOnly };
     var uri = serviceConnection.CreateTemplateUri("pagesBlock", parameters);
     return serviceConnection.Proxy.Send<Pages>(cancellationToken, uri, System.Net.Http.HttpMethod.Get, "application/xml");
     }

     public static System.Threading.Tasks.Task<DocuWare.Services.Http.DeserializedHttpResponse<Annotation>> GetFromAnnotationForAnnotationAsync(this ServiceConnection serviceConnection, System.Threading.CancellationToken cancellationToken, String id, String fileCabinetId, Int32 page)
     {
     var parameters = new { id, fileCabinetId, page };
     var uri = serviceConnection.CreateTemplateUri("annotation", parameters);
     return serviceConnection.Proxy.Send<Annotation>(cancellationToken, uri, System.Net.Http.HttpMethod.Get, "application/xml");
     }

     public static System.Threading.Tasks.Task<DocuWare.Services.Http.DeserializedHttpResponse<Annotation>> PutToAnnotationForAnnotationAsync(this ServiceConnection serviceConnection, System.Threading.CancellationToken cancellationToken, String id, String fileCabinetId, Int32 page, Annotation data)
     {
     var parameters = new { id, fileCabinetId, page };
     var uri = serviceConnection.CreateTemplateUri("annotation", parameters);
     return serviceConnection.Proxy.Send<Annotation, Annotation>(cancellationToken, uri, System.Net.Http.HttpMethod.Put, "application/xml", data, "application/xml");
     }

     public static System.Threading.Tasks.Task<DocuWare.Services.Http.DeserializedHttpResponse<Annotation>> PutToAnnotationForAnnotationAsync(this ServiceConnection serviceConnection, System.Threading.CancellationToken cancellationToken, String id, String fileCabinetId, Int32 page, AnnotationsPlacement data)
     {
     var parameters = new { id, fileCabinetId, page };
     var uri = serviceConnection.CreateTemplateUri("annotation", parameters);
     return serviceConnection.Proxy.Send<Annotation, AnnotationsPlacement>(cancellationToken, uri, System.Net.Http.HttpMethod.Put, "application/xml", data, "application/xml");
     }

     public static System.Threading.Tasks.Task<DocuWare.Services.Http.DeserializedHttpResponse<Annotation>> PostToAnnotationForAnnotationAsync(this ServiceConnection serviceConnection, System.Threading.CancellationToken cancellationToken, String id, String fileCabinetId, Int32 page, Annotation data)
     {
     var parameters = new { id, fileCabinetId, page };
     var uri = serviceConnection.CreateTemplateUri("annotation", parameters);
     return serviceConnection.Proxy.Send<Annotation, Annotation>(cancellationToken, uri, System.Net.Http.HttpMethod.Post, "application/xml", data, "application/xml");
     }

     public static System.Threading.Tasks.Task<DocuWare.Services.Http.DeserializedHttpResponse<Annotation>> PostToAnnotationForAnnotationAsync(this ServiceConnection serviceConnection, System.Threading.CancellationToken cancellationToken, String id, String fileCabinetId, Int32 page, AnnotationsPlacement data)
     {
     var parameters = new { id, fileCabinetId, page };
     var uri = serviceConnection.CreateTemplateUri("annotation", parameters);
     return serviceConnection.Proxy.Send<Annotation, AnnotationsPlacement>(cancellationToken, uri, System.Net.Http.HttpMethod.Post, "application/xml", data, "application/xml");
     }

     public static System.Threading.Tasks.Task<DocuWare.Services.Http.DeserializedHttpResponse<XElement>> GetFromClientSetupDataForXElementAsync(this ServiceConnection serviceConnection, System.Threading.CancellationToken cancellationToken, String orgId, String baseAddress = null, String clientSetupVersion = null)
     {
     var parameters = new { orgId, baseAddress, clientSetupVersion };
     var uri = serviceConnection.CreateTemplateUri("clientSetupData", parameters);
     *///          return serviceConnection.Proxy.Send<XElement>(cancellationToken, uri, System.Net.Http.HttpMethod.Get, "*/*");
  /*      }

     public static System.Threading.Tasks.Task<DocuWare.Services.Http.DeserializedHttpResponse<String>> PostToValidateUserForStringAsync(this ServiceConnection serviceConnection, System.Threading.CancellationToken cancellationToken, String id, UserValidation data)
     {
     var parameters = new { id };
     var uri = serviceConnection.CreateTemplateUri("validateUser", parameters);
     return serviceConnection.Proxy.Send<String, UserValidation>(cancellationToken, uri, System.Net.Http.HttpMethod.Post, "application/xml", data, "text/plain");
     }

     public static System.Threading.Tasks.Task<DocuWare.Services.Http.DeserializedHttpResponse<SelectListInfo>> GetFromSelectListForSelectListInfoAsync(this ServiceConnection serviceConnection, System.Threading.CancellationToken cancellationToken, String id, String selectListId)
     {
     var parameters = new { id, selectListId };
     var uri = serviceConnection.CreateTemplateUri("selectList", parameters);
     return serviceConnection.Proxy.Send<SelectListInfo>(cancellationToken, uri, System.Net.Http.HttpMethod.Get, "application/xml");
     }
     }*/
}
