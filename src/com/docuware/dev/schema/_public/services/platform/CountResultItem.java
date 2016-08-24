

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountResultItem")
public class CountResultItem  {

    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "Count", required = true)
    protected int count;

    /**Name of the item that is counted*/
    public String getName() {
        return name;
    }

    /**Name of the item that is counted*/
    public void setName(String value) {
        this.name = value;
    }

    /**The items count*/
    public int getCount() {
        return count;
    }

    /**The items count*/
    public void setCount(int value) {
        this.count = value;
    }



}
