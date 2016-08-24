

package com.docuware.dev.schema._public.services;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UriTemplateDescription", propOrder = {
    "parameter",
    "invoke",
    "htmlDescription"
})
public class UriTemplateDescription  {

    @XmlElement(name = "Parameter")
    protected List<UriTemplateParameter> parameter;
    @XmlElement(name = "Invoke", required = true)
    protected List<UriInvocation> invoke;
    @XmlElement(name = "HtmlDescription")
    protected UriTemplateDescription.HtmlDescription htmlDescription;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "UriPattern")
    protected String uriPattern;
    @XmlAttribute(name = "FurtherReading")
    @XmlSchemaType(name = "anyURI")
    protected String furtherReading;

    public List<UriTemplateParameter> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<UriTemplateParameter>();
        }
        return this.parameter;
    }

    public List<UriInvocation> getInvoke() {
        if (invoke == null) {
            invoke = new ArrayList<UriInvocation>();
        }
        return this.invoke;
    }

    /**Describes the Uri.*/
    public UriTemplateDescription.HtmlDescription getHtmlDescription() {
        return htmlDescription;
    }

    /**Describes the Uri.*/
    public void setHtmlDescription(UriTemplateDescription.HtmlDescription value) {
        this.htmlDescription = value;
    }

    /**The name of this template.*/
    public String getName() {
        return name;
    }

    /**The name of this template.*/
    public void setName(String value) {
        this.name = value;
    }

    /**The URI template.*/
    public String getUriPattern() {
        return uriPattern;
    }

    /**The URI template.*/
    public void setUriPattern(String value) {
        this.uriPattern = value;
    }

    /**Gets a link for further readings.*/
    public String getFurtherReading() {
        return furtherReading;
    }

    /**Gets a link for further readings.*/
    public void setFurtherReading(String value) {
        this.furtherReading = value;
    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class HtmlDescription {

        @XmlAnyElement
        protected XElementWrapper any;

        public XElementWrapper getAny() {
            return any;
        }

        public void setAny(XElementWrapper value) {
            this.any = value;
        }

    }



}
