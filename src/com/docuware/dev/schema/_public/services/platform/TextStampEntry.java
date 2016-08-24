

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
@XmlType(name = "TextStampEntry", propOrder = {
    "font",
    "value"
})
public class TextStampEntry
    extends StampBase
 {

    @XmlElement(name = "Font", required = true)
    protected Font font;
    @XmlElement(name = "Value", required = true)
    protected String value;

    /**Font that is used for the text of the stamp.*/
    public Font getFont() {
        return font;
    }

    /**Font that is used for the text of the stamp.*/
    public void setFont(Font value) {
        this.font = value;
    }

    /**Text that stamp will show.*/
    public String getValue() {
        return value;
    }

    /**Text that stamp will show.*/
    public void setValue(String value) {
        this.value = value;
    }



}
