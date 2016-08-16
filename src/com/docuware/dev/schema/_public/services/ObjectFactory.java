//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.08.16 um 09:04:54 AM CEST 
//


package com.docuware.dev.schema._public.services;

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
 * generated in the com.docuware.dev.schema._public.services package. 
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

    private final static QName _UriTemplates_QNAME = new QName("http://dev.docuware.com/schema/public/services", "UriTemplates");
    private final static QName _Links_QNAME = new QName("http://dev.docuware.com/schema/public/services", "Links");
    private final static QName _LogMessageGroups_QNAME = new QName("http://dev.docuware.com/schema/public/services", "LogMessageGroups");
    private final static QName _LogMessages_QNAME = new QName("http://dev.docuware.com/schema/public/services", "LogMessages");
    private final static QName _Link_QNAME = new QName("http://dev.docuware.com/schema/public/services", "Link");
    private final static QName _UriTemplate_QNAME = new QName("http://dev.docuware.com/schema/public/services", "UriTemplate");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.docuware.dev.schema._public.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UriTemplateParameter }
     * 
     */
    public UriTemplateParameter createUriTemplateParameter() {
        return new UriTemplateParameter();
    }

    /**
     * Create an instance of {@link UriTemplateDescription }
     * 
     */
    public UriTemplateDescription createUriTemplateDescription() {
        return new UriTemplateDescription();
    }

    /**
     * Create an instance of {@link LogMessageGroups }
     * 
     */
    public LogMessageGroups createLogMessageGroups() {
        return new LogMessageGroups();
    }

    /**
     * Create an instance of {@link LogMessages }
     * 
     */
    public LogMessages createLogMessages() {
        return new LogMessages();
    }

    /**
     * Create an instance of {@link Links }
     * 
     */
    public Links createLinks() {
        return new Links();
    }

    /**
     * Create an instance of {@link Link }
     * 
     */
    public Link createLink() {
        return new Link();
    }

    /**
     * Create an instance of {@link UriTemplateDescriptions }
     * 
     */
    public UriTemplateDescriptions createUriTemplateDescriptions() {
        return new UriTemplateDescriptions();
    }

    /**
     * Create an instance of {@link UriInvocation }
     * 
     */
    public UriInvocation createUriInvocation() {
        return new UriInvocation();
    }

    /**
     * Create an instance of {@link LogMessage }
     * 
     */
    public LogMessage createLogMessage() {
        return new LogMessage();
    }

    /**
     * Create an instance of {@link LogMessageGroup }
     * 
     */
    public LogMessageGroup createLogMessageGroup() {
        return new LogMessageGroup();
    }

    /**
     * Create an instance of {@link TypeReference }
     * 
     */
    public TypeReference createTypeReference() {
        return new TypeReference();
    }

    /**
     * Create an instance of {@link UriTemplateParameter.HtmlDescription }
     * 
     */
    public UriTemplateParameter.HtmlDescription createUriTemplateParameterHtmlDescription() {
        return new UriTemplateParameter.HtmlDescription();
    }

    /**
     * Create an instance of {@link UriTemplateDescription.HtmlDescription }
     * 
     */
    public UriTemplateDescription.HtmlDescription createUriTemplateDescriptionHtmlDescription() {
        return new UriTemplateDescription.HtmlDescription();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UriTemplateDescriptions }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services", name = "UriTemplates")
    public JAXBElement<UriTemplateDescriptions> createUriTemplates(UriTemplateDescriptions value) {
        return new JAXBElement<UriTemplateDescriptions>(_UriTemplates_QNAME, UriTemplateDescriptions.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Links }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services", name = "Links")
    public JAXBElement<Links> createLinks(Links value) {
        return new JAXBElement<Links>(_Links_QNAME, Links.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogMessageGroups }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services", name = "LogMessageGroups")
    public JAXBElement<LogMessageGroups> createLogMessageGroups(LogMessageGroups value) {
        return new JAXBElement<LogMessageGroups>(_LogMessageGroups_QNAME, LogMessageGroups.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LogMessages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services", name = "LogMessages")
    public JAXBElement<LogMessages> createLogMessages(LogMessages value) {
        return new JAXBElement<LogMessages>(_LogMessages_QNAME, LogMessages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Link }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services", name = "Link")
    public JAXBElement<Link> createLink(Link value) {
        return new JAXBElement<Link>(_Link_QNAME, Link.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UriTemplateDescription }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dev.docuware.com/schema/public/services", name = "UriTemplate")
    public JAXBElement<UriTemplateDescription> createUriTemplate(UriTemplateDescription value) {
        return new JAXBElement<UriTemplateDescription>(_UriTemplate_QNAME, UriTemplateDescription.class, null, value);
    }



}
