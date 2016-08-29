

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicationPreferencesHolder", propOrder = {
    "appPrefs"
})
public class ApplicationPreferencesHolder  {

    @XmlElement(name = "AppPrefs")
    protected ApplicationPreferences appPrefs;

    public ApplicationPreferences getAppPrefs() {
        return appPrefs;
    }

    public void setAppPrefs(ApplicationPreferences value) {
        this.appPrefs = value;
    }



}
