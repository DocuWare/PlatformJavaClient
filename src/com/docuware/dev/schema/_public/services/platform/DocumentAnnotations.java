

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
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentAnnotations", propOrder = {
    "annotations"
})
public class DocumentAnnotations  {

    @XmlElement(name = "Annotations")
    protected List<SectionAnnotation> annotations;

    /**List of SectionAnnotation items.*/
    @Eagle
    public List<SectionAnnotation> getAnnotations() {
        if (annotations == null) {
            annotations = new ArrayList<SectionAnnotation>();
        }
        return this.annotations;
    }



}
