

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


@XmlType(name = "FileSource")
@XmlEnum
public enum FileSource {

    @XmlEnumValue("FileSystem")
    FILE_SYSTEM("FileSystem"),
    @XmlEnumValue("DocTray")
    DOC_TRAY("DocTray");
    private final String value;

    FileSource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FileSource fromValue(String v) {
        for (FileSource c: FileSource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
