

package com.docuware.dev.schema._public.services.platform;

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
@XmlType(name = "WebFormControls", propOrder = {
    "webFormControl"
})
public class WebFormControls  {

    @XmlElement(name = "WebFormControl", required = true)
    protected List<WebFormControl> webFormControl;

    /**ArrayList is required for the XML-Marshalling */
    public void setWebFormControl(ArrayList<WebFormControl> value) {
        webFormControl=value;
    }

    public List<WebFormControl> getWebFormControl() {
        if (webFormControl == null) {
            webFormControl = new ArrayList<WebFormControl>();
        }
        return this.webFormControl;
    }



}
