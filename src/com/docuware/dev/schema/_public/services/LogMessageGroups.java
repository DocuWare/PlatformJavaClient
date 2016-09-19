

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
@XmlType(name = "LogMessageGroups", propOrder = {
    "message"
})
@CompareIgnore
public class LogMessageGroups  {

    @XmlElement(name = "Message")
    protected List<LogMessageGroup> message;

    /**ArrayList is required for the XML-Marshalling */
    public void setMessage(ArrayList<LogMessageGroup> value) {
        message=value;
    }

    public List<LogMessageGroup> getMessage() {
        if (message == null) {
            message = new ArrayList<LogMessageGroup>();
        }
        return this.message;
    }



}
