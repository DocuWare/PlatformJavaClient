

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormTemplate", propOrder = {
    "templateGUID",
    "fileName",
    "zones"
})
public class FormTemplate  {

    @XmlElement(name = "TemplateGUID", required = true)
    protected String templateGUID;
    @XmlElement(name = "FileName", required = true)
    protected String fileName;
    @XmlElement(name = "Zones", required = true)
    protected Zones zones;

    public String getTemplateGUID() {
        return templateGUID;
    }

    public void setTemplateGUID(String value) {
        this.templateGUID = value;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String value) {
        this.fileName = value;
    }

    public Zones getZones() {
        return zones;
    }

    public void setZones(Zones value) {
        this.zones = value;
    }



}
