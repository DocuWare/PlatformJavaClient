

package com.docuware.dev._public.intellix;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Line", propOrder = {
"boldSpecified",
"fontSizeSpecified",
"baseLineSpecified",
    "items"
})
public class Line
    extends RectangleBase
 {
private boolean boldSpecified;//test

private boolean fontSizeSpecified;//test

private boolean baseLineSpecified;//test


    @XmlElements({
        @XmlElement(name = "Sp", type = Space.class),
        @XmlElement(name = "Wd", type = Word.class)
    })
    protected List<Object> items;
    @XmlAttribute(name = "BaseLine")
    protected Integer baseLine;
    @XmlAttribute(name = "bold")
    protected Boolean bold;
    @XmlAttribute(name = "fontSize")
    protected Integer fontSize;

    /**ArrayList is required for the XML-Marshalling */
    public void setItems(ArrayList<Object> value) {
        items=value;
    }

    public List<Object> getItems() {
        if (items == null) {
            items = new ArrayList<Object>();
        }
        return this.items;
    }

    public Integer getBaseLine() {
        return baseLine;
    }

    public void setBaseLine(Integer value) {
        this.baseLine = value;
    }

    public Boolean isBold() {
        return bold;
    }

    public void setBold(Boolean value) {
        this.bold = value;
    }

    public Integer getFontSize() {
        return fontSize;
    }

    public void setFontSize(Integer value) {
        this.fontSize = value;
    }

    @Extension
    public boolean isBaseLineSpecified() {
	return baseLineSpecified;
    }

    @Extension
    public void setBaseLineSpecified(boolean baseLineSpecified) {
	this.baseLineSpecified = baseLineSpecified;
    }

    @Extension
    public boolean isBoldSpecified() {
	return boldSpecified;
    }

    @Extension
    public void setBoldSpecified(boolean boldSpecified) {
	this.boldSpecified = boldSpecified;
    }

    @Extension
    public boolean isFontSizeSpecified() {
	return fontSizeSpecified;
    }

    @Extension
    public void setFontSizeSpecified(boolean fontSizeSpecified) {
	this.fontSizeSpecified = fontSizeSpecified;
    }



}
