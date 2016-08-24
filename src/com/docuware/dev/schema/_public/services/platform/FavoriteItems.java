

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
@XmlType(name = "FavoriteItems", propOrder = {
    "disabled",
    "order"
})
public class FavoriteItems  {

    @XmlElement(name = "Disabled")
    protected List<String> disabled;
    @XmlElement(name = "Order")
    protected List<String> order;

    public List<String> getDisabled() {
        if (disabled == null) {
            disabled = new ArrayList<String>();
        }
        return this.disabled;
    }

    public List<String> getOrder() {
        if (order == null) {
            order = new ArrayList<String>();
        }
        return this.order;
    }



}
