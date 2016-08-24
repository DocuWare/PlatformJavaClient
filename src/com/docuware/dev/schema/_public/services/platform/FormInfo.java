

package com.docuware.dev.schema._public.services.platform;

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
@XmlType(name = "FormInfo", propOrder = {
    "configId",
    "name",
    "fields",
    "formProperties",
    "submissionOptions"
})
public class FormInfo  {

    @XmlElement(name = "ConfigId", required = true)
    protected String configId;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Fields", required = true)
    protected WebFormControls fields;
    @XmlElement(name = "FormProperties", required = true)
    protected FormProperties formProperties;
    @XmlElement(name = "SubmissionOptions", required = true)
    protected SubmissionOptions submissionOptions;
    @XmlAttribute(name = "Public")
    protected Boolean _public;

    /**Id of the form configuration used to retrieve full configuration*/
    public String getConfigId() {
        return configId;
    }

    /**Id of the form configuration used to retrieve full configuration*/
    public void setConfigId(String value) {
        this.configId = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    /**List of web form fields*/
    public WebFormControls getFields() {
        return fields;
    }

    /**List of web form fields*/
    public void setFields(WebFormControls value) {
        this.fields = value;
    }

    /**Form Properties*/
    public FormProperties getFormProperties() {
        return formProperties;
    }

    /**Form Properties*/
    public void setFormProperties(FormProperties value) {
        this.formProperties = value;
    }

    /**Submission Options*/
    public SubmissionOptions getSubmissionOptions() {
        return submissionOptions;
    }

    /**Submission Options*/
    public void setSubmissionOptions(SubmissionOptions value) {
        this.submissionOptions = value;
    }

    public Boolean isPublic() {
        return _public;
    }

    public void setPublic(Boolean value) {
        this._public = value;
    }



}
