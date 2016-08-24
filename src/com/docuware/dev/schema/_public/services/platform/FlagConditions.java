

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlagConditions")
public class FlagConditions  {

    @XmlAttribute(name = "IncludeCheckedOut")
    protected Boolean includeCheckedOut;
    @XmlAttribute(name = "IncludeAppended")
    protected Boolean includeAppended;

    /**Include documents which are checked out*/
    public boolean isIncludeCheckedOut() {
        if (includeCheckedOut == null) {
            return false;
        } else {
            return includeCheckedOut;
        }
    }

    /**Include documents which are checked out*/
    public void setIncludeCheckedOut(Boolean value) {
        this.includeCheckedOut = value;
    }

    /**Include documents which are appended*/
    public boolean isIncludeAppended() {
        if (includeAppended == null) {
            return false;
        } else {
            return includeAppended;
        }
    }

    /**Include documents which are appended*/
    public void setIncludeAppended(Boolean value) {
        this.includeAppended = value;
    }



}
