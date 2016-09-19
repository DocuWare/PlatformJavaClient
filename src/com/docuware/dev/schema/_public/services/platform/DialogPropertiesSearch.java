

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DialogPropertiesSearch", propOrder = {
    "logicalOperator"
})
public class DialogPropertiesSearch
    extends DialogProperties
 {

    @XmlElement(name = "LogicalOperator", required = true)
    protected LogicalOperator logicalOperator;

    /**The logical operator used for the search conditions*/
    public LogicalOperator getLogicalOperator() {
        return logicalOperator;
    }

    /**The logical operator used for the search conditions*/
    public void setLogicalOperator(LogicalOperator value) {
        this.logicalOperator = value;
    }



}
