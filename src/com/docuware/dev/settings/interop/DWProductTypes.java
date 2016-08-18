//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.08.18 um 09:47:39 AM CEST 
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
 * <p>Java-Klasse f�r DWProductTypes.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="DWProductTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DocuWareClient"/>
 *     &lt;enumeration value="DocuWareSite"/>
 *     &lt;enumeration value="CONNECTToRicoh"/>
 *     &lt;enumeration value="CONNECTToToshiba"/>
 *     &lt;enumeration value="CONNECTToXerox"/>
 *     &lt;enumeration value="CONNECTToSharp"/>
 *     &lt;enumeration value="CONNECTToMOSS"/>
 *     &lt;enumeration value="SmartConnect"/>
 *     &lt;enumeration value="WebClient"/>
 *     &lt;enumeration value="ROWebClient"/>
 *     &lt;enumeration value="TaskList"/>
 *     &lt;enumeration value="EmailAlert"/>
 *     &lt;enumeration value="CONNECTToOutlook"/>
 *     &lt;enumeration value="Mobile"/>
 *     &lt;enumeration value="EmailArchivingServer"/>
 *     &lt;enumeration value="SettingsServer"/>
 *     &lt;enumeration value="PlatformService"/>
 *     &lt;enumeration value="WorkflowManager"/>
 *     &lt;enumeration value="Import"/>
 *     &lt;enumeration value="DWRequest"/>
 *     &lt;enumeration value="CONNECTToOKI"/>
 *     &lt;enumeration value="CONNECTToRicohOnline"/>
 *     &lt;enumeration value="BarcodeAndForms"/>
 *     &lt;enumeration value="WindowsExplorerClient"/>
 *     &lt;enumeration value="Administration"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="JobServer"/>
 *     &lt;enumeration value="Forms"/>
 *     &lt;enumeration value="PublicForms"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DWProductTypes", namespace = "http://dev.docuware.com/settings/interop")
@XmlEnum
public enum DWProductTypes {


    /**
     * DocuWare Windows Client
     * 
     */
    @XmlEnumValue("DocuWareClient")
    DOCU_WARE_CLIENT("DocuWareClient"),

    /**
     * DocuWare Site Windows Client
     * 
     */
    @XmlEnumValue("DocuWareSite")
    DOCU_WARE_SITE("DocuWareSite"),

    /**
     * Connect to Ricoh
     * 
     */
    @XmlEnumValue("CONNECTToRicoh")
    CONNECT_TO_RICOH("CONNECTToRicoh"),

    /**
     * Connect To Toshiba
     * 
     */
    @XmlEnumValue("CONNECTToToshiba")
    CONNECT_TO_TOSHIBA("CONNECTToToshiba"),

    /**
     * Connect to Xerox
     * 
     */
    @XmlEnumValue("CONNECTToXerox")
    CONNECT_TO_XEROX("CONNECTToXerox"),

    /**
     * Connect to Sharp
     * 
     */
    @XmlEnumValue("CONNECTToSharp")
    CONNECT_TO_SHARP("CONNECTToSharp"),

    /**
     * Connect to SharePoint
     * 
     */
    @XmlEnumValue("CONNECTToMOSS")
    CONNECT_TO_MOSS("CONNECTToMOSS"),

    /**
     * Smart Connect
     * 
     */
    @XmlEnumValue("SmartConnect")
    SMART_CONNECT("SmartConnect"),

    /**
     * DocuWare Web Client
     * 
     */
    @XmlEnumValue("WebClient")
    WEB_CLIENT("WebClient"),

    /**
     * Read only DocuWare Web Client
     * 
     */
    @XmlEnumValue("ROWebClient")
    RO_WEB_CLIENT("ROWebClient"),

    /**
     * Task Lists
     * 
     */
    @XmlEnumValue("TaskList")
    TASK_LIST("TaskList"),

    /**
     * Email Alert
     * 
     */
    @XmlEnumValue("EmailAlert")
    EMAIL_ALERT("EmailAlert"),

    /**
     * Connect to Outlook
     * 
     */
    @XmlEnumValue("CONNECTToOutlook")
    CONNECT_TO_OUTLOOK("CONNECTToOutlook"),

    /**
     * DocuWare mobile device
     * 
     */
    @XmlEnumValue("Mobile")
    MOBILE("Mobile"),

    /**
     * EMail archiving server
     * 
     */
    @XmlEnumValue("EmailArchivingServer")
    EMAIL_ARCHIVING_SERVER("EmailArchivingServer"),

    /**
     * Settings server
     * 
     */
    @XmlEnumValue("SettingsServer")
    SETTINGS_SERVER("SettingsServer"),

    /**
     * Platform service
     * 
     */
    @XmlEnumValue("PlatformService")
    PLATFORM_SERVICE("PlatformService"),

    /**
     * Workflow Manager
     * 
     */
    @XmlEnumValue("WorkflowManager")
    WORKFLOW_MANAGER("WorkflowManager"),

    /**
     * Import
     * 
     */
    @XmlEnumValue("Import")
    IMPORT("Import"),

    /**
     * DocuWare Request
     * 
     */
    @XmlEnumValue("DWRequest")
    DW_REQUEST("DWRequest"),

    /**
     * Connect to OKI
     * 
     */
    @XmlEnumValue("CONNECTToOKI")
    CONNECT_TO_OKI("CONNECTToOKI"),

    /**
     * Connect to Ricoh Online
     * 
     */
    @XmlEnumValue("CONNECTToRicohOnline")
    CONNECT_TO_RICOH_ONLINE("CONNECTToRicohOnline"),

    /**
     * Barcode and Forms
     * 
     */
    @XmlEnumValue("BarcodeAndForms")
    BARCODE_AND_FORMS("BarcodeAndForms"),

    /**
     * Windows Explorer Client
     * 
     */
    @XmlEnumValue("WindowsExplorerClient")
    WINDOWS_EXPLORER_CLIENT("WindowsExplorerClient"),

    /**
     * Administration only client. No content rights
     * 
     */
    @XmlEnumValue("Administration")
    ADMINISTRATION("Administration"),

    /**
     * Unknown product type
     * 
     */
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    /**
     * JobServer
     * 
     */
    @XmlEnumValue("JobServer")
    JOB_SERVER("JobServer"),

    /**
     * Forms
     * 
     */
    @XmlEnumValue("Forms")
    FORMS("Forms"),

    /**
     * Public Forms
     * 
     */
    @XmlEnumValue("PublicForms")
    PUBLIC_FORMS("PublicForms");
    private final String value;

    DWProductTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DWProductTypes fromValue(String v) {
        for (DWProductTypes c: DWProductTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
