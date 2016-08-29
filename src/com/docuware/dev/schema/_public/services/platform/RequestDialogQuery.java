

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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestDialogQuery", propOrder = {
    "dialogTypes"
})
public class RequestDialogQuery  {

    @XmlElement(name = "DialogTypes")
    @XmlSchemaType(name = "string")
    protected List<DialogTypes> dialogTypes;

    /**Array of document types.*/
    public List<DialogTypes> getDialogTypes() {
        if (dialogTypes == null) {
            dialogTypes = new ArrayList<DialogTypes>();
        }
        return this.dialogTypes;
    }



}
