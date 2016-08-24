

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "StampSignatureType")
@XmlEnum
public enum StampSignatureType {


    @XmlEnumValue("No")
    NO("No"),

    @XmlEnumValue("Simple")
    SIMPLE("Simple"),

    XMLDSIG("XMLDSIG");
    private final String value;

    StampSignatureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StampSignatureType fromValue(String v) {
        for (StampSignatureType c: StampSignatureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
