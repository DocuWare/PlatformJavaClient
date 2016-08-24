

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StampBase", propOrder = {
    "location",
    "headFont"
})
@XmlSeeAlso({
    TextStampEntry.class,
    BitmapStampEntry.class,
    PolyLineStampEntry.class
})
public class StampBase
    extends EntryBase
 {

    @XmlElement(name = "Location", required = true)
    protected AnnotationRectangle location;
    @XmlElement(name = "HeadFont", required = true)
    protected Font headFont;
    @XmlAttribute(name = "Signature")
    protected StampSignatureType signature;
    @XmlAttribute(name = "UserName")
    protected String userName;
    @XmlAttribute(name = "Visible")
    protected Boolean visible;
    @XmlAttribute(name = "Frame")
    protected Boolean frame;
    @XmlAttribute(name = "ShowUser")
    protected Boolean showUser;
    @XmlAttribute(name = "ShowDate")
    protected Boolean showDate;
    @XmlAttribute(name = "ShowTime")
    protected Boolean showTime;
    @XmlAttribute(name = "SigScopeInfo")
    protected String sigScopeInfo;

    /**Location of the stamp.*/
    public AnnotationRectangle getLocation() {
        return location;
    }

    /**Location of the stamp.*/
    public void setLocation(AnnotationRectangle value) {
        this.location = value;
    }

    /**Font of the header of the stamp.*/
    public Font getHeadFont() {
        return headFont;
    }

    /**Font of the header of the stamp.*/
    public void setHeadFont(Font value) {
        this.headFont = value;
    }

    /**Define the sigiture of the stamp.*/
    public StampSignatureType getSignature() {
        if (signature == null) {
            return StampSignatureType.NO;
        } else {
            return signature;
        }
    }

    /**Define the sigiture of the stamp.*/
    public void setSignature(StampSignatureType value) {
        this.signature = value;
    }

    /**Full user name of the person that has set the stamp.*/
    public String getUserName() {
        return userName;
    }

    /**Full user name of the person that has set the stamp.*/
    public void setUserName(String value) {
        this.userName = value;
    }

    /**Define if stamp is visible.*/
    public boolean isVisible() {
        if (visible == null) {
            return true;
        } else {
            return visible;
        }
    }

    /**Define if stamp is visible.*/
    public void setVisible(Boolean value) {
        this.visible = value;
    }

    /**Define if stamp has visible frame.*/
    public boolean isFrame() {
        if (frame == null) {
            return true;
        } else {
            return frame;
        }
    }

    /**Define if stamp has visible frame.*/
    public void setFrame(Boolean value) {
        this.frame = value;
    }

    /**Define if stamp show the user who placed the stamp.*/
    public boolean isShowUser() {
        if (showUser == null) {
            return true;
        } else {
            return showUser;
        }
    }

    /**Define if stamp show the user who placed the stamp.*/
    public void setShowUser(Boolean value) {
        this.showUser = value;
    }

    /**Define if stamp show date when stamp is placed.*/
    public boolean isShowDate() {
        if (showDate == null) {
            return true;
        } else {
            return showDate;
        }
    }

    /**Define if stamp show date when stamp is placed.*/
    public void setShowDate(Boolean value) {
        this.showDate = value;
    }

    /**Define if stamp show the time when stamp is placed.*/
    public boolean isShowTime() {
        if (showTime == null) {
            return true;
        } else {
            return showTime;
        }
    }

    /**Define if stamp show the time when stamp is placed.*/
    public void setShowTime(Boolean value) {
        this.showTime = value;
    }

    /**Signature scope. Describes what is signed with this stamp.*/
    public String getSigScopeInfo() {
        return sigScopeInfo;
    }

    /**Signature scope. Describes what is signed with this stamp.*/
    public void setSigScopeInfo(String value) {
        this.sigScopeInfo = value;
    }



}
