

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
@XmlType(name = "Favorites", propOrder = {
    "baskets",
    "storeDialogs",
    "searchDialogs",
    "taskLists",
    "treeViews",
    "multiFCSearches"
})
@CompareIgnore
public class Favorites  {

    @XmlElement(name = "Baskets", required = true)
    protected FavoriteItems baskets;
    @XmlElement(name = "StoreDialogs", required = true)
    protected FavoriteItems storeDialogs;
    @XmlElement(name = "SearchDialogs", required = true)
    protected FavoriteItems searchDialogs;
    @XmlElement(name = "TaskLists", required = true)
    protected FavoriteItems taskLists;
    @XmlElement(name = "TreeViews", required = true)
    protected FavoriteItems treeViews;
    @XmlElement(name = "MultiFCSearches", required = true)
    protected FavoriteItems multiFCSearches;

    public FavoriteItems getBaskets() {
        return baskets;
    }

    public void setBaskets(FavoriteItems value) {
        this.baskets = value;
    }

    public FavoriteItems getStoreDialogs() {
        return storeDialogs;
    }

    public void setStoreDialogs(FavoriteItems value) {
        this.storeDialogs = value;
    }

    public FavoriteItems getSearchDialogs() {
        return searchDialogs;
    }

    public void setSearchDialogs(FavoriteItems value) {
        this.searchDialogs = value;
    }

    public FavoriteItems getTaskLists() {
        return taskLists;
    }

    public void setTaskLists(FavoriteItems value) {
        this.taskLists = value;
    }

    public FavoriteItems getTreeViews() {
        return treeViews;
    }

    public void setTreeViews(FavoriteItems value) {
        this.treeViews = value;
    }

    @Eagle
    public FavoriteItems getMultiFCSearches() {
        return multiFCSearches;
    }

    @Eagle
    public void setMultiFCSearches(FavoriteItems value) {
        this.multiFCSearches = value;
    }



}
