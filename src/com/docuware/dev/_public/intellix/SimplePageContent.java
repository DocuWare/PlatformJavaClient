

package com.docuware.dev._public.intellix;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimplePageContent", propOrder = {
    "w"
})
public class SimplePageContent  {

    @XmlElement(name = "W")
    protected List<SimpleWord> w;

    public List<SimpleWord> getW() {
        if (w == null) {
            w = new ArrayList<SimpleWord>();
        }
        return this.w;
    }



}
