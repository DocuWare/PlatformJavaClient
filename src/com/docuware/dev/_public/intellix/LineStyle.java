//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.08.18 um 09:47:39 AM CEST 
//


package com.docuware.dev._public.intellix;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r LineStyle.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="LineStyle">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="none"/>
 *     &lt;enumeration value="single"/>
 *     &lt;enumeration value="dotted"/>
 *     &lt;enumeration value="thick"/>
 *     &lt;enumeration value="dash"/>
 *     &lt;enumeration value="double"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LineStyle")
@XmlEnum
public enum LineStyle {


    /**
     * The line isn't visible 
     * 
     */
    @XmlEnumValue("none")
    NONE("none"),

    /**
     * The line is a single continous line
     * 
     */
    @XmlEnumValue("single")
    SINGLE("single"),

    /**
     * The line consist of many dot
     * 
     */
    @XmlEnumValue("dotted")
    DOTTED("dotted"),

    /**
     * A thick continous line
     * 
     */
    @XmlEnumValue("thick")
    THICK("thick"),

    /**
     * The line consist of many dash
     * 
     */
    @XmlEnumValue("dash")
    DASH("dash"),

    /**
     * Two single continous line
     * 
     */
    @XmlEnumValue("double")
    DOUBLE("double");
    private final String value;

    LineStyle(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LineStyle fromValue(String v) {
        for (LineStyle c: LineStyle.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
