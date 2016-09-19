

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


@XmlType(name = "SortDirection")
@XmlEnum
public enum SortDirection {


    @XmlEnumValue("Default")
    DEFAULT("Default"),

    @XmlEnumValue("Asc")
    ASC("Asc"),

    @XmlEnumValue("Desc")
    DESC("Desc");
    private final String value;

    SortDirection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SortDirection fromValue(String v) {
        for (SortDirection c: SortDirection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
