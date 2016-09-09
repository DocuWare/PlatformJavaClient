

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
@XmlType(name = "ExportQuery", propOrder = {
"proxy",
    "settings",
    "source"
})
public class ExportQuery  implements IHttpClientProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Settings", required = true)
    protected ExportSettings settings;
    @XmlElement(name = "Source", required = true)
    protected DocumentsQuery source;

    /**The id of the dialog to be used to update fields which are hidden inside the store dialog.*/
    public ExportSettings getSettings() {
        return settings;
    }

    /**The id of the dialog to be used to update fields which are hidden inside the store dialog.*/
    public void setSettings(ExportSettings value) {
        this.settings = value;
    }

    /**The documents query that is executed.*/
    public DocumentsQuery getSource() {
        return source;
    }

    /**The documents query that is executed.*/
    public void setSource(DocumentsQuery value) {
        this.source = value;
    }


	/**
	* Gets the proxy.
	* 
	* @return	The proxy
	*/
    @Extension
    public HttpClientProxy getProxy() {
	return this.proxy;
    }


	/**
	* Sets the HTTP Communication Proxy which is used in futher HTTP communication.
	* 
	* @param proxy	The new proxy
	*/
    @Extension
    public void setProxy(HttpClientProxy proxy) {
	this.proxy = proxy;
    if(source != null){ 
		source.setProxy(proxy); 
    }
    }



}
