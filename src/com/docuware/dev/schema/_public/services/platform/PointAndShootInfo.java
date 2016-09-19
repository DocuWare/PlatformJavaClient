

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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.settings.common.DWRectangle;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointAndShootInfo", propOrder = {
    "box"
})
public class PointAndShootInfo  {

    @XmlElement(name = "Box")
    protected List<DWRectangle> box;
    @XmlAttribute(name = "PageNumber")
    protected Integer pageNumber;

    /**ArrayList is required for the XML-Marshalling */
    public void setBox(ArrayList<DWRectangle> value) {
        box=value;
    }

    /**The bounding box of the selected content.*/
    public List<DWRectangle> getBox() {
        if (box == null) {
            box = new ArrayList<DWRectangle>();
        }
        return this.box;
    }

    /**The number of the page on which the selected content is.*/
    public int getPageNumber() {
        if (pageNumber == null) {
            return  0;
        } else {
            return pageNumber;
        }
    }

    /**The number of the page on which the selected content is.*/
    public void setPageNumber(Integer value) {
        this.pageNumber = value;
    }



}
