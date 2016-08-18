//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.08.18 um 09:47:39 AM CEST 
//


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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * Layer element. Contains annotations in a specific layer. Annotation can have up to 5 layers.
 * 
 * <p>Java-Klasse f�r Layer complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Layer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;choice>
 *           &lt;element name="Delete" type="{http://dev.docuware.com/schema/public/services/platform}DeleteEntry"/>
 *           &lt;element name="Text" type="{http://dev.docuware.com/schema/public/services/platform}TextEntry"/>
 *           &lt;element name="Rect" type="{http://dev.docuware.com/schema/public/services/platform}RectEntry"/>
 *           &lt;element name="Line" type="{http://dev.docuware.com/schema/public/services/platform}LineEntry"/>
 *           &lt;element name="PolyLine" type="{http://dev.docuware.com/schema/public/services/platform}PolyLineEntry"/>
 *           &lt;element name="TextStamp" type="{http://dev.docuware.com/schema/public/services/platform}TextStampEntry"/>
 *           &lt;element name="BitmapStamp" type="{http://dev.docuware.com/schema/public/services/platform}BitmapStampEntry"/>
 *           &lt;element name="PolyLineStamp" type="{http://dev.docuware.com/schema/public/services/platform}PolyLineStampEntry"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Layer", propOrder = {
    "deleteOrTextOrRect"
})
public class Layer  {

    @XmlElements({
        @XmlElement(name = "Delete", type = DeleteEntry.class),
        @XmlElement(name = "Text", type = TextEntry.class),
        @XmlElement(name = "Rect", type = RectEntry.class),
        @XmlElement(name = "Line", type = LineEntry.class),
        @XmlElement(name = "PolyLine", type = PolyLineEntry.class),
        @XmlElement(name = "TextStamp", type = TextStampEntry.class),
        @XmlElement(name = "BitmapStamp", type = BitmapStampEntry.class),
        @XmlElement(name = "PolyLineStamp", type = PolyLineStampEntry.class)
    })
    protected List<EntryBase> deleteOrTextOrRect;
    @XmlAttribute(name = "Id", required = true)
    protected int id;

    /**
     * Gets the value of the deleteOrTextOrRect property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deleteOrTextOrRect property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeleteOrTextOrRect().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeleteEntry }
     * {@link TextEntry }
     * {@link RectEntry }
     * {@link LineEntry }
     * {@link PolyLineEntry }
     * {@link TextStampEntry }
     * {@link BitmapStampEntry }
     * {@link PolyLineStampEntry }
     * 
     * 
     */
    public List<EntryBase> getDeleteOrTextOrRect() {
        if (deleteOrTextOrRect == null) {
            deleteOrTextOrRect = new ArrayList<EntryBase>();
        }
        return this.deleteOrTextOrRect;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }



}
