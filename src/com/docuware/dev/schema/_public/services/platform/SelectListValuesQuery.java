

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
@XmlType(name = "SelectListValuesQuery")
public class SelectListValuesQuery  {

    @XmlAttribute(name = "Start")
    protected Integer start;
    @XmlAttribute(name = "Count")
    protected Integer count;

    /**First result to return if block size is specified.*/
    public Integer getStart() {
        return start;
    }

    /**First result to return if block size is specified.*/
    public void setStart(Integer value) {
        this.start = value;
    }

    /**Result will be returned on pages with that block size if specified. If set to default (0) select lists will be returned in one block using Limit parameter.*/
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer value) {
        this.count = value;
    }



}
