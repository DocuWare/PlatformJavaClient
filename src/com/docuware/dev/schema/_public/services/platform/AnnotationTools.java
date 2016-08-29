

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "AnnotationTools")
@XmlEnum
public enum AnnotationTools {

    @XmlEnumValue("Line")
    LINE("Line"),
    @XmlEnumValue("Arrow")
    ARROW("Arrow"),
    @XmlEnumValue("Rectangle")
    RECTANGLE("Rectangle"),
    @XmlEnumValue("Ellipse")
    ELLIPSE("Ellipse"),
    @XmlEnumValue("FilledEllipse")
    FILLED_ELLIPSE("FilledEllipse"),
    @XmlEnumValue("FilledRectangle")
    FILLED_RECTANGLE("FilledRectangle"),
    @XmlEnumValue("TransparentEllipse")
    TRANSPARENT_ELLIPSE("TransparentEllipse"),
    @XmlEnumValue("TransparentRectangle")
    TRANSPARENT_RECTANGLE("TransparentRectangle"),
    @XmlEnumValue("Marker")
    MARKER("Marker"),
    @XmlEnumValue("Text")
    TEXT("Text");
    private final String value;

    AnnotationTools(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AnnotationTools fromValue(String v) {
        for (AnnotationTools c: AnnotationTools.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
