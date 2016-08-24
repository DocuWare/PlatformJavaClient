

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FixedText", propOrder = {
    "fontSize",
    "fontColor",
    "width",
    "alignment"
})
public class FixedText
    extends WebFormField
 {

    @XmlElement(name = "FontSize")
    protected int fontSize;
    @XmlElement(name = "FontColor", required = true)
    protected String fontColor;
    @XmlElement(name = "Width")
    protected int width;
    @XmlElement(name = "Alignment", required = true)
    @XmlSchemaType(name = "string")
    protected AlignmentType alignment;

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int value) {
        this.fontSize = value;
    }

    public String getFontColor() {
        return fontColor;
    }

    public void setFontColor(String value) {
        this.fontColor = value;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int value) {
        this.width = value;
    }

    public AlignmentType getAlignment() {
        return alignment;
    }

    public void setAlignment(AlignmentType value) {
        this.alignment = value;
    }



}
