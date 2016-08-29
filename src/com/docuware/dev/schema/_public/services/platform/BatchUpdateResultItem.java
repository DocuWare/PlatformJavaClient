

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BatchUpdateResultItem", propOrder = {
"proxy",
    "document",
    "errorMessage"
})
public class BatchUpdateResultItem  implements IHttpClientProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Document", required = true)
    protected Document document;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;

    /**The document after it has been updated.*/
    public Document getDocument() {
        return document;
    }

    /**The document after it has been updated.*/
    public void setDocument(Document value) {
        this.document = value;
    }

    /**The error message of the failed update operation.*/
    public String getErrorMessage() {
        return errorMessage;
    }

    /**The error message of the failed update operation.*/
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }


	/**
	* Gets the proxy.
	* 
	* @return	The proxy
	*/
    public HttpClientProxy getProxy() {
	return this.proxy;
    }


	/**
	* Sets the HTTP Communication Proxy which is used in futher HTTP communication.
	* 
	* @param proxy	The new proxy
	*/
    public void setProxy(HttpClientProxy proxy) {
	this.proxy = proxy;
    if ((document != null)) {
        document.setProxy(proxy);
    }
    }



}
