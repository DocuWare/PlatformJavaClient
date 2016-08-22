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
 * <p>Java-Klasse f�r FileDownloadType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="FileDownloadType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Auto"/>
 *     &lt;enumeration value="Zip"/>
 *     &lt;enumeration value="PDF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FileDownloadType")
@XmlEnum
public enum FileDownloadType {


    /**
     * 
     *             The type of the downloaded file determined by the server automatically.
     *             In case of a single file this is directly downloaded, otherwise a ZIP file is created.
     *           
     * 
     */
    @XmlEnumValue("Auto")
    AUTO("Auto"),

    /**
     * 
     *             The files are always downloaded as ZIP file.
     *           
     * 
     */
    @XmlEnumValue("Zip")
    ZIP("Zip"),

    /**
     * 
     *             The files are always downloaded as PDF file. If more than one document is downloaded then every document is converted to PDF and the PDF files are packed in a ZIP file.
     *           
     * 
     */
    PDF("PDF");
    private final String value;

    FileDownloadType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FileDownloadType fromValue(String v) {
        for (FileDownloadType c: FileDownloadType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
