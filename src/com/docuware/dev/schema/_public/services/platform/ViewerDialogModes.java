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
 * <p>Java-Klasse f�r ViewerDialogModes.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ViewerDialogModes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EditMode"/>
 *     &lt;enumeration value="AdHocEditMode"/>
 *     &lt;enumeration value="ReadOnly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ViewerDialogModes")
@XmlEnum
public enum ViewerDialogModes {


    /**
     * Document is opened for editing and is locked for other users until it's closed.
     * 
     */
    @XmlEnumValue("EditMode")
    EDIT_MODE("EditMode"),

    /**
     * Document is opened for editing and is locked only while editing.
     * 
     */
    @XmlEnumValue("AdHocEditMode")
    AD_HOC_EDIT_MODE("AdHocEditMode"),

    /**
     * Document is opened as read-only.
     * 
     */
    @XmlEnumValue("ReadOnly")
    READ_ONLY("ReadOnly");
    private final String value;

    ViewerDialogModes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ViewerDialogModes fromValue(String v) {
        for (ViewerDialogModes c: ViewerDialogModes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
