

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.settings.common.DWRectangle;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PageData", propOrder = {
    "lowQualitySize",
    "tileSize",
    "renderedImageFormat",
    "contentArea"
})
public class PageData  {

    @XmlElement(name = "LowQualitySize")
    protected int lowQualitySize;
    @XmlElement(name = "TileSize")
    protected int tileSize;
    @XmlElement(name = "RenderedImageFormat", required = true)
    @XmlSchemaType(name = "string")
    protected PlatformImageFormat renderedImageFormat;
    @XmlElement(name = "ContentArea", nillable = true)
    protected DWRectangle contentArea;
    @XmlAttribute(name = "DpiX", required = true)
    protected int dpiX;
    @XmlAttribute(name = "DpiY", required = true)
    protected int dpiY;
    @XmlAttribute(name = "Width", required = true)
    protected int width;
    @XmlAttribute(name = "Height", required = true)
    protected int height;

    /**Gets or sets the low quality level.*/
    public int getLowQualitySize() {
        return lowQualitySize;
    }

    public void setLowQualitySize(int value) {
        this.lowQualitySize = value;
    }

    /**Gets or sets the recommented size of multi scale image tiles.*/
    public int getTileSize() {
        return tileSize;
    }

    public void setTileSize(int value) {
        this.tileSize = value;
    }

    /**Gets or sets the preferred format this page is rendered.*/
    public PlatformImageFormat getRenderedImageFormat() {
        return renderedImageFormat;
    }

    public void setRenderedImageFormat(PlatformImageFormat value) {
        this.renderedImageFormat = value;
    }

    /**Gets or sets the area of the content of the page. The coordinates are in twips (1/1440 inches) - https://en.wikipedia.org/wiki/Twip .*/
    public DWRectangle getContentArea() {
        return contentArea;
    }

    public void setContentArea(DWRectangle value) {
        this.contentArea = value;
    }

    /**Gets the horizontal resolution of a page image. In case of vector images this is the maximal resolution which can be rendered.*/
    public int getDpiX() {
        return dpiX;
    }

    /**Gets the horizontal resolution of a page image. In case of vector images this is the maximal resolution which can be rendered.*/
    public void setDpiX(int value) {
        this.dpiX = value;
    }

    /**Gets the vertical resolution of a page image. In case of vector images this is the maximal resolution which can be rendered.*/
    public int getDpiY() {
        return dpiY;
    }

    /**Gets the vertical resolution of a page image. In case of vector images this is the maximal resolution which can be rendered.*/
    public void setDpiY(int value) {
        this.dpiY = value;
    }

    /**Gets the horizontal size of a page image in pixels. In case of vector images this is the maximal pixel width which can be rendered.*/
    public int getWidth() {
        return width;
    }

    /**Gets the horizontal size of a page image in pixels. In case of vector images this is the maximal pixel width which can be rendered.*/
    public void setWidth(int value) {
        this.width = value;
    }

    /**Gets the vertical size of a page image in pixels. In case of vector images this is the maximal pixel height which can be rendered.*/
    public int getHeight() {
        return height;
    }

    /**Gets the vertical size of a page image in pixels. In case of vector images this is the maximal pixel height which can be rendered.*/
    public void setHeight(int value) {
        this.height = value;
    }



}
