

package com.docuware.dev.settings.interop;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "DWProductTypes", namespace = "http://dev.docuware.com/settings/interop")
@XmlEnum
public enum DWProductTypes {


    @XmlEnumValue("DocuWareClient")
    DOCU_WARE_CLIENT("DocuWareClient"),

    @XmlEnumValue("DocuWareSite")
    DOCU_WARE_SITE("DocuWareSite"),

    @XmlEnumValue("CONNECTToRicoh")
    CONNECT_TO_RICOH("CONNECTToRicoh"),

    @XmlEnumValue("CONNECTToToshiba")
    CONNECT_TO_TOSHIBA("CONNECTToToshiba"),

    @XmlEnumValue("CONNECTToXerox")
    CONNECT_TO_XEROX("CONNECTToXerox"),

    @XmlEnumValue("CONNECTToSharp")
    CONNECT_TO_SHARP("CONNECTToSharp"),

    @XmlEnumValue("CONNECTToMOSS")
    CONNECT_TO_MOSS("CONNECTToMOSS"),

    @XmlEnumValue("SmartConnect")
    SMART_CONNECT("SmartConnect"),

    @XmlEnumValue("WebClient")
    WEB_CLIENT("WebClient"),

    @XmlEnumValue("ROWebClient")
    RO_WEB_CLIENT("ROWebClient"),

    @XmlEnumValue("TaskList")
    TASK_LIST("TaskList"),

    @XmlEnumValue("EmailAlert")
    EMAIL_ALERT("EmailAlert"),

    @XmlEnumValue("CONNECTToOutlook")
    CONNECT_TO_OUTLOOK("CONNECTToOutlook"),

    @XmlEnumValue("Mobile")
    MOBILE("Mobile"),

    @XmlEnumValue("CONNECTToMail")
    CONNECT_TO_MAIL("CONNECTToMail"),

    @XmlEnumValue("SettingsServer")
    SETTINGS_SERVER("SettingsServer"),

    @XmlEnumValue("PlatformService")
    PLATFORM_SERVICE("PlatformService"),

    @XmlEnumValue("WorkflowManager")
    WORKFLOW_MANAGER("WorkflowManager"),

    @XmlEnumValue("Import")
    IMPORT("Import"),

    @XmlEnumValue("DWRequest")
    DW_REQUEST("DWRequest"),

    @XmlEnumValue("CONNECTToOKI")
    CONNECT_TO_OKI("CONNECTToOKI"),

    @XmlEnumValue("CONNECTToRicohOnline")
    CONNECT_TO_RICOH_ONLINE("CONNECTToRicohOnline"),

    @XmlEnumValue("BarcodeAndForms")
    BARCODE_AND_FORMS("BarcodeAndForms"),

    @XmlEnumValue("WindowsExplorerClient")
    WINDOWS_EXPLORER_CLIENT("WindowsExplorerClient"),

    @XmlEnumValue("Administration")
    ADMINISTRATION("Administration"),

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),

    @XmlEnumValue("JobServer")
    JOB_SERVER("JobServer"),

    @XmlEnumValue("Forms")
    FORMS("Forms"),

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
