

package com.docuware.dev._public.intellix;

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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Line", propOrder = {
    "spOrWd"
})
public class Line
    extends RectangleBase
 {

    @XmlElements({
        @XmlElement(name = "Sp", type = Space.class),
        @XmlElement(name = "Wd", type = Word.class)
    })
    protected List<Object> spOrWd;
    @XmlAttribute(name = "BaseLine")
    protected Integer baseLine;
    @XmlAttribute(name = "bold")
    protected Boolean bold;
    @XmlAttribute(name = "fontSize")
    protected Integer fontSize;

    public List<Object> getSpOrWd() {
        if (spOrWd == null) {
            spOrWd = new ArrayList<Object>();
        }
        return this.spOrWd;
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



}
