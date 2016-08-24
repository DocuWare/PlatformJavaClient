

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
@XmlType(name = "WordSearchResultWordHits", propOrder = {
    "wd"
})
public class WordSearchResultWordHits  {

    @XmlElement(name = "Wd")
    protected List<WordSearchResultWordHit> wd;

    /**Define a a set of words and locations where they are found*/
    public List<WordSearchResultWordHit> getWd() {
        if (wd == null) {
            wd = new ArrayList<WordSearchResultWordHit>();
        }
        return this.wd;
    }



}
