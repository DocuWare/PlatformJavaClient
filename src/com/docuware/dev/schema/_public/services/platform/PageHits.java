

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
@XmlType(name = "PageHits", propOrder = {
    "pageHit"
})
public class PageHits  {

    @XmlElement(name = "PageHit")
    protected List<WordSearchResultPageHit> pageHit;

    /**Define a set pages where of words are found*/
    public List<WordSearchResultPageHit> getPageHit() {
        if (pageHit == null) {
            pageHit = new ArrayList<WordSearchResultPageHit>();
        }
        return this.pageHit;
    }



}
