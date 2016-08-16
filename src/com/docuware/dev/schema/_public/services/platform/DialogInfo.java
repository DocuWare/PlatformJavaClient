//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.08.16 um 09:04:54 AM CEST 
//


package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;
import com.docuware.dev.schema._public.services.platform.Dialog;
import com.docuware.dev.schema._public.services.platform.CountResult;
import com.docuware.dev.schema._public.services.platform.CountExpression;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import com.docuware.dev.schema._public.services.platform.SelectListResult;
import com.docuware.dev.schema._public.services.platform.SelectListExpression;
import com.docuware.dev.schema._public.services.platform.Document;
import com.docuware.dev.schema._public.services.platform.DocumentsQueryResult;
import com.docuware.dev.schema._public.services.platform.FileCabinetTransferInfo;
import com.docuware.dev.schema._public.services.platform.DocumentsTransferInfo;
import com.docuware.dev.schema._public.services.platform.UserDefinedSearchInfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.schema._public.services.Links;


/**
 * General properties of any dialog.
 * 
 * <p>Java-Klasse f�r DialogInfo complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="DialogInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FileCabinetId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FileCabinetName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DisplayName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="IsForMobile" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="AssignedDialogId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Color" use="required" type="{http://dev.docuware.com/settings/common}Color" />
 *       &lt;attribute name="IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="Type" use="required" type="{http://dev.docuware.com/schema/public/services/platform}DialogTypes" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DialogInfo", propOrder = {
"proxy",
    "links"
})
@XmlSeeAlso({
    Dialog.class
})
public class DialogInfo  implements IRelationsWithProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;
    @XmlAttribute(name = "Id", required = true)
    protected String id;
    @XmlAttribute(name = "FileCabinetId", required = true)
    protected String fileCabinetId;
    @XmlAttribute(name = "FileCabinetName", required = true)
    protected String fileCabinetName;
    @XmlAttribute(name = "DisplayName")
    protected String displayName;
    @XmlAttribute(name = "IsForMobile", required = true)
    protected boolean isForMobile;
    @XmlAttribute(name = "AssignedDialogId", required = true)
    protected String assignedDialogId;
    @XmlAttribute(name = "Color", required = true)
    protected String color;
    @XmlAttribute(name = "IsDefault")
    protected Boolean isDefault;
    @XmlAttribute(name = "Type", required = true)
    protected DialogTypes type;

    /**
     * Ruft den Wert der links-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Links }
     *     
     */
    public Links getLinks() {
        return links;
    }

    /**
     * Legt den Wert der links-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Links }
     *     
     */
    public void setLinks(Links value) {
        this.links = value;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der fileCabinetId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileCabinetId() {
        return fileCabinetId;
    }

    /**
     * Legt den Wert der fileCabinetId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileCabinetId(String value) {
        this.fileCabinetId = value;
    }

    /**
     * Ruft den Wert der fileCabinetName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileCabinetName() {
        return fileCabinetName;
    }

    /**
     * Legt den Wert der fileCabinetName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileCabinetName(String value) {
        this.fileCabinetName = value;
    }

    /**
     * Ruft den Wert der displayName-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Legt den Wert der displayName-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**
     * Ruft den Wert der isForMobile-Eigenschaft ab.
     * 
     */
    public boolean isIsForMobile() {
        return isForMobile;
    }

    /**
     * Legt den Wert der isForMobile-Eigenschaft fest.
     * 
     */
    public void setIsForMobile(boolean value) {
        this.isForMobile = value;
    }

    /**
     * Ruft den Wert der assignedDialogId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignedDialogId() {
        return assignedDialogId;
    }

    /**
     * Legt den Wert der assignedDialogId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignedDialogId(String value) {
        this.assignedDialogId = value;
    }

    /**
     * Ruft den Wert der color-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Legt den Wert der color-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Ruft den Wert der isDefault-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsDefault() {
        if (isDefault == null) {
            return false;
        } else {
            return isDefault;
        }
    }

    /**
     * Legt den Wert der isDefault-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDefault(Boolean value) {
        this.isDefault = value;
    }

    /**
     * Ruft den Wert der type-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DialogTypes }
     *     
     */
    public DialogTypes getType() {
        return type;
    }

    /**
     * Legt den Wert der type-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DialogTypes }
     *     
     */
    public void setType(DialogTypes value) {
        this.type = value;
    }

    public String toString() {
	return Extensions.dialogInfoToString(this);
    }

    public HttpClientProxy getProxy() {
	return this.proxy;
    }

    public void setProxy(HttpClientProxy proxy) {
	this.proxy = proxy;
    }

    public Document chunkUploadDocument(Document document,java.io.File file,int chunkSize) {
	return FileCabinetExtensionsBase.chunkUploadDocument(this, document, FileWrapper.toFileInfoWrapper(file), chunkSize);
    }

    public Document chunkUploadDocument(Document document,java.io.File[] files,int chunkSize) {
	return FileCabinetExtensionsBase.chunkUploadDocument(this, document, FileWrapper.toFileInfoWrapper(files), chunkSize);
    }

    public Document uploadDocument(Document document,java.io.File... file) {
	return FileCabinetExtensionsBase.uploadDocument(this, document, FileWrapper.toFileInfoWrapper(file));
    }

    public Future<DeserializedHttpResponseGen<Document>> uploadDocumentAsync(Document document,java.io.File... file) {
	return FileCabinetExtensionsBase.uploadDocumentAsync(this, document, FileWrapper.toFileInfoWrapper(file));
    }

    public URI getBaseUri() {
	return RelationsWithProxyExtensions.getBaseUri(this);
    }

    public URI getSelfRelationLink() {
        return MethodInvocation.getLink(this, links, "self");
    }

    public Dialog getDialogFromSelfRelation() {
        return MethodInvocation.<Dialog>get(this, links, "self", Dialog.class);
    }

    public Future<DeserializedHttpResponseGen<Dialog>> getDialogFromSelfRelationAsync() {
        return MethodInvocation.<Dialog>getAsync(this, links, "self", Dialog.class);
    }

    public String deleteSelfRelation() {
        return MethodInvocation.delete(this, links, "self");
    }

    public Future<DeserializedHttpResponseGen<String>> deleteSelfRelationAsync() {
        return MethodInvocation.deleteAsync(this, links, "self");
    }

    public URI getAssignedDialogRelationLink() {
        return MethodInvocation.getLink(this, links, "assignedDialog");
    }

    public Dialog getDialogFromAssignedDialogRelation() {
        return MethodInvocation.<Dialog>get(this, links, "assignedDialog", Dialog.class);
    }

    public Future<DeserializedHttpResponseGen<Dialog>> getDialogFromAssignedDialogRelationAsync() {
        return MethodInvocation.<Dialog>getAsync(this, links, "assignedDialog", Dialog.class);
    }

    public URI getCountRelationLink() {
        return MethodInvocation.getLink(this, links, "count");
    }

    public CountResult getCountResultFromCountRelation() {
        return MethodInvocation.<CountResult>get(this, links, "count", CountResult.class);
    }

    public Future<DeserializedHttpResponseGen<CountResult>> getCountResultFromCountRelationAsync() {
        return MethodInvocation.<CountResult>getAsync(this, links, "count", CountResult.class);
    }

    public CountResult postToCountRelationForCountResult(CountExpression data) {
        return MethodInvocation.<CountResult,CountExpression>post(this, links, "count", CountResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "CountExpression"), CountExpression.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<CountResult>> postToCountRelationForCountResultAsync(CountExpression data) {
        return MethodInvocation.<CountResult, CountExpression >postAsync(this, links, "count", CountResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "CountExpression"), CountExpression.class, null, data));
    }

    public URI getSelectListRelationLink() {
        return MethodInvocation.getLink(this, links, "selectList");
    }

    public SelectListResult postToSelectListRelationForSelectListResult(SelectListExpression data) {
        return MethodInvocation.<SelectListResult,SelectListExpression>post(this, links, "selectList", SelectListResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "SelectListExpression"), SelectListExpression.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<SelectListResult>> postToSelectListRelationForSelectListResultAsync(SelectListExpression data) {
        return MethodInvocation.<SelectListResult, SelectListExpression >postAsync(this, links, "selectList", SelectListResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "SelectListExpression"), SelectListExpression.class, null, data));
    }

    public URI getStoreDocumentRelationLink() {
        return MethodInvocation.getLink(this, links, "storeDocument");
    }

    public Document postToStoreDocumentRelationForDocument(Document data) {
        return MethodInvocation.<Document,Document>post(this, links, "storeDocument", Document.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "Document"), Document.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<Document>> postToStoreDocumentRelationForDocumentAsync(Document data) {
        return MethodInvocation.<Document, Document >postAsync(this, links, "storeDocument", Document.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "Document"), Document.class, null, data));
    }

    public URI getTransferRelationLink() {
        return MethodInvocation.getLink(this, links, "transfer");
    }

    public DocumentsQueryResult postToTransferRelationForDocumentsQueryResult(FileCabinetTransferInfo data) {
        return MethodInvocation.<DocumentsQueryResult,FileCabinetTransferInfo>post(this, links, "transfer", DocumentsQueryResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "FileCabinetTransferInfo"), FileCabinetTransferInfo.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<DocumentsQueryResult>> postToTransferRelationForDocumentsQueryResultAsync(FileCabinetTransferInfo data) {
        return MethodInvocation.<DocumentsQueryResult, FileCabinetTransferInfo >postAsync(this, links, "transfer", DocumentsQueryResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "FileCabinetTransferInfo"), FileCabinetTransferInfo.class, null, data));
    }

    public DocumentsQueryResult postToTransferRelationForDocumentsQueryResult(DocumentsTransferInfo data) {
        return MethodInvocation.<DocumentsQueryResult,DocumentsTransferInfo>post(this, links, "transfer", DocumentsQueryResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentsTransferInfo"), DocumentsTransferInfo.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<DocumentsQueryResult>> postToTransferRelationForDocumentsQueryResultAsync(DocumentsTransferInfo data) {
        return MethodInvocation.<DocumentsQueryResult, DocumentsTransferInfo >postAsync(this, links, "transfer", DocumentsQueryResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentsTransferInfo"), DocumentsTransferInfo.class, null, data));
    }

    public URI getCreateUserDefinedSearchRelationLink() {
        return MethodInvocation.getLink(this, links, "createUserDefinedSearch");
    }

    public Dialog postToCreateUserDefinedSearchRelationForDialog(UserDefinedSearchInfo data) {
        return MethodInvocation.<Dialog,UserDefinedSearchInfo>post(this, links, "createUserDefinedSearch", Dialog.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "UserDefinedSearchInfo"), UserDefinedSearchInfo.class, null, data));
    }

    public Future<DeserializedHttpResponseGen<Dialog>> postToCreateUserDefinedSearchRelationForDialogAsync(UserDefinedSearchInfo data) {
        return MethodInvocation.<Dialog, UserDefinedSearchInfo >postAsync(this, links, "createUserDefinedSearch", Dialog.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "UserDefinedSearchInfo"), UserDefinedSearchInfo.class, null, data));
    }



}
