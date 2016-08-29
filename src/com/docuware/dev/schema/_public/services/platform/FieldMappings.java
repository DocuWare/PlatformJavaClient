

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
@XmlType(name = "FieldMappings", propOrder = {
    "mapping"
})
public class FieldMappings  {

    @XmlElement(name = "Mapping")
    protected List<FieldMapping> mapping;

    /**Gets or sets field mappings.*/
    public List<FieldMapping> getMapping() {
        if (mapping == null) {
            mapping = new ArrayList<FieldMapping>();
        }
        return this.mapping;
    }



}
