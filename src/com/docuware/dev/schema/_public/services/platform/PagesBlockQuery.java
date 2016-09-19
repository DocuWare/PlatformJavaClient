

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
@XmlType(name = "PagesBlockQuery")
public class PagesBlockQuery  {

    @XmlAttribute(name = "FirstPage", required = true)
    protected int firstPage;
    @XmlAttribute(name = "PageCount", required = true)
    protected int pageCount;

    /**The first page of the page block*/
    public int getFirstPage() {
        return firstPage;
    }

    /**The first page of the page block*/
    public void setFirstPage(int value) {
        this.firstPage = value;
    }

    /**Total count of the pages in the page block*/
    public int getPageCount() {
        return pageCount;
    }

    /**Total count of the pages in the page block*/
    public void setPageCount(int value) {
        this.pageCount = value;
    }



}
