

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldValueStatistics", propOrder = {
    "value"
})
public class FieldValueStatistics  {

    @XmlElement(name = "Value", required = true)
    protected DocumentIndexFieldValue value;
    @XmlAttribute(name = "Count", required = true)
    protected long count;

    /**The value.*/
    public DocumentIndexFieldValue getValue() {
        return value;
    }

    /**The value.*/
    public void setValue(DocumentIndexFieldValue value) {
        this.value = value;
    }

    /**The number of times the value occurs in the documents.*/
    public long getCount() {
        return count;
    }

    /**The number of times the value occurs in the documents.*/
    public void setCount(long value) {
        this.count = value;
    }



}
