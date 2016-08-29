

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
@XmlType(name = "BatchUpdateProcessData", propOrder = {
    "field",
    "storeDialogId",
    "batchSize",
    "breakOnError"
})
public class BatchUpdateProcessData  {

    @XmlElement(name = "Field")
    protected List<DocumentIndexField> field;
    @XmlElement(name = "StoreDialogId")
    protected String storeDialogId;
    @XmlElement(name = "BatchSize", required = true, type = Integer.class, nillable = true)
    protected Integer batchSize;
    @XmlElement(name = "BreakOnError", defaultValue = "true")
    protected boolean breakOnError;

    /**The fields which are updated.*/
    public List<DocumentIndexField> getField() {
        if (field == null) {
            field = new ArrayList<DocumentIndexField>();
        }
        return this.field;
    }

    /**The id of the dialog to be used to update fields which are hidden inside the store dialog.*/
    public String getStoreDialogId() {
        return storeDialogId;
    }

    /**The id of the dialog to be used to update fields which are hidden inside the store dialog.*/
    public void setStoreDialogId(String value) {
        this.storeDialogId = value;
    }

    /**The number of documents which are updated within a update chunk.*/
    public Integer getBatchSize() {
        return batchSize;
    }

    /**The number of documents which are updated within a update chunk.*/
    public void setBatchSize(Integer value) {
        this.batchSize = value;
    }

    /**If this attribute is set to true then the update is stopped on the first document which failes to be updated.*/
    public boolean isBreakOnError() {
        return breakOnError;
    }

    public void setBreakOnError(boolean value) {
        this.breakOnError = value;
    }



}
