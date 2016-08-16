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

    public URI getThumbnailRelationLink() {
        return MethodInvocation.getLink(this, links, "thumbnail");
    }

    public URI getURIFromThumbnailRelation() {
        return MethodInvocation.<URI>get(this, links, "thumbnail", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromThumbnailRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "thumbnail", URI.class);
    }

    public URI getIconRelationLink() {
        return MethodInvocation.getLink(this, links, "icon");
    }

    public URI getURIFromIconRelation() {
        return MethodInvocation.<URI>get(this, links, "icon", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromIconRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "icon", URI.class);
    }

    public URI getDeepZoomImageRelationLink() {
        return MethodInvocation.getLink(this, links, "deepZoomImage");
    }

    public URI getURIFromDeepZoomImageRelation() {
        return MethodInvocation.<URI>get(this, links, "deepZoomImage", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromDeepZoomImageRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "deepZoomImage", URI.class);
    }

    public URI getDeepZoomImageWithAnnotationRelationLink() {
        return MethodInvocation.getLink(this, links, "deepZoomImageWithAnnotation");
    }

    public URI getURIFromDeepZoomImageWithAnnotationRelation() {
        return MethodInvocation.<URI>get(this, links, "deepZoomImageWithAnnotation", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromDeepZoomImageWithAnnotationRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "deepZoomImageWithAnnotation", URI.class);
    }

    public URI getLowQualityImageRelationLink() {
        return MethodInvocation.getLink(this, links, "lowQualityImage");
    }

    public URI getURIFromLowQualityImageRelation() {
        return MethodInvocation.<URI>get(this, links, "lowQualityImage", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromLowQualityImageRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "lowQualityImage", URI.class);
    }

    public URI getLowQualityImageWithAnnotationRelationLink() {
        return MethodInvocation.getLink(this, links, "lowQualityImageWithAnnotation");
    }

    public URI getURIFromLowQualityImageWithAnnotationRelation() {
        return MethodInvocation.<URI>get(this, links, "lowQualityImageWithAnnotation", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromLowQualityImageWithAnnotationRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "lowQualityImageWithAnnotation", URI.class);
    }

    public URI getTextshotRelationLink() {
        return MethodInvocation.getLink(this, links, "textshot");
    }

    public PageContent getPageContentFromTextshotRelation() {
        return MethodInvocation.<PageContent>get(this, links, "textshot", PageContent.class);
    }

    public Future<DeserializedHttpResponseGen<PageContent>> getPageContentFromTextshotRelationAsync() {
        return MethodInvocation.<PageContent>getAsync(this, links, "textshot", PageContent.class);
    }

    public URI getFileDownloadRelationLink() {
        return MethodInvocation.getLink(this, links, "fileDownload");
    }

    public URI getURIFromFileDownloadRelation() {
        return MethodInvocation.<URI>get(this, links, "fileDownload", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromFileDownloadRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "fileDownload", URI.class);
    }

    public String postToFileDownloadRelationForString(FileDownloadPage data) {
        return MethodInvocation.<String,FileDownloadPage>post(this, links, "fileDownload", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "FileDownloadPage"), FileDownloadPage.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<String>> postToFileDownloadRelationForStringAsync(FileDownloadPage data) {
        return MethodInvocation.<String, FileDownloadPage >postAsync(this, links, "fileDownload", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "FileDownloadPage"), FileDownloadPage.class, null, data));
    }

    public URI getAnnotationRelationLink() {
        return MethodInvocation.getLink(this, links, "annotation");
    }

    public Annotation getAnnotationFromAnnotationRelation() {
        return MethodInvocation.<Annotation>get(this, links, "annotation", Annotation.class);
    }

    public Future<DeserializedHttpResponseGen<Annotation>> getAnnotationFromAnnotationRelationAsync() {
        return MethodInvocation.<Annotation>getAsync(this, links, "annotation", Annotation.class);
    }

    public Annotation postToAnnotationRelationForAnnotation(AnnotationsPlacement data) {
        return MethodInvocation.<Annotation,AnnotationsPlacement>post(this, links, "annotation", Annotation.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "AnnotationsPlacement"), AnnotationsPlacement.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<Annotation>> postToAnnotationRelationForAnnotationAsync(AnnotationsPlacement data) {
        return MethodInvocation.<Annotation, AnnotationsPlacement >postAsync(this, links, "annotation", Annotation.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "AnnotationsPlacement"), AnnotationsPlacement.class, null, data));
    }

    public Annotation postToAnnotationRelationForAnnotation(Annotation data) {
        return MethodInvocation.<Annotation,Annotation>post(this, links, "annotation", Annotation.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "Annotation"), Annotation.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<Annotation>> postToAnnotationRelationForAnnotationAsync(Annotation data) {
        return MethodInvocation.<Annotation, Annotation >postAsync(this, links, "annotation", Annotation.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "Annotation"), Annotation.class, null, data));
    }

    public URI getAnnotationAsSvgRelationLink() {
        return MethodInvocation.getLink(this, links, "annotationAsSvg");
    }

    public URI getURIFromAnnotationAsSvgRelation() {
        return MethodInvocation.<URI>get(this, links, "annotationAsSvg", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromAnnotationAsSvgRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "annotationAsSvg", URI.class);
    }

    public URI getAnnotationAsXamlRelationLink() {
        return MethodInvocation.getLink(this, links, "annotationAsXaml");
    }

    public URI getURIFromAnnotationAsXamlRelation() {
        return MethodInvocation.<URI>get(this, links, "annotationAsXaml", URI.class);
    }

    public Future<DeserializedHttpResponseGen<URI>> getURIFromAnnotationAsXamlRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "annotationAsXaml", URI.class);
    }

    public URI getStampRelationLink() {
        return MethodInvocation.getLink(this, links, "stamp");
    }

    public Annotation postToStampRelationForAnnotation(StampPlacement data) {
        return MethodInvocation.<Annotation,StampPlacement>post(this, links, "stamp", Annotation.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "StampPlacement"), StampPlacement.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<Annotation>> postToStampRelationForAnnotationAsync(StampPlacement data) {
        return MethodInvocation.<Annotation, StampPlacement >postAsync(this, links, "stamp", Annotation.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "StampPlacement"), StampPlacement.class, null, data));
    }

    public URI getStampBestPositionRelationLink() {
        return MethodInvocation.getLink(this, links, "stampBestPosition");
    }

    public DWPoint postToStampBestPositionRelationForDWPoint(StampFormFieldValues data) {
        return MethodInvocation.<DWPoint,StampFormFieldValues>post(this, links, "stampBestPosition", DWPoint.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "StampFormFieldValues"), StampFormFieldValues.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<DWPoint>> postToStampBestPositionRelationForDWPointAsync(StampFormFieldValues data) {
        return MethodInvocation.<DWPoint, StampFormFieldValues >postAsync(this, links, "stampBestPosition", DWPoint.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "StampFormFieldValues"), StampFormFieldValues.class, null, data));
    }

    public URI getSelfRelationLink() {
        return MethodInvocation.getLink(this, links, "self");
    }

    public Page getPageFromSelfRelation() {
        return MethodInvocation.<Page>get(this, links, "self", Page.class);
    }

    public Future<DeserializedHttpResponseGen<Page>> getPageFromSelfRelationAsync() {
        return MethodInvocation.<Page>getAsync(this, links, "self", Page.class);
    }



}
