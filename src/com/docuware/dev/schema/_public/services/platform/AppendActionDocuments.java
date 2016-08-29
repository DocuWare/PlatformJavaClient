

package com.docuware.dev.schema._public.services.platform;

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
@XmlType(name = "AppendActionDocuments", propOrder = {
    "sourceCabinetId",
    "documents"
})
public class AppendActionDocuments  {

    @XmlElement(name = "SourceCabinetId", required = true)
    protected String sourceCabinetId;
    @XmlElement(name = "Documents", type = Integer.class)
    protected List<Integer> documents;

    /**Id of the source cabinet/basket*/
    public String getSourceCabinetId() {
        return sourceCabinetId;
    }

    /**Id of the source cabinet/basket*/
    public void setSourceCabinetId(String value) {
        this.sourceCabinetId = value;
    }

    /**Ids of the documents to be attached*/
    public List<Integer> getDocuments() {
        if (documents == null) {
            documents = new ArrayList<Integer>();
        }
        return this.documents;
    }



}
