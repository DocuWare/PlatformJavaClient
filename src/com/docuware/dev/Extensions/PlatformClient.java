package com.docuware.dev.Extensions;

//import com.docuware.platform.client.gui.StoreDialogForm;
import com.docuware.dev.Test.bodyWriter;
import com.docuware.dev.schema._public.services.platform.ServiceDescription;
import com.sun.jersey.api.client.AsyncWebResource;
import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.ClientRequest;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.filter.ClientFilter;
import com.sun.jersey.api.client.filter.LoggingFilter;
import com.sun.jersey.client.apache.ApacheHttpClient;
import com.sun.jersey.client.apache.ApacheHttpClientHandler;
import com.sun.jersey.client.apache.config.ApacheHttpClientConfig;
import com.sun.jersey.client.apache.config.DefaultApacheHttpClientConfig;
import com.sun.jersey.multipart.impl.MultiPartWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.net.URI;
import javax.ws.rs.core.HttpHeaders;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.impl.client.BasicCredentialsProvider;

/**
 * This is one of the major classes working in the background of the client
 * It creates an ApacheHttpClient with the specified Filters and properties
 */
class PlatformClient {

    private final ApacheHttpClient client;
    private final LinkResolver linkResolver;
    private final WebResource webResource;

    private final ServiceDescription serviceDescription;

    public LinkResolver getLinkResolver() {
        return linkResolver;
    }

    public ApacheHttpClient getClient() {
        return client;
    }
    
    /**
     * A special create Method to create a Client supporting the Windows Authentification
     * 
     * @param sctd  the login data
     * @param baseUri   the baseuri to connect with
     * @param c the windows credentials
     * @return  the connected client
     */
    public ApacheHttpClient createApacheClientWindows(ServiceConnectionTransportData sctd, String baseUri, Credentials c) {
         ClientConfig cc = new DefaultApacheHttpClientConfig();
        cc.getClasses().add(MultiPartWriter.class);
        // turn on cookies support
        cc.getProperties().put(
                "com.sun.jersey.impl.client.httpclient.handleCookies", true);
        cc.getProperties().put("http.protocol.handle-redirects", true);
        CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
    //make sure to supply all 4 arguments to the  NTCredentials constructor
    credentialsProvider.setCredentials(AuthScope.ANY, c);
        cc.getProperties().put(ApacheHttpClientConfig.PROPERTY_CREDENTIALS_PROVIDER, credentialsProvider);
        return createApacheClient(sctd, baseUri, cc);
    }
    
    /**
     * Creates the client without any special input
     * 
     * @param sctd  the login data
     * @param baseUri   the baseUri to connet with
     * @return  the ApacheHttpClient
     */
    public ApacheHttpClient createApacheClientDefault(ServiceConnectionTransportData sctd, String baseUri) {
         ClientConfig cc = new DefaultApacheHttpClientConfig();
        cc.getClasses().add(MultiPartWriter.class);
        // turn on cookies support
        cc.getProperties().put(
                "com.sun.jersey.impl.client.httpclient.handleCookies", true);
        cc.getProperties().put("http.protocol.handle-redirects", true);
        return createApacheClient(sctd, baseUri, cc);
    }
    
    /**
     * Creates a ApacheHttpClient From a given ClientConfiguration
     * @param sctd  the login data
     * @param baseUri   the baseUri to connect with
     * @param cc    the ClientConfig
     * @return  the ApacheHttpClient
     */
    public ApacheHttpClient createApacheClient(ServiceConnectionTransportData sctd, String baseUri, ClientConfig cc) {
        // Initialize the HTTP client               
        ApacheHttpClient localClient = ApacheHttpClient.create(cc);
        if (sctd != null) {
            if (sctd.getHttpClientHandler() != null) {
                localClient = createApacheClientWithClientHandler(sctd.getHttpClientHandler());
            }
            if (sctd.getUserAgent() != null) {
                prepareUserAgent(localClient, sctd.getUserAgent());
            }
            if (sctd.getAcceptLanguage() != null) {
                prepareHttpClient(localClient, sctd.getAcceptLanguage());
            }
        }
        localClient.addFilter(new ClientFilter() {
            
            @Override
            public ClientResponse handle(ClientRequest cr) throws ClientHandlerException {
               cr.getHeaders().add(HttpHeaders.USER_AGENT, System.getProperty("java.specification.name").replace("Specification", "").trim().replace(" ", "+")+"/"+System.getProperty("java.version"));
               cr.getHeaders().add(HttpHeaders.USER_AGENT, PackageInfo.name+"/"+PackageInfo.version);
                return getNext().handle(cr);
            }
        });
        System.setProperty(
                "com.sun.jersey.impl.client.httpclient.handleCookies", "true");
        System.setProperty("http.protocol.handle-redirects", "true");

        return localClient;
    }

    /**
     * Creates a ApacheHttpClient from an ApacheHttpClientHandler
     * Be Aware that the clientHandler must hold all information to connect, to make the ApacheHttpClient work
     * 
     * @param ch    the ApacheClientHandler
     * @return 
     */
    private ApacheHttpClient createApacheClientWithClientHandler(ApacheHttpClientHandler ch) {
        return new ApacheHttpClient(ch);
    }

    /**
     * Adds the given UserAgents to a Filter applied to the client
     * A filter just performs someaction on each Request send by this client
     * In this special case, it adds the UserAgents to the UserAgent HeaderField
     * 
     * @param client    the Client, to which the Filter are added
     * @param UserAgents    the UserAgents, which are going to be added to the Header of each request
     */
    private void prepareUserAgent(ApacheHttpClient client, String[] UserAgents) {
        ClientFilter cf = new ClientFilter() {

            @Override
            public ClientResponse handle(ClientRequest cr) throws ClientHandlerException {
                for (String UserAgent : UserAgents) {
                    cr.getHeaders().add(HttpHeaders.USER_AGENT, UserAgent);
                }
                return getNext().handle(cr);
            }
        };
        client.addFilter(cf);
    }

    /**
     * Adds the given AcceptLanguages to a Filter applied to the client
     * A filter just performs someaction on each Request send by this client
     * In this special case, it adds the AcceptLanguages to the AcceptLanguage HeaderField
     * 
     * @param client   the Client, to which the Filter are added
     * @param AcceptLanguages    the AcceptLanguage, which are going to be added to the Header of each request
     */
    private void prepareHttpClient(ApacheHttpClient client, String[] AcceptLanguages) {
        ClientFilter cf = new ClientFilter() {

            @Override
            public ClientResponse handle(ClientRequest cr) throws ClientHandlerException {
                for (String AcceptLanguage : AcceptLanguages) {
                    cr.getHeaders().add(HttpHeaders.ACCEPT_LANGUAGE, AcceptLanguage);
                }
                return getNext().handle(cr);
            }
        };
        client.addFilter(cf);
    }

    /**
     * Initialises a new PlatformClient Object connected with the baseUri
     * 
     * @param baseURI   the baseUri to connect with
     * @param sctd  the login data
     */
    public PlatformClient(String baseURI, ServiceConnectionTransportData sctd) {

        client = createApacheClientDefault(sctd, baseURI);
        // The base URI of the DocuWare Platform services
        URI baseUri = URI.create(baseURI);
        linkResolver = new LinkResolver(baseUri, client);
        webResource = client.resource(baseUri);
        serviceDescription = webResource.get(ServiceDescription.class);
        HttpClientProxy proxy = new HttpClientProxy(this);
        serviceDescription.setProxy(proxy);
    }
    
    /**
     * Initialises a new PlatformClient Object connected with the baseUri
     * This is for windows login
     * 
     * @param baseURI   the baseUri to connect with
     * @param sctd  the login data
     * @param c     the windows credentials
     */
    public PlatformClient(String baseURI, ServiceConnectionTransportData sctd, Credentials c) {

        client = createApacheClientWindows(sctd, baseURI,c);
        // The base URI of the DocuWare Platform services
        URI baseUri = URI.create(baseURI);
        linkResolver = new LinkResolver(baseUri, client);
        webResource = client.resource(baseUri);
        serviceDescription = webResource.get(ServiceDescription.class);
        HttpClientProxy proxy = new HttpClientProxy(this);
        serviceDescription.setProxy(proxy);
    }
    
    /**
     * Initialises a new PlatformClinet Object connected with the BaseUri
     * 
     * @param baseURI   the baseUri to connect with
     * @param client    the client which should be used for the communication
     */
    public PlatformClient(String baseURI, ApacheHttpClient client) {

        this.client = client;
        // The base URI of the DocuWare Platform services
        URI baseUri = URI.create(baseURI);
        linkResolver = new LinkResolver(baseUri, client);
        webResource = client.resource(baseUri);
        serviceDescription = webResource.get(ServiceDescription.class);
        HttpClientProxy proxy = new HttpClientProxy(this);
        serviceDescription.setProxy(proxy);
    }

    public ServiceDescription getServiceDescription() {
        return serviceDescription;
    }

    public WebResource resource(URI uri) {
        return client.resource(uri);
    }

    public AsyncWebResource asyncResource(URI uri) {
        return client.asyncResource(uri);
    }

}
