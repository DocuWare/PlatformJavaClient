

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewerDialog")
public class ViewerDialog  {

    @XmlAttribute(name = "Mode")
    protected ViewerDialogModes mode;
    @XmlAttribute(name = "MarkFulltextSearchHits")
    protected Boolean markFulltextSearchHits;

    /**The mode in which the viewer is open to display a document from the result list*/
    public ViewerDialogModes getMode() {
        if (mode == null) {
            return ViewerDialogModes.AD_HOC_EDIT_MODE;
        } else {
            return mode;
        }
    }

    /**The mode in which the viewer is open to display a document from the result list*/
    public void setMode(ViewerDialogModes value) {
        this.mode = value;
    }

    /**Determines whether the occurrences that match the fulltext search are highlighted in the displayed document*/
    public boolean isMarkFulltextSearchHits() {
        if (markFulltextSearchHits == null) {
            return true;
        } else {
            return markFulltextSearchHits;
        }
    }

    /**Determines whether the occurrences that match the fulltext search are highlighted in the displayed document*/
    public void setMarkFulltextSearchHits(Boolean value) {
        this.markFulltextSearchHits = value;
    }



}
