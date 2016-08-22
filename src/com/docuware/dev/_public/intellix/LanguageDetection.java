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
 * <p>Java-Klasse f�r LanguageDetection.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="LanguageDetection">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Auto"/>
 *     &lt;enumeration value="FallbackSystemCulture"/>
 *     &lt;enumeration value="FallbackExplicite"/>
 *     &lt;enumeration value="Explicite"/>
 *     &lt;enumeration value="DocuWareLanguageIdentifier"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LanguageDetection")
@XmlEnum
public enum LanguageDetection {


    /**
     * The OCR could automatically detect the language.
     * 
     */
    @XmlEnumValue("Auto")
    AUTO("Auto"),

    /**
     * The OCR could not automatically detect the language and used the culture of system the OCR was run.
     * 
     */
    @XmlEnumValue("FallbackSystemCulture")
    FALLBACK_SYSTEM_CULTURE("FallbackSystemCulture"),

    /**
     * The OCR could not automatically detect the language and used the languages which are explicitely specified by a user.
     * 
     */
    @XmlEnumValue("FallbackExplicite")
    FALLBACK_EXPLICITE("FallbackExplicite"),

    /**
     * The OCR did not try to automatically detect any language. Only the languages which are explicitely specified by a user are used.
     * 
     */
    @XmlEnumValue("Explicite")
    EXPLICITE("Explicite"),

    /**
     * The language was detected by the majority voting algorithm used inside DocuWare.
     * 
     */
    @XmlEnumValue("DocuWareLanguageIdentifier")
    DOCU_WARE_LANGUAGE_IDENTIFIER("DocuWareLanguageIdentifier");
    private final String value;

    LanguageDetection(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LanguageDetection fromValue(String v) {
        for (LanguageDetection c: LanguageDetection.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
