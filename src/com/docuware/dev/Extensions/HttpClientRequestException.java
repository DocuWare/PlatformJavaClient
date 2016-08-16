/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docuware.dev.Extensions;

import com.sun.jersey.api.client.ClientResponse;
import java.io.IOException;
import java.net.URI;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Patrick
 */
public class HttpClientRequestException extends RuntimeException
    {
        Error error;
        String htmlError;
        private int statusCode;
        private String reasonPhrase;
        private String method;
        private String uri;

        /// <summary>
        /// Gets the status code.
        /// </summary>
        /// <value>
        /// The status code.
        /// </value>
        public int getStatusCode()
        {
            return statusCode;
        }


        /// <summary>
        /// Gets the reason phrase.
        /// </summary>
        /// <value>
        /// The reason phrase.
        /// </value>
        public String getReasonPhrase()
        {
            return reasonPhrase;
        }


        /// <summary>
        /// Gets the method.
        /// </summary>
        /// <value>
        /// The method.
        /// </value>
        public String getMethod()
        {
           return method; 
        }


        /// <summary>
        /// Gets the URI.
        /// </summary>
        /// <value>
        /// The URI.
        /// </value>
        public String getUri()
        {
           return uri;
        }


        /// <summary>
        /// Gets a message that describes the current exception.
        /// </summary>
        /// <returns>The error message that explains the reason for the exception, or an empty string("").</returns>
        public String getMessage()
        {
            {
                String baseMessage = super.getMessage();
                StringBuilder sb = new StringBuilder();
                boolean hasBaseMessage = !(baseMessage==null||baseMessage.trim().isEmpty());
                if (hasBaseMessage == true){
                    sb.append(baseMessage);
                }
                if (error != null && !(error.getMessage() == null || error.getMessage().isEmpty())) {
                    addCloseIfNeeded(addOpenIfNeeded(sb, hasBaseMessage).append(error.getMessage()), hasBaseMessage);
                                 }
                else {if (!(htmlError== null || htmlError.isEmpty())) {
                    addLineIfNeeded(sb, hasBaseMessage).append(htmlError);}}

                return sb.toString();
            }
        }

        /// <summary>
        /// Returns a <see cref="System.String" /> that represents this instance.
        /// </summary>
        /// <returns>
        /// A <see cref="System.String" /> that represents this instance.
        /// </returns>
        /// <PermissionSet>
        ///   <IPermission class="System.Security.Permissions.FileIOPermission, mscorlib, Version=2.0.3600.0, Culture=neutral, PublicKeyToken=b77a5c561934e089" version="1" PathDiscovery="*AllFiles*" />
        ///   </PermissionSet>
        public String toString()
        {
            return super.toString();
        }

        private static StringBuilder addLineIfNeeded(StringBuilder sb, boolean hasBaseMessage)
        {
            if (hasBaseMessage)
                sb.append("\n");
            return sb;
        }

        private static StringBuilder addOpenIfNeeded(StringBuilder sb, boolean hasBaseMessage)
        {
            if (hasBaseMessage)
                sb.append(" (");
            return sb;
        }

        private static StringBuilder addCloseIfNeeded(StringBuilder sb, boolean hasBaseMessage)
        {
            if (hasBaseMessage)
                sb.append(")");
            return sb;
        }

        /// <summary>
        /// Gets the error.
        /// </summary>
        /// <value>
        /// The error.
        /// </value>
        public Error getError()
        {
                return error;
        }

        /// <summary>
        /// Gets the HTML error.
        /// </summary>
        /// <value>
        /// The HTML error.
        /// </value>
        public String getHtmlError()
        {
                return htmlError;
        }


        HttpClientRequestException extractErrorFromResponseAsync(ClientResponse httpResponseMessage)
        {
            String ct = httpResponseMessage.getHeaders().getFirst("Content-Type");
           // HttpClientRequestException ex = new HttpClientRequestException();
            this.error = httpResponseMessage.getEntity(Error.class);
            this.statusCode = httpResponseMessage.getStatus();
            this.reasonPhrase = httpResponseMessage.getStatusInfo().toString();
            this.method = error.getMethod();
            this.uri = error.getUri();
            return this;
        }
        
        private HttpClientRequestException() {}

        /// <summary>
        /// Initializes a new instance of the <see cref="HttpClientRequestException" /> class.
        /// </summary>
        /// <param name="statusCode">The status code.</param>
        /// <param name="reasonPhrase">The reason phrase.</param>
        HttpClientRequestException(int statusCode, String reasonPhrase) {
             super(statusCode + " " + reasonPhrase);
        
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="HttpClientRequestException" /> class.
        /// </summary>
        /// <param name="messageText">The message text.</param>
        HttpClientRequestException(String messageText){
           super(messageText);
        }


        /// <summary>
        /// Initializes a new instance of the <see cref="HttpClientRequestException" /> class.
        /// </summary>
        /// <param name="statusCode">The status code.</param>
        /// <param name="reasonPhrase">The reason phrase.</param>
        /// <param name="inner">The inner.</param>
        HttpClientRequestException(int statusCode, String reasonPhrase, Exception inner)
        {
            super(statusCode + " " + reasonPhrase);
        }

        /// <summary>
        /// Creates the specified message.
        /// </summary>
        /// <param name="message">The message.</param>
        /// <param name="inner">The inner exception.</param>
        /// <returns>A task which creates the message.</returns>
        public static HttpClientRequestException create(ClientResponse message, Exception inner)
        {
            int statusCode = message.getStatus();
            String reasonPhrase = message.getStatusInfo().toString();
            HttpClientRequestException result = inner == null ? new HttpClientRequestException(statusCode, reasonPhrase) : new HttpClientRequestException(statusCode, reasonPhrase, inner);
            return result.extractErrorFromResponseAsync(message);
        }
        
        public static HttpClientRequestException create(ClientResponse message)
        {
            int statusCode = message.getStatus();
            String reasonPhrase = message.getStatusInfo().toString();
            HttpClientRequestException result = new HttpClientRequestException(statusCode, reasonPhrase);          
            HttpClientRequestException e = result.extractErrorFromResponseAsync(message);
           // System.out.println(e.getMessage());
            return e;
        }

        /// <summary>
        /// Creates the specified message.
        /// </summary>
        /// <param name="message">The message.</param>
        /// <param name="messageText">The message text.</param>
        /// <returns></returns>
        public static HttpClientRequestException create(ClientResponse message,String messageText)
        {
            HttpClientRequestException result = new HttpClientRequestException(messageText);
            return result.extractErrorFromResponseAsync(message);
        }
    }


