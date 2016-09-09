

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "LayoutMode")
@XmlEnum
@CompareIgnore
public enum LayoutMode {

    @XmlEnumValue("AllInOne")
    ALL_IN_ONE("AllInOne"),
    @XmlEnumValue("Separate")
    SEPARATE("Separate"),
    @XmlEnumValue("StoreView")
    STORE_VIEW("StoreView");
    private final String value;

    LayoutMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LayoutMode fromValue(String v) {
        for (LayoutMode c: LayoutMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
