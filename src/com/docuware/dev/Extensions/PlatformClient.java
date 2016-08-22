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
import javax.ws.rs.core.HttpHeaders;

public class PlatformClient {

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
                prepareHttpClient(localClient, sctd.getAcceptLanguage());
            }
        }
        localClient.addFilter(new ClientFilter() {
            
            @Override
            public ClientResponse handle(ClientRequest cr) throws ClientHandlerException {
               cr.clone().getHeaders().add(HttpHeaders.USER_AGENT, PackageInfo.name+"/"+PackageInfo.version);
                return getNext().handle(cr);
            }
        });
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
                for (String UserAgent1 : UserAgent) {
                    cr.getHeaders().add(HttpHeaders.USER_AGENT, UserAgent1);
                }
                return getNext().handle(cr);
            }
        };
        client.addFilter(cf);
    }

    private void prepareHttpClient(ApacheHttpClient client, String[] AcceptLanguage) {
        ClientFilter cf = new ClientFilter() {

            @Override
            public ClientResponse handle(ClientRequest cr) throws ClientHandlerException {
                for (String AcceptLanguage1 : AcceptLanguage) {
                    cr.getHeaders().add(HttpHeaders.ACCEPT_LANGUAGE, AcceptLanguage1);
                }
                return getNext().handle(cr);
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
