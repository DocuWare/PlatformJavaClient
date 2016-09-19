

package com.docuware.dev.schema._public.services.annotations;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkInvoke", propOrder = {
    "accepts",
    "produces"
})
public class LinkInvoke  {

    @XmlElement(name = "Accepts")
    protected ContentTypeList accepts;
    @XmlElement(name = "Produces")
    protected ContentTypeList produces;
    @XmlAttribute(name = "Verb")
    protected HttpMethod verb;

    public ContentTypeList getAccepts() {
        return accepts;
    }

    public void setAccepts(ContentTypeList value) {
        this.accepts = value;
    }

    public ContentTypeList getProduces() {
        return produces;
    }

    public void setProduces(ContentTypeList value) {
        this.produces = value;
    }

    public HttpMethod getVerb() {
        if (verb == null) {
            return HttpMethod.GET;
        } else {
            return verb;
        }
    }

    public void setVerb(HttpMethod value) {
        this.verb = value;
    }



}
