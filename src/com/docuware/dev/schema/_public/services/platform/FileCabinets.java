

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileCabinets", propOrder = {
"proxy",
    "fileCabinet"
})
public class FileCabinets  implements IHttpClientProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "FileCabinet")
    protected List<FileCabinet> fileCabinet;

    /**Lsit of file cabinets or document trays(web baskets).*/
    public List<FileCabinet> getFileCabinet() {
        if (fileCabinet == null) {
            fileCabinet = new ArrayList<FileCabinet>();
        }
        return this.fileCabinet;
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
	if(this.fileCabinet!=null) {   
        for (int i = 0; (i < this.fileCabinet.size()); i = (i + 1)) {
            this.fileCabinet.get(i).setProxy(proxy);
        }
	}
    }



}
