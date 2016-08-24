

package com.docuware.dev._public.intellix;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BarCodeZone", propOrder = {
    "value"
})
public class BarCodeZone
    extends RectangleBase
 {

    @XmlElement(name = "Value")
    protected String value;
    @XmlAttribute(name = "BarcodeType")
    protected String barcodeType;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getBarcodeType() {
        return barcodeType;
    }

    public void setBarcodeType(String value) {
        this.barcodeType = value;
    }



}
