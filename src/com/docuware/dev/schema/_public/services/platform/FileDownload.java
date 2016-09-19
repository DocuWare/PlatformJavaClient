

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileDownload")
public class FileDownload
    extends FileDownloadBase
 {

    @XmlAttribute(name = "TargetFileType")
    protected FileDownloadType targetFileType;
    @XmlAttribute(name = "DirectDownload")
    protected Boolean directDownload;
    @XmlAttribute(name = "AutoPrint")
    protected Boolean autoPrint;

    /**Specifies the target format (target file type) of the downloaded file.*/
    public FileDownloadType getTargetFileType() {
        if (targetFileType == null) {
            return FileDownloadType.AUTO;
        } else {
            return targetFileType;
        }
    }

    /**Specifies the target format (target file type) of the downloaded file.*/
    public void setTargetFileType(FileDownloadType value) {
        this.targetFileType = value;
    }

    /**If this flag is true then the file is directly downloaded, even if the browser provides a plugin for this file.*/
    public boolean isDirectDownload() {
        if (directDownload == null) {
            return false;
        } else {
            return directDownload;
        }
    }

    /**If this flag is true then the file is directly downloaded, even if the browser provides a plugin for this file.*/
    public void setDirectDownload(Boolean value) {
        this.directDownload = value;
    }

    /**If this flag is true then the PDF will have a script which opens the print dialog immediately.*/
    public boolean isAutoPrint() {
        if (autoPrint == null) {
            return false;
        } else {
            return autoPrint;
        }
    }

    /**If this flag is true then the PDF will have a script which opens the print dialog immediately.*/
    public void setAutoPrint(Boolean value) {
        this.autoPrint = value;
    }



}
