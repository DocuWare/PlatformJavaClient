

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RotatePageParameters")
public class RotatePageParameters
    extends DocumentActionParameters
 {

    @XmlAttribute(name = "SectionNumber")
    protected Integer sectionNumber;
    @XmlAttribute(name = "PageNumber")
    protected Integer pageNumber;
    @XmlAttribute(name = "Rotation")
    protected Integer rotation;

    /**Number of the section to process.*/
    @Eagle
    public int getSectionNumber() {
        if (sectionNumber == null) {
            return  0;
        } else {
            return sectionNumber;
        }
    }

    /**Number of the section to process.*/
    @Eagle
    public void setSectionNumber(Integer value) {
        this.sectionNumber = value;
    }

    /**Page to be rotated.*/
    @Eagle
    public int getPageNumber() {
        if (pageNumber == null) {
            return  0;
        } else {
            return pageNumber;
        }
    }

    /**Page to be rotated.*/
    @Eagle
    public void setPageNumber(Integer value) {
        this.pageNumber = value;
    }

    /**Angle divisible by 90. Counterclockwise. DocuWare legacy.*/
    @Eagle
    public int getRotation() {
        if (rotation == null) {
            return  0;
        } else {
            return rotation;
        }
    }

    /**Angle divisible by 90. Counterclockwise. DocuWare legacy.*/
    @Eagle
    public void setRotation(Integer value) {
        this.rotation = value;
    }



}
