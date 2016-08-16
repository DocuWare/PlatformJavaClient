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
 * <p>Java-Klasse f�r VersionManagementStatus.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="VersionManagementStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Disable"/>
 *     &lt;enumeration value="Initial"/>
 *     &lt;enumeration value="InProgress"/>
 *     &lt;enumeration value="Manual"/>
 *     &lt;enumeration value="Automatic"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VersionManagementStatus")
@XmlEnum
public enum VersionManagementStatus {


    /**
     * Version management is disabled.
     * 
     */
    @XmlEnumValue("Disable")
    DISABLE("Disable"),

    /**
     * The initial version of the document.
     * 
     */
    @XmlEnumValue("Initial")
    INITIAL("Initial"),

    /**
     * Manual version management is in progress.
     * 
     */
    @XmlEnumValue("InProgress")
    IN_PROGRESS("InProgress"),

    /**
     * Manual version of the document.
     * 
     */
    @XmlEnumValue("Manual")
    MANUAL("Manual"),

    /**
     * Automatic version of the document.
     * 
     */
    @XmlEnumValue("Automatic")
    AUTOMATIC("Automatic");
    private final String value;

    VersionManagementStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VersionManagementStatus fromValue(String v) {
        for (VersionManagementStatus c: VersionManagementStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
