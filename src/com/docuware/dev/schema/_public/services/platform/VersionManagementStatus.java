

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "VersionManagementStatus")
@XmlEnum
public enum VersionManagementStatus {


    @XmlEnumValue("Disable")
    DISABLE("Disable"),

    @XmlEnumValue("Initial")
    INITIAL("Initial"),

    @XmlEnumValue("InProgress")
    IN_PROGRESS("InProgress"),

    @XmlEnumValue("Manual")
    MANUAL("Manual"),

    @XmlEnumValue("Automatic")
    AUTOMATIC("Automatic");
    private final String value;

    VersionManagementStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VersionManagementStatus fromValue(String v) {
        for (VersionManagementStatus c: VersionManagementStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
