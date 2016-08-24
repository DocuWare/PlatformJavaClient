

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchPositionQuery", propOrder = {
    "phrase"
})
public class SearchPositionQuery  {

    @XmlElement(name = "Phrase", required = true)
    protected String phrase;
    @XmlAttribute(name = "IgnoreCase")
    protected Boolean ignoreCase;
    @XmlAttribute(name = "WholeWord")
    protected Boolean wholeWord;
    @XmlAttribute(name = "StartPage")
    protected Integer startPage;
    @XmlAttribute(name = "StartSectionNumber")
    protected Integer startSectionNumber;
    @XmlAttribute(name = "PageCount")
    protected Integer pageCount;
    @XmlAttribute(name = "Backward")
    protected Boolean backward;
    @XmlAttribute(name = "RangeSearch")
    protected Boolean rangeSearch;
    @XmlAttribute(name = "Normalize")
    protected Boolean normalize;

    /**Define the search phrase (words)*/
    public String getPhrase() {
        return phrase;
    }

    /**Define the search phrase (words)*/
    public void setPhrase(String value) {
        this.phrase = value;
    }

    /**Define if case is ignored*/
    public boolean isIgnoreCase() {
        if (ignoreCase == null) {
            return true;
        } else {
            return ignoreCase;
        }
    }

    /**Define if case is ignored*/
    public void setIgnoreCase(Boolean value) {
        this.ignoreCase = value;
    }

    /**Define if search for whole words only*/
    public boolean isWholeWord() {
        if (wholeWord == null) {
            return false;
        } else {
            return wholeWord;
        }
    }

    /**Define if search for whole words only*/
    public void setWholeWord(Boolean value) {
        this.wholeWord = value;
    }

    /**Define a starting page for the search*/
    public int getStartPage() {
        if (startPage == null) {
            return  0;
        } else {
            return startPage;
        }
    }

    /**Define a starting page for the search*/
    public void setStartPage(Integer value) {
        this.startPage = value;
    }

    /**Define a starting section for the search*/
    public int getStartSectionNumber() {
        if (startSectionNumber == null) {
            return  0;
        } else {
            return startSectionNumber;
        }
    }

    /**Define a starting section for the search*/
    public void setStartSectionNumber(Integer value) {
        this.startSectionNumber = value;
    }

    /**Search this number of pages after the first page where a hit occur. If value is less than zero then all pages will be returned*/
    public int getPageCount() {
        if (pageCount == null) {
            return  1;
        } else {
            return pageCount;
        }
    }

    /**Search this number of pages after the first page where a hit occur. If value is less than zero then all pages will be returned*/
    public void setPageCount(Integer value) {
        this.pageCount = value;
    }

    /**If this flag is true then the search will be executed in the previous pages.*/
    public boolean isBackward() {
        if (backward == null) {
            return false;
        } else {
            return backward;
        }
    }

    /**If this flag is true then the search will be executed in the previous pages.*/
    public void setBackward(Boolean value) {
        this.backward = value;
    }

    /**If this flag is true then only the specified page range is searched. Otherwise the whole document starting at the specified page is serched until the specified number of pages are found.*/
    public boolean isRangeSearch() {
        if (rangeSearch == null) {
            return false;
        } else {
            return rangeSearch;
        }
    }

    /**If this flag is true then only the specified page range is searched. Otherwise the whole document starting at the specified page is serched until the specified number of pages are found.*/
    public void setRangeSearch(Boolean value) {
        this.rangeSearch = value;
    }

    /**If this flag is true then the result coordinates orientation will be alligned with the page*/
    @Dolphin
    public boolean isNormalize() {
        if (normalize == null) {
            return false;
        } else {
            return normalize;
        }
    }

    /**If this flag is true then the result coordinates orientation will be alligned with the page*/
    @Dolphin
    public void setNormalize(Boolean value) {
        this.normalize = value;
    }



}
