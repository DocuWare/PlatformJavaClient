

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolyLineEntry", propOrder = {
    "stroke"
})
public class PolyLineEntry
    extends EntryBase
 {

    @XmlElement(name = "Stroke", required = true)
    protected Stroke stroke;

    /**Sequence of points that define a PloyLine.*/
    public Stroke getStroke() {
        return stroke;
    }

    /**Sequence of points that define a PloyLine.*/
    public void setStroke(Stroke value) {
        this.stroke = value;
    }



}
