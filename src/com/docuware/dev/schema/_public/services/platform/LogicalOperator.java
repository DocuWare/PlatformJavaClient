

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
@XmlType(name = "LogicalOperator")
public class LogicalOperator  {

    @XmlAttribute(name = "DefaultOperator", required = true)
    protected DialogExpressionOperation defaultOperator;
    @XmlAttribute(name = "Show", required = true)
    protected boolean show;

    /**If the option cannot be set in the dialog, the value defined here is always used for the search query*/
    public DialogExpressionOperation getDefaultOperator() {
        return defaultOperator;
    }

    public void setDefaultOperator(DialogExpressionOperation value) {
        this.defaultOperator = value;
    }

    /**If this option is enabled, the option can be set in the search dialog, and users can select either the AND or OR logical operator for their search query*/
    public boolean isShow() {
        return show;
    }

    public void setShow(boolean value) {
        this.show = value;
    }



}
