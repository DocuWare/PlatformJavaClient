

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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkAreaPreferences", propOrder = {
    "contentAreas"
})
@CompareIgnore
public class WorkAreaPreferences  {

    @XmlElement(name = "ContentAreas")
    protected List<ContentAreaPreferences> contentAreas;
    @XmlAttribute(name = "Name")
    protected String name;

    /**ArrayList is required for the XML-Marshalling */
    public void setContentAreas(ArrayList<ContentAreaPreferences> value) {
        contentAreas=value;
    }

    public List<ContentAreaPreferences> getContentAreas() {
        if (contentAreas == null) {
            contentAreas = new ArrayList<ContentAreaPreferences>();
        }
        return this.contentAreas;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }



}
