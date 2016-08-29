

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "ImportEntryVersionStatus")
@XmlEnum
public enum ImportEntryVersionStatus {


    @XmlEnumValue("Succeeded")
    SUCCEEDED("Succeeded"),

    @XmlEnumValue("Failed")
    FAILED("Failed"),

    @XmlEnumValue("Aborted")
    ABORTED("Aborted");
    private final String value;

    ImportEntryVersionStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImportEntryVersionStatus fromValue(String v) {
        for (ImportEntryVersionStatus c: ImportEntryVersionStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
