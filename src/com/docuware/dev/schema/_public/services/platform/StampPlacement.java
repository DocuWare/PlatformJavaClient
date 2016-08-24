

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.settings.common.DWPoint;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StampPlacement", propOrder = {
    "strokes",
    "location",
    "field"
})
@XmlSeeAlso({
    DecisionStampPlacement.class
})
public class StampPlacement  {

    @XmlElement(name = "Strokes")
    protected PolyLineEntry strokes;
    @XmlElement(name = "Location")
    protected DWPoint location;
    @XmlElement(name = "Field")
    protected List<FormFieldValue> field;
    @XmlAttribute(name = "StampId")
    @XmlSchemaType(name = "anySimpleType")
    protected String stampId;
    @XmlAttribute(name = "Rotation")
    protected Integer rotation;
    @XmlAttribute(name = "Layer")
    protected Integer layer;
    @XmlAttribute(name = "Password")
    protected String password;

    /**A polyline entry in case of stroke stamps.*/
    public PolyLineEntry getStrokes() {
        return strokes;
    }

    /**A polyline entry in case of stroke stamps.*/
    public void setStrokes(PolyLineEntry value) {
        this.strokes = value;
    }

    /**The location of the stamp.*/
    public DWPoint getLocation() {
        return location;
    }

    /**The location of the stamp.*/
    public void setLocation(DWPoint value) {
        this.location = value;
    }

    /**The form field values which are applied when placing the stamp.*/
    public List<FormFieldValue> getField() {
        if (field == null) {
            field = new ArrayList<FormFieldValue>();
        }
        return this.field;
    }

    /**The Id of the stamp to place.*/
    public String getStampId() {
        return stampId;
    }

    /**The Id of the stamp to place.*/
    public void setStampId(String value) {
        this.stampId = value;
    }

    /**Rotation of the stamp. Only rotation even of 90 degree are supported.*/
    public int getRotation() {
        if (rotation == null) {
            return  0;
        } else {
            return rotation;
        }
    }

    /**Rotation of the stamp. Only rotation even of 90 degree are supported.*/
    public void setRotation(Integer value) {
        this.rotation = value;
    }

    /**Layer where the stamp have to be placed.*/
    public int getLayer() {
        if (layer == null) {
            return  0;
        } else {
            return layer;
        }
    }

    /**Layer where the stamp have to be placed.*/
    public void setLayer(Integer value) {
        this.layer = value;
    }

    /**Password for password protected stamps*/
    @Dolphin
    public String getPassword() {
        if (password == null) {
            return "";
        } else {
            return password;
        }
    }

    /**Password for password protected stamps*/
    @Dolphin
    public void setPassword(String value) {
        this.password = value;
    }



}
