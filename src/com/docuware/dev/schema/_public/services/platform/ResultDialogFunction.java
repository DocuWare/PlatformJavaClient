

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultDialogFunction")
public class ResultDialogFunction  {

    @XmlAttribute(name = "Type", required = true)
    protected ResultDialogFunctionType type;
    @XmlAttribute(name = "InToolBar")
    protected Boolean inToolBar;
    @XmlAttribute(name = "AsButton")
    protected Boolean asButton;

    /**The type of the result dialog function.*/
    public ResultDialogFunctionType getType() {
        return type;
    }

    /**The type of the result dialog function.*/
    public void setType(ResultDialogFunctionType value) {
        this.type = value;
    }

    /**If this option is enabled, the result list contains an icon you can use to access the function*/
    public boolean isInToolBar() {
        if (inToolBar == null) {
            return false;
        } else {
            return inToolBar;
        }
    }

    /**If this option is enabled, the result list contains an icon you can use to access the function*/
    public void setInToolBar(Boolean value) {
        this.inToolBar = value;
    }

    /**If this option is enabled, the result list contains a button with which to call the function*/
    public boolean isAsButton() {
        if (asButton == null) {
            return false;
        } else {
            return asButton;
        }
    }

    /**If this option is enabled, the result list contains a button with which to call the function*/
    public void setAsButton(Boolean value) {
        this.asButton = value;
    }



}
