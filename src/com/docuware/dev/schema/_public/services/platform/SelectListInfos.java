

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
@XmlType(name = "SelectListInfos", propOrder = {
"proxy",
    "selectLists"
})
public class SelectListInfos  implements IHttpClientProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "SelectLists")
    protected List<SelectListInfo> selectLists;

    /**ArrayList is required for the XML-Marshalling */
    public void setSelectLists(ArrayList<SelectListInfo> value) {
        selectLists=value;
    }

    /**List of select lists information.*/
    public List<SelectListInfo> getSelectLists() {
        if (selectLists == null) {
            selectLists = new ArrayList<SelectListInfo>();
        }
        return this.selectLists;
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
	if(this.selectLists!=null) {
        for (int i = 0; (i < this.selectLists.size()); i = (i + 1)) {
            this.selectLists.get(i).setProxy(proxy);
        }
	}
    }



}
