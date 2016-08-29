

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextStamp", propOrder = {
    "font",
    "content"
})
public class TextStamp  {

    @XmlElement(name = "Font", required = true)
    protected Font font;
    @XmlElement(name = "Content", required = true)
    protected String content;

    /**The font of the text of the stamp.*/
    public Font getFont() {
        return font;
    }

    /**The font of the text of the stamp.*/
    public void setFont(Font value) {
        this.font = value;
    }

    /**The text to be displayed in the stamp.*/
    public String getContent() {
        return content;
    }

    /**The text to be displayed in the stamp.*/
    public void setContent(String value) {
        this.content = value;
    }



}
