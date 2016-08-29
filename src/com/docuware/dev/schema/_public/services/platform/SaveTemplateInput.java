

package com.docuware.dev.schema._public.services.platform;

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
@XmlType(name = "SaveTemplateInput", propOrder = {
    "templates"
})
public class SaveTemplateInput  {

    @XmlElement(name = "Templates", required = true)
    protected FormTemplates templates;

    public FormTemplates getTemplates() {
        return templates;
    }

    public void setTemplates(FormTemplates value) {
        this.templates = value;
    }



}
