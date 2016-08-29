

package com.docuware.dev.schema._public.services.platform;

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
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewerPreferences", propOrder = {
    "annotations",
    "toolbars"
})
public class ViewerPreferences  {

    @XmlElement(name = "Annotations", required = true)
    protected ViewerPreferences.Annotations annotations;
    @XmlElement(name = "Toolbars", required = true)
    protected ViewerPreferences.Toolbars toolbars;
    @XmlAttribute(name = "Id", required = true)
    protected String id;
    @XmlAttribute(name = "LeftToolbarState", required = true)
    protected ToolbarVisibility leftToolbarState;
    @XmlAttribute(name = "RightToolbarState", required = true)
    protected ToolbarVisibility rightToolbarState;
    @XmlAttribute(name = "ExpandStatusbar", required = true)
    protected boolean expandStatusbar;

    public ViewerPreferences.Annotations getAnnotations() {
        return annotations;
    }

    public void setAnnotations(ViewerPreferences.Annotations value) {
        this.annotations = value;
    }

    public ViewerPreferences.Toolbars getToolbars() {
        return toolbars;
    }

    public void setToolbars(ViewerPreferences.Toolbars value) {
        this.toolbars = value;
    }

    /**The ID of the Viewer preferences.*/
    public String getId() {
        return id;
    }

    /**The ID of the Viewer preferences.*/
    public void setId(String value) {
        this.id = value;
    }

    public ToolbarVisibility getLeftToolbarState() {
        return leftToolbarState;
    }

    public void setLeftToolbarState(ToolbarVisibility value) {
        this.leftToolbarState = value;
    }

    public ToolbarVisibility getRightToolbarState() {
        return rightToolbarState;
    }

    public void setRightToolbarState(ToolbarVisibility value) {
        this.rightToolbarState = value;
    }

    public boolean isExpandStatusbar() {
        return expandStatusbar;
    }

    public void setExpandStatusbar(boolean value) {
        this.expandStatusbar = value;
    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "annotationTool"
    })
    public static class Annotations {

        @XmlElement(name = "AnnotationTool")
        protected List<AnnotationToolSettings> annotationTool;

        public List<AnnotationToolSettings> getAnnotationTool() {
            if (annotationTool == null) {
                annotationTool = new ArrayList<AnnotationToolSettings>();
            }
            return this.annotationTool;
        }

    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "toolbar"
    })
    public static class Toolbars {

        @XmlElement(name = "Toolbar")
        protected List<ViewerToolbar> toolbar;

        public List<ViewerToolbar> getToolbar() {
            if (toolbar == null) {
                toolbar = new ArrayList<ViewerToolbar>();
            }
            return this.toolbar;
        }

    }



}
