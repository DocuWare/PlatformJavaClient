

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


@XmlType(name = "CFSTableNames")
@XmlEnum
public enum CFSTableNames {

    @XmlEnumValue("Environment_Server")
    ENVIRONMENT_SERVER("Environment_Server"),
    @XmlEnumValue("Environment_Client")
    ENVIRONMENT_CLIENT("Environment_Client"),
    @XmlEnumValue("Environment_DocuWare_General")
    ENVIRONMENT_DOCU_WARE_GENERAL("Environment_DocuWare_General"),
    @XmlEnumValue("DocuWare_FileCabinet")
    DOCU_WARE_FILE_CABINET("DocuWare_FileCabinet"),
    @XmlEnumValue("DocuWare_DocumentTray")
    DOCU_WARE_DOCUMENT_TRAY("DocuWare_DocumentTray"),
    @XmlEnumValue("DocuWare_User")
    DOCU_WARE_USER("DocuWare_User"),
    @XmlEnumValue("DocuWare_FileCabinet_Dialog_Search")
    DOCU_WARE_FILE_CABINET_DIALOG_SEARCH("DocuWare_FileCabinet_Dialog_Search"),
    @XmlEnumValue("DocuWare_FileCabinet_Dialog_Store")
    DOCU_WARE_FILE_CABINET_DIALOG_STORE("DocuWare_FileCabinet_Dialog_Store"),
    @XmlEnumValue("DocuWare_List")
    DOCU_WARE_LIST("DocuWare_List"),
    @XmlEnumValue("DocuWare_FileCabinet_Dialog_Tasklist")
    DOCU_WARE_FILE_CABINET_DIALOG_TASKLIST("DocuWare_FileCabinet_Dialog_Tasklist"),
    @XmlEnumValue("Installation_App")
    INSTALLATION_APP("Installation_App");
    private final String value;

    CFSTableNames(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CFSTableNames fromValue(String v) {
        for (CFSTableNames c: CFSTableNames.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
