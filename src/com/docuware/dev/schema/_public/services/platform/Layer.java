

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Layer", propOrder = {
    "items"
})
public class Layer  {

    @XmlElements({
        @XmlElement(name = "Delete", type = DeleteEntry.class),
        @XmlElement(name = "Text", type = TextEntry.class),
        @XmlElement(name = "Rect", type = RectEntry.class),
        @XmlElement(name = "Line", type = LineEntry.class),
        @XmlElement(name = "PolyLine", type = PolyLineEntry.class),
        @XmlElement(name = "TextStamp", type = TextStampEntry.class),
        @XmlElement(name = "BitmapStamp", type = BitmapStampEntry.class),
        @XmlElement(name = "PolyLineStamp", type = PolyLineStampEntry.class)
    })
    protected List<EntryBase> items;
    @XmlAttribute(name = "Id", required = true)
    protected int id;

    /**ArrayList is required for the XML-Marshalling */
    public void setItems(ArrayList<EntryBase> value) {
        items=value;
    }

    public List<EntryBase> getItems() {
        if (items == null) {
            items = new ArrayList<EntryBase>();
        }
        return this.items;
    }

    public int getId() {
        return id;
    }

    public void setId(int value) {
        this.id = value;
    }



}
