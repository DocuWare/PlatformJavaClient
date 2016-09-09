

package com.docuware.dev._public.intellix;

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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.settings.common.KeyValuePairs;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PageContent", propOrder = {
    "items",
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
    protected List<RectangleBase> items;
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

    /**ArrayList is required for the XML-Marshalling */
    public void setItems(ArrayList<RectangleBase> value) {
        items=value;
    }

    public List<RectangleBase> getItems() {
        if (items == null) {
            items = new ArrayList<RectangleBase>();
        }
        return this.items;
    }

    /**ArrayList is required for the XML-Marshalling */
    public void setBarCodes(ArrayList<BarCodeZone> value) {
        barCodes=value;
    }

    public List<BarCodeZone> getBarCodes() {
        if (barCodes == null) {
            barCodes = new ArrayList<BarCodeZone>();
        }
        return this.barCodes;
    }

    public KeyValuePairs getMetadata() {
        return metadata;
    }

    public void setMetadata(KeyValuePairs value) {
        this.metadata = value;
    }

    /**ArrayList is required for the XML-Marshalling */
    public void setCandidates(ArrayList<CandidateInfo> value) {
        candidates=value;
    }

    public List<CandidateInfo> getCandidates() {
        if (candidates == null) {
            candidates = new ArrayList<CandidateInfo>();
        }
        return this.candidates;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String value) {
        this.lang = value;
    }

    public LanguageDetection getLanguageDetection() {
        if (languageDetection == null) {
            return LanguageDetection.EXPLICITE;
        } else {
            return languageDetection;
        }
    }

    public void setLanguageDetection(LanguageDetection value) {
        this.languageDetection = value;
    }

    public int getCandidateDetectionVersion() {
        if (candidateDetectionVersion == null) {
            return  0;
        } else {
            return candidateDetectionVersion;
        }
    }

    public void setCandidateDetectionVersion(Integer value) {
        this.candidateDetectionVersion = value;
    }

    /**The page width in pixel.*/
    public int getSizeX() {
        return sizeX;
    }

    /**The page width in pixel.*/
    public void setSizeX(int value) {
        this.sizeX = value;
    }

    /**The page height in pixel.*/
    public int getSizeY() {
        return sizeY;
    }

    /**The page height in pixel.*/
    public void setSizeY(int value) {
        this.sizeY = value;
    }

    /**The skew angle in degree denoting the amount by which the document image has to be rotated clockwise in order to match the text shot.*/
    public double getSkewAngle() {
        if (skewAngle == null) {
            return  0.0D;
        } else {
            return skewAngle;
        }
    }

    /**The skew angle in degree denoting the amount by which the document image has to be rotated clockwise in order to match the text shot.*/
    public void setSkewAngle(Double value) {
        this.skewAngle = value;
    }

    /**The rotation angle of the page.*/
    public Rotation getRotation() {
        if (rotation == null) {
            return Rotation.ROTATE_0_DEGREE;
        } else {
            return rotation;
        }
    }

    /**The rotation angle of the page.*/
    public void setRotation(Rotation value) {
        this.rotation = value;
    }

    /**A tag identifiying the file the page was created from.*/
    public String getFileTag() {
        return fileTag;
    }

    /**A tag identifiying the file the page was created from.*/
    public void setFileTag(String value) {
        this.fileTag = value;
    }

    public double getHorizontalDpi() {
        return horizontalDpi;
    }

    public void setHorizontalDpi(double value) {
        this.horizontalDpi = value;
    }

    public double getVerticalDpi() {
        return verticalDpi;
    }

    public void setVerticalDpi(double value) {
        this.verticalDpi = value;
    }



}
