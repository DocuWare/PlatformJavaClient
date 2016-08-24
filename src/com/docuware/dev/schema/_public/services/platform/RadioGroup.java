

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
@XmlType(name = "RadioGroup", propOrder = {
    "options"
})
public class RadioGroup
    extends WebFormField
 {

    @XmlElement(name = "Options", required = true)
    protected WebFormOptions options;

    public WebFormOptions getOptions() {
        return options;
    }

    public void setOptions(WebFormOptions value) {
        this.options = value;
    }



}
