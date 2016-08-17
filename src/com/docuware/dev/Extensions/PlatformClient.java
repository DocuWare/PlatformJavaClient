package com.docuware.dev.Extensions;

//import com.docuware.platform.client.gui.StoreDialogForm;
import com.docuware.dev.schema._public.services.platform.ServiceDescription;
import com.sun.jersey.api.client.AsyncWebResource;
import com.sun.jersey.api.client.ClientHandlerException;
import com.sun.jersey.api.client.ClientRequest;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.filter.ClientFilter;
import com.sun.jersey.client.apache.ApacheHttpClient;
import com.sun.jersey.client.apache.ApacheHttpClientHandler;
import com.sun.jersey.client.apache.config.DefaultApacheHttpClientConfig;
import com.sun.jersey.multipart.impl.MultiPartWriter;
import java.net.URI;
import java.util.concurrent.ForkJoinPool;
import javax.ws.rs.core.HttpHeaders;

public class PlatformClient {

    private ApacheHttpClient client;
    private LinkResolver linkResolver;
    private WebResource webResource;

    private ServiceDescription serviceDescription;

    public LinkResolver getLinkResolver() {
        return linkResolver;
    }

    public ApacheHttpClient getClient() {
        return client;
    }

    public ApacheHttpClient createApacheClientDefault(ServiceConnectionTransportData sctd, String baseUri) {
        ClientConfig cc = new DefaultApacheHttpClientConfig();
        cc.getClasses().add(MultiPartWriter.class);
        // turn on cookies support
        cc.getProperties().put(
                "com.sun.jersey.impl.client.httpclient.handleCookies", true);

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

            }
        }
        System.setProperty(
                "com.sun.jersey.impl.client.httpclient.handleCookies", "true");
        System.setProperty("http.protocol.handle-redirects", "true");

        return localClient;
    }

    private ApacheHttpClient createApacheClientWithClientHandler(ApacheHttpClientHandler ch) {
        return new ApacheHttpClient(ch);
    }

    private void prepareUserAgent(ApacheHttpClient client, String[] UserAgent) {
        ClientFilter cf = new ClientFilter() {

            @Override
            public ClientResponse handle(ClientRequest cr) throws ClientHandlerException {
                for (int i = 0; i < UserAgent.length; i++) {
                    cr.getHeaders().add(HttpHeaders.USER_AGENT, UserAgent[i]);
                }
                return client.handle(cr);
            }
        };
        client.addFilter(cf);
    }

    private void prepareHttpClient(ApacheHttpClient client, String[] AcceptLanguage) {
        ClientFilter cf = new ClientFilter() {

            @Override
            public ClientResponse handle(ClientRequest cr) throws ClientHandlerException {
                for (int i = 0; i < AcceptLanguage.length; i++) {
                    cr.getHeaders().add(HttpHeaders.ACCEPT_LANGUAGE, AcceptLanguage[i]);
                }
                return client.handle(cr);
            }
        };
        client.addFilter(cf);
    }

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
    /*
     private  HttpClientProxy CreateHttpClient(URI serviceUri, ApacheHttpClientHandler httpClientHandler)
     {
     PlatformClient  cl = createPlatformClient(serviceUri, httpClientHandler);
     HttpClientProxy httpClient = new HttpClientProxy(cl);
     return httpClient;
     }
         
     private  HttpClientProxy CreateHttpClient(URI serviceUri)
     {
     PlatformClient cl=  new PlatformClient(serviceUri.toString());
     HttpClientProxy httpClient = new HttpClientProxy(cl);
     return httpClient;
     }
         
     private PlatformClient createPlatformClient(URI serviceUri, ApacheHttpClientHandler httpClientHandler) {
     ApacheHttpClient proxyApacheClient = new ApacheHttpClient(httpClientHandler);
     PlatformClient cl = new PlatformClient(serviceUri.toString(), proxyApacheClient);
     return cl;
     }*/

    public ServiceDescription getServiceDescription() {
        return serviceDescription;
    }

    public WebResource resource(URI uri) {
        return client.resource(uri);
    }

    public AsyncWebResource asyncResource(URI uri) {
        return client.asyncResource(uri);
    }

    /*
     * Example on how to logon to DocuWare
     */
}
