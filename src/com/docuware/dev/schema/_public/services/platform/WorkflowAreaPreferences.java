

package com.docuware.dev.schema._public.services.platform;

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
@XmlType(name = "WorkflowAreaPreferences", propOrder = {
    "controllerInstances"
})
@CompareIgnore
public class WorkflowAreaPreferences
    extends ContentAreaPreferences
 {

    @XmlElement(name = "ControllerInstances")
    protected List<WorkInstance> controllerInstances;

    /**ArrayList is required for the XML-Marshalling */
    public void setControllerInstances(ArrayList<WorkInstance> value) {
        controllerInstances=value;
    }

    /**Items assigned to the area like dialogs, Baskets.*/
    public List<WorkInstance> getControllerInstances() {
        if (controllerInstances == null) {
            controllerInstances = new ArrayList<WorkInstance>();
        }
        return this.controllerInstances;
    }



}
