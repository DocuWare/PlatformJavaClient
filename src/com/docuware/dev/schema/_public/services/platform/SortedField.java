

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
@XmlType(name = "SortedField")
public class SortedField  {

    @XmlAttribute(name = "Field", required = true)
    protected String field;
    @XmlAttribute(name = "Direction")
    protected SortDirection direction;

    /**Field name*/
    public String getField() {
        return field;
    }

    /**Field name*/
    public void setField(String value) {
        this.field = value;
    }

    /**A sort direction*/
    public SortDirection getDirection() {
        if (direction == null) {
            return SortDirection.ASC;
        } else {
            return direction;
        }
    }

    /**A sort direction*/
    public void setDirection(SortDirection value) {
        this.direction = value;
    }


	/**
	* Creates a sort order for the specified field.
	* 
	* @param fieldName	Name of the Field
	* @param sortDirection	The sort direction
	* @return	The sort order
	*/
    public static SortedField create(String fieldName,SortDirection sortDirection) {
	return Extensions.create(fieldName, sortDirection);
    }


	/**
	* Creates a sort order for the specified field.
	* 
	* @param fieldName	Name of the Field
	* @return	The sort order
	*/
    public static SortedField create(String fieldName) {
	return Extensions.create(fieldName);
    }



}
