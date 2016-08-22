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
 * <p>Java-Klasse f�r DialogTypes.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DialogTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Search"/>
 *     &lt;enumeration value="Store"/>
 *     &lt;enumeration value="ResultList"/>
 *     &lt;enumeration value="ResultTree"/>
 *     &lt;enumeration value="InfoDialog"/>
 *     &lt;enumeration value="TaskList"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DialogTypes")
@XmlEnum
public enum DialogTypes {


    /**
     * Unknown type.
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * Search dialog.
     * 
     */
    @XmlEnumValue("Search")
    SEARCH("Search"),

    /**
     * Store dialog.
     * 
     */
    @XmlEnumValue("Store")
    STORE("Store"),

    /**
     * Result list.
     * 
     */
    @XmlEnumValue("ResultList")
    RESULT_LIST("ResultList"),

    /**
     * Tree view.
     * 
     */
    @XmlEnumValue("ResultTree")
    RESULT_TREE("ResultTree"),

    /**
     * Info dialog.
     * 
     */
    @XmlEnumValue("InfoDialog")
    INFO_DIALOG("InfoDialog"),

    /**
     * Task list(result list with predefiened conditions).
     * 
     */
    @XmlEnumValue("TaskList")
    TASK_LIST("TaskList");
    private final String value;

    DialogTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DialogTypes fromValue(String v) {
        for (DialogTypes c: DialogTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
