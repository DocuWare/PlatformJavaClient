

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;
import com.docuware.dev.schema._public.services.platform.SelectListResult;
import com.docuware.dev.schema._public.services.platform.SelectListExpression;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.schema._public.services.Links;
import com.docuware.dev.settings.interop.DWFieldType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DialogField", propOrder = {
"proxy",
    "mask",
    "maskErrorText",
    "sampleEditText",
    "prefillValue",
    "dynamicPrefillValue",
    "selectListInfos",
    "links"
})
public class DialogField  implements IRelationsWithProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Mask")
    protected String mask;
    @XmlElement(name = "MaskErrorText", required = true)
    protected String maskErrorText;
    @XmlElement(name = "SampleEditText", required = true)
    protected String sampleEditText;
    @XmlElement(name = "PrefillValue")
    protected List<DocumentIndexFieldValue> prefillValue;
    @XmlElement(name = "DynamicPrefillValue")
    @XmlSchemaType(name = "string")
    protected List<DynamicValueType> dynamicPrefillValue;
    @XmlElement(name = "SelectListInfos")
    protected SelectListInfos selectListInfos;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services")
    protected Links links;
    @XmlAttribute(name = "DBFieldName", required = true)
    protected String dbFieldName;
    @XmlAttribute(name = "DlgLabel")
    protected String dlgLabel;
    @XmlAttribute(name = "DWFieldType", required = true)
    protected DWFieldType dwFieldType;
    @XmlAttribute(name = "Locked")
    protected Boolean locked;
    @XmlAttribute(name = "ReadOnly")
    protected Boolean readOnly;
    @XmlAttribute(name = "NotEmpty")
    protected Boolean notEmpty;
    @XmlAttribute(name = "Visible")
    protected Boolean visible;
    @XmlAttribute(name = "Length")
    protected Integer length;
    @XmlAttribute(name = "Precision")
    protected Integer precision;
    @XmlAttribute(name = "AllowExtendedSearch")
    protected Boolean allowExtendedSearch;
    @XmlAttribute(name = "UsedAsDocumentName")
    protected Boolean usedAsDocumentName;
    @XmlAttribute(name = "IsHierarchy")
    protected Boolean isHierarchy;
    @XmlAttribute(name = "AllowFiltering")
    protected Boolean allowFiltering;
    @XmlAttribute(name = "SelectListOnly")
    protected Boolean selectListOnly;
    @XmlAttribute(name = "SelectListType")
    protected SelectListType selectListType;
    @XmlAttribute(name = "AssignedInternalSelectList")
    protected Boolean assignedInternalSelectList;
    @XmlAttribute(name = "SequenceId")
    protected String sequenceId;

    /**Mask(regular expression) for limiting the input options for the field.*/
    public String getMask() {
        return mask;
    }

    /**Mask(regular expression) for limiting the input options for the field.*/
    public void setMask(String value) {
        this.mask = value;
    }

    /**Error message to display if the input does not match the mask definition.*/
    public String getMaskErrorText() {
        return maskErrorText;
    }

    /**Error message to display if the input does not match the mask definition.*/
    public void setMaskErrorText(String value) {
        this.maskErrorText = value;
    }

    /**Sample entry that matches the mask definition.*/
    @Dolphin
    public String getSampleEditText() {
        return sampleEditText;
    }

    /**Sample entry that matches the mask definition.*/
    @Dolphin
    public void setSampleEditText(String value) {
        this.sampleEditText = value;
    }

    /**ArrayList is required for the XML-Marshalling */
    public void setPrefillValue(ArrayList<DocumentIndexFieldValue> value) {
        prefillValue=value;
    }

    /**The default value of the field(s). If DynamicPrefillValue is not empty this property should be ignored.*/
    public List<DocumentIndexFieldValue> getPrefillValue() {
        if (prefillValue == null) {
            prefillValue = new ArrayList<DocumentIndexFieldValue>();
        }
        return this.prefillValue;
    }

    /**ArrayList is required for the XML-Marshalling */
    public void setDynamicPrefillValue(ArrayList<DynamicValueType> value) {
        dynamicPrefillValue=value;
    }

    /**Dynamic (CurrentDate, CurrentDatetime, etc.) default value of the field(s).If this element is not empty PrefilValue shoud be ignored.*/
    @Eagle
    public List<DynamicValueType> getDynamicPrefillValue() {
        if (dynamicPrefillValue == null) {
            dynamicPrefillValue = new ArrayList<DynamicValueType>();
        }
        return this.dynamicPrefillValue;
    }

    /**Gets a list with information for all assigned select lists.*/
    @Hawk
    public SelectListInfos getSelectListInfos() {
        return selectListInfos;
    }

    /**Gets a list with information for all assigned select lists.*/
    @Hawk
    public void setSelectListInfos(SelectListInfos value) {
        this.selectListInfos = value;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links value) {
        this.links = value;
    }

    /**Name of field in the file cabinet.*/
    public String getDBFieldName() {
        return dbFieldName;
    }

    /**Name of field in the file cabinet.*/
    public void setDBFieldName(String value) {
        this.dbFieldName = value;
    }

    /**Label (display name) of the field.*/
    public String getDlgLabel() {
        return dlgLabel;
    }

    /**Label (display name) of the field.*/
    public void setDlgLabel(String value) {
        this.dlgLabel = value;
    }

    /**The DocuWare type of the field.*/
    public DWFieldType getDWFieldType() {
        return dwFieldType;
    }

    /**The DocuWare type of the field.*/
    public void setDWFieldType(DWFieldType value) {
        this.dwFieldType = value;
    }

    /**Determines whether the value of the field cannot be changed by the user.*/
    public boolean isLocked() {
        if (locked == null) {
            return false;
        } else {
            return locked;
        }
    }

    /**Determines whether the value of the field cannot be changed by the user.*/
    public void setLocked(Boolean value) {
        this.locked = value;
    }

    /**Determines whether the field is read only, considering Locked property and user rights(Modify Right for info dialog, Write Right for store dialog)*/
    public boolean isReadOnly() {
        if (readOnly == null) {
            return false;
        } else {
            return readOnly;
        }
    }

    /**Determines whether the field is read only, considering Locked property and user rights(Modify Right for info dialog, Write Right for store dialog)*/
    public void setReadOnly(Boolean value) {
        this.readOnly = value;
    }

    /**Determines whether the field can be empty, considering NotEmpty in Field settings and Field may be empty Right*/
    public boolean isNotEmpty() {
        if (notEmpty == null) {
            return false;
        } else {
            return notEmpty;
        }
    }

    public void setNotEmpty(Boolean value) {
        this.notEmpty = value;
    }

    /**Determines whether the field is visible.*/
    public boolean isVisible() {
        if (visible == null) {
            return false;
        } else {
            return visible;
        }
    }

    /**Determines whether the field is visible.*/
    public void setVisible(Boolean value) {
        this.visible = value;
    }

    /**Length of the field (for text fields).*/
    public int getLength() {
        if (length == null) {
            return -1;
        } else {
            return length;
        }
    }

    /**Length of the field (for text fields).*/
    public void setLength(Integer value) {
        this.length = value;
    }

    /**The precision of this dialog field. This is derived from the file cabinet fields precision.*/
    public int getPrecision() {
        if (precision == null) {
            return  0;
        } else {
            return precision;
        }
    }

    /**The precision of this dialog field. This is derived from the file cabinet fields precision.*/
    public void setPrecision(Integer value) {
        this.precision = value;
    }

    /**Use extended search*/
    public boolean isAllowExtendedSearch() {
        if (allowExtendedSearch == null) {
            return false;
        } else {
            return allowExtendedSearch;
        }
    }

    /**Use extended search*/
    public void setAllowExtendedSearch(Boolean value) {
        this.allowExtendedSearch = value;
    }

    /**Determines whether the field is used as document name.*/
    public boolean isUsedAsDocumentName() {
        if (usedAsDocumentName == null) {
            return false;
        } else {
            return usedAsDocumentName;
        }
    }

    /**Determines whether the field is used as document name.*/
    public void setUsedAsDocumentName(Boolean value) {
        this.usedAsDocumentName = value;
    }

    /**Determines whether the field is part of the hierarchy structure of tree view result dialog (only for tree view result dialogs, for other types it's always false).*/
    @Dolphin
    public boolean isIsHierarchy() {
        if (isHierarchy == null) {
            return false;
        } else {
            return isHierarchy;
        }
    }

    /**Determines whether the field is part of the hierarchy structure of tree view result dialog (only for tree view result dialogs, for other types it's always false).*/
    @Dolphin
    public void setIsHierarchy(Boolean value) {
        this.isHierarchy = value;
    }

    /**Allow extended filtering.*/
    public boolean isAllowFiltering() {
        if (allowFiltering == null) {
            return false;
        } else {
            return allowFiltering;
        }
    }

    /**Allow extended filtering.*/
    public void setAllowFiltering(Boolean value) {
        this.allowFiltering = value;
    }

    /**(Only relevant for store and info dialogs)If this flag is true, no one can allocate a new entry for this field when storing a document, unless this is contained in a selection list.*/
    public boolean isSelectListOnly() {
        if (selectListOnly == null) {
            return false;
        } else {
            return selectListOnly;
        }
    }

    /**(Only relevant for store and info dialogs)If this flag is true, no one can allocate a new entry for this field when storing a document, unless this is contained in a selection list.*/
    public void setSelectListOnly(Boolean value) {
        this.selectListOnly = value;
    }

    /**Type of the select list.*/
    public SelectListType getSelectListType() {
        if (selectListType == null) {
            return SelectListType.STANDARD;
        } else {
            return selectListType;
        }
    }

    /**Type of the select list.*/
    public void setSelectListType(SelectListType value) {
        this.selectListType = value;
    }

    /**A value indicating whether the internal select list is assigned.*/
    public boolean isAssignedInternalSelectList() {
        if (assignedInternalSelectList == null) {
            return false;
        } else {
            return assignedInternalSelectList;
        }
    }

    /**A value indicating whether the internal select list is assigned.*/
    public void setAssignedInternalSelectList(Boolean value) {
        this.assignedInternalSelectList = value;
    }

    /**The unique identifier of the sequence.*/
    public String getSequenceId() {
        return sequenceId;
    }

    /**The unique identifier of the sequence.*/
    public void setSequenceId(String value) {
        this.sequenceId = value;
    }


	/**
	* Gets the proxy.
	* 
	* @return	The proxy
	*/
    @Extension
    public HttpClientProxy getProxy() {
	return this.proxy;
    }


	/**
	* Sets the HTTP Communication Proxy which is used in futher HTTP communication.
	* 
	* @param proxy	The new proxy
	*/
    @Extension
    public void setProxy(HttpClientProxy proxy) {
	this.proxy = proxy;
	if(this.selectListInfos!=null) { 
        for (int i = 0; (i < this.selectListInfos.getSelectLists().size()); i = (i + 1)) {
            this.selectListInfos.getSelectLists().get(i).setProxy(proxy);
        }
	}
    }


	/**
	* Gets the base URI of the specified relations instance.
	* 
	* @return	The base URI of the specified relations instance.
	*/
    @Extension
    public URI getBaseUri() {
	return RelationsWithProxyExtensions.getBaseUri(this);
    }


	/**
	* Gets the link by its name.
	* 
	* @param relationName	Name of the relation
	* @return	The link, if it exists; null otherwise.
	*/
    @Extension
    public Link getLink(String relationName) {
	return RelationExtension.getLink(this, relationName);
    }


	/**
	* Gets the URI of the relation specified by the name.
	* 
	* @param relationName	Name of the relation
	* @return	The link, if it exists; null otherwise.
	*/
    @Extension
    public String getRelationUri(String relationName) {
	return RelationExtension.getRelationUri(this, relationName);
    }


	/**
	* Gets the URI of the relation specified by the name.
	* 
	* @param relationName	Name of the relation
	* @return	The link, if it exists.
	* @throws	RuntimeException: The specified Link is not found
	*/
    @Extension
    public String getRelationUriOrThrow(String relationName) {
	return RelationExtension.getRelationUriOrThrow(this, relationName);
    }


	/**
	* Determines whether the specified link exists.
	* 
	* @param relationName	Name of the relation
	* @return	 True, if the specified link exists; otherwise, False.
	*/
    @Extension
    public boolean hasRelationUri(String relationName) {
	return RelationExtension.hasRelationUri(this, relationName);
    }

    /**
    * Gets the Uri of the Link for the relation "SimpleSelectList".
    * Returns the Uri of the Link for the relation "SimpleSelectList", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getSimpleSelectListRelationLink() {
        return MethodInvocation.getLink(this, links, "simpleSelectList");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "SimpleSelectList".
    */
    public SelectListResult getSelectListResultFromSimpleSelectListRelation() {
        return MethodInvocation.<SelectListResult>get(this, links, "simpleSelectList", SelectListResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "SimpleSelectList" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<SelectListResult>> getSelectListResultFromSimpleSelectListRelationAsync() {
        return MethodInvocation.<SelectListResult>getAsync(this, links, "simpleSelectList", SelectListResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "SimpleSelectList" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<SelectListResult>> getSelectListResultFromSimpleSelectListRelationAsync(CancellationToken ct) {
        return MethodInvocation.<SelectListResult>getAsync(this, links, "simpleSelectList", SelectListResult.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "SimpleSelectList".
    */
    public SelectListResult postToSimpleSelectListRelationForSelectListResult(SelectListExpression data) {
        return MethodInvocation.<SelectListResult, SelectListExpression> post(this, links, "simpleSelectList", SelectListResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "SelectListExpression"), SelectListExpression.class, null, data), "application/vnd.docuware.platform.selectlistexpression+xml", "application/vnd.docuware.platform.selectlistresult+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "SimpleSelectList" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<SelectListResult>> postToSimpleSelectListRelationForSelectListResultAsync(SelectListExpression data) {
        return MethodInvocation.<SelectListResult, SelectListExpression >postAsync(this, links, "simpleSelectList", SelectListResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "SelectListExpression"), SelectListExpression.class, null, data), "application/vnd.docuware.platform.selectlistexpression+xml", "application/vnd.docuware.platform.selectlistresult+xml");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "SimpleSelectList" asynchronously.
    */
    public CompletableFuture<DeserializedHttpResponseGen<SelectListResult>> postToSimpleSelectListRelationForSelectListResultAsync(CancellationToken ct, SelectListExpression data) {
        return MethodInvocation.<SelectListResult, SelectListExpression >postAsync(this, links, "simpleSelectList", SelectListResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "SelectListExpression"), SelectListExpression.class, null, data), "application/vnd.docuware.platform.selectlistexpression+xml", "application/vnd.docuware.platform.selectlistresult+xml", ct);
    }



}
