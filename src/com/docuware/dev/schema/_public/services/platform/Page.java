//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.08.22 um 03:45:48 PM CEST 
//


package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;
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


/**
 * Gets the vertical size of a page image in pixels. In case of vector images this is the maximal pixel height which can be rendered.
 * 
 * <p>Java-Klasse f�r Page complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Page">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Data" type="{http://dev.docuware.com/schema/public/services/platform}PageData" minOccurs="0"/>
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PageNum" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="HasAnnotation" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
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

    /**
     * Ruft den Wert der data-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PageData }
     *     
     */
    public PageData getData() {
        return data;
    }

    /**
     * Legt den Wert der data-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PageData }
     *     
     */
    public void setData(PageData value) {
        this.data = value;
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

    /**
     * Ruft den Wert der pageNum-Eigenschaft ab.
     * 
     */
    public int getPageNum() {
        return pageNum;
    }

    /**
     * Legt den Wert der pageNum-Eigenschaft fest.
     * 
     */
    public void setPageNum(int value) {
        this.pageNum = value;
    }

    /**
     * Ruft den Wert der hasAnnotation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isHasAnnotation() {
        if (hasAnnotation == null) {
            return false;
        } else {
            return hasAnnotation;
        }
    }

    /**
     * Legt den Wert der hasAnnotation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasAnnotation(Boolean value) {
        this.hasAnnotation = value;
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
    }


	/**
	* Gets the base URI of the specified relations instance.
	* 
	* @return	The base URI of the specified relations instance.
	*/
    public URI getBaseUri() {
	return RelationsWithProxyExtensions.getBaseUri(this);
    }


	/**
	* Gets the link by its name.
	* 
	* @param relationName	Name of the relation
	* @return	The link, if it exists; null otherwise.
	*/
    public Link getLink(String relationName) {
	return RelationExtension.getLink(this, relationName);
    }


	/**
	* Gets the URI of the relation specified by the name.
	* 
	* @param relationName	Name of the relation
	* @return	The link, if it exists; null otherwise.
	*/
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
    public String getRelationUriOrThrow(String relationName) {
	return RelationExtension.getRelationUriOrThrow(this, relationName);
    }


	/**
	* Determines whether the specified link exists.
	* 
	* @param relationName	Name of the relation
	* @return	 True, if the specified link exists; otherwise, False.
	*/
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
    public URI getURIFromThumbnailRelation() {
        return MethodInvocation.<URI>get(this, links, "thumbnail", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Thumbnail" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromThumbnailRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "thumbnail", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Thumbnail" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromThumbnailRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "thumbnail", URI.class, ct);
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
    public URI getURIFromIconRelation() {
        return MethodInvocation.<URI>get(this, links, "icon", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Icon" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromIconRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "icon", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Icon" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromIconRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "icon", URI.class, ct);
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
    public URI getURIFromDeepZoomImageRelation() {
        return MethodInvocation.<URI>get(this, links, "deepZoomImage", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "DeepZoomImage" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromDeepZoomImageRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "deepZoomImage", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "DeepZoomImage" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromDeepZoomImageRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "deepZoomImage", URI.class, ct);
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
    public URI getURIFromDeepZoomImageWithAnnotationRelation() {
        return MethodInvocation.<URI>get(this, links, "deepZoomImageWithAnnotation", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "DeepZoomImageWithAnnotation" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromDeepZoomImageWithAnnotationRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "deepZoomImageWithAnnotation", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "DeepZoomImageWithAnnotation" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromDeepZoomImageWithAnnotationRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "deepZoomImageWithAnnotation", URI.class, ct);
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
    public URI getURIFromLowQualityImageRelation() {
        return MethodInvocation.<URI>get(this, links, "lowQualityImage", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "LowQualityImage" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromLowQualityImageRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "lowQualityImage", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "LowQualityImage" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromLowQualityImageRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "lowQualityImage", URI.class, ct);
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
    public URI getURIFromLowQualityImageWithAnnotationRelation() {
        return MethodInvocation.<URI>get(this, links, "lowQualityImageWithAnnotation", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "LowQualityImageWithAnnotation" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromLowQualityImageWithAnnotationRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "lowQualityImageWithAnnotation", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "LowQualityImageWithAnnotation" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromLowQualityImageWithAnnotationRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "lowQualityImageWithAnnotation", URI.class, ct);
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
    public Future<DeserializedHttpResponseGen<PageContent>> getPageContentFromTextshotRelationAsync() {
        return MethodInvocation.<PageContent>getAsync(this, links, "textshot", PageContent.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Textshot" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<PageContent>> getPageContentFromTextshotRelationAsync(CancellationToken ct) {
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
    public URI getURIFromFileDownloadRelation() {
        return MethodInvocation.<URI>get(this, links, "fileDownload", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "FileDownload" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromFileDownloadRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "fileDownload", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "FileDownload" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromFileDownloadRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "fileDownload", URI.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "FileDownload".
    */
    public String postToFileDownloadRelationForString(FileDownloadPage data) {
        return MethodInvocation.<String,FileDownloadPage>post(this, links, "fileDownload", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "FileDownloadPage"), FileDownloadPage.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "FileDownload" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> postToFileDownloadRelationForStringAsync(FileDownloadPage data) {
        return MethodInvocation.<String, FileDownloadPage >postAsync(this, links, "fileDownload", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "FileDownloadPage"), FileDownloadPage.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "FileDownload" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> postToFileDownloadRelationForStringAsync(FileDownloadPage data, CancellationToken ct) {
        return MethodInvocation.<String, FileDownloadPage >postAsync(this, links, "fileDownload", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "FileDownloadPage"), FileDownloadPage.class, null, data), ct);
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
    public Future<DeserializedHttpResponseGen<Annotation>> getAnnotationFromAnnotationRelationAsync() {
        return MethodInvocation.<Annotation>getAsync(this, links, "annotation", Annotation.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Annotation" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Annotation>> getAnnotationFromAnnotationRelationAsync(CancellationToken ct) {
        return MethodInvocation.<Annotation>getAsync(this, links, "annotation", Annotation.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Annotation".
    */
    public Annotation postToAnnotationRelationForAnnotation(AnnotationsPlacement data) {
        return MethodInvocation.<Annotation,AnnotationsPlacement>post(this, links, "annotation", Annotation.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "AnnotationsPlacement"), AnnotationsPlacement.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Annotation" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Annotation>> postToAnnotationRelationForAnnotationAsync(AnnotationsPlacement data) {
        return MethodInvocation.<Annotation, AnnotationsPlacement >postAsync(this, links, "annotation", Annotation.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "AnnotationsPlacement"), AnnotationsPlacement.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Annotation" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Annotation>> postToAnnotationRelationForAnnotationAsync(AnnotationsPlacement data, CancellationToken ct) {
        return MethodInvocation.<Annotation, AnnotationsPlacement >postAsync(this, links, "annotation", Annotation.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "AnnotationsPlacement"), AnnotationsPlacement.class, null, data), ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Annotation".
    */
    public Annotation postToAnnotationRelationForAnnotation(Annotation data) {
        return MethodInvocation.<Annotation,Annotation>post(this, links, "annotation", Annotation.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "Annotation"), Annotation.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Annotation" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Annotation>> postToAnnotationRelationForAnnotationAsync(Annotation data) {
        return MethodInvocation.<Annotation, Annotation >postAsync(this, links, "annotation", Annotation.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "Annotation"), Annotation.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Annotation" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Annotation>> postToAnnotationRelationForAnnotationAsync(Annotation data, CancellationToken ct) {
        return MethodInvocation.<Annotation, Annotation >postAsync(this, links, "annotation", Annotation.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "Annotation"), Annotation.class, null, data), ct);
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
    public URI getURIFromAnnotationAsSvgRelation() {
        return MethodInvocation.<URI>get(this, links, "annotationAsSvg", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "AnnotationAsSvg" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromAnnotationAsSvgRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "annotationAsSvg", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "AnnotationAsSvg" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromAnnotationAsSvgRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "annotationAsSvg", URI.class, ct);
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
    public URI getURIFromAnnotationAsXamlRelation() {
        return MethodInvocation.<URI>get(this, links, "annotationAsXaml", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "AnnotationAsXaml" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromAnnotationAsXamlRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "annotationAsXaml", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "AnnotationAsXaml" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromAnnotationAsXamlRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "annotationAsXaml", URI.class, ct);
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
        return MethodInvocation.<Annotation,StampPlacement>post(this, links, "stamp", Annotation.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "StampPlacement"), StampPlacement.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Stamp" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Annotation>> postToStampRelationForAnnotationAsync(StampPlacement data) {
        return MethodInvocation.<Annotation, StampPlacement >postAsync(this, links, "stamp", Annotation.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "StampPlacement"), StampPlacement.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Stamp" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Annotation>> postToStampRelationForAnnotationAsync(StampPlacement data, CancellationToken ct) {
        return MethodInvocation.<Annotation, StampPlacement >postAsync(this, links, "stamp", Annotation.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "StampPlacement"), StampPlacement.class, null, data), ct);
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
        return MethodInvocation.<DWPoint,StampFormFieldValues>post(this, links, "stampBestPosition", DWPoint.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "StampFormFieldValues"), StampFormFieldValues.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "StampBestPosition" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DWPoint>> postToStampBestPositionRelationForDWPointAsync(StampFormFieldValues data) {
        return MethodInvocation.<DWPoint, StampFormFieldValues >postAsync(this, links, "stampBestPosition", DWPoint.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "StampFormFieldValues"), StampFormFieldValues.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "StampBestPosition" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DWPoint>> postToStampBestPositionRelationForDWPointAsync(StampFormFieldValues data, CancellationToken ct) {
        return MethodInvocation.<DWPoint, StampFormFieldValues >postAsync(this, links, "stampBestPosition", DWPoint.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "StampFormFieldValues"), StampFormFieldValues.class, null, data), ct);
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
    public Future<DeserializedHttpResponseGen<Page>> getPageFromSelfRelationAsync() {
        return MethodInvocation.<Page>getAsync(this, links, "self", Page.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Self" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Page>> getPageFromSelfRelationAsync(CancellationToken ct) {
        return MethodInvocation.<Page>getAsync(this, links, "self", Page.class, ct);
    }



}
