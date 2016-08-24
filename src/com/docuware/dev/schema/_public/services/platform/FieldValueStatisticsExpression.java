

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FieldValueStatisticsExpression")
public class FieldValueStatisticsExpression  {

    @XmlAttribute(name = "FieldName")
    protected String fieldName;
    @XmlAttribute(name = "Limit")
    protected Integer limit;

    /**The database name of the field.*/
    public String getFieldName() {
        return fieldName;
    }

    /**The database name of the field.*/
    public void setFieldName(String value) {
        this.fieldName = value;
    }

    /**Limit the number of hits that are returned.*/
    public int getLimit() {
        if (limit == null) {
            return  0;
        } else {
            return limit;
        }
    }

    /**Limit the number of hits that are returned.*/
    public void setLimit(Integer value) {
        this.limit = value;
    }



}
