

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
@XmlType(name = "MultiFCSearches", propOrder = {
    "configurations"
})
@CompareIgnore
public class MultiFCSearches  {

    @XmlElement(name = "Configurations")
    protected List<MultiFCSearchConfiguration> configurations;
    @XmlAttribute(name = "_ignore_me")
    protected Boolean ignoreMe;

    /**ArrayList is required for the XML-Marshalling */
    public void setConfigurations(ArrayList<MultiFCSearchConfiguration> value) {
        configurations=value;
    }

    @Eagle
    public List<MultiFCSearchConfiguration> getConfigurations() {
        if (configurations == null) {
            configurations = new ArrayList<MultiFCSearchConfiguration>();
        }
        return this.configurations;
    }

    public boolean isIgnoreMe() {
        if (ignoreMe == null) {
            return false;
        } else {
            return ignoreMe;
        }
    }

    public void setIgnoreMe(Boolean value) {
        this.ignoreMe = value;
    }



}
