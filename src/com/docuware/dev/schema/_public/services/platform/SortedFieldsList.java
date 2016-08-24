

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
@XmlType(name = "SortedFieldsList", propOrder = {
    "orderBy"
})
public class SortedFieldsList  {

    @XmlElement(name = "OrderBy")
    protected List<SortedField> orderBy;

    /**A list of sorted fields*/
    public List<SortedField> getOrderBy() {
        if (orderBy == null) {
            orderBy = new ArrayList<SortedField>();
        }
        return this.orderBy;
    }



}
