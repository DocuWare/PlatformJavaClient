

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "SynchronizationOperation")
@XmlEnum
public enum SynchronizationOperation {


    @XmlEnumValue("Add")
    ADD("Add"),

    @XmlEnumValue("Replace")
    REPLACE("Replace");
    private final String value;

    SynchronizationOperation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SynchronizationOperation fromValue(String v) {
        for (SynchronizationOperation c: SynchronizationOperation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
