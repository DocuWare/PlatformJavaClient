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
 * <p>Java-Klasse f�r ContentDivideOperation.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ContentDivideOperation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unclip"/>
 *     &lt;enumeration value="Unstaple"/>
 *     &lt;enumeration value="Split"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContentDivideOperation")
@XmlEnum
public enum ContentDivideOperation {


    /**
     * Split every section as a new document. Accept no arguments. Produce list of documents
     * 
     */
    @XmlEnumValue("Unclip")
    UNCLIP("Unclip"),

    /**
     * Split every page as a new document. Accept no arguments. Produce list of documents
     * 
     */
    @XmlEnumValue("Unstaple")
    UNSTAPLE("Unstaple"),

    /**
     * Split document on specific pages as new documents. Accept list of pages. Produce list of documents
     * 
     */
    @XmlEnumValue("Split")
    SPLIT("Split");
    private final String value;

    ContentDivideOperation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ContentDivideOperation fromValue(String v) {
        for (ContentDivideOperation c: ContentDivideOperation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
