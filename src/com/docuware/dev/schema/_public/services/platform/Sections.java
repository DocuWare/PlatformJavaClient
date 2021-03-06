

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
@XmlType(name = "Sections", propOrder = {
"proxy",
    "section"
})
public class Sections  implements IHttpClientProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Section")
    protected List<Section> section;

    /**ArrayList is required for the XML-Marshalling */
    public void setSection(ArrayList<Section> value) {
        section=value;
    }

    /**Specific section of a document*/
    public List<Section> getSection() {
        if (section == null) {
            section = new ArrayList<Section>();
        }
        return this.section;
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
	if(this.section != null) { 
		for (int i = 0; (i < this.section.size()); i = (i + 1)) { 
			this.section.get(i).setProxy(proxy); 
        }
	}
    }



}
