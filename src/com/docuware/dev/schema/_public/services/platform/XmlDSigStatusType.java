

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "XmlDSigStatusType")
@XmlEnum
public enum XmlDSigStatusType {


    @XmlEnumValue("NotChecked")
    NOT_CHECKED("NotChecked"),

    @XmlEnumValue("Ok")
    OK("Ok"),

    @XmlEnumValue("NotOk")
    NOT_OK("NotOk");
    private final String value;

    XmlDSigStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XmlDSigStatusType fromValue(String v) {
        for (XmlDSigStatusType c: XmlDSigStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
