

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
@XmlType(name = "WordSearchResultPageHit", propOrder = {
    "hits"
})
public class WordSearchResultPageHit  {

    @XmlElement(name = "Hits", required = true)
    protected WordSearchResultWordHits hits;
    @XmlAttribute(name = "PageNum", required = true)
    protected int pageNum;

    /**Contains the sequence of words matching the search query.*/
    public WordSearchResultWordHits getHits() {
        return hits;
    }

    /**Contains the sequence of words matching the search query.*/
    public void setHits(WordSearchResultWordHits value) {
        this.hits = value;
    }

    /**Page number where the hits a found*/
    public int getPageNum() {
        return pageNum;
    }

    /**Page number where the hits a found*/
    public void setPageNum(int value) {
        this.pageNum = value;
    }



}
