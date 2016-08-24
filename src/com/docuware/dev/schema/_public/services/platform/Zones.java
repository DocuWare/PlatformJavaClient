

package com.docuware.dev.schema._public.services.platform;

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
@XmlType(name = "Zones", propOrder = {
    "zone"
})
public class Zones  {

    @XmlElement(name = "Zone", required = true)
    protected List<Zone> zone;

    public List<Zone> getZone() {
        if (zone == null) {
            zone = new ArrayList<Zone>();
        }
        return this.zone;
    }



}
