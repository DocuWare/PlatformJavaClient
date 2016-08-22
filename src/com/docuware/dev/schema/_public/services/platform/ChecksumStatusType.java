//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.08.22 um 03:45:48 PM CEST 
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
 * <p>Java-Klasse f�r ChecksumStatusType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ChecksumStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotChecked"/>
 *     &lt;enumeration value="Ok"/>
 *     &lt;enumeration value="NoChecksum"/>
 *     &lt;enumeration value="WrongChecksum"/>
 *     &lt;enumeration value="FailedToCheck"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ChecksumStatusType")
@XmlEnum
public enum ChecksumStatusType {


    /**
     * 
     *             The checksums is not checked.
     *           
     * 
     */
    @XmlEnumValue("NotChecked")
    NOT_CHECKED("NotChecked"),

    /**
     * 
     *             All checksums are correct.
     *           
     * 
     */
    @XmlEnumValue("Ok")
    OK("Ok"),

    /**
     * 
     *             There are no checksums.
     *           
     * 
     */
    @XmlEnumValue("NoChecksum")
    NO_CHECKSUM("NoChecksum"),

    /**
     * 
     *             As least one of the checksum is wrong.
     *           
     * 
     */
    @XmlEnumValue("WrongChecksum")
    WRONG_CHECKSUM("WrongChecksum"),

    /**
     * 
     *             A problem has occurred while checking the checksum.
     *           
     * 
     */
    @XmlEnumValue("FailedToCheck")
    FAILED_TO_CHECK("FailedToCheck");
    private final String value;

    ChecksumStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ChecksumStatusType fromValue(String v) {
        for (ChecksumStatusType c: ChecksumStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
