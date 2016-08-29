

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
@XmlType(name = "FileDownloadBase", propOrder = {
    "layers"
})
@XmlSeeAlso({
    FileDownload.class,
    FileDownloadPage.class
})
public abstract class FileDownloadBase  {

    @XmlElement(name = "Layers", type = Integer.class)
    protected List<Integer> layers;
    @XmlAttribute(name = "KeepAnnotations")
    protected Boolean keepAnnotations;

    /**Specifies the annotation layers to be included in the output file.*/
    @Dolphin
    public List<Integer> getLayers() {
        if (layers == null) {
            layers = new ArrayList<Integer>();
        }
        return this.layers;
    }

    /**If this flag is true then the annotations are rendered in the PDF file, otherwise the annotations are removed.*/
    public boolean isKeepAnnotations() {
        if (keepAnnotations == null) {
            return true;
        } else {
            return keepAnnotations;
        }
    }

    /**If this flag is true then the annotations are rendered in the PDF file, otherwise the annotations are removed.*/
    public void setKeepAnnotations(Boolean value) {
        this.keepAnnotations = value;
    }



}
