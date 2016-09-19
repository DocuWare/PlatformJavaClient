

package com.docuware.dev.schema._public.services.platform;

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
@XmlType(name = "DocumentAnnotationsPlacement", propOrder = {
    "annotations"
})
public class DocumentAnnotationsPlacement  {

    @XmlElement(name = "Annotations")
    protected List<SectionAnnotationsPlacement> annotations;

    /**ArrayList is required for the XML-Marshalling */
    public void setAnnotations(ArrayList<SectionAnnotationsPlacement> value) {
        annotations=value;
    }

    /**List of SectionAnnotationsPlacement items.*/
    @Eagle
    public List<SectionAnnotationsPlacement> getAnnotations() {
        if (annotations == null) {
            annotations = new ArrayList<SectionAnnotationsPlacement>();
        }
        return this.annotations;
    }



}
