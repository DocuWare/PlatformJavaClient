

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
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewerToolbar", propOrder = {
    "controls"
})
public class ViewerToolbar  {

    @XmlElement(name = "Controls")
    protected ViewerToolbar.Controls controls;
    @XmlAttribute(name = "Type", required = true)
    protected ViewerToolbarType type;
    @XmlAttribute(name = "Position", required = true)
    protected ToolbarPosition position;
    @XmlAttribute(name = "Visibility", required = true)
    protected ToolbarVisibility visibility;

    public ViewerToolbar.Controls getControls() {
        return controls;
    }

    public void setControls(ViewerToolbar.Controls value) {
        this.controls = value;
    }

    public ViewerToolbarType getType() {
        return type;
    }

    public void setType(ViewerToolbarType value) {
        this.type = value;
    }

    public ToolbarPosition getPosition() {
        return position;
    }

    public void setPosition(ToolbarPosition value) {
        this.position = value;
    }

    public ToolbarVisibility getVisibility() {
        return visibility;
    }

    public void setVisibility(ToolbarVisibility value) {
        this.visibility = value;
    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "toolbarControl"
    })
    public static class Controls {

        @XmlElement(name = "ToolbarControl")
        protected List<ViewerToolbarControl> toolbarControl;

        public List<ViewerToolbarControl> getToolbarControl() {
            if (toolbarControl == null) {
                toolbarControl = new ArrayList<ViewerToolbarControl>();
            }
            return this.toolbarControl;
        }

    }



}
