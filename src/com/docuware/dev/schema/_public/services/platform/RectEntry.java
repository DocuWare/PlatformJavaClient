

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
@XmlType(name = "RectEntry", propOrder = {
    "location"
})
public class RectEntry
    extends EntryBase
 {

    @XmlElement(name = "Location", required = true)
    protected AnnotationRectangle location;
    @XmlAttribute(name = "Filled")
    protected Boolean filled;
    @XmlAttribute(name = "Ellipse")
    protected Boolean ellipse;

    /**Location of the annotation.*/
    public AnnotationRectangle getLocation() {
        return location;
    }

    /**Location of the annotation.*/
    public void setLocation(AnnotationRectangle value) {
        this.location = value;
    }

    /**Define if rectangle is solid.*/
    public boolean isFilled() {
        if (filled == null) {
            return true;
        } else {
            return filled;
        }
    }

    /**Define if rectangle is solid.*/
    public void setFilled(Boolean value) {
        this.filled = value;
    }

    /**True if annotation is elipse defined into rectangle.*/
    public boolean isEllipse() {
        if (ellipse == null) {
            return false;
        } else {
            return ellipse;
        }
    }

    /**True if annotation is elipse defined into rectangle.*/
    public void setEllipse(Boolean value) {
        this.ellipse = value;
    }



}
