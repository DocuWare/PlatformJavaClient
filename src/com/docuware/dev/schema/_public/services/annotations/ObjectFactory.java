

package com.docuware.dev.schema._public.services.annotations;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


@XmlRegistry
public class ObjectFactory  {

    private final static QName _Relations_QNAME = new QName("http://dev.docuware.com/schema/public/services/annotations", "Relations");

    public ObjectFactory() {
    }

    public ContentTypeList createContentTypeList() {
        return new ContentTypeList();
    }

    public com.docuware.dev.schema._public.services.annotations.ContentType createContentType() {
        return new com.docuware.dev.schema._public.services.annotations.ContentType();
    }

    public LinkRelations createLinkRelations() {
        return new LinkRelations();
    }

    public LinkInvoke createLinkInvoke() {
        return new LinkInvoke();
    }

    public QueryParamatersList createQueryParamatersList() {
        return new QueryParamatersList();
    }

    public HttpMethodList createHttpMethodList() {
        return new HttpMethodList();
    }

    public QueryParamater createQueryParamater() {
        return new QueryParamater();
    }

    public LinkRelation createLinkRelation() {
        return new LinkRelation();
    }

    public ContentTypeList.ContentType createContentTypeListContentType() {
        return new ContentTypeList.ContentType();
    }

    public ContentTypeList.SchemaType createContentTypeListSchemaType() {
        return new ContentTypeList.SchemaType();
    }

    public ContentTypeList.ComplexType createContentTypeListComplexType() {
        return new ContentTypeList.ComplexType();
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services/annotations", name = "Relations")
    public JAXBElement<LinkRelations> createRelations(LinkRelations value) {
        return new JAXBElement<LinkRelations>(_Relations_QNAME, LinkRelations.class, null, value);
    }



}
