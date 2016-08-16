package com.docuware.dev.Extensions;

import com.docuware.dev.schema._public.services.platform.Annotation;
import com.docuware.dev.schema._public.services.platform.AnnotationsPlacement;
import com.docuware.dev.schema._public.services.platform.BatchUpdateIndexFieldsResult;
import com.docuware.dev.schema._public.services.platform.BatchUpdateProcess;
import com.docuware.dev.schema._public.services.platform.CheckInActionParameters;
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
import com.docuware.dev.schema._public.services.platform.Organization;
import com.docuware.dev.schema._public.services.platform.Organizations;
import com.docuware.dev.schema._public.services.platform.Pages;
import com.docuware.dev.schema._public.services.platform.Rights;
import com.docuware.dev.schema._public.services.platform.ServiceDescription;
import com.docuware.dev.schema._public.services.platform.SuggestionFields;
import com.docuware.dev.schema._public.services.platform.UpdateIndexFieldsInfo;
import com.docuware.dev.schema._public.services.platform.UserValidation;
import com.docuware.dev.settings.interop.DWProductTypes;
import com.sun.jersey.api.client.AsyncWebResource;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.client.apache.ApacheHttpClientHandler;
import com.sun.jersey.core.util.MultivaluedMapImpl;
import com.sun.jersey.multipart.MultiPart;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Patrick
 */
public class ServiceConnection {

    private ServiceDescription serviceDescription;
    private static PlatformClient client;

    public ServiceConnection(ServiceDescription serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public ServiceDescription getServiceDescription() {
        return serviceDescription;
    }

    public HttpClientProxy getProxy() {
        return serviceDescription.getProxy();
    }

    public void ReplaceHttpClient(ServiceConnection otherServiceConnection) {
        this.getProxy().ReplaceHttpClient(otherServiceConnection.getProxy().getHttpClient());
    }

    public void disconnect() {
        ClientResponse resp = MethodInvocation.get(serviceDescription, serviceDescription.getLinks(), "logout", ClientResponse.class);
        resp.close();
        client.getClient().getClientHandler().getHttpClient().getHttpConnectionManager().closeIdleConnections(1);
        client.getClient().destroy();

    }

    public Future disconnectAsync() {
        return CompletableFuture.runAsync(() -> {
            MethodInvocation.getAsync(serviceDescription, serviceDescription.getLinks(), "logout", null);
        });
    }

    public static ServiceConnection create(String uri, String userName, String password, String orgName) {
        MultivaluedMap<String, String> formData = new MultivaluedMapImpl();
        formData.add("UserName", userName);
        formData.add("Password", password);
        formData.add("Organization", orgName);
        return create(formData, uri, "login", null);
    }

    static public ServiceConnection create(String serviceUri, String userName, String password, String organization, DWProductTypes licenseType, ApacheHttpClientHandler httpClientHandler,
            String[] userAgent) {
        try {
            return createAsync(serviceUri, userName, password, organization, licenseType, httpClientHandler, userAgent).get();
        } catch (Exception e) {
            throw new RuntimeException(e.getLocalizedMessage());
        }
    }

    static public ServiceConnection createTrusted(String serviceUri, String impersonatedUser, String trustedUser, String password, String organization, DWProductTypes licenseType, ApacheHttpClientHandler httpClientHandler,
            String[] userAgent) {
        try {
            return createTrustedAsync(serviceUri, impersonatedUser, trustedUser, password, organization, licenseType, httpClientHandler, userAgent).get();
        } catch (Exception e) {
            throw new RuntimeException(e.getLocalizedMessage());
        }
    }

    static public ServiceConnection create(String serviceUri, String token, DWProductTypes licenseType, ApacheHttpClientHandler httpClientHandler,
            String[] userAgent) {
        try {
            return createAsync(serviceUri, token, licenseType, httpClientHandler, userAgent).get();
        } catch (Exception e) {
            throw new RuntimeException(e.getLocalizedMessage());
        }
    }

    static public ServiceConnection create(String serviceUri, ApacheHttpClientHandler httpClientHandler,
            String[] userAgent) {
        try {
            return createAsyncNoConnection(serviceUri, httpClientHandler, userAgent).get();
        } catch (Exception e) {
            throw new RuntimeException(e.getLocalizedMessage());
        }
    }

    public static Future<ServiceConnection> createAsync(String uri, String userName, String password, String orgName) {
        MultivaluedMap<String, String> formData = new MultivaluedMapImpl();
        formData.add("UserName", userName);
        formData.add("Password", password);
        formData.add("Organization", orgName);
        return createAsync(formData, uri, "login", null);
    }

    static public Future<ServiceConnection> createAsync(String serviceUri, String userName, String password, String organization, DWProductTypes licenseType, ApacheHttpClientHandler httpClientHandler,
            String[] userAgent) {
        MultivaluedMap<String, String> formData = new MultivaluedMapImpl();
        formData.add("UserName", userName);
        formData.add("Password", password);
        return createAsync(serviceUri, formData, ServiceConnectionLoginData.Create(organization, licenseType, httpClientHandler, userAgent));
    }

    static public Future<ServiceConnection> createAsync(String serviceUri, String userName, String password, ServiceConnectionLoginData serviceConnectionData) {
        MultivaluedMap<String, String> formData = new MultivaluedMapImpl();
        formData.add("UserName", userName);
        formData.add("Password", password);
        return createAsync(serviceUri, formData, serviceConnectionData);
    }

    static private Future<ServiceConnection> createAsync(String serviceUri, MultivaluedMap<String, String> formData, ServiceConnectionLoginData serviceConnectionData) {
        serviceConnectionData.AddLoginFormData(formData);
        return createAsync(serviceUri, formData, serviceConnectionData);
    }

    static public Future<ServiceConnection> createTrustedAsync(String serviceUri, String impersonatedUser, String trustedUser, String password, String organization, DWProductTypes licenseType, ApacheHttpClientHandler httpClientHandler,
            String[] userAgent) {
        MultivaluedMap<String, String> formData = new MultivaluedMapImpl();
        formData.add("ImpersonatedUser", impersonatedUser);
        formData.add("UserName", trustedUser);
        formData.add("Password", password);
        return createTrustedAsync(serviceUri, formData, ServiceConnectionLoginData.Create(organization, licenseType, httpClientHandler, userAgent));
    }

    static public Future<ServiceConnection> createTrustedAsync(String serviceUri, String impersonatedUser, String trustedUser, String password, ServiceConnectionLoginData serviceConnectionData) {
        MultivaluedMap<String, String> formData = new MultivaluedMapImpl();
        formData.add("ImpersonatedUser", impersonatedUser);
        formData.add("UserName", trustedUser);
        formData.add("Password", password);
        return createTrustedAsync(serviceUri, formData, serviceConnectionData);
    }

    static private Future<ServiceConnection> createTrustedAsync(String serviceUri, MultivaluedMap<String, String> formData, ServiceConnectionLoginData scld) {
        scld.AddLoginFormData(formData);
        return createAsync(formData, serviceUri, "trustedLogin", scld.getTransport());
    }

    static public Future<ServiceConnection> createAsync(String serviceUri, String token, DWProductTypes licenseType, ApacheHttpClientHandler httpClientHandler,
            String[] userAgent) {
        return createAsync(serviceUri, token, ServiceConnectionTokenLoginData.Create(licenseType, httpClientHandler, userAgent));
    }

    static public Future<ServiceConnection> createAsync(String serviceUri, String token, ServiceConnectionTokenLoginData serviceConnectionTokenLoginData) {
        MultivaluedMap<String, String> formData = new MultivaluedMapImpl();
        formData.add("Token", token);
        serviceConnectionTokenLoginData.AddLoginFormData(formData);
        return createAsync(formData, serviceUri, "tokenLogin", serviceConnectionTokenLoginData.getTransport());
    }

    static public Future<ServiceConnection> createAsyncNoConnection(String serviceUri, ApacheHttpClientHandler httpClientHandler, String[] userAgent) {
        ServiceConnectionTransportData sctd = new ServiceConnectionTransportData();
        sctd.setUserAgent(userAgent);
        sctd.setHttpClientHandler(httpClientHandler);
        return createAsyncNoConnection(serviceUri, sctd);
    }

    static private Future<ServiceConnection> createAsyncNoConnection(String serviceUri, ServiceConnectionTransportData serviceConnectionTransportData) {
        return CompletableFuture.<ServiceConnection>supplyAsync(() -> {
            client = new PlatformClient(serviceUri, serviceConnectionTransportData);
            LinkResolver resolver = client.getLinkResolver();

            ServiceDescription serviceDescription = client.getServiceDescription();
            return new ServiceConnection(serviceDescription);
        });
    }

    private static ServiceConnection create(MultivaluedMap<String, String> formData, String baseuri, String rel, ServiceConnectionTransportData sclbd) {
        client = new PlatformClient(baseuri, sclbd);
        LinkResolver resolver = client.getLinkResolver();
        ServiceDescription serviceDescription = client.getServiceDescription();
        // fire the request and get the response
        ClientResponse response = client.resource(resolver.getLink(serviceDescription.getLinks(), rel))
                .type("application/x-www-form-urlencoded").post(
                        ClientResponse.class, formData);

        // Check the HTTP status
        return new ServiceConnection(serviceDescription);
    }

    private static Future<ServiceConnection> createAsync(MultivaluedMap<String, String> formData, String uri, String rel, ServiceConnectionTransportData sclbd) {
        return CompletableFuture.<ServiceConnection>supplyAsync(() -> {
            return create(formData, uri, rel, sclbd);
        });
    }

    public Organizations getOrganizations() {
        return serviceDescription.getOrganizationsFromOrganizationsRelation();
    }

    public Future<DeserializedHttpResponseGen<Organizations>> getOrganizationsAsync() {
        return serviceDescription.getOrganizationsFromOrganizationsRelationAsync();
    }

    public FileCabinet getFileCabinet(String fileCabinetId) {
        // TODO: [CHW] Mach das ordentlich, wenn wir URL templates in der Platform haben.
        URI url = null;
        try {
            url = new URI(client.getLinkResolver().getBaseUri().toString() + "/FileCabinets/" + fileCabinetId);
        } catch (URISyntaxException ex) {
        }
        FileCabinet fc = client.resource(url).get(FileCabinet.class);
        fc.setProxy(serviceDescription.getProxy());
        return fc;
    }

    /// <summary>
    /// Gets all file cabinets.
    /// </summary>
    /// <param name="organizations">The organizations.</param>
    /// <returns>The list of all file cabinets.</returns>
    public List<FileCabinet> getAllFileCabinets(Iterable<Organization> organizations) {
        List<FileCabinet> fcs = new LinkedList();
        for (Organization o : organizations) {
            for (FileCabinet fc : o.getFileCabinetsFromFilecabinetsRelation().getFileCabinet()) {
                fcs.add(fc);
            }
        }
        return fcs;
    }

    /// <summary>
    /// Creates the template URI.
    /// </summary>
    /// <param name="serviceConnection">The service connection.</param>
    /// <param name="templateName">Name of the template.</param>
    /// <param name="paramaters">The paramaters.</param>
    /// <returns></returns>
    public String createTemplateUri(String templateName, Object paramaters) {
        return UriTemplateExtensions.CreateUrl(serviceDescription.getResources().getTemplate(), templateName, paramaters);
    }

    /// <summary>
    /// Creates the template URI.
    /// </summary>
    /// <param name="serviceConnection">The service connection.</param>
    /// <param name="templateName">Name of the template.</param>
    /// <param name="paramaters">The paramaters.</param>
    /// <returns></returns>
    public String createTemplateUri(String templateName, Map<String, Object> paramaters) {
        return UriTemplateExtensions.CreateUrl(serviceDescription.getResources().getTemplate(), templateName, paramaters);
    }

    /// <summary>
    /// Creates a permanent URL asynchronously.
    /// </summary>
    /// <param name="serviceConnection">The service connection.</param>
    /// <param name="url">The URL.</param>
    /// <returns>A task which creates a URL with an authenticated user information inside.</returns>
    /// <remarks>Use this function to take an URL and append some information about the currently authenticated user. The created URL can then be taken to access the ressource without needed to login.</remarks>
    public Future<DeserializedHttpResponseGen<String>> createPermanentUrlAsync(String url) {
        HashMap<String, String> parameters = new HashMap<String, String>();
        parameters.put("url", url);
        return CompletableFuture.<DeserializedHttpResponseGen<String>>supplyAsync(() -> {
            WebResource web = serviceDescription.getProxy().getHttpClient().resource(serviceDescription.getPermanentUrlRelationLink());
            ClientResponse resp = web.type(MediaType.APPLICATION_XML).accept(MediaType.APPLICATION_XML).post(ClientResponse.class, parameters);
            if (resp.getStatus() < 200 || resp.getStatus() > 399) {
                HttpClientRequestException e = HttpClientRequestException.create(resp);
                return new DeserializedHttpResponseGen(resp, e);
            } else {
                return new DeserializedHttpResponseGen<>(resp, resp.getEntity(String.class));
            }
        });
    }

    /// <summary>
    /// Creates a permanent URL.
    /// </summary>
    /// <param name="serviceConnection">The service connection.</param>
    /// <param name="url">The URL.</param>
    /// <returns>An URL with an authenticated user information inside.</returns>
    /// <remarks>Use this function to take a URL and append some information about the currently authenticated user. The created URL can then be taken to access the ressource without needed to login.</remarks>
    public String getPermanentUrl(String url) {
        try {
            return createPermanentUrlAsync(url).get().getContent();
        } catch (Exception ex) {
            throw new RuntimeException("Error on Resolving Async Process");
        }

    }

    public Future<DeserializedHttpResponseGen<Document>> putToProcessDocumentActionForDocumentAsync(String fileCabinetId, int docId, DocumentActionInfo data) {
        class Param {

            String fileCabinetId;
            int docId;

            public Param(String fid2, int did2) {
                fileCabinetId = fid2;
                docId = did2;
            }
        }
        Param parameters = new Param(fileCabinetId, docId);
        URI uri = buildUri(parameters, "processDocumentAction");
        try {
            uri = new URI(
                    this.getServiceDescription().getProxy().getBaseAddress().getScheme() + "://"
                    + this.getServiceDescription().getProxy().getBaseAddress().getHost()
                    + this.createTemplateUri("processDocumentAction", parameters));
            // /Docuware/Platform/FileCabinets/7eb33bf0-9801-4640-b80f-9a6948bb4a78/Operations/ProcessDocumentAction?docId=20
        } catch (URISyntaxException ex) {
            throw new RuntimeException(ex.getCause());
        }
        return LinkResolver.<Document, DocumentActionInfo>putAsync(this.getServiceDescription(), uri, "application/xml", "application/xml", Document.class, DocumentActionInfo.class, "DocumentActionInfo", data);
        /*return CompletableFuture.<DeserializedHttpResponseGen<Document>>supplyAsync(() -> {
         WebResource web = this.getServiceDescription().getProxy().getHttpClient().resource(uri);
         JAXBElement jax = new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentActionInfo"), DocumentActionInfo.class, null, data);
         ClientResponse resp = web.type("application/xml").accept("application/xml").put(ClientResponse.class, jax);
         return new DeserializedHttpResponseGen<Document>(resp, resp.getEntity(Document.class));
         });*/
    }


    /*  public Future<DeserializedHttpResponseGen<SequenceResult>> postToRetrieveSequenceElementForSequenceResultAsync(String fileCabinetId, SequenceRequest data)
     {
     class Param {
     String fileCabinetId;
     public Param(String fid2) {
     fileCabinetId = fid2;
     }
     }
     Param parameters = new Param(fileCabinetId);
     URI uri;
     try {
     uri =new URI(
     this.getServiceDescription().getProxy().getBaseAddress().getScheme() +"://" +
     this.getServiceDescription().getProxy().getBaseAddress().getHost()  +
     this.createTemplateUri("retrieveSequenceElement", parameters));
     } catch (URISyntaxException ex) {throw new RuntimeException(ex.getCause());   }
     return CompletableFuture.<DeserializedHttpResponseGen<SequenceResult>>supplyAsync(()->
     {  WebResource web= this.getServiceDescription().getProxy().getHttpClient().resource(uri);
     JAXBElement jax = new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "SequenceRequest"), SequenceRequest.class, null, data);
     ClientResponse resp= web.type("application/xml").accept("application/xml").post(ClientResponse.class, jax);
     return new DeserializedHttpResponseGen<SequenceResult>(resp, resp.getEntity(SequenceResult.class));
     });      
     }*/
    public Future<DeserializedHttpResponseGen<String>> postToCreatePermanentUrlForStringAsync(MultivaluedMap data, Boolean clientSideChecksum) {
        class Param {

            Boolean clientSideChecksum;

            public Param(Boolean fid2) {
                clientSideChecksum = fid2;
            }
        }
        Param parameters = new Param(clientSideChecksum);
        URI uri = buildUri(parameters, "createPermanentUrl");
        /*try {
            uri = new URI(
                    this.getServiceDescription().getProxy().getBaseAddress().getScheme() + "://"
                    + this.getServiceDescription().getProxy().getBaseAddress().getHost()
                    + this.createTemplateUri("createPermanentUrl", parameters));
        } catch (URISyntaxException ex) {
            throw new RuntimeException(ex.getCause());
        }*/
        return CompletableFuture.<DeserializedHttpResponseGen<String>>supplyAsync(() -> {
            WebResource web = this.getServiceDescription().getProxy().getHttpClient().resource(uri);
            ClientResponse resp = web.type("application/x-www-form-urlencoded").accept("text/plain").post(ClientResponse.class, data);
            if (resp.getStatus() < 200 || resp.getStatus() > 399) {
                HttpClientRequestException e = HttpClientRequestException.create(resp);
                return new DeserializedHttpResponseGen(resp, e);
            } else {
                return new DeserializedHttpResponseGen<String>(resp, resp.getEntity(String.class));
            }
        });
    }

    public Future<DeserializedHttpResponseGen<Dialog>> getFromDialogForDialogAsync(String id, String fileCabinetId, DialogTypes[] dialogType) {
        class Param {

            String id;
            String fileCabinetId;
            DialogTypes[] dialogType;

            public Param(String id2, String fid, DialogTypes[] dt) {
                id = id2;
                fileCabinetId = fid;
                dialogType = dt;
            }
        }
        Param parameters = new Param(id, fileCabinetId, dialogType);
        URI uri = buildUri(parameters, "dialog");
/*
        try {
            uri = new URI(
                    this.getServiceDescription().getProxy().getBaseAddress().getScheme() + "://"
                    + this.getServiceDescription().getProxy().getBaseAddress().getHost()
                    + this.createTemplateUri("dialog", parameters));
        } catch (URISyntaxException ex) {
            throw new RuntimeException(ex.getCause());
        }*/
        return LinkResolver.<Dialog>getAsync(this.getServiceDescription(), uri, "application/xml", Dialog.class);
        /*return CompletableFuture.<DeserializedHttpResponseGen<Dialog>>supplyAsync(() -> {
         WebResource web = this.getServiceDescription().getProxy().getHttpClient().resource(uri);
         ClientResponse resp = web.accept("application/xml").get(ClientResponse.class);
         return new DeserializedHttpResponseGen<Dialog>(resp, resp.getEntity(Dialog.class));
         });*/
    }

    public Future<DeserializedHttpResponseGen<BatchUpdateIndexFieldsResult>> postToBatchDialogUpdateFieldsForBatchUpdateIndexFieldsResultAsync(String fileCabinetId, String id, BatchUpdateProcess data, String[] fields, String[] sortOrder) {
        class Param {

            String id;
            String fileCabinetId;
            String[] fields;
            String[] sortOrder;

            public Param(String fid, String id2, String[] f, String[] so) {
                id = id2;
                fileCabinetId = fid;
                fields = f;
                sortOrder = so;
            }
        }
        Param parameters = new Param(fileCabinetId, id, fields, sortOrder);
        URI uri = buildUri(parameters, "batchDialogUpdateFields");
      /*  try {
            uri = new URI(
                    this.getServiceDescription().getProxy().getBaseAddress().getScheme() + "://"
                    + this.getServiceDescription().getProxy().getBaseAddress().getHost()
                    + this.createTemplateUri("batchDialogUpdateFields", parameters));
        } catch (URISyntaxException ex) {
            throw new RuntimeException(ex.getCause());
        }*/
        return LinkResolver.<BatchUpdateIndexFieldsResult, BatchUpdateProcess>postAsync(this.getServiceDescription(), uri, "application/xml", "application/xml", BatchUpdateIndexFieldsResult.class, BatchUpdateProcess.class, "BatchUpdateProcess", data);
        /*return CompletableFuture.<DeserializedHttpResponseGen<BatchUpdateIndexFieldsResult>>supplyAsync(() -> {
         WebResource web = this.getServiceDescription().getProxy().getHttpClient().resource(uri);
         JAXBElement jax = new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "BatchUpdateProcess"), BatchUpdateProcess.class, null, data);
         ClientResponse resp = web.type("application/xml").accept("application/xml").post(ClientResponse.class, jax);
         return new DeserializedHttpResponseGen<BatchUpdateIndexFieldsResult>(resp, resp.getEntity(BatchUpdateIndexFieldsResult.class));
         });*/
    }

    public Future<DeserializedHttpResponseGen<String>> deleteFromDocumentDeleteForStringAsync(int id, String fileCabinetId) {
        class Param {

            int id;
            String fileCabinetId;

            public Param(int id2, String fid) {
                id = id2;
                fileCabinetId = fid;
            }
        }
        Param parameters = new Param(id, fileCabinetId);
        URI uri = buildUri(parameters, "documentDelete");
        /*try {
            uri = new URI(
                    this.getServiceDescription().getProxy().getBaseAddress().getScheme() + "://"
                    + this.getServiceDescription().getProxy().getBaseAddress().getHost()
                    + this.createTemplateUri("documentDelete", parameters));
        } catch (URISyntaxException ex) {
            throw new RuntimeException(ex.getCause());
        }*/
        return LinkResolver.deleteAsync(this.getServiceDescription(), uri, "text/plain");
        /*return CompletableFuture.<DeserializedHttpResponseGen<String>>supplyAsync(() -> {
         WebResource web = this.getServiceDescription().getProxy().getHttpClient().resource(uri);
         ClientResponse resp = web.accept("text/plain").delete(ClientResponse.class);
         return new DeserializedHttpResponseGen<String>(resp, resp.getEntity(String.class));
         });*/
    }

    public Future<DeserializedHttpResponseGen<Document>> getFromDocumentForDocumentAsync(int id, String fileCabinetId) {
        class Param {

            int id;
            String fileCabinetId;

            public Param(int id2, String fid) {
                id = id2;
                fileCabinetId = fid;
            }
        }
        Param parameters = new Param(id, fileCabinetId);
        URI uri = buildUri(parameters, "document");
        /*try {
            uri = new URI(
                    this.getServiceDescription().getProxy().getBaseAddress().getScheme() + "://"
                    + this.getServiceDescription().getProxy().getBaseAddress().getHost()
                    + this.createTemplateUri("document", parameters));
        } catch (URISyntaxException ex) {
            throw new RuntimeException(ex.getCause());
        }*/
        return LinkResolver.<Document>getAsync(this.getServiceDescription(), uri, "application/xml", Document.class);
        /*return CompletableFuture.<DeserializedHttpResponseGen<Document>>supplyAsync(() -> {
         WebResource web = this.getServiceDescription().getProxy().getHttpClient().resource(uri);
         ClientResponse resp = web.accept("application/xml").get(ClientResponse.class);
         return new DeserializedHttpResponseGen<Document>(resp, resp.getEntity(Document.class));
         });*/
    }

    public Future<DeserializedHttpResponseGen<Document>> postToDocumentAppendFilesForDocumentAsync(int id, String fileCabinetId, MultiPart data) {
        class Param {

            int id;
            String fileCabinetId;

            public Param(int id2, String fid) {
                id = id2;
                fileCabinetId = fid;
            }
        }
        Param parameters = new Param(id, fileCabinetId);
        URI uri = buildUri(parameters, "documentAppendFiles");
       /* try {
            uri = new URI(
                    this.getServiceDescription().getProxy().getBaseAddress().getScheme() + "://"
                    + this.getServiceDescription().getProxy().getBaseAddress().getHost()
                    + this.createTemplateUri("documentAppendFiles", parameters));
        } catch (URISyntaxException ex) {
            throw new RuntimeException(ex.getCause());
        }*/
        return LinkResolver.<Document>postMultiPartAsync(this.getServiceDescription(), uri, "application/xml", Document.class, data);
        /*return CompletableFuture.<DeserializedHttpResponseGen<Document>>supplyAsync(() -> {
         WebResource web = this.getServiceDescription().getProxy().getHttpClient().resource(uri);
         ClientResponse resp = web.type(MediaType.MULTIPART_FORM_DATA).accept("application/xml").post(ClientResponse.class, data);
         return new DeserializedHttpResponseGen<Document>(resp, resp.getEntity(Document.class));
         });*/
    }

    public Future<DeserializedHttpResponseGen<DocumentsQueryResult>> getFromDocumentsForDocumentsQueryResultAsync(String fileCabinetId, String q, String[] fields, String[] sortOrder, Integer start, Integer msStart, Integer count, String format, Boolean includeSuggestions) {
        class Param {

            String fileCabinetId;
            String q;
            String[] fields;
            String[] sortOrder;
            Integer start;
            Integer msStart;
            Integer count;
            String format;
            Boolean includeSuggestions;

            public Param(String fileCabinetId, String q, String[] fields, String[] sortOrder, Integer start, Integer msStart, Integer count, String format, Boolean includeSuggestions) {
                this.fileCabinetId = fileCabinetId;
                this.q = q;
                this.fields = fields;
                this.sortOrder = sortOrder;
                this.start = start;
                this.msStart = msStart;
                this.count = count;
                this.format = format;
                this.includeSuggestions = includeSuggestions;
            }

        }
        Param parameters = new Param(fileCabinetId, q, fields, sortOrder, start, msStart, count, format, includeSuggestions);
        URI uri = buildUri(parameters, "documents");
        /*try {
            uri = new URI(
                    this.getServiceDescription().getProxy().getBaseAddress().getScheme() + "://"
                    + this.getServiceDescription().getProxy().getBaseAddress().getHost()
                    + this.createTemplateUri("documents", parameters));
        } catch (URISyntaxException ex) {
            throw new RuntimeException(ex.getCause());
        }*/
        return LinkResolver.<DocumentsQueryResult>getAsync(this.getServiceDescription(), uri, "application/xml", DocumentsQueryResult.class);
        /* return CompletableFuture.<DeserializedHttpResponseGen<DocumentsQueryResult>>supplyAsync(() -> {
         WebResource web = this.getServiceDescription().getProxy().getHttpClient().resource(uri);
         ClientResponse resp = web.accept("application/xml").get(ClientResponse.class);
         return new DeserializedHttpResponseGen<DocumentsQueryResult>(resp, resp.getEntity(DocumentsQueryResult.class));
         });*/
    }

    public Future<DeserializedHttpResponseGen<Document>> postToUploadDocumentForDocumentAsync(String fileCabinetId, Document data, Boolean processTextshot, Boolean imageProcessing, String redirect, String storeDialogId, Boolean checkFileNameForCheckinInfo) {
        class Param {

            String fileCabinetId;
            Boolean processTextshot;
            Boolean imageProcessing;
            String redirect;
            String storeDialogId;
            Boolean checkFileNameForCheckinInfo;

            public Param(String fileCabinetId, Boolean processTextshot, Boolean imageProcessing, String redirect, String storeDialogId, Boolean checkFileNameForCheckinInfo) {
                this.fileCabinetId = fileCabinetId;
                this.processTextshot = processTextshot;
                this.imageProcessing = imageProcessing;
                this.redirect = redirect;
                this.storeDialogId = storeDialogId;
                this.checkFileNameForCheckinInfo = checkFileNameForCheckinInfo;
            }

        }
        Param parameters = new Param(fileCabinetId, processTextshot, imageProcessing, redirect, storeDialogId, checkFileNameForCheckinInfo);
        URI uri = buildUri(parameters, "uploadDocument");
        /*try {
            uri = new URI(
                    this.getServiceDescription().getProxy().getBaseAddress().getScheme() + "://"
                    + this.getServiceDescription().getProxy().getBaseAddress().getHost()
                    + this.createTemplateUri("uploadDocument", parameters));
        } catch (URISyntaxException ex) {
            throw new RuntimeException(ex.getCause());
        }*/
        return LinkResolver.<Document, Document>postAsync(this.getServiceDescription(), uri, "application/xml", "application/xml", Document.class, Document.class, "Document", data);
        /*  return CompletableFuture.<DeserializedHttpResponseGen<Document>>supplyAsync(() -> {
         WebResource web = this.getServiceDescription().getProxy().getHttpClient().resource(uri);
         JAXBElement jax = new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "Document"), Document.class, null, data);
         ClientResponse resp = web.type("application/xml").accept("application/xml").post(ClientResponse.class, jax);
         return new DeserializedHttpResponseGen<Document>(resp, resp.getEntity(Document.class));
         });*/
    }

    public Future<DeserializedHttpResponseGen<Document>> postToUploadDocumentForDocumentAsync(String fileCabinetId, InputStream data, Boolean processTextshot, Boolean imageProcessing, String redirect, String storeDialogId, Boolean checkFileNameForCheckinInfo) {
        class Param {

            String fileCabinetId;
            Boolean processTextshot;
            Boolean imageProcessing;
            String redirect;
            String storeDialogId;
            Boolean CheckFileNameForCheckin;

            public Param(String fileCabinetId, Boolean processTextshot, Boolean imageProcessing, String redirect, String storeDialogId, Boolean CheckFileNameForCheckin) {
                this.fileCabinetId = fileCabinetId;
                this.processTextshot = processTextshot;
                this.imageProcessing = imageProcessing;
                this.redirect = redirect;
                this.storeDialogId = storeDialogId;
                this.CheckFileNameForCheckin = CheckFileNameForCheckin;
            }

        }
        Param parameters = new Param(fileCabinetId, processTextshot, imageProcessing, redirect, storeDialogId, checkFileNameForCheckinInfo);
        URI uri = buildUri(parameters, "uploadDocument");
        /*try {
            uri = new URI(
                    this.getServiceDescription().getProxy().getBaseAddress().getScheme() + "://"
                    + this.getServiceDescription().getProxy().getBaseAddress().getHost()
                    + this.createTemplateUri("uploadDocument", parameters));
        } catch (URISyntaxException ex) {
            throw new RuntimeException(ex.getCause());
        }*/
        return LinkResolver.<Document>postAsync(this.getServiceDescription(), uri, "*/*", "application/xml", Document.class, data);
        //return CompletableFuture.<DeserializedHttpResponseGen<Document>>supplyAsync(() -> {
        //    WebResource web = this.getServiceDescription().getProxy().getHttpClient().resource(uri);
        //    ClientResponse resp = web.type("*/*").accept("application/xml").post(ClientResponse.class, data);
        //    return new DeserializedHttpResponseGen<Document>(resp, resp.getEntity(Document.class));
        //});
    }

    public Future<DeserializedHttpResponseGen<DocumentIndexFields>> getFromDocumentIndexFieldsForDocumentIndexFieldsAsync(int id, String fileCabinetId) {
        class Param {

            int id;
            String fileCabinetId;

            public Param(int id, String fileCabinetId) {
                this.id = id;
                this.fileCabinetId = fileCabinetId;
            }
        }
        Param parameters = new Param(id, fileCabinetId);
        URI uri = buildUri(parameters, "documentIndexFields");
        /*try {
            uri = new URI(
                    this.getServiceDescription().getProxy().getBaseAddress().getScheme() + "://"
                    + this.getServiceDescription().getProxy().getBaseAddress().getHost()
                    + this.createTemplateUri("documentIndexFields", parameters));
        } catch (URISyntaxException ex) {
            throw new RuntimeException(ex.getCause());
        }*/
        return LinkResolver.<DocumentIndexFields>getAsync(this.getServiceDescription(), uri, "application/xmml", DocumentIndexFields.class);
        /*     return CompletableFuture.<DeserializedHttpResponseGen<DocumentIndexFields>>supplyAsync(() -> {
         WebResource web = this.getServiceDescription().getProxy().getHttpClient().resource(uri);
         ClientResponse resp = web.accept("application/xml").get(ClientResponse.class);
         return new DeserializedHttpResponseGen<DocumentIndexFields>(resp, resp.getEntity(DocumentIndexFields.class));
         });*/
    }

    public Future<DeserializedHttpResponseGen<DocumentIndexFields>> putToDocumentIndexFieldsForDocumentIndexFieldsAsync(int id, String fileCabinetId, DocumentIndexFields data) {
        class Param {

            int id;
            String fileCabinetId;

            public Param(int id, String fileCabinetId) {
                this.id = id;
                this.fileCabinetId = fileCabinetId;
            }
        }
        Param parameters = new Param(id, fileCabinetId);
        URI uri = buildUri(parameters, "documentIndexFields");
       /* try {
            uri = new URI(
                    this.getServiceDescription().getProxy().getBaseAddress().getScheme() + "://"
                    + this.getServiceDescription().getProxy().getBaseAddress().getHost()
                    + this.createTemplateUri("documentIndexFields", parameters));
        } catch (URISyntaxException ex) {
            throw new RuntimeException(ex.getCause());
        }*/
        return LinkResolver.<DocumentIndexFields, DocumentIndexFields>putAsync(this.getServiceDescription(), uri, "application/xml", "application/xml", DocumentIndexFields.class, DocumentIndexFields.class, "DocumentIndexFields", data);
        /*return CompletableFuture.<DeserializedHttpResponseGen<DocumentIndexFields>>supplyAsync(() -> {
         WebResource web = this.getServiceDescription().getProxy().getHttpClient().resource(uri);
         JAXBElement jax = new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentIndexFields"), DocumentIndexFields.class, null, data);
         ClientResponse resp = web.type("application/xml").accept("application/xml").put(ClientResponse.class, jax);
         return new DeserializedHttpResponseGen<DocumentIndexFields>(resp, resp.getEntity(DocumentIndexFields.class));
         });*/
    }

    public Future<DeserializedHttpResponseGen<DocumentIndexFields>> putToDocumentIndexFieldsForDocumentIndexFieldsAsync(int id, String fileCabinetId, UpdateIndexFieldsInfo data) {
        class Param {

            int id;
            String fileCabinetId;

            public Param(int id, String fileCabinetId) {
                this.id = id;
                this.fileCabinetId = fileCabinetId;
            }
        }
        Param parameters = new Param(id, fileCabinetId);
        URI uri = buildUri(parameters, "documentIndexFields");
        /*try {
            uri = new URI(
                    this.getServiceDescription().getProxy().getBaseAddress().getScheme() + "://"
                    + this.getServiceDescription().getProxy().getBaseAddress().getHost()
                    + this.createTemplateUri("documentIndexFields", parameters));
        } catch (URISyntaxException ex) {
            throw new RuntimeException(ex.getCause());
        }*/
        return LinkResolver.<DocumentIndexFields, UpdateIndexFieldsInfo>putAsync(this.getServiceDescription(), uri, "application/xml", "application/xml", DocumentIndexFields.class, UpdateIndexFieldsInfo.class, "UpdateIndexFieldsInfo", data);
        /* return CompletableFuture.<DeserializedHttpResponseGen<DocumentIndexFields>>supplyAsync(() -> {
         WebResource web = this.getServiceDescription().getProxy().getHttpClient().resource(uri);
         JAXBElement jax = new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "UpdateIndexFieldsInfo"), UpdateIndexFieldsInfo.class, null, data);
         ClientResponse resp = web.type("application/xml").accept("application/xml").put(ClientResponse.class, jax);
         return new DeserializedHttpResponseGen<DocumentIndexFields>(resp, resp.getEntity(DocumentIndexFields.class));
         });*/
    }

    public Future<DeserializedHttpResponseGen<DocumentIndexFields>> postToDocumentIndexFieldsForDocumentIndexFieldsAsync(int id, String fileCabinetId, DocumentIndexFields data) {
        class Param {

            int id;
            String fileCabinetId;

            public Param(int id, String fileCabinetId) {
                this.id = id;
                this.fileCabinetId = fileCabinetId;
            }
        }
        Param parameters = new Param(id, fileCabinetId);
        URI uri  = buildUri(parameters, "documentIndexFields");
        /*try {
            uri = new URI(
                    this.getServiceDescription().getProxy().getBaseAddress().getScheme() + "://"
                    + this.getServiceDescription().getProxy().getBaseAddress().getHost()
                    + this.createTemplateUri("documentIndexFields", parameters));
        } catch (URISyntaxException ex) {
            throw new RuntimeException(ex.getCause());
        }*/
        return LinkResolver.<DocumentIndexFields, DocumentIndexFields>postAsync(this.getServiceDescription(), uri, "application/xml", "application/xml", DocumentIndexFields.class, DocumentIndexFields.class, "DocumentIndexFields", data);
        /*return CompletableFuture.<DeserializedHttpResponseGen<DocumentIndexFields>>supplyAsync(() -> {
         WebResource web = this.getServiceDescription().getProxy().getHttpClient().resource(uri);
         JAXBElement jax = new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentIndexFields"), DocumentIndexFields.class, null, data);
         ClientResponse resp = web.type("application/xml").accept("application/xml").post(ClientResponse.class, jax);
         return new DeserializedHttpResponseGen<DocumentIndexFields>(resp, resp.getEntity(DocumentIndexFields.class));
         });*/
    }

    public Future<DeserializedHttpResponseGen<DocumentIndexFields>> postToDocumentIndexFieldsForDocumentIndexFieldsAsync(int id, String fileCabinetId, UpdateIndexFieldsInfo data) {
        class Param {

            int id;
            String fileCabinetId;

            public Param(int id, String fileCabinetId) {
                this.id = id;
                this.fileCabinetId = fileCabinetId;
            }
        }
        Param parameters = new Param(id, fileCabinetId);
        URI uri = buildUri(parameters, "documentIndexFields");
        /*try {
            uri = new URI(
                    this.getServiceDescription().getProxy().getBaseAddress().getScheme() + "://"
                    + this.getServiceDescription().getProxy().getBaseAddress().getHost()
                    + this.createTemplateUri("documentIndexFields", parameters));
        } catch (URISyntaxException ex) {
            throw new RuntimeException(ex.getCause());
        }*/
        return LinkResolver.<DocumentIndexFields, UpdateIndexFieldsInfo>postAsync(this.getServiceDescription(), uri, "application/xml", "application/xml", DocumentIndexFields.class, UpdateIndexFieldsInfo.class, "UpdateIndexFieldsInfo", data);
        /*return CompletableFuture.<DeserializedHttpResponseGen<DocumentIndexFields>>supplyAsync(() -> {
         WebResource web = this.getServiceDescription().getProxy().getHttpClient().resource(uri);
         JAXBElement jax = new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "UpdateIndexFieldsInfo"), UpdateIndexFieldsInfo.class, null, data);
         ClientResponse resp = web.type("application/xml").accept("application/xml").post(ClientResponse.class, jax);
         return new DeserializedHttpResponseGen<DocumentIndexFields>(resp, resp.getEntity(DocumentIndexFields.class));
         });*/
    }

    public Future<DeserializedHttpResponseGen<SuggestionFields>> getFromIntellixSuggestionsForSuggestionFieldsAsync(int id, String fileCabinetId, Boolean normalizeCoordinates) {
        class Param {

            int id;
            String fileCabinetId;
            Boolean normalizeCoordinates;

            public Param(int id, String fileCabinetId, Boolean normalizeCoordinates) {
                this.id = id;
                this.fileCabinetId = fileCabinetId;
                this.normalizeCoordinates = normalizeCoordinates;
            }

        }
        Param parameters = new Param(id, fileCabinetId, normalizeCoordinates);
        URI uri = buildUri(parameters, "intellixSuggestions");
       /* try {
            uri = new URI(
                    this.getServiceDescription().getProxy().getBaseAddress().getScheme() + "://"
                    + this.getServiceDescription().getProxy().getBaseAddress().getHost()
                    + this.createTemplateUri("intellixSuggestions", parameters));
        } catch (URISyntaxException ex) {
            throw new RuntimeException(ex.getCause());
        }*/
        return LinkResolver.<SuggestionFields>getAsync(this.getServiceDescription(), uri, "application/xml", SuggestionFields.class);
        /*        return CompletableFuture.<DeserializedHttpResponseGen<SuggestionFields>>supplyAsync(() -> {
         WebResource web = this.getServiceDescription().getProxy().getHttpClient().resource(uri);
         ClientResponse resp = web.accept("application/xml").get(ClientResponse.class);
         return new DeserializedHttpResponseGen<SuggestionFields>(resp, resp.getEntity(SuggestionFields.class));
         });*/
    }

    public Future<DeserializedHttpResponseGen<InputStream>> getFromDocumentsFileDownloadForStreamAsync(int id, String fileCabinetId, FileDownloadType targetFileType, Boolean keepAnnotations, Boolean downloadFile, Boolean autoPrint, int[] layers, int[] append) {
        class Param {

            int id;
            String fileCabinetId;
            FileDownloadType targetFileType;
            Boolean keepAnnotations;
            Boolean downloadFile;
            Boolean autoPrint;
            int[] layers;
            int[] append;

            public Param(int id, String fileCabinetId, FileDownloadType targetFileType, Boolean keepAnnotations, Boolean downloadFile, Boolean autoPrint, int[] layers, int[] append) {
                this.id = id;
                this.fileCabinetId = fileCabinetId;
                this.targetFileType = targetFileType;
                this.keepAnnotations = keepAnnotations;
                this.downloadFile = downloadFile;
                this.autoPrint = autoPrint;
                this.layers = layers;
                this.append = append;
            }

        }
        Param parameters = new Param(id, fileCabinetId, targetFileType, keepAnnotations, downloadFile, autoPrint, layers, append);
        URI uri = buildUri(parameters, "documentsFileDownload");
       /* try {
            uri = new URI(
                    this.getServiceDescription().getProxy().getBaseAddress().getScheme() + "://"
                    + this.getServiceDescription().getProxy().getBaseAddress().getHost()
                    + this.createTemplateUri("documentsFileDownload", parameters));
        } catch (URISyntaxException ex) {
            throw new RuntimeException(ex.getCause());
        }*/
        return LinkResolver.<InputStream>getAsync(this.getServiceDescription(), uri, "*/*", InputStream.class);
   //     return CompletableFuture.<DeserializedHttpResponseGen<InputStream>>supplyAsync(() -> {
        //       WebResource web = this.getServiceDescription().getProxy().getHttpClient().resource(uri);
        //     ClientResponse resp = web.accept("*/*").get(ClientResponse.class);
        //   return new DeserializedHttpResponseGen<InputStream>(resp, resp.getEntity(InputStream.class));
        //});
    }

    public Future<DeserializedHttpResponseGen<Rights>> postToDocumentRightsForRightsAsync(int id, String fileCabinetId, Rights data) {
        class Param {

            int id;
            String fileCabinetId;

            public Param(int id, String fileCabinetId) {
                this.id = id;
                this.fileCabinetId = fileCabinetId;
            }
        }
        Param parameters = new Param(id, fileCabinetId);
        URI uri = buildUri(parameters, "documentRights");
       /* try {
            uri = new URI(
                    this.getServiceDescription().getProxy().getBaseAddress().getScheme() + "://"
                    + this.getServiceDescription().getProxy().getBaseAddress().getHost()
                    + this.createTemplateUri("documentRights", parameters));
        } catch (URISyntaxException ex) {
            throw new RuntimeException(ex.getCause());
        }*/
        return LinkResolver.<Rights, Rights>postAsync(this.getServiceDescription(), uri, "application/xml", "application/xml", Rights.class, Rights.class, "Rights", data);
        /*return CompletableFuture.<DeserializedHttpResponseGen<Rights>>supplyAsync(() -> {
         WebResource web = this.getServiceDescription().getProxy().getHttpClient().resource(uri);
         JAXBElement jax = new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "Rights"), Rights.class, null, data);
         ClientResponse resp = web.type("application/xml").accept("application/xml").post(ClientResponse.class, jax);
         return new DeserializedHttpResponseGen<Rights>(resp, resp.getEntity(Rights.class));
         });*/
    }

    public Future<DeserializedHttpResponseGen<DocumentLinks>> getFromDocumentDocumentLinksForDocumentLinksAsync(int id, String fileCabinetId) {
        class Param {

            int id;
            String fileCabinetId;

            public Param(int id, String fileCabinetId) {
                this.id = id;
                this.fileCabinetId = fileCabinetId;
            }
        }
        Param parameters = new Param(id, fileCabinetId);
        URI uri  = buildUri(parameters, "documentDocumentLinks");
        /*try {
            uri = new URI(
                    this.getServiceDescription().getProxy().getBaseAddress().getScheme() + "://"
                    + this.getServiceDescription().getProxy().getBaseAddress().getHost()
                    + this.createTemplateUri("documentDocumentLinks", parameters));
        } catch (URISyntaxException ex) {
            throw new RuntimeException(ex.getCause());
        }*/
        return LinkResolver.<DocumentLinks>getAsync(this.getServiceDescription(), uri, "application/xml", DocumentLinks.class);
        /* return CompletableFuture.<DeserializedHttpResponseGen<DocumentLinks>>supplyAsync(() -> {
         WebResource web = this.getServiceDescription().getProxy().getHttpClient().resource(uri);
         ClientResponse resp = web.accept("application/xml").get(ClientResponse.class);
         return new DeserializedHttpResponseGen<DocumentLinks>(resp, resp.getEntity(DocumentLinks.class));
         });*/
    }

    public Future<DeserializedHttpResponseGen<InputStream>> postToCheckoutForStreamAsync(int id, String fileCabinetId, CheckOutToFileSystemInfo data) {
        class Param {

            int id;
            String fileCabinetId;

            public Param(int id, String fileCabinetId) {
                this.id = id;
                this.fileCabinetId = fileCabinetId;
            }
        }
        Param parameters = new Param(id, fileCabinetId);
        URI uri = buildUri(parameters, "checkout");;
        /*try {
            uri = new URI(
                    this.getServiceDescription().getProxy().getBaseAddress().getScheme() + "://"
                    + this.getServiceDescription().getProxy().getBaseAddress().getHost()
                    + this.createTemplateUri("checkout", parameters));
        } catch (URISyntaxException ex) {
            throw new RuntimeException(ex.getCause());
        }*/
        return LinkResolver.<InputStream, CheckOutToFileSystemInfo>postAsync(this.getServiceDescription(), uri, "application/xml", "*/*", InputStream.class, CheckOutToFileSystemInfo.class, "CheckOutToFileSystemInfo", data);
       // return CompletableFuture.<DeserializedHttpResponseGen<InputStream>>supplyAsync(() -> {
        //   WebResource web = this.getServiceDescription().getProxy().getHttpClient().resource(uri);
        // JAXBElement jax = new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "CheckOutToFileSystemInfo"), CheckOutToFileSystemInfo.class, null, data);
        //  ClientResponse resp = web.type("application/xml").accept("*/*").post(ClientResponse.class, jax);
        //return new DeserializedHttpResponseGen<InputStream>(resp, resp.getEntity(InputStream.class));
        //});
    }

    public Future<DeserializedHttpResponseGen<CheckOutResult>> postToCheckoutDocumentForCheckOutResultAsync(int id, String fileCabinetId, CheckOutToFileSystemInfo data) {
        class Param {

            int id;
            String fileCabinetId;

            public Param(int id, String fileCabinetId) {
                this.id = id;
                this.fileCabinetId = fileCabinetId;
            }
        }
        Param parameters = new Param(id, fileCabinetId);
        URI uri = buildUri(parameters, "checkoutDocument");
        /*try {
            uri = new URI(
                    this.getServiceDescription().getProxy().getBaseAddress().getScheme() + "://"
                    + this.getServiceDescription().getProxy().getBaseAddress().getHost()
                    + this.createTemplateUri("checkoutDocument", parameters));
        } catch (URISyntaxException ex) {
            throw new RuntimeException(ex.getCause());
        }*/
        return LinkResolver.<CheckOutResult, CheckOutToFileSystemInfo>postAsync(this.getServiceDescription(), uri, "application/xml", "application/xml", CheckOutResult.class, CheckOutToFileSystemInfo.class, "CheckOutToFileSystemInfo", data);
        /* return CompletableFuture.<DeserializedHttpResponseGen<CheckOutResult>>supplyAsync(() -> {
         WebResource web = this.getServiceDescription().getProxy().getHttpClient().resource(uri);
         JAXBElement jax = new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "CheckOutToFileSystemInfo"), CheckOutToFileSystemInfo.class, null, data);
         ClientResponse resp = web.type("application/xml").accept("application/xml").post(ClientResponse.class, jax);
         return new DeserializedHttpResponseGen<CheckOutResult>(resp, resp.getEntity(CheckOutResult.class));
         });*/
    }

    public Future<DeserializedHttpResponseGen<Document>> postToCheckinForDocumentAsync(int id, String fileCabinetId, MultiPart data) {
        class Param {

            int id;
            String fileCabinetId;

            public Param(int id, String fileCabinetId) {
                this.id = id;
                this.fileCabinetId = fileCabinetId;
            }
        }
        Param parameters = new Param(id, fileCabinetId);
        URI uri= buildUri(parameters, "checkin");
        /*try {
            uri = new URI(
                    this.getServiceDescription().getProxy().getBaseAddress().getScheme() + "://"
                    + this.getServiceDescription().getProxy().getBaseAddress().getHost()
                    + this.createTemplateUri("checkin", parameters));
        } catch (URISyntaxException ex) {
            throw new RuntimeException(ex.getCause());
        }*/
        return LinkResolver.<Document>postMultiPartAsync(this.getServiceDescription(), uri, "application/xml", Document.class, data);
        /*   return CompletableFuture.<DeserializedHttpResponseGen<Document>>supplyAsync(() -> {
         WebResource web = this.getServiceDescription().getProxy().getHttpClient().resource(uri);
         ClientResponse resp = web.type(MediaType.MULTIPART_FORM_DATA).accept("application/xml").post(ClientResponse.class, data);
         return new DeserializedHttpResponseGen<Document>(resp, resp.getEntity(Document.class));
         });*/
    }

    public Future<DeserializedHttpResponseGen<DocumentAnnotations>> getFromDocumentAnnotationsForDocumentAnnotationsAsync(int id, String fileCabinetId) {
        class Param {

            int id;
            String fileCabinetId;

            public Param(int id, String fileCabinetId) {
                this.id = id;
                this.fileCabinetId = fileCabinetId;
            }
        }
        Param parameters = new Param(id, fileCabinetId);
        URI uri = buildUri(parameters, "documentAnnotations");
        /*try {
            uri = new URI(
                    this.getServiceDescription().getProxy().getBaseAddress().getScheme() + "://"
                    + this.getServiceDescription().getProxy().getBaseAddress().getHost()
                    + this.createTemplateUri("documentAnnotations", parameters));
        } catch (URISyntaxException ex) {
            throw new RuntimeException(ex.getCause());
        }*/
        return LinkResolver.<DocumentAnnotations>getAsync(this.getServiceDescription(), uri, "application/xml", DocumentAnnotations.class);
        /* return CompletableFuture.<DeserializedHttpResponseGen<DocumentAnnotations>>supplyAsync(() -> {
         WebResource web = this.getServiceDescription().getProxy().getHttpClient().resource(uri);
         ClientResponse resp = web.accept("application/xml").get(ClientResponse.class);
         return new DeserializedHttpResponseGen<DocumentAnnotations>(resp, resp.getEntity(DocumentAnnotations.class));
         });*/
    }

    public Future<DeserializedHttpResponseGen<DocumentAnnotations>> postToDocumentAnnotationsForDocumentAnnotationsAsync(int id, String fileCabinetId, DocumentAnnotationsPlacement data) {
        class Param {

            int id;
            String fileCabinetId;

            public Param(int id, String fileCabinetId) {
                this.id = id;
                this.fileCabinetId = fileCabinetId;
            }
        }
        Param parameters = new Param(id, fileCabinetId);
        URI uri = buildUri(parameters, "documentAnnotations");
        /*try {
            uri = new URI(
                    this.getServiceDescription().getProxy().getBaseAddress().getScheme() + "://"
                    + this.getServiceDescription().getProxy().getBaseAddress().getHost()
                    + this.createTemplateUri("documentAnnotations", parameters));
        } catch (URISyntaxException ex) {
            throw new RuntimeException(ex.getCause());
        }*/
        return LinkResolver.<DocumentAnnotations, DocumentAnnotationsPlacement>postAsync(this.getServiceDescription(), uri, "application/xml", "application/xml", DocumentAnnotations.class, DocumentAnnotationsPlacement.class, "DocumentAnnotationsPlacement", data);
        /* return CompletableFuture.<DeserializedHttpResponseGen<DocumentAnnotations>>supplyAsync(() -> {
         WebResource web = this.getServiceDescription().getProxy().getHttpClient().resource(uri);
         JAXBElement jax = new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentAnnotationsPlacement"), DocumentAnnotationsPlacement.class, null, data);
         ClientResponse resp = web.type("application/xml").accept("application/xml").post(ClientResponse.class, jax);
         return new DeserializedHttpResponseGen<DocumentAnnotations>(resp, resp.getEntity(DocumentAnnotations.class));
         });*/
    }

    public Future<DeserializedHttpResponseGen<FileCabinet>> getFromFileCabinetForFileCabinetAsync(String fileCabinetId) {
        class Param {

            String fileCabinetId;

            public Param(String fileCabinetId) {
                this.fileCabinetId = fileCabinetId;
            }
        }
        Param parameters = new Param(fileCabinetId);
        URI uri  = buildUri(parameters, "fileCabinet");;
       /* try {
            uri = new URI(
                    this.getServiceDescription().getProxy().getBaseAddress().getScheme() + "://"
                    + this.getServiceDescription().getProxy().getBaseAddress().getHost()
                    + this.createTemplateUri("fileCabinet", parameters));
        } catch (URISyntaxException ex) {
            throw new RuntimeException(ex.getCause());
        }*/
        return LinkResolver.<FileCabinet>getAsync(this.getServiceDescription(), uri, "application/xml", FileCabinet.class);
        /*   return CompletableFuture.<DeserializedHttpResponseGen<FileCabinet>>supplyAsync(() -> {
         WebResource web = this.getServiceDescription().getProxy().getHttpClient().resource(uri);
         ClientResponse resp = web.accept("application/xml").get(ClientResponse.class);
         return new DeserializedHttpResponseGen<FileCabinet>(resp, resp.getEntity(FileCabinet.class));
         });*/
    }

    public Future<DeserializedHttpResponseGen<Pages>> getFromPagesBlockForPagesAsync(String id, String fileCabinetId, Integer start, Integer count, Boolean embedThumbnailData, String thumbnailSize, Boolean thumbnailsOnly) {
        class Param {

            String id;
            String fileCabinetId;
            Integer start;
            Integer count;
            Boolean embedThumbnailData;
            String thumbnailSize;
            Boolean thumbnailsOnly;

            public Param(String id, String fileCabinetId, Integer start, Integer count, Boolean embedThumbnailData, String thumbnailSize, Boolean thumbnailsOnly) {
                this.id = id;
                this.fileCabinetId = fileCabinetId;
                this.start = start;
                this.count = count;
                this.embedThumbnailData = embedThumbnailData;
                this.thumbnailSize = thumbnailSize;
                this.thumbnailsOnly = thumbnailsOnly;
            }

        }
        Param parameters = new Param(id, fileCabinetId, start, count, embedThumbnailData, thumbnailSize, thumbnailsOnly);
        URI uri= buildUri(parameters, "pagesBlock");
       /* try {
            uri = new URI(
                    this.getServiceDescription().getProxy().getBaseAddress().getScheme() + "://"
                    + this.getServiceDescription().getProxy().getBaseAddress().getHost()
                    + this.createTemplateUri("pagesBlock", parameters));
        } catch (URISyntaxException ex) {
            throw new RuntimeException(ex.getCause());
        }*/
        return LinkResolver.<Pages>getAsync(this.getServiceDescription(), uri, "application/xml", Pages.class);
        /*return CompletableFuture.<DeserializedHttpResponseGen<Pages>>supplyAsync(() -> {
         WebResource web = this.getServiceDescription().getProxy().getHttpClient().resource(uri);
         ClientResponse resp = web.accept("application/xml").get(ClientResponse.class);
         return new DeserializedHttpResponseGen<Pages>(resp, resp.getEntity(Pages.class));
         });*/
    }

    public Future<DeserializedHttpResponseGen<Annotation>> getFromAnnotationForAnnotationAsync(String id, String fileCabinetId, int page) {
        class Param {

            String id;
            String fileCabinetId;
            int page;

            public Param(String id, String fileCabinetId, int page) {
                this.id = id;
                this.fileCabinetId = fileCabinetId;
                this.page = page;
            }
        }
        Param parameters = new Param(id, fileCabinetId, page);
        URI uri = buildUri(parameters, "annotation");
        /*try {
            uri = new URI(
                    this.getServiceDescription().getProxy().getBaseAddress().getScheme() + "://"
                    + this.getServiceDescription().getProxy().getBaseAddress().getHost()
                    + this.createTemplateUri("annotation", parameters));
        } catch (URISyntaxException ex) {
            throw new RuntimeException(ex.getCause());
        }*/
        return LinkResolver.<Annotation>getAsync(this.getServiceDescription(), uri, "application/xml", Annotation.class);
        /*return CompletableFuture.<DeserializedHttpResponseGen<Annotation>>supplyAsync(() -> {
         WebResource web = this.getServiceDescription().getProxy().getHttpClient().resource(uri);
         ClientResponse resp = web.accept("application/xml").get(ClientResponse.class);
         return new DeserializedHttpResponseGen<Annotation>(resp, resp.getEntity(Annotation.class));
         });*/
    }

    public Future<DeserializedHttpResponseGen<Annotation>> putToAnnotationForAnnotationAsync(String id, String fileCabinetId, int page, Annotation data) {
        class Param {

            String id;
            String fileCabinetId;
            int page;

            public Param(String id, String fileCabinetId, int page) {
                this.id = id;
                this.fileCabinetId = fileCabinetId;
                this.page = page;
            }
        }
        Param parameters = new Param(id, fileCabinetId, page);
        URI uri = buildUri(parameters, "annotation");
        /*try {
            uri = new URI(
                    this.getServiceDescription().getProxy().getBaseAddress().getScheme() + "://"
                    + this.getServiceDescription().getProxy().getBaseAddress().getHost()
                    + this.createTemplateUri("annotation", parameters));
        } catch (URISyntaxException ex) {
            throw new RuntimeException(ex.getCause());
        }*/
        return LinkResolver.<Annotation, Annotation>putAsync(this.getServiceDescription(), uri, "application/xml", "application/xml", Annotation.class, Annotation.class, "Annotation", data);
        /*return CompletableFuture.<DeserializedHttpResponseGen<Annotation>>supplyAsync(() -> {
         WebResource web = this.getServiceDescription().getProxy().getHttpClient().resource(uri);
         JAXBElement jax = new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "Annotation"), Annotation.class, null, data);
         ClientResponse resp = web.type("application/xml").accept("application/xml").put(ClientResponse.class, jax);
         return new DeserializedHttpResponseGen<Annotation>(resp, resp.getEntity(Annotation.class));
         });*/
    }

    public Future<DeserializedHttpResponseGen<Annotation>> putToAnnotationForAnnotationAsync(String id, String fileCabinetId, int page, AnnotationsPlacement data) {
        class Param {

            String id;
            String fileCabinetId;
            int page;

            public Param(String id, String fileCabinetId, int page) {
                this.id = id;
                this.fileCabinetId = fileCabinetId;
                this.page = page;
            }
        }
        Param parameters = new Param(id, fileCabinetId, page);
        URI uri = buildUri(parameters, "annotation");
        /*try {
            uri = new URI(
                    this.getServiceDescription().getProxy().getBaseAddress().getScheme() + "://"
                    + this.getServiceDescription().getProxy().getBaseAddress().getHost()
                    + this.createTemplateUri("annotation", parameters));
        } catch (URISyntaxException ex) {
            throw new RuntimeException(ex.getCause());
        }*/
        return LinkResolver.<Annotation, AnnotationsPlacement>putAsync(this.getServiceDescription(), uri, "application/xml", "application/xml", Annotation.class, AnnotationsPlacement.class, "AnnotationsPlacement", data);
        /*return CompletableFuture.<DeserializedHttpResponseGen<Annotation>>supplyAsync(() -> {
         WebResource web = this.getServiceDescription().getProxy().getHttpClient().resource(uri);
         JAXBElement jax = new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "AnnotationsPlacement"), AnnotationsPlacement.class, null, data);
         ClientResponse resp = web.type("application/xml").accept("application/xml").put(ClientResponse.class, jax);
         return new DeserializedHttpResponseGen<Annotation>(resp, resp.getEntity(Annotation.class));
         });*/
    }

    public Future<DeserializedHttpResponseGen<Annotation>> postToAnnotationForAnnotationAsync(String id, String fileCabinetId, int page, Annotation data) {
        class Param {

            String id;
            String fileCabinetId;
            int page;

            public Param(String id, String fileCabinetId, int page) {
                this.id = id;
                this.fileCabinetId = fileCabinetId;
                this.page = page;
            }
        }
        Param parameters = new Param(id, fileCabinetId, page);
        URI uri = buildUri(parameters, "annotation");
        /*try {
            uri = new URI(
                    this.getServiceDescription().getProxy().getBaseAddress().getScheme() + "://"
                    + this.getServiceDescription().getProxy().getBaseAddress().getHost()
                    + this.createTemplateUri("annotation", parameters));
        } catch (URISyntaxException ex) {
            throw new RuntimeException(ex.getCause());
        }*/
        return LinkResolver.<Annotation, Annotation>postAsync(this.getServiceDescription(), uri, "application/xml", "application/xml", Annotation.class, Annotation.class, "Annotation", data);
        /*return CompletableFuture.<DeserializedHttpResponseGen<Annotation>>supplyAsync(() -> {
         WebResource web = this.getServiceDescription().getProxy().getHttpClient().resource(uri);
         JAXBElement jax = new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "Annotation"), Annotation.class, null, data);
         ClientResponse resp = web.type("application/xml").accept("application/xml").post(ClientResponse.class, jax);
         return new DeserializedHttpResponseGen<Annotation>(resp, resp.getEntity(Annotation.class));
         });*/
    }

    public Future<DeserializedHttpResponseGen<Annotation>> postToAnnotationForAnnotationAsync(String id, String fileCabinetId, int page, AnnotationsPlacement data) {
        class Param {

            String id;
            String fileCabinetId;
            int page;

            public Param(String id, String fileCabinetId, int page) {
                this.id = id;
                this.fileCabinetId = fileCabinetId;
                this.page = page;
            }
        }
        Param parameters = new Param(id, fileCabinetId, page);
        URI uri = buildUri(parameters, "annotation");
        /*try {
            uri = new URI(
                    this.getServiceDescription().getProxy().getBaseAddress().getScheme() + "://"
                    + this.getServiceDescription().getProxy().getBaseAddress().getHost()
                    + this.createTemplateUri("annotation", parameters));
        } catch (URISyntaxException ex) {
            throw new RuntimeException(ex.getCause());
        }*/
        return LinkResolver.<Annotation, AnnotationsPlacement>postAsync(this.getServiceDescription(), uri, "application/xml", "application/xml", Annotation.class, AnnotationsPlacement.class, "AnnotationsPlaement", data);
        /*return CompletableFuture.<DeserializedHttpResponseGen<Annotation>>supplyAsync(() -> {
         WebResource web = this.getServiceDescription().getProxy().getHttpClient().resource(uri);
         JAXBElement jax = new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "AnnotationsPlacement"), AnnotationsPlacement.class, null, data);
         ClientResponse resp = web.type("application/xml").accept("application/xml").post(ClientResponse.class, jax);
         return new DeserializedHttpResponseGen<Annotation>(resp, resp.getEntity(Annotation.class));
         });*/
    }

    public Future<DeserializedHttpResponseGen<JAXBElement>> getFromClientSetupDataForXElementAsync(String orgId, String baseAddress, String clientSetupVersion) {
        class Param {

            String ordId;
            String baseAddress;
            String clientSetupVersion;

            public Param(String ordId, String baseAddress, String clientSetupVersion) {
                this.ordId = ordId;
                this.baseAddress = baseAddress;
                this.clientSetupVersion = clientSetupVersion;
            }
        }
        Param parameters = new Param(orgId, baseAddress, clientSetupVersion);
        URI uri = buildUri(parameters, "clientSetupData");
        /*try {
            uri = new URI(
                    this.getServiceDescription().getProxy().getBaseAddress().getScheme() + "://"
                    + this.getServiceDescription().getProxy().getBaseAddress().getHost()
                    + this.createTemplateUri("clientSetupData", parameters));
        } catch (URISyntaxException ex) {
            throw new RuntimeException(ex.getCause());
        }*/
        return LinkResolver.<JAXBElement>getAsync(this.getServiceDescription(), uri, "*/*", JAXBElement.class);
       // return CompletableFuture.<DeserializedHttpResponseGen<JAXBElement>>supplyAsync(() -> {
        //   WebResource web = this.getServiceDescription().getProxy().getHttpClient().resource(uri);
        //ClientResponse resp = web.accept("*/*").get(ClientResponse.class);
        // return new DeserializedHttpResponseGen<JAXBElement>(resp, resp.getEntity(JAXBElement.class));
        //});
    }

    public Future<DeserializedHttpResponseGen<String>> postToValidateUserForStringAsync(String id, UserValidation data) {
        class Param {

            String id;

            public Param(String id) {
                this.id = id;
            }
        }
        Param parameters = new Param(id);
        URI uri = buildUri(parameters, "validateUser");
        /*try {
            uri = new URI(
                    this.getServiceDescription().getProxy().getBaseAddress().getScheme() + "://"
                    + this.getServiceDescription().getProxy().getBaseAddress().getHost()
                    + this.createTemplateUri("validateUser", parameters));
        } catch (URISyntaxException ex) {
            throw new RuntimeException(ex.getCause());
        }*/
        return LinkResolver.<String, UserValidation>postAsync(this.getServiceDescription(), uri, "application/xml", "text/plain", String.class, UserValidation.class, "UserValidation", data);
        /* return CompletableFuture.<DeserializedHttpResponseGen<String>>supplyAsync(() -> {
         WebResource web = this.getServiceDescription().getProxy().getHttpClient().resource(uri);
         JAXBElement jax = new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "UserValidation"), UserValidation.class, null, data);
         ClientResponse resp = web.type("application/xml").accept("text/plain").post(ClientResponse.class, jax);
         return new DeserializedHttpResponseGen<String>(resp, resp.getEntity(String.class));
         });*/
    }

    /// <summary>
    /// Checks the specified file in.
    /// </summary>
    /// <param name="serviceConnection">The service connection.</param>
    /// <param name="fileToCheckin">The file to checkin.</param>
    /// <returns>A task producing the checked-in response of the check-in operation.</returns>
    /// <remarks>The name of <paramref name="fileToCheckin"/> must be taken from <see cref="EasyCheckoutCheckinExtensionsBase.EasyCheckOutToFileSystemAsync"/>.</remarks>
    public Future<DeserializedHttpResponseGen<Document>> easyCheckInFromFileSystemAsync(java.io.File fileToCheckin) {
        return EasyCheckoutCheckinExtensionsBase.easyCheckInFromFileSystemAsync(this, FileWrapper.toFileInfoWrapper(fileToCheckin));
    }

    /// <summary>
    /// Checks the specified file in.
    /// </summary>
    /// <param name="serviceConnection">The service connection.</param>
    /// <param name="fileToCheckin">The file to checkin.</param>
    /// <param name="checkInParams">The check in parameters.</param>
    /// <returns>A task producing the checked-in response of the check-in operation.</returns>
    /// <remarks>The name of <paramref name="fileToCheckin"/> must be taken from <see cref="EasyCheckoutCheckinExtensionsBase.EasyCheckOutToFileSystemAsync"/>.</remarks>
    public Future<DeserializedHttpResponseGen<Document>> easyCheckInFromFileSystemAsync(java.io.File fileToCheckin, CheckInActionParameters checkInParams) {
        return EasyCheckoutCheckinExtensionsBase.easyCheckInFromFileSystemAsync(this, FileWrapper.toFileInfoWrapper(fileToCheckin), checkInParams);

    }

    /*   public Future<DeserializedHttpResponseGen<SelectListInfo>> GetFromSelectListForSelectListInfoAsync(String id, String selectListId)
     {
     class Param{
     String id;
     String selectListId;
     public Param(String id, String selectListId) {
     this.id = id;
     this.selectListId = selectListId;
     }
     }
     Param parameters = new Param(id, selectListId);
     URI uri;
     try {
     uri = new URI(
     this.getServiceDescription().getProxy().getBaseAddress().getScheme() +"://" +
     this.getServiceDescription().getProxy().getBaseAddress().getHost()  +
     this.createTemplateUri("selectList", parameters));
     } catch (URISyntaxException ex) {throw new RuntimeException(ex.getCause());
     }
     return CompletableFuture.<DeserializedHttpResponseGen<SelectListInfo>>supplyAsync(()->
     {  WebResource web= this.getServiceDescription().getProxy().getHttpClient().resource(uri);
     ClientResponse resp= web.accept("application/xml").get(ClientResponse.class);
     return new DeserializedHttpResponseGen<SelectListInfo>(resp, resp.getEntity(SelectListInfo.class));
     });
     }*/
    
    private URI buildUri(Object parameters, String template) {
        try {
            return new URI(
                    this.getServiceDescription().getProxy().getBaseAddress().getScheme() + "://"
                    + this.getServiceDescription().getProxy().getBaseAddress().getHost()
                    + this.createTemplateUri(template, parameters));
        } catch (URISyntaxException ex) {
            throw new RuntimeException(ex.getCause());
        }
    }
}