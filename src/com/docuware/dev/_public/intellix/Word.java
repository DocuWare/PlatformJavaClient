

package com.docuware.dev._public.intellix;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Word")
public class Word
    extends SimpleWord
 {

    @XmlAttribute(name = "bold")
    protected Boolean bold;
    @XmlAttribute(name = "fontSize")
    protected Integer fontSize;

    public Boolean isBold() {
        return bold;
    }

    public void setBold(Boolean value) {
        this.bold = value;
    }

    public Integer getFontSize() {
        return fontSize;
    }

    public void setFontSize(Integer value) {
        this.fontSize = value;
    }



}
