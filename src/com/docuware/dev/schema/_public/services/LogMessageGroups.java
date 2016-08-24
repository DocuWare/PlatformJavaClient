

package com.docuware.dev.schema._public.services;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
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
public class LogMessageGroups  {

    @XmlElement(name = "Message")
    protected List<LogMessageGroup> message;

    public List<LogMessageGroup> getMessage() {
        if (message == null) {
            message = new ArrayList<LogMessageGroup>();
        }
        return this.message;
    }



}
