

package com.docuware.dev.schema._public.services.platform;

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
@XmlType(name = "SizedAnnotationToolSettings")
@CompareIgnore
public class SizedAnnotationToolSettings
    extends AnnotationToolSettings
 {

    @XmlAttribute(name = "LineSize", required = true)
    protected int lineSize;

    public int getLineSize() {
        return lineSize;
    }

    public void setLineSize(int value) {
        this.lineSize = value;
    }



}
