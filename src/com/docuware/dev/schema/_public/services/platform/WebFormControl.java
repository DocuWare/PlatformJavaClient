

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebFormControl", propOrder = {
    "id",
    "label"
})
@XmlSeeAlso({
    WebFormField.class
})
public abstract class WebFormControl  {

    @XmlElement(name = "ID", required = true)
    protected String id;
    @XmlElement(name = "Label", required = true)
    protected String label;

    public String getID() {
        return id;
    }

    public void setID(String value) {
        this.id = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String value) {
        this.label = value;
    }



}
