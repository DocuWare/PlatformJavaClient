

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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigurationRights", propOrder = {
    "configurationRight"
})
public class ConfigurationRights  {

    @XmlElement(name = "ConfigurationRight")
    @XmlSchemaType(name = "string")
    protected List<ConfigurationRight> configurationRight;

    /**ArrayList is required for the XML-Marshalling */
    public void setConfigurationRight(ArrayList<ConfigurationRight> value) {
        configurationRight=value;
    }

    /**List of configuration rights.*/
    public List<ConfigurationRight> getConfigurationRight() {
        if (configurationRight == null) {
            configurationRight = new ArrayList<ConfigurationRight>();
        }
        return this.configurationRight;
    }



}
