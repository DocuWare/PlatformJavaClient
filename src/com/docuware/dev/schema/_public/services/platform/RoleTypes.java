

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


@XmlType(name = "RoleTypes")
@XmlEnum
public enum RoleTypes {

    @XmlEnumValue("Standard")
    STANDARD("Standard"),
    @XmlEnumValue("Default")
    DEFAULT("Default"),
    @XmlEnumValue("Administrator")
    ADMINISTRATOR("Administrator");
    private final String value;

    RoleTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoleTypes fromValue(String v) {
        for (RoleTypes c: RoleTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
