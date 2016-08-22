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
 * <p>Java-Klasse f�r ImportEntryVersionStatus.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ImportEntryVersionStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Succeeded"/>
 *     &lt;enumeration value="Failed"/>
 *     &lt;enumeration value="Aborted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ImportEntryVersionStatus")
@XmlEnum
public enum ImportEntryVersionStatus {


    /**
     * A value that indicates whether importing of the version is successful.
     * 
     */
    @XmlEnumValue("Succeeded")
    SUCCEEDED("Succeeded"),

    /**
     * A value that indicates whether importing of the version failed.
     * 
     */
    @XmlEnumValue("Failed")
    FAILED("Failed"),

    /**
     * A value that indicates whether importing of the version is not started.
     * 
     */
    @XmlEnumValue("Aborted")
    ABORTED("Aborted");
    private final String value;

    ImportEntryVersionStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImportEntryVersionStatus fromValue(String v) {
        for (ImportEntryVersionStatus c: ImportEntryVersionStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
