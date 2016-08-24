

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextEntry", propOrder = {
    "font",
    "value",
    "location"
})
public class TextEntry
    extends EntryBase
 {

    @XmlElement(name = "Font", required = true)
    protected Font font;
    @XmlElement(name = "Value", required = true)
    protected String value;
    @XmlElement(name = "Location", required = true)
    protected AnnotationRectangle location;

    /**Specify the font of the text.*/
    public Font getFont() {
        return font;
    }

    /**Specify the font of the text.*/
    public void setFont(Font value) {
        this.font = value;
    }

    /**Text to be displayed.*/
    public String getValue() {
        return value;
    }

    /**Text to be displayed.*/
    public void setValue(String value) {
        this.value = value;
    }

    /**Location of the annotation.*/
    public AnnotationRectangle getLocation() {
        return location;
    }

    /**Location of the annotation.*/
    public void setLocation(AnnotationRectangle value) {
        this.location = value;
    }



}
