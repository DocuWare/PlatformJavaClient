

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
@XmlType(name = "CheckOutActionParameters")
public class CheckOutActionParameters
    extends DocumentActionParameters
 {

    @XmlAttribute(name = "FileCabinetId", required = true)
    protected String fileCabinetId;

    /**Identity of the destination cabinet.*/
    public String getFileCabinetId() {
        return fileCabinetId;
    }

    /**Identity of the destination cabinet.*/
    public void setFileCabinetId(String value) {
        this.fileCabinetId = value;
    }



}
