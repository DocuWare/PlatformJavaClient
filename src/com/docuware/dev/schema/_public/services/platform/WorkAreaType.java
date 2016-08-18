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
 * <p>Java-Klasse f�r WorkAreaType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="WorkAreaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Basket"/>
 *     &lt;enumeration value="Search"/>
 *     &lt;enumeration value="TaskList"/>
 *     &lt;enumeration value="Workflow"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "WorkAreaType")
@XmlEnum
public enum WorkAreaType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Basket")
    BASKET("Basket"),
    @XmlEnumValue("Search")
    SEARCH("Search"),
    @XmlEnumValue("TaskList")
    TASK_LIST("TaskList"),
    @XmlEnumValue("Workflow")
    WORKFLOW("Workflow");
    private final String value;

    WorkAreaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WorkAreaType fromValue(String v) {
        for (WorkAreaType c: WorkAreaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
