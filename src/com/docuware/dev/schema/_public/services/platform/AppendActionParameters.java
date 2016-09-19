

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppendActionParameters", propOrder = {
    "removeSourceDocuments",
    "documentsInFront",
    "documentsAtBack"
})
public class AppendActionParameters
    extends DocumentActionParameters
 {

    @XmlElement(name = "RemoveSourceDocuments", defaultValue = "true")
    protected boolean removeSourceDocuments;
    @XmlElement(name = "DocumentsInFront")
    protected List<AppendActionDocuments> documentsInFront;
    @XmlElement(name = "DocumentsAtBack")
    protected List<AppendActionDocuments> documentsAtBack;

    /**Indicates whether to delete the documents from source cabinet*/
    public boolean isRemoveSourceDocuments() {
        return removeSourceDocuments;
    }

    /**Indicates whether to delete the documents from source cabinet*/
    public void setRemoveSourceDocuments(boolean value) {
        this.removeSourceDocuments = value;
    }

    /**ArrayList is required for the XML-Marshalling */
    public void setDocumentsInFront(ArrayList<AppendActionDocuments> value) {
        documentsInFront=value;
    }

    /**Info for the documents to be attached before the target document*/
    public List<AppendActionDocuments> getDocumentsInFront() {
        if (documentsInFront == null) {
            documentsInFront = new ArrayList<AppendActionDocuments>();
        }
        return this.documentsInFront;
    }

    /**ArrayList is required for the XML-Marshalling */
    public void setDocumentsAtBack(ArrayList<AppendActionDocuments> value) {
        documentsAtBack=value;
    }

    /**Info for the documents to be attached after the target document*/
    public List<AppendActionDocuments> getDocumentsAtBack() {
        if (documentsAtBack == null) {
            documentsAtBack = new ArrayList<AppendActionDocuments>();
        }
        return this.documentsAtBack;
    }



}
