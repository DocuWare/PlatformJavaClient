

package com.docuware.dev.settings.interop;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "DWFieldType", namespace = "http://dev.docuware.com/settings/interop")
@XmlEnum
public enum DWFieldType {

    @XmlEnumValue("Text")
    TEXT("Text"),
    @XmlEnumValue("Numeric")
    NUMERIC("Numeric"),
    @XmlEnumValue("Memo")
    MEMO("Memo"),
    @XmlEnumValue("Date")
    DATE("Date"),
    @XmlEnumValue("Keyword")
    KEYWORD("Keyword"),
    @XmlEnumValue("Decimal")
    DECIMAL("Decimal"),
    @XmlEnumValue("DateTime")
    DATE_TIME("DateTime");
    private final String value;

    DWFieldType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DWFieldType fromValue(String v) {
        for (DWFieldType c: DWFieldType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
