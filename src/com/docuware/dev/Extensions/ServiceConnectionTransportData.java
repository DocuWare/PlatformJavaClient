/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docuware.dev.Extensions;

import com.sun.jersey.client.apache.ApacheHttpClientHandler;

/**
 *
 * @author Patrick
 */
public class ServiceConnectionTransportData {
        /// <summary>
    /// Gets or sets additional user agents.
    /// </summary>
    /// <value>
    /// The user agent.
    /// </value>
    /// <remarks>You should specify these values in order to identify you application.
    /// If this parameter is set to <c>null</c> then the process name and version of you application is used as user agent string. If you do not want to submit any user agent, you must set this parameter to an empty array.</remarks>

    private String[] UserAgent;

    public String[] getUserAgent() {
        return UserAgent;
    }

    public void setUserAgent(String[] UserAgent) {
        this.UserAgent = UserAgent;
    }

        /// <summary>
    /// Gets or sets the HTTP client handler.
    /// </summary>
    /// <value>
    /// The HTTP client handler.
    /// </value>
    public ApacheHttpClientHandler HttpClientHandler;

    public ApacheHttpClientHandler getHttpClientHandler() {
        return HttpClientHandler;
    }

    public void setHttpClientHandler(ApacheHttpClientHandler HttpClientHandler) {
        this.HttpClientHandler = HttpClientHandler;
    }

        /// <summary>
    /// Gets or sets the accept language header.
    /// </summary>
    /// <value>
    /// The accept language header.
    /// </value>
    public String[] AcceptLanguage;

    public String[] getAcceptLanguage() {
        return AcceptLanguage;
    }

    public void setAcceptLanguage(String[] AcceptLanguage) {
        this.AcceptLanguage = AcceptLanguage;
    }
}
