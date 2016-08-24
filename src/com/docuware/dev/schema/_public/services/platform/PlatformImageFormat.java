

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "PlatformImageFormat")
@XmlEnum
public enum PlatformImageFormat {

    @XmlEnumValue("Png")
    PNG("Png"),
    @XmlEnumValue("Jpeg")
    JPEG("Jpeg");
    private final String value;

    PlatformImageFormat(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PlatformImageFormat fromValue(String v) {
        for (PlatformImageFormat c: PlatformImageFormat.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
