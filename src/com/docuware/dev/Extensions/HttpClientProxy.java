/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docuware.dev.Extensions;

import java.net.URI;

/**
 *
 * @author Patrick
 */
public class HttpClientProxy {

    PlatformClient httpClient;

    /**
     * Initializes a new instance of the HttpClientProxy class
     * @param httpClient    The HTTP client
     */
    public HttpClientProxy(PlatformClient httpClient) {
        this.httpClient = httpClient;
    }

    /**
     * Replaces the HTTP client
     * @param httpClient    The HTTP client
     */
    public void ReplaceHttpClient(PlatformClient httpClient) {
        this.httpClient = httpClient;
    }

    /**
     * Gets the client
     * @return client
     */
    public PlatformClient getHttpClient() {
        return httpClient;
    }

    /**
     * Gets the base address
     * @return  The base address
     */
    public URI getBaseAddress() {
        return httpClient.getLinkResolver().getBaseUri();
    }
}