

package com.docuware.dev.settings.interop;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "DocumentSourceType", namespace = "http://dev.docuware.com/settings/interop")
@XmlEnum
public enum DocumentSourceType {

    @XmlEnumValue("Printer")
    PRINTER("Printer"),
    @XmlEnumValue("Scanner")
    SCANNER("Scanner"),
    @XmlEnumValue("WebCapture")
    WEB_CAPTURE("WebCapture");
    private final String value;

    DocumentSourceType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DocumentSourceType fromValue(String v) {
        for (DocumentSourceType c: DocumentSourceType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
