

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldsList", propOrder = {
    "field"
})
public class FieldsList  {

    @XmlElement(name = "Field")
    protected List<String> field;

    /**A list of fields*/
    public List<String> getField() {
        if (field == null) {
            field = new ArrayList<String>();
        }
        return this.field;
    }



}
