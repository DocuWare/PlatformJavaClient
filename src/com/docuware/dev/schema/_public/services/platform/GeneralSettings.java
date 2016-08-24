

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
@XmlType(name = "GeneralSettings")
public class GeneralSettings  {

    @XmlAttribute(name = "StartWith")
    protected WorkAreaType startWith;

    @Eagle
    public WorkAreaType getStartWith() {
        if (startWith == null) {
            return WorkAreaType.NONE;
        } else {
            return startWith;
        }
    }

    @Eagle
    public void setStartWith(WorkAreaType value) {
        this.startWith = value;
    }



}
