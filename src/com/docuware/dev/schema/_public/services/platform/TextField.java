

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextField", propOrder = {
    "width"
})
@XmlSeeAlso({
    NumberField.class,
    MultiLineTextField.class
})
public class TextField
    extends WebFormField
 {

    @XmlElement(name = "Width")
    protected Integer width;

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer value) {
        this.width = value;
    }



}
