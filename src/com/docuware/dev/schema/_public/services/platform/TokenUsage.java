

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "TokenUsage")
@XmlEnum
public enum TokenUsage {


    @XmlEnumValue("Single")
    SINGLE("Single"),

    @XmlEnumValue("Multi")
    MULTI("Multi");
    private final String value;

    TokenUsage(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TokenUsage fromValue(String v) {
        for (TokenUsage c: TokenUsage.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
