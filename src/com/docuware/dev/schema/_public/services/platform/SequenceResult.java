

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


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SequenceResult")
public class SequenceResult  {

    @XmlAttribute(name = "NextElement", required = true)
    protected String nextElement;

    /**The next element of the sequence.*/
    public String getNextElement() {
        return nextElement;
    }

    /**The next element of the sequence.*/
    public void setNextElement(String value) {
        this.nextElement = value;
    }



}
