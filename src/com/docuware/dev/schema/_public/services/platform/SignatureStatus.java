

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "SignatureStatus")
@XmlEnum
public enum SignatureStatus {


    @XmlEnumValue("Allow_Annotations")
    ALLOW_ANNOTATIONS("Allow_Annotations"),

    @XmlEnumValue("Allow_Stamps")
    ALLOW_STAMPS("Allow_Stamps"),

    @XmlEnumValue("Allow_Signature_Stamps")
    ALLOW_SIGNATURE_STAMPS("Allow_Signature_Stamps");
    private final String value;

    SignatureStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SignatureStatus fromValue(String v) {
        for (SignatureStatus c: SignatureStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
