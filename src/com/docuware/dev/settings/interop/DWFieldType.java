//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.08.16 um 09:04:54 AM CEST 
//


package com.docuware.dev.settings.interop;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r DWFieldType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DWFieldType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Text"/>
 *     &lt;enumeration value="Numeric"/>
 *     &lt;enumeration value="Memo"/>
 *     &lt;enumeration value="Date"/>
 *     &lt;enumeration value="Keyword"/>
 *     &lt;enumeration value="Decimal"/>
 *     &lt;enumeration value="DateTime"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DWFieldType", namespace = "http://dev.docuware.com/settings/interop")
@XmlEnum
public enum DWFieldType {

    @XmlEnumValue("Text")
    TEXT("Text"),
    @XmlEnumValue("Numeric")
    NUMERIC("Numeric"),
    @XmlEnumValue("Memo")
    MEMO("Memo"),
    @XmlEnumValue("Date")
    DATE("Date"),
    @XmlEnumValue("Keyword")
    KEYWORD("Keyword"),
    @XmlEnumValue("Decimal")
    DECIMAL("Decimal"),
    @XmlEnumValue("DateTime")
    DATE_TIME("DateTime");
    private final String value;

    DWFieldType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DWFieldType fromValue(String v) {
        for (DWFieldType c: DWFieldType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
