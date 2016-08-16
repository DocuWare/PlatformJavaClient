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
 * <p>Java-Klasse f�r AnnotationTools.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="AnnotationTools">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Line"/>
 *     &lt;enumeration value="Arrow"/>
 *     &lt;enumeration value="Rectangle"/>
 *     &lt;enumeration value="Ellipse"/>
 *     &lt;enumeration value="FilledEllipse"/>
 *     &lt;enumeration value="FilledRectangle"/>
 *     &lt;enumeration value="TransparentEllipse"/>
 *     &lt;enumeration value="TransparentRectangle"/>
 *     &lt;enumeration value="Marker"/>
 *     &lt;enumeration value="Text"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AnnotationTools")
@XmlEnum
public enum AnnotationTools {

    @XmlEnumValue("Line")
    LINE("Line"),
    @XmlEnumValue("Arrow")
    ARROW("Arrow"),
    @XmlEnumValue("Rectangle")
    RECTANGLE("Rectangle"),
    @XmlEnumValue("Ellipse")
    ELLIPSE("Ellipse"),
    @XmlEnumValue("FilledEllipse")
    FILLED_ELLIPSE("FilledEllipse"),
    @XmlEnumValue("FilledRectangle")
    FILLED_RECTANGLE("FilledRectangle"),
    @XmlEnumValue("TransparentEllipse")
    TRANSPARENT_ELLIPSE("TransparentEllipse"),
    @XmlEnumValue("TransparentRectangle")
    TRANSPARENT_RECTANGLE("TransparentRectangle"),
    @XmlEnumValue("Marker")
    MARKER("Marker"),
    @XmlEnumValue("Text")
    TEXT("Text");
    private final String value;

    AnnotationTools(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AnnotationTools fromValue(String v) {
        for (AnnotationTools c: AnnotationTools.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
