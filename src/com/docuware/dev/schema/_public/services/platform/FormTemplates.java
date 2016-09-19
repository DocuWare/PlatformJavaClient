

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormTemplates", propOrder = {
    "template"
})
public class FormTemplates  {

    @XmlElement(name = "Template", required = true)
    protected List<FormTemplate> template;

    /**ArrayList is required for the XML-Marshalling */
    public void setTemplate(ArrayList<FormTemplate> value) {
        template=value;
    }

    public List<FormTemplate> getTemplate() {
        if (template == null) {
            template = new ArrayList<FormTemplate>();
        }
        return this.template;
    }



}
