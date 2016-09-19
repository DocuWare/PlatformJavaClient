

package com.docuware.dev.schema._public.services.annotations;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
@XmlType(name = "QueryParamatersList", propOrder = {
    "parameter"
})
public class QueryParamatersList  {

    @XmlElement(name = "Parameter")
    protected List<QueryParamater> parameter;

    /**ArrayList is required for the XML-Marshalling */
    public void setParameter(ArrayList<QueryParamater> value) {
        parameter=value;
    }

    public List<QueryParamater> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<QueryParamater>();
        }
        return this.parameter;
    }



}
