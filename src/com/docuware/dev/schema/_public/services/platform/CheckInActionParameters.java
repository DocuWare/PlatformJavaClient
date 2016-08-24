

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckInActionParameters", propOrder = {
    "documentVersion"
})
public class CheckInActionParameters
    extends DocumentActionParameters
 {

    @XmlElement(name = "DocumentVersion", required = true)
    protected DocumentVersion documentVersion;
    @XmlAttribute(name = "Comments")
    protected String comments;

    /**Check in version of the document*/
    public DocumentVersion getDocumentVersion() {
        return documentVersion;
    }

    /**Check in version of the document*/
    public void setDocumentVersion(DocumentVersion value) {
        this.documentVersion = value;
    }

    /**Minor version of the document.*/
    public String getComments() {
        return comments;
    }

    /**Minor version of the document.*/
    public void setComments(String value) {
        this.comments = value;
    }



}
