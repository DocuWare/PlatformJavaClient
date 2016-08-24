

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WordSearchResultWordHit", propOrder = {
    "text"
})
public class WordSearchResultWordHit  {

    @XmlElement(name = "Text", required = true)
    protected String text;
    @XmlAttribute(name = "L", required = true)
    protected int l;
    @XmlAttribute(name = "T", required = true)
    protected int t;
    @XmlAttribute(name = "W", required = true)
    protected int w;
    @XmlAttribute(name = "H", required = true)
    protected int h;

    /**Contains the text matching the query.*/
    public String getText() {
        return text;
    }

    /**Contains the text matching the query.*/
    public void setText(String value) {
        this.text = value;
    }

    public int getL() {
        return l;
    }

    public void setL(int value) {
        this.l = value;
    }

    public int getT() {
        return t;
    }

    public void setT(int value) {
        this.t = value;
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



}
