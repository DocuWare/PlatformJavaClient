

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
@XmlType(name = "SingleColumnSelectListValues", propOrder = {
"proxy",
    "values"
})
public class SingleColumnSelectListValues
    extends SelectListValues
 implements IHttpClientProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Values", required = true)
    protected SelectListResult values;

    /**Select list values.*/
    public SelectListResult getValues() {
        return values;
    }

    /**Select list values.*/
    public void setValues(SelectListResult value) {
        this.values = value;
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
    if ((values != null)) {
        values.setProxy(proxy);
    }
    }



}
