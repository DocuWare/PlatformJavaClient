

package com.docuware.dev.schema._public.services;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeReference")
public class TypeReference  {

    @XmlAttribute(name = "TypeName", required = true)
    protected String typeName;
    @XmlAttribute(name = "Uri")
    @XmlSchemaType(name = "anyURI")
    protected String uri;

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String value) {
        this.typeName = value;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String value) {
        this.uri = value;
    }



}
