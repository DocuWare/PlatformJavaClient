

package com.docuware.dev._public.intellix;

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
@XmlType(name = "Rulerline")
public class Rulerline
    extends RectangleBase
 {

    @XmlAttribute(name = "lineWidth")
    protected Integer lineWidth;
    @XmlAttribute(name = "style")
    protected LineStyle style;

    public int getLineWidth() {
        if (lineWidth == null) {
            return  0;
        } else {
            return lineWidth;
        }
    }

    public void setLineWidth(Integer value) {
        this.lineWidth = value;
    }

    public LineStyle getStyle() {
        if (style == null) {
            return LineStyle.NONE;
        } else {
            return style;
        }
    }

    public void setStyle(LineStyle value) {
        this.style = value;
    }



}
