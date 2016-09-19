

package com.docuware.dev.schema._public.services;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UriTemplateParameter", propOrder = {
    "htmlDescription"
})
public class UriTemplateParameter  {

    @XmlElement(name = "HtmlDescription")
    protected XElementWrapper htmlDescription;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "IsOptional")
    protected Boolean isOptional;
    @XmlAttribute(name = "DefaultValue")
    protected String defaultValue;
    @XmlAttribute(name = "FurtherReading")
    @XmlSchemaType(name = "anyURI")
    protected String furtherReading;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "TypeDescriptionUri")
    protected String typeDescriptionUri;

    /**Describes the parameter.*/
    public XElementWrapper getHtmlDescription() {
        return htmlDescription;
    }

    /**Describes the parameter.*/
    public void setHtmlDescription(XElementWrapper value) {
        this.htmlDescription = value;
    }

    /**The name of this URI parameter.*/
    public String getName() {
        return name;
    }

    /**The name of this URI parameter.*/
    public void setName(String value) {
        this.name = value;
    }

    /**Gets if the parameter can be ommitted.*/
    public boolean isIsOptional() {
        if (isOptional == null) {
            return false;
        } else {
            return isOptional;
        }
    }

    /**Gets if the parameter can be ommitted.*/
    public void setIsOptional(Boolean value) {
        this.isOptional = value;
    }

    /**Gets the default parameter in case the parameter is optional and the parameter has a default value.*/
    public String getDefaultValue() {
        return defaultValue;
    }

    /**Gets the default parameter in case the parameter is optional and the parameter has a default value.*/
    public void setDefaultValue(String value) {
        this.defaultValue = value;
    }

    /**Gets a link for further readings.*/
    public String getFurtherReading() {
        return furtherReading;
    }

    /**Gets a link for further readings.*/
    public void setFurtherReading(String value) {
        this.furtherReading = value;
    }

    /**Gets the type of this parameter.*/
    public String getType() {
        return type;
    }

    /**Gets the type of this parameter.*/
    public void setType(String value) {
        this.type = value;
    }

    /**Gets the a link for further readings about this parameter's type.*/
    public String getTypeDescriptionUri() {
        return typeDescriptionUri;
    }

    /**Gets the a link for further readings about this parameter's type.*/
    public void setTypeDescriptionUri(String value) {
        this.typeDescriptionUri = value;
    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class HtmlDescription {

        @XmlAnyElement
        @XmlJavaTypeAdapter(ObjectToXElementWrapperAdapter.class)
        protected XElementWrapper any;

        public XElementWrapper getAny() {
            return any;
        }

        public void setAny(XElementWrapper value) {
            this.any = value;
        }

    }



}
