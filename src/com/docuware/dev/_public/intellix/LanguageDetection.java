

package com.docuware.dev._public.intellix;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "LanguageDetection")
@XmlEnum
public enum LanguageDetection {


    @XmlEnumValue("Auto")
    AUTO("Auto"),

    @XmlEnumValue("FallbackSystemCulture")
    FALLBACK_SYSTEM_CULTURE("FallbackSystemCulture"),

    @XmlEnumValue("FallbackExplicite")
    FALLBACK_EXPLICITE("FallbackExplicite"),

    @XmlEnumValue("Explicite")
    EXPLICITE("Explicite"),

    @XmlEnumValue("DocuWareLanguageIdentifier")
    DOCU_WARE_LANGUAGE_IDENTIFIER("DocuWareLanguageIdentifier");
    private final String value;

    LanguageDetection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LanguageDetection fromValue(String v) {
        for (LanguageDetection c: LanguageDetection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
