

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "ContentMergeOperation")
@XmlEnum
public enum ContentMergeOperation {


    @XmlEnumValue("Clip")
    CLIP("Clip"),

    @XmlEnumValue("Staple")
    STAPLE("Staple");
    private final String value;

    ContentMergeOperation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContentMergeOperation fromValue(String v) {
        for (ContentMergeOperation c: ContentMergeOperation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
