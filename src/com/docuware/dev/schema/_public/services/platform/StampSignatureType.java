//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.08.18 um 09:47:39 AM CEST 
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
 * <p>Java-Klasse f�r StampSignatureType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="StampSignatureType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="No"/>
 *     &lt;enumeration value="Simple"/>
 *     &lt;enumeration value="XMLDSIG"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StampSignatureType")
@XmlEnum
public enum StampSignatureType {


    /**
     * Not a signature
     * 
     */
    @XmlEnumValue("No")
    NO("No"),

    /**
     * Simple signature - checksum only
     * 
     */
    @XmlEnumValue("Simple")
    SIMPLE("Simple"),

    /**
     * Xml digital signature - certificate based
     * 
     */
    XMLDSIG("XMLDSIG");
    private final String value;

    StampSignatureType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StampSignatureType fromValue(String v) {
        for (StampSignatureType c: StampSignatureType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
