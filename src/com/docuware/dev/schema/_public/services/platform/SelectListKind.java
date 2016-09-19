

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


@XmlType(name = "SelectListKind")
@XmlEnum
public enum SelectListKind {


    @XmlEnumValue("Fixed")
    FIXED("Fixed"),

    @XmlEnumValue("External")
    EXTERNAL("External");
    private final String value;

    SelectListKind(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SelectListKind fromValue(String v) {
        for (SelectListKind c: SelectListKind.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
