

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "ConfigurationRight")
@XmlEnum
public enum ConfigurationRight {


    @XmlEnumValue("SmartConnect")
    SMART_CONNECT("SmartConnect"),

    @XmlEnumValue("DocumentTray")
    DOCUMENT_TRAY("DocumentTray"),

    @XmlEnumValue("EmailNotification")
    EMAIL_NOTIFICATION("EmailNotification"),

    @XmlEnumValue("ConnectToMfp")
    CONNECT_TO_MFP("ConnectToMfp"),

    @XmlEnumValue("OcrTemplate")
    OCR_TEMPLATE("OcrTemplate"),

    @XmlEnumValue("ConnectToOutlook")
    CONNECT_TO_OUTLOOK("ConnectToOutlook"),

    @XmlEnumValue("Printer")
    PRINTER("Printer"),

    @XmlEnumValue("Import")
    IMPORT("Import"),

    @XmlEnumValue("DocuWareRequest")
    DOCU_WARE_REQUEST("DocuWareRequest"),

    @XmlEnumValue("IntelligentIndexing")
    INTELLIGENT_INDEXING("IntelligentIndexing"),

    @XmlEnumValue("CONNECTToMail")
    CONNECT_TO_MAIL("CONNECTToMail"),

    @XmlEnumValue("FileCabinets")
    FILE_CABINETS("FileCabinets"),

    @XmlEnumValue("Stamps")
    STAMPS("Stamps"),

    @XmlEnumValue("SelectLists")
    SELECT_LISTS("SelectLists"),

    @XmlEnumValue("MaintainFixedSelectLists")
    MAINTAIN_FIXED_SELECT_LISTS("MaintainFixedSelectLists"),

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
