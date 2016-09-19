

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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormFieldValues", propOrder = {
    "field"
})
public class FormFieldValues  {

    @XmlElement(name = "Field")
    protected List<FormFieldValue> field;

    /**ArrayList is required for the XML-Marshalling */
    public void setField(ArrayList<FormFieldValue> value) {
        field=value;
    }

    /**Gets or sets the form field values which are applied when placing or rendering the stamp.*/
    public List<FormFieldValue> getField() {
        if (field == null) {
            field = new ArrayList<FormFieldValue>();
        }
        return this.field;
    }



}
