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
class ServiceConnectionTransportData {
      
    private String[] UserAgent;

    /**
     * Gets the additional user agents <p>
     * 
     * Remarks: You should specify these values in order to identify you application.
     * If this parameter is set to null then the process name and version of you application is used as user agent string. If you do not want to submit any user agent, you must set this parameter to an empty array.
     * 
     * @return The user agent
     */
    public String[] getUserAgent() {
        return UserAgent;
    }

    /**
     * Sets the additional user agents <p>
     * 
     * Remarks: You should specify these values in order to identify you application.
     * If this parameter is set to null then the process name and version of you application is used as user agent string. If you do not want to submit any user agent, you must set this parameter to an empty array.
     * 
     * @param UserAgent The additional user agent
     */
    public void setUserAgent(String[] UserAgent) {
        this.UserAgent = UserAgent;
    }

    public ApacheHttpClientHandler HttpClientHandler;
    
    /**
     * Gets  the HTTP client handler
     * @return The HTTP client handler
     */
    public ApacheHttpClientHandler getHttpClientHandler() {
        return HttpClientHandler;
    }

    /**
     * Sets the HTTP client handler
     * @param HttpClientHandler  The new HTTP client handler
     */
    public void setHttpClientHandler(ApacheHttpClientHandler HttpClientHandler) {
        this.HttpClientHandler = HttpClientHandler;
    }
    
    public String[] AcceptLanguage;

    /**
     * Gets the accept language header
     * @return The accept language header
     */
    public String[] getAcceptLanguage() {
        return AcceptLanguage;
    }

    /**
     * Sets the accept language header
     * @param AcceptLanguage    The accept language header
     */
    public void setAcceptLanguage(String[] AcceptLanguage) {
        this.AcceptLanguage = AcceptLanguage;
    }
}
