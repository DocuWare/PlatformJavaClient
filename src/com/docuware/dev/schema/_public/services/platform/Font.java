

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Font")
public class Font  {

    @XmlAttribute(name = "FontName", required = true)
    protected String fontName;
    @XmlAttribute(name = "Bold")
    protected Boolean bold;
    @XmlAttribute(name = "Italic")
    protected Boolean italic;
    @XmlAttribute(name = "Underlined")
    protected Boolean underlined;
    @XmlAttribute(name = "StrikeThrough")
    protected Boolean strikeThrough;
    @XmlAttribute(name = "FontSize", required = true)
    protected int fontSize;
    @XmlAttribute(name = "Spacing")
    protected Integer spacing;

    /**Define name of the font.*/
    public String getFontName() {
        return fontName;
    }

    /**Define name of the font.*/
    public void setFontName(String value) {
        this.fontName = value;
    }

    /**Define bold text.*/
    public boolean isBold() {
        if (bold == null) {
            return false;
        } else {
            return bold;
        }
    }

    /**Define bold text.*/
    public void setBold(Boolean value) {
        this.bold = value;
    }

    /**Define italic text.*/
    public boolean isItalic() {
        if (italic == null) {
            return false;
        } else {
            return italic;
        }
    }

    /**Define italic text.*/
    public void setItalic(Boolean value) {
        this.italic = value;
    }

    /**Define underlined text.*/
    public boolean isUnderlined() {
        if (underlined == null) {
            return false;
        } else {
            return underlined;
        }
    }

    /**Define underlined text.*/
    public void setUnderlined(Boolean value) {
        this.underlined = value;
    }

    /**Define striked text.*/
    public boolean isStrikeThrough() {
        if (strikeThrough == null) {
            return false;
        } else {
            return strikeThrough;
        }
    }

    /**Define striked text.*/
    public void setStrikeThrough(Boolean value) {
        this.strikeThrough = value;
    }

    /**The font size in twpis. E.g. a font of size 10pt has a value of 200.*/
    public int getFontSize() {
        return fontSize;
    }

    /**The font size in twpis. E.g. a font of size 10pt has a value of 200.*/
    public void setFontSize(int value) {
        this.fontSize = value;
    }

    /**Character spacing in twips. Extra distance between characters. It may be negative.*/
    public int getSpacing() {
        if (spacing == null) {
            return  0;
        } else {
            return spacing;
        }
    }

    /**Character spacing in twips. Extra distance between characters. It may be negative.*/
    public void setSpacing(Integer value) {
        this.spacing = value;
    }



}
