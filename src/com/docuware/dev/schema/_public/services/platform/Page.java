

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;
import java.io.InputStream;
import com.docuware.dev._public.intellix.PageContent;
import com.docuware.dev.schema._public.services.platform.FileDownloadPage;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import com.docuware.dev.schema._public.services.platform.Annotation;
import com.docuware.dev.schema._public.services.platform.AnnotationsPlacement;
import com.docuware.dev.schema._public.services.platform.StampPlacement;
import com.docuware.dev.settings.common.DWPoint;
import com.docuware.dev.schema._public.services.platform.StampFormFieldValues;
import com.docuware.dev.schema._public.services.platform.Page;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.schema._public.services.Links;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Page", propOrder = {
"proxy",
    "data",
    "links"
})
public class Page  implements IRelationsWithProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Data")
    protected PageData data;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services")
    protected Links links;
    @XmlAttribute(name = "PageNum", required = true)
    protected int pageNum;
    @XmlAttribute(name = "HasAnnotation")
    protected Boolean hasAnnotation;

    public PageData getData() {
        return data;
    }

    public void setData(PageData value) {
        this.data = value;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links value) {
        this.links = value;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int value) {
        this.pageNum = value;
    }

    /**Gets to sets if this page has annotations.*/
    public boolean isHasAnnotation() {
        if (hasAnnotation == null) {
            return false;
        } else {
            return hasAnnotation;
        }
    }

    public void setHasAnnotation(Boolean value) {
        this.hasAnnotation = value;
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
    * Gets the Uri of the Link for the relation "Thumbnail".
    * Returns the Uri of the Link for the relation "Thumbnail", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getThumbnailRelationLink() {
        return MethodInvocation.getLink(this, links, "thumbnail");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Thumbnail".
    */
    public InputStream getInputStreamFromThumbnailRelation() {
        return MethodInvocation.<InputStream>get(this, links, "thumbnail", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Thumbnail" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromThumbnailRelationAsync() {
        return MethodInvocation.<InputStream>getAsync(this, links, "thumbnail", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Thumbnail" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromThumbnailRelationAsync(CancellationToken ct) {
        return MethodInvocation.<InputStream>getAsync(this, links, "thumbnail", InputStream.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Icon".
    * Returns the Uri of the Link for the relation "Icon", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getIconRelationLink() {
        return MethodInvocation.getLink(this, links, "icon");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Icon".
    */
    public InputStream getInputStreamFromIconRelation() {
        return MethodInvocation.<InputStream>get(this, links, "icon", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Icon" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromIconRelationAsync() {
        return MethodInvocation.<InputStream>getAsync(this, links, "icon", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Icon" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromIconRelationAsync(CancellationToken ct) {
        return MethodInvocation.<InputStream>getAsync(this, links, "icon", InputStream.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "DeepZoomImage".
    * Returns the Uri of the Link for the relation "DeepZoomImage", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getDeepZoomImageRelationLink() {
        return MethodInvocation.getLink(this, links, "deepZoomImage");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "DeepZoomImage".
    */
    public InputStream getInputStreamFromDeepZoomImageRelation() {
        return MethodInvocation.<InputStream>get(this, links, "deepZoomImage", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "DeepZoomImage" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromDeepZoomImageRelationAsync() {
        return MethodInvocation.<InputStream>getAsync(this, links, "deepZoomImage", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "DeepZoomImage" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromDeepZoomImageRelationAsync(CancellationToken ct) {
        return MethodInvocation.<InputStream>getAsync(this, links, "deepZoomImage", InputStream.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "DeepZoomImageWithAnnotation".
    * Returns the Uri of the Link for the relation "DeepZoomImageWithAnnotation", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getDeepZoomImageWithAnnotationRelationLink() {
        return MethodInvocation.getLink(this, links, "deepZoomImageWithAnnotation");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "DeepZoomImageWithAnnotation".
    */
    public InputStream getInputStreamFromDeepZoomImageWithAnnotationRelation() {
        return MethodInvocation.<InputStream>get(this, links, "deepZoomImageWithAnnotation", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "DeepZoomImageWithAnnotation" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromDeepZoomImageWithAnnotationRelationAsync() {
        return MethodInvocation.<InputStream>getAsync(this, links, "deepZoomImageWithAnnotation", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "DeepZoomImageWithAnnotation" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromDeepZoomImageWithAnnotationRelationAsync(CancellationToken ct) {
        return MethodInvocation.<InputStream>getAsync(this, links, "deepZoomImageWithAnnotation", InputStream.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "LowQualityImage".
    * Returns the Uri of the Link for the relation "LowQualityImage", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getLowQualityImageRelationLink() {
        return MethodInvocation.getLink(this, links, "lowQualityImage");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "LowQualityImage".
    */
    public InputStream getInputStreamFromLowQualityImageRelation() {
        return MethodInvocation.<InputStream>get(this, links, "lowQualityImage", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "LowQualityImage" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromLowQualityImageRelationAsync() {
        return MethodInvocation.<InputStream>getAsync(this, links, "lowQualityImage", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "LowQualityImage" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromLowQualityImageRelationAsync(CancellationToken ct) {
        return MethodInvocation.<InputStream>getAsync(this, links, "lowQualityImage", InputStream.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "LowQualityImageWithAnnotation".
    * Returns the Uri of the Link for the relation "LowQualityImageWithAnnotation", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getLowQualityImageWithAnnotationRelationLink() {
        return MethodInvocation.getLink(this, links, "lowQualityImageWithAnnotation");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "LowQualityImageWithAnnotation".
    */
    public InputStream getInputStreamFromLowQualityImageWithAnnotationRelation() {
        return MethodInvocation.<InputStream>get(this, links, "lowQualityImageWithAnnotation", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "LowQualityImageWithAnnotation" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromLowQualityImageWithAnnotationRelationAsync() {
        return MethodInvocation.<InputStream>getAsync(this, links, "lowQualityImageWithAnnotation", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "LowQualityImageWithAnnotation" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromLowQualityImageWithAnnotationRelationAsync(CancellationToken ct) {
        return MethodInvocation.<InputStream>getAsync(this, links, "lowQualityImageWithAnnotation", InputStream.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Textshot".
    * Returns the Uri of the Link for the relation "Textshot", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getTextshotRelationLink() {
        return MethodInvocation.getLink(this, links, "textshot");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Textshot".
    */
    public PageContent getPageContentFromTextshotRelation() {
        return MethodInvocation.<PageContent>get(this, links, "textshot", PageContent.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Textshot" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<PageContent>> getPageContentFromTextshotRelationAsync() {
        return MethodInvocation.<PageContent>getAsync(this, links, "textshot", PageContent.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Textshot" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<PageContent>> getPageContentFromTextshotRelationAsync(CancellationToken ct) {
        return MethodInvocation.<PageContent>getAsync(this, links, "textshot", PageContent.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "FileDownload".
    * Returns the Uri of the Link for the relation "FileDownload", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getFileDownloadRelationLink() {
        return MethodInvocation.getLink(this, links, "fileDownload");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "FileDownload".
    */
    public InputStream getInputStreamFromFileDownloadRelation() {
        return MethodInvocation.<InputStream>get(this, links, "fileDownload", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "FileDownload" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromFileDownloadRelationAsync() {
        return MethodInvocation.<InputStream>getAsync(this, links, "fileDownload", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "FileDownload" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromFileDownloadRelationAsync(CancellationToken ct) {
        return MethodInvocation.<InputStream>getAsync(this, links, "fileDownload", InputStream.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "FileDownload".
    */
    public InputStream postToFileDownloadRelationForInputStream(FileDownloadPage data) {
        return MethodInvocation.<InputStream, FileDownloadPage> post(this, links, "fileDownload", InputStream.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "FileDownloadPage"), FileDownloadPage.class, null, data), "application/xml", "application/xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "FileDownload" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> postToFileDownloadRelationForInputStreamAsync(FileDownloadPage data) {
        return MethodInvocation.<InputStream, FileDownloadPage >postAsync(this, links, "fileDownload", InputStream.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "FileDownloadPage"), FileDownloadPage.class, null, data), "application/xml", "application/xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "FileDownload" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> postToFileDownloadRelationForInputStreamAsync(CancellationToken ct, FileDownloadPage data) {
        return MethodInvocation.<InputStream, FileDownloadPage >postAsync(this, links, "fileDownload", InputStream.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "FileDownloadPage"), FileDownloadPage.class, null, data), "application/xml", "application/xml", ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Annotation".
    * Returns the Uri of the Link for the relation "Annotation", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getAnnotationRelationLink() {
        return MethodInvocation.getLink(this, links, "annotation");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Annotation".
    */
    public Annotation getAnnotationFromAnnotationRelation() {
        return MethodInvocation.<Annotation>get(this, links, "annotation", Annotation.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Annotation" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Annotation>> getAnnotationFromAnnotationRelationAsync() {
        return MethodInvocation.<Annotation>getAsync(this, links, "annotation", Annotation.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Annotation" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Annotation>> getAnnotationFromAnnotationRelationAsync(CancellationToken ct) {
        return MethodInvocation.<Annotation>getAsync(this, links, "annotation", Annotation.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Annotation".
    */
    public Annotation postToAnnotationRelationForAnnotation(AnnotationsPlacement data) {
        return MethodInvocation.<Annotation, AnnotationsPlacement> post(this, links, "annotation", Annotation.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "AnnotationsPlacement"), AnnotationsPlacement.class, null, data), "application/vnd.docuware.platform.annotationsplacement+xml", "application/vnd.docuware.platform.annotation+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Annotation" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Annotation>> postToAnnotationRelationForAnnotationAsync(AnnotationsPlacement data) {
        return MethodInvocation.<Annotation, AnnotationsPlacement >postAsync(this, links, "annotation", Annotation.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "AnnotationsPlacement"), AnnotationsPlacement.class, null, data), "application/vnd.docuware.platform.annotationsplacement+xml", "application/vnd.docuware.platform.annotation+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Annotation" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Annotation>> postToAnnotationRelationForAnnotationAsync(CancellationToken ct, AnnotationsPlacement data) {
        return MethodInvocation.<Annotation, AnnotationsPlacement >postAsync(this, links, "annotation", Annotation.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "AnnotationsPlacement"), AnnotationsPlacement.class, null, data), "application/vnd.docuware.platform.annotationsplacement+xml", "application/vnd.docuware.platform.annotation+xml", ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Annotation".
    */
    public Annotation postToAnnotationRelationForAnnotation(Annotation data) {
        return MethodInvocation.<Annotation, Annotation> post(this, links, "annotation", Annotation.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "Annotation"), Annotation.class, null, data), "application/vnd.docuware.platform.annotation+xml", "application/vnd.docuware.platform.annotation+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Annotation" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Annotation>> postToAnnotationRelationForAnnotationAsync(Annotation data) {
        return MethodInvocation.<Annotation, Annotation >postAsync(this, links, "annotation", Annotation.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "Annotation"), Annotation.class, null, data), "application/vnd.docuware.platform.annotation+xml", "application/vnd.docuware.platform.annotation+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Annotation" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Annotation>> postToAnnotationRelationForAnnotationAsync(CancellationToken ct, Annotation data) {
        return MethodInvocation.<Annotation, Annotation >postAsync(this, links, "annotation", Annotation.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "Annotation"), Annotation.class, null, data), "application/vnd.docuware.platform.annotation+xml", "application/vnd.docuware.platform.annotation+xml", ct);
    }

    /**
    * Gets the Uri of the Link for the relation "AnnotationAsSvg".
    * Returns the Uri of the Link for the relation "AnnotationAsSvg", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getAnnotationAsSvgRelationLink() {
        return MethodInvocation.getLink(this, links, "annotationAsSvg");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "AnnotationAsSvg".
    */
    public InputStream getInputStreamFromAnnotationAsSvgRelation() {
        return MethodInvocation.<InputStream>get(this, links, "annotationAsSvg", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "AnnotationAsSvg" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromAnnotationAsSvgRelationAsync() {
        return MethodInvocation.<InputStream>getAsync(this, links, "annotationAsSvg", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "AnnotationAsSvg" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<InputStream>> getInputStreamFromAnnotationAsSvgRelationAsync(CancellationToken ct) {
        return MethodInvocation.<InputStream>getAsync(this, links, "annotationAsSvg", InputStream.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "AnnotationAsXaml".
    * Returns the Uri of the Link for the relation "AnnotationAsXaml", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getAnnotationAsXamlRelationLink() {
        return MethodInvocation.getLink(this, links, "annotationAsXaml");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "AnnotationAsXaml".
    */
    public XElementWrapper getXElementWrapperFromAnnotationAsXamlRelation() {
        return MethodInvocation.<XElementWrapper>get(this, links, "annotationAsXaml", XElementWrapper.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "AnnotationAsXaml" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<XElementWrapper>> getXElementWrapperFromAnnotationAsXamlRelationAsync() {
        return MethodInvocation.<XElementWrapper>getAsync(this, links, "annotationAsXaml", XElementWrapper.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "AnnotationAsXaml" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<XElementWrapper>> getXElementWrapperFromAnnotationAsXamlRelationAsync(CancellationToken ct) {
        return MethodInvocation.<XElementWrapper>getAsync(this, links, "annotationAsXaml", XElementWrapper.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Stamp".
    * Returns the Uri of the Link for the relation "Stamp", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getStampRelationLink() {
        return MethodInvocation.getLink(this, links, "stamp");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Stamp".
    */
    public Annotation postToStampRelationForAnnotation(StampPlacement data) {
        return MethodInvocation.<Annotation, StampPlacement> post(this, links, "stamp", Annotation.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "StampPlacement"), StampPlacement.class, null, data), "application/vnd.docuware.platform.stampplacement+xml", "application/vnd.docuware.platform.annotation+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Stamp" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Annotation>> postToStampRelationForAnnotationAsync(StampPlacement data) {
        return MethodInvocation.<Annotation, StampPlacement >postAsync(this, links, "stamp", Annotation.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "StampPlacement"), StampPlacement.class, null, data), "application/vnd.docuware.platform.stampplacement+xml", "application/vnd.docuware.platform.annotation+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Stamp" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Annotation>> postToStampRelationForAnnotationAsync(CancellationToken ct, StampPlacement data) {
        return MethodInvocation.<Annotation, StampPlacement >postAsync(this, links, "stamp", Annotation.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "StampPlacement"), StampPlacement.class, null, data), "application/vnd.docuware.platform.stampplacement+xml", "application/vnd.docuware.platform.annotation+xml", ct);
    }

    /**
    * Gets the Uri of the Link for the relation "StampBestPosition".
    * Returns the Uri of the Link for the relation "StampBestPosition", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getStampBestPositionRelationLink() {
        return MethodInvocation.getLink(this, links, "stampBestPosition");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "StampBestPosition".
    */
    public DWPoint postToStampBestPositionRelationForDWPoint(StampFormFieldValues data) {
        return MethodInvocation.<DWPoint, StampFormFieldValues> post(this, links, "stampBestPosition", DWPoint.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "StampFormFieldValues"), StampFormFieldValues.class, null, data), "application/vnd.docuware.platform.stampformfieldvalues+xml", "application/vnd.docuware.datatypes.point+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "StampBestPosition" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DWPoint>> postToStampBestPositionRelationForDWPointAsync(StampFormFieldValues data) {
        return MethodInvocation.<DWPoint, StampFormFieldValues >postAsync(this, links, "stampBestPosition", DWPoint.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "StampFormFieldValues"), StampFormFieldValues.class, null, data), "application/vnd.docuware.platform.stampformfieldvalues+xml", "application/vnd.docuware.datatypes.point+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "StampBestPosition" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<DWPoint>> postToStampBestPositionRelationForDWPointAsync(CancellationToken ct, StampFormFieldValues data) {
        return MethodInvocation.<DWPoint, StampFormFieldValues >postAsync(this, links, "stampBestPosition", DWPoint.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "StampFormFieldValues"), StampFormFieldValues.class, null, data), "application/vnd.docuware.platform.stampformfieldvalues+xml", "application/vnd.docuware.datatypes.point+xml", ct);
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
    public Page getPageFromSelfRelation() {
        return MethodInvocation.<Page>get(this, links, "self", Page.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Self" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Page>> getPageFromSelfRelationAsync() {
        return MethodInvocation.<Page>getAsync(this, links, "self", Page.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Self" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<Page>> getPageFromSelfRelationAsync(CancellationToken ct) {
        return MethodInvocation.<Page>getAsync(this, links, "self", Page.class, ct);
    }



}
