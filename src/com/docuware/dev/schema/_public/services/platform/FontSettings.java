

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FontSettings")
public class FontSettings  {

    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "Size", required = true)
    protected String size;
    @XmlAttribute(name = "Bold", required = true)
    protected boolean bold;
    @XmlAttribute(name = "Italic", required = true)
    protected boolean italic;
    @XmlAttribute(name = "Underline", required = true)
    protected boolean underline;
    @XmlAttribute(name = "Strikeout", required = true)
    protected boolean strikeout;

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String value) {
        this.size = value;
    }

    public boolean isBold() {
        return bold;
    }

    public void setBold(boolean value) {
        this.bold = value;
    }

    public boolean isItalic() {
        return italic;
    }

    public void setItalic(boolean value) {
        this.italic = value;
    }

    public boolean isUnderline() {
        return underline;
    }

    public void setUnderline(boolean value) {
        this.underline = value;
    }

    public boolean isStrikeout() {
        return strikeout;
    }

    public void setStrikeout(boolean value) {
        this.strikeout = value;
    }



}
