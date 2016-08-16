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

        /// <summary>
    /// Initializes a new instance of the <see cref="HttpClientProxy"/> class.
    /// </summary>
    /// <param name="httpClient">The HTTP client.</param>
    public HttpClientProxy(PlatformClient httpClient) {
        this.httpClient = httpClient;
    }

        /// <summary>
    /// Replaces the HTTP client.
    /// </summary>
    /// <param name="httpClient">The HTTP client.</param>
    public void ReplaceHttpClient(PlatformClient httpClient) {
        this.httpClient = httpClient;
    }

        /// <summary>
    /// Gets or sets the HTTP client.
    /// </summary>
    /// <value>
    /// The HTTP client.
    /// </value>
    public PlatformClient getHttpClient() {
        return httpClient;
    }

        /// <summary>
    /// Gets the base address.
    /// </summary>
    /// <value>
    /// The base address.
    /// </value>
    public URI getBaseAddress() {
        return httpClient.getLinkResolver().getBaseUri();
    }
}

        /// <summary>
/// Performs an implicit conversion from <see cref="HttpClientProxy"/> to <see cref="HttpClient"/>.
/// </summary>
/// <param name="httpClientProxy">The HTTP client proxy.</param>
/// <returns>
/// The result of the conversion.
/// </returns

