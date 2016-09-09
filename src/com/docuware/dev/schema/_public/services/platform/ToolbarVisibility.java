

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "ToolbarVisibility")
@XmlEnum
@CompareIgnore
public enum ToolbarVisibility {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Expanded")
    EXPANDED("Expanded"),
    @XmlEnumValue("Collapsed")
    COLLAPSED("Collapsed"),
    @XmlEnumValue("NotVisible")
    NOT_VISIBLE("NotVisible");
    private final String value;

    ToolbarVisibility(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ToolbarVisibility fromValue(String v) {
        for (ToolbarVisibility c: ToolbarVisibility.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
