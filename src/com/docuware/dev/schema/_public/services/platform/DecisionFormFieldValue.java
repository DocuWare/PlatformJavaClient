

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DecisionFormFieldValue")
public class DecisionFormFieldValue
    extends FormFieldValue
 {

    @XmlAttribute(name = "BpwDataType")
    protected String bpwDataType;
    @XmlAttribute(name = "IsMultiSelect")
    protected Boolean isMultiSelect;
    @XmlAttribute(name = "IsMandatory")
    protected Boolean isMandatory;
    @XmlAttribute(name = "SelectListOnly")
    protected Boolean selectListOnly;
    @XmlAttribute(name = "SelectListGuid")
    protected String selectListGuid;
    @XmlAttribute(name = "FilterGuid")
    protected String filterGuid;
    @XmlAttribute(name = "AdditionalParameter", required = true)
    protected int additionalParameter;
    @XmlAttribute(name = "VariableName")
    protected String variableName;

    public String getBpwDataType() {
        return bpwDataType;
    }

    public void setBpwDataType(String value) {
        this.bpwDataType = value;
    }

    public boolean isIsMultiSelect() {
        if (isMultiSelect == null) {
            return false;
        } else {
            return isMultiSelect;
        }
    }

    public void setIsMultiSelect(Boolean value) {
        this.isMultiSelect = value;
    }

    public boolean isIsMandatory() {
        if (isMandatory == null) {
            return false;
        } else {
            return isMandatory;
        }
    }

    public void setIsMandatory(Boolean value) {
        this.isMandatory = value;
    }

    public boolean isSelectListOnly() {
        if (selectListOnly == null) {
            return false;
        } else {
            return selectListOnly;
        }
    }

    public void setSelectListOnly(Boolean value) {
        this.selectListOnly = value;
    }

    public String getSelectListGuid() {
        return selectListGuid;
    }

    public void setSelectListGuid(String value) {
        this.selectListGuid = value;
    }

    public String getFilterGuid() {
        return filterGuid;
    }

    public void setFilterGuid(String value) {
        this.filterGuid = value;
    }

    public int getAdditionalParameter() {
        return additionalParameter;
    }

    public void setAdditionalParameter(int value) {
        this.additionalParameter = value;
    }

    @Dolphin
    public String getVariableName() {
        return variableName;
    }

    @Dolphin
    public void setVariableName(String value) {
        this.variableName = value;
    }



}
