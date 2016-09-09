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

        /**
         * Gets the status code
         * @return  The status code
         */
        public int getStatusCode()
        {
            return statusCode;
        }

        /**
         * Gets the reason phrase 
         * @return  The reason phrase
         */
        public String getReasonPhrase()
        {
            return reasonPhrase;
        }

        /**
         * Gets the method
         * @return  The method 
         */
        public String getMethod()
        {
           return method; 
        }

        /**
         * Gets the URI
         * @return  The URI
         */
        public String getUri()
        {
           return uri;
        }

        /**
         * Gets a message that describes the current exception
         * @return  The error message that explains the reason for the exception, or an empty string("")
         */
        @Override
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

        /**
         * Returns a String that represents this instance
         * @return  A String that represents this instance
         */
        @Override
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

        /**
         * Gets the error
         * @return  The error
         */
        public Error getError()
        {
                return error;
        }

        /**
         * Get the HTML error
         * @return The HTML error
         */
        public String getHtmlError()
        {
                return htmlError;
        }


        HttpClientRequestException extractErrorFromResponseAsync(ClientResponse httpResponseMessage)
        {
            String ct = httpResponseMessage.getHeaders().getFirst("Content-Type");
            this.error = httpResponseMessage.getEntity(Error.class);
            this.statusCode = httpResponseMessage.getStatus();
            this.reasonPhrase = httpResponseMessage.getStatusInfo().toString();
            this.method = error.getMethod();
            this.uri = error.getUri();
            return this;
        }
        
        private HttpClientRequestException() {}

        /**
         * Initializes a new instance of the HttpClientRequestExeption class
         * 
         * @param statusCode    The status code
         * @param reasonPhrase  The reason phrase
         */
        HttpClientRequestException(int statusCode, String reasonPhrase) {
             super(statusCode + " " + reasonPhrase);
        
        }

        /**
         * Initializes a new instance of the HttpClientRequestExeption class
         * 
         * @param messageText   The message text
         */
        HttpClientRequestException(String messageText){
           super(messageText);
        }


        /**
         * Initializes a new instance of the HttpClientRequestExeption class
         * 
         * @param statusCode    The status code
         * @param reasonPhrase  The reason phrase
         * @param inner     The inner
         */
        HttpClientRequestException(int statusCode, String reasonPhrase, Exception inner)
        {
            super(statusCode + " " + reasonPhrase);
        }

        /**
         * Creates the specified message
         * 
         * @param message   The message
         * @param inner The inner exception
         * @return  A future which creates the message
         */
        static HttpClientRequestException create(ClientResponse message, Exception inner)
        {
            int statusCode = message.getStatus();
            String reasonPhrase = message.getStatusInfo().toString();
            HttpClientRequestException result = inner == null ? new HttpClientRequestException(statusCode, reasonPhrase) : new HttpClientRequestException(statusCode, reasonPhrase, inner);
            return result.extractErrorFromResponseAsync(message);
        }
        
        /**
         * Creates the specified message
         * 
         * @param message   The message
         * @return  A future which creates the message
         */
        static HttpClientRequestException create(ClientResponse message)
        {
            int statusCode = message.getStatus();
            String reasonPhrase = message.getStatusInfo().toString();
            HttpClientRequestException result = new HttpClientRequestException(statusCode, reasonPhrase);          
            HttpClientRequestException e = result.extractErrorFromResponseAsync(message);
            return e;
        }

        /**
         * Creates the specified message
         * 
         * @param message   The message
         * @param messageText   The message text
         * @return 
         */
        static HttpClientRequestException create(ClientResponse message,String messageText)
        {
            HttpClientRequestException result = new HttpClientRequestException(messageText);
            return result.extractErrorFromResponseAsync(message);
        }
    }


