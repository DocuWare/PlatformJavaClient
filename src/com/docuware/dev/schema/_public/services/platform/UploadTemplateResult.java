

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UploadTemplateResult")
public class UploadTemplateResult  {

    @XmlAttribute(name = "TemplateGUID", required = true)
    protected String templateGUID;
    @XmlAttribute(name = "TotalNumberOfPages", required = true)
    protected int totalNumberOfPages;

    /**GUID for the uploaded template*/
    public String getTemplateGUID() {
        return templateGUID;
    }

    /**GUID for the uploaded template*/
    public void setTemplateGUID(String value) {
        this.templateGUID = value;
    }

    /**Total Page Count*/
    public int getTotalNumberOfPages() {
        return totalNumberOfPages;
    }

    /**Total Page Count*/
    public void setTotalNumberOfPages(int value) {
        this.totalNumberOfPages = value;
    }



}
