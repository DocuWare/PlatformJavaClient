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
 * <p>Java-Klasse f�r LetterCase.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="LetterCase">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Default"/>
 *     &lt;enumeration value="UpperCase"/>
 *     &lt;enumeration value="LowerCase"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LetterCase")
@XmlEnum
public enum LetterCase {


    /**
     * As in the database
     * 
     */
    @XmlEnumValue("Default")
    DEFAULT("Default"),

    /**
     * Upper case letters
     * 
     */
    @XmlEnumValue("UpperCase")
    UPPER_CASE("UpperCase"),

    /**
     * Lower case letters
     * 
     */
    @XmlEnumValue("LowerCase")
    LOWER_CASE("LowerCase");
    private final String value;

    LetterCase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LetterCase fromValue(String v) {
        for (LetterCase c: LetterCase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
