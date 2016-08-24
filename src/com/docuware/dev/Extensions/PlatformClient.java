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
import com.sun.jersey.client.apache.config.ApacheHttpClientConfig;
import com.sun.jersey.client.apache.config.DefaultApacheHttpClientConfig;
import com.sun.jersey.multipart.impl.MultiPartWriter;
import java.net.URI;
import javax.ws.rs.core.HttpHeaders;
import org.apache.commons.httpclient.NTCredentials;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.impl.client.BasicCredentialsProvider;

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
    
    public ApacheHttpClient createApacheClientDefault(ServiceConnectionTransportData sctd, String baseUri) {
         ClientConfig cc = new DefaultApacheHttpClientConfig();
        cc.getClasses().add(MultiPartWriter.class);
        // turn on cookies support
        cc.getProperties().put(
                "com.sun.jersey.impl.client.httpclient.handleCookies", true);
        cc.getProperties().put("http.protocol.handle-redirects", true);
        return createApacheClient(sctd, baseUri, cc);
    }
    
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
               for(String s: cr.getHeaders().keySet()) {
                   for(Object o: cr.getHeaders().get(s)) {
                       System.out.println(s + ": " + o);
                   }
               }
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
