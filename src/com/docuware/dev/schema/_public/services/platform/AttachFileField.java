

package com.docuware.dev.schema._public.services.platform;

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


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachFileField", propOrder = {
    "fileTypes",
    "maxFileSize",
    "minFileCount",
    "maxFileCount",
    "width",
    "showFileInfo",
    "attachFileInfos"
})
public class AttachFileField
    extends WebFormField
 {

    @XmlElement(name = "FileTypes", required = true)
    protected String fileTypes;
    @XmlElement(name = "MaxFileSize")
    protected int maxFileSize;
    @XmlElement(name = "MinFileCount")
    protected int minFileCount;
    @XmlElement(name = "MaxFileCount")
    protected int maxFileCount;
    @XmlElement(name = "Width")
    protected int width;
    @XmlElement(name = "ShowFileInfo")
    protected boolean showFileInfo;
    @XmlElement(name = "AttachFileInfos", required = true)
    protected List<AttachFileInfo> attachFileInfos;

    public String getFileTypes() {
        return fileTypes;
    }

    public void setFileTypes(String value) {
        this.fileTypes = value;
    }

    public int getMaxFileSize() {
        return maxFileSize;
    }

    public void setMaxFileSize(int value) {
        this.maxFileSize = value;
    }

    public int getMinFileCount() {
        return minFileCount;
    }

    public void setMinFileCount(int value) {
        this.minFileCount = value;
    }

    public int getMaxFileCount() {
        return maxFileCount;
    }

    public void setMaxFileCount(int value) {
        this.maxFileCount = value;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int value) {
        this.width = value;
    }

    public boolean isShowFileInfo() {
        return showFileInfo;
    }

    public void setShowFileInfo(boolean value) {
        this.showFileInfo = value;
    }

    public List<AttachFileInfo> getAttachFileInfos() {
        if (attachFileInfos == null) {
            attachFileInfos = new ArrayList<AttachFileInfo>();
        }
        return this.attachFileInfos;
    }



}
