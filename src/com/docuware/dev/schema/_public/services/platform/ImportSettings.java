

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;
import com.sun.jersey.multipart.FormDataBodyPart;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImportSettings")
public class ImportSettings  implements IStringContent {

    @XmlAttribute(name = "PreserveSystemFields")
    protected Boolean preserveSystemFields;

    /**Gets or sets a value indicating whether the document' system fields to be replaced.*/
    public boolean isPreserveSystemFields() {
        if (preserveSystemFields == null) {
            return false;
        } else {
            return preserveSystemFields;
        }
    }

    public void setPreserveSystemFields(Boolean value) {
        this.preserveSystemFields = value;
    }

    @Extension
    public FormDataBodyPart getStringContent() {
	return FileCabinetExtensionsBase.toStringContent(this);
    }



}
