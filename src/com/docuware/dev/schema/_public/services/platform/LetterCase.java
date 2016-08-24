

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "LetterCase")
@XmlEnum
public enum LetterCase {


    @XmlEnumValue("Default")
    DEFAULT("Default"),

    @XmlEnumValue("UpperCase")
    UPPER_CASE("UpperCase"),

    @XmlEnumValue("LowerCase")
    LOWER_CASE("LowerCase");
    private final String value;

    LetterCase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LetterCase fromValue(String v) {
        for (LetterCase c: LetterCase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
