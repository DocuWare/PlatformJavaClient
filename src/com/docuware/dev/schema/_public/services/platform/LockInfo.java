

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LockInfo")
public class LockInfo  {

    @XmlAttribute(name = "Interval")
    protected String interval;
    @XmlAttribute(name = "Operation")
    protected String operation;

    /**Define the lifetime interval for the lock.
          This parameter contains a time interval specification in the form:
          [ws][-]{ d | [d.]hh:mm[:ss[.ff]] }[ws]
          Elements in square brackets ([ and ]) are optional. One selection from the list of alternatives enclosed in braces ({ and }) and separated by vertical bars (|) is required.
          For more details check http://msdn.microsoft.com/en-us/library/se73z7b9.aspx*/
    public String getInterval() {
        return interval;
    }

    /**Define the lifetime interval for the lock.
          This parameter contains a time interval specification in the form:
          [ws][-]{ d | [d.]hh:mm[:ss[.ff]] }[ws]
          Elements in square brackets ([ and ]) are optional. One selection from the list of alternatives enclosed in braces ({ and }) and separated by vertical bars (|) is required.
          For more details check http://msdn.microsoft.com/en-us/library/se73z7b9.aspx*/
    public void setInterval(String value) {
        this.interval = value;
    }

    /**Optional arbitrary string that define the purpose of the lock operation. Only one operation will successfully apply a lock on one document at same time.*/
    @Dolphin
    public String getOperation() {
        return operation;
    }

    /**Optional arbitrary string that define the purpose of the lock operation. Only one operation will successfully apply a lock on one document at same time.*/
    @Dolphin
    public void setOperation(String value) {
        this.operation = value;
    }



}
