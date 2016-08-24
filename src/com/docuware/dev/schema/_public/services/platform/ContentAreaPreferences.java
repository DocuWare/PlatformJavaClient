

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentAreaPreferences", propOrder = {
    "instances"
})
@XmlSeeAlso({
    WorkflowAreaPreferences.class,
    BasketAreaPreferences.class
})
public class ContentAreaPreferences  {

    @XmlElement(name = "Instances")
    protected List<WorkInstance> instances;
    @XmlAttribute(name = "AreaType")
    protected WorkAreaType areaType;
    @XmlAttribute(name = "SelectedInstanceIndex")
    protected Integer selectedInstanceIndex;

    /**Items assigned to the area like dialogs, Baskets.*/
    public List<WorkInstance> getInstances() {
        if (instances == null) {
            instances = new ArrayList<WorkInstance>();
        }
        return this.instances;
    }

    public WorkAreaType getAreaType() {
        if (areaType == null) {
            return WorkAreaType.NONE;
        } else {
            return areaType;
        }
    }

    public void setAreaType(WorkAreaType value) {
        this.areaType = value;
    }

    public Integer getSelectedInstanceIndex() {
        return selectedInstanceIndex;
    }

    public void setSelectedInstanceIndex(Integer value) {
        this.selectedInstanceIndex = value;
    }



}
