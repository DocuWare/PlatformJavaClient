

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
@XmlType(name = "DocumentApplicationProperty")
public class DocumentApplicationProperty  {

    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "Value")
    protected String value;

    /**Name of the property.*/
    public String getName() {
        return name;
    }

    /**Name of the property.*/
    public void setName(String value) {
        this.name = value;
    }

    /**Value of the property*/
    public String getValue() {
        return value;
    }

    /**Value of the property*/
    public void setValue(String value) {
        this.value = value;
    }



}
