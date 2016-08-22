//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.08.22 um 03:45:48 PM CEST 
//


package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;
import java.util.GregorianCalendar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r DocumentIndexField complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DocumentIndexField">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.docuware.com/schema/public/services/platform}DocumentIndexFieldValueBase">
 *       &lt;sequence>
 *         &lt;element name="PointAndShootInfo" type="{http://dev.docuware.com/schema/public/services/platform}PointAndShootInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="FieldName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FieldLabel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IsNull" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ReadOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
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

    /**
     * Ruft den Wert der pointAndShootInfo-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link PointAndShootInfo }
     *     
     */
    public PointAndShootInfo getPointAndShootInfo() {
        return pointAndShootInfo;
    }

    /**
     * Legt den Wert der pointAndShootInfo-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link PointAndShootInfo }
     *     
     */
    public void setPointAndShootInfo(PointAndShootInfo value) {
        this.pointAndShootInfo = value;
    }

    /**
     * Ruft den Wert der fieldName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Legt den Wert der fieldName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldName(String value) {
        this.fieldName = value;
    }

    /**
     * Ruft den Wert der fieldLabel-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldLabel() {
        return fieldLabel;
    }

    /**
     * Legt den Wert der fieldLabel-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldLabel(String value) {
        this.fieldLabel = value;
    }

    /**
     * Ruft den Wert der isNull-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsNull() {
        if (isNull == null) {
            return false;
        } else {
            return isNull;
        }
    }

    /**
     * Legt den Wert der isNull-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNull(Boolean value) {
        this.isNull = value;
    }

    /**
     * Ruft den Wert der readOnly-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isReadOnly() {
        if (readOnly == null) {
            return false;
        } else {
            return readOnly;
        }
    }

    /**
     * Legt den Wert der readOnly-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
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
    public static DocumentIndexField createDate(String fieldName,DocumentIndexFieldKeywords value) {
	return Extensions.create(fieldName, value);
    }


	/**
	* Returns a String that represents this instance.
	* 
	* @return	A String that represents this instance.
	*/
    public String toString() {
	return Extensions.documentIndexFieldToString(this);
    }



}
