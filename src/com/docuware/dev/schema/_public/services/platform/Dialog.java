

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
@XmlType(name = "Dialog", propOrder = {
"proxy",
    "fields",
    "query",
    "properties"
})
public class Dialog
    extends DialogInfo
 implements IHttpClientProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Fields", required = true)
    protected DialogFields fields;
    @XmlElement(name = "Query")
    protected DocumentsQuery query;
    @XmlElement(name = "Properties", required = true)
    protected DialogProperties properties;

    /**The fields of this dialog.*/
    public DialogFields getFields() {
        return fields;
    }

    /**The fields of this dialog.*/
    public void setFields(DialogFields value) {
        this.fields = value;
    }

    /**The query defined by this dialog.*/
    public DocumentsQuery getQuery() {
        return query;
    }

    /**The query defined by this dialog.*/
    public void setQuery(DocumentsQuery value) {
        this.query = value;
    }

    /**Dialog properties specific for dialog type.*/
    public DialogProperties getProperties() {
        return properties;
    }

    /**Dialog properties specific for dialog type.*/
    public void setProperties(DialogProperties value) {
        this.properties = value;
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
	super.setProxy(proxy);
    this.proxy = proxy;
	if(this.fields!=null) { 
        for (int i = 0; (i < this.fields.getField().size()); i = (i + 1)) {
            this.fields.getField().get(i).setProxy(proxy);
        }
	}
    if ((query != null)) {
        query.setProxy(proxy);
    }
    if ((properties != null)) {
        properties.setProxy(proxy);
    }
    }



}
