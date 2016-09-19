

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "DynamicValueType")
@XmlEnum
public enum DynamicValueType {

    @XmlEnumValue("None")
    NONE("None"),

    @XmlEnumValue("CurrentDate")
    CURRENT_DATE("CurrentDate"),

    @XmlEnumValue("CurrentDateTime")
    CURRENT_DATE_TIME("CurrentDateTime"),

    @XmlEnumValue("CurrentTime")
    CURRENT_TIME("CurrentTime"),

    @XmlEnumValue("AutoNumber")
    AUTO_NUMBER("AutoNumber");
    private final String value;

    DynamicValueType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DynamicValueType fromValue(String v) {
        for (DynamicValueType c: DynamicValueType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
