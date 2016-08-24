

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebSettings", propOrder = {
    "applicationPreferences"
})
public class WebSettings  {

    @XmlElement(name = "ApplicationPreferences")
    protected List<ApplicationPreferences> applicationPreferences;

    /**Preferences for a specific application.*/
    public List<ApplicationPreferences> getApplicationPreferences() {
        if (applicationPreferences == null) {
            applicationPreferences = new ArrayList<ApplicationPreferences>();
        }
        return this.applicationPreferences;
    }



}
