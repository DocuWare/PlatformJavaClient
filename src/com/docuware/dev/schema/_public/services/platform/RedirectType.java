

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


@XmlType(name = "RedirectType")
@XmlEnum
public enum RedirectType {

    @XmlEnumValue("ReturnToForm")
    RETURN_TO_FORM("ReturnToForm"),
    URL("URL"),
    @XmlEnumValue("StoredDocument")
    STORED_DOCUMENT("StoredDocument");
    private final String value;

    RedirectType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RedirectType fromValue(String v) {
        for (RedirectType c: RedirectType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
