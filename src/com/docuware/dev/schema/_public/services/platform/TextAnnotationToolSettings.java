

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
@XmlType(name = "TextAnnotationToolSettings", propOrder = {
    "fontSettings"
})
public class TextAnnotationToolSettings
    extends AnnotationToolSettings
 {

    @XmlElement(name = "FontSettings", required = true)
    protected FontSettings fontSettings;

    public FontSettings getFontSettings() {
        return fontSettings;
    }

    public void setFontSettings(FontSettings value) {
        this.fontSettings = value;
    }



}
