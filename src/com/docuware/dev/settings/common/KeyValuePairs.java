

package com.docuware.dev.settings.common;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyValuePairs", propOrder = {
    "entry"
})
public class KeyValuePairs  {

    @XmlElement(name = "Entry")
    protected List<KeyValuePair> entry;

    /**A key-value pair entry.*/
    public List<KeyValuePair> getEntry() {
        if (entry == null) {
            entry = new ArrayList<KeyValuePair>();
        }
        return this.entry;
    }



}
