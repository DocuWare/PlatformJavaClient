

package com.docuware.dev.settings.common;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyValuePair", propOrder = {
    "name",
    "value"
})
public class KeyValuePair  {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Value", required = true)
    protected String value;

    /**The name of the environment variable.*/
    public String getName() {
        return name;
    }

    /**The name of the environment variable.*/
    public void setName(String value) {
        this.name = value;
    }

    /**The value of the environment variable.*/
    public String getValue() {
        return value;
    }

    /**The value of the environment variable.*/
    public void setValue(String value) {
        this.value = value;
    }



}
