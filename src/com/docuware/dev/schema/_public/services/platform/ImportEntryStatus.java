

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


@XmlType(name = "ImportEntryStatus")
@XmlEnum
public enum ImportEntryStatus {


    @XmlEnumValue("Succeeded")
    SUCCEEDED("Succeeded"),

    @XmlEnumValue("Failed")
    FAILED("Failed");
    private final String value;

    ImportEntryStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImportEntryStatus fromValue(String v) {
        for (ImportEntryStatus c: ImportEntryStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
