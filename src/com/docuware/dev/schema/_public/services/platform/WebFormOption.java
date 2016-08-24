

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebFormOption")
public class WebFormOption  {

    @XmlAttribute(name = "Label")
    protected String label;
    @XmlAttribute(name = "Checked")
    protected Boolean checked;

    public String getLabel() {
        return label;
    }

    public void setLabel(String value) {
        this.label = value;
    }

    public Boolean isChecked() {
        return checked;
    }

    public void setChecked(Boolean value) {
        this.checked = value;
    }



}
