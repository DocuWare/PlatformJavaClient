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
import com.docuware.dev.schema._public.services.platform.SelectListInfo;
import com.docuware.dev.schema._public.services.platform.SequenceRequest;
import com.docuware.dev.schema._public.services.platform.SequenceResult;
import com.docuware.dev.schema._public.services.platform.ServiceDescription;
import com.docuware.dev.schema._public.services.platform.SuggestionFields;
import com.docuware.dev.schema._public.services.platform.UpdateIndexFieldsInfo;
import com.docuware.dev.schema._public.services.platform.UserValidation;
import com.docuware.dev.settings.interop.DWProductTypes;
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
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.xml.bind.JAXBElement;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.NTCredentials;
import org.apache.http.auth.UsernamePasswordCredentials;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @author Patrick
 */
public class ServiceConnection {

    private final ServiceDescription serviceDescription;
    private static PlatformClient client;
    private static String hostId;

    /**
     * @deprecated 
     * @param serviceDescription 
     */
    ServiceConnection(ServiceDescription serviceDescription) {
        this.serviceDescription = serviceDescription;
    }
    
    /**
     * Gets the service description
     * @return  The service description
     */
    public ServiceDescription getServiceDescription() {
        return serviceDescription;
    }

    /**
     * Gets the Proxy
     * @return  The Proxy
     */
    HttpClientProxy getProxy() {
        return  serviceDescription.getProxy();
    }
    
    /**
     * Replaces the HTTP client. <p>
     * 
     * Remark:
     * After the function returns, all requests from all objects created by this {@link ServiceConnection} instance 
     * are sent through the new HttpClient instance. Then both {@link otherServiceConnection} and this {@link ServiceConnection} instance 
     * share the same HttpClient instance.
     * 
     * @param otherServiceConnection    The {@link ServiceConnection} instance whose HttpClient instance is used for further communucation
     */
    public void replaceHttpClient(ServiceConnection otherServiceConnection) {
        this.getProxy().ReplaceHttpClient(otherServiceConnection.getProxy().getHttpClient());
    }

    /**
     * Disconnects the Instance
     */
    public void disconnect() {
        MethodInvocation.get(serviceDescription, serviceDescription.getLinks(), "logout", null);
        
        client.getClient().getClientHandler().getHttpClient().getHttpConnectionManager().closeIdleConnections(1);
        client.getClient().destroy();
    }

    /**
     * Disconnects the Instance
     * @return  A Future, which disconnects the ServiceConnection
     */
    public CompletableFuture disconnectAsync() {
        return CompletableFuture.runAsync(() -> {
            MethodInvocation.getAsync(serviceDescription, serviceDescription.getLinks(), "logout", null);
        });
    }

    public static void SetHostId(String HostId){
        hostId = HostId;
    }

    /**
     * Creates a connection for the specified service URI.
     * 
     * @param uri    [necessary] The service URI
     * @param userName  [necessary] Name of the user
     * @param password  [necessary] The password
     * @param orgName  [optional/ can be filled with null] The organization to connect. You do no need to specify this parameter in case there is only a single organization in the system you want to connect to.
     * @return  A proxy which handles further requests
     */
    public static ServiceConnection create(String uri, String userName, String password, String orgName) {
        MultivaluedMap<String, String> formData = new MultivaluedMapImpl();
        formData.add("UserName", userName);
        formData.add("Password", password);
        formData.add("Organization", orgName);
        return create(formData, uri, "login", null);
    }

    /**
     * Creates a connection for the specified service URI.
     * 
     * @param serviceUri    [necessary] The service URI
     * @param userName  [necessary] Name of the user
     * @param password  [necessary] The password
     * @param organization  [optional/ can be filled with null] The organization to connect. You do no need to specify this parameter in case there is only a single organization in the system you want to connect to.
     * @param licenseType   [optional/ can be filled with null] Type of the license
     * @param httpClientHandler [optional/ can be filled with null] The HTTP client handler.
     * @param userAgent [optional/ can be filled with null] The parts of the user agent header. You should specify these values in order to identify you application. 
     * If this parameter is set to null then the process name and version of you application is used as user agent string. If you do not want to submit any user agent, you must set this parameter to an empty array
     * @return  A proxy which handles further requests
     */
    static public ServiceConnection create(String serviceUri, String userName, String password, String organization, DWProductTypes licenseType, ApacheHttpClientHandler httpClientHandler,
            String[] userAgent) {
        try {
            return createAsync(serviceUri, userName, password, organization, licenseType, httpClientHandler, userAgent).get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e.getLocalizedMessage());
        }
    }
    
    /**
     * Creates a connection for the specified service URI.
     * 
     * @param serviceUri    [necessary] The service URI
     * @param impersonatedUser  [necessary] Name of the impersonated(DW) user
     * @param trustedUser   [necessary] Name of a trusted user
     * @param password  [necessary] The password
     * @param organization  [optional/ can be filled with null] The organization to connect. You do no need to specify this parameter in case there is only a single organization in the system you want to connect to
     * @param licenseType   [optional/ can be filled with null] Type of the license
     * @param httpClientHandler [optional/ can be filled with null] The HTTP client handler
     * @param userAgent [optional/ can be filled with null] The parts of the user agent header. You should specify these values in order to identify you application. 
     * If this parameter is set to null then the process name and version of you application is used as user agent string. If you do not want to submit any user agent, you must set this parameter to an empty array
     * @return  A proxy which handles further requests
     */
    static public ServiceConnection createTrusted(String serviceUri, String impersonatedUser, String trustedUser, String password, String organization, DWProductTypes licenseType, ApacheHttpClientHandler httpClientHandler,
            String[] userAgent) {
        try {
            return createTrustedAsync(serviceUri, impersonatedUser, trustedUser, password, organization, licenseType, httpClientHandler, userAgent).get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e.getLocalizedMessage());
        }
    }
    
    /**
     * Creates a connection for the specified service URI
     * 
     * @param serviceUri    [necessary] The service URI
     * @param token [necessary] The login token
     * @param licenseType   [optional/ can be filled with null] Type of the license
     * @param httpClientHandler [optional/ can be filled with null] The HTTP client handler
     * @param userAgent [optional/ can be filled with null] The parts of the user agent header. You should specify these values in order to identify you application. 
     * If this parameter is set to null then the process name and version of you application is used as user agent string. If you do not want to submit any user agent, you must set this parameter to an empty array
     * @return  A proxy which handles further requests
     */
    static public ServiceConnection create(String serviceUri, String token, DWProductTypes licenseType, ApacheHttpClientHandler httpClientHandler,
            String[] userAgent) {
        try {
            return createAsync(serviceUri, token, licenseType, httpClientHandler, userAgent).get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e.getLocalizedMessage());
        }
    }
    
    /**
     * CCreates a connection for the specified service URI without a log in.
     * 
     * @param serviceUri    [necessary] The service URI
     * @param httpClientHandler [optional/ can be filled with null] The HTTP message handler
     * @param userAgent [optional/ can be filled with null] The parts of the user agent header. You should specify these values in order to identify you application. 
     * If this parameter is set to null then the process name and version of you application is used as user agent string. If you do not want to submit any user agent, you must set this parameter to an empty array
     * @return  A proxy which handles further requests
     */
    static public ServiceConnection create(String serviceUri, ApacheHttpClientHandler httpClientHandler,
            String[] userAgent) {
        try {
            return createAsyncNoConnection(serviceUri, httpClientHandler, userAgent).get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e.getLocalizedMessage());
        }
    }

    /**
     * Creates a ServiceConnection and connects it with the specified URI asynchronously
     * 
     * @param serviceUri   the targeted URI
     * @param userName  your Docuware username
     * @param password  your Docuware password
     * @param orgName   the name of your Docuware organization
     * @return  a Future creating the ServiceConnection instance connected with the platform
     */
    public static CompletableFuture<ServiceConnection> createAsync(String serviceUri, String userName, String password, String orgName) {
        MultivaluedMap<String, String> formData = new MultivaluedMapImpl();
        formData.add("UserName", userName);
        formData.add("Password", password);
        formData.add("Organization", orgName);
        return createAsync(formData, serviceUri, "login", null);
    }
    
    /**
     * Creates a ServiceConnection and connects it with the specified URI asynchronously
     * 
     * @param serviceUri    [necessary] The service URI
     * @param userName  [necessary] Name of the user
     * @param password  [necessary] The password
     * @param organization  [optional/ can be filled with null] The organization to connect. You do no need to specify this parameter in case there is only a single organization in the system you want to connect to.
     * @param licenseType   [optional/ can be filled with null] Type of the license
     * @param httpClientHandler [optional/ can be filled with null] The HTTP client handler.
     * @param userAgent [optional/ can be filled with null] The parts of the user agent header. You should specify these values in order to identify you application. 
     * If this parameter is set to null then the process name and version of you application is used as user agent string. If you do not want to submit any user agent, you must set this parameter to an empty array
     * @return  A future which is creating a proxy which handles further requests.
     */
    static public CompletableFuture<ServiceConnection> createAsync(String serviceUri, String userName, String password, String organization, DWProductTypes licenseType, ApacheHttpClientHandler httpClientHandler,
            String[] userAgent) {
        MultivaluedMap<String, String> formData = new MultivaluedMapImpl();
        formData.add("UserName", userName);
        formData.add("Password", password);
        return createAsync(serviceUri, formData, ServiceConnectionLoginData.Create(organization, licenseType, httpClientHandler, userAgent));
    }
    
    /**
     * Creates a connection for the specified service URI asynchronously.
     * 
     * @param serviceUri    [necessary] The service URI
     * @param userName  [necessary] Name of the user
     * @param password  [necessary] The password
     * @param serviceConnectionData [necessary] The service connection data
     * @return A future which is creating a proxy which handles further requests.
     */
    static public CompletableFuture<ServiceConnection> createAsync(String serviceUri, String userName, String password, ServiceConnectionLoginData serviceConnectionData) {
        MultivaluedMap<String, String> formData = new MultivaluedMapImpl();
        formData.add("UserName", userName);
        formData.add("Password", password);
        return createAsync(serviceUri, formData, serviceConnectionData);
    }

    static private CompletableFuture<ServiceConnection> createAsync(String serviceUri, MultivaluedMap<String, String> formData, ServiceConnectionLoginData serviceConnectionData) {
        serviceConnectionData.AddLoginFormData(formData);
        return createAsync(formData, serviceUri, "login", serviceConnectionData.getTransport());
    }
    
    /**
     * Creates a connection for the specified service URI asynchronously.
     * 
     * @param serviceUri    [necessary] The service URI
     * @param impersonatedUser  [necessary] Name of the DW user
     * @param trustedUser   [necessary] Name of a trusted user
     * @param password  [necessary] The password
     * @param organization  [optional/ can be filled with null] The organization to connect. You do no need to specify this parameter in case there is only a single organization in the system you want to connect to.
     * @param licenseType   [optional/ can be filled with null] Type of the license
     * @param httpClientHandler [optional/ can be filled with null] The HTTP message handler
     * @param userAgent [optional/ can be filled with null] The parts of the user agent header. You should specify these values in order to identify you application. 
     * If this parameter is set to null then the process name and version of you application is used as user agent string. If you do not want to submit any user agent, you must set this parameter to an empty array.
     * @return  A future which is creating a proxy which handles further requests.
     */
    static public CompletableFuture<ServiceConnection> createTrustedAsync(String serviceUri, String impersonatedUser, String trustedUser, String password, String organization, DWProductTypes licenseType, ApacheHttpClientHandler httpClientHandler,
            String[] userAgent) {
        MultivaluedMap<String, String> formData = new MultivaluedMapImpl();
        formData.add("ImpersonatedUser", impersonatedUser);
        formData.add("UserName", trustedUser);
        formData.add("Password", password);
        return createTrustedAsync(serviceUri, formData, ServiceConnectionLoginData.Create(organization, licenseType, httpClientHandler, userAgent));
    }
    
    /**
     * Creates a connection for the specified service URI asynchronously.
     * 
     * @param serviceUri    [necessary] The service URI
     * @param impersonatedUser  [necessary] Name of the DW user
     * @param trustedUser   [necessary] Name of a trusted user
     * @param password  [necessary] The password
     * @param serviceConnectionData necessary] The service connection data
     * @return A future which is creating a proxy which handles further requests.
     */
    static public CompletableFuture<ServiceConnection> createTrustedAsync(String serviceUri, String impersonatedUser, String trustedUser, String password, ServiceConnectionLoginData serviceConnectionData) {
        MultivaluedMap<String, String> formData = new MultivaluedMapImpl();
        formData.add("ImpersonatedUser", impersonatedUser);
        formData.add("UserName", trustedUser);
        formData.add("Password", password);
        return createTrustedAsync(serviceUri, formData, serviceConnectionData);
    }

    static private CompletableFuture<ServiceConnection> createTrustedAsync(String serviceUri, MultivaluedMap<String, String> formData, ServiceConnectionLoginData scld) {
        scld.AddLoginFormData(formData);
        return createAsync(formData, serviceUri, "trustedLogin", scld.getTransport());
    }

    /**
     * Creates a connection for the specified service URI asynchronously.
     * 
     * @param serviceUri    [necessary] The service URI
     * @param token [necessary] The login token
     * @param licenseType   [optional/ can be filled with null] Type of the license
     * @param httpClientHandler [optional/ can be filled with null] The HTTP message handler
     * @param userAgent [optional/ can be filled with null] The parts of the user agent header. You should specify these values in order to identify you application. 
     * If this parameter is set to null then the process name and version of you application is used as user agent string. If you do not want to submit any user agent, you must set this parameter to an empty array.
     * @return  A future which is creating a proxy which handles further requests.
     */
    static public CompletableFuture<ServiceConnection> createAsync(String serviceUri, String token, DWProductTypes licenseType, ApacheHttpClientHandler httpClientHandler,
            String[] userAgent) {
        return createAsync(serviceUri, token, ServiceConnectionTokenLoginData.Create(licenseType, httpClientHandler, userAgent));
    }

    /**
     * Creates a connection for the specified service URI asynchronously
     * 
     * @param serviceUri    [necessary] The service URI
     * @param token [necessary] The login token
     * @param serviceConnectionTokenLoginData   [necessary] The service connection token login data
     * @return  A future which is creating a proxy which handles further requests.
     */
    static public CompletableFuture<ServiceConnection> createAsync(String serviceUri, String token, ServiceConnectionTokenLoginData serviceConnectionTokenLoginData) {
        MultivaluedMap<String, String> formData = new MultivaluedMapImpl();
        formData.add("Token", token);
        serviceConnectionTokenLoginData.AddLoginFormData(formData);
        return createAsync(formData, serviceUri, "tokenLogin", serviceConnectionTokenLoginData.getTransport());
    }

    /**
     * Creates a connection for the specified service URI without a log in. The connection is created asynchronously
     * 
     * @param serviceUri    [necessary] The service URI
     * @param httpClientHandler [optional/ can be filled with null] The HTTP message handler
     * @param userAgent [optional/ can be filled with null] The parts of the user agent header. You should specify these values in order to identify you application.
     * If this parameter is set to null then the process name and version of you application is used as user agent string. If you do not want to submit any user agent, you must set this parameter to an empty array.
     * @return  A future which is creating a proxy which handles further requests.
     */
    static public CompletableFuture<ServiceConnection> createAsyncNoConnection(String serviceUri, ApacheHttpClientHandler httpClientHandler, String[] userAgent) {
        ServiceConnectionTransportData sctd = new ServiceConnectionTransportData();
        sctd.setUserAgent(userAgent);
        sctd.setHttpClientHandler(httpClientHandler);
        return createAsyncNoConnection(serviceUri, sctd);
    }

    /**
     * Creates a connection for the specified service URI without a log in. The connection is created asynchronously
     * 
     * @param serviceUri    [necessary] The service URI
     * @param serviceConnectionTransportData    [necessary] The service connection transport data
     * @return  A future which is creating a proxy which handles further requests.
     */
    static private CompletableFuture<ServiceConnection> createAsyncNoConnection(String serviceUri, ServiceConnectionTransportData serviceConnectionTransportData) {
        return CompletableFuture.<ServiceConnection>supplyAsync(() -> {
            client = new PlatformClient(serviceUri, serviceConnectionTransportData);
            LinkResolver resolver = client.getLinkResolver();

            ServiceDescription serviceDescription = client.getServiceDescription();
            return new ServiceConnection(serviceDescription);
        });
    }

    private static ServiceConnection create(MultivaluedMap<String, String> formData, String baseuri, String rel, ServiceConnectionTransportData sclbd) {
        if(hostId != null){
            formData.add("HostId", hostId);
        }
        
        client = new PlatformClient(baseuri, sclbd);
        LinkResolver resolver = client.getLinkResolver();
        ServiceDescription serviceDescription = client.getServiceDescription();
        // fire the request and get the response
        ClientResponse response = client.resource(resolver.getLink(serviceDescription.getLinks(), rel))
                .type("application/x-www-form-urlencoded").post(
                        ClientResponse.class, formData);
        return new ServiceConnection(serviceDescription);
    }

    private static CompletableFuture<ServiceConnection> createAsync(MultivaluedMap<String, String> formData, String uri, String rel, ServiceConnectionTransportData sclbd) {
        return CompletableFuture.<ServiceConnection>supplyAsync(() -> {
            return create(formData, uri, rel, sclbd);
        });
    }
    
    static public CompletableFuture<ServiceConnection> createWithWindowsAuthenticationAsync(String serviceUri, String userName, String password, String domain, String organization, DWProductTypes licenseType, ApacheHttpClientHandler httpClientHandler,
            String[] userAgent)
        {
            NTCredentials c= new NTCredentials(userName, password, System.getenv("COMPUTERNAME"), domain);
            return createWithWindowsAuthenticationAsync(serviceUri,c,  ServiceConnectionLoginData.Create(organization, licenseType, httpClientHandler, userAgent));
        }
    
    static public CompletableFuture<ServiceConnection> createWithWindowsAuthenticationAsync(String serviceUri, Credentials credentials, ServiceConnectionLoginData serviceConnectionLoginData)
        {
            ServiceConnectionTransportData transport = serviceConnectionLoginData.getTransport();
            MultivaluedMap<String, String> m = new MultivaluedMapImpl();

            if (transport.HttpClientHandler == null) {
                 return CompletableFuture.<ServiceConnection>supplyAsync(()-> {
                 return createWindows(m, serviceUri, "windowsLogin", transport, credentials);
            });
            }
            return createAsync(m , serviceUri, "windowsLogin", serviceConnectionLoginData.getTransport());
        }
    
    static public ServiceConnection createWithWindowsAuthentication(String serviceUri, Credentials credentials, ServiceConnectionLoginData serviceConnectionLoginData)
        {
            try{
            return createWithWindowsAuthenticationAsync(serviceUri, credentials, serviceConnectionLoginData).get();
            } catch (InterruptedException  | ExecutionException ex) {
            throw new RuntimeException(ex.getCause());
        }
        }
    
    static public ServiceConnection createWithWindowsAuthentication(String serviceUri, String userName, String password, String domain, String organization, DWProductTypes licenseType, ApacheHttpClientHandler httpClientHandler,
            String[] userAgent)
        {
            NTCredentials c= new NTCredentials(userName, password, System.getenv("COMPUTERNAME"), domain);
        try {
            return createWithWindowsAuthenticationAsync(serviceUri,c,  ServiceConnectionLoginData.Create(organization, licenseType, httpClientHandler, userAgent)).get();
        } catch (InterruptedException  | ExecutionException ex) {
            throw new RuntimeException(ex.getCause());
        }
        }
    
    private static ServiceConnection createWindows(MultivaluedMap<String, String> formData, String baseuri, String rel, ServiceConnectionTransportData sclbd, Credentials c) {
        client = new PlatformClient(baseuri, sclbd, c);
        LinkResolver resolver = client.getLinkResolver();
        ServiceDescription serviceDescription = client.getServiceDescription();
        // fire the request and get the response
        ClientResponse response = client.resource(resolver.getLink(serviceDescription.getLinks(), rel))
                .type("application/x-www-form-urlencoded").post(
                        ClientResponse.class, formData);
        return new ServiceConnection(serviceDescription);
    }

    /**
     * Gets the Organizations
     * @return the Organization
     */
    public Organizations getOrganizations() {
        return serviceDescription.getOrganizationsFromOrganizationsRelation();
    }

    /**
     * Gets the organizations asynchronous
     * @return  The list of available organizations
     */
    public CompletableFuture<DeserializedHttpResponseGen<Organizations>> getOrganizationsAsync() {
        return serviceDescription.getOrganizationsFromOrganizationsRelationAsync();
    }

    public FileCabinet getFileCabinet(String fileCabinetId) {
        // TODO: [CHW] Mach das ordentlich, wenn wir URL templates in der Platform haben.
        URI url = null;
        try {
            url = new URI(client.getLinkResolver().getBaseUri().toString() + "/FileCabinets/" + fileCabinetId);
        } catch (URISyntaxException ex) {
        }
        ClientResponse resp = client.resource(url).get(ClientResponse.class);
         if (resp.getStatus() < 200 || resp.getStatus() > 399) {
            HttpClientRequestException e = HttpClientRequestException.create(resp);
            throw e;
         } else {
        FileCabinet fc = resp.getEntity(FileCabinet.class);
        fc.setProxy(serviceDescription.getProxy());
        return fc;
         }
    }

    /**
     * Gets all file cabinets
     * 
     * @param organizations The organizations
     * @return  The list of all file cabinets
     */
    public List<FileCabinet> getAllFileCabinets(Iterable<Organization> organizations) {
        List<FileCabinet> fcs = new LinkedList();
        for (Organization o : organizations) {
            o.getFileCabinetsFromFilecabinetsRelation().getFileCabinet().stream().forEach((fc) -> {
                fcs.add(fc);
            });
        }
        return fcs;
    }

    /**
     * Creates the template URI
     * 
     * @param templateName  The service connection
     * @param paramaters    The paramaters
     * @return 
     */
    public String createTemplateUri(String templateName, Object paramaters) {
        return UriTemplateExtensions.CreateUrl(serviceDescription.getResources().getTemplate(), templateName, paramaters);
    }

    /**
     * Creates the template URI
     * 
     * @param templateName  The service connection
     * @param paramaters    The paramaters
     * @return 
     */
    public String createTemplateUri(String templateName, Map<String, Object> paramaters) {
        return UriTemplateExtensions.CreateUrl(serviceDescription.getResources().getTemplate(), templateName, paramaters);
    }

     /**
     * Creates a permanent URL asynchronously <p>
     * 
     * Remarks: Use this function to take an URL and append some information about the currently authenticated user. The created URL can then be taken to access the ressource without needed to login
     * 
     * @param url   The URL
     * @return  A task which creates a URL with an authenticated user information inside
     */
    public CompletableFuture<DeserializedHttpResponseGen<String>> createPermanentUrlAsync(String url) {
        HashMap<String, String> parameters = new HashMap<>();
        parameters.put("url", url);
        return CompletableFuture.<DeserializedHttpResponseGen<String>>supplyAsync(() -> {
            WebResource web =  this.getServiceDescription().getProxy().getHttpClient().resource(serviceDescription.getPermanentUrlRelationLink());
            ClientResponse resp = web.type(MediaType.APPLICATION_XML).accept(MediaType.APPLICATION_XML).post(ClientResponse.class, parameters);
            if (resp.getStatus() < 200 || resp.getStatus() > 399) {
                HttpClientRequestException e = HttpClientRequestException.create(resp);
                return new DeserializedHttpResponseGen(resp, e);
            } else {
                return new DeserializedHttpResponseGen<>(resp, resp.getEntity(String.class));
            }
        });
    }

    /**
     * Creates a permanent URL <p>
     * 
     * Remarks: Use this function to take a URL and append some information about the currently authenticated user. The created URL can then be taken to access the ressource without needed to login
     * 
     * @param url   The URL
     * @return  An URL with an authenticated user information inside
     */
    public String getPermanentUrl(String url) {
        try {
            return createPermanentUrlAsync(url).get().getContent();
        } catch (InterruptedException | ExecutionException ex) {
            throw new RuntimeException("Error on Resolving Async Process");
        }

    }

    /**
     * @param fileCabinetId [necessary] The Id of the FileCabinet in which the Document is located
     * @param docId [necessary] The docId of the Document to which the DocumentActionInfo should be put
     * @param data  [necessary] The DocumentActionInfo
     * @param ct    [necessary] A cancellationToken through which the Future can be easily cancelled when it didn't start
     * @return A future performing the action
     */
    public CompletableFuture<DeserializedHttpResponseGen<Document>> putToProcessDocumentActionForDocumentAsync(String fileCabinetId, int docId, DocumentActionInfo data, CancellationToken ct) {
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
        CompletableFuture<DeserializedHttpResponseGen<Document>> fut = LinkResolver.<Document, DocumentActionInfo>putAsync(this.getServiceDescription(), uri, "application/xml", "application/xml", Document.class, DocumentActionInfo.class, "DocumentActionInfo", data);
        if(ct!=null) ct.addFuture(fut);
        return fut;
    }

     /**
     * @param fileCabinetId [necessary] The Id of the FileCabinet in which the Document is located
     * @param docId [necessary] The docId of the Document to which the DocumentActionInfo should be put
     * @param data  [necessary] The DocumentActionInfo
     * @return  A future performing the action
     */
    public CompletableFuture<DeserializedHttpResponseGen<Document>> putToProcessDocumentActionForDocumentAsync(String fileCabinetId, int docId, DocumentActionInfo data) {
        return putToProcessDocumentActionForDocumentAsync(fileCabinetId, docId, data, null);
    }

    /**
     * @param fileCabinetId [necessary] The Id of the FileCabinet in which the Document is located
     * @param data  [necessary] The data to post
     * @param ct    [necessary] A cancellationToken through which the Future can be easily cancelled when it didn't begin to run
     * @return A future performing the action
     */
     public CompletableFuture<DeserializedHttpResponseGen<SequenceResult>> postToRetrieveSequenceElementForSequenceResultAsync(String fileCabinetId, SequenceRequest data, CancellationToken ct)
     {
     class Param {
     String fileCabinetId;
     public Param(String fid2) {
     fileCabinetId = fid2;
     }
     }
     Param parameters = new Param(fileCabinetId);
     URI uri = buildUri(parameters, "retrieveSequenceElement");
     CompletableFuture<DeserializedHttpResponseGen<SequenceResult>> fut =  LinkResolver.<SequenceResult, SequenceRequest>postAsync(this.getServiceDescription(), uri, "application/xml", "application/xml", SequenceResult.class, SequenceRequest.class, "SequenceRequest", data);   
     if(ct!=null) ct.addFuture(fut);
     return fut;
     }
     
     /**
     * @param fileCabinetId [necessary] The Id of the FileCabinet in which the Document is located
     * @param data  [necessary] The data to post
     * @return A future performing the action
     */
    public CompletableFuture<DeserializedHttpResponseGen<SequenceResult>> postToRetrieveSequenceElementForSequenceResultAsync(String fileCabinetId, SequenceRequest data) {
        return postToRetrieveSequenceElementForSequenceResultAsync(fileCabinetId, data, null);
    }
     
    
    /**
     * @param data  [necessary] the data to post
     * @param clientSideChecksum    [necessary] A Checksum
     * @param ct    [necessary] A cancellationToken through which the Future can be easily cancelled when it didn't start
     * @return  A future performing the action
     */
    public CompletableFuture<DeserializedHttpResponseGen<String>> postToCreatePermanentUrlForStringAsync(MultivaluedMap data, Boolean clientSideChecksum, CancellationToken ct) {
        class Param {

            Boolean clientSideChecksum;

            public Param(Boolean fid2) {
                clientSideChecksum = fid2;
            }
        }
        Param parameters = new Param(clientSideChecksum);
        URI uri = buildUri(parameters, "createPermanentUrl");
        CompletableFuture<DeserializedHttpResponseGen<String>> fut= CompletableFuture.<DeserializedHttpResponseGen<String>>supplyAsync(() -> {
            WebResource web = this.getServiceDescription().getProxy().getHttpClient().resource(uri);
            ClientResponse resp = web.type("application/x-www-form-urlencoded").accept("text/plain").post(ClientResponse.class, data);
            if (resp.getStatus() < 200 || resp.getStatus() > 399) {
                HttpClientRequestException e = HttpClientRequestException.create(resp);
                return new DeserializedHttpResponseGen(resp, e);
            } else {
                return new DeserializedHttpResponseGen<>(resp, resp.getEntity(String.class));
            }
        });
        if(ct!=null) ct.addFuture(fut);
        return fut;
    }
    
     /**
     * @param data  [necessary] the data to post
     * @param clientSideChecksum    [necessary] A Checksum
     * @return  A future performing the action
     */
    public CompletableFuture<DeserializedHttpResponseGen<String>> postToCreatePermanentUrlForStringAsync(MultivaluedMap data, Boolean clientSideChecksum) {
        return postToCreatePermanentUrlForStringAsync(data, clientSideChecksum, null);
    }
    
    /**
     * @param id    [necessary] The Id of the Dialog
     * @param fileCabinetId [necessary] The Id of the Filecabinet containing the Dialog
     * @param dialogType    [optional/ can be filled with null]
     * @param ct    [necessary] A cancellationToken through which the Future can be easily cancelled when it didn't start
     * @return  A Future performing the Task and returning the Dialog
     */ 
    public CompletableFuture<DeserializedHttpResponseGen<Dialog>> getFromDialogForDialogAsync(String id, String fileCabinetId, DialogTypes[] dialogType, CancellationToken ct) {
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
        CompletableFuture<DeserializedHttpResponseGen<Dialog>> fut= LinkResolver.<Dialog>getAsync(this.getServiceDescription(), uri, "application/xml", Dialog.class);
        if(ct!=null) ct.addFuture(fut);
        return fut;
    }
    
     /**
     * @param id    [necessary] The Id of the Dialog
     * @param fileCabinetId [necessary] The Id of the Filecabinet containing the Dialog
     * @param dialogType    [optional/ can be filled with null]
     * @return  A Future performing the Task and returning the Dialog
     */ 
    public CompletableFuture<DeserializedHttpResponseGen<Dialog>> getFromDialogForDialogAsync(String id, String fileCabinetId, DialogTypes[] dialogType) {
        return getFromDialogForDialogAsync(id, fileCabinetId, dialogType, null);
    }

    /**
     * @param fileCabinetId [necessary] The Id of the Filecabinet
     * @param id    [necessary] the Id
     * @param data  [necessary] the data to post
     * @param fields    [optional/ can be filled with null] 
     * @param sortOrder [optional/ can be filled with null] 
     * @param ct    [necessary] A cancellationToken through which the Future can be easily cancelled when it didn't start
     * @return  A Future performing the Task and returning the Result
     */
    public CompletableFuture<DeserializedHttpResponseGen<BatchUpdateIndexFieldsResult>> postToBatchDialogUpdateFieldsForBatchUpdateIndexFieldsResultAsync(String fileCabinetId, String id, BatchUpdateProcess data, String[] fields, String[] sortOrder, CancellationToken ct) {
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
        CompletableFuture<DeserializedHttpResponseGen<BatchUpdateIndexFieldsResult>> fut = LinkResolver.<BatchUpdateIndexFieldsResult, BatchUpdateProcess>postAsync(this.getServiceDescription(), uri, "application/xml", "application/xml", BatchUpdateIndexFieldsResult.class, BatchUpdateProcess.class, "BatchUpdateProcess", data);
        if(ct!=null) ct.addFuture(fut);
        return fut;
    }
       
     /**
     * @param fileCabinetId [necessary] The Id of the Filecabinet
     * @param id    [necessary] the Id
     * @param data  [necessary] the data to post
     * @param fields    [optional/ can be filled with null] 
     * @param sortOrder [optional/ can be filled with null] 
     * @return  A Future performing the Task and returning the Result
     */
    public CompletableFuture<DeserializedHttpResponseGen<BatchUpdateIndexFieldsResult>> postToBatchDialogUpdateFieldsForBatchUpdateIndexFieldsResultAsync(String fileCabinetId, String id, BatchUpdateProcess data, String[] fields, String[] sortOrder) {
        return postToBatchDialogUpdateFieldsForBatchUpdateIndexFieldsResultAsync(fileCabinetId, id, data, fields, sortOrder, null);
    }

    /**
     * @param id    [necessary] The Id of the Document
     * @param fileCabinetId [necessary] The Id of the Filecabinet containing the Document
     * @param ct    [necessary] A cancellationToken through which the Future can be easily cancelled when it didn't start
     * @return  A Future performing the Task
     */
    public CompletableFuture<DeserializedHttpResponseGen<String>> deleteFromDocumentDeleteForStringAsync(int id, String fileCabinetId, CancellationToken ct) {
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
        CompletableFuture<DeserializedHttpResponseGen<String>> fut= LinkResolver.deleteAsync(this.getServiceDescription(), uri, "text/plain");
        if(ct!=null) ct.addFuture(fut);
        return fut;
    }
    
     /**
     * @param id    [necessary] The Id of the Document
     * @param fileCabinetId [necessary] The Id of the Filecabinet containing the Document
     * @return  A Future performing the Task
     */
    public CompletableFuture<DeserializedHttpResponseGen<String>> deleteFromDocumentDeleteForStringAsync(int id, String fileCabinetId) {
        return deleteFromDocumentDeleteForStringAsync(id, fileCabinetId, null);
    }
    
    /**
     * @param id    [necessary] The Id of the Document
     * @param fileCabinetId [necessary] The Id of the Filecabinet containing the Document
     * @param ct    [necessary] A cancellationToken through which the Future can be easily cancelled before it starts running
     * @return  A Future performing the Task and returning the Document
     */
    public CompletableFuture<DeserializedHttpResponseGen<Document>> getFromDocumentForDocumentAsync(int id, String fileCabinetId, CancellationToken ct) {
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
        CompletableFuture<DeserializedHttpResponseGen<Document>> fut= LinkResolver.<Document>getAsync(this.getServiceDescription(), uri, "application/xml", Document.class);
        if(ct!=null) ct.addFuture(fut);
        return fut;
    }
    
    /**
     * @param id    [necessary] The Id of the Document
     * @param fileCabinetId [necessary] The Id of the Filecabinet containing the Document
     * @return  A Future performing the Task and returning the Document
     */
    public CompletableFuture<DeserializedHttpResponseGen<Document>> getFromDocumentForDocumentAsync(int id, String fileCabinetId) {
        return getFromDocumentForDocumentAsync(id, fileCabinetId, null);
    }

    /**
     * @param id    [necessary] The id of the Document
     * @param fileCabinetId [necessary] The id of the Filecabinet containing the Document
     * @param ct    [necessary] A cancellationToken through which the Future can be easily cancelled before it starts running
     * @param data  [necessary] The data to post
     * @return   A Future performing the Task and returning the Document
     */
    public CompletableFuture<DeserializedHttpResponseGen<Document>> postToDocumentAppendFilesForDocumentAsync(int id, String fileCabinetId, MultiPart data, CancellationToken ct) {
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
        CompletableFuture<DeserializedHttpResponseGen<Document>> fut =  LinkResolver.<Document>postMultiPartAsync(this.getServiceDescription(), uri, "application/xml", Document.class, data);
        if(ct!=null) ct.addFuture(fut);
        return fut;
    }
    
    /**
     * @param id    [necessary] The id of the Document
     * @param fileCabinetId [necessary] The id of the Filecabinet containing the Document
     * @param data  [necessary] The data to post
     * @return   A Future performing the Task and returning the Document
     */
    public CompletableFuture<DeserializedHttpResponseGen<Document>> postToDocumentAppendFilesForDocumentAsync(int id, String fileCabinetId, MultiPart data) {
        return postToDocumentAppendFilesForDocumentAsync( id,  fileCabinetId, data, null);
    }

    /**
     * @param fileCabinetId [necessary] The Id of the FileCabinet
     * @param q [otional/ can be filled with null] 
     * @param fields    [optional/ can be filled with null]
     * @param includeSuggestions    [optional/ can be filled with null]
     * @param format    [optional/ can be filled with null]
     * @param msStart   [optional/ can be filled with null]
     * @param count [optional/ can be filled with null]
     * @param sortOrder [optional/ can be filled with null]
     * @param start [optional/ can be filled with null]
     * @param ct    [necessary] A cancellationToken through which the Future can be easily cancelled before it starts running
     * @return  A Future performing the Task and returning the DocumentsQueryResult
     */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentsQueryResult>> getFromDocumentsForDocumentsQueryResultAsync(String fileCabinetId, String q, String[] fields, String[] sortOrder, Integer start, Integer msStart, Integer count, String format, Boolean includeSuggestions, CancellationToken ct) {
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
        CompletableFuture<DeserializedHttpResponseGen<DocumentsQueryResult>> fut= LinkResolver.<DocumentsQueryResult>getAsync(this.getServiceDescription(), uri, "application/xml", DocumentsQueryResult.class);
        if(ct!=null) ct.addFuture(fut);
        return fut;
    }
    
    /**
     * @param fileCabinetId [necessary] The Id of the FileCabinet
     * @param q [otional/ can be filled with null] 
     * @param fields    [optional/ can be filled with null]
     * @param includeSuggestions    [optional/ can be filled with null]
     * @param format    [optional/ can be filled with null]
     * @param msStart   [optional/ can be filled with null]
     * @param count [optional/ can be filled with null]
     * @param sortOrder [optional/ can be filled with null]
     * @param start [optional/ can be filled with null]
     * @return  A Future performing the Task and returning the DocumentsQueryResult
     */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentsQueryResult>> getFromDocumentsForDocumentsQueryResultAsync(String fileCabinetId, String q, String[] fields, String[] sortOrder, Integer start, Integer msStart, Integer count, String format, Boolean includeSuggestions) {
        return getFromDocumentsForDocumentsQueryResultAsync(fileCabinetId, q, fields, sortOrder, start, msStart, count, format, includeSuggestions, null);
    }

    /**
     * @param fileCabinetId [necessary] the Id of the Filecabinet
     * @param data  [necessary] the Document to post
     * @param processTextshot   [optional/ can be filled with null] 
     * @param imageProcessing   [optional/ can be filled with null] 
     * @param redirect  [optional/ can be filled with null] 
     * @param storeDialogId [optional/ can be filled with null] 
     * @param checkFileNameForCheckinInfo   [optional/ can be filled with null] 
     * @param ct    [necessary] A cancellationToken through which the Future can be easily cancelled before it starts running
     * @return  A Future performing the Task and returning the uploaded Document
     */
    public CompletableFuture<DeserializedHttpResponseGen<Document>> postToUploadDocumentForDocumentAsync(String fileCabinetId, Document data, Boolean processTextshot, Boolean imageProcessing, String redirect, String storeDialogId, Boolean checkFileNameForCheckinInfo, CancellationToken ct) {
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
        CompletableFuture<DeserializedHttpResponseGen<Document>> fut=  LinkResolver.<Document, Document>postAsync(this.getServiceDescription(), uri, "application/xml", "application/xml", Document.class, Document.class, "Document", data);
        if(ct!=null) ct.addFuture(fut);
        return fut;
    }

    /**
     * @param fileCabinetId [necessary] the Id of the Filecabinet
     * @param data  [necessary] the Document to post
     * @param processTextshot   [optional/ can be filled with null] 
     * @param imageProcessing   [optional/ can be filled with null] 
     * @param redirect  [optional/ can be filled with null] 
     * @param storeDialogId [optional/ can be filled with null] 
     * @param checkFileNameForCheckinInfo   [optional/ can be filled with null] 
     * @return  A Future performing the Task and returning the uploaded Document
     */
    public CompletableFuture<DeserializedHttpResponseGen<Document>> postToUploadDocumentForDocumentAsync(String fileCabinetId, Document data, Boolean processTextshot, Boolean imageProcessing, String redirect, String storeDialogId, Boolean checkFileNameForCheckinInfo) {
        return postToUploadDocumentForDocumentAsync(fileCabinetId, data, processTextshot, imageProcessing, redirect, storeDialogId, checkFileNameForCheckinInfo, null);
    }
    
    /**
     * @param fileCabinetId [necessary] the Id of the Filecabinet
     * @param data  [necessary] the data represented as InputStream
     * @param processTextshot   [optional/ can be filled with null] 
     * @param imageProcessing   [optional/ can be filled with null] 
     * @param redirect  [optional/ can be filled with null] 
     * @param storeDialogId [optional/ can be filled with null] 
     * @param checkFileNameForCheckinInfo   [optional/ can be filled with null] 
     * @param ct    [necessary] A cancellationToken through which the Future can be easily cancelled before it starts running
     * @return  A Future performing the Task and returning the uploaded Document
     */
    public CompletableFuture<DeserializedHttpResponseGen<Document>> postToUploadDocumentForDocumentAsync(String fileCabinetId, InputStream data, Boolean processTextshot, Boolean imageProcessing, String redirect, String storeDialogId, Boolean checkFileNameForCheckinInfo, CancellationToken ct) {
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
        CompletableFuture<DeserializedHttpResponseGen<Document>> fut = LinkResolver.<Document>postAsync(this.getServiceDescription(), uri, "*/*", "application/xml", Document.class, data);
        if(ct!=null) ct.addFuture(fut);
        return fut;
    }
    
    /**
     * @param fileCabinetId [necessary] the Id of the Filecabinet
     * @param data  [necessary] the data represented as InputStream
     * @param processTextshot   [optional/ can be filled with null] 
     * @param imageProcessing   [optional/ can be filled with null] 
     * @param redirect  [optional/ can be filled with null] 
     * @param storeDialogId [optional/ can be filled with null] 
     * @param checkFileNameForCheckinInfo   [optional/ can be filled with null] 
     * @return  A Future performing the Task and returning the uploaded Document
     */
    public CompletableFuture<DeserializedHttpResponseGen<Document>> postToUploadDocumentForDocumentAsync(String fileCabinetId, InputStream data, Boolean processTextshot, Boolean imageProcessing, String redirect, String storeDialogId, Boolean checkFileNameForCheckinInfo) {
        return postToUploadDocumentForDocumentAsync(fileCabinetId, data, processTextshot, imageProcessing, redirect, storeDialogId, checkFileNameForCheckinInfo, null);
    }
    
    /**
     * @param id    [necessary] The id of the Document
     * @param fileCabinetId [necessary] The id of the Filecabinet containing the Document
     * @param ct    [necessary] A cancellationToken through which the Future can be easily cancelled before it starts running
     * @return  A Future performing the Task and returning the DocumentIndexFields
     */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentIndexFields>> getFromDocumentIndexFieldsForDocumentIndexFieldsAsync(int id, String fileCabinetId, CancellationToken ct) {
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
        CompletableFuture<DeserializedHttpResponseGen<DocumentIndexFields>> fut = LinkResolver.<DocumentIndexFields>getAsync(this.getServiceDescription(), uri, "application/xml", DocumentIndexFields.class);
        if(ct!=null)ct.addFuture(fut);
        return fut;
    }
    
    /**
     * @param id    [necessary] The id of the Document
     * @param fileCabinetId [necessary] The id of the Filecabinet containing the Document
     * @return  A Future performing the Task and returning the DocumentIndexFields
     */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentIndexFields>> getFromDocumentIndexFieldsForDocumentIndexFieldsAsync(int id, String fileCabinetId) {
        return getFromDocumentIndexFieldsForDocumentIndexFieldsAsync(id, fileCabinetId, null);
    }

     /**
     * @param id    [necessary] The id of the Document
     * @param fileCabinetId [necessary] The id of the Filecabinet containing the Document
     * @param data  [necessary] The DocumentIndexFields to append to the Document
     * @param ct    [necessary] A cancellationToken through which the Future can be easily cancelled before it starts running
     * @return  A Future performing the Task and returning the uploaded DocumentIndexFields
     */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentIndexFields>> putToDocumentIndexFieldsForDocumentIndexFieldsAsync(int id, String fileCabinetId, DocumentIndexFields data, CancellationToken ct) {
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
        CompletableFuture<DeserializedHttpResponseGen<DocumentIndexFields>> fut = LinkResolver.<DocumentIndexFields, DocumentIndexFields>putAsync(this.getServiceDescription(), uri, "application/xml", "application/xml", DocumentIndexFields.class, DocumentIndexFields.class, "DocumentIndexFields", data);
        if(ct!=null) ct.addFuture(fut);
        return fut;
    }
        
    /**
     * @param id    [necessary] The id of the Document
     * @param fileCabinetId [necessary] The id of the Filecabinet containing the Document
     * @param data  [necessary] The DocumentIndexFields to append to the Document
     * @return  A Future performing the Task and returning the uploaded DocumentIndexFields
     */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentIndexFields>> putToDocumentIndexFieldsForDocumentIndexFieldsAsync(int id, String fileCabinetId, DocumentIndexFields data) {
        return putToDocumentIndexFieldsForDocumentIndexFieldsAsync(id, fileCabinetId, data, null);
    }

    /**
     * @param id    [necessary] The id of the Document
     * @param fileCabinetId [necessary] The id of the Filecabinet containing the Document
     * @param data  [necessary] The UpdateIndexFieldsInfo to append to the Document
     * @param ct    [necessary] A cancellationToken through which the Future can be easily cancelled before it starts running
     * @return  A Future performing the Task and returning the DocumentIndexFields
     */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentIndexFields>> putToDocumentIndexFieldsForDocumentIndexFieldsAsync(int id, String fileCabinetId, UpdateIndexFieldsInfo data, CancellationToken ct) {
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
        CompletableFuture<DeserializedHttpResponseGen<DocumentIndexFields>> fut = LinkResolver.<DocumentIndexFields, UpdateIndexFieldsInfo>putAsync(this.getServiceDescription(), uri, "application/xml", "application/xml", DocumentIndexFields.class, UpdateIndexFieldsInfo.class, "UpdateIndexFieldsInfo", data);
        if(ct!=null) ct.addFuture(fut);
        return fut;
    }
    
    /**
     * @param id    [necessary] The id of the Document
     * @param fileCabinetId [necessary] The id of the Filecabinet containing the Document
     * @param data  [necessary] The UpdateIndexFieldsInfo to append to the Document
     * @return  A Future performing the Task and returning the DocumentIndexFields
     */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentIndexFields>> putToDocumentIndexFieldsForDocumentIndexFieldsAsync(int id, String fileCabinetId, UpdateIndexFieldsInfo data) {
        return putToDocumentIndexFieldsForDocumentIndexFieldsAsync(id, fileCabinetId, data, null);
    }

    /**
     * @param id    [necessary] The id of the Document
     * @param fileCabinetId [necessary] The id of the Filecabinet containing the Document
     * @param data  [necessary] The DocumentIndexFields
     * @param ct    [necessary] A cancellationToken through which the Future can be easily cancelled before it starts running
     * @return  A Future performing the Task and returning the DocumentIndexFields
     */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentIndexFields>> postToDocumentIndexFieldsForDocumentIndexFieldsAsync(int id, String fileCabinetId, DocumentIndexFields data, CancellationToken ct) {
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
        CompletableFuture<DeserializedHttpResponseGen<DocumentIndexFields>> fut =  LinkResolver.<DocumentIndexFields, DocumentIndexFields>postAsync(this.getServiceDescription(), uri, "application/xml", "application/xml", DocumentIndexFields.class, DocumentIndexFields.class, "DocumentIndexFields", data);
        if(ct!=null) ct.addFuture(fut);
        return fut;
    }
    
    /**
     * @param id    [necessary] The id of the Document
     * @param fileCabinetId [necessary] The id of the Filecabinet containing the Document
     * @param data  [necessary] The DocumentIndexFields
     * @return  A Future performing the Task and returning the DocumentIndexFields
     */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentIndexFields>> postToDocumentIndexFieldsForDocumentIndexFieldsAsync(int id, String fileCabinetId, DocumentIndexFields data) {
        return postToDocumentIndexFieldsForDocumentIndexFieldsAsync(id, fileCabinetId, data, null);
    }

    /**
     * @param id    [necessary] The id of the Document
     * @param fileCabinetId [necessary] The id of the Filecabinet containing the Document
     * @param data  [necessary] The UpdateIndexFieldsInfo
     * @param ct    [necessary] A cancellationToken through which the Future can be easily cancelled before it starts running
     * @return  A Future performing the Task and returning the DocumentIndexFields
     */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentIndexFields>> postToDocumentIndexFieldsForDocumentIndexFieldsAsync(int id, String fileCabinetId, UpdateIndexFieldsInfo data, CancellationToken ct) {
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
        CompletableFuture<DeserializedHttpResponseGen<DocumentIndexFields>> fut = LinkResolver.<DocumentIndexFields, UpdateIndexFieldsInfo>postAsync(this.getServiceDescription(), uri, "application/xml", "application/xml", DocumentIndexFields.class, UpdateIndexFieldsInfo.class, "UpdateIndexFieldsInfo", data);
        if(ct!=null) ct.addFuture(fut);
        return fut;
    }
    
    /**
     * @param id    [necessary] The id of the Document
     * @param fileCabinetId [necessary] The id of the Filecabinet containing the Document
     * @param data  [necessary] The DocumentIndexFields
     * @return  A Future performing the Task and returning the DocumentIndexFields
     */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentIndexFields>> postToDocumentIndexFieldsForDocumentIndexFieldsAsync(int id, String fileCabinetId, UpdateIndexFieldsInfo data) {
        return postToDocumentIndexFieldsForDocumentIndexFieldsAsync(id,  fileCabinetId, data, null);
    }
    
    /**
     * @param id    [necessary] The Id of the Document
     * @param fileCabinetId [necessary] The id of the Filecabinet containing the Document
     * @param normalizeCoordinates  [optional/ can be filled with null]
     * @param ct    [necessary] A cancellationToken through which the Future can be easily cancelled before it starts running
     * @return  A Future performing the Task and returning the SuggestionsFields
     */
    public CompletableFuture<DeserializedHttpResponseGen<SuggestionFields>> getFromIntellixSuggestionsForSuggestionFieldsAsync(int id, String fileCabinetId, Boolean normalizeCoordinates, CancellationToken ct) {
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
        CompletableFuture<DeserializedHttpResponseGen<SuggestionFields>> fut = LinkResolver.<SuggestionFields>getAsync(this.getServiceDescription(), uri, "application/xml", SuggestionFields.class);
        if(ct!=null) ct.addFuture(fut);
        return fut;
    }
    
     /**
     * @param id    [necessary] The Id of the Document
     * @param fileCabinetId [necessary] The id of the Filecabinet containing the Document
     * @param normalizeCoordinates  [optional/ can be filled with null]
     * @return  A Future performing the Task and returning the SuggestionsFields
     */
    public CompletableFuture<DeserializedHttpResponseGen<SuggestionFields>> getFromIntellixSuggestionsForSuggestionFieldsAsync(int id, String fileCabinetId, Boolean normalizeCoordinates) {
        return getFromIntellixSuggestionsForSuggestionFieldsAsync(id, fileCabinetId, normalizeCoordinates, null);
    }
    
    /**
     * @param id    [necessary] The id of the Document
     * @param fileCabinetId [necessary] The id of the Filecabinet containing the Document
     * @param targetFileType    [optional/ can be filled with null] The file type
     * @param keepAnnotations   [optional/ can be filled with null] boolean determing to keep the Annotations or not
     * @param downloadFile  [optional/ can be filled with null] Boolean determing if file is downloaded
     * @param layers    [optional/ can be filled with null]
     * @param autoPrint [optional/ can be filled with null]
     * @param append    [optional/ can be filled with null]
     * @param ct    [necessary] A cancellationToken through which the Future can be easily cancelled before it starts running
     * @return  A Future performing the Task and returning the Document as InputStream
     */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getFromDocumentsFileDownloadForStreamAsync(int id, String fileCabinetId, FileDownloadType targetFileType, Boolean keepAnnotations, Boolean downloadFile, Boolean autoPrint, int[] layers, int[] append, CancellationToken ct) {
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
        CompletableFuture<DeserializedHttpResponseGen<InputStream>> fut = LinkResolver.<InputStream>getAsync(this.getServiceDescription(), uri, "*/*", InputStream.class);
        if(ct!=null) ct.addFuture(fut);
        return fut;
    }
    
    /**
     * @param id    [necessary] The id of the Document
     * @param fileCabinetId [necessary] The id of the Filecabinet containing the Document
     * @param targetFileType    [optional/ can be filled with null] The file type
     * @param keepAnnotations   [optional/ can be filled with null] boolean determing to keep the Annotations or not
     * @param downloadFile  [optional/ can be filled with null] Boolean determing if file is downloaded
     * @param layers    [optional/ can be filled with null]
     * @param autoPrint [optional/ can be filled with null]
     * @param append    [optional/ can be filled with null]
     * @return  A Future performing the Task and returning the Document as InputStream
     */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getFromDocumentsFileDownloadForStreamAsync(int id, String fileCabinetId, FileDownloadType targetFileType, Boolean keepAnnotations, Boolean downloadFile, Boolean autoPrint, int[] layers, int[] append) {
        return getFromDocumentsFileDownloadForStreamAsync(id, fileCabinetId, targetFileType, keepAnnotations, downloadFile, autoPrint, layers, append ,null);
    }
    
    /**
     * @param id    [necessary] The id of the Document
     * @param fileCabinetId [necessary] The id of the Filecabinet containing the Document
     * @param data  [necessary] The rights to be posted
     * @param ct    [necessary] A cancellationToken through which the Future can be easily cancelled before it starts running
     * @return  A Future performing the Task and returning the uploaded Rights
     */
    public CompletableFuture<DeserializedHttpResponseGen<Rights>> postToDocumentRightsForRightsAsync(int id, String fileCabinetId, Rights data, CancellationToken ct) {
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
        CompletableFuture<DeserializedHttpResponseGen<Rights>> fut= LinkResolver.<Rights, Rights>postAsync(this.getServiceDescription(), uri, "application/xml", "application/xml", Rights.class, Rights.class, "Rights", data);
        if(ct!=null) ct.addFuture(fut);
        return fut;
    }
    
    /**
     * @param id    [necessary] The id of the Document
     * @param fileCabinetId [necessary] The id of the Filecabinet containing the Document
     * @param data  [necessary] The rights to be posted
     * @return  A Future performing the Task and returning the uploaded Rights
     */
    public CompletableFuture<DeserializedHttpResponseGen<Rights>> postToDocumentRightsForRightsAsync(int id, String fileCabinetId, Rights data) {
        return postToDocumentRightsForRightsAsync(id, fileCabinetId, data, null);
    }
   
    /**
     * @param id    [necessary] The id of the Document
     * @param fileCabinetId [necessary] The id of the Filecabinet containing the Document
     * @param ct    [necessary] A cancellationToken through which the Future can be easily cancelled before it starts running
     * @return  A Future performing the Task and returning DocumentLinks
     */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentLinks>> getFromDocumentDocumentLinksForDocumentLinksAsync(int id, String fileCabinetId, CancellationToken ct) {
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
        CompletableFuture<DeserializedHttpResponseGen<DocumentLinks>> fut = LinkResolver.<DocumentLinks>getAsync(this.getServiceDescription(), uri, "application/xml", DocumentLinks.class);
        if(ct!=null) ct.addFuture(fut);
        return fut;
    }
    
    /**
     * @param id    [necessary] The id of the Document
     * @param fileCabinetId [necessary] The id of the Filecabinet containing the Document
     * @return  A Future performing the Task and returning DocumentLinks
     */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentLinks>> getFromDocumentDocumentLinksForDocumentLinksAsync(int id, String fileCabinetId) {
        return getFromDocumentDocumentLinksForDocumentLinksAsync(id,  fileCabinetId, null);
    }

    /**
     * @param id    [necessary] The id of the Document
     * @param fileCabinetId [necessary] The id of the Filecabinet containing the Document
     * @param data  [necessary] The data
     * @param ct    [necessary] A cancellationToken through which the Future can be easily cancelled before it starts running
     * @return  A Future performing the Task and returning an Inputstream
     */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> postToCheckoutForStreamAsync(int id, String fileCabinetId, CheckOutToFileSystemInfo data, CancellationToken ct) {
        class Param {

            int id;
            String fileCabinetId;

            public Param(int id, String fileCabinetId) {
                this.id = id;
                this.fileCabinetId = fileCabinetId;
            }
        }
        Param parameters = new Param(id, fileCabinetId);
        URI uri = buildUri(parameters, "checkout");
        CompletableFuture<DeserializedHttpResponseGen<InputStream>> fut = LinkResolver.<InputStream, CheckOutToFileSystemInfo>postAsync(this.getServiceDescription(), uri, "application/xml", "*/*", InputStream.class, CheckOutToFileSystemInfo.class, "CheckOutToFileSystemInfo", data);
        if(ct!=null) ct.addFuture(fut);
        return fut;
    }
    
    /**
     * @param id    [necessary] The id of the Document
     * @param fileCabinetId [necessary] The id of the Filecabinet containing the Document
     * @param data  [necessary] The data
     * @return  A Future performing the Task and returning an Inputstream
     */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> postToCheckoutForStreamAsync(int id, String fileCabinetId, CheckOutToFileSystemInfo data) {
        return postToCheckoutForStreamAsync(id, fileCabinetId, data, null);
    }
    
    /**
     * @param id    [necessary] The id of the Document
     * @param fileCabinetId [necessary] The id of the Filecabinet containing the Document
     * @param data  [necessary] The CheckOutTOFileSysteInfo data
     * @param ct    [necessary] A cancellationToken through which the Future can be easily cancelled before it starts running
     * @return  A Future performing the Task and returning the CheckOutResult
     */
    public CompletableFuture<DeserializedHttpResponseGen<CheckOutResult>> postToCheckoutDocumentForCheckOutResultAsync(int id, String fileCabinetId, CheckOutToFileSystemInfo data, CancellationToken ct) {
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
        CompletableFuture<DeserializedHttpResponseGen<CheckOutResult>> fut= LinkResolver.<CheckOutResult, CheckOutToFileSystemInfo>postAsync(this.getServiceDescription(), uri, "application/xml", "application/xml", CheckOutResult.class, CheckOutToFileSystemInfo.class, "CheckOutToFileSystemInfo", data);
        if(ct!=null) ct.addFuture(fut);
        return fut;
    }
    
    /**
     * @param id    [necessary] The id of the Document
     * @param fileCabinetId [necessary] The id of the Filecabinet containing the Document
     * @param data  [necessary] The CheckOutTOFileSysteInfo data
     * @return  A Future performing the Task and returning the CheckOutResult
     */
    public CompletableFuture<DeserializedHttpResponseGen<CheckOutResult>> postToCheckoutDocumentForCheckOutResultAsync(int id, String fileCabinetId, CheckOutToFileSystemInfo data) {
        return postToCheckoutDocumentForCheckOutResultAsync(id, fileCabinetId, data, null);
    }

    /**
     * @param id    [necessary] The id of the Document
     * @param fileCabinetId [necessary] The id of the Filecabinet containing the Document
     * @param data  [necessary] The data to checkin
     * @param ct    [necessary] A cancellationToken through which the Future can be easily cancelled before it starts running
     * @return  A Future performing the Task and returning checkin Document
     */
    public CompletableFuture<DeserializedHttpResponseGen<Document>> postToCheckinForDocumentAsync(int id, String fileCabinetId, MultiPart data, CancellationToken ct) {
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
        System.out.println(uri);
        CompletableFuture<DeserializedHttpResponseGen<Document>> fut = LinkResolver.<Document>postMultiPartAsync(this.getServiceDescription(), uri, "application/xml", Document.class, data);
        if(ct!=null) ct.addFuture(fut);
        return fut;
    }
    
    /**
     * @param id    [necessary] The id of the Document
     * @param fileCabinetId [necessary] The id of the Filecabinet containing the Document
     * @param data  [necessary] The data to checkin
     * @return  A Future performing the Task and returning checkin Document
     */
    public CompletableFuture<DeserializedHttpResponseGen<Document>> postToCheckinForDocumentAsync(int id, String fileCabinetId, MultiPart data) {
        return postToCheckinForDocumentAsync(id, fileCabinetId, data, null);
    }
    
    /**
     * @param id    [necessary] The id of the Document
     * @param fileCabinetId [necessary] The id of the Filecabinet containing the Document
     * @param ct    [necessary] A cancellationToken through which the Future can be easily cancelled before it starts running
     * @return  A Future performing the Task and returning the DocumentAnnotations
     */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentAnnotations>> getFromDocumentAnnotationsForDocumentAnnotationsAsync(int id, String fileCabinetId, CancellationToken ct) {
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
        CompletableFuture<DeserializedHttpResponseGen<DocumentAnnotations>> fut = LinkResolver.<DocumentAnnotations>getAsync(this.getServiceDescription(), uri, "application/xml", DocumentAnnotations.class);
        if(ct!=null) ct.addFuture(fut);
        return fut;
    }
    
    /**
     * @param id    [necessary] The id of the Document
     * @param fileCabinetId [necessary] The id of the Filecabinet containing the Document
     * @return  A Future performing the Task and returning the DocumentAnnotations
     */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentAnnotations>> getFromDocumentAnnotationsForDocumentAnnotationsAsync(int id, String fileCabinetId) {
        return getFromDocumentAnnotationsForDocumentAnnotationsAsync(id, fileCabinetId, null);
    }

    /**
     * @param id    [necessary] The id of the Document
     * @param fileCabinetId [necessary] The id of the Filecabinet containing the Document
     * @param data  [necessary] The DocumentAnnotationsPlacement data to post
     * @param ct    [necessary] A cancellationToken through which the Future can be easily cancelled before it starts running
     * @return  A Future performing the Task and returning the DocumentAnnotations
     */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentAnnotations>> postToDocumentAnnotationsForDocumentAnnotationsAsync(int id, String fileCabinetId, DocumentAnnotationsPlacement data, CancellationToken ct) {
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
        CompletableFuture<DeserializedHttpResponseGen<DocumentAnnotations>> fut = LinkResolver.<DocumentAnnotations, DocumentAnnotationsPlacement>postAsync(this.getServiceDescription(), uri, "application/xml", "application/xml", DocumentAnnotations.class, DocumentAnnotationsPlacement.class, "DocumentAnnotationsPlacement", data);
        if(ct!=null) ct.addFuture(fut);
        return fut;
    }
    
    /**
     * @param id    [necessary] The id of the Document
     * @param fileCabinetId [necessary] The id of the Filecabinet containing the Document
     * @param data  [necessary] The DocumentAnnotationsPlacement data to post
     * @return  A Future performing the Task and returning the DocumentAnnotations
     */
    public CompletableFuture<DeserializedHttpResponseGen<DocumentAnnotations>> postToDocumentAnnotationsForDocumentAnnotationsAsync(int id, String fileCabinetId, DocumentAnnotationsPlacement data) {
        return postToDocumentAnnotationsForDocumentAnnotationsAsync(id, fileCabinetId, data, null);
    }

    /**
     * @param fileCabinetId [necessary] The id of the Filecabinet to get
     * @param ct    [necessary] A cancellationToken through which the Future can be easily cancelled before it starts running
     * @return  A Future performing the Task and returning the FileCabinet
     */
    public CompletableFuture<DeserializedHttpResponseGen<FileCabinet>> getFromFileCabinetForFileCabinetAsync(String fileCabinetId, CancellationToken ct) {
        class Param {

            String fileCabinetId;

            public Param(String fileCabinetId) {
                this.fileCabinetId = fileCabinetId;
            }
        }
        Param parameters = new Param(fileCabinetId);
        URI uri  = buildUri(parameters, "fileCabinet");
        CompletableFuture<DeserializedHttpResponseGen<FileCabinet>> fut = LinkResolver.<FileCabinet>getAsync(this.getServiceDescription(), uri, "application/xml", FileCabinet.class);
        if(ct!=null) ct.addFuture(fut);
        return fut;
    }
    
    /**
     * @param fileCabinetId [necessary] The id of the Filecabinet to get
     * @return  A Future performing the Task and returning the FileCabinet
     */
    public CompletableFuture<DeserializedHttpResponseGen<FileCabinet>> getFromFileCabinetForFileCabinetAsync(String fileCabinetId) {
        return getFromFileCabinetForFileCabinetAsync(fileCabinetId, null);
    }

    /**
     * @param id    [necessary] The id
     * @param fileCabinetId [necessary] The id of the Filecabinet
     * @param start [optional/ can be filled with null]
     * @param count [optional/ can be filled with null]
     * @param embedThumbnailData    [optional/ can be filled with null]
     * @param thumbnailsOnly    [optional/ can be filled with null]
     * @param thumbnailSize [optional/ can be filled with null]
     * @param ct    [necessary] A cancellationToken through which the Future can be easily cancelled before it starts running
     * @return  A Future performing the Task and returning the Pages
     */
    public CompletableFuture<DeserializedHttpResponseGen<Pages>> getFromPagesBlockForPagesAsync(String id, String fileCabinetId, Integer start, Integer count, Boolean embedThumbnailData, String thumbnailSize, Boolean thumbnailsOnly, CancellationToken ct) {
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
        CompletableFuture<DeserializedHttpResponseGen<Pages>> fut = LinkResolver.<Pages>getAsync(this.getServiceDescription(), uri, "application/xml", Pages.class);
        if(ct!=null) ct.addFuture(fut);
        return fut;
    }
    
    /**
     * @param id    [necessary] The id
     * @param fileCabinetId [necessary] The id of the Filecabinet
     * @param start [optional/ can be filled with null]
     * @param count [optional/ can be filled with null]
     * @param embedThumbnailData    [optional/ can be filled with null]
     * @param thumbnailsOnly    [optional/ can be filled with null]
     * @param thumbnailSize [optional/ can be filled with null]
     * @return  A Future performing the Task and returning the Pages
     */
    public CompletableFuture<DeserializedHttpResponseGen<Pages>> getFromPagesBlockForPagesAsync(String id, String fileCabinetId, Integer start, Integer count, Boolean embedThumbnailData, String thumbnailSize, Boolean thumbnailsOnly) {
        return getFromPagesBlockForPagesAsync(id, fileCabinetId, start, count, embedThumbnailData, thumbnailSize, thumbnailsOnly, null);
    }

    /**
     * @param id    [necessary] The id
     * @param fileCabinetId [necessary] The id of the Filecabinet
     * @param page  [necessary] The number of the page
     * @param ct    [necessary] A cancellationToken through which the Future can be easily cancelled before it starts running
     * @return  A Future performing the Task and returning the Annotation
     */
    public CompletableFuture<DeserializedHttpResponseGen<Annotation>> getFromAnnotationForAnnotationAsync(String id, String fileCabinetId, int page, CancellationToken ct) {
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
        CompletableFuture<DeserializedHttpResponseGen<Annotation>> fut = LinkResolver.<Annotation>getAsync(this.getServiceDescription(), uri, "application/xml", Annotation.class);
        if(ct!=null) ct.addFuture(fut);
        return fut;
    }
    
    /**
     * @param id    [necessary] The id
     * @param fileCabinetId [necessary] The id of the Filecabinet
     * @param page  [necessary] The number of the page
     * @return  A Future performing the Task and returning the Annotation
     */
    public CompletableFuture<DeserializedHttpResponseGen<Annotation>> getFromAnnotationForAnnotationAsync(String id, String fileCabinetId, int page) {
        return getFromAnnotationForAnnotationAsync(id, fileCabinetId, page, null);
    }
    
    /**
     * @param id    [necessary] The id
     * @param fileCabinetId [necessary] The id of the Filecabinet
     * @param page  [necessary] The number of the page
     * @param data  [necessary] The Annotation data to put
     * @param ct    [necessary] A cancellationToken through which the Future can be easily cancelled before it starts running
     * @return  A Future performing the Task and returning the Annotation
     */
    public CompletableFuture<DeserializedHttpResponseGen<Annotation>> putToAnnotationForAnnotationAsync(String id, String fileCabinetId, int page, Annotation data, CancellationToken ct) {
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
        CompletableFuture<DeserializedHttpResponseGen<Annotation>> fut = LinkResolver.<Annotation, Annotation>putAsync(this.getServiceDescription(), uri, "application/xml", "application/xml", Annotation.class, Annotation.class, "Annotation", data);
        if(ct!=null) ct.addFuture(fut);
        return fut;
    }
    
    /**
     * @param id    [necessary] The id
     * @param fileCabinetId [necessary] The id of the Filecabinet
     * @param page  [necessary] The number of the page
     * @param data  [necessary] The Annotation data to put
     * @return  A Future performing the Task and returning the Annotation
     */
    public CompletableFuture<DeserializedHttpResponseGen<Annotation>> putToAnnotationForAnnotationAsync(String id, String fileCabinetId, int page, Annotation data) {
        return putToAnnotationForAnnotationAsync(id, fileCabinetId, page, data, null);
    }

    /**
     * @param id    [necessary] The id
     * @param fileCabinetId [necessary] The id of the Filecabinet
     * @param page  [necessary] The number of the page
     * @param data  [necessary] The AnnotationPlacement data to put
     * @param ct    [necessary] A cancellationToken through which the Future can be easily cancelled before it starts running
     * @return  A Future performing the Task and returning the Annotation
     */
    public CompletableFuture<DeserializedHttpResponseGen<Annotation>> putToAnnotationForAnnotationAsync(String id, String fileCabinetId, int page, AnnotationsPlacement data, CancellationToken ct) {
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
        CompletableFuture<DeserializedHttpResponseGen<Annotation>> fut  = LinkResolver.<Annotation, AnnotationsPlacement>putAsync(this.getServiceDescription(), uri, "application/xml", "application/xml", Annotation.class, AnnotationsPlacement.class, "AnnotationsPlacement", data);
        if(ct!=null) ct.addFuture(fut);
        return fut;
    }
    
    /**
     * @param id    [necessary] The id
     * @param fileCabinetId [necessary] The id of the Filecabinet
     * @param page  [necessary] The number of the page
     * @param data  [necessary] The AnnotationPlacement data to put
     * @return  A Future performing the Task and returning the Annotation
     */
    public CompletableFuture<DeserializedHttpResponseGen<Annotation>> putToAnnotationForAnnotationAsync(String id, String fileCabinetId, int page, AnnotationsPlacement data) {
        return putToAnnotationForAnnotationAsync(id, fileCabinetId, page, data, null);
    }

    /**
     * @param id    [necessary] The id
     * @param fileCabinetId [necessary] The id of the Filecabinet
     * @param page  [necessary] The number of the page
     * @param data  [necessary] The Annotation data to post
     * @param ct    [necessary] A cancellationToken through which the Future can be easily cancelled before it starts running
     * @return  A Future performing the Task and returning the Annotation
     */
    public CompletableFuture<DeserializedHttpResponseGen<Annotation>> postToAnnotationForAnnotationAsync(String id, String fileCabinetId, int page, Annotation data, CancellationToken ct) {
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
        CompletableFuture<DeserializedHttpResponseGen<Annotation>> fut= LinkResolver.<Annotation, Annotation>postAsync(this.getServiceDescription(), uri, "application/xml", "application/xml", Annotation.class, Annotation.class, "Annotation", data);
        if(ct!=null) ct.addFuture(fut);
        return fut;
    }
    
    /**
     * @param id    [necessary] The id
     * @param fileCabinetId [necessary] The id of the Filecabinet
     * @param page  [necessary] The number of the page
     * @param data  [necessary] The Annotation data to post
     * @return  A Future performing the Task and returning the Annotation
     */
    public CompletableFuture<DeserializedHttpResponseGen<Annotation>> postToAnnotationForAnnotationAsync(String id, String fileCabinetId, int page, Annotation data) {
        return postToAnnotationForAnnotationAsync(id, fileCabinetId, page, data, null);
    }
    
    /**
     * @param id    [necessary] The id
     * @param fileCabinetId [necessary] The id of the Filecabinet
     * @param page  [necessary] The number of the page
     * @param data  [necessary] The AnnotationPlacement data to post
     * @param ct    [necessary] A cancellationToken through which the Future can be easily cancelled before it starts running
     * @return  A Future performing the Task and returning the Annotation
     */
    public CompletableFuture<DeserializedHttpResponseGen<Annotation>> postToAnnotationForAnnotationAsync(String id, String fileCabinetId, int page, AnnotationsPlacement data, CancellationToken ct) {
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
        CompletableFuture<DeserializedHttpResponseGen<Annotation>> fut = LinkResolver.<Annotation, AnnotationsPlacement>postAsync(this.getServiceDescription(), uri, "application/xml", "application/xml", Annotation.class, AnnotationsPlacement.class, "AnnotationsPlaement", data);
        if(ct!=null) ct.addFuture(fut);
        return fut;
    }
    
    /**
     * @param id    [necessary] The id
     * @param fileCabinetId [necessary] The id of the Filecabinet
     * @param page  [necessary] The number of the page
     * @param data  [necessary] The AnnotationPlacement data to post
     * @return  A Future performing the Task and returning the Annotation
     */
    public CompletableFuture<DeserializedHttpResponseGen<Annotation>> postToAnnotationForAnnotationAsync(String id, String fileCabinetId, int page, AnnotationsPlacement data) {
        return postToAnnotationForAnnotationAsync(id, fileCabinetId, page, data, null);
    }

    /**
     * @param orgId [necessary] The id of the organization
     * @param baseAddress   [optional/ can be replaced with null] The baseAddress
     * @param clientSetupVersion    [optional/ can be replaced with null] The version of the clientSetup
     * @param ct    [necessary] A cancellationToken through which the Future can be easily cancelled before it starts running
     * @return  A Future performing the Task and returning the JAXBElement
     */
    CompletableFuture<DeserializedHttpResponseGen<JAXBElement>> getFromClientSetupDataForXElementAsync(String orgId, String baseAddress, String clientSetupVersion, CancellationToken ct) {
        class Param {

            String orgId;
            String baseAddress;
            String clientSetupVersion;

            public Param(String ordId, String baseAddress, String clientSetupVersion) {
                this.orgId = ordId;
                this.baseAddress = baseAddress;
                this.clientSetupVersion = clientSetupVersion;
            }
        }
        Param parameters = new Param(orgId, baseAddress, clientSetupVersion);
        URI uri = buildUri(parameters, "clientSetupData");
        CompletableFuture<DeserializedHttpResponseGen<JAXBElement>> fut=  LinkResolver.<JAXBElement>getAsync(this.getServiceDescription(), uri, "*/*", JAXBElement.class);
        if(ct!=null) ct.addFuture(fut);
        return fut;
    }

    /**
     * @param orgId [necessary] The id of the organization
     * @param baseAddress   [optional/ can be replaced with null] The baseAddress
     * @param clientSetupVersion    [optional/ can be replaced with null] The version of the clientSetup
     * @return  A Future performing the Task and returning the JAXBElement
     */
    CompletableFuture<DeserializedHttpResponseGen<JAXBElement>> getFromClientSetupDataForXElementAsync(String orgId, String baseAddress, String clientSetupVersion) {
        return getFromClientSetupDataForXElementAsync(orgId, baseAddress, clientSetupVersion, null);
    }
    
    /**
     * @param id    [necessary] The id
     * @param data  [necessary] The UserValidation data
     * @param ct    [necessary] A cancellationToken through which the Future can be easily cancelled before it starts running
     * @return  A Future performing the Task
     */
    public CompletableFuture<DeserializedHttpResponseGen<String>> postToValidateUserForStringAsync(String id, UserValidation data, CancellationToken ct) {
        class Param {

            String id;

            public Param(String id) {
                this.id = id;
            }
        }
        Param parameters = new Param(id);
        URI uri = buildUri(parameters, "validateUser");
        CompletableFuture<DeserializedHttpResponseGen<String>> fut = LinkResolver.<String, UserValidation>postAsync(this.getServiceDescription(), uri, "application/xml", "text/plain", String.class, UserValidation.class, "UserValidation", data);
        if(ct!=null) ct.addFuture(fut);
        return fut;
    }

    /**
     * @param id    [necessary] The id
     * @param data  [necessary] The UserValidation data
     * @return  A Future performing the Task
     */
    public CompletableFuture<DeserializedHttpResponseGen<String>> postToValidateUserForStringAsync(String id, UserValidation data) {
        return postToValidateUserForStringAsync(id, data, null);
    }

     /**
     * Checks the specified file in <p>
     * 
     * Remarks : The name of fileToCheckin must be taken from {@Link #easyCheckOutToFileSystemAsync}"/>
     * 
     * @param fileToCheckin [necessary] The file to check in
     * @return  A future performing the checkin and returning the document
     */
    public CompletableFuture<DeserializedHttpResponseGen<Document>> easyCheckInFromFileSystemAsync(java.io.File fileToCheckin) {
        return EasyCheckoutCheckinExtensionsBase.easyCheckInFromFileSystemAsync(this, FileWrapper.toFileInfoWrapper(fileToCheckin));
    }

     /**
     * Checks the specified file in <p>
     * 
     * Remarks : The name of fileToCheckin must be taken from {@Link #easyCheckOutToFileSystemAsync}"/>
     * 
     * @param fileToCheckin [necessary] The file to check in
     * @param checkInParams [necessary] The check in parameters
     * @return  A future performing the checkin and returning the document
     */
    public CompletableFuture<DeserializedHttpResponseGen<Document>> easyCheckInFromFileSystemAsync(java.io.File fileToCheckin, CheckInActionParameters checkInParams) {
        return EasyCheckoutCheckinExtensionsBase.easyCheckInFromFileSystemAsync(this, FileWrapper.toFileInfoWrapper(fileToCheckin), checkInParams);
    }
    
    /**
     * Checks out the specified file and saves it to the file system asynchronously
     * 
     * @param fileCabinetId The file cabinet identifier
     * @param docId The document identifier
     * @return  A Future producung an instance of EasyCheckoutResult
     */
    public CompletableFuture<EasyCheckoutResult> easyCheckOutToFileSystemAsync(String fileCabinetId, int docId) {
        return EasyCheckoutCheckinExtensionsBase.easyCheckOutToFileSystemAsync(this, fileCabinetId, docId);
    }

    /**
     * @param id    [necessary] The id
     * @param selectListId  [necessary] The id of the selectList
     * @param ct    [necessary] A cancellationToken through which the Future can be easily cancelled before it starts running
     * @return  A Future performing the Task and returning the requested information
     */
     public CompletableFuture<DeserializedHttpResponseGen<SelectListInfo>> getFromSelectListForSelectListInfoAsync(String id, String selectListId, CancellationToken ct)
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
     URI uri = buildUri(parameters, "selectList");
     CompletableFuture<DeserializedHttpResponseGen<SelectListInfo>> fut = LinkResolver.<SelectListInfo>getAsync(this.getServiceDescription(), uri, "application/xml", SelectListInfo.class);
     if(ct!=null) ct.addFuture(fut);
     return fut;
     }
     
     /**
     * @param id    [necessary] The id
     * @param selectListId  [necessary] The id of the selectList
     * @return  A Future performing the Task and returning the requested information
     */
     public CompletableFuture<DeserializedHttpResponseGen<SelectListInfo>> getFromSelectListForSelectListInfoAsync(String id, String selectListId) {
         return getFromSelectListForSelectListInfoAsync(id, selectListId, null);
     }

    
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
