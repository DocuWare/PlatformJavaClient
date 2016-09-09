

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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountResult", propOrder = {
    "group"
})
public class CountResult  {

    @XmlElement(name = "Group", required = true)
    protected List<CountResultItem> group;
    @XmlAttribute(name = "TimeStamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected GregorianCalendar timeStamp;

    /**ArrayList is required for the XML-Marshalling */
    public void setGroup(ArrayList<CountResultItem> value) {
        group=value;
    }

    /**Set of count results*/
    public List<CountResultItem> getGroup() {
        if (group == null) {
            group = new ArrayList<CountResultItem>();
        }
        return this.group;
    }

    /**TimeStamp of the result*/
    @Eagle
    public GregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    /**TimeStamp of the result*/
    @Eagle
    public void setTimeStamp(GregorianCalendar value) {
        this.timeStamp = value;
    }



}
