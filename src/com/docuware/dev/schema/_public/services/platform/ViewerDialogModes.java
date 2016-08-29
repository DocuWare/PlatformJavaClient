

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "ViewerDialogModes")
@XmlEnum
public enum ViewerDialogModes {


    @XmlEnumValue("EditMode")
    EDIT_MODE("EditMode"),

    @XmlEnumValue("AdHocEditMode")
    AD_HOC_EDIT_MODE("AdHocEditMode"),

    @XmlEnumValue("ReadOnly")
    READ_ONLY("ReadOnly");
    private final String value;

    ViewerDialogModes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ViewerDialogModes fromValue(String v) {
        for (ViewerDialogModes c: ViewerDialogModes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
