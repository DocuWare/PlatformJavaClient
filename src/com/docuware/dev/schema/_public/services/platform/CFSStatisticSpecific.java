

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CFSStatisticSpecific", propOrder = {
    "specificValue"
})
public class CFSStatisticSpecific  {

    @XmlElement(name = "SpecificValue", required = true)
    protected List<CFSSpecificValue> specificValue;
    @XmlAttribute(name = "Category", required = true)
    protected CFSTableNames category;
    @XmlAttribute(name = "ObjectID", required = true)
    protected String objectID;

    /**ArrayList is required for the XML-Marshalling */
    public void setSpecificValue(ArrayList<CFSSpecificValue> value) {
        specificValue=value;
    }

    public List<CFSSpecificValue> getSpecificValue() {
        if (specificValue == null) {
            specificValue = new ArrayList<CFSSpecificValue>();
        }
        return this.specificValue;
    }

    public CFSTableNames getCategory() {
        return category;
    }

    public void setCategory(CFSTableNames value) {
        this.category = value;
    }

    /**The identifier of the instance to be monitored.
          For a file cabinet this is the file cabinet id, for a device this is the device string.*/
    public String getObjectID() {
        return objectID;
    }

    /**The identifier of the instance to be monitored.
          For a file cabinet this is the file cabinet id, for a device this is the device string.*/
    public void setObjectID(String value) {
        this.objectID = value;
    }



}
