

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
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
@XmlType(name = "DocumentIndexField", propOrder = {
    "pointAndShootInfo"
})
public class DocumentIndexField
    extends DocumentIndexFieldValueBase
 {

    @XmlElement(name = "PointAndShootInfo")
    protected PointAndShootInfo pointAndShootInfo;
    @XmlAttribute(name = "FieldName", required = true)
    protected String fieldName;
    @XmlAttribute(name = "FieldLabel")
    protected String fieldLabel;
    @XmlAttribute(name = "IsNull")
    protected Boolean isNull;
    @XmlAttribute(name = "ReadOnly")
    protected Boolean readOnly;

    /**Contains one rectangle value for scalar field values and one or more values for keyword fields.*/
    public PointAndShootInfo getPointAndShootInfo() {
        return pointAndShootInfo;
    }

    /**Contains one rectangle value for scalar field values and one or more values for keyword fields.*/
    public void setPointAndShootInfo(PointAndShootInfo value) {
        this.pointAndShootInfo = value;
    }

    /**Contains the internal name of the field.*/
    public String getFieldName() {
        return fieldName;
    }

    /**Contains the internal name of the field.*/
    public void setFieldName(String value) {
        this.fieldName = value;
    }

    /**Contains the label of the field.*/
    public String getFieldLabel() {
        return fieldLabel;
    }

    /**Contains the label of the field.*/
    public void setFieldLabel(String value) {
        this.fieldLabel = value;
    }

    /**Indicates whether the field value is null or non-null.*/
    public boolean isIsNull() {
        if (isNull == null) {
            return false;
        } else {
            return isNull;
        }
    }

    /**Indicates whether the field value is null or non-null.*/
    public void setIsNull(Boolean value) {
        this.isNull = value;
    }

    /**Indicates whether this field is readonly or not.*/
    public boolean isReadOnly() {
        if (readOnly == null) {
            return false;
        } else {
            return readOnly;
        }
    }

    /**Indicates whether this field is readonly or not.*/
    public void setReadOnly(Boolean value) {
        this.readOnly = value;
    }


	/**
	* Creates a string field with the specified field name
	* 
	* @param fieldName	Name of the field
	* @param value	The value
	* @return	The new Field
	*/
    @Extension
    public static DocumentIndexField create(String fieldName,String value) {
	return Extensions.create(fieldName, value);
    }


	/**
	* Creates a date field with the specified field name
	* 
	* @param fieldName	Name of the field
	* @param value	The value
	* @return	The new Field
	*/
    @Extension
    public static DocumentIndexField create(String fieldName,GregorianCalendar value) {
	return Extensions.create(fieldName, value);
    }


	/**
	* Creates a integer field with the specified field name
	* 
	* @param fieldName	Name of the field
	* @param value	The value
	* @return	The new Field
	*/
    @Extension
    public static DocumentIndexField create(String fieldName,int value) {
	return Extensions.create(fieldName, value);
    }


	/**
	* Creates a double field with the specified field name
	* 
	* @param fieldName	Name of the field
	* @param value	The value
	* @return	The new Field
	*/
    @Extension
    public static DocumentIndexField create(String fieldName,double value) {
	return Extensions.create(fieldName, value);
    }


	/**
	* Creates a field with the specified field name
	* 
	* @param fieldName	Name of the field
	* @param value	The value
	* @return	The new Field
	*/
    @Extension
    public static DocumentIndexField create(String fieldName,DocumentIndexFieldKeywords value) {
	return Extensions.create(fieldName, value);
    }


	/**
	* Creates a date field with the specified field name
	* 
	* @param fieldName	Name of the field
	* @param value	The value
	* @return	The new Field
	*/
    @Extension
    public static DocumentIndexField createDate(String fieldName,GregorianCalendar value) {
	return Extensions.create(fieldName, value);
    }


	/**
	* Creates a date field with the specified field name
	* 
	* @param fieldName	Name of the field
	* @param value	The value
	* @return	The new Field
	*/
    @Extension
    public static DocumentIndexField createDate(String fieldName,int value) {
	return Extensions.create(fieldName, value);
    }


	/**
	* Creates a date field with the specified field name
	* 
	* @param fieldName	Name of the field
	* @param value	The value
	* @return	The new Field
	*/
    @Extension
    public static DocumentIndexField createDate(String fieldName,double value) {
	return Extensions.create(fieldName, value);
    }


	/**
	* Creates a date field with the specified field name
	* 
	* @param fieldName	Name of the field
	* @param value	The value
	* @return	The new Field
	*/
    @Extension
    public static DocumentIndexField createDate(String fieldName,DocumentIndexFieldKeywords value) {
	return Extensions.create(fieldName, value);
    }


	/**
	* Returns a String that represents this instance.
	* 
	* @return	A String that represents this instance.
	*/
    @Extension
    public String toString() {
	return Extensions.documentIndexFieldToString(this);
    }



}
