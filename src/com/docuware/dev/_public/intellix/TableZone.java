//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.08.22 um 03:45:48 PM CEST 
//


package com.docuware.dev._public.intellix;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r TableZone complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="TableZone">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.docuware.com/public/intellix}RectangleBase">
 *       &lt;sequence>
 *         &lt;element name="gridT" type="{http://dev.docuware.com/public/intellix}gridTable"/>
 *         &lt;element name="Cz" type="{http://dev.docuware.com/public/intellix}CellZone" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TableZone", propOrder = {
    "gridT",
    "cz"
})
public class TableZone
    extends RectangleBase
 {

    @XmlElement(required = true)
    protected GridTable gridT;
    @XmlElement(name = "Cz", required = true)
    protected List<CellZone> cz;

    /**
     * Ruft den Wert der gridT-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link GridTable }
     *     
     */
    public GridTable getGridT() {
        return gridT;
    }

    /**
     * Legt den Wert der gridT-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link GridTable }
     *     
     */
    public void setGridT(GridTable value) {
        this.gridT = value;
    }

    /**
     * Gets the value of the cz property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cz property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCz().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CellZone }
     * 
     * 
     */
    public List<CellZone> getCz() {
        if (cz == null) {
            cz = new ArrayList<CellZone>();
        }
        return this.cz;
    }



}
