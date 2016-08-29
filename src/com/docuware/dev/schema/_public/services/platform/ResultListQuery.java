

package com.docuware.dev.schema._public.services.platform;

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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultListQuery", propOrder = {
    "sortOrder",
    "additionalResultFields",
    "flagConditions"
})
@XmlSeeAlso({
    DialogExpression.class
})
public class ResultListQuery  {

    @XmlElement(name = "SortOrder")
    protected SortedFieldsList sortOrder;
    @XmlElement(name = "AdditionalResultFields")
    protected List<String> additionalResultFields;
    @XmlElement(name = "FlagConditions", required = true)
    protected FlagConditions flagConditions;
    @XmlAttribute(name = "Start")
    protected Integer start;
    @XmlAttribute(name = "Count")
    protected Integer count;
    @XmlAttribute(name = "ExcludeDefaultSystemFields")
    protected Boolean excludeDefaultSystemFields;
    @XmlAttribute(name = "WithoutLinks")
    protected Boolean withoutLinks;
    @XmlAttribute(name = "IncludeSuggestions")
    protected Boolean includeSuggestions;

    /**Gets or sets the fields which are returned by this query.*/
    public SortedFieldsList getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(SortedFieldsList value) {
        this.sortOrder = value;
    }

    /**Define addition result fields to retrieve*/
    public List<String> getAdditionalResultFields() {
        if (additionalResultFields == null) {
            additionalResultFields = new ArrayList<String>();
        }
        return this.additionalResultFields;
    }

    /**Condition that filter documents by its flags*/
    public FlagConditions getFlagConditions() {
        return flagConditions;
    }

    /**Condition that filter documents by its flags*/
    public void setFlagConditions(FlagConditions value) {
        this.flagConditions = value;
    }

    /**Start index of result document*/
    public int getStart() {
        if (start == null) {
            return  0;
        } else {
            return start;
        }
    }

    /**Start index of result document*/
    public void setStart(Integer value) {
        this.start = value;
    }

    /**Number of result documents to be retrieved in one block*/
    public int getCount() {
        if (count == null) {
            return  0;
        } else {
            return count;
        }
    }

    /**Number of result documents to be retrieved in one block*/
    public void setCount(Integer value) {
        this.count = value;
    }

    /**Specifies whether the default system/additional fields should be returned.*/
    public boolean isExcludeDefaultSystemFields() {
        if (excludeDefaultSystemFields == null) {
            return false;
        } else {
            return excludeDefaultSystemFields;
        }
    }

    /**Specifies whether the default system/additional fields should be returned.*/
    public void setExcludeDefaultSystemFields(Boolean value) {
        this.excludeDefaultSystemFields = value;
    }

    /**Specifies whether the links are filled in the result.*/
    public boolean isWithoutLinks() {
        if (withoutLinks == null) {
            return false;
        } else {
            return withoutLinks;
        }
    }

    /**Specifies whether the links are filled in the result.*/
    public void setWithoutLinks(Boolean value) {
        this.withoutLinks = value;
    }

    public boolean isIncludeSuggestions() {
        if (includeSuggestions == null) {
            return false;
        } else {
            return includeSuggestions;
        }
    }

    public void setIncludeSuggestions(Boolean value) {
        this.includeSuggestions = value;
    }



}
