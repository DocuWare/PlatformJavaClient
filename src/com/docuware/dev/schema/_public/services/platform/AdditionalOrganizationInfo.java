

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalOrganizationInfo", propOrder = {
    "companyNames",
    "addressLines"
})
public class AdditionalOrganizationInfo  {

    @XmlElement(name = "CompanyNames")
    protected List<String> companyNames;
    @XmlElement(name = "AddressLines")
    protected List<String> addressLines;
    @XmlAttribute(name = "Administrator", required = true)
    protected String administrator;
    @XmlAttribute(name = "EMail", required = true)
    protected String eMail;
    @XmlAttribute(name = "SystemNumber", required = true)
    protected String systemNumber;
    @XmlAttribute(name = "RuntimeVersion", required = true)
    protected String runtimeVersion;
    @XmlAttribute(name = "OrganizationType")
    protected String organizationType;

    /**Name of companies included in organization*/
    public List<String> getCompanyNames() {
        if (companyNames == null) {
            companyNames = new ArrayList<String>();
        }
        return this.companyNames;
    }

    /**Addresses of organization*/
    public List<String> getAddressLines() {
        if (addressLines == null) {
            addressLines = new ArrayList<String>();
        }
        return this.addressLines;
    }

    /**Name of the administrator*/
    public String getAdministrator() {
        return administrator;
    }

    /**Name of the administrator*/
    public void setAdministrator(String value) {
        this.administrator = value;
    }

    /**Contact email of organization*/
    public String getEMail() {
        return eMail;
    }

    /**Contact email of organization*/
    public void setEMail(String value) {
        this.eMail = value;
    }

    /**System number*/
    public String getSystemNumber() {
        return systemNumber;
    }

    /**System number*/
    public void setSystemNumber(String value) {
        this.systemNumber = value;
    }

    /**Runtime version of the DocuWare system*/
    public String getRuntimeVersion() {
        return runtimeVersion;
    }

    /**Runtime version of the DocuWare system*/
    public void setRuntimeVersion(String value) {
        this.runtimeVersion = value;
    }

    /**Type of the organization*/
    public String getOrganizationType() {
        return organizationType;
    }

    /**Type of the organization*/
    public void setOrganizationType(String value) {
        this.organizationType = value;
    }



}
