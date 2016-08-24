

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WebFormField", propOrder = {
    "value",
    "type",
    "required",
    "hint"
})
@XmlSeeAlso({
    RadioGroup.class,
    SignatureField.class,
    Headline.class,
    CheckGroup.class,
    DateField.class,
    ImageField.class,
    DropDownList.class,
    AttachFileField.class,
    FixedText.class,
    TextField.class
})
public abstract class WebFormField
    extends WebFormControl
 {

    @XmlElement(name = "Value", required = true)
    protected String value;
    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "Required")
    protected boolean required;
    @XmlElement(name = "Hint", required = true)
    protected String hint;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String value) {
        this.type = value;
    }

    public boolean isRequired() {
        return required;
    }

    public void setRequired(boolean value) {
        this.required = value;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String value) {
        this.hint = value;
    }



}
