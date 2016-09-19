

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
@XmlType(name = "UploadTemplateInput")
public class UploadTemplateInput  {

    @XmlAttribute(name = "TemplateGUID", required = true)
    protected String templateGUID;
    @XmlAttribute(name = "FileName", required = true)
    protected String fileName;
    @XmlAttribute(name = "FileData", required = true)
    protected String fileData;

    /**GUID for the uploaded template*/
    public String getTemplateGUID() {
        return templateGUID;
    }

    /**GUID for the uploaded template*/
    public void setTemplateGUID(String value) {
        this.templateGUID = value;
    }

    /**File Name*/
    public String getFileName() {
        return fileName;
    }

    /**File Name*/
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**Binary file data*/
    public String getFileData() {
        return fileData;
    }

    /**Binary file data*/
    public void setFileData(String value) {
        this.fileData = value;
    }



}
