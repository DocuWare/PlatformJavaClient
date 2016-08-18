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
 * <p>Java-Klasse f�r ViewerToolbarType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ViewerToolbarType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Navigation"/>
 *     &lt;enumeration value="Tools"/>
 *     &lt;enumeration value="Display"/>
 *     &lt;enumeration value="Stamps"/>
 *     &lt;enumeration value="DocOverview"/>
 *     &lt;enumeration value="Annotations"/>
 *     &lt;enumeration value="DocLinks"/>
 *     &lt;enumeration value="BWMStamps"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ViewerToolbarType")
@XmlEnum
public enum ViewerToolbarType {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Navigation")
    NAVIGATION("Navigation"),
    @XmlEnumValue("Tools")
    TOOLS("Tools"),
    @XmlEnumValue("Display")
    DISPLAY("Display"),
    @XmlEnumValue("Stamps")
    STAMPS("Stamps"),
    @XmlEnumValue("DocOverview")
    DOC_OVERVIEW("DocOverview"),
    @XmlEnumValue("Annotations")
    ANNOTATIONS("Annotations"),
    @XmlEnumValue("DocLinks")
    DOC_LINKS("DocLinks"),
    @XmlEnumValue("BWMStamps")
    BWM_STAMPS("BWMStamps");
    private final String value;

    ViewerToolbarType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ViewerToolbarType fromValue(String v) {
        for (ViewerToolbarType c: ViewerToolbarType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
