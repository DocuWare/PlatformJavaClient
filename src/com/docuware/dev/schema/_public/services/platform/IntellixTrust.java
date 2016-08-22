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
 * <p>Java-Klasse f�r IntellixTrust.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="IntellixTrust">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Failed"/>
 *     &lt;enumeration value="InProgress"/>
 *     &lt;enumeration value="Red"/>
 *     &lt;enumeration value="Yellow"/>
 *     &lt;enumeration value="Green"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IntellixTrust")
@XmlEnum
public enum IntellixTrust {


    /**
     * No intelix
     * 
     */
    @XmlEnumValue("None")
    NONE("None"),

    /**
     * Intelix failed
     * 
     */
    @XmlEnumValue("Failed")
    FAILED("Failed"),

    /**
     * Intelix still in progress
     * 
     */
    @XmlEnumValue("InProgress")
    IN_PROGRESS("InProgress"),

    /**
     * Unrecognized
     * 
     */
    @XmlEnumValue("Red")
    RED("Red"),

    /**
     * Predicted
     * 
     */
    @XmlEnumValue("Yellow")
    YELLOW("Yellow"),

    /**
     * Recognized
     * 
     */
    @XmlEnumValue("Green")
    GREEN("Green");
    private final String value;

    IntellixTrust(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IntellixTrust fromValue(String v) {
        for (IntellixTrust c: IntellixTrust.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
