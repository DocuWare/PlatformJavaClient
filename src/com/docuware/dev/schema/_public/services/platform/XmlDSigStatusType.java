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
 * <p>Java-Klasse f�r XmlDSigStatusType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="XmlDSigStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotChecked"/>
 *     &lt;enumeration value="Ok"/>
 *     &lt;enumeration value="NotOk"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "XmlDSigStatusType")
@XmlEnum
public enum XmlDSigStatusType {


    /**
     * 
     *             Not checked.
     *           
     * 
     */
    @XmlEnumValue("NotChecked")
    NOT_CHECKED("NotChecked"),

    /**
     * 
     *             Okay.
     *           
     * 
     */
    @XmlEnumValue("Ok")
    OK("Ok"),

    /**
     * 
     *             Failed. Details in ErrorInfo.
     *           
     * 
     */
    @XmlEnumValue("NotOk")
    NOT_OK("NotOk");
    private final String value;

    XmlDSigStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static XmlDSigStatusType fromValue(String v) {
        for (XmlDSigStatusType c: XmlDSigStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
