

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
@XmlType(name = "ImportResult", propOrder = {
"proxy",
    "results",
    "fileChunk"
})
public class ImportResult  implements IHttpClientProxy, IChunkable {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Results")
    protected List<ImportResultEntry> results;
    @XmlElement(name = "FileChunk")
    protected UploadedFileChunk fileChunk;

    /**A list with the sequence value of the documents that are not imported.*/
    public List<ImportResultEntry> getResults() {
        if (results == null) {
            results = new ArrayList<ImportResultEntry>();
        }
        return this.results;
    }

    /**Contains data for a file chunk during a big file upload. This data is created on the server of every chunk request.*/
    public UploadedFileChunk getFileChunk() {
        return fileChunk;
    }

    /**Contains data for a file chunk during a big file upload. This data is created on the server of every chunk request.*/
    public void setFileChunk(UploadedFileChunk value) {
        this.fileChunk = value;
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
    if ((fileChunk != null)) {
        fileChunk.setProxy(proxy);
    }
    }



}
