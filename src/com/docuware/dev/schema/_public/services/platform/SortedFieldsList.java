

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
@XmlType(name = "SortedFieldsList", propOrder = {
    "orderBy"
})
public class SortedFieldsList  {

    @XmlElement(name = "OrderBy")
    protected List<SortedField> orderBy;

    /**ArrayList is required for the XML-Marshalling */
    public void setOrderBy(ArrayList<SortedField> value) {
        orderBy=value;
    }

    /**A list of sorted fields*/
    public List<SortedField> getOrderBy() {
        if (orderBy == null) {
            orderBy = new ArrayList<SortedField>();
        }
        return this.orderBy;
    }



}
