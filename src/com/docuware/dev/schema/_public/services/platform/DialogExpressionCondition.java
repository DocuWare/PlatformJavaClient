

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
@XmlType(name = "DialogExpressionCondition", propOrder = {
    "value"
})
public class DialogExpressionCondition  {

    @XmlElement(name = "Value", required = true, nillable = true)
    protected List<String> value;
    @XmlAttribute(name = "DBName")
    protected String dbName;

    /**ArrayList is required for the XML-Marshalling */
    public void setValue(ArrayList<String> value) {
        value=value;
    }

    /**Specifies the value or the expression of the dialog field.*/
    public List<String> getValue() {
        if (value == null) {
            value = new ArrayList<String>();
        }
        return this.value;
    }

    /**Gets or sets the database name which provides the value checked against the condition.*/
    public String getDBName() {
        return dbName;
    }

    public void setDBName(String value) {
        this.dbName = value;
    }


	/**
	* Creates a condition for an exact search at the specified field.
	* 
	* @param fieldName	Name of the Field
	* @param value	The search value
	* @return	The codition
	*/
    @Extension
    public static DialogExpressionCondition create(String fieldName,String value) {
	return Extensions.createDia(fieldName, value);
    }


	/**
	* Creates a condition for an exact search at the specified field.
	* 
	* @param fieldName	Name of the Field
	* @param valueFrom	The value from
	* @param valueTo	The value to
	* @return	The condition
	*/
    @Extension
    public static DialogExpressionCondition create(String fieldName,String valueFrom,String valueTo) {
	return Extensions.create(fieldName, valueFrom, valueTo);
    }



}
