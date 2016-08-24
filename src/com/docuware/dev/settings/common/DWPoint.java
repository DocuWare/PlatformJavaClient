

package com.docuware.dev.settings.common;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DWPoint")
public class DWPoint  {

    @XmlAttribute(name = "X", required = true)
    protected double x;
    @XmlAttribute(name = "Y", required = true)
    protected double y;

    /**The horizontal position in coordinates.*/
    public double getX() {
        return x;
    }

    /**The horizontal position in coordinates.*/
    public void setX(double value) {
        this.x = value;
    }

    /**The vertical position in coordinates.*/
    public double getY() {
        return y;
    }

    /**The vertical position in coordinates.*/
    public void setY(double value) {
        this.y = value;
    }



}
