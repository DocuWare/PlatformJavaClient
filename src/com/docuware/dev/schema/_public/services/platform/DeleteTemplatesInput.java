

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteTemplatesInput", propOrder = {
    "templateGUIDS"
})
public class DeleteTemplatesInput  {

    @XmlElement(name = "TemplateGUIDS", required = true)
    protected TemplateGUIDS templateGUIDS;

    public TemplateGUIDS getTemplateGUIDS() {
        return templateGUIDS;
    }

    public void setTemplateGUIDS(TemplateGUIDS value) {
        this.templateGUIDS = value;
    }



}
