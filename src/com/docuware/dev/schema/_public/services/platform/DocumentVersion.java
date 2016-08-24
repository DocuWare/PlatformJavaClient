

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
@XmlType(name = "DocumentVersion")
public class DocumentVersion  {

    @XmlAttribute(name = "Major", required = true)
    protected int major;
    @XmlAttribute(name = "Minor", required = true)
    protected int minor;

    /**Major version of the document.*/
    public int getMajor() {
        return major;
    }

    /**Major version of the document.*/
    public void setMajor(int value) {
        this.major = value;
    }

    /**Minor version of the document.*/
    public int getMinor() {
        return minor;
    }

    /**Minor version of the document.*/
    public void setMinor(int value) {
        this.minor = value;
    }



}
