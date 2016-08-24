

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "DialogTypes")
@XmlEnum
public enum DialogTypes {


    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    @XmlEnumValue("Search")
    SEARCH("Search"),

    @XmlEnumValue("Store")
    STORE("Store"),

    @XmlEnumValue("ResultList")
    RESULT_LIST("ResultList"),

    @XmlEnumValue("ResultTree")
    RESULT_TREE("ResultTree"),

    @XmlEnumValue("InfoDialog")
    INFO_DIALOG("InfoDialog"),

    @XmlEnumValue("TaskList")
    TASK_LIST("TaskList");
    private final String value;

    DialogTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DialogTypes fromValue(String v) {
        for (DialogTypes c: DialogTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
