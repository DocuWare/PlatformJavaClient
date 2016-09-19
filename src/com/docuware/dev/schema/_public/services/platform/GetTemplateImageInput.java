

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
@XmlType(name = "GetTemplateImageInput")
public class GetTemplateImageInput  {

    @XmlAttribute(name = "TemplateGUID", required = true)
    protected String templateGUID;
    @XmlAttribute(name = "FileName", required = true)
    protected String fileName;
    @XmlAttribute(name = "PageNumber", required = true)
    protected int pageNumber;

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

    /**Page Number*/
    public int getPageNumber() {
        return pageNumber;
    }

    /**Page Number*/
    public void setPageNumber(int value) {
        this.pageNumber = value;
    }



}
