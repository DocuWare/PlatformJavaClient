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
 * <p>Java-Klasse f�r CFSTableNames.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="CFSTableNames">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}Name">
 *     &lt;enumeration value="Environment_Server"/>
 *     &lt;enumeration value="Environment_Client"/>
 *     &lt;enumeration value="Environment_DocuWare_General"/>
 *     &lt;enumeration value="DocuWare_FileCabinet"/>
 *     &lt;enumeration value="DocuWare_DocumentTray"/>
 *     &lt;enumeration value="DocuWare_User"/>
 *     &lt;enumeration value="DocuWare_FileCabinet_Dialog_Search"/>
 *     &lt;enumeration value="DocuWare_FileCabinet_Dialog_Store"/>
 *     &lt;enumeration value="DocuWare_List"/>
 *     &lt;enumeration value="DocuWare_FileCabinet_Dialog_Tasklist"/>
 *     &lt;enumeration value="Installation_App"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
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
