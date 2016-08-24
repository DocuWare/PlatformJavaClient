

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "Right")
@XmlEnum
public enum Right {


    @XmlEnumValue("Admin_Owner")
    ADMIN_OWNER("Admin_Owner"),

    @XmlEnumValue("Admin_ModifyRight")
    ADMIN_MODIFY_RIGHT("Admin_ModifyRight"),

    @XmlEnumValue("Admin_Operator")
    ADMIN_OPERATOR("Admin_Operator"),

    @XmlEnumValue("Admin_EditDialogs")
    ADMIN_EDIT_DIALOGS("Admin_EditDialogs"),

    @XmlEnumValue("Admin_MigrationAdministration")
    ADMIN_MIGRATION_ADMINISTRATION("Admin_MigrationAdministration"),

    @XmlEnumValue("General_Store")
    GENERAL_STORE("General_Store"),

    @XmlEnumValue("General_Append")
    GENERAL_APPEND("General_Append"),

    @XmlEnumValue("General_Search")
    GENERAL_SEARCH("General_Search"),

    @XmlEnumValue("General_Edit")
    GENERAL_EDIT("General_Edit"),

    @XmlEnumValue("General_DisplayDocument")
    GENERAL_DISPLAY_DOCUMENT("General_DisplayDocument"),

    @XmlEnumValue("General_EditDocuments")
    GENERAL_EDIT_DOCUMENTS("General_EditDocuments"),

    @XmlEnumValue("General_DeleteDocuments")
    GENERAL_DELETE_DOCUMENTS("General_DeleteDocuments"),

    @XmlEnumValue("General_Export")
    GENERAL_EXPORT("General_Export"),

    @XmlEnumValue("General_AppendToReadOnly")
    GENERAL_APPEND_TO_READ_ONLY("General_AppendToReadOnly"),

    @XmlEnumValue("General_ChangeToReadOnly")
    GENERAL_CHANGE_TO_READ_ONLY("General_ChangeToReadOnly"),

    @XmlEnumValue("General_Checkout")
    GENERAL_CHECKOUT("General_Checkout"),

    @XmlEnumValue("General_AddEntries")
    GENERAL_ADD_ENTRIES("General_AddEntries"),

    @XmlEnumValue("Annotation_New")
    ANNOTATION_NEW("Annotation_New"),

    @XmlEnumValue("Annotation_Delete")
    ANNOTATION_DELETE("Annotation_Delete"),

    @XmlEnumValue("Annotation_All")
    ANNOTATION_ALL("Annotation_All"),

    @XmlEnumValue("Annotation_Hide")
    ANNOTATION_HIDE("Annotation_Hide"),

    @XmlEnumValue("Annotation_Stamp_New")
    ANNOTATION_STAMP_NEW("Annotation_Stamp_New"),

    @XmlEnumValue("Annotation_Stamp_Hide")
    ANNOTATION_STAMP_HIDE("Annotation_Stamp_Hide");
    private final String value;

    Right(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Right fromValue(String v) {
        for (Right c: Right.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
