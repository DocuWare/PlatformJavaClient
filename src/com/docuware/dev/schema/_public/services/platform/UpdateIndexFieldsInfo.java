

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
@XmlType(name = "UpdateIndexFieldsInfo")
public class UpdateIndexFieldsInfo
    extends DocumentIndexFields
 {

    @XmlAttribute(name = "DialogId")
    protected String dialogId;
    @XmlAttribute(name = "NormalizeCoordinates")
    protected Boolean normalizeCoordinates;

    /**Define dialog which is used to update the fields. Used to override data that is not exposed to the user.*/
    public String getDialogId() {
        return dialogId;
    }

    /**Define dialog which is used to update the fields. Used to override data that is not exposed to the user.*/
    public void setDialogId(String value) {
        this.dialogId = value;
    }

    /**If this flag is true then the orientation of the coordinates in PointAndShootInfo will be alligned with the page.*/
    @Eagle
    public boolean isNormalizeCoordinates() {
        if (normalizeCoordinates == null) {
            return false;
        } else {
            return normalizeCoordinates;
        }
    }

    /**If this flag is true then the orientation of the coordinates in PointAndShootInfo will be alligned with the page.*/
    @Eagle
    public void setNormalizeCoordinates(Boolean value) {
        this.normalizeCoordinates = value;
    }



}
