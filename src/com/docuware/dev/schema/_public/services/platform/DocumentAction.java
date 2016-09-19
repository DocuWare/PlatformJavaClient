

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


@XmlType(name = "DocumentAction")
@XmlEnum
public enum DocumentAction {


    @XmlEnumValue("ReIntellix")
    RE_INTELLIX("ReIntellix"),

    @XmlEnumValue("Append")
    APPEND("Append"),

    @XmlEnumValue("SetLatestVersion")
    SET_LATEST_VERSION("SetLatestVersion"),

    @XmlEnumValue("UndoCheckOut")
    UNDO_CHECK_OUT("UndoCheckOut"),

    @XmlEnumValue("CheckOut")
    CHECK_OUT("CheckOut"),

    @XmlEnumValue("CheckIn")
    CHECK_IN("CheckIn"),

    @XmlEnumValue("EnhanceImage")
    ENHANCE_IMAGE("EnhanceImage"),

    @XmlEnumValue("MergeAnnotations")
    MERGE_ANNOTATIONS("MergeAnnotations"),

    @XmlEnumValue("RotatePage")
    ROTATE_PAGE("RotatePage");
    private final String value;

    DocumentAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DocumentAction fromValue(String v) {
        for (DocumentAction c: DocumentAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
