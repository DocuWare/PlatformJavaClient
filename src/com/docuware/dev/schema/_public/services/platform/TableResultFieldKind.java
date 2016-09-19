

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


@XmlType(name = "TableResultFieldKind")
@XmlEnum
public enum TableResultFieldKind {


    @XmlEnumValue("System")
    SYSTEM("System"),

    @XmlEnumValue("Index")
    INDEX("Index"),

    @XmlEnumValue("Additional")
    ADDITIONAL("Additional");
    private final String value;

    TableResultFieldKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TableResultFieldKind fromValue(String v) {
        for (TableResultFieldKind c: TableResultFieldKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
