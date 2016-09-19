

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
@XmlType(name = "DropDownList", propOrder = {
    "options"
})
public class DropDownList
    extends WebFormField
 {

    @XmlElement(name = "Options", required = true)
    protected WebFormListOptions options;

    public WebFormListOptions getOptions() {
        return options;
    }

    public void setOptions(WebFormListOptions value) {
        this.options = value;
    }



}
