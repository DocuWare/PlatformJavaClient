

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
@XmlType(name = "Zone", propOrder = {
    "zoneID",
    "type",
    "pageNumber",
    "x",
    "y",
    "w",
    "h",
    "mappedWebFormFieldName",
    "sampleText",
    "fontType",
    "fontSize",
    "fontColor",
    "fontWeightBold",
    "fontWeightItalic",
    "fontWeightUnderlined",
    "textAlignment",
    "originalImageWidth",
    "wrapText"
})
public class Zone  {

    @XmlElement(name = "ZoneID")
    protected int zoneID;
    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "PageNumber")
    protected int pageNumber;
    @XmlElement(name = "X")
    protected int x;
    @XmlElement(name = "Y")
    protected int y;
    @XmlElement(name = "W")
    protected int w;
    @XmlElement(name = "H")
    protected int h;
    @XmlElement(name = "MappedWebFormFieldName", required = true)
    protected String mappedWebFormFieldName;
    @XmlElement(name = "SampleText", required = true)
    protected String sampleText;
    @XmlElement(name = "FontType", required = true)
    protected String fontType;
    @XmlElement(name = "FontSize")
    protected int fontSize;
    @XmlElement(name = "FontColor", required = true)
    protected String fontColor;
    @XmlElement(name = "FontWeightBold")
    protected boolean fontWeightBold;
    @XmlElement(name = "FontWeightItalic")
    protected boolean fontWeightItalic;
    @XmlElement(name = "FontWeightUnderlined")
    protected boolean fontWeightUnderlined;
    @XmlElement(name = "TextAlignment", required = true)
    @XmlSchemaType(name = "string")
    protected AlignmentType textAlignment;
    @XmlElement(name = "OriginalImageWidth")
    protected int originalImageWidth;
    @XmlElement(name = "WrapText")
    protected boolean wrapText;

    public int getZoneID() {
        return zoneID;
    }

    public void setZoneID(int value) {
        this.zoneID = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String value) {
        this.type = value;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int value) {
        this.pageNumber = value;
    }

    public int getX() {
        return x;
    }

    public void setX(int value) {
        this.x = value;
    }

    public int getY() {
        return y;
    }

    public void setY(int value) {
        this.y = value;
    }

    public int getW() {
        return w;
    }

    public void setW(int value) {
        this.w = value;
    }

    public int getH() {
        return h;
    }

    public void setH(int value) {
        this.h = value;
    }

    public String getMappedWebFormFieldName() {
        return mappedWebFormFieldName;
    }

    public void setMappedWebFormFieldName(String value) {
        this.mappedWebFormFieldName = value;
    }

    public String getSampleText() {
        return sampleText;
    }

    public void setSampleText(String value) {
        this.sampleText = value;
    }

    public String getFontType() {
        return fontType;
    }

    public void setFontType(String value) {
        this.fontType = value;
    }

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

    public boolean isFontWeightBold() {
        return fontWeightBold;
    }

    public void setFontWeightBold(boolean value) {
        this.fontWeightBold = value;
    }

    public boolean isFontWeightItalic() {
        return fontWeightItalic;
    }

    public void setFontWeightItalic(boolean value) {
        this.fontWeightItalic = value;
    }

    public boolean isFontWeightUnderlined() {
        return fontWeightUnderlined;
    }

    public void setFontWeightUnderlined(boolean value) {
        this.fontWeightUnderlined = value;
    }

    public AlignmentType getTextAlignment() {
        return textAlignment;
    }

    public void setTextAlignment(AlignmentType value) {
        this.textAlignment = value;
    }

    public int getOriginalImageWidth() {
        return originalImageWidth;
    }

    public void setOriginalImageWidth(int value) {
        this.originalImageWidth = value;
    }

    public boolean isWrapText() {
        return wrapText;
    }

    public void setWrapText(boolean value) {
        this.wrapText = value;
    }



}
