

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebFormListOptions", propOrder = {
    "webFormListOption"
})
public class WebFormListOptions  {

    @XmlElement(name = "WebFormListOption", required = true)
    protected List<String> webFormListOption;

    public List<String> getWebFormListOption() {
        if (webFormListOption == null) {
            webFormListOption = new ArrayList<String>();
        }
        return this.webFormListOption;
    }



}
