

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
@XmlType(name = "WebClientPreferences", propOrder = {
    "workAreas",
    "generalSettings",
    "webClientLayout",
    "favorites",
    "viewer",
    "multiFCSearches",
    "localStorage"
})
@CompareIgnore
public class WebClientPreferences
    extends ApplicationPreferences
 {

    @XmlElement(name = "WorkAreas")
    protected List<WorkAreaPreferences> workAreas;
    @XmlElement(name = "GeneralSettings", required = true)
    protected GeneralSettings generalSettings;
    @XmlElement(name = "WebClientLayout", required = true)
    protected WebClientLayout webClientLayout;
    @XmlElement(name = "Favorites", required = true)
    protected Favorites favorites;
    @XmlElement(name = "Viewer", required = true)
    protected ViewerPreferences viewer;
    @XmlElement(name = "MultiFCSearches", required = true)
    protected MultiFCSearches multiFCSearches;
    @XmlElement(name = "LocalStorage", required = true)
    protected String localStorage;

    /**ArrayList is required for the XML-Marshalling */
    public void setWorkAreas(ArrayList<WorkAreaPreferences> value) {
        workAreas=value;
    }

    public List<WorkAreaPreferences> getWorkAreas() {
        if (workAreas == null) {
            workAreas = new ArrayList<WorkAreaPreferences>();
        }
        return this.workAreas;
    }

    @Eagle
    public GeneralSettings getGeneralSettings() {
        return generalSettings;
    }

    @Eagle
    public void setGeneralSettings(GeneralSettings value) {
        this.generalSettings = value;
    }

    public WebClientLayout getWebClientLayout() {
        return webClientLayout;
    }

    public void setWebClientLayout(WebClientLayout value) {
        this.webClientLayout = value;
    }

    public Favorites getFavorites() {
        return favorites;
    }

    public void setFavorites(Favorites value) {
        this.favorites = value;
    }

    public ViewerPreferences getViewer() {
        return viewer;
    }

    public void setViewer(ViewerPreferences value) {
        this.viewer = value;
    }

    @Eagle
    public MultiFCSearches getMultiFCSearches() {
        return multiFCSearches;
    }

    @Eagle
    public void setMultiFCSearches(MultiFCSearches value) {
        this.multiFCSearches = value;
    }

    @Eagle
    public String getLocalStorage() {
        return localStorage;
    }

    @Eagle
    public void setLocalStorage(String value) {
        this.localStorage = value;
    }



}
