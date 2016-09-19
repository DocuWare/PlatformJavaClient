

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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnotationToolSettings")
@XmlSeeAlso({
    TextAnnotationToolSettings.class,
    SizedAnnotationToolSettings.class
})
@CompareIgnore
public class AnnotationToolSettings  {

    @XmlAttribute(name = "Type", required = true)
    protected AnnotationTools type;
    @XmlAttribute(name = "Color")
    protected String color;

    public AnnotationTools getType() {
        return type;
    }

    public void setType(AnnotationTools value) {
        this.type = value;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String value) {
        this.color = value;
    }



}
