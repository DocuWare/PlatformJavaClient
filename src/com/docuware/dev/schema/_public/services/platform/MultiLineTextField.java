

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
@XmlType(name = "MultiLineTextField", propOrder = {
    "height"
})
public class MultiLineTextField
    extends TextField
 {

    @XmlElement(name = "Height")
    protected int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int value) {
        this.height = value;
    }



}
