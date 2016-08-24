

package com.docuware.dev._public.intellix;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "Rotation")
@XmlEnum
public enum Rotation {


    @XmlEnumValue("Rotate0Degree")
    ROTATE_0_DEGREE("Rotate0Degree"),

    @XmlEnumValue("Rotate90Degree")
    ROTATE_90_DEGREE("Rotate90Degree"),

    @XmlEnumValue("Rotate180Degree")
    ROTATE_180_DEGREE("Rotate180Degree"),

    @XmlEnumValue("Rotate270Degree")
    ROTATE_270_DEGREE("Rotate270Degree");
    private final String value;

    Rotation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Rotation fromValue(String v) {
        for (Rotation c: Rotation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
