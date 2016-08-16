//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.08.16 um 09:04:54 AM CEST 
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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.settings.common.KeyValuePairs;


/**
 * <p>Java-Klasse f�r PageContent complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="PageContent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element name="TextZone" type="{http://dev.docuware.com/public/intellix}TextZone"/>
 *           &lt;element name="PictureZone" type="{http://dev.docuware.com/public/intellix}PictureZone"/>
 *           &lt;element name="TableZone" type="{http://dev.docuware.com/public/intellix}TableZone"/>
 *           &lt;element name="rulerline" type="{http://dev.docuware.com/public/intellix}Rulerline"/>
 *         &lt;/choice>
 *         &lt;element name="BarCodes" type="{http://dev.docuware.com/public/intellix}BarCodeZone" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="metadata" type="{http://dev.docuware.com/settings/common}KeyValuePairs" minOccurs="0"/>
 *         &lt;element name="Candidates" type="{http://dev.docuware.com/public/intellix}CandidateInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://dev.docuware.com/public/intellix}ResolutionAttributes"/>
 *       &lt;attribute name="Lang" type="{http://dev.docuware.com/public/intellix}Languages" />
 *       &lt;attribute name="LanguageDetection" type="{http://dev.docuware.com/public/intellix}LanguageDetection" default="Explicite" />
 *       &lt;attribute name="CandidateDetectionVersion" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *       &lt;attribute name="SizeX" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="SizeY" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="SkewAngle" type="{http://www.w3.org/2001/XMLSchema}double" default="0.0" />
 *       &lt;attribute name="Rotation" type="{http://dev.docuware.com/public/intellix}Rotation" default="Rotate0Degree" />
 *       &lt;attribute name="FileTag" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PageContent", propOrder = {
    "textZoneOrPictureZoneOrTableZone",
    "barCodes",
    "metadata",
    "candidates"
})
public class PageContent  {

    @XmlElements({
        @XmlElement(name = "TextZone", type = TextZone.class),
        @XmlElement(name = "PictureZone", type = PictureZone.class),
        @XmlElement(name = "TableZone", type = TableZone.class),
        @XmlElement(name = "rulerline", type = Rulerline.class)
    })
    protected List<RectangleBase> textZoneOrPictureZoneOrTableZone;
    @XmlElement(name = "BarCodes")
    protected List<BarCodeZone> barCodes;
    protected KeyValuePairs metadata;
    @XmlElement(name = "Candidates")
    protected List<CandidateInfo> candidates;
    @XmlAttribute(name = "Lang")
    protected String lang;
    @XmlAttribute(name = "LanguageDetection")
    protected LanguageDetection languageDetection;
    @XmlAttribute(name = "CandidateDetectionVersion")
    protected Integer candidateDetectionVersion;
    @XmlAttribute(name = "SizeX", required = true)
    protected int sizeX;
    @XmlAttribute(name = "SizeY", required = true)
    protected int sizeY;
    @XmlAttribute(name = "SkewAngle")
    protected Double skewAngle;
    @XmlAttribute(name = "Rotation")
    protected Rotation rotation;
    @XmlAttribute(name = "FileTag")
    protected String fileTag;
    @XmlAttribute(name = "HorizontalDpi", required = true)
    protected double horizontalDpi;
    @XmlAttribute(name = "VerticalDpi", required = true)
    protected double verticalDpi;

    /**
     * Gets the value of the textZoneOrPictureZoneOrTableZone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textZoneOrPictureZoneOrTableZone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextZoneOrPictureZoneOrTableZone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextZone }
     * {@link PictureZone }
     * {@link TableZone }
     * {@link Rulerline }
     * 
     * 
     */
    public List<RectangleBase> getTextZoneOrPictureZoneOrTableZone() {
        if (textZoneOrPictureZoneOrTableZone == null) {
            textZoneOrPictureZoneOrTableZone = new ArrayList<RectangleBase>();
        }
        return this.textZoneOrPictureZoneOrTableZone;
    }

    /**
     * Gets the value of the barCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the barCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBarCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BarCodeZone }
     * 
     * 
     */
    public List<BarCodeZone> getBarCodes() {
        if (barCodes == null) {
            barCodes = new ArrayList<BarCodeZone>();
        }
        return this.barCodes;
    }

    /**
     * Ruft den Wert der metadata-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link KeyValuePairs }
     *     
     */
    public KeyValuePairs getMetadata() {
        return metadata;
    }

    /**
     * Legt den Wert der metadata-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyValuePairs }
     *     
     */
    public void setMetadata(KeyValuePairs value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the candidates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the candidates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCandidates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CandidateInfo }
     * 
     * 
     */
    public List<CandidateInfo> getCandidates() {
        if (candidates == null) {
            candidates = new ArrayList<CandidateInfo>();
        }
        return this.candidates;
    }

    /**
     * Ruft den Wert der lang-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Legt den Wert der lang-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Ruft den Wert der languageDetection-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link LanguageDetection }
     *     
     */
    public LanguageDetection getLanguageDetection() {
        if (languageDetection == null) {
            return LanguageDetection.EXPLICITE;
        } else {
            return languageDetection;
        }
    }

    /**
     * Legt den Wert der languageDetection-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageDetection }
     *     
     */
    public void setLanguageDetection(LanguageDetection value) {
        this.languageDetection = value;
    }

    /**
     * Ruft den Wert der candidateDetectionVersion-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getCandidateDetectionVersion() {
        if (candidateDetectionVersion == null) {
            return  0;
        } else {
            return candidateDetectionVersion;
        }
    }

    /**
     * Legt den Wert der candidateDetectionVersion-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCandidateDetectionVersion(Integer value) {
        this.candidateDetectionVersion = value;
    }

    /**
     * Ruft den Wert der sizeX-Eigenschaft ab.
     * 
     */
    public int getSizeX() {
        return sizeX;
    }

    /**
     * Legt den Wert der sizeX-Eigenschaft fest.
     * 
     */
    public void setSizeX(int value) {
        this.sizeX = value;
    }

    /**
     * Ruft den Wert der sizeY-Eigenschaft ab.
     * 
     */
    public int getSizeY() {
        return sizeY;
    }

    /**
     * Legt den Wert der sizeY-Eigenschaft fest.
     * 
     */
    public void setSizeY(int value) {
        this.sizeY = value;
    }

    /**
     * Ruft den Wert der skewAngle-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getSkewAngle() {
        if (skewAngle == null) {
            return  0.0D;
        } else {
            return skewAngle;
        }
    }

    /**
     * Legt den Wert der skewAngle-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSkewAngle(Double value) {
        this.skewAngle = value;
    }

    /**
     * Ruft den Wert der rotation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Rotation }
     *     
     */
    public Rotation getRotation() {
        if (rotation == null) {
            return Rotation.ROTATE_0_DEGREE;
        } else {
            return rotation;
        }
    }

    /**
     * Legt den Wert der rotation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Rotation }
     *     
     */
    public void setRotation(Rotation value) {
        this.rotation = value;
    }

    /**
     * Ruft den Wert der fileTag-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileTag() {
        return fileTag;
    }

    /**
     * Legt den Wert der fileTag-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileTag(String value) {
        this.fileTag = value;
    }

    /**
     * Ruft den Wert der horizontalDpi-Eigenschaft ab.
     * 
     */
    public double getHorizontalDpi() {
        return horizontalDpi;
    }

    /**
     * Legt den Wert der horizontalDpi-Eigenschaft fest.
     * 
     */
    public void setHorizontalDpi(double value) {
        this.horizontalDpi = value;
    }

    /**
     * Ruft den Wert der verticalDpi-Eigenschaft ab.
     * 
     */
    public double getVerticalDpi() {
        return verticalDpi;
    }

    /**
     * Legt den Wert der verticalDpi-Eigenschaft fest.
     * 
     */
    public void setVerticalDpi(double value) {
        this.verticalDpi = value;
    }



}
