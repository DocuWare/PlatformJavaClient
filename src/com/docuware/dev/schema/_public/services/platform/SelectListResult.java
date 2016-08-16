//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.08.16 um 09:04:54 AM CEST 
//


package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;
import com.docuware.dev.schema._public.services.platform.SelectListResult;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.schema._public.services.Links;


/**
 * Select list values.
 * 
 * <p>Java-Klasse f�r SelectListResult complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SelectListResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "SelectListResult", propOrder = {
"proxy",
    "value",
    "links"
})
public class SelectListResult  implements IRelationsWithProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Value")
    protected List<String> value;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;

    /**
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getValue() {
        if (value == null) {
            value = new ArrayList<String>();
        }
        return this.value;
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
    }

    public URI getBaseUri() {
	return RelationsWithProxyExtensions.getBaseUri(this);
    }

    public URI getNextRelationLink() {
        return MethodInvocation.getLink(this, links, "next");
    }

    public SelectListResult getSelectListResultFromNextRelation() {
        return MethodInvocation.<SelectListResult>get(this, links, "next", SelectListResult.class);
    }

    public Future<DeserializedHttpResponseGen<SelectListResult>> getSelectListResultFromNextRelationAsync() {
        return MethodInvocation.<SelectListResult>getAsync(this, links, "next", SelectListResult.class);
    }

    public URI getPrevRelationLink() {
        return MethodInvocation.getLink(this, links, "prev");
    }

    public SelectListResult getSelectListResultFromPrevRelation() {
        return MethodInvocation.<SelectListResult>get(this, links, "prev", SelectListResult.class);
    }

    public Future<DeserializedHttpResponseGen<SelectListResult>> getSelectListResultFromPrevRelationAsync() {
        return MethodInvocation.<SelectListResult>getAsync(this, links, "prev", SelectListResult.class);
    }

    public URI getSelfRelationLink() {
        return MethodInvocation.getLink(this, links, "self");
    }

    public SelectListResult getSelectListResultFromSelfRelation() {
        return MethodInvocation.<SelectListResult>get(this, links, "self", SelectListResult.class);
    }

    public Future<DeserializedHttpResponseGen<SelectListResult>> getSelectListResultFromSelfRelationAsync() {
        return MethodInvocation.<SelectListResult>getAsync(this, links, "self", SelectListResult.class);
    }

    public URI getFirstRelationLink() {
        return MethodInvocation.getLink(this, links, "first");
    }

    public SelectListResult getSelectListResultFromFirstRelation() {
        return MethodInvocation.<SelectListResult>get(this, links, "first", SelectListResult.class);
    }

    public Future<DeserializedHttpResponseGen<SelectListResult>> getSelectListResultFromFirstRelationAsync() {
        return MethodInvocation.<SelectListResult>getAsync(this, links, "first", SelectListResult.class);
    }



}
