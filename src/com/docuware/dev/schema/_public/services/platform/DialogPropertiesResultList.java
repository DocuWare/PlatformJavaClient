

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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DialogPropertiesResultList", propOrder = {
    "functions",
    "viewerDialog",
    "sortOrder"
})
@XmlSeeAlso({
    DialogPropertiesTaskList.class
})
public class DialogPropertiesResultList
    extends DialogProperties
 {

    @XmlElement(name = "Functions")
    protected List<ResultDialogFunction> functions;
    @XmlElement(name = "ViewerDialog", required = true)
    protected ViewerDialog viewerDialog;
    @XmlElement(name = "SortOrder")
    protected SortedFieldsList sortOrder;
    @XmlAttribute(name = "DefaultListTextLetterCase", required = true)
    protected LetterCase defaultListTextLetterCase;
    @XmlAttribute(name = "DisplayFirstDocument", required = true)
    protected boolean displayFirstDocument;
    @XmlAttribute(name = "ShowCheckedOutDocumens")
    protected Boolean showCheckedOutDocumens;

    /**ArrayList is required for the XML-Marshalling */
    public void setFunctions(ArrayList<ResultDialogFunction> value) {
        functions=value;
    }

    /**Functions available for the result list (Print document, Display document, etc.)*/
    public List<ResultDialogFunction> getFunctions() {
        if (functions == null) {
            functions = new ArrayList<ResultDialogFunction>();
        }
        return this.functions;
    }

    /**Viewer properties*/
    public ViewerDialog getViewerDialog() {
        return viewerDialog;
    }

    /**Viewer properties*/
    public void setViewerDialog(ViewerDialog value) {
        this.viewerDialog = value;
    }

    /**Sort order for the result list.*/
    public SortedFieldsList getSortOrder() {
        return sortOrder;
    }

    /**Sort order for the result list.*/
    public void setSortOrder(SortedFieldsList value) {
        this.sortOrder = value;
    }

    /**Letter case to be used to display the hits in the result list*/
    public LetterCase getDefaultListTextLetterCase() {
        return defaultListTextLetterCase;
    }

    /**Letter case to be used to display the hits in the result list*/
    public void setDefaultListTextLetterCase(LetterCase value) {
        this.defaultListTextLetterCase = value;
    }

    /**Determines whether the web client automatically displays the first document in the result list in the viewer.*/
    public boolean isDisplayFirstDocument() {
        return displayFirstDocument;
    }

    /**Determines whether the web client automatically displays the first document in the result list in the viewer.*/
    public void setDisplayFirstDocument(boolean value) {
        this.displayFirstDocument = value;
    }

    /**Determines whether the result list can show documents that are currently checked out.*/
    public boolean isShowCheckedOutDocumens() {
        if (showCheckedOutDocumens == null) {
            return false;
        } else {
            return showCheckedOutDocumens;
        }
    }

    /**Determines whether the result list can show documents that are currently checked out.*/
    public void setShowCheckedOutDocumens(Boolean value) {
        this.showCheckedOutDocumens = value;
    }



}
