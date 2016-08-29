

package com.docuware.dev.schema._public.services;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LogMessage", propOrder = {
    "message",
    "exception",
    "stackTrace"
})
public class LogMessage  {

    @XmlElement(name = "Message", required = true)
    protected String message;
    @XmlElement(name = "Exception")
    protected String exception;
    @XmlElement(name = "StackTrace")
    protected String stackTrace;
    @XmlAttribute(name = "Machine")
    protected String machine;
    @XmlAttribute(name = "TimeStamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected GregorianCalendar timeStamp;
    @XmlAttribute(name = "User")
    protected String user;
    @XmlAttribute(name = "Level")
    protected LogMessageLevel level;
    @XmlAttribute(name = "Count")
    protected Integer count;
    @XmlAttribute(name = "GroupId")
    protected String groupId;

    public String getMessage() {
        return message;
    }

    public void setMessage(String value) {
        this.message = value;
    }

    public String getException() {
        return exception;
    }

    public void setException(String value) {
        this.exception = value;
    }

    public String getStackTrace() {
        return stackTrace;
    }

    public void setStackTrace(String value) {
        this.stackTrace = value;
    }

    public String getMachine() {
        return machine;
    }

    public void setMachine(String value) {
        this.machine = value;
    }

    public GregorianCalendar getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(GregorianCalendar value) {
        this.timeStamp = value;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String value) {
        this.user = value;
    }

    public LogMessageLevel getLevel() {
        if (level == null) {
            return LogMessageLevel.INFO;
        } else {
            return level;
        }
    }

    public void setLevel(LogMessageLevel value) {
        this.level = value;
    }

    /**The number of occurrences of this message. This is useful if you want to filter messages which occure many times and flood your log.*/
    public int getCount() {
        if (count == null) {
            return  1;
        } else {
            return count;
        }
    }

    /**The number of occurrences of this message. This is useful if you want to filter messages which occure many times and flood your log.*/
    public void setCount(Integer value) {
        this.count = value;
    }

    /**In case this message is representing a group you can use this attribute to mark the group id.*/
    public String getGroupId() {
        return groupId;
    }

    /**In case this message is representing a group you can use this attribute to mark the group id.*/
    public void setGroupId(String value) {
        this.groupId = value;
    }



}
