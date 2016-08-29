

package com.docuware.dev.schema._public.services.annotations;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkRelation", propOrder = {
    "invoke"
})
public class LinkRelation  {

    @XmlElement(name = "Invoke")
    protected List<LinkInvoke> invoke;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "IntroducedIn")
    protected String introducedIn;

    public List<LinkInvoke> getInvoke() {
        if (invoke == null) {
            invoke = new ArrayList<LinkInvoke>();
        }
        return this.invoke;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getIntroducedIn() {
        return introducedIn;
    }

    public void setIntroducedIn(String value) {
        this.introducedIn = value;
    }



}
