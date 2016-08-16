//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.08.16 um 09:04:54 AM CEST 
//


package com.docuware.dev.schema._public.services.annotations;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.docuware.dev.schema._public.services.annotations package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory  {

    private final static QName _Relations_QNAME = new QName("http://dev.docuware.com/schema/public/services/annotations", "Relations");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.docuware.dev.schema._public.services.annotations
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ContentTypeList }
     * 
     */
    public ContentTypeList createContentTypeList() {
        return new ContentTypeList();
    }

    /**
     * Create an instance of {@link com.docuware.dev.schema._public.services.annotations.ContentType }
     * 
     */
    public com.docuware.dev.schema._public.services.annotations.ContentType createContentType() {
        return new com.docuware.dev.schema._public.services.annotations.ContentType();
    }

    /**
     * Create an instance of {@link LinkRelations }
     * 
     */
    public LinkRelations createLinkRelations() {
        return new LinkRelations();
    }

    /**
     * Create an instance of {@link LinkInvoke }
     * 
     */
    public LinkInvoke createLinkInvoke() {
        return new LinkInvoke();
    }

    /**
     * Create an instance of {@link QueryParamatersList }
     * 
     */
    public QueryParamatersList createQueryParamatersList() {
        return new QueryParamatersList();
    }

    /**
     * Create an instance of {@link HttpMethodList }
     * 
     */
    public HttpMethodList createHttpMethodList() {
        return new HttpMethodList();
    }

    /**
     * Create an instance of {@link QueryParamater }
     * 
     */
    public QueryParamater createQueryParamater() {
        return new QueryParamater();
    }

    /**
     * Create an instance of {@link LinkRelation }
     * 
     */
    public LinkRelation createLinkRelation() {
        return new LinkRelation();
    }

    /**
     * Create an instance of {@link ContentTypeList.ContentType }
     * 
     */
    public ContentTypeList.ContentType createContentTypeListContentType() {
        return new ContentTypeList.ContentType();
    }

    /**
     * Create an instance of {@link ContentTypeList.SchemaType }
     * 
     */
    public ContentTypeList.SchemaType createContentTypeListSchemaType() {
        return new ContentTypeList.SchemaType();
    }

    /**
     * Create an instance of {@link ContentTypeList.ComplexType }
     * 
     */
    public ContentTypeList.ComplexType createContentTypeListComplexType() {
        return new ContentTypeList.ComplexType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LinkRelations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/annotations", name = "Relations")
    public JAXBElement<LinkRelations> createRelations(LinkRelations value) {
        return new JAXBElement<LinkRelations>(_Relations_QNAME, LinkRelations.class, null, value);
    }



}
