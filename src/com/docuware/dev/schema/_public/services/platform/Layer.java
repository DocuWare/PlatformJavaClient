

package com.docuware.dev.schema._public.services.platform;

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
@XmlType(name = "Layer", propOrder = {
    "deleteOrTextOrRect"
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
    protected List<EntryBase> deleteOrTextOrRect;
    @XmlAttribute(name = "Id", required = true)
    protected int id;

    public List<EntryBase> getDeleteOrTextOrRect() {
        if (deleteOrTextOrRect == null) {
            deleteOrTextOrRect = new ArrayList<EntryBase>();
        }
        return this.deleteOrTextOrRect;
    }

    public int getId() {
        return id;
    }

    public void setId(int value) {
        this.id = value;
    }



}
