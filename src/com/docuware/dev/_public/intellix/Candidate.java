

package com.docuware.dev._public.intellix;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Candidate", propOrder = {
    "type",
    "originalValue",
    "foundValue",
    "l",
    "t",
    "w",
    "h",
    "line",
    "index",
    "length",
    "decimalOrDateOrText",
    "foundWithLanguages",
    "correctLanguageTo",
    "impliesCultures"
})
public class Candidate  {

    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "OriginalValue", required = true)
    protected String originalValue;
    @XmlElement(name = "FoundValue", required = true)
    protected String foundValue;
    @XmlElement(name = "L")
    protected int l;
    @XmlElement(name = "T")
    protected int t;
    @XmlElement(name = "W")
    protected int w;
    @XmlElement(name = "H")
    protected int h;
    @XmlElement(name = "Line")
    protected int line;
    @XmlElement(name = "Index")
    protected int index;
    @XmlElement(name = "Length")
    protected int length;
    @XmlElements({
        @XmlElement(name = "Decimal", type = BigDecimal.class),
        @XmlElement(name = "Date", type = GregorianCalendar.class),
        @XmlElement(name = "Text", type = String.class)
    })
    protected Object decimalOrDateOrText;
    @XmlElement(name = "FoundWithLanguages")
    protected List<String> foundWithLanguages;
    @XmlElement(name = "CorrectLanguageTo")
    protected List<String> correctLanguageTo;
    @XmlElement(name = "ImpliesCultures")
    protected List<String> impliesCultures;

    public String getType() {
        return type;
    }

    public void setType(String value) {
        this.type = value;
    }

    public String getOriginalValue() {
        return originalValue;
    }

    public void setOriginalValue(String value) {
        this.originalValue = value;
    }

    public String getFoundValue() {
        return foundValue;
    }

    public void setFoundValue(String value) {
        this.foundValue = value;
    }

    public int getL() {
        return l;
    }

    public void setL(int value) {
        this.l = value;
    }

    public int getT() {
        return t;
    }

    public void setT(int value) {
        this.t = value;
    }

    public int getW() {
        return w;
    }

    public void setW(int value) {
        this.w = value;
    }

    public int getH() {
        return h;
    }

    public void setH(int value) {
        this.h = value;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int value) {
        this.line = value;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int value) {
        this.index = value;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int value) {
        this.length = value;
    }

    public Object getDecimalOrDateOrText() {
        return decimalOrDateOrText;
    }

    public void setDecimalOrDateOrText(Object value) {
        this.decimalOrDateOrText = value;
    }

    public List<String> getFoundWithLanguages() {
        if (foundWithLanguages == null) {
            foundWithLanguages = new ArrayList<String>();
        }
        return this.foundWithLanguages;
    }

    public List<String> getCorrectLanguageTo() {
        if (correctLanguageTo == null) {
            correctLanguageTo = new ArrayList<String>();
        }
        return this.correctLanguageTo;
    }

    public List<String> getImpliesCultures() {
        if (impliesCultures == null) {
            impliesCultures = new ArrayList<String>();
        }
        return this.impliesCultures;
    }



}
