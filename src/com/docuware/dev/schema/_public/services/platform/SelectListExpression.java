

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectListExpression", propOrder = {
    "dialogExpression",
    "valuePrefix"
})
public class SelectListExpression  {

    @XmlElement(name = "DialogExpression")
    protected DialogExpression dialogExpression;
    @XmlElement(name = "ValuePrefix")
    protected String valuePrefix;
    @XmlAttribute(name = "FieldName", required = true)
    protected String fieldName;
    @XmlAttribute(name = "Count")
    protected Integer count;
    @XmlAttribute(name = "Start")
    protected Integer start;
    @XmlAttribute(name = "Limit")
    protected Integer limit;
    @XmlAttribute(name = "SortDirection")
    protected SortDirection sortDirection;
    @XmlAttribute(name = "ExcludeExternal")
    protected Boolean excludeExternal;

    /**The expression with already filled values.*/
    public DialogExpression getDialogExpression() {
        return dialogExpression;
    }

    /**The expression with already filled values.*/
    public void setDialogExpression(DialogExpression value) {
        this.dialogExpression = value;
    }

    /**A possible prefix of value of the field to be filled.*/
    public String getValuePrefix() {
        return valuePrefix;
    }

    /**A possible prefix of value of the field to be filled.*/
    public void setValuePrefix(String value) {
        this.valuePrefix = value;
    }

    /**The database name of the dialog field to be filled.*/
    public String getFieldName() {
        return fieldName;
    }

    /**The database name of the dialog field to be filled.*/
    public void setFieldName(String value) {
        this.fieldName = value;
    }

    /**Result will be returned on pages with that block size if specified. If set to default (0) select lists will be returnen in one block using Limit parameter.*/
    @Eagle
    public int getCount() {
        if (count == null) {
            return  0;
        } else {
            return count;
        }
    }

    @Eagle
    public void setCount(Integer value) {
        this.count = value;
    }

    /**First result to return if block size is specified*/
    @Eagle
    public int getStart() {
        if (start == null) {
            return  0;
        } else {
            return start;
        }
    }

    /**First result to return if block size is specified*/
    @Eagle
    public void setStart(Integer value) {
        this.start = value;
    }

    /**Limit the number of hits that are returned if no block size is specified*/
    public int getLimit() {
        if (limit == null) {
            return  0;
        } else {
            return limit;
        }
    }

    /**Limit the number of hits that are returned if no block size is specified*/
    public void setLimit(Integer value) {
        this.limit = value;
    }

    /**Define sort order of the select list*/
    @Eagle
    public SortDirection getSortDirection() {
        if (sortDirection == null) {
            return SortDirection.DEFAULT;
        } else {
            return sortDirection;
        }
    }

    /**Define sort order of the select list*/
    @Eagle
    public void setSortDirection(SortDirection value) {
        this.sortDirection = value;
    }

    /**Determines whether to return values from external select lists*/
    @Gecko
    public boolean isExcludeExternal() {
        if (excludeExternal == null) {
            return false;
        } else {
            return excludeExternal;
        }
    }

    /**Determines whether to return values from external select lists*/
    @Gecko
    public void setExcludeExternal(Boolean value) {
        this.excludeExternal = value;
    }



}
