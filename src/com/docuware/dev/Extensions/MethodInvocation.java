package com.docuware.dev.Extensions;

import com.docuware.dev.schema._public.services.Links;
import java.io.InputStream;
import java.net.URI;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBElement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Patrick
 */
public class MethodInvocation {

    public static <T, P> T postMultipart(IHttpClientProxy client, Links links, String rel, Class<T> expectedType, P postData) {
        return client.getProxy().getHttpClient().getLinkResolver().<T, P>postMultipart(client, links, rel, expectedType, postData);
    }

    public static <T, P> Future<DeserializedHttpResponseGen<T>> postMultipartAsync(IHttpClientProxy client, Links links, String rel, Class<T> expectedType, P postData) {
        return client.getProxy().getHttpClient().getLinkResolver().<T, P>postMultipartAsync(client, links, rel, expectedType, postData);
    }
    
    public static <T, P> Future<DeserializedHttpResponseGen<T>> postMultipartAsync(IHttpClientProxy client, Links links, String rel, Class<T> expectedType, P postData, CancellationToken ct) {
        Future<DeserializedHttpResponseGen<T>> fut = client.getProxy().getHttpClient().getLinkResolver().<T, P>postMultipartAsync(client, links, rel, expectedType, postData);
        if(ct!=null) ct.addFuture(fut);
        return fut;
    }

    public static <T> Future<DeserializedHttpResponseGen<T>> getAsync(IHttpClientProxy client, Links links, String rel, Class<T> expectedType) {
        return client.getProxy().getHttpClient().getLinkResolver().<T>getAsync(client, links, rel, expectedType);
    }
    
    public static <T> Future<DeserializedHttpResponseGen<T>> getAsync(IHttpClientProxy client, Links links, String rel, Class<T> expectedType, CancellationToken ct) {
        Future<DeserializedHttpResponseGen<T>> fut = client.getProxy().getHttpClient().getLinkResolver().<T>getAsync(client, links, rel, expectedType);
        if(ct!=null) ct.addFuture(fut);
        return fut;
    }
    
    public static <T, P> T post(IHttpClientProxy client, Links links, String rel, Class<T> expectedType, JAXBElement<P> postData) {
        return client.getProxy().getHttpClient().getLinkResolver().<T, P>post(client, links, rel, expectedType, postData);
    }

    public static <T, P> Future<DeserializedHttpResponseGen<T>> postAsync(IHttpClientProxy client, Links links, String rel, Class<T> expectedType, JAXBElement<P> postData) {
        return client.getProxy().getHttpClient().getLinkResolver().<T, P>postAsync(client, links, rel, expectedType, postData);
    }
    
    public static <T, P> Future<DeserializedHttpResponseGen<T>> postAsync(IHttpClientProxy client, Links links, String rel, Class<T> expectedType, JAXBElement<P> postData, CancellationToken ct) {
        Future<DeserializedHttpResponseGen<T>> fut = client.getProxy().getHttpClient().getLinkResolver().<T, P>postAsync(client, links, rel, expectedType, postData);
        if(ct!=null) ct.addFuture(fut);
        return fut;
    }

    public static <P> String post(IHttpClientProxy client, Links links, String rel, P postData) {
        return client.getProxy().getHttpClient().getLinkResolver().<P>post(client, links, rel, postData);
    }

    public static <P> Future<DeserializedHttpResponseGen<String>> postAsync(IHttpClientProxy client, Links links, String rel, P postData) {
        return client.getProxy().getHttpClient().getLinkResolver().<P>postAsync(client, links, rel, postData);
    }
    
    public static <P> Future<DeserializedHttpResponseGen<String>> postAsync(IHttpClientProxy client, Links links, String rel, P postData, CancellationToken ct) {
        Future<DeserializedHttpResponseGen<String>> fut = client.getProxy().getHttpClient().getLinkResolver().<P>postAsync(client, links, rel, postData);
        if(ct!=null) ct.addFuture(fut);
        return fut;
    }

    public static <T> T get(IHttpClientProxy client, Links links, String rel, Class<T> expectedType) {
        return client.getProxy().getHttpClient().getLinkResolver().<T>get(client, links, rel, expectedType);
    }

    public static <T, P> T post(IHttpClientProxy client, Links links, String rel, Class<T> expectedType, P postData, String bodyContentType) {
        return client.getProxy().getHttpClient().getLinkResolver().<T, P>post(client, links, rel, expectedType, postData, bodyContentType);
    }

    public static <T, P> Future<DeserializedHttpResponseGen<T>> postAsync(IHttpClientProxy client, Links links, String rel, Class<T> expectedType, P postData, String bodyContentType) {
        return client.getProxy().getHttpClient().getLinkResolver().<T, P>postAsync(client, links, rel, expectedType, postData, bodyContentType);
    }
    
    public static <T, P> Future<DeserializedHttpResponseGen<T>> postAsync(IHttpClientProxy client, Links links, String rel, Class<T> expectedType, P postData, String bodyContentType, CancellationToken ct) {
        Future<DeserializedHttpResponseGen<T>> fut = client.getProxy().getHttpClient().getLinkResolver().<T, P>postAsync(client, links, rel, expectedType, postData, bodyContentType);
        if(ct!=null) ct.addFuture(fut);
        return fut;
    }

    public static <T> T post(IHttpClientProxy client, Links links, String rel, Class<T> expectedType, InputStream postData) {
        return client.getProxy().getHttpClient().getLinkResolver().<T>post(client, links, rel, expectedType, postData);
    }

    public static <T> Future<DeserializedHttpResponseGen<T>> postAsync(IHttpClientProxy client, Links links, String rel, Class<T> expectedType, InputStream postData) {
        return client.getProxy().getHttpClient().getLinkResolver().<T>postAsync(client, links, rel, expectedType, postData);
    }
    
    public static <T> Future<DeserializedHttpResponseGen<T>> postAsync(IHttpClientProxy client, Links links, String rel, Class<T> expectedType, InputStream postData, CancellationToken ct) {
        Future<DeserializedHttpResponseGen<T>> fut = client.getProxy().getHttpClient().getLinkResolver().<T>postAsync(client, links, rel, expectedType, postData);
        if(ct!=null) ct.addFuture(fut);
        return fut;
    }

    public static <T> T put(IHttpClientProxy client, Links links, String rel, Class<T> expectedType) {
        return client.getProxy().getHttpClient().getLinkResolver().<T>put(client, links, rel, expectedType);
    }

    public static <T> Future<DeserializedHttpResponseGen<T>> putAsync(IHttpClientProxy client, Links links, String rel, Class<T> expectedType) {
        return client.getProxy().getHttpClient().getLinkResolver().<T>putAsync(client, links, rel, expectedType);
    }
    
    public static <T> Future<DeserializedHttpResponseGen<T>> putAsync(IHttpClientProxy client, Links links, String rel, Class<T> expectedType, CancellationToken ct) {
        Future<DeserializedHttpResponseGen<T>> fut = client.getProxy().getHttpClient().getLinkResolver().<T>putAsync(client, links, rel, expectedType);
        if(ct!=null) ct.addFuture(fut);
        return fut;
    }

    public static <T, P> T put(IHttpClientProxy client, Links links, String rel, Class<T> expectedType, JAXBElement<P> postData) {
        return client.getProxy().getHttpClient().getLinkResolver().<T, P>put(client, links, rel, expectedType, postData);
    }

    public static <T, P> Future<DeserializedHttpResponseGen<T>> putAsync(IHttpClientProxy client, Links links, String rel, Class<T> expectedType, JAXBElement<P> postData) {
        return client.getProxy().getHttpClient().getLinkResolver().<T, P>putAsync(client, links, rel, expectedType, postData);
    }
    
    public static <T, P> Future<DeserializedHttpResponseGen<T>> putAsync(IHttpClientProxy client, Links links, String rel, Class<T> expectedType, JAXBElement<P> postData, CancellationToken ct) {
        Future<DeserializedHttpResponseGen<T>> fut = client.getProxy().getHttpClient().getLinkResolver().<T, P>putAsync(client, links, rel, expectedType, postData);
        if(ct!=null) ct.addFuture(fut);
        return fut;
    }

    public static <P> String put(IHttpClientProxy client, Links links, String rel, P postData) {
        return client.getProxy().getHttpClient().getLinkResolver().<P>put(client, links, rel, postData);
    }

    public static <P> Future<DeserializedHttpResponseGen<String>> putAsync(IHttpClientProxy client, Links links, String rel, P postData) {
        return client.getProxy().getHttpClient().getLinkResolver().<P>putAsync(client, links, rel, postData);
    }
    
    public static <P> Future<DeserializedHttpResponseGen<String>> putAsync(IHttpClientProxy client, Links links, String rel, P postData, CancellationToken ct) {
        Future<DeserializedHttpResponseGen<String>> fut = client.getProxy().getHttpClient().getLinkResolver().<P>putAsync(client, links, rel, postData);
        if(ct!=null) ct.addFuture(fut);
        return fut;
    }

    public static <T, P> T put(IHttpClientProxy client, Links links, String rel, Class<T> expectedType, P postData, String bodyContentType) {
        return client.getProxy().getHttpClient().getLinkResolver().<T, P>put(client, links, rel, expectedType, postData, bodyContentType);
    }

    public static <T, P> Future<DeserializedHttpResponseGen<T>> putAsync(IHttpClientProxy client, Links links, String rel, Class<T> expectedType, P postData, String bodyContentType) {
        return client.getProxy().getHttpClient().getLinkResolver().<T, P>putAsync(client, links, rel, expectedType, postData, bodyContentType);
    }
    
    public static <T, P> Future<DeserializedHttpResponseGen<T>> putAsync(IHttpClientProxy client, Links links, String rel, Class<T> expectedType, P postData, String bodyContentType, CancellationToken ct) {
        Future<DeserializedHttpResponseGen<T>> fut= client.getProxy().getHttpClient().getLinkResolver().<T, P>putAsync(client, links, rel, expectedType, postData, bodyContentType);
        if(ct!=null) ct.addFuture(fut);
        return fut;
    }

    public static <T> T put(IHttpClientProxy client, Links links, String rel, Class<T> expectedType, InputStream postData) {
        return client.getProxy().getHttpClient().getLinkResolver().<T>put(client, links, rel, expectedType, postData);
    }

    public static <T> Future<DeserializedHttpResponseGen<T>> putAsync(IHttpClientProxy client, Links links, String rel, Class<T> expectedType, InputStream postData) {
        return client.getProxy().getHttpClient().getLinkResolver().<T>putAsync(client, links, rel, expectedType, postData);
    }
    
    public static <T> Future<DeserializedHttpResponseGen<T>> putAsync(IHttpClientProxy client, Links links, String rel, Class<T> expectedType, InputStream postData, CancellationToken ct) {
        Future<DeserializedHttpResponseGen<T>> fut = client.getProxy().getHttpClient().getLinkResolver().<T>putAsync(client, links, rel, expectedType, postData);
        if(ct!=null) ct.addFuture(fut);
        return fut;
    }

    public static String delete(IHttpClientProxy client, Links links, String rel) {
        return client.getProxy().getHttpClient().getLinkResolver().delete(client, links, rel);
    }

    public static Future<DeserializedHttpResponseGen<String>> deleteAsync(IHttpClientProxy client, Links links, String rel) {
        return client.getProxy().getHttpClient().getLinkResolver().deleteAsync(client, links, rel);
    }
    
    public static Future<DeserializedHttpResponseGen<String>> deleteAsync(IHttpClientProxy client, Links links, String rel, CancellationToken ct) {
        Future<DeserializedHttpResponseGen<String>> fut = client.getProxy().getHttpClient().getLinkResolver().deleteAsync(client, links, rel);
        if(ct!=null) ct.addFuture(fut);
        return fut;
    }

    public static URI getLink(IHttpClientProxy client, Links links, String rel) {
        return client.getProxy().getHttpClient().getLinkResolver().getLink(links, rel);
    }

}
