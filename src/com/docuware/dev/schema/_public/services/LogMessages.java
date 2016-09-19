

package com.docuware.dev.schema._public.services;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogMessages", propOrder = {
    "message",
    "links"
})
@CompareIgnore
public class LogMessages  {

    @XmlElement(name = "Message")
    protected List<LogMessage> message;
    @XmlElement(name = "Links", required = true)
    protected Links links;

    /**ArrayList is required for the XML-Marshalling */
    public void setMessage(ArrayList<LogMessage> value) {
        message=value;
    }

    public List<LogMessage> getMessage() {
        if (message == null) {
            message = new ArrayList<LogMessage>();
        }
        return this.message;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links value) {
        this.links = value;
    }



}
