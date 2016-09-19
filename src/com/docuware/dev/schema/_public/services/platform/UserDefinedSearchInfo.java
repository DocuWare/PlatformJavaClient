

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserDefinedSearchInfo", propOrder = {
    "dialogExpression"
})
public class UserDefinedSearchInfo  {

    @XmlElement(name = "DialogExpression", required = true)
    protected DialogExpression dialogExpression;
    @XmlAttribute(name = "Name")
    protected String name;

    /**Gets or sets the conditions which are used for creating user defined search based on result list.*/
    @Dolphin
    public DialogExpression getDialogExpression() {
        return dialogExpression;
    }

    @Dolphin
    public void setDialogExpression(DialogExpression value) {
        this.dialogExpression = value;
    }

    /**The name of the user defined search based on result list.*/
    @Dolphin
    public String getName() {
        return name;
    }

    /**The name of the user defined search based on result list.*/
    @Dolphin
    public void setName(String value) {
        this.name = value;
    }



}
