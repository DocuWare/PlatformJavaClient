

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
@XmlType(name = "BatchUpdateProcess", propOrder = {
    "source",
    "data"
})
public class BatchUpdateProcess  {

    @XmlElement(name = "Source", required = true)
    protected BatchUpdateSource source;
    @XmlElement(name = "Data", required = true)
    protected BatchUpdateProcessData data;

    /**The source of the items to be updated.*/
    public BatchUpdateSource getSource() {
        return source;
    }

    /**The source of the items to be updated.*/
    public void setSource(BatchUpdateSource value) {
        this.source = value;
    }

    /**The data which is used to specifiy the updated data and update process control.*/
    public BatchUpdateProcessData getData() {
        return data;
    }

    /**The data which is used to specifiy the updated data and update process control.*/
    public void setData(BatchUpdateProcessData value) {
        this.data = value;
    }



}
