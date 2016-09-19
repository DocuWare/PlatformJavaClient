

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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SectionAnnotationsPlacement", propOrder = {
    "annotationsPlacement"
})
public class SectionAnnotationsPlacement  {

    @XmlElement(name = "AnnotationsPlacement", required = true)
    protected AnnotationsPlacement annotationsPlacement;
    @XmlAttribute(name = "SectionNumber", required = true)
    protected int sectionNumber;
    @XmlAttribute(name = "PageNumber", required = true)
    protected int pageNumber;

    @Eagle
    public AnnotationsPlacement getAnnotationsPlacement() {
        return annotationsPlacement;
    }

    @Eagle
    public void setAnnotationsPlacement(AnnotationsPlacement value) {
        this.annotationsPlacement = value;
    }

    /**Number of the section to set annotations on.*/
    @Eagle
    public int getSectionNumber() {
        return sectionNumber;
    }

    @Eagle
    public void setSectionNumber(int value) {
        this.sectionNumber = value;
    }

    /**Number of the page to set annotations on.*/
    @Eagle
    public int getPageNumber() {
        return pageNumber;
    }

    @Eagle
    public void setPageNumber(int value) {
        this.pageNumber = value;
    }



}
