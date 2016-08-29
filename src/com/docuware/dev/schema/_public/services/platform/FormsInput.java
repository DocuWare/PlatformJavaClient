

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
@XmlType(name = "FormsInput", propOrder = {
    "formInfo",
    "html"
})
public class FormsInput  {

    @XmlElement(name = "FormInfo", required = true)
    protected FormInfo formInfo;
    @XmlElement(name = "HTML", required = true)
    protected String html;

    /**Form information with configuration id and form fields with user input*/
    public FormInfo getFormInfo() {
        return formInfo;
    }

    /**Form information with configuration id and form fields with user input*/
    public void setFormInfo(FormInfo value) {
        this.formInfo = value;
    }

    /**String representing the HTML of the form*/
    public String getHTML() {
        return html;
    }

    /**String representing the HTML of the form*/
    public void setHTML(String value) {
        this.html = value;
    }



}
