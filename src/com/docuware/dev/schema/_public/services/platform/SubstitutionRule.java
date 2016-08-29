

package com.docuware.dev.schema._public.services.platform;

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
@XmlType(name = "SubstitutionRule")
public class SubstitutionRule  {

    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "Active", required = true)
    protected boolean active;
    @XmlAttribute(name = "Guid", required = true)
    protected String guid;

    /**Gets the name of the rule.*/
    public String getName() {
        return name;
    }

    /**Gets the name of the rule.*/
    public void setName(String value) {
        this.name = value;
    }

    /**Gets a value indicating whether the rule is active.*/
    public boolean isActive() {
        return active;
    }

    /**Gets a value indicating whether the rule is active.*/
    public void setActive(boolean value) {
        this.active = value;
    }

    /**Gets the Guid of the rule.*/
    public String getGuid() {
        return guid;
    }

    /**Gets the Guid of the rule.*/
    public void setGuid(String value) {
        this.guid = value;
    }



}
