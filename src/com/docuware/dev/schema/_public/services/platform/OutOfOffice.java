

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
@XmlType(name = "OutOfOffice")
public class OutOfOffice  {
private boolean startDateTimeSpecified;//test

private boolean endDateTimeSpecified;//test


    @XmlAttribute(name = "IsOutOfOffice", required = true)
    protected boolean isOutOfOffice;
    @XmlAttribute(name = "StartDateTime")
    @XmlSchemaType(name = "dateTime")
    protected GregorianCalendar startDateTime;
    @XmlAttribute(name = "EndDateTime")
    @XmlSchemaType(name = "dateTime")
    protected GregorianCalendar endDateTime;

    /**Flag which marks either user is in the office or not.*/
    public boolean isIsOutOfOffice() {
        return isOutOfOffice;
    }

    /**Flag which marks either user is in the office or not.*/
    public void setIsOutOfOffice(boolean value) {
        this.isOutOfOffice = value;
    }

    /**Start datetime after which user will not be in the office.*/
    public GregorianCalendar getStartDateTime() {
        return startDateTime;
    }

    /**Start datetime after which user will not be in the office.*/
    public void setStartDateTime(GregorianCalendar value) {
        this.startDateTime = value;
    }

    /**Ending datetime after which user will be in the office.If not set user will be out of office for unlimited amount of time.*/
    public GregorianCalendar getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(GregorianCalendar value) {
        this.endDateTime = value;
    }

    @Extension
    public boolean isStartDateTimeSpecified() {
	return startDateTimeSpecified;
    }

    @Extension
    public void setStartDateTimeSpecified(boolean value) {
	startDateTimeSpecified=value;
    }

    @Extension
    public boolean isEndDateTimeSpecified() {
	return endDateTimeSpecified;
    }

    @Extension
    public void setEndDateTimeSpecified(boolean value) {
	endDateTimeSpecified=value;
    }



}
