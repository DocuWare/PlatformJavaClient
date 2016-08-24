

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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rights", propOrder = {
    "right"
})
public class Rights  {

    @XmlElement(name = "Right")
    @XmlSchemaType(name = "string")
    protected List<Right> right;

    /**List of rights.*/
    public List<Right> getRight() {
        if (right == null) {
            right = new ArrayList<Right>();
        }
        return this.right;
    }



}
