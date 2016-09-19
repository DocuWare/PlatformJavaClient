

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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImageField", propOrder = {
    "width",
    "originalImageWidth",
    "originalImageSize",
    "alignment"
})
public class ImageField
    extends WebFormField
 {

    @XmlElement(name = "Width")
    protected int width;
    @XmlElement(name = "OriginalImageWidth")
    protected int originalImageWidth;
    @XmlElement(name = "OriginalImageSize")
    protected int originalImageSize;
    @XmlElement(name = "Alignment", required = true)
    @XmlSchemaType(name = "string")
    protected AlignmentType alignment;

    public int getWidth() {
        return width;
    }

    public void setWidth(int value) {
        this.width = value;
    }

    public int getOriginalImageWidth() {
        return originalImageWidth;
    }

    public void setOriginalImageWidth(int value) {
        this.originalImageWidth = value;
    }

    public int getOriginalImageSize() {
        return originalImageSize;
    }

    public void setOriginalImageSize(int value) {
        this.originalImageSize = value;
    }

    public AlignmentType getAlignment() {
        return alignment;
    }

    public void setAlignment(AlignmentType value) {
        this.alignment = value;
    }



}
