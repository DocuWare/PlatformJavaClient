

package com.docuware.dev._public.intellix;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.settings.common.KeyValuePairs;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentContent", propOrder = {
    "metadata",
    "embedded",
    "pages"
})
public class DocumentContent  {

    protected KeyValuePairs metadata;
    @XmlElement(name = "Embedded")
    protected List<DocumentContent.Embedded> embedded;
    @XmlElement(name = "Pages")
    protected DocumentContent.Pages pages;

    public KeyValuePairs getMetadata() {
        return metadata;
    }

    public void setMetadata(KeyValuePairs value) {
        this.metadata = value;
    }

    /**For internal use: Embedded data.*/
    public List<DocumentContent.Embedded> getEmbedded() {
        if (embedded == null) {
            embedded = new ArrayList<DocumentContent.Embedded>();
        }
        return this.embedded;
    }

    public DocumentContent.Pages getPages() {
        return pages;
    }

    public void setPages(DocumentContent.Pages value) {
        this.pages = value;
    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class Embedded {

        @XmlAnyElement(lax = true)
        protected XElementWrapper any;

        public XElementWrapper getAny() {
            return any;
        }

        public void setAny(XElementWrapper value) {
            this.any = value;
        }

    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "page"
    })
    public static class Pages {

        @XmlElement(name = "Page", required = true)
        protected List<PageContent> page;

        public List<PageContent> getPage() {
            if (page == null) {
                page = new ArrayList<PageContent>();
            }
            return this.page;
        }

    }



}
