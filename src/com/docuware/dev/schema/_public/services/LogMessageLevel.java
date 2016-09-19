

package com.docuware.dev.schema._public.services;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "LogMessageLevel")
@XmlEnum
@CompareIgnore
public enum LogMessageLevel {

    @XmlEnumValue("Debug")
    DEBUG("Debug"),
    @XmlEnumValue("Info")
    INFO("Info"),
    @XmlEnumValue("Warning")
    WARNING("Warning"),
    @XmlEnumValue("Error")
    ERROR("Error"),
    @XmlEnumValue("Critical")
    CRITICAL("Critical");
    private final String value;

    LogMessageLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LogMessageLevel fromValue(String v) {
        for (LogMessageLevel c: LogMessageLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
