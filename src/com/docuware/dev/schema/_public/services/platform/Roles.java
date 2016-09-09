

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Roles", propOrder = {
"proxy",
    "item"
})
public class Roles  implements IHttpClientProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Item")
    protected List<Role> item;

    /**ArrayList is required for the XML-Marshalling */
    public void setItem(ArrayList<Role> value) {
        item=value;
    }

    /**A collection of roles*/
    public List<Role> getItem() {
        if (item == null) {
            item = new ArrayList<Role>();
        }
        return this.item;
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
	if(this.item!=null) {
        for (int i = 0; (i < this.item.size()); i = (i + 1)) {
            this.item.get(i).setProxy(proxy);
		}
    }
    }



}
