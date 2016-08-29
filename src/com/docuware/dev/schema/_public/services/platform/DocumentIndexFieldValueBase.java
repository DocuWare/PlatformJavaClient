

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentIndexFieldValueBase", propOrder = {
"itemElementName",
    "intOrDecimalOrString"
})
@XmlSeeAlso({
    SuggestionValue.class,
    DocumentIndexFieldValue.class,
    DocumentIndexField.class
})
public abstract class DocumentIndexFieldValueBase  {
    
private ItemChoiceType itemElementName;//test


    @XmlElements({
        @XmlElement(name = "Int", type = Long.class),
        @XmlElement(name = "Decimal", type = BigDecimal.class),
        @XmlElement(name = "String", type = String.class),
        @XmlElement(name = "Memo", type = String.class),
        @XmlElement(name = "Keywords", type = DocumentIndexFieldKeywords.class),
        @XmlElement(name = "Date", type = GregorianCalendar.class), 
        @XmlElement(name = "DateTime", type = GregorianCalendar.class)
    })
    protected Object intOrDecimalOrString;

    public Object getIntOrDecimalOrString() {
        return intOrDecimalOrString;
    }

    public void setIntOrDecimalOrString(Object value) {
        this.intOrDecimalOrString = value;
    }

    public ItemChoiceType getItemElementName() {
	return itemElementName;
    }

    public void setItemElementName(ItemChoiceType value) {
	itemElementName = value;
    }



}
