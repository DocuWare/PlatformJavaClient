

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntryBase", propOrder = {
    "created"
})
@XmlSeeAlso({
    LineEntry.class,
    RectEntry.class,
    DeleteEntry.class,
    TextEntry.class,
    PolyLineEntry.class,
    StampBase.class
})
public class EntryBase  {

    @XmlElement(name = "Created", required = true)
    protected CreatedInfo created;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "Color")
    protected String color;
    @XmlAttribute(name = "Rotation")
    protected Integer rotation;
    @XmlAttribute(name = "Transparent")
    protected Boolean transparent;
    @XmlAttribute(name = "StrokeWidth")
    protected Integer strokeWidth;
    @XmlAttribute(name = "Id")
    protected String id;

    /**Info about creation of the annotation.*/
    public CreatedInfo getCreated() {
        return created;
    }

    /**Info about creation of the annotation.*/
    public void setCreated(CreatedInfo value) {
        this.created = value;
    }

    /**Type of the annotation.*/
    public String getType() {
        return type;
    }

    /**Type of the annotation.*/
    public void setType(String value) {
        this.type = value;
    }

    /**Color of the annotation.*/
    public String getColor() {
        if (color == null) {
            return "#000000";
        } else {
            return color;
        }
    }

    /**Color of the annotation.*/
    public void setColor(String value) {
        this.color = value;
    }

    /**Rotaion of the annotation.*/
    public int getRotation() {
        if (rotation == null) {
            return  0;
        } else {
            return rotation;
        }
    }

    /**Rotaion of the annotation.*/
    public void setRotation(Integer value) {
        this.rotation = value;
    }

    /**Define if annotation is transparent.*/
    public boolean isTransparent() {
        if (transparent == null) {
            return false;
        } else {
            return transparent;
        }
    }

    /**Define if annotation is transparent.*/
    public void setTransparent(Boolean value) {
        this.transparent = value;
    }

    /**The thickness of the stroke in twips.*/
    public int getStrokeWidth() {
        if (strokeWidth == null) {
            return  20;
        } else {
            return strokeWidth;
        }
    }

    /**The thickness of the stroke in twips.*/
    public void setStrokeWidth(Integer value) {
        this.strokeWidth = value;
    }

    /**Identity of the stamp.*/
    public String getId() {
        return id;
    }

    /**Identity of the stamp.*/
    public void setId(String value) {
        this.id = value;
    }



}
