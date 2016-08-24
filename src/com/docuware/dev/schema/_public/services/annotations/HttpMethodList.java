

package com.docuware.dev.schema._public.services.annotations;

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
@XmlType(name = "HttpMethodList", propOrder = {
    "method"
})
public class HttpMethodList  {

    @XmlElement(name = "Method", required = true)
    @XmlSchemaType(name = "string")
    protected List<HttpMethod> method;
    @XmlAttribute(name = "IsComplete")
    protected Boolean isComplete;

    public List<HttpMethod> getMethod() {
        if (method == null) {
            method = new ArrayList<HttpMethod>();
        }
        return this.method;
    }

    /**If this is true than there are no other methods are expected than the specified.*/
    public boolean isIsComplete() {
        if (isComplete == null) {
            return false;
        } else {
            return isComplete;
        }
    }

    /**If this is true than there are no other methods are expected than the specified.*/
    public void setIsComplete(Boolean value) {
        this.isComplete = value;
    }



}
