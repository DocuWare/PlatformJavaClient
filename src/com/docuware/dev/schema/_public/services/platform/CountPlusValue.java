

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
import javax.xml.bind.annotation.XmlValue;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountPlusValue", propOrder = {
    "value"
})
public class CountPlusValue  {

    @XmlValue
    protected int value;
    @XmlAttribute(name = "HasMore")
    protected Boolean hasMore;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    /**If this flag is true then the real number of hits can be larger than specified by the value of this element.*/
    public boolean isHasMore() {
        if (hasMore == null) {
            return false;
        } else {
            return hasMore;
        }
    }

    /**If this flag is true then the real number of hits can be larger than specified by the value of this element.*/
    public void setHasMore(Boolean value) {
        this.hasMore = value;
    }



}
