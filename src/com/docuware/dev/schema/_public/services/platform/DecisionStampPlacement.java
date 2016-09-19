

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
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecisionStampPlacement")
public class DecisionStampPlacement
    extends StampPlacement
 {

    @XmlAttribute(name = "DecisionId")
    protected String decisionId;
    @XmlAttribute(name = "TaskId")
    protected String taskId;
    @XmlAttribute(name = "IsController", required = true)
    protected boolean isController;

    public String getDecisionId() {
        return decisionId;
    }

    public void setDecisionId(String value) {
        this.decisionId = value;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String value) {
        this.taskId = value;
    }

    public boolean isIsController() {
        return isController;
    }

    public void setIsController(boolean value) {
        this.isController = value;
    }



}
