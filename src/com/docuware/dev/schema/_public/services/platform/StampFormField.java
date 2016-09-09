

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;
import com.docuware.dev.schema._public.services.platform.SelectListResult;
import com.docuware.dev.schema._public.services.platform.SelectListExpression;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.schema._public.services.Links;
import com.docuware.dev.settings.interop.DWFieldType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StampFormField", propOrder = {
"proxy",
    "links"
})
public class StampFormField  implements IRelationsWithProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services")
    protected Links links;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "Label", required = true)
    protected String label;
    @XmlAttribute(name = "Length")
    protected Integer length;
    @XmlAttribute(name = "Precision")
    protected Integer precision;
    @XmlAttribute(name = "DWFieldType")
    protected DWFieldType dwFieldType;
    @XmlAttribute(name = "Mask")
    protected String mask;
    @XmlAttribute(name = "MaskErrorText")
    protected String maskErrorText;
    @XmlAttribute(name = "SampleEditText")
    protected String sampleEditText;

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links value) {
        this.links = value;
    }

    /**Name of the form field*/
    public String getName() {
        return name;
    }

    /**Name of the form field*/
    public void setName(String value) {
        this.name = value;
    }

    /**The label used to represent the form field when the stamp is set on the client.*/
    public String getLabel() {
        return label;
    }

    public void setLabel(String value) {
        this.label = value;
    }

    /**Lenght of the form field*/
    public int getLength() {
        if (length == null) {
            return  0;
        } else {
            return length;
        }
    }

    /**Lenght of the form field*/
    public void setLength(Integer value) {
        this.length = value;
    }

    /**Gets the number of digits after the decimal point in case of a numeric field.*/
    public int getPrecision() {
        if (precision == null) {
            return  0;
        } else {
            return precision;
        }
    }

    /**Gets the number of digits after the decimal point in case of a numeric field.*/
    public void setPrecision(Integer value) {
        this.precision = value;
    }

    /**The DocuWare type of the field.*/
    public DWFieldType getDWFieldType() {
        if (dwFieldType == null) {
            return DWFieldType.TEXT;
        } else {
            return dwFieldType;
        }
    }

    /**The DocuWare type of the field.*/
    public void setDWFieldType(DWFieldType value) {
        this.dwFieldType = value;
    }

    /**Mask(regular expression) for limiting the input options for the form field.*/
    public String getMask() {
        return mask;
    }

    /**Mask(regular expression) for limiting the input options for the form field.*/
    public void setMask(String value) {
        this.mask = value;
    }

    /**Error message to display if the input does not match the mask definition.*/
    public String getMaskErrorText() {
        return maskErrorText;
    }

    /**Error message to display if the input does not match the mask definition.*/
    public void setMaskErrorText(String value) {
        this.maskErrorText = value;
    }

    /**Sample entry that matches the mask definition.*/
    @Dolphin
    public String getSampleEditText() {
        return sampleEditText;
    }

    /**Sample entry that matches the mask definition.*/
    @Dolphin
    public void setSampleEditText(String value) {
        this.sampleEditText = value;
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
	* Gets the link by its name.
	* 
	* @param relationName	Name of the relation
	* @return	The link, if it exists; null otherwise.
	*/
    @Extension
    public Link getLink(String relationName) {
	return RelationExtension.getLink(this, relationName);
    }


	/**
	* Gets the URI of the relation specified by the name.
	* 
	* @param relationName	Name of the relation
	* @return	The link, if it exists; null otherwise.
	*/
    @Extension
    public String getRelationUri(String relationName) {
	return RelationExtension.getRelationUri(this, relationName);
    }


	/**
	* Gets the URI of the relation specified by the name.
	* 
	* @param relationName	Name of the relation
	* @return	The link, if it exists.
	* @throws	RuntimeException: The specified Link is not found
	*/
    @Extension
    public String getRelationUriOrThrow(String relationName) {
	return RelationExtension.getRelationUriOrThrow(this, relationName);
    }


	/**
	* Determines whether the specified link exists.
	* 
	* @param relationName	Name of the relation
	* @return	 True, if the specified link exists; otherwise, False.
	*/
    @Extension
    public boolean hasRelationUri(String relationName) {
	return RelationExtension.hasRelationUri(this, relationName);
    }

    /**
    * Gets the Uri of the Link for the relation "SelectListValues".
    * Returns the Uri of the Link for the relation "SelectListValues", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getSelectListValuesRelationLink() {
        return MethodInvocation.getLink(this, links, "selectListValues");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "SelectListValues".
    */
    public SelectListResult getSelectListResultFromSelectListValuesRelation() {
        return MethodInvocation.<SelectListResult>get(this, links, "selectListValues", SelectListResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "SelectListValues" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<SelectListResult>> getSelectListResultFromSelectListValuesRelationAsync() {
        return MethodInvocation.<SelectListResult>getAsync(this, links, "selectListValues", SelectListResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "SelectListValues" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<SelectListResult>> getSelectListResultFromSelectListValuesRelationAsync(CancellationToken ct) {
        return MethodInvocation.<SelectListResult>getAsync(this, links, "selectListValues", SelectListResult.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "SelectListValues".
    */
    public SelectListResult postToSelectListValuesRelationForSelectListResult(SelectListExpression data) {
        return MethodInvocation.<SelectListResult, SelectListExpression> post(this, links, "selectListValues", SelectListResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "SelectListExpression"), SelectListExpression.class, null, data), "application/vnd.docuware.platform.selectlistexpression+xml", "application/vnd.docuware.platform.selectlistresult+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "SelectListValues" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<SelectListResult>> postToSelectListValuesRelationForSelectListResultAsync(SelectListExpression data) {
        return MethodInvocation.<SelectListResult, SelectListExpression >postAsync(this, links, "selectListValues", SelectListResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "SelectListExpression"), SelectListExpression.class, null, data), "application/vnd.docuware.platform.selectlistexpression+xml", "application/vnd.docuware.platform.selectlistresult+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "SelectListValues" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<SelectListResult>> postToSelectListValuesRelationForSelectListResultAsync(CancellationToken ct, SelectListExpression data) {
        return MethodInvocation.<SelectListResult, SelectListExpression >postAsync(this, links, "selectListValues", SelectListResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "SelectListExpression"), SelectListExpression.class, null, data), "application/vnd.docuware.platform.selectlistexpression+xml", "application/vnd.docuware.platform.selectlistresult+xml", ct);
    }

    /**
    * Gets the Uri of the Link for the relation "SimpleSelectList".
    * Returns the Uri of the Link for the relation "SimpleSelectList", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getSimpleSelectListRelationLink() {
        return MethodInvocation.getLink(this, links, "simpleSelectList");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "SimpleSelectList".
    */
    public SelectListResult getSelectListResultFromSimpleSelectListRelation() {
        return MethodInvocation.<SelectListResult>get(this, links, "simpleSelectList", SelectListResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "SimpleSelectList" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<SelectListResult>> getSelectListResultFromSimpleSelectListRelationAsync() {
        return MethodInvocation.<SelectListResult>getAsync(this, links, "simpleSelectList", SelectListResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "SimpleSelectList" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<SelectListResult>> getSelectListResultFromSimpleSelectListRelationAsync(CancellationToken ct) {
        return MethodInvocation.<SelectListResult>getAsync(this, links, "simpleSelectList", SelectListResult.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "SimpleSelectList".
    */
    public SelectListResult postToSimpleSelectListRelationForSelectListResult(SelectListExpression data) {
        return MethodInvocation.<SelectListResult, SelectListExpression> post(this, links, "simpleSelectList", SelectListResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "SelectListExpression"), SelectListExpression.class, null, data), "application/vnd.docuware.platform.selectlistexpression+xml", "application/vnd.docuware.platform.selectlistresult+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "SimpleSelectList" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<SelectListResult>> postToSimpleSelectListRelationForSelectListResultAsync(SelectListExpression data) {
        return MethodInvocation.<SelectListResult, SelectListExpression >postAsync(this, links, "simpleSelectList", SelectListResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "SelectListExpression"), SelectListExpression.class, null, data), "application/vnd.docuware.platform.selectlistexpression+xml", "application/vnd.docuware.platform.selectlistresult+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "SimpleSelectList" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<SelectListResult>> postToSimpleSelectListRelationForSelectListResultAsync(CancellationToken ct, SelectListExpression data) {
        return MethodInvocation.<SelectListResult, SelectListExpression >postAsync(this, links, "simpleSelectList", SelectListResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "SelectListExpression"), SelectListExpression.class, null, data), "application/vnd.docuware.platform.selectlistexpression+xml", "application/vnd.docuware.platform.selectlistresult+xml", ct);
    }



}
