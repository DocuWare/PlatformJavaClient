/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docuware.dev.Extensions;

import com.sun.jersey.api.client.ClientResponse;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response.StatusType;

/**
 *
 * @author Patrick
 * @param <T>
 */
//requestUri und content headers are missing
//This class is a pure wrapper... the jersey client does the deserialization
public class DeserializedHttpResponseGen<T> implements Closeable {

    Exception exception;
    ClientResponse responseMessage;
    T result;

    /**
     * Gets the response headers
     * @return The response headers
     */
    public MultivaluedMap<String, String> getHeaders() {
        return responseMessage.getHeaders();
    }

    public static String getFileName(DeserializedHttpResponseGen<InputStream> response) {
        if (response == null) {
            throw new RuntimeException("response: The response must not be empty in order to get a file name.");
        }
        if (response.getHeaders() == null || !response.getHeaders().containsKey("Content-Disposition")) {
            throw new RuntimeException("Response does not contain file name header");
        }
        return getFileNameInternal(response);
    }

    private static String getFileNameInternal(DeserializedHttpResponseGen<InputStream> response) {
        String fileName = response.getHeaders().getFirst("Content-Disposition");
        fileName = fileName.substring(fileName.indexOf("filename"));
        fileName = fileName.replace("filename=", "");
        fileName = fileName.substring(0, !fileName.contains(";") ? fileName.length() : fileName.indexOf(";"));
        if (fileName == null || fileName.isEmpty()) {
            fileName = null;
        }
        return fileName;
    }
//Content headers are also in the usual headers
        /// <summary>
    /// Gets the content headers.
    /// </summary>
    /// <value>
    /// The content headers.
    /// </value>
       /* public HttpContentHeaders ContentHeaders()
     {
     return responseMessage.; 
     }*/

    /**
     * Gets the response status code
     * @return The response status code
     */
    public StatusType getStatusCode() {
        return responseMessage.getStatusInfo();
    }

    /**
     * Gets a value indicating whether the response was successfull
     * @return  if the response was successful; otherwise, false
     */ 
    public boolean isSuccessStatusCode() {
        return responseMessage.getStatus() > 199 && responseMessage.getStatus() < 300;
    }

        /// <summary>
    /// Gets the request URI.
    /// </summary>
    /// <value>
    /// The request URI.
    /// </value>
      /*  public String getRequestURI() { 
     return this.responseMessage.getHeaders().getFirst("RequestUri"); 
     } */
    /**
     * Gets the exception in case the request failed
     * @return The exception
     */
    public Exception getException() {
        return exception;
    }

    /**
     * Gets the deserialized content of the response body
     * @return  The deserialized content of the response body
     */
    public T getContent() {

        if (exception != null) {
            throw new RuntimeException(exception.getMessage());
        }
        return result;
    }

    /**
     * Initializes a new instance of the {@Link DeserializedHttpResponseGen<T>>}
     * @param responseMessage   The responseMessage
     * @param result    The result
     */
    public DeserializedHttpResponseGen(ClientResponse responseMessage, T result) {
        this.responseMessage = responseMessage;
        this.result = result;
    }

    /**
     * Initializes a new instance of the {@Link DeserializedHttpResponseGen<T>>}
     * @param responseMessage   The resposneMessage
     * @param x the Exception
     */
    public DeserializedHttpResponseGen(ClientResponse responseMessage, Exception x) {
        this.responseMessage = responseMessage;
        this.exception = x;
    }

    boolean disposed = false;

        /// <summary>
    /// Finalizes an instance of the <see cref="DeserializedHttpResponse{T}"/> class.
    /// </summary>
    /**
     * Finalizes an instance of the {@Link DeserializedHttpResponseGen<T>>}
     */
    @Override
    protected void finalize() {
        try {
            close(false);
        } finally {
            try {
                super.finalize();
            } catch (Throwable ex) {
                Logger.getLogger(DeserializedHttpResponseGen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

        /// <summary>
    /// Releases unmanaged and - optionally - managed resources.
    /// </summary>
    /// <param name="disposing"><c>true</c> to release both managed and unmanaged resources; <c>false</c> to release only unmanaged resources.</param>
    /**
     * Releases unmanaged and - optionally - managed resources
     * @param disposing true to release both managed and unmanaged resources; false to release only unmanaged resources
     */
    void close(boolean disposing) {
        if (disposing && !this.disposed) {
            if (result != null && result instanceof Closeable) {
                try {
                    ((Closeable) result).close();
                } catch (IOException ex) {
                    Logger.getLogger(DeserializedHttpResponseGen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (responseMessage != null) {
                responseMessage.close();
            }
        }
    }

    /**
     * Performs application-defined tasks associated with freeing, releasing, or resetting unmanaged resources
     */
    @Override
    public void close() {
        close(true);
    }

}
