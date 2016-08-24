

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AnnotationsPlacement", propOrder = {
    "annotationOrStampPlacement"
})
public class AnnotationsPlacement  {

    @XmlElements({
        @XmlElement(name = "Annotation", type = Annotation.class),
        @XmlElement(name = "StampPlacement", type = StampPlacement.class)
    })
    protected List<Object> annotationOrStampPlacement;

    /**Annotation element. Contains all annotations for a specific page in up to 5 layers*/
    public List<Object> getAnnotationOrStampPlacement() {
        if (annotationOrStampPlacement == null) {
            annotationOrStampPlacement = new ArrayList<Object>();
        }
        return this.annotationOrStampPlacement;
    }



}
