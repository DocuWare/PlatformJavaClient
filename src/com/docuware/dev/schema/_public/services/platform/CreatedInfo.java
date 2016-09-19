

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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreatedInfo")
public class CreatedInfo  {

    @XmlAttribute(name = "User", required = true)
    protected String user;
    @XmlAttribute(name = "Time", required = true)
    @XmlSchemaType(name = "dateTime")
    protected GregorianCalendar time;

    /**Id of the user who created this item.*/
    public String getUser() {
        return user;
    }

    /**Id of the user who created this item.*/
    public void setUser(String value) {
        this.user = value;
    }

    /**Timestamp when this item was created.*/
    public GregorianCalendar getTime() {
        return time;
    }

    /**Timestamp when this item was created.*/
    public void setTime(GregorianCalendar value) {
        this.time = value;
    }



}
