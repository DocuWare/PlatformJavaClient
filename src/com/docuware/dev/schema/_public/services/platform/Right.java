//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.08.16 um 09:04:54 AM CEST 
//


package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r Right.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="Right">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Admin_Owner"/>
 *     &lt;enumeration value="Admin_ModifyRight"/>
 *     &lt;enumeration value="Admin_Operator"/>
 *     &lt;enumeration value="Admin_EditDialogs"/>
 *     &lt;enumeration value="Admin_MigrationAdministration"/>
 *     &lt;enumeration value="General_Store"/>
 *     &lt;enumeration value="General_Append"/>
 *     &lt;enumeration value="General_Search"/>
 *     &lt;enumeration value="General_Edit"/>
 *     &lt;enumeration value="General_DisplayDocument"/>
 *     &lt;enumeration value="General_EditDocuments"/>
 *     &lt;enumeration value="General_DeleteDocuments"/>
 *     &lt;enumeration value="General_Export"/>
 *     &lt;enumeration value="General_AppendToReadOnly"/>
 *     &lt;enumeration value="General_ChangeToReadOnly"/>
 *     &lt;enumeration value="General_Checkout"/>
 *     &lt;enumeration value="General_AddEntries"/>
 *     &lt;enumeration value="Annotation_New"/>
 *     &lt;enumeration value="Annotation_Delete"/>
 *     &lt;enumeration value="Annotation_All"/>
 *     &lt;enumeration value="Annotation_Hide"/>
 *     &lt;enumeration value="Annotation_Stamp_New"/>
 *     &lt;enumeration value="Annotation_Stamp_Hide"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Right")
@XmlEnum
public enum Right {


    /**
     * Owner
     * 
     */
    @XmlEnumValue("Admin_Owner")
    ADMIN_OWNER("Admin_Owner"),

    /**
     * Modify Rights
     * 
     */
    @XmlEnumValue("Admin_ModifyRight")
    ADMIN_MODIFY_RIGHT("Admin_ModifyRight"),

    /**
     * Operator
     * 
     */
    @XmlEnumValue("Admin_Operator")
    ADMIN_OPERATOR("Admin_Operator"),

    /**
     * Edit dialogs
     * 
     */
    @XmlEnumValue("Admin_EditDialogs")
    ADMIN_EDIT_DIALOGS("Admin_EditDialogs"),

    /**
     * Migration
     * 
     */
    @XmlEnumValue("Admin_MigrationAdministration")
    ADMIN_MIGRATION_ADMINISTRATION("Admin_MigrationAdministration"),

    /**
     * Store
     * 
     */
    @XmlEnumValue("General_Store")
    GENERAL_STORE("General_Store"),

    /**
     * Append
     * 
     */
    @XmlEnumValue("General_Append")
    GENERAL_APPEND("General_Append"),

    /**
     * Search
     * 
     */
    @XmlEnumValue("General_Search")
    GENERAL_SEARCH("General_Search"),

    /**
     * Edit index data
     * 
     */
    @XmlEnumValue("General_Edit")
    GENERAL_EDIT("General_Edit"),

    /**
     * Display document
     * 
     */
    @XmlEnumValue("General_DisplayDocument")
    GENERAL_DISPLAY_DOCUMENT("General_DisplayDocument"),

    /**
     * Edit documents
     * 
     */
    @XmlEnumValue("General_EditDocuments")
    GENERAL_EDIT_DOCUMENTS("General_EditDocuments"),

    /**
     * Delete documents
     * 
     */
    @XmlEnumValue("General_DeleteDocuments")
    GENERAL_DELETE_DOCUMENTS("General_DeleteDocuments"),

    /**
     * Export
     * 
     */
    @XmlEnumValue("General_Export")
    GENERAL_EXPORT("General_Export"),

    /**
     * Append to read only
     * 
     */
    @XmlEnumValue("General_AppendToReadOnly")
    GENERAL_APPEND_TO_READ_ONLY("General_AppendToReadOnly"),

    /**
     * Modify read-only document
     * 
     */
    @XmlEnumValue("General_ChangeToReadOnly")
    GENERAL_CHANGE_TO_READ_ONLY("General_ChangeToReadOnly"),

    /**
     * Check out
     * 
     */
    @XmlEnumValue("General_Checkout")
    GENERAL_CHECKOUT("General_Checkout"),

    /**
     * (Obsolete.Moved on dialog level)Add Entries to Select-List-Only-Fields
     * 
     */
    @XmlEnumValue("General_AddEntries")
    GENERAL_ADD_ENTRIES("General_AddEntries"),

    /**
     * New annotations
     * 
     */
    @XmlEnumValue("Annotation_New")
    ANNOTATION_NEW("Annotation_New"),

    /**
     * Delete annotations
     * 
     */
    @XmlEnumValue("Annotation_Delete")
    ANNOTATION_DELETE("Annotation_Delete"),

    /**
     * Change annotations
     * 
     */
    @XmlEnumValue("Annotation_All")
    ANNOTATION_ALL("Annotation_All"),

    /**
     * Hide annotations
     * 
     */
    @XmlEnumValue("Annotation_Hide")
    ANNOTATION_HIDE("Annotation_Hide"),

    /**
     * New stamp
     * 
     */
    @XmlEnumValue("Annotation_Stamp_New")
    ANNOTATION_STAMP_NEW("Annotation_Stamp_New"),

    /**
     * Hide a stamp
     * 
     */
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
