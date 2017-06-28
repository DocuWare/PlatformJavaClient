/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docuware.dev.Extensions;

import com.docuware.dev.schema._public.services.Link;
import com.docuware.dev.schema._public.services.Links;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.multipart.MultiPart;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

/**
 *
 * This is the main working class of the client. It resolves links and performs requests through the client
 */
class LinkResolver {

    URI baseUri;

    public URI getBaseUri() {
        return baseUri;
    }

    public LinkResolver(URI baseUri, Client client) {
        this.baseUri = baseUri;
    }

    /**
     * Gets the link specified through the Relation form the Links of an object
     * 
     * @param rel the relation to look for  
     * @param baseUri   the baseUri
     * @param links   the links to look in for the relation
     */
    public static URI getLink(URI baseUri, Links links, String rel) {
        for (Link link : links.getLink()) {
            if (rel.equals(link.getRel())) {
                return baseUri.resolve(link.getHref());
            }
        }
        throw new RuntimeException("The specified link is not found.");
    }

    /**
     *Gets the link specified through the Relation form the Links of an object
     * 
     * @param rel the relation to look for  
     * @param links   the links to look in for the relation
     */
    public URI getLink(Links links, String rel) {
        return LinkResolver.getLink(baseUri, links, rel);
    }

    /**
     * Gets an absolute Uri from an relative Uri
     * @param uri   the relative Uri
     * @return  the absolute Uri
     */
    public URI getAbsoluteUri(String uri) {
        return baseUri.resolve(uri);
    }

    /*
    For better understanding this method, as it is the first method interacting with the client, will be explained in depth
    The method is surrounded by a CompletableFuture, which makes it asynchronous. (Be aware that there are different types
    of delta-Functions (Supplier, Consumer, Function, BiFunction...) in java, so you have to choose the right function)
    In the asynchronous method first the specified link is resolved and the ressource get targeted.
    Next the HttpMethod is performed on this request. It is possible to specify the accept and type field of the field, which
    sets the affiliated Headerfields in the request. This can be seen in some post/put methods
    In the Get-Method you specify the representation of the object. This is a ClientRepsonse, which is a Wrapper-class,
    containing some Header-Information. 
    Next it is checked, if the request was succesfull. If this is not the case, a HttpClientRequestException is created
    from the error message and wrapped in a DeserializedHttpResponse
    If it was successfull, we get the requested object in the requested Representation from the clientResponse and wrap it 
    with a DeserializedHttpRepsonse
    
    Synchronous methods work like this, too, but they don't use CompletableFuture and DeserializedHttpResponses
    */
    /**
     * Send a get-Request asynchronously
     * 
     * @param <T>   The generic type of the Method
     * @param proxy The proxy which is used for communication
     * @param links The linkns of the object
     * @param rel   The relation which should be picked from the links
     * @param expectedType  The expected return type
     * @return  The future performing the getRequest and returning the Result
     */
    <T> CompletableFuture<DeserializedHttpResponseGen<T>> getAsync(IHttpClientProxy proxy, Links links, String rel, Class<T> expectedType) {
        return CompletableFuture.<DeserializedHttpResponseGen<T>>supplyAsync(() -> {
            WebResource web = proxy.getProxy().getHttpClient().getClient().resource(LinkResolver.getLink(baseUri, links, rel));
            ClientResponse resp = web.get(ClientResponse.class);
            if (resp.getStatus() < 200 || resp.getStatus() > 399) {
                HttpClientRequestException e = HttpClientRequestException.create(resp);
                return new DeserializedHttpResponseGen<>(resp, e);
            } else {
                if(resp.getStatus()==204) return new DeserializedHttpResponseGen(resp);
                T t = resp.getEntity(expectedType);
                if (t instanceof IHttpClientProxy) {
                    ((IHttpClientProxy) t).setProxy(proxy.getProxy());
                }
                return new DeserializedHttpResponseGen(resp, t);
            }
        });
    }

    /**
     * Send a get-Request
     * 
     * @param <T>   The generic type of the Method
     * @param proxy The proxy which is used for communication
     * @param links The linkns of the object
     * @param rel   The relation which should be picked from the links
     * @param expectedType  The expected return type
     * @return  The future performing the getRequest and returning the Result
     */
    <T> T get(IHttpClientProxy proxy, Links links, String rel, Class<T> expectedType) {
        WebResource web = proxy.getProxy().getHttpClient().getClient().resource(LinkResolver.getLink(baseUri, links, rel));
        ClientResponse resp = web.get(ClientResponse.class);
        if (resp.getStatus() < 200 || resp.getStatus() > 399) {
            HttpClientRequestException e = HttpClientRequestException.create(resp);
            throw e;
        } else {
            if(resp.getStatus()==204 || Objects.equals("logout", rel)) return null;
            T t = resp.getEntity(expectedType);
            if (t instanceof IHttpClientProxy) {
                ((IHttpClientProxy) t).setProxy(proxy.getProxy());
            }
            return t;
        }
    }
    
    /**
     * Send a post-Request 
     * 
     * @param <P>   The generic type of the post-object
     * @param <T>   The generic type of the Method
     * @param proxy The proxy which is used for communication
     * @param links The linkns of the object
     * @param rel   The relation which should be picked from the links
     * @param expectedType  The expected return type
     * @param postData  data to post to the Client
     * @param type  type-field of the header (specifies, what is send)
     * @param accept    accept-field of the header (specified, what request is accepted)
     * @return  The future performing the post-Request and returning the Result
     */
    <T, P> T post(IHttpClientProxy proxy, Links links, String rel, Class<T> expectedType, JAXBElement<P> postData, String type, String accept) {
        ClientResponse resp = proxy.getProxy().getHttpClient().getClient().resource(LinkResolver.getLink(baseUri, links, rel)).type(type).accept(accept).post(ClientResponse.class, postData);
        if (resp.getStatus() < 200 || resp.getStatus() > 399) {
            HttpClientRequestException e = HttpClientRequestException.create(resp);
            throw e;
        } else {
            if(resp.getStatus()==204) return null;
            T t = resp.getEntity(expectedType);
            if (t instanceof IHttpClientProxy) {
                ((IHttpClientProxy) t).setProxy(proxy.getProxy());
            }
            return t;
        }
    }

    /**
     * Send a post-Request asynchronously
     * 
     * @param <P>   The generic type of the post-object
     * @param <T>   The generic return type of the Method
     * @param proxy The proxy which is used for communication
     * @param links The linkns of the object
     * @param rel   The relation which should be picked from the links
     * @param expectedType  The expected return type
     * @param postData  data to post to the Client
     * @param type  type-field of the header (specifies, what is send)
     * @param accept    accept-field of the header (specified, what request is accepted)
     * @return  The future performing the post-Request and returning the Result
     */
    <T, P> CompletableFuture<DeserializedHttpResponseGen<T>> postAsync(IHttpClientProxy proxy, Links links, String rel, Class<T> expectedType, JAXBElement<P> postData, String type, String accept) {
        return CompletableFuture.<DeserializedHttpResponseGen<T>>supplyAsync(() -> {
            WebResource web = proxy.getProxy().getHttpClient().getClient().resource(LinkResolver.getLink(baseUri, links, rel));
            ClientResponse resp = web.type(type).accept(accept).post(ClientResponse.class, postData);
            if (resp.getStatus() < 200 || resp.getStatus() > 399) {
                HttpClientRequestException e = HttpClientRequestException.create(resp);
                return new DeserializedHttpResponseGen<>(resp, e);
            } else {
                if(resp.getStatus()==204) return new DeserializedHttpResponseGen(resp);
                T t = resp.getEntity(expectedType);
                if (t instanceof IHttpClientProxy) {
                    ((IHttpClientProxy) t).setProxy(proxy.getProxy());
                }
                return new DeserializedHttpResponseGen(resp, t);
            }
        });
    }

    /**
     * Send a post-Request 
     * 
     * @param <P>   The generic type of the post-object
     * @param proxy The proxy which is used for communication
     * @param links The linkns of the object
     * @param rel   The relation which should be picked from the links
     * @param postData  data to post to the Client
     * @param type  type-field of the header (specifies, what is send)
     * @param accept    accept-field of the header (specified, what request is accepted)
     * @return  The future performing the post-Request and returning the Result
     */
    <P> String post(IHttpClientProxy proxy, Links links, String rel, P postData, String type, String accept) {
        ClientResponse resp = proxy.getProxy().getHttpClient().getClient().resource(LinkResolver.getLink(baseUri, links, rel)).type(type).accept(accept).post(ClientResponse.class, postData);
        if (resp.getStatus() < 200 || resp.getStatus() > 399) {
            HttpClientRequestException e = HttpClientRequestException.create(resp);
            throw e;
        } else {
            if(resp.getStatus()==204) return null;
            return resp.getEntity(String.class);
        }
    }

    /**
     * Send a post-Request asynchronously
     * 
     * @param <P>   The generic type of the post-object
     * @param proxy The proxy which is used for communication
     * @param links The linkns of the object
     * @param rel   The relation which should be picked from the links
     * @param postData  data to post to the Client
     * @param type  type-field of the header (specifies, what is send)
     * @param accept    accept-field of the header (specified, what request is accepted)
     * @return  The future performing the post-Request and returning the Result
     */
    <P> CompletableFuture<DeserializedHttpResponseGen<String>> postAsync(IHttpClientProxy proxy, Links links, String rel, P postData, String type, String accept) {
        return CompletableFuture.<DeserializedHttpResponseGen<String>>supplyAsync(() -> {
            WebResource web = proxy.getProxy().getHttpClient().getClient().resource(LinkResolver.getLink(baseUri, links, rel));
            ClientResponse resp = web.type(type).accept(accept).post(ClientResponse.class, postData);
            if(resp.getStatus()==204) return new DeserializedHttpResponseGen(resp);
            return new DeserializedHttpResponseGen(resp, resp.getEntity(String.class));
        });
    }

    /**
     * Send a post-Request 
     * 
     * @param <T> The generic type fo the return object
     * @param <P>   The generic type of the post-object
     * @param proxy The proxy which is used for communication
     * @param links The linkns of the object
     * @param rel   The relation which should be picked from the links
     * @param expectedType  The expecetd return type
     * @param postData  data to post to the Client
     * @param bodyContentType  type-field of the header (specifies, what is send)
     * @param accept    accept-field of the header (specified, what request is accepted)
     * @return  The response object of the post-request
     */
    <T, P> T post(IHttpClientProxy proxy, Links links, String rel, Class<T> expectedType, P postData, String bodyContentType, String accept) {
        WebResource web = proxy.getProxy().getHttpClient().getClient().resource(LinkResolver.getLink(baseUri, links, rel));
        ClientResponse resp = web.type(bodyContentType).accept(accept).post(ClientResponse.class, postData);
        if (resp.getStatus() < 200 || resp.getStatus() > 399) {
            HttpClientRequestException e = HttpClientRequestException.create(resp);
            throw e;
        } else {
            if(resp.getStatus()==204) return null;
            T t = resp.getEntity(expectedType);
            if (t instanceof IHttpClientProxy) {
                ((IHttpClientProxy) t).setProxy(proxy.getProxy());
            }
            return t;
        }
    }

    /**
     * Send a post-Request for Multipart-Content
     * 
     * @param <T> The generic type fo the return object
     * @param <P>   The generic type of the post-object
     * @param proxy The proxy which is used for communication
     * @param links The linkns of the object
     * @param rel   The relation which should be picked from the links
     * @param expectedType  The expecetd return type
     * @param postData  data to post to the Client
     * @return The response object of the post-request
     */
    <T, P> T postMultipart(IHttpClientProxy proxy, Links links, String rel, Class<T> expectedType, P postData) {
        ClientResponse resp = proxy.getProxy().getHttpClient().getClient().resource(LinkResolver.getLink(baseUri, links, rel)).type(MediaType.MULTIPART_FORM_DATA).post(ClientResponse.class, postData);
        if (resp.getStatus() < 200 || resp.getStatus() > 399) {
            HttpClientRequestException e = HttpClientRequestException.create(resp);
            throw e;
        } else {
            if(resp.getStatus()==204) return null;
            T t = resp.getEntity(expectedType);
            if (t instanceof IHttpClientProxy) {
                ((IHttpClientProxy) t).setProxy(proxy.getProxy());
            }
            return t;
        }
    }

    /**
     * Send a post-Request asynchronously
     * 
     * @param <T> The generic type fo the return object
     * @param <P>   The generic type of the post-object
     * @param proxy The proxy which is used for communication
     * @param links The linkns of the object
     * @param rel   The relation which should be picked from the links
     * @param expectedType  The expecetd return type
     * @param postData  data to post to the Client
     * @param bodyContentType  type-field of the header (specifies, what is send)
     * @param accept    accept-field of the header (specified, what request is accepted)
     * @return  A future that performs the request
     */
    <T, P> CompletableFuture<DeserializedHttpResponseGen<T>> postAsync(IHttpClientProxy proxy, Links links, String rel, Class<T> expectedType, P postData, String bodyContentType, String accept) {
        return CompletableFuture.<DeserializedHttpResponseGen<T>>supplyAsync(() -> {
            WebResource web = proxy.getProxy().getHttpClient().getClient().resource(LinkResolver.getLink(baseUri, links, rel));
            ClientResponse resp = web.type(bodyContentType).accept(accept).post(ClientResponse.class, postData);
            if (resp.getStatus() < 200 || resp.getStatus() > 399) {
                HttpClientRequestException e = HttpClientRequestException.create(resp);
                return new DeserializedHttpResponseGen<>(resp, e);
            } else {
                if(resp.getStatus()==204) return new DeserializedHttpResponseGen(resp);
                T t = resp.getEntity(expectedType);
                if (t instanceof IHttpClientProxy) {
                    ((IHttpClientProxy) t).setProxy(proxy.getProxy());
                }
                return new DeserializedHttpResponseGen(resp, t);
            }
        });
    }

     /**
     * Send a post-Request for Multipart-Content asynchronously
     * 
     * @param <T> The generic type fo the return object
     * @param <P>   The generic type of the post-object
     * @param proxy The proxy which is used for communication
     * @param links The linkns of the object
     * @param rel   The relation which should be picked from the links
     * @param expectedType  The expecetd return type
     * @param postData  data to post to the Client
     * @return  A future that performs the request
     */
    <T, P> CompletableFuture<DeserializedHttpResponseGen<T>> postMultipartAsync(IHttpClientProxy proxy, Links links, String rel, Class<T> expectedType, P postData) {
        return CompletableFuture.<DeserializedHttpResponseGen<T>>supplyAsync(() -> {
            WebResource web = proxy.getProxy().getHttpClient().getClient().resource(LinkResolver.getLink(baseUri, links, rel));
            ClientResponse resp = web.type(MediaType.MULTIPART_FORM_DATA).post(ClientResponse.class, postData);
            if (resp.getStatus() < 200 || resp.getStatus() > 399) {
                HttpClientRequestException e = HttpClientRequestException.create(resp);
                return new DeserializedHttpResponseGen<>(resp, e);
            } else {
                if(resp.getStatus()==204) return new DeserializedHttpResponseGen(resp);
                T t = resp.getEntity(expectedType);
                if (t instanceof IHttpClientProxy) {
                    ((IHttpClientProxy) t).setProxy(proxy.getProxy());
                }
                return new DeserializedHttpResponseGen(resp, t);
            }
        });

    }

    /**
     * Send a post-Request
     * 
     * @param <T>   The generic type fo the return object
     * @param proxy The proxy which is used for communication
     * @param links The linkns of the object
     * @param rel   The relation which should be picked from the links
     * @param expectedType  The expecetd return type
     * @param postData  data to post to the Client
     * @return  The response object of the post-request
     */
    <T> T post(IHttpClientProxy proxy, Links links, String rel, Class<T> expectedType, InputStream postData) {
        ClientResponse resp = proxy.getProxy().getHttpClient().getClient().resource(LinkResolver.getLink(baseUri, links, rel)).post(ClientResponse.class, postData);
        if (resp.getStatus() < 200 || resp.getStatus() > 399) {
            HttpClientRequestException e = HttpClientRequestException.create(resp);
            throw e;
        } else {
            if(resp.getStatus()==204) return null;
            T t = resp.getEntity(expectedType);
            if (t instanceof IHttpClientProxy) {
                ((IHttpClientProxy) t).setProxy(proxy.getProxy());
            }
            return t;
        }
    }

    /**
     * Send a post-Request asynchronously
     * 
     * @param <T>   The generic type fo the return object
     * @param proxy The proxy which is used for communication
     * @param links The linkns of the object
     * @param rel   The relation which should be picked from the links
     * @param expectedType  The expecetd return type
     * @param postData  data to post to the Client
     * @return  A future performing the request
     */
    <T> CompletableFuture<DeserializedHttpResponseGen<T>> postAsync(IHttpClientProxy proxy, Links links, String rel, Class<T> expectedType, InputStream postData) {
        return CompletableFuture.<DeserializedHttpResponseGen<T>>supplyAsync(() -> {
            WebResource web = proxy.getProxy().getHttpClient().getClient().resource(LinkResolver.getLink(baseUri, links, rel));
            ClientResponse resp = web.post(ClientResponse.class, postData);
            if (resp.getStatus() < 200 || resp.getStatus() > 399) {
                HttpClientRequestException e = HttpClientRequestException.create(resp);
                return new DeserializedHttpResponseGen<>(resp, e);
            } else {
                if(resp.getStatus()==204) return new DeserializedHttpResponseGen(resp);
                T t = resp.getEntity(expectedType);
                if (t instanceof IHttpClientProxy) {
                    ((IHttpClientProxy) t).setProxy(proxy.getProxy());
                }
                return new DeserializedHttpResponseGen(resp, t);
            }
        });
    }

    /**
     * Send a put-Request
     * 
     * @param <T>   The generic return type
     * @param <P>   The generic type of the put-object
     * @param proxy The proxy which is used for communication
     * @param links The linkns of the object
     * @param rel   The relation which should be picked from the links
     * @param expectedType  The expecetd return type
     * @param postData  data to post to the Client
     * @param type  type-field of the header (specifies, what is send)
     * @param accept    accept-field of the header (specified, what request is accepted)
     * @return The response object of the put-request
     */
    <T, P> T put(IHttpClientProxy proxy, Links links, String rel, Class<T> expectedType, JAXBElement<P> postData, String type, String accept) {
        ClientResponse resp = proxy.getProxy().getHttpClient().getClient().resource(LinkResolver.getLink(baseUri, links, rel)).type(type).accept(accept).put(ClientResponse.class, postData);
        if (resp.getStatus() < 200 || resp.getStatus() > 399) {
            HttpClientRequestException e = HttpClientRequestException.create(resp);
            throw e;
        } else {
            if(resp.getStatus()==204) return null;
            T t = resp.getEntity(expectedType);
            if (t instanceof IHttpClientProxy) {
                ((IHttpClientProxy) t).setProxy(proxy.getProxy());
            }
            return t;
        }
    }

    /**
     * Send a put-Request asynchronously
     * 
     * @param <T>   The generic return type
     * @param <P>   The generic type of the put-object
     * @param proxy The proxy which is used for communication
     * @param links The linkns of the object
     * @param rel   The relation which should be picked from the links
     * @param expectedType  The expecetd return type
     * @param postData  data to post to the Client
     * @param type  type-field of the header (specifies, what is send)
     * @param accept    accept-field of the header (specified, what request is accepted)
     * @return A future performing the put-Request
     */
    <T, P> CompletableFuture<DeserializedHttpResponseGen<T>> putAsync(IHttpClientProxy proxy, Links links, String rel, Class<T> expectedType, JAXBElement<P> postData, String type, String accept) {
        return CompletableFuture.<DeserializedHttpResponseGen<T>>supplyAsync(() -> {
            WebResource web = proxy.getProxy().getHttpClient().getClient().resource(LinkResolver.getLink(baseUri, links, rel));
            ClientResponse resp = web.type(type).accept(accept).put(ClientResponse.class, postData);
            if (resp.getStatus() < 200 || resp.getStatus() > 399) {
                HttpClientRequestException e = HttpClientRequestException.create(resp);
                return new DeserializedHttpResponseGen<>(resp, e);
            } else {
                if(resp.getStatus()==204) return new DeserializedHttpResponseGen(resp);
                T t = resp.getEntity(expectedType);
                if (t instanceof IHttpClientProxy) {
                    ((IHttpClientProxy) t).setProxy(proxy.getProxy());
                }
                return new DeserializedHttpResponseGen(resp, t);
            }
        });

    }

    /**
     * Send a put-Request
     * 
     * @param <T>   The generic return type
     * @param proxy The proxy which is used for communication
     * @param links The linkns of the object
     * @param rel   The relation which should be picked from the links
     * @param expectedType  The expecetd return type
     * @param accept    accept-field of the header (specified, what request is accepted)
     * @return The response object of the put-Request
     */
    <T> T put(IHttpClientProxy proxy, Links links, String rel, Class<T> expectedType, String accept) {
        ClientResponse resp = proxy.getProxy().getHttpClient().getClient().resource(LinkResolver.getLink(baseUri, links, rel)).accept(accept).put(ClientResponse.class);
        if (resp.getStatus() < 200 || resp.getStatus() > 399) {
            HttpClientRequestException e = HttpClientRequestException.create(resp);
            throw e;
        } else {
            if(resp.getStatus()==204) return null;
            T t = resp.getEntity(expectedType);
            if (t instanceof IHttpClientProxy) {
                ((IHttpClientProxy) t).setProxy(proxy.getProxy());
            }
            return t;
        }
    }

    /**
     * Send a put-Request asynchronously
     * 
     * @param <T>   The generic return type
     * @param proxy The proxy which is used for communication
     * @param links The linkns of the object
     * @param rel   The relation which should be picked from the links
     * @param expectedType  The expecetd return type
     * @param accept    accept-field of the header (specified, what request is accepted)
     * @return A future performing the put-Request
     */
    <T> CompletableFuture<DeserializedHttpResponseGen<T>> putAsync(IHttpClientProxy proxy, Links links, String rel, Class<T> expectedType, String accept) {
        return CompletableFuture.<DeserializedHttpResponseGen<T>>supplyAsync(() -> {
            WebResource web = proxy.getProxy().getHttpClient().getClient().resource(LinkResolver.getLink(baseUri, links, rel));
            ClientResponse resp = web.accept(accept).put(ClientResponse.class);
            if (resp.getStatus() < 200 || resp.getStatus() > 399) {
                HttpClientRequestException e = HttpClientRequestException.create(resp);
                return new DeserializedHttpResponseGen<>(resp, e);
            } else {
                if(resp.getStatus()==204) return new DeserializedHttpResponseGen(resp);
                T t = resp.getEntity(expectedType);
                if (t instanceof IHttpClientProxy) {
                    ((IHttpClientProxy) t).setProxy(proxy.getProxy());
                }
                return new DeserializedHttpResponseGen(resp, t);
            }
        });
    }

    /**
     * Send a put-Reqeust
     * 
     * @param <P>   The generic type of the object to put
     * @param proxy The proxy which is used for communication
     * @param links The linkns of the object
     * @param rel   The relation which should be picked from the links
     * @param postData  data to post to the Client
     * @param type  type-field of the header (specifies, what is send)
     * @param accept    accept-field of the header (specified, what request is accepted)
     * @return a String representing the response to the put-request
     */
    <P> String put(IHttpClientProxy proxy, Links links, String rel, P postData, String type, String accept) {
        ClientResponse resp = proxy.getProxy().getHttpClient().getClient().resource(LinkResolver.getLink(baseUri, links, rel)).type(type).accept(accept).put(ClientResponse.class, postData);
        if (resp.getStatus() < 200 || resp.getStatus() > 399) {
            HttpClientRequestException e = HttpClientRequestException.create(resp);
            throw e;
        } else {
            if(resp.getStatus()==204) return null;
            return resp.getEntity(String.class);
        }
    }

    /**
     * Send a put-Reqeust asynchronously
     * 
     * @param <P>   The generic type of the object to put
     * @param proxy The proxy which is used for communication
     * @param links The linkns of the object
     * @param rel   The relation which should be picked from the links
     * @param postData  data to post to the Client
     * @param type  type-field of the header (specifies, what is send)
     * @param accept    accept-field of the header (specified, what request is accepted)
     * @return A future performing the put request
     */
    <P> CompletableFuture<DeserializedHttpResponseGen<String>> putAsync(IHttpClientProxy proxy, Links links, String rel, P postData, String type, String accept) {
        return CompletableFuture.<DeserializedHttpResponseGen<String>>supplyAsync(() -> {
            WebResource web = proxy.getProxy().getHttpClient().getClient().resource(LinkResolver.getLink(baseUri, links, rel));
            ClientResponse resp = web.type(type).accept(accept).put(ClientResponse.class, postData);
            if (resp.getStatus() < 200 || resp.getStatus() > 399) {
                HttpClientRequestException e = HttpClientRequestException.create(resp);
                return new DeserializedHttpResponseGen(resp, e);
            } else {
                if(resp.getStatus()==204) return new DeserializedHttpResponseGen(resp);
                return new DeserializedHttpResponseGen(resp, resp.getEntity(String.class));
            }
        });
    }

    /**
     * Send a put-Request
     * 
     * @param <T>   The generic return type
     * @param <P>   The generic type of the put-object
     * @param proxy The proxy which is used for communication
     * @param links The linkns of the object
     * @param rel   The relation which should be picked from the links
     * @param expectedType  The expecetd return type
     * @param postData  data to post to the Client
     * @param type  type-field of the header (specifies, what is send)
     * @param accept    accept-field of the header (specified, what request is accepted)
     * @return The response object of the put request
     */
    <T, P> T put(IHttpClientProxy proxy, Links links, String rel, Class<T> expectedType, P postData, String type, String accept) {
        ClientResponse resp = proxy.getProxy().getHttpClient().getClient().resource(LinkResolver.getLink(baseUri, links, rel)).type(type).accept(accept).put(ClientResponse.class, postData);
        if (resp.getStatus() < 200 || resp.getStatus() > 399) {
            HttpClientRequestException e = HttpClientRequestException.create(resp);
            throw e;
        } else {
            if(resp.getStatus()==204) return null;
            T t = resp.getEntity(expectedType);
            if (t instanceof IHttpClientProxy) {
                ((IHttpClientProxy) t).setProxy(proxy.getProxy());
            }
            return t;
        }
    }

     /**
     * Send a put-Request asynchronously
     * 
     * @param <T>   The generic return type
     * @param <P>   The generic type of the put-object
     * @param proxy The proxy which is used for communication
     * @param links The linkns of the object
     * @param rel   The relation which should be picked from the links
     * @param expectedType  The expecetd return type
     * @param postData  data to post to the Client
     * @param type  type-field of the header (specifies, what is send)
     * @param accept    accept-field of the header (specified, what request is accepted)
     * @return A future performing the put-Request
     */
    <T, P> CompletableFuture<DeserializedHttpResponseGen<T>> putAsync(IHttpClientProxy proxy, Links links, String rel, Class<T> expectedType, P postData, String bodyContentType, String accept) {
        return CompletableFuture.<DeserializedHttpResponseGen<T>>supplyAsync(() -> {
            WebResource web = proxy.getProxy().getHttpClient().getClient().resource(LinkResolver.getLink(baseUri, links, rel));
            ClientResponse resp = web.type(bodyContentType).accept(accept).put(ClientResponse.class, postData);
            if (resp.getStatus() < 200 || resp.getStatus() > 399) {
                HttpClientRequestException e = HttpClientRequestException.create(resp);
                return new DeserializedHttpResponseGen<>(resp, e);
            } else {
                if(resp.getStatus()==204) return new DeserializedHttpResponseGen(resp);
                T t = resp.getEntity(expectedType);
                if (t instanceof IHttpClientProxy) {
                    ((IHttpClientProxy) t).setProxy(proxy.getProxy());
                }
                return new DeserializedHttpResponseGen(resp, t);
            }
        });
    }

    /**
     * Send a put-Request
     * 
     * @param <T>   The generic return type
     * @param proxy The proxy which is used for communication
     * @param links The linkns of the object
     * @param rel   The relation which should be picked from the links
     * @param expectedType  The expecetd return type
     * @param postData  data to post to the Client
     * @return  The response object of the put request
     */
    <T> T put(IHttpClientProxy proxy, Links links, String rel, Class<T> expectedType, InputStream postData) {
        ClientResponse resp = proxy.getProxy().getHttpClient().getClient().resource(LinkResolver.getLink(baseUri, links, rel)).put(ClientResponse.class, postData);
        if (resp.getStatus() < 200 || resp.getStatus() > 399) {
            HttpClientRequestException e = HttpClientRequestException.create(resp);
            throw e;
        } else {
            if(resp.getStatus()==204) return null;
            T t = resp.getEntity(expectedType);
            if (t instanceof IHttpClientProxy) {
                ((IHttpClientProxy) t).setProxy(proxy.getProxy());
            }
            return t;
        }
    }

    /**
     * Send a put-Request asynchronously
     * 
     * @param <T>   The generic return type
     * @param proxy The proxy which is used for communication
     * @param links The linkns of the object
     * @param rel   The relation which should be picked from the links
     * @param expectedType  The expecetd return type
     * @param postData  data to post to the Client
     * @return  A future performing the put request
     */
    <T> CompletableFuture<DeserializedHttpResponseGen<T>> putAsync(IHttpClientProxy proxy, Links links, String rel, Class<T> expectedType, InputStream postData) {
        return CompletableFuture.<DeserializedHttpResponseGen<T>>supplyAsync(() -> {
            WebResource web = proxy.getProxy().getHttpClient().getClient().resource(LinkResolver.getLink(baseUri, links, rel));
            ClientResponse resp = web.put(ClientResponse.class, postData);
            if (resp.getStatus() < 200 || resp.getStatus() > 399) {
                HttpClientRequestException e = HttpClientRequestException.create(resp);
                return new DeserializedHttpResponseGen<>(resp, e);
            } else {
                if(resp.getStatus()==204) return new DeserializedHttpResponseGen(resp);
                T t = resp.getEntity(expectedType);
                if (t instanceof IHttpClientProxy) {
                    ((IHttpClientProxy) t).setProxy(proxy.getProxy());
                }
                return new DeserializedHttpResponseGen(resp, t);
            }
        });
    }

    
    /*Delete-Methods are not generic as it is not required until now. */
    
    /**
     * Send a delete-Request
     * 
     * @param proxy The proxy which is used for communication
     * @param links The linkns of the object
     * @param rel   The relation which should be picked from the links
     * @return A String representing the response to the delete-request
     */
    String delete(IHttpClientProxy proxy, Links links, String rel) {
        ClientResponse resp = proxy.getProxy().getHttpClient().getClient().resource(LinkResolver.getLink(baseUri, links, rel)).delete(ClientResponse.class);
        if (resp.getStatus() < 200 || resp.getStatus() > 399) {
            HttpClientRequestException e = HttpClientRequestException.create(resp);
            throw e;
        } else {
            if(resp.getStatus()==204) return null;
            return resp.getEntity(String.class);
        }
    }

    /**
     * Send a delete-Request
     * 
     * @param proxy The proxy which is used for communication
     * @param links The linkns of the object
     * @param rel   The relation which should be picked from the links
     * @return A future performing the delete-request
     */
    CompletableFuture<DeserializedHttpResponseGen<String>> deleteAsync(IHttpClientProxy proxy, Links links, String rel) {
        return CompletableFuture.<DeserializedHttpResponseGen<String>>supplyAsync(() -> {
            WebResource web = proxy.getProxy().getHttpClient().getClient().resource(LinkResolver.getLink(baseUri, links, rel));
            ClientResponse resp = web.delete(ClientResponse.class);
            if (resp.getStatus() < 200 || resp.getStatus() > 399) {
                HttpClientRequestException e = HttpClientRequestException.create(resp);
                return new DeserializedHttpResponseGen(resp, e);
            } else {
                if(resp.getStatus()==204) return new DeserializedHttpResponseGen(resp);
                return new DeserializedHttpResponseGen(resp, resp.getEntity(String.class));
            }
        });
    }

    /*The methods from here downwards work slightly differnt then the rest, as they do not need do resolve a uri from links
    with a rel. Instead these methods get the uri as input parameter. This methods are used in the extension methods of the
    service connection*/
    /**
     * Send a post-Request asynchronously
     * 
     * @param <T>   The generic return type
     * @param <P>   The generic type of the put-object
     * @param proxy The proxy which is used for communication
     * @param expectedType  The expecetd return type
     * @param data  data to post to the Client
     * @param type  type-field of the header (specifies, what is send)
     * @param accept    accept-field of the header (specified, what request is accepted)
     * @param uri   The uri on which to perform the request
     * @param inputType the type of the input Object as Class-Represenatation
     * @param inputTypeString   the type of the input Object as String-Represenatation
     * @return A future performing the post request
     */
    static <T, P> CompletableFuture<DeserializedHttpResponseGen<T>> postAsync(IHttpClientProxy proxy, URI uri, String type, String accept, Class<T> expectedType, Class<P> inputType, String inputTypeString, P data) {
        return CompletableFuture.<DeserializedHttpResponseGen<T>>supplyAsync(() -> {
            WebResource web = proxy.getProxy().getHttpClient().resource(uri);
            JAXBElement jax = new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", inputTypeString), inputType, null, data);
            ClientResponse resp = web.type(type).accept(accept).post(ClientResponse.class, jax);
            if (resp.getStatus() < 200 || resp.getStatus() > 399) {
                HttpClientRequestException e = HttpClientRequestException.create(resp);
                return new DeserializedHttpResponseGen(resp, e);
            } else {
                if(resp.getStatus()==204) return new DeserializedHttpResponseGen(resp);
                T t = resp.getEntity(expectedType);
                if (t instanceof IHttpClientProxy) {
                    ((IHttpClientProxy) t).setProxy(proxy.getProxy());
                }
                return new DeserializedHttpResponseGen<>(resp, t);
            }
        });
    }

     /**
     * Send a post-Request asynchronously
     * 
     * @param <T>   The generic return type
     * @param <P>   The generic type of the put-object
     * @param proxy The proxy which is used for communication
     * @param expectedType  The expecetd return type
     * @param data  data to post to the Client
     * @param type  type-field of the header (specifies, what is send)
     * @param accept    accept-field of the header (specified, what request is accepted)
     * @param uri   The uri on which to perform the request
     * @return A future performing the post request
     */
    static <T> CompletableFuture<DeserializedHttpResponseGen<T>> postAsync(IHttpClientProxy proxy, URI uri, String type, String accept, Class<T> expectedType, InputStream data) {
        return CompletableFuture.<DeserializedHttpResponseGen<T>>supplyAsync(() -> {
            WebResource web = proxy.getProxy().getHttpClient().resource(uri);
            ClientResponse resp = web.type(type).accept(accept).post(ClientResponse.class, data);
            if (resp.getStatus() < 200 || resp.getStatus() > 399) {
                HttpClientRequestException e = HttpClientRequestException.create(resp);
                return new DeserializedHttpResponseGen(resp, e);
            } else {
                if(resp.getStatus()==204) return new DeserializedHttpResponseGen(resp);
                T t = resp.getEntity(expectedType);
                if (t instanceof IHttpClientProxy) {
                    ((IHttpClientProxy) t).setProxy(proxy.getProxy());
                }
                return new DeserializedHttpResponseGen<>(resp, t);
            }
        });
    }

    /**
     * Send a post-Request for Multipart-Content asynchronously
     * 
     * @param <T>   The generic return type
     * @param proxy The proxy which is used for communication
     * @param expectedType  The expecetd return type
     * @param data  data to post to the Client
     * @param accept    accept-field of the header (specified, what request is accepted)
     * @param uri   The uri on which to perform the request
     * @return 
     */
    static <T> CompletableFuture<DeserializedHttpResponseGen<T>> postMultiPartAsync(IHttpClientProxy proxy, URI uri, String accept, Class<T> expectedType, MultiPart data) {
        return CompletableFuture.<DeserializedHttpResponseGen<T>>supplyAsync(() -> {
            WebResource web = proxy.getProxy().getHttpClient().resource(uri);
            ClientResponse resp = web.type(MediaType.MULTIPART_FORM_DATA).accept(accept).post(ClientResponse.class, data);
            if (resp.getStatus() < 200 || resp.getStatus() > 399) {
                HttpClientRequestException e = HttpClientRequestException.create(resp);
                return new DeserializedHttpResponseGen(resp, e);
            } else {
                if(resp.getStatus()==204) return new DeserializedHttpResponseGen(resp);
                T t = resp.getEntity(expectedType);
                if (t instanceof IHttpClientProxy) {
                    ((IHttpClientProxy) t).setProxy(proxy.getProxy());
                }
                return new DeserializedHttpResponseGen<>(resp, t);
            }
        });
    }

    /**
     * Send a put-Request asynchronously
     * 
     * @param <T>   The generic return type
     * @param <P>   The generic type of the put-object
     * @param proxy The proxy which is used for communication
     * @param expectedType  The expecetd return type
     * @param data  data to post to the Client
     * @param type  type-field of the header (specifies, what is send)
     * @param accept    accept-field of the header (specified, what request is accepted)
     * @param uri   The uri on which to perform the request
     * @param inputType the type of the input Object as Class-Represenatation
     * @param inputTypeString   the type of the input Object as String-Represenatation
     * @return A future performing the put-Request
     */
    static <T, P> CompletableFuture<DeserializedHttpResponseGen<T>> putAsync(IHttpClientProxy proxy, URI uri, String type, String accept, Class<T> expectedType, Class<P> inputType, String inputTypeString, P data) {
        return CompletableFuture.<DeserializedHttpResponseGen<T>>supplyAsync(() -> {
            WebResource web = proxy.getProxy().getHttpClient().resource(uri);
            JAXBElement jax = new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", inputTypeString), inputType, null, data);
            ClientResponse resp = web.type(type).accept(accept).put(ClientResponse.class, jax);
            if (resp.getStatus() < 200 || resp.getStatus() > 399) {
                HttpClientRequestException e = HttpClientRequestException.create(resp);
                return new DeserializedHttpResponseGen(resp, e);
            } else {
                if(resp.getStatus()==204) return new DeserializedHttpResponseGen(resp);
                T t = resp.getEntity(expectedType);
                if (t instanceof IHttpClientProxy) {
                    ((IHttpClientProxy) t).setProxy(proxy.getProxy());
                }
                return new DeserializedHttpResponseGen<>(resp, t);
            }
        });
    }

    /**
     * Send a get-Request asynchronously
     * 
     * @param <T>   The generic return type
     * @param proxy The proxy which is used for communication
     * @param uri   The uri on which to perform the request
     * @param accept    accept-field of the header (specified, what request is accepted)
     * @param expectedType  The expecetd return type
     * @return A future performing the get-Request
     */
    static <T> CompletableFuture<DeserializedHttpResponseGen<T>> getAsync(IHttpClientProxy proxy, URI uri, String accept, Class<T> expectedType) {
        return CompletableFuture.<DeserializedHttpResponseGen<T>>supplyAsync(() -> {
            WebResource web = proxy.getProxy().getHttpClient().resource(uri);
            ClientResponse resp = web.accept(accept).get(ClientResponse.class);
            if (resp.getStatus() < 200 || resp.getStatus() > 399) {
                HttpClientRequestException e = HttpClientRequestException.create(resp);
                return new DeserializedHttpResponseGen(resp, e);
            } else {
                if(resp.getStatus()==204) return new DeserializedHttpResponseGen(resp);
                T t = resp.getEntity(expectedType);
                if (t instanceof IHttpClientProxy) {
                    ((IHttpClientProxy) t).setProxy(proxy.getProxy());
                }
                return new DeserializedHttpResponseGen<>(resp, t);
            }
        });
    }
       
    /**
     * Send a delete-Request
     * 
     * @param proxy The proxy which is used for communication
     * @param uri   The uri on which to perform the request
     * @param accept    accept-field of the header (specified, what request is accepted)
     * @return A future performing the delete request
     */
    static CompletableFuture<DeserializedHttpResponseGen<String>> deleteAsync(IHttpClientProxy proxy, URI uri, String accept) {
        CompletableFuture fut = CompletableFuture.<DeserializedHttpResponseGen<String>>supplyAsync(() -> {
            WebResource web = proxy.getProxy().getHttpClient().resource(uri);
            ClientResponse resp = web.accept(accept).delete(ClientResponse.class);
            if (resp.getStatus() < 200 || resp.getStatus() > 399) {
                HttpClientRequestException e = HttpClientRequestException.create(resp);
                return new DeserializedHttpResponseGen(resp, e);
            } else {
                if(resp.getStatus()==204) return new DeserializedHttpResponseGen(resp);
                return new DeserializedHttpResponseGen<>(resp, resp.getEntity(String.class));
            }
        });      
        return fut;
    }
}
