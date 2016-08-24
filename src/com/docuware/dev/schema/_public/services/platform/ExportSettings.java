

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
@XmlType(name = "ExportSettings")
public class ExportSettings  {

    @XmlAttribute(name = "ExportHistory")
    protected Boolean exportHistory;
    @XmlAttribute(name = "ExportTextshots")
    protected Boolean exportTextshots;

    /**Gets or sets a value indicating whether the document's versions has to be exported.*/
    public boolean isExportHistory() {
        if (exportHistory == null) {
            return false;
        } else {
            return exportHistory;
        }
    }

    /**Gets or sets a value indicating whether the document's versions has to be exported.*/
    public void setExportHistory(Boolean value) {
        this.exportHistory = value;
    }

    /**Gets or sets a value indicating whether the document's textshot has to be exported.*/
    public boolean isExportTextshots() {
        if (exportTextshots == null) {
            return false;
        } else {
            return exportTextshots;
        }
    }

    /**Gets or sets a value indicating whether the document's textshot has to be exported.*/
    public void setExportTextshots(Boolean value) {
        this.exportTextshots = value;
    }



}
