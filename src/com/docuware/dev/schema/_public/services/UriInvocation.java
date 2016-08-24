

package com.docuware.dev.schema._public.services;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UriInvocation", propOrder = {
    "acceptedType",
    "producedType",
    "tag"
})
public class UriInvocation  {

    @XmlElement(name = "AcceptedType")
    protected List<TypeReference> acceptedType;
    @XmlElement(name = "ProducedType")
    protected List<TypeReference> producedType;
    @XmlElement(name = "Tag")
    protected String tag;
    @XmlAttribute(name = "Verb")
    @XmlSchemaType(name = "anySimpleType")
    protected String verb;

    public List<TypeReference> getAcceptedType() {
        if (acceptedType == null) {
            acceptedType = new ArrayList<TypeReference>();
        }
        return this.acceptedType;
    }

    public List<TypeReference> getProducedType() {
        if (producedType == null) {
            producedType = new ArrayList<TypeReference>();
        }
        return this.producedType;
    }

    /**Application specific tag for the method.*/
    public String getTag() {
        return tag;
    }

    /**Application specific tag for the method.*/
    public void setTag(String value) {
        this.tag = value;
    }

    public String getVerb() {
        if (verb == null) {
            return "GET";
        } else {
            return verb;
        }
    }

    public void setVerb(String value) {
        this.verb = value;
    }



}
