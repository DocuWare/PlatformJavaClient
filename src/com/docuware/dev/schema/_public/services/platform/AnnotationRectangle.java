

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
@XmlType(name = "AnnotationRectangle")
public class AnnotationRectangle  {

    @XmlAttribute(name = "Left", required = true)
    protected double left;
    @XmlAttribute(name = "Top", required = true)
    protected double top;
    @XmlAttribute(name = "Width", required = true)
    protected double width;
    @XmlAttribute(name = "Height", required = true)
    protected double height;

    /**The left coordinate of the rectangle.*/
    public double getLeft() {
        return left;
    }

    /**The left coordinate of the rectangle.*/
    public void setLeft(double value) {
        this.left = value;
    }

    /**The top coordinate of the rectangle.*/
    public double getTop() {
        return top;
    }

    /**The top coordinate of the rectangle.*/
    public void setTop(double value) {
        this.top = value;
    }

    /**The width of the rectangle in coordinates.*/
    public double getWidth() {
        return width;
    }

    /**The width of the rectangle in coordinates.*/
    public void setWidth(double value) {
        this.width = value;
    }

    /**The height of the rectangle in coordinates.*/
    public double getHeight() {
        return height;
    }

    /**The height of the rectangle in coordinates.*/
    public void setHeight(double value) {
        this.height = value;
    }



}
