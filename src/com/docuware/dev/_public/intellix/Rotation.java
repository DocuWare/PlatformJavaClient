//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.08.22 um 03:45:48 PM CEST 
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
 * <p>Java-Klasse f�r Rotation.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="Rotation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Rotate0Degree"/>
 *     &lt;enumeration value="Rotate90Degree"/>
 *     &lt;enumeration value="Rotate180Degree"/>
 *     &lt;enumeration value="Rotate270Degree"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Rotation")
@XmlEnum
public enum Rotation {


    /**
     * 
     *             The original page is not rotated.
     *           
     * 
     */
    @XmlEnumValue("Rotate0Degree")
    ROTATE_0_DEGREE("Rotate0Degree"),

    /**
     * 
     *             The original page has to be rotated by 90 degree clock wise in order to match the text shot.
     *           
     * 
     */
    @XmlEnumValue("Rotate90Degree")
    ROTATE_90_DEGREE("Rotate90Degree"),

    /**
     * 
     *             The original page has to be rotated by 180 degree order to match the text shot.
     *           
     * 
     */
    @XmlEnumValue("Rotate180Degree")
    ROTATE_180_DEGREE("Rotate180Degree"),

    /**
     * 
     *             The original page has to be rotated by 270 degree clock wise (that is, 90 degree clock-wise) in order to match the text shot.
     *           
     * 
     */
    @XmlEnumValue("Rotate270Degree")
    ROTATE_270_DEGREE("Rotate270Degree");
    private final String value;

    Rotation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Rotation fromValue(String v) {
        for (Rotation c: Rotation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
