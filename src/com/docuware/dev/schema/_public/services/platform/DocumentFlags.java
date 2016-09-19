

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
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentFlags")
public class DocumentFlags  {

    @XmlAttribute(name = "IsCold")
    protected Boolean isCold;
    @XmlAttribute(name = "IsDBRecord")
    protected Boolean isDBRecord;
    @XmlAttribute(name = "IsCheckedOut")
    protected Boolean isCheckedOut;
    @XmlAttribute(name = "IsCopyRightProtected")
    protected Boolean isCopyRightProtected;
    @XmlAttribute(name = "IsVoiceAvailable")
    protected Boolean isVoiceAvailable;
    @XmlAttribute(name = "HasAppendedDocuments")
    protected Boolean hasAppendedDocuments;
    @XmlAttribute(name = "IsProtected")
    protected Boolean isProtected;
    @XmlAttribute(name = "IsDeleted")
    protected Boolean isDeleted;
    @XmlAttribute(name = "IsEmail")
    protected Boolean isEmail;

    /**Readonly flag. It will be overriden if set.*/
    public boolean isIsCold() {
        if (isCold == null) {
            return false;
        } else {
            return isCold;
        }
    }

    public void setIsCold(Boolean value) {
        this.isCold = value;
    }

    /**Readonly flag. It will be overriden if set.*/
    public boolean isIsDBRecord() {
        if (isDBRecord == null) {
            return false;
        } else {
            return isDBRecord;
        }
    }

    public void setIsDBRecord(Boolean value) {
        this.isDBRecord = value;
    }

    /**Readonly flag. It will be overriden if set.*/
    public boolean isIsCheckedOut() {
        if (isCheckedOut == null) {
            return false;
        } else {
            return isCheckedOut;
        }
    }

    public void setIsCheckedOut(Boolean value) {
        this.isCheckedOut = value;
    }

    /**Readonly flag. It will be overriden if set.*/
    public boolean isIsCopyRightProtected() {
        if (isCopyRightProtected == null) {
            return false;
        } else {
            return isCopyRightProtected;
        }
    }

    public void setIsCopyRightProtected(Boolean value) {
        this.isCopyRightProtected = value;
    }

    /**Readonly flag. It will be overriden if set.*/
    public boolean isIsVoiceAvailable() {
        if (isVoiceAvailable == null) {
            return false;
        } else {
            return isVoiceAvailable;
        }
    }

    public void setIsVoiceAvailable(Boolean value) {
        this.isVoiceAvailable = value;
    }

    /**Readonly flag. It will be overriden if set.*/
    public boolean isHasAppendedDocuments() {
        if (hasAppendedDocuments == null) {
            return false;
        } else {
            return hasAppendedDocuments;
        }
    }

    public void setHasAppendedDocuments(Boolean value) {
        this.hasAppendedDocuments = value;
    }

    /**Readonly flag. It will be overriden if set.*/
    public boolean isIsProtected() {
        if (isProtected == null) {
            return false;
        } else {
            return isProtected;
        }
    }

    public void setIsProtected(Boolean value) {
        this.isProtected = value;
    }

    /**Readonly flag. It will be overriden if set.*/
    public boolean isIsDeleted() {
        if (isDeleted == null) {
            return false;
        } else {
            return isDeleted;
        }
    }

    public void setIsDeleted(Boolean value) {
        this.isDeleted = value;
    }

    /**Read-write flag.*/
    public boolean isIsEmail() {
        if (isEmail == null) {
            return false;
        } else {
            return isEmail;
        }
    }

    /**Read-write flag.*/
    public void setIsEmail(Boolean value) {
        this.isEmail = value;
    }



}
