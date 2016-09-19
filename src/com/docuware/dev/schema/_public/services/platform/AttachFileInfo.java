

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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachFileInfo", propOrder = {
    "name",
    "formattedSize",
    "source"
})
public class AttachFileInfo  {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "FormattedSize", required = true)
    protected String formattedSize;
    @XmlElement(name = "Source", required = true)
    @XmlSchemaType(name = "string")
    protected FileSource source;

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getFormattedSize() {
        return formattedSize;
    }

    public void setFormattedSize(String value) {
        this.formattedSize = value;
    }

    public FileSource getSource() {
        return source;
    }

    public void setSource(FileSource value) {
        this.source = value;
    }



}
