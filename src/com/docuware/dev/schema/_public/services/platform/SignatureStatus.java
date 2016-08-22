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
 * <p>Java-Klasse f�r SignatureStatus.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="SignatureStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Allow_Annotations"/>
 *     &lt;enumeration value="Allow_Stamps"/>
 *     &lt;enumeration value="Allow_Signature_Stamps"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SignatureStatus")
@XmlEnum
public enum SignatureStatus {


    /**
     * Allow placing of annotations
     * 
     */
    @XmlEnumValue("Allow_Annotations")
    ALLOW_ANNOTATIONS("Allow_Annotations"),

    /**
     * Allow placing of stamps
     * 
     */
    @XmlEnumValue("Allow_Stamps")
    ALLOW_STAMPS("Allow_Stamps"),

    /**
     * Allow placing of signature stamps
     * 
     */
    @XmlEnumValue("Allow_Signature_Stamps")
    ALLOW_SIGNATURE_STAMPS("Allow_Signature_Stamps");
    private final String value;

    SignatureStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SignatureStatus fromValue(String v) {
        for (SignatureStatus c: SignatureStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
