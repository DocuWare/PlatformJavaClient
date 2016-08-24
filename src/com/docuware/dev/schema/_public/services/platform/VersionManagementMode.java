

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "VersionManagementMode")
@XmlEnum
public enum VersionManagementMode {


    @XmlEnumValue("Disable")
    DISABLE("Disable"),

    @XmlEnumValue("Manual")
    MANUAL("Manual"),

    @XmlEnumValue("Automatic")
    AUTOMATIC("Automatic");
    private final String value;

    VersionManagementMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VersionManagementMode fromValue(String v) {
        for (VersionManagementMode c: VersionManagementMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
