

package com.docuware.dev.schema._public.services.platform;

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
@XmlType(name = "LineEntry", propOrder = {
    "from",
    "to"
})
public class LineEntry
    extends EntryBase
 {

    @XmlElement(name = "From", required = true)
    protected AnnotationPoint from;
    @XmlElement(name = "To", required = true)
    protected AnnotationPoint to;
    @XmlAttribute(name = "Arrow")
    protected Boolean arrow;

    /**Start point of the line.*/
    public AnnotationPoint getFrom() {
        return from;
    }

    /**Start point of the line.*/
    public void setFrom(AnnotationPoint value) {
        this.from = value;
    }

    /**End  point of the line.*/
    public AnnotationPoint getTo() {
        return to;
    }

    /**End  point of the line.*/
    public void setTo(AnnotationPoint value) {
        this.to = value;
    }

    /**Define a line with arror.*/
    public boolean isArrow() {
        if (arrow == null) {
            return false;
        } else {
            return arrow;
        }
    }

    /**Define a line with arror.*/
    public void setArrow(Boolean value) {
        this.arrow = value;
    }



}
