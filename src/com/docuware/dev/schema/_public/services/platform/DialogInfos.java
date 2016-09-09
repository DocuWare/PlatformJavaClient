

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;
import com.docuware.dev.schema._public.services.platform.DialogInfos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.schema._public.services.Links;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DialogInfos", propOrder = {
"proxy",
    "dialog",
    "links"
})
public class DialogInfos  implements IRelationsWithProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Dialog")
    protected List<DialogInfo> dialog;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;

    /**ArrayList is required for the XML-Marshalling */
    public void setDialog(ArrayList<DialogInfo> value) {
        dialog=value;
    }

    /**List of dialog infos.*/
    public List<DialogInfo> getDialog() {
        if (dialog == null) {
            dialog = new ArrayList<DialogInfo>();
        }
        return this.dialog;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links value) {
        this.links = value;
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
	if(this.dialog!=null) {
        for (int i = 0; (i < this.dialog.size()); i = (i + 1)) {
            this.dialog.get(i).setProxy(proxy);
        }
	}
    }


	/**
	* Gets the base URI of the specified relations instance.
	* 
	* @return	The base URI of the specified relations instance.
	*/
    @Extension
    public URI getBaseUri() {
	return RelationsWithProxyExtensions.getBaseUri(this);
    }

    /**
    * Gets the Uri of the Link for the relation "Self".
    * Returns the Uri of the Link for the relation "Self", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getSelfRelationLink() {
        return MethodInvocation.getLink(this, links, "self");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Self".
    */
    public DialogInfos getDialogInfosFromSelfRelation() {
        return MethodInvocation.<DialogInfos>get(this, links, "self", DialogInfos.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Self" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DialogInfos>> getDialogInfosFromSelfRelationAsync() {
        return MethodInvocation.<DialogInfos>getAsync(this, links, "self", DialogInfos.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Self" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DialogInfos>> getDialogInfosFromSelfRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DialogInfos>getAsync(this, links, "self", DialogInfos.class, ct);
    }



}
