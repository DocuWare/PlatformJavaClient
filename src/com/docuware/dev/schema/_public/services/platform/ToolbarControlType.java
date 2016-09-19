

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "ToolbarControlType")
@XmlEnum
@CompareIgnore
public enum ToolbarControlType {

    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Nav_DocumentNumber")
    NAV_DOCUMENT_NUMBER("Nav_DocumentNumber"),
    @XmlEnumValue("Nav_FirstDocument")
    NAV_FIRST_DOCUMENT("Nav_FirstDocument"),
    @XmlEnumValue("Nav_PreviousDocument")
    NAV_PREVIOUS_DOCUMENT("Nav_PreviousDocument"),
    @XmlEnumValue("Nav_NextDocument")
    NAV_NEXT_DOCUMENT("Nav_NextDocument"),
    @XmlEnumValue("Nav_LastDocument")
    NAV_LAST_DOCUMENT("Nav_LastDocument"),
    @XmlEnumValue("Nav_FileNumber")
    NAV_FILE_NUMBER("Nav_FileNumber"),
    @XmlEnumValue("Nav_FirstFile")
    NAV_FIRST_FILE("Nav_FirstFile"),
    @XmlEnumValue("Nav_PreviousFile")
    NAV_PREVIOUS_FILE("Nav_PreviousFile"),
    @XmlEnumValue("Nav_NextFile")
    NAV_NEXT_FILE("Nav_NextFile"),
    @XmlEnumValue("Nav_LastFile")
    NAV_LAST_FILE("Nav_LastFile"),
    @XmlEnumValue("Nav_PageNumber")
    NAV_PAGE_NUMBER("Nav_PageNumber"),
    @XmlEnumValue("Nav_FirstPage")
    NAV_FIRST_PAGE("Nav_FirstPage"),
    @XmlEnumValue("Nav_PreviousPage")
    NAV_PREVIOUS_PAGE("Nav_PreviousPage"),
    @XmlEnumValue("Nav_NextPage")
    NAV_NEXT_PAGE("Nav_NextPage"),
    @XmlEnumValue("Nav_LastPage")
    NAV_LAST_PAGE("Nav_LastPage"),
    @XmlEnumValue("Tools_Save")
    TOOLS_SAVE("Tools_Save"),
    @XmlEnumValue("Tools_Edit")
    TOOLS_EDIT("Tools_Edit"),
    @XmlEnumValue("Tools_PrintDocument")
    TOOLS_PRINT_DOCUMENT("Tools_PrintDocument"),
    @XmlEnumValue("Tools_SendDocument")
    TOOLS_SEND_DOCUMENT("Tools_SendDocument"),
    @XmlEnumValue("Tools_ShowDocumentInformation")
    TOOLS_SHOW_DOCUMENT_INFORMATION("Tools_ShowDocumentInformation"),
    @XmlEnumValue("Tools_ShowDocumentOverview")
    TOOLS_SHOW_DOCUMENT_OVERVIEW("Tools_ShowDocumentOverview"),
    @XmlEnumValue("Tools_FulltextSearch")
    TOOLS_FULLTEXT_SEARCH("Tools_FulltextSearch"),
    @XmlEnumValue("Tools_FulltextSearchContinue")
    TOOLS_FULLTEXT_SEARCH_CONTINUE("Tools_FulltextSearchContinue"),
    @XmlEnumValue("Tools_TextAnnotation")
    TOOLS_TEXT_ANNOTATION("Tools_TextAnnotation"),
    @XmlEnumValue("Tools_Checksum")
    TOOLS_CHECKSUM("Tools_Checksum"),
    @XmlEnumValue("Tools_Download")
    TOOLS_DOWNLOAD("Tools_Download"),
    @XmlEnumValue("Tools_PointAndShoot")
    TOOLS_POINT_AND_SHOOT("Tools_PointAndShoot"),
    @XmlEnumValue("Tools_ShootToClipboard")
    TOOLS_SHOOT_TO_CLIPBOARD("Tools_ShootToClipboard"),
    @XmlEnumValue("Tools_WorkflowHistory")
    TOOLS_WORKFLOW_HISTORY("Tools_WorkflowHistory"),
    @XmlEnumValue("Tools_GetLink")
    TOOLS_GET_LINK("Tools_GetLink"),
    @XmlEnumValue("Display_FitToWidth")
    DISPLAY_FIT_TO_WIDTH("Display_FitToWidth"),
    @XmlEnumValue("Display_FitToWidthNoMargins")
    DISPLAY_FIT_TO_WIDTH_NO_MARGINS("Display_FitToWidthNoMargins"),
    @XmlEnumValue("Display_FullDocument")
    DISPLAY_FULL_DOCUMENT("Display_FullDocument"),
    @XmlEnumValue("Display_ZoomIn")
    DISPLAY_ZOOM_IN("Display_ZoomIn"),
    @XmlEnumValue("Display_ZoomOut")
    DISPLAY_ZOOM_OUT("Display_ZoomOut"),
    @XmlEnumValue("Display_ZoomNumber")
    DISPLAY_ZOOM_NUMBER("Display_ZoomNumber"),
    @XmlEnumValue("Display_MagnifyingGlass")
    DISPLAY_MAGNIFYING_GLASS("Display_MagnifyingGlass"),
    @XmlEnumValue("Display_DisplayEnhancement")
    DISPLAY_DISPLAY_ENHANCEMENT("Display_DisplayEnhancement"),
    @XmlEnumValue("Display_Invert")
    DISPLAY_INVERT("Display_Invert"),
    @XmlEnumValue("Display_RotateLeft")
    DISPLAY_ROTATE_LEFT("Display_RotateLeft"),
    @XmlEnumValue("Display_RotateRight")
    DISPLAY_ROTATE_RIGHT("Display_RotateRight"),
    @XmlEnumValue("Display_SaveRotation")
    DISPLAY_SAVE_ROTATION("Display_SaveRotation"),
    @XmlEnumValue("Display_ImageEnhancement")
    DISPLAY_IMAGE_ENHANCEMENT("Display_ImageEnhancement"),
    @XmlEnumValue("Display_MergeLayers")
    DISPLAY_MERGE_LAYERS("Display_MergeLayers"),
    @XmlEnumValue("Display_ShowOverlay1")
    DISPLAY_SHOW_OVERLAY_1("Display_ShowOverlay1"),
    @XmlEnumValue("Display_ShowOverlay2")
    DISPLAY_SHOW_OVERLAY_2("Display_ShowOverlay2"),
    @XmlEnumValue("Display_ShowOverlay3")
    DISPLAY_SHOW_OVERLAY_3("Display_ShowOverlay3"),
    @XmlEnumValue("Display_ShowOverlay4")
    DISPLAY_SHOW_OVERLAY_4("Display_ShowOverlay4"),
    @XmlEnumValue("Display_ShowOverlay5")
    DISPLAY_SHOW_OVERLAY_5("Display_ShowOverlay5"),
    @XmlEnumValue("Annotations_Select")
    ANNOTATIONS_SELECT("Annotations_Select"),
    @XmlEnumValue("Annotations_Delete")
    ANNOTATIONS_DELETE("Annotations_Delete"),
    @XmlEnumValue("Annotations_Text")
    ANNOTATIONS_TEXT("Annotations_Text"),
    @XmlEnumValue("Annotations_Marker")
    ANNOTATIONS_MARKER("Annotations_Marker"),
    @XmlEnumValue("Annotations_Line")
    ANNOTATIONS_LINE("Annotations_Line"),
    @XmlEnumValue("Annotations_FreehandLine")
    ANNOTATIONS_FREEHAND_LINE("Annotations_FreehandLine"),
    @XmlEnumValue("Annotations_Arrow")
    ANNOTATIONS_ARROW("Annotations_Arrow"),
    @XmlEnumValue("Annotations_Rectangle")
    ANNOTATIONS_RECTANGLE("Annotations_Rectangle"),
    @XmlEnumValue("Annotations_Ellipse")
    ANNOTATIONS_ELLIPSE("Annotations_Ellipse"),
    @XmlEnumValue("Annotations_FilledEllipse")
    ANNOTATIONS_FILLED_ELLIPSE("Annotations_FilledEllipse"),
    @XmlEnumValue("Annotations_FilledRectangle")
    ANNOTATIONS_FILLED_RECTANGLE("Annotations_FilledRectangle"),
    @XmlEnumValue("Annotations_TransparentEllipse")
    ANNOTATIONS_TRANSPARENT_ELLIPSE("Annotations_TransparentEllipse"),
    @XmlEnumValue("Annotations_TransparentRectangle")
    ANNOTATIONS_TRANSPARENT_RECTANGLE("Annotations_TransparentRectangle");
    private final String value;

    ToolbarControlType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ToolbarControlType fromValue(String v) {
        for (ToolbarControlType c: ToolbarControlType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }



}
