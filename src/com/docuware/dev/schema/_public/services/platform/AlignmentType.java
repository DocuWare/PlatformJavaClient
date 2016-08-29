

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "AlignmentType")
@XmlEnum
public enum AlignmentType {

    @XmlEnumValue("Left")
    LEFT("Left"),
    @XmlEnumValue("Center")
    CENTER("Center"),
    @XmlEnumValue("Right")
    RIGHT("Right");
    private final String value;

    AlignmentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AlignmentType fromValue(String v) {
        for (AlignmentType c: AlignmentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
