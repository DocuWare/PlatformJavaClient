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
 * <p>Java-Klasse f�r DynamicValueType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DynamicValueType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="CurrentDate"/>
 *     &lt;enumeration value="CurrentDateTime"/>
 *     &lt;enumeration value="CurrentTime"/>
 *     &lt;enumeration value="AutoNumber"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DynamicValueType")
@XmlEnum
public enum DynamicValueType {

    @XmlEnumValue("None")
    NONE("None"),

    /**
     * Current date.
     * 
     */
    @XmlEnumValue("CurrentDate")
    CURRENT_DATE("CurrentDate"),

    /**
     * Current date including the time.
     * 
     */
    @XmlEnumValue("CurrentDateTime")
    CURRENT_DATE_TIME("CurrentDateTime"),

    /**
     * Current time.
     * 
     */
    @XmlEnumValue("CurrentTime")
    CURRENT_TIME("CurrentTime"),

    /**
     * Auto incrementing number.
     * 
     */
    @XmlEnumValue("AutoNumber")
    AUTO_NUMBER("AutoNumber");
    private final String value;

    DynamicValueType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DynamicValueType fromValue(String v) {
        for (DynamicValueType c: DynamicValueType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
