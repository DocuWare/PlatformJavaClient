

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentIndexFieldValueBase", propOrder = {
    "intOrDecimalOrString"
})
@XmlSeeAlso({
    SuggestionValue.class,
    DocumentIndexFieldValue.class,
    DocumentIndexField.class
})
public abstract class DocumentIndexFieldValueBase  {

    @XmlElements({
        @XmlElement(name = "Int", type = Long.class),
        @XmlElement(name = "Decimal", type = BigDecimal.class),
        @XmlElement(name = "String", type = String.class),
        @XmlElement(name = "Keywords", type = DocumentIndexFieldKeywords.class),
        @XmlElement(name = "Date", type = XMLGregorianCalendar.class)
    })
    protected Object intOrDecimalOrString;

    public Object getIntOrDecimalOrString() {
        return intOrDecimalOrString;
    }

    public void setIntOrDecimalOrString(Object value) {
        this.intOrDecimalOrString = value;
    }



}
