//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.08.22 um 03:45:48 PM CEST 
//


package com.docuware.dev.schema._public.services.annotations;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r HttpMethod.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="HttpMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Get"/>
 *     &lt;enumeration value="Put"/>
 *     &lt;enumeration value="Post"/>
 *     &lt;enumeration value="Delete"/>
 *     &lt;enumeration value="Head"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HttpMethod")
@XmlEnum
public enum HttpMethod {

    @XmlEnumValue("Get")
    GET("Get"),
    @XmlEnumValue("Put")
    PUT("Put"),
    @XmlEnumValue("Post")
    POST("Post"),
    @XmlEnumValue("Delete")
    DELETE("Delete"),
    @XmlEnumValue("Head")
    HEAD("Head");
    private final String value;

    HttpMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static HttpMethod fromValue(String v) {
        for (HttpMethod c: HttpMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
