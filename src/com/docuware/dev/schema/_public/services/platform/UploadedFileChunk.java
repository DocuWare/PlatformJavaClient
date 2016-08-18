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
import com.docuware.dev.schema._public.services.platform.UploadedFileChunk;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.schema._public.services.Links;


/**
 * <p>Java-Klasse f�r UploadedFileChunk complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="UploadedFileChunk">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Finished" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="LastChunkId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BytesWritten" type="{http://www.w3.org/2001/XMLSchema}long" default="0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UploadedFileChunk", propOrder = {
"proxy",
    "links"
})
public class UploadedFileChunk  implements IRelationsWithProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;
    @XmlAttribute(name = "Finished")
    protected Boolean finished;
    @XmlAttribute(name = "LastChunkId")
    protected String lastChunkId;
    @XmlAttribute(name = "BytesWritten")
    protected Long bytesWritten;

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

    /**
     * Ruft den Wert der finished-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isFinished() {
        if (finished == null) {
            return false;
        } else {
            return finished;
        }
    }

    /**
     * Legt den Wert der finished-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFinished(Boolean value) {
        this.finished = value;
    }

    /**
     * Ruft den Wert der lastChunkId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastChunkId() {
        return lastChunkId;
    }

    /**
     * Legt den Wert der lastChunkId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastChunkId(String value) {
        this.lastChunkId = value;
    }

    /**
     * Ruft den Wert der bytesWritten-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public long getBytesWritten() {
        if (bytesWritten == null) {
            return  0L;
        } else {
            return bytesWritten;
        }
    }

    /**
     * Legt den Wert der bytesWritten-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBytesWritten(Long value) {
        this.bytesWritten = value;
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

    public Link getLink(String relationName) {
	return RelationExtension.getLink(this, relationName);
    }

    public String getRelationUri(String relationName) {
	return RelationExtension.getRelationUri(this, relationName);
    }

    public String getRelationUriOrThrow(String relationName) {
	return RelationExtension.getRelationUriOrThrow(this, relationName);
    }

    public boolean hasRelationUri(String relationName) {
	return RelationExtension.hasRelationUri(this, relationName);
    }

    public URI getNextRelationLink() {
        return MethodInvocation.getLink(this, links, "next");
    }

    public UploadedFileChunk getUploadedFileChunkFromNextRelation() {
        return MethodInvocation.<UploadedFileChunk>get(this, links, "next", UploadedFileChunk.class);
    }

    public Future<DeserializedHttpResponseGen<UploadedFileChunk>> getUploadedFileChunkFromNextRelationAsync() {
        return MethodInvocation.<UploadedFileChunk>getAsync(this, links, "next", UploadedFileChunk.class);
    }

    public Future<DeserializedHttpResponseGen<UploadedFileChunk>> getUploadedFileChunkFromNextRelationAsync(CancellationToken ct) {
        return MethodInvocation.<UploadedFileChunk>getAsync(this, links, "next", UploadedFileChunk.class, ct);
    }



}
