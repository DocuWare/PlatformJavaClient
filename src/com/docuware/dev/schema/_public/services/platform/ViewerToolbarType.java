

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "ViewerToolbarType")
@XmlEnum
@CompareIgnore
public enum ViewerToolbarType {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Navigation")
    NAVIGATION("Navigation"),
    @XmlEnumValue("Tools")
    TOOLS("Tools"),
    @XmlEnumValue("Display")
    DISPLAY("Display"),
    @XmlEnumValue("Stamps")
    STAMPS("Stamps"),
    @XmlEnumValue("DocOverview")
    DOC_OVERVIEW("DocOverview"),
    @XmlEnumValue("Annotations")
    ANNOTATIONS("Annotations"),
    @XmlEnumValue("DocLinks")
    DOC_LINKS("DocLinks"),
    @XmlEnumValue("BWMStamps")
    BWM_STAMPS("BWMStamps");
    private final String value;

    ViewerToolbarType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ViewerToolbarType fromValue(String v) {
        for (ViewerToolbarType c: ViewerToolbarType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
