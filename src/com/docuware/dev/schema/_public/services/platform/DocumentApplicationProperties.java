

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
@XmlType(name = "DocumentApplicationProperties", propOrder = {
    "documentApplicationProperty"
})
public class DocumentApplicationProperties  {

    @XmlElement(name = "DocumentApplicationProperty")
    protected List<DocumentApplicationProperty> documentApplicationProperty;

    /**Define application specific properties. Different applications store specific application here*/
    public List<DocumentApplicationProperty> getDocumentApplicationProperty() {
        if (documentApplicationProperty == null) {
            documentApplicationProperty = new ArrayList<DocumentApplicationProperty>();
        }
        return this.documentApplicationProperty;
    }



}
