

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


@XmlType(name = "DialogExpressionOperation")
@XmlEnum
public enum DialogExpressionOperation {


    @XmlEnumValue("And")
    AND("And"),

    @XmlEnumValue("Or")
    OR("Or");
    private final String value;

    DialogExpressionOperation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DialogExpressionOperation fromValue(String v) {
        for (DialogExpressionOperation c: DialogExpressionOperation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
