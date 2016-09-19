

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
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MergeAnnotationsParameters")
public class MergeAnnotationsParameters
    extends DocumentActionParameters
 {

    @XmlAttribute(name = "SectionNumber")
    protected Integer sectionNumber;

    /**Number of the section to process.*/
    @Dolphin
    public int getSectionNumber() {
        if (sectionNumber == null) {
            return  0;
        } else {
            return sectionNumber;
        }
    }

    /**Number of the section to process.*/
    @Dolphin
    public void setSectionNumber(Integer value) {
        this.sectionNumber = value;
    }



}
