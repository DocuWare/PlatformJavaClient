

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CFSStatisticGeneral", propOrder = {
    "statisticSpecific"
})
public class CFSStatisticGeneral  {

    @XmlElement(name = "StatisticSpecific", required = true)
    protected List<CFSStatisticSpecific> statisticSpecific;
    @XmlAttribute(name = "CustomerID", required = true)
    protected String customerID;
    @XmlAttribute(name = "ModuleName", required = true)
    protected String moduleName;
    @XmlAttribute(name = "CreatedAt", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdAt;

    public List<CFSStatisticSpecific> getStatisticSpecific() {
        if (statisticSpecific == null) {
            statisticSpecific = new ArrayList<CFSStatisticSpecific>();
        }
        return this.statisticSpecific;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String value) {
        this.customerID = value;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String value) {
        this.moduleName = value;
    }

    public XMLGregorianCalendar getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(XMLGregorianCalendar value) {
        this.createdAt = value;
    }



}
