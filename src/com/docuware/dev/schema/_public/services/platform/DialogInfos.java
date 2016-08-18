//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.08.18 um 09:47:39 AM CEST 
//


package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;
import com.docuware.dev.schema._public.services.platform.DialogInfos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.schema._public.services.Links;


/**
 * List of dialog infos.
 * 
 * <p>Java-Klasse f�r DialogInfos complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DialogInfos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Dialog" type="{http://dev.docuware.com/schema/public/services/platform}DialogInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
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

    /**
     * Gets the value of the dialog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dialog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDialog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DialogInfo }
     * 
     * 
     */
    public List<DialogInfo> getDialog() {
        if (dialog == null) {
            dialog = new ArrayList<DialogInfo>();
        }
        return this.dialog;
    }

    /**
     * Ruft den Wert der links-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Links }
     *     
     */
    public Links getLinks() {
        return links;
    }

    /**
     * Legt den Wert der links-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Links }
     *     
     */
    public void setLinks(Links value) {
        this.links = value;
    }

    public HttpClientProxy getProxy() {
	return this.proxy;
    }

    public void setProxy(HttpClientProxy proxy) {
	this.proxy = proxy;
	if(this.dialog!=null) {
        for (int i = 0; (i < this.dialog.size()); i = (i + 1)) {
            this.dialog.get(i).setProxy(proxy);
        }
	}
    }

    public URI getBaseUri() {
	return RelationsWithProxyExtensions.getBaseUri(this);
    }

    public URI getSelfRelationLink() {
        return MethodInvocation.getLink(this, links, "self");
    }

    public DialogInfos getDialogInfosFromSelfRelation() {
        return MethodInvocation.<DialogInfos>get(this, links, "self", DialogInfos.class);
    }

    public Future<DeserializedHttpResponseGen<DialogInfos>> getDialogInfosFromSelfRelationAsync() {
        return MethodInvocation.<DialogInfos>getAsync(this, links, "self", DialogInfos.class);
    }

    public Future<DeserializedHttpResponseGen<DialogInfos>> getDialogInfosFromSelfRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DialogInfos>getAsync(this, links, "self", DialogInfos.class, ct);
    }



}
