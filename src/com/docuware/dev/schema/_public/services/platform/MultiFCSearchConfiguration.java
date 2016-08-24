

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
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultiFCSearchConfiguration", propOrder = {
    "fcIds"
})
public class MultiFCSearchConfiguration  {

    @XmlElement(name = "FcIds")
    protected List<String> fcIds;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "SearchDialogID")
    protected String searchDialogID;
    @XmlAttribute(name = "SearchDialogFCID")
    protected String searchDialogFCID;
    @XmlAttribute(name = "Id")
    protected String id;

    @Eagle
    public List<String> getFcIds() {
        if (fcIds == null) {
            fcIds = new ArrayList<String>();
        }
        return this.fcIds;
    }

    @Eagle
    public String getName() {
        return name;
    }

    @Eagle
    public void setName(String value) {
        this.name = value;
    }

    @Eagle
    public String getSearchDialogID() {
        return searchDialogID;
    }

    @Eagle
    public void setSearchDialogID(String value) {
        this.searchDialogID = value;
    }

    @Eagle
    public String getSearchDialogFCID() {
        return searchDialogFCID;
    }

    @Eagle
    public void setSearchDialogFCID(String value) {
        this.searchDialogFCID = value;
    }

    @Eagle
    public String getId() {
        return id;
    }

    @Eagle
    public void setId(String value) {
        this.id = value;
    }



}
