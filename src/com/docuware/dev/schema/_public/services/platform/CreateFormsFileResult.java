

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
@XmlType(name = "CreateFormsFileResult")
public class CreateFormsFileResult  {

    @XmlAttribute(name = "FilePath", required = true)
    protected String filePath;
    @XmlAttribute(name = "ContentType", required = true)
    protected String contentType;

    /**File path.*/
    public String getFilePath() {
        return filePath;
    }

    /**File path.*/
    public void setFilePath(String value) {
        this.filePath = value;
    }

    /**the content type*/
    public String getContentType() {
        return contentType;
    }

    /**the content type*/
    public void setContentType(String value) {
        this.contentType = value;
    }



}
