//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.08.18 um 09:47:39 AM CEST 
//


package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r ToolbarControlType.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="ToolbarControlType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Nav_DocumentNumber"/>
 *     &lt;enumeration value="Nav_FirstDocument"/>
 *     &lt;enumeration value="Nav_PreviousDocument"/>
 *     &lt;enumeration value="Nav_NextDocument"/>
 *     &lt;enumeration value="Nav_LastDocument"/>
 *     &lt;enumeration value="Nav_FileNumber"/>
 *     &lt;enumeration value="Nav_FirstFile"/>
 *     &lt;enumeration value="Nav_PreviousFile"/>
 *     &lt;enumeration value="Nav_NextFile"/>
 *     &lt;enumeration value="Nav_LastFile"/>
 *     &lt;enumeration value="Nav_PageNumber"/>
 *     &lt;enumeration value="Nav_FirstPage"/>
 *     &lt;enumeration value="Nav_PreviousPage"/>
 *     &lt;enumeration value="Nav_NextPage"/>
 *     &lt;enumeration value="Nav_LastPage"/>
 *     &lt;enumeration value="Tools_Save"/>
 *     &lt;enumeration value="Tools_Edit"/>
 *     &lt;enumeration value="Tools_PrintDocument"/>
 *     &lt;enumeration value="Tools_SendDocument"/>
 *     &lt;enumeration value="Tools_ShowDocumentInformation"/>
 *     &lt;enumeration value="Tools_ShowDocumentOverview"/>
 *     &lt;enumeration value="Tools_FulltextSearch"/>
 *     &lt;enumeration value="Tools_FulltextSearchContinue"/>
 *     &lt;enumeration value="Tools_TextAnnotation"/>
 *     &lt;enumeration value="Tools_Checksum"/>
 *     &lt;enumeration value="Tools_Download"/>
 *     &lt;enumeration value="Tools_PointAndShoot"/>
 *     &lt;enumeration value="Tools_ShootToClipboard"/>
 *     &lt;enumeration value="Tools_WorkflowHistory"/>
 *     &lt;enumeration value="Tools_GetLink"/>
 *     &lt;enumeration value="Display_FitToWidth"/>
 *     &lt;enumeration value="Display_FitToWidthNoMargins"/>
 *     &lt;enumeration value="Display_FullDocument"/>
 *     &lt;enumeration value="Display_ZoomIn"/>
 *     &lt;enumeration value="Display_ZoomOut"/>
 *     &lt;enumeration value="Display_ZoomNumber"/>
 *     &lt;enumeration value="Display_MagnifyingGlass"/>
 *     &lt;enumeration value="Display_DisplayEnhancement"/>
 *     &lt;enumeration value="Display_Invert"/>
 *     &lt;enumeration value="Display_RotateLeft"/>
 *     &lt;enumeration value="Display_RotateRight"/>
 *     &lt;enumeration value="Display_SaveRotation"/>
 *     &lt;enumeration value="Display_ImageEnhancement"/>
 *     &lt;enumeration value="Display_MergeLayers"/>
 *     &lt;enumeration value="Display_ShowOverlay1"/>
 *     &lt;enumeration value="Display_ShowOverlay2"/>
 *     &lt;enumeration value="Display_ShowOverlay3"/>
 *     &lt;enumeration value="Display_ShowOverlay4"/>
 *     &lt;enumeration value="Display_ShowOverlay5"/>
 *     &lt;enumeration value="Annotations_Select"/>
 *     &lt;enumeration value="Annotations_Delete"/>
 *     &lt;enumeration value="Annotations_Text"/>
 *     &lt;enumeration value="Annotations_Marker"/>
 *     &lt;enumeration value="Annotations_Line"/>
 *     &lt;enumeration value="Annotations_FreehandLine"/>
 *     &lt;enumeration value="Annotations_Arrow"/>
 *     &lt;enumeration value="Annotations_Rectangle"/>
 *     &lt;enumeration value="Annotations_Ellipse"/>
 *     &lt;enumeration value="Annotations_FilledEllipse"/>
 *     &lt;enumeration value="Annotations_FilledRectangle"/>
 *     &lt;enumeration value="Annotations_TransparentEllipse"/>
 *     &lt;enumeration value="Annotations_TransparentRectangle"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ToolbarControlType")
@XmlEnum
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
