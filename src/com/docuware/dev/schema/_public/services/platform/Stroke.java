

package com.docuware.dev.schema._public.services.platform;

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
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Stroke", propOrder = {
    "point"
})
public class Stroke  {

    @XmlElement(name = "Point", required = true)
    protected List<AnnotationPoint> point;
    @XmlAttribute(name = "_do_not_use", required = true)
    protected boolean doNotUse;

    /**Sequence of points that define a PloyLine.*/
    public List<AnnotationPoint> getPoint() {
        if (point == null) {
            point = new ArrayList<AnnotationPoint>();
        }
        return this.point;
    }

    public boolean isDoNotUse() {
        return doNotUse;
    }

    public void setDoNotUse(boolean value) {
        this.doNotUse = value;
    }



}
