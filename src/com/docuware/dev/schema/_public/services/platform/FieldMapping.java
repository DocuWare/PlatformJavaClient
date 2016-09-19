

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldMapping")
public class FieldMapping  {

    @XmlAttribute(name = "Source", required = true)
    protected String source;
    @XmlAttribute(name = "Destination")
    protected String destination;

    /**Name of the source field.*/
    public String getSource() {
        return source;
    }

    /**Name of the source field.*/
    public void setSource(String value) {
        this.source = value;
    }

    /**Name of the destination field.*/
    public String getDestination() {
        return destination;
    }

    /**Name of the destination field.*/
    public void setDestination(String value) {
        this.destination = value;
    }



}
