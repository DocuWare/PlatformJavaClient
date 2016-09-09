

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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldValueStatisticsResult", propOrder = {
    "item"
})
public class FieldValueStatisticsResult  {

    @XmlElement(name = "Item")
    protected List<FieldValueStatistics> item;

    /**ArrayList is required for the XML-Marshalling */
    public void setItem(ArrayList<FieldValueStatistics> value) {
        item=value;
    }

    public List<FieldValueStatistics> getItem() {
        if (item == null) {
            item = new ArrayList<FieldValueStatistics>();
        }
        return this.item;
    }



}
