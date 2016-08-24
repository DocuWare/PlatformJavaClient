

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DialogPropertiesTaskList", propOrder = {
    "conditions"
})
public class DialogPropertiesTaskList
    extends DialogPropertiesResultList
 {

    @XmlElement(name = "Conditions", required = true)
    protected DialogExpression conditions;
    @XmlAttribute(name = "ConditionString")
    protected String conditionString;
    @XmlAttribute(name = "Private")
    protected Boolean _private;
    @XmlAttribute(name = "AutoRefresh")
    protected Boolean autoRefresh;

    /**The search conditions of the dialog.*/
    public DialogExpression getConditions() {
        return conditions;
    }

    /**The search conditions of the dialog.*/
    public void setConditions(DialogExpression value) {
        this.conditions = value;
    }

    /**The search conditions of the dialog as string.*/
    @Gecko
    public String getConditionString() {
        return conditionString;
    }

    /**The search conditions of the dialog as string.*/
    @Gecko
    public void setConditionString(String value) {
        this.conditionString = value;
    }

    /**Determines whether the task list is private for the user that created it (by user defined search)*/
    @Dolphin
    public boolean isPrivate() {
        if (_private == null) {
            return false;
        } else {
            return _private;
        }
    }

    /**Determines whether the task list is private for the user that created it (by user defined search)*/
    @Dolphin
    public void setPrivate(Boolean value) {
        this._private = value;
    }

    /**Determines whether the task list is automatically refreshed.*/
    @Dolphin
    public boolean isAutoRefresh() {
        if (autoRefresh == null) {
            return true;
        } else {
            return autoRefresh;
        }
    }

    /**Determines whether the task list is automatically refreshed.*/
    @Dolphin
    public void setAutoRefresh(Boolean value) {
        this.autoRefresh = value;
    }



}
