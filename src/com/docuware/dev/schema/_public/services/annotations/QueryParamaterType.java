

package com.docuware.dev.schema._public.services.annotations;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "QueryParamaterType")
@XmlEnum
public enum QueryParamaterType {

    @XmlEnumValue("String")
    STRING("String"),
    @XmlEnumValue("Integer")
    INTEGER("Integer"),
    @XmlEnumValue("Boolean")
    BOOLEAN("Boolean");
    private final String value;

    QueryParamaterType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QueryParamaterType fromValue(String v) {
        for (QueryParamaterType c: QueryParamaterType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
