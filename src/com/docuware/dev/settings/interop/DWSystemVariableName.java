

package com.docuware.dev.settings.interop;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "DWSystemVariableName", namespace = "http://dev.docuware.com/settings/interop")
@XmlEnum
public enum DWSystemVariableName {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("CurrentUserShortName")
    CURRENT_USER_SHORT_NAME("CurrentUserShortName"),
    @XmlEnumValue("CurrentUserLongName")
    CURRENT_USER_LONG_NAME("CurrentUserLongName"),
    @XmlEnumValue("CurrentDate")
    CURRENT_DATE("CurrentDate"),
    @XmlEnumValue("CurrentDateTime")
    CURRENT_DATE_TIME("CurrentDateTime"),
    @XmlEnumValue("CurrentUserEmail")
    CURRENT_USER_EMAIL("CurrentUserEmail"),
    @XmlEnumValue("Clipboard")
    CLIPBOARD("Clipboard"),
    @XmlEnumValue("ImportDirectoryName")
    IMPORT_DIRECTORY_NAME("ImportDirectoryName"),
    @XmlEnumValue("ImportParentDirectoryName")
    IMPORT_PARENT_DIRECTORY_NAME("ImportParentDirectoryName"),
    @XmlEnumValue("FileName")
    FILE_NAME("FileName"),
    @XmlEnumValue("FileExtension")
    FILE_EXTENSION("FileExtension"),
    @XmlEnumValue("FileNameWithExtension")
    FILE_NAME_WITH_EXTENSION("FileNameWithExtension"),
    @XmlEnumValue("FileModificationDateTime")
    FILE_MODIFICATION_DATE_TIME("FileModificationDateTime"),
    @XmlEnumValue("FileCreationDateTime")
    FILE_CREATION_DATE_TIME("FileCreationDateTime");
    private final String value;

    DWSystemVariableName(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DWSystemVariableName fromValue(String v) {
        for (DWSystemVariableName c: DWSystemVariableName.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
