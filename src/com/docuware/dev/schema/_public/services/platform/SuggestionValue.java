

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuggestionValue", propOrder = {
    "source"
})
public class SuggestionValue
    extends DocumentIndexFieldValueBase
 {

    @XmlElement(name = "Source")
    protected PointAndShootInfo source;

    public PointAndShootInfo getSource() {
        return source;
    }

    public void setSource(PointAndShootInfo value) {
        this.source = value;
    }



}
