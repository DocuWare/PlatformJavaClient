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
 * <p>Java-Klasse f�r ConfigurationRight.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ConfigurationRight">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SmartConnect"/>
 *     &lt;enumeration value="DocumentTray"/>
 *     &lt;enumeration value="EmailNotification"/>
 *     &lt;enumeration value="ConnectToMfp"/>
 *     &lt;enumeration value="OcrTemplate"/>
 *     &lt;enumeration value="ConnectToOutlook"/>
 *     &lt;enumeration value="Printer"/>
 *     &lt;enumeration value="Import"/>
 *     &lt;enumeration value="DocuWareRequest"/>
 *     &lt;enumeration value="IntelligentIndexing"/>
 *     &lt;enumeration value="CONNECTToMail"/>
 *     &lt;enumeration value="FileCabinets"/>
 *     &lt;enumeration value="Stamps"/>
 *     &lt;enumeration value="SelectLists"/>
 *     &lt;enumeration value="MaintainFixedSelectLists"/>
 *     &lt;enumeration value="UserManagement"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ConfigurationRight")
@XmlEnum
public enum ConfigurationRight {


    /**
     * Manage SmartConnect configurations
     * 
     */
    @XmlEnumValue("SmartConnect")
    SMART_CONNECT("SmartConnect"),

    /**
     * Manage Document Tray
     * 
     */
    @XmlEnumValue("DocumentTray")
    DOCUMENT_TRAY("DocumentTray"),

    /**
     * Manage E-Mail Alert
     * 
     */
    @XmlEnumValue("EmailNotification")
    EMAIL_NOTIFICATION("EmailNotification"),

    /**
     * Manage MFP Workflow
     * 
     */
    @XmlEnumValue("ConnectToMfp")
    CONNECT_TO_MFP("ConnectToMfp"),

    /**
     * Manage OCR template
     * 
     */
    @XmlEnumValue("OcrTemplate")
    OCR_TEMPLATE("OcrTemplate"),

    /**
     * Manage Connect to Outlook configurations
     * 
     */
    @XmlEnumValue("ConnectToOutlook")
    CONNECT_TO_OUTLOOK("ConnectToOutlook"),

    /**
     * Manage Printer configurations
     * 
     */
    @XmlEnumValue("Printer")
    PRINTER("Printer"),

    /**
     * Manage Web Import configurations
     * 
     */
    @XmlEnumValue("Import")
    IMPORT("Import"),

    /**
     * Manage REQUEST
     * 
     */
    @XmlEnumValue("DocuWareRequest")
    DOCU_WARE_REQUEST("DocuWareRequest"),

    /**
     * Manage Intelligent Indexing
     * 
     */
    @XmlEnumValue("IntelligentIndexing")
    INTELLIGENT_INDEXING("IntelligentIndexing"),

    /**
     * Manage Connect to Mail configurations
     * 
     */
    @XmlEnumValue("CONNECTToMail")
    CONNECT_TO_MAIL("CONNECTToMail"),

    /**
     * File cabinets
     * 
     */
    @XmlEnumValue("FileCabinets")
    FILE_CABINETS("FileCabinets"),

    /**
     * Manage stamps
     * 
     */
    @XmlEnumValue("Stamps")
    STAMPS("Stamps"),

    /**
     * Manage select lists
     * 
     */
    @XmlEnumValue("SelectLists")
    SELECT_LISTS("SelectLists"),

    /**
     * Maintain fixed select lists
     * 
     */
    @XmlEnumValue("MaintainFixedSelectLists")
    MAINTAIN_FIXED_SELECT_LISTS("MaintainFixedSelectLists"),

    /**
     * User Management
     * 
     */
    @XmlEnumValue("UserManagement")
    USER_MANAGEMENT("UserManagement");
    private final String value;

    ConfigurationRight(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ConfigurationRight fromValue(String v) {
        for (ConfigurationRight c: ConfigurationRight.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
