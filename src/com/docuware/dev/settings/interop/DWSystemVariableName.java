//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.08.22 um 03:45:48 PM CEST 
//


package com.docuware.dev.settings.interop;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r DWSystemVariableName.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DWSystemVariableName">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="CurrentUserShortName"/>
 *     &lt;enumeration value="CurrentUserLongName"/>
 *     &lt;enumeration value="CurrentDate"/>
 *     &lt;enumeration value="CurrentDateTime"/>
 *     &lt;enumeration value="CurrentUserEmail"/>
 *     &lt;enumeration value="Clipboard"/>
 *     &lt;enumeration value="ImportDirectoryName"/>
 *     &lt;enumeration value="ImportParentDirectoryName"/>
 *     &lt;enumeration value="FileName"/>
 *     &lt;enumeration value="FileExtension"/>
 *     &lt;enumeration value="FileNameWithExtension"/>
 *     &lt;enumeration value="FileModificationDateTime"/>
 *     &lt;enumeration value="FileCreationDateTime"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
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
