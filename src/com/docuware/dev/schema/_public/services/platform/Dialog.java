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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r Dialog complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Dialog">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}DialogInfo">
 *       &lt;sequence>
 *         &lt;element name="Fields" type="{http://dev.docuware.com/schema/public/services/platform}DialogFields"/>
 *         &lt;element name="Query" type="{http://dev.docuware.com/schema/public/services/platform}DocumentsQuery" minOccurs="0"/>
 *         &lt;element name="Properties" type="{http://dev.docuware.com/schema/public/services/platform}DialogProperties"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dialog", propOrder = {
"proxy",
    "fields",
    "query",
    "properties"
})
public class Dialog
    extends DialogInfo
 implements IHttpClientProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Fields", required = true)
    protected DialogFields fields;
    @XmlElement(name = "Query")
    protected DocumentsQuery query;
    @XmlElement(name = "Properties", required = true)
    protected DialogProperties properties;

    /**
     * Ruft den Wert der fields-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DialogFields }
     *     
     */
    public DialogFields getFields() {
        return fields;
    }

    /**
     * Legt den Wert der fields-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DialogFields }
     *     
     */
    public void setFields(DialogFields value) {
        this.fields = value;
    }

    /**
     * Ruft den Wert der query-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DocumentsQuery }
     *     
     */
    public DocumentsQuery getQuery() {
        return query;
    }

    /**
     * Legt den Wert der query-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentsQuery }
     *     
     */
    public void setQuery(DocumentsQuery value) {
        this.query = value;
    }

    /**
     * Ruft den Wert der properties-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DialogProperties }
     *     
     */
    public DialogProperties getProperties() {
        return properties;
    }

    /**
     * Legt den Wert der properties-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DialogProperties }
     *     
     */
    public void setProperties(DialogProperties value) {
        this.properties = value;
    }

    public HttpClientProxy getProxy() {
	return this.proxy;
    }

    public void setProxy(HttpClientProxy proxy) {
	super.setProxy(proxy);
    this.proxy = proxy;
	if(this.fields!=null) { 
        for (int i = 0; (i < this.fields.getField().size()); i = (i + 1)) {
            this.fields.getField().get(i).setProxy(proxy);
        }
	}
    if ((query != null)) {
        query.setProxy(proxy);
    }
    if ((properties != null)) {
        properties.setProxy(proxy);
    }
    }



}
