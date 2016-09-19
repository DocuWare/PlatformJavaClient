

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
@XmlType(name = "SignatureField", propOrder = {
    "width",
    "height",
    "color"
})
public class SignatureField
    extends WebFormField
 {

    @XmlElement(name = "Width")
    protected int width;
    @XmlElement(name = "Height")
    protected int height;
    @XmlElement(name = "Color", required = true)
    protected String color;

    public int getWidth() {
        return width;
    }

    public void setWidth(int value) {
        this.width = value;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int value) {
        this.height = value;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String value) {
        this.color = value;
    }



}
