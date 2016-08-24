

package com.docuware.dev.schema._public.services;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


@XmlRegistry
public class ObjectFactory  {

    private final static QName _UriTemplates_QNAME = new QName("http://dev.docuware.com/schema/public/services", "UriTemplates");
    private final static QName _Links_QNAME = new QName("http://dev.docuware.com/schema/public/services", "Links");
    private final static QName _LogMessageGroups_QNAME = new QName("http://dev.docuware.com/schema/public/services", "LogMessageGroups");
    private final static QName _LogMessages_QNAME = new QName("http://dev.docuware.com/schema/public/services", "LogMessages");
    private final static QName _Link_QNAME = new QName("http://dev.docuware.com/schema/public/services", "Link");
    private final static QName _UriTemplate_QNAME = new QName("http://dev.docuware.com/schema/public/services", "UriTemplate");

    public ObjectFactory() {
    }

    public UriTemplateParameter createUriTemplateParameter() {
        return new UriTemplateParameter();
    }

    public UriTemplateDescription createUriTemplateDescription() {
        return new UriTemplateDescription();
    }

    public LogMessageGroups createLogMessageGroups() {
        return new LogMessageGroups();
    }

    public LogMessages createLogMessages() {
        return new LogMessages();
    }

    public Links createLinks() {
        return new Links();
    }

    public Link createLink() {
        return new Link();
    }

    public UriTemplateDescriptions createUriTemplateDescriptions() {
        return new UriTemplateDescriptions();
    }

    public UriInvocation createUriInvocation() {
        return new UriInvocation();
    }

    public LogMessage createLogMessage() {
        return new LogMessage();
    }

    public LogMessageGroup createLogMessageGroup() {
        return new LogMessageGroup();
    }

    public TypeReference createTypeReference() {
        return new TypeReference();
    }

    public UriTemplateParameter.HtmlDescription createUriTemplateParameterHtmlDescription() {
        return new UriTemplateParameter.HtmlDescription();
    }

    public UriTemplateDescription.HtmlDescription createUriTemplateDescriptionHtmlDescription() {
        return new UriTemplateDescription.HtmlDescription();
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services", name = "UriTemplates")
    public JAXBElement<UriTemplateDescriptions> createUriTemplates(UriTemplateDescriptions value) {
        return new JAXBElement<UriTemplateDescriptions>(_UriTemplates_QNAME, UriTemplateDescriptions.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services", name = "Links")
    public JAXBElement<Links> createLinks(Links value) {
        return new JAXBElement<Links>(_Links_QNAME, Links.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services", name = "LogMessageGroups")
    public JAXBElement<LogMessageGroups> createLogMessageGroups(LogMessageGroups value) {
        return new JAXBElement<LogMessageGroups>(_LogMessageGroups_QNAME, LogMessageGroups.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services", name = "LogMessages")
    public JAXBElement<LogMessages> createLogMessages(LogMessages value) {
        return new JAXBElement<LogMessages>(_LogMessages_QNAME, LogMessages.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services", name = "Link")
    public JAXBElement<Link> createLink(Link value) {
        return new JAXBElement<Link>(_Link_QNAME, Link.class, null, value);
    }

    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services", name = "UriTemplate")
    public JAXBElement<UriTemplateDescription> createUriTemplate(UriTemplateDescription value) {
        return new JAXBElement<UriTemplateDescription>(_UriTemplate_QNAME, UriTemplateDescription.class, null, value);
    }



}
