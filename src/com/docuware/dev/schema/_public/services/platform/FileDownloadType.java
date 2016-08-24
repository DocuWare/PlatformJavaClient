

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "FileDownloadType")
@XmlEnum
public enum FileDownloadType {


    @XmlEnumValue("Auto")
    AUTO("Auto"),

    @XmlEnumValue("Zip")
    ZIP("Zip"),

    PDF("PDF");
    private final String value;

    FileDownloadType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FileDownloadType fromValue(String v) {
        for (FileDownloadType c: FileDownloadType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
