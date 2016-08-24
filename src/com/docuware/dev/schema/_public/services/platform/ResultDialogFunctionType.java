

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "ResultDialogFunctionType")
@XmlEnum
public enum ResultDialogFunctionType {


    @XmlEnumValue("StartNewRetrieval")
    START_NEW_RETRIEVAL("StartNewRetrieval"),

    @XmlEnumValue("LinkSearch")
    LINK_SEARCH("LinkSearch"),

    @XmlEnumValue("DisplayDocument")
    DISPLAY_DOCUMENT("DisplayDocument"),

    @XmlEnumValue("DisplayInfoBox")
    DISPLAY_INFO_BOX("DisplayInfoBox"),

    @XmlEnumValue("PrintSelectedDocument")
    PRINT_SELECTED_DOCUMENT("PrintSelectedDocument"),

    @XmlEnumValue("DeleteSelectedDocument")
    DELETE_SELECTED_DOCUMENT("DeleteSelectedDocument"),

    @XmlEnumValue("CopyToBasket")
    COPY_TO_BASKET("CopyToBasket"),

    @XmlEnumValue("Versions")
    VERSIONS("Versions"),

    @XmlEnumValue("AppendFromBasket")
    APPEND_FROM_BASKET("AppendFromBasket"),

    @XmlEnumValue("DownloadAsOriginal")
    DOWNLOAD_AS_ORIGINAL("DownloadAsOriginal"),

    @XmlEnumValue("DownloadAsPDFWithoutAnno")
    DOWNLOAD_AS_PDF_WITHOUT_ANNO("DownloadAsPDFWithoutAnno"),

    @XmlEnumValue("DownloadAsPDFWithAnno")
    DOWNLOAD_AS_PDF_WITH_ANNO("DownloadAsPDFWithAnno"),

    @XmlEnumValue("SendAsOriginal")
    SEND_AS_ORIGINAL("SendAsOriginal"),

    @XmlEnumValue("SendAsPDFWithoutAnno")
    SEND_AS_PDF_WITHOUT_ANNO("SendAsPDFWithoutAnno"),

    @XmlEnumValue("SendAsPDFWithAnno")
    SEND_AS_PDF_WITH_ANNO("SendAsPDFWithAnno"),

    @XmlEnumValue("SendAsHyperlink")
    SEND_AS_HYPERLINK("SendAsHyperlink"),

    @XmlEnumValue("SendResultList")
    SEND_RESULT_LIST("SendResultList"),

    @XmlEnumValue("EMailReply")
    E_MAIL_REPLY("EMailReply"),

    @XmlEnumValue("EMailReplyAll")
    E_MAIL_REPLY_ALL("EMailReplyAll"),

    @XmlEnumValue("EMailForward")
    E_MAIL_FORWARD("EMailForward"),

    @XmlEnumValue("ShowInSeparateViewer")
    SHOW_IN_SEPARATE_VIEWER("ShowInSeparateViewer"),

    @XmlEnumValue("EditDocument")
    EDIT_DOCUMENT("EditDocument"),

    @XmlEnumValue("ShowWorkflowHistory")
    SHOW_WORKFLOW_HISTORY("ShowWorkflowHistory"),

    @XmlEnumValue("ExportToCSV")
    EXPORT_TO_CSV("ExportToCSV"),

    @XmlEnumValue("CreateREQUEST")
    CREATE_REQUEST("CreateREQUEST"),

    @XmlEnumValue("ChangeIndexOfMultipleDocuments")
    CHANGE_INDEX_OF_MULTIPLE_DOCUMENTS("ChangeIndexOfMultipleDocuments"),

    @XmlEnumValue("CheckOutToBasket")
    CHECK_OUT_TO_BASKET("CheckOutToBasket"),

    @XmlEnumValue("CheckOutToFileSystem")
    CHECK_OUT_TO_FILE_SYSTEM("CheckOutToFileSystem"),

    @XmlEnumValue("ChangeDocumentStatus")
    CHANGE_DOCUMENT_STATUS("ChangeDocumentStatus"),

    @XmlEnumValue("ShowVersionHistory")
    SHOW_VERSION_HISTORY("ShowVersionHistory"),

    @XmlEnumValue("CopyIntoAnotherFileCabinet")
    COPY_INTO_ANOTHER_FILE_CABINET("CopyIntoAnotherFileCabinet");
    private final String value;

    ResultDialogFunctionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResultDialogFunctionType fromValue(String v) {
        for (ResultDialogFunctionType c: ResultDialogFunctionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
