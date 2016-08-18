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
 * <p>Java-Klasse f�r DocumentAction.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentAction">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ReIntellix"/>
 *     &lt;enumeration value="Append"/>
 *     &lt;enumeration value="SetLatestVersion"/>
 *     &lt;enumeration value="UndoCheckOut"/>
 *     &lt;enumeration value="CheckOut"/>
 *     &lt;enumeration value="CheckIn"/>
 *     &lt;enumeration value="EnhanceImage"/>
 *     &lt;enumeration value="MergeAnnotations"/>
 *     &lt;enumeration value="RotatePage"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DocumentAction")
@XmlEnum
public enum DocumentAction {


    /**
     * Resend textshots to Intellix
     * 
     */
    @XmlEnumValue("ReIntellix")
    RE_INTELLIX("ReIntellix"),

    /**
     * Append documents form other cabinet to document
     * 
     */
    @XmlEnumValue("Append")
    APPEND("Append"),

    /**
     * Set document as latest version
     * 
     */
    @XmlEnumValue("SetLatestVersion")
    SET_LATEST_VERSION("SetLatestVersion"),

    /**
     * Undo check out of the document
     * 
     */
    @XmlEnumValue("UndoCheckOut")
    UNDO_CHECK_OUT("UndoCheckOut"),

    /**
     * Check out document to specific cabinet. Accept CheckOutActionParameters
     * 
     */
    @XmlEnumValue("CheckOut")
    CHECK_OUT("CheckOut"),

    /**
     * Check in document to the original cabinet. Accept CheckInActionParameters
     * 
     */
    @XmlEnumValue("CheckIn")
    CHECK_IN("CheckIn"),

    /**
     * Enchance section image by applying deskew and rotate. Accept EnhanceImageParameters
     * 
     */
    @XmlEnumValue("EnhanceImage")
    ENHANCE_IMAGE("EnhanceImage"),

    /**
     * Merge annotations into section image. Aplicable only for PDFs. Accept MergeAnnotationsParameters
     * 
     */
    @XmlEnumValue("MergeAnnotations")
    MERGE_ANNOTATIONS("MergeAnnotations"),

    /**
     * Rotate section page (image + annotations). Aplicable only for raster files and PDFs. Accept RotatePageParameters
     * 
     */
    @XmlEnumValue("RotatePage")
    ROTATE_PAGE("RotatePage");
    private final String value;

    DocumentAction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DocumentAction fromValue(String v) {
        for (DocumentAction c: DocumentAction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
