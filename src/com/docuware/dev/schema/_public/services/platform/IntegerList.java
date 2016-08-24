

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
@XmlType(name = "IntegerList", propOrder = {
    "_int"
})
public class IntegerList  {

    @XmlElement(name = "Int", type = Integer.class)
    protected List<Integer> _int;

    /**A list of integers values*/
    public List<Integer> getInt() {
        if (_int == null) {
            _int = new ArrayList<Integer>();
        }
        return this._int;
    }



}
