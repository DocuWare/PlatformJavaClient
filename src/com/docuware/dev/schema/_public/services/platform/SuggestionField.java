

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
@XmlType(name = "SuggestionField", propOrder = {
    "value"
})
public class SuggestionField  {

    @XmlElement(name = "Value", required = true)
    protected List<SuggestionValue> value;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "DBName", required = true)
    protected String dbName;
    @XmlAttribute(name = "Confidence")
    protected IntellixFieldTrust confidence;

    /**ArrayList is required for the XML-Marshalling */
    public void setValue(ArrayList<SuggestionValue> value) {
        value=value;
    }

    public List<SuggestionValue> getValue() {
        if (value == null) {
            value = new ArrayList<SuggestionValue>();
        }
        return this.value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getDBName() {
        return dbName;
    }

    public void setDBName(String value) {
        this.dbName = value;
    }

    public IntellixFieldTrust getConfidence() {
        if (confidence == null) {
            return IntellixFieldTrust.NONE;
        } else {
            return confidence;
        }
    }

    public void setConfidence(IntellixFieldTrust value) {
        this.confidence = value;
    }



}
