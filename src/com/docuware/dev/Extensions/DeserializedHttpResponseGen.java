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
import java.net.URI;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response.StatusType;

/**
 *
 * @author Patrick
 */
//requestUri und content headers are missing
//This class is a pure wrapper... the jersey client does the deserialization
public class DeserializedHttpResponseGen<T> implements Closeable {

    Exception exception;
    ClientResponse responseMessage;
    T result;

        /// <summary>
    /// Gets the response headers.
    /// </summary>
    /// <value>
    /// The response headers.
    /// </value>
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
        for (String s : response.getHeaders().get("Content-Disposition")) {
            System.out.println(s);
        }
        return getFileNameInternal(response);
    }

    private static String getFileNameInternal(DeserializedHttpResponseGen<InputStream> response) {
        String fileName = response.getHeaders().getFirst("Content-Disposition");
        //System.out.println(fileName);
        fileName = fileName.substring(fileName.indexOf("filename"));
        fileName = fileName.replace("filename=", "");
        //System.out.println(fileName);
        fileName = fileName.substring(0, fileName.indexOf(";") == -1 ? fileName.length() : fileName.indexOf(";"));
        if (fileName == null || fileName.isEmpty()) {
            fileName = null;
        }
        return fileName;
    }

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
        /// <summary>
    /// Gets the response status code.
    /// </summary>
    /// <value>
    /// The response status code.
    /// </value>
    public StatusType getStatusCode() {
        return responseMessage.getStatusInfo();
    }

        /// <summary>
    /// Gets a value indicating whether the response was successful.
    /// </summary>
    /// <value>
    /// <c>true</c> if the response was successful; otherwise, <c>false</c>.
    /// </value>
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
        /// <summary>
    /// Gets the exception in case the request failed.
    /// </summary>
    /// <value>
    /// The exception.
    /// </value>
    public Exception getException() {
        return exception;
    }

        /// <summary>
    /// Gets the deserialized content of the response body.
    /// </summary>
    /// <value>
    /// The deserialized content of the response body.
    /// </value>
    /// <exception cref="HttpClientRequestException"></exception>
    public T getContent() {

        if (exception != null) {
            throw new RuntimeException(exception.getMessage());
        }
        return result;
    }

        /// <summary>
    /// Initializes a new instance of the <see cref="DeserializedHttpResponse{T}"/> class.
    /// </summary>
    /// <param name="responseMessage">The response message.</param>
    /// <param name="result">The result.</param>
    public DeserializedHttpResponseGen(ClientResponse responseMessage, T result) {
        this.responseMessage = responseMessage;
        this.result = result;
    }

    public DeserializedHttpResponseGen(ClientResponse responseMessage, Exception x) {
        this.responseMessage = responseMessage;
        this.exception = x;
    }

        /// <summary>
    /// Converts the specified response.
    /// </summary>
    /// <param name="response">The response.</param>
    /// <returns>The content of the response.</returns>
    boolean disposed = false;

        /// <summary>
    /// Finalizes an instance of the <see cref="DeserializedHttpResponse{T}"/> class.
    /// </summary>
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

        /// <summary>
    /// Performs application-defined tasks associated with freeing, releasing, or resetting unmanaged resources.
    /// </summary>
    public void close() {
        close(true);
    }

}
