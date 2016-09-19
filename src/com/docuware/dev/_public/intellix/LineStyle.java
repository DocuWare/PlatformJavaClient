

package com.docuware.dev._public.intellix;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "LineStyle")
@XmlEnum
public enum LineStyle {


    @XmlEnumValue("none")
    NONE("none"),

    @XmlEnumValue("single")
    SINGLE("single"),

    @XmlEnumValue("dotted")
    DOTTED("dotted"),

    @XmlEnumValue("thick")
    THICK("thick"),

    @XmlEnumValue("dash")
    DASH("dash"),

    @XmlEnumValue("double")
    DOUBLE("double");
    private final String value;

    LineStyle(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LineStyle fromValue(String v) {
        for (LineStyle c: LineStyle.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
