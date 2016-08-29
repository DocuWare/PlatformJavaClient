

package com.docuware.dev.schema._public.services.annotations;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryParamater")
public class QueryParamater  {

    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "IsRequired")
    @XmlSchemaType(name = "anySimpleType")
    protected String isRequired;
    @XmlAttribute(name = "Type")
    protected QueryParamaterType type;

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getIsRequired() {
        if (isRequired == null) {
            return "false";
        } else {
            return isRequired;
        }
    }

    public void setIsRequired(String value) {
        this.isRequired = value;
    }

    public QueryParamaterType getType() {
        if (type == null) {
            return QueryParamaterType.STRING;
        } else {
            return type;
        }
    }

    public void setType(QueryParamaterType value) {
        this.type = value;
    }



}
