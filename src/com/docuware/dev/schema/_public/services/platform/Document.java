//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2016.08.22 um 03:45:48 PM CEST 
//


package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;
import com.docuware.dev.schema._public.services.platform.Document;
import java.io.InputStream;
import com.docuware.dev.schema._public.services.platform.DocumentsQueryResult;
import com.docuware.dev.schema._public.services.platform.ContentDivideOperationInfo;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import com.docuware.dev.schema._public.services.platform.IntegerList;
import com.docuware.dev.schema._public.services.platform.DocumentWordSearchResult;
import com.docuware.dev.schema._public.services.platform.SearchPositionQuery;
import com.docuware.dev.schema._public.services.platform.LockInfo;
import com.docuware.dev.schema._public.services.platform.DocumentIndexFields;
import com.docuware.dev.schema._public.services.platform.UpdateIndexFieldsInfo;
import com.docuware.dev.schema._public.services.platform.SuggestionFields;
import com.docuware.dev.schema._public.services.platform.Sections;
import com.docuware.dev.schema._public.services.platform.Section;
import com.docuware.dev.schema._public.services.platform.FileDownload;
import com.docuware.dev.schema._public.services.platform.DocumentActionInfo;
import com.docuware.dev.schema._public.services.platform.DocumentApplicationProperties;
import com.docuware.dev.schema._public.services.platform.DocumentLinks;
import com.docuware.dev.schema._public.services.platform.ResultListQuery;
import com.docuware.dev.schema._public.services.platform.CheckOutToFileSystemInfo;
import com.docuware.dev.schema._public.services.platform.ExportSettings;
import com.docuware.dev.schema._public.services.platform.DocumentAnnotations;
import com.docuware.dev.schema._public.services.platform.DocumentAnnotationsPlacement;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.docuware.dev._public.intellix.DocumentContent;
import com.docuware.dev.schema._public.services.Links;
import org.w3c.dom.Element;


/**
 * <p>Java-Klasse f�r Document complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="Document">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Fields" type="{http://dev.docuware.com/schema/public/services/platform}DocumentIndexFields"/>
 *         &lt;element name="Suggestions" type="{http://dev.docuware.com/schema/public/services/platform}SuggestionFields" minOccurs="0"/>
 *         &lt;element name="Flags" type="{http://dev.docuware.com/schema/public/services/platform}DocumentFlags" minOccurs="0"/>
 *         &lt;element name="Version" type="{http://dev.docuware.com/schema/public/services/platform}DocumentVersion" minOccurs="0"/>
 *         &lt;element name="TextShot" type="{http://dev.docuware.com/public/intellix}DocumentContent" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://dev.docuware.com/schema/public/services}Links" minOccurs="0"/>
 *         &lt;element name="Sections" type="{http://dev.docuware.com/schema/public/services/platform}Sections" minOccurs="0"/>
 *         &lt;element name="Preview" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any processContents='skip'/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ContentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FileChunk" type="{http://dev.docuware.com/schema/public/services/platform}UploadedFileChunk" minOccurs="0"/>
 *         &lt;element name="ApplicationProperties" type="{http://dev.docuware.com/schema/public/services/platform}DocumentApplicationProperties" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="HaveMoreTotalPages" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="HasTextAnnotation" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="HasXmlDigitalSignatures" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="TotalPages" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}int" default="-1" />
 *       &lt;attribute name="Title" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="LastModified" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="CreatedAt" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="FileSize" type="{http://www.w3.org/2001/XMLSchema}long" default="0" />
 *       &lt;attribute name="SectionCount" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *       &lt;attribute name="IntellixTrust" type="{http://dev.docuware.com/schema/public/services/platform}IntellixTrust" default="None" />
 *       &lt;attribute name="VersionStatus" type="{http://dev.docuware.com/schema/public/services/platform}VersionManagementStatus" default="Disable" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
"proxy",
    "fields",
    "suggestions",
    "flags",
    "version",
    "textShot",
    "links",
    "sections",
    "preview",
    "contentType",
    "fileChunk",
    "applicationProperties"
})
public class Document  implements IRelationsWithProxy, IStringContent, IChunkable {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Fields", required = true)
    protected DocumentIndexFields fields;
    @XmlElement(name = "Suggestions")
    protected SuggestionFields suggestions;
    @XmlElement(name = "Flags")
    protected DocumentFlags flags;
    @XmlElement(name = "Version")
    protected DocumentVersion version;
    @XmlElement(name = "TextShot")
    protected List<DocumentContent> textShot;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services")
    protected Links links;
    @XmlElement(name = "Sections")
    protected Sections sections;
    @XmlElement(name = "Preview")
    protected Document.Preview preview;
    @XmlElement(name = "ContentType")
    protected String contentType;
    @XmlElement(name = "FileChunk")
    protected UploadedFileChunk fileChunk;
    @XmlElement(name = "ApplicationProperties")
    protected DocumentApplicationProperties applicationProperties;
    @XmlAttribute(name = "HaveMoreTotalPages")
    protected Boolean haveMoreTotalPages;
    @XmlAttribute(name = "HasTextAnnotation")
    protected Boolean hasTextAnnotation;
    @XmlAttribute(name = "HasXmlDigitalSignatures")
    protected Boolean hasXmlDigitalSignatures;
    @XmlAttribute(name = "TotalPages")
    protected Integer totalPages;
    @XmlAttribute(name = "Id")
    protected Integer id;
    @XmlAttribute(name = "Title")
    protected String title;
    @XmlAttribute(name = "LastModified")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModified;
    @XmlAttribute(name = "CreatedAt")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdAt;
    @XmlAttribute(name = "FileSize")
    protected Long fileSize;
    @XmlAttribute(name = "SectionCount")
    protected Integer sectionCount;
    @XmlAttribute(name = "IntellixTrust")
    protected IntellixTrust intellixTrust;
    @XmlAttribute(name = "VersionStatus")
    protected VersionManagementStatus versionStatus;

    /**
     * Ruft den Wert der fields-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIndexFields }
     *     
     */
    public DocumentIndexFields getFields() {
        return fields;
    }

    /**
     * Legt den Wert der fields-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIndexFields }
     *     
     */
    public void setFields(DocumentIndexFields value) {
        this.fields = value;
    }

    /**
     * Ruft den Wert der suggestions-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SuggestionFields }
     *     
     */
    public SuggestionFields getSuggestions() {
        return suggestions;
    }

    /**
     * Legt den Wert der suggestions-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SuggestionFields }
     *     
     */
    public void setSuggestions(SuggestionFields value) {
        this.suggestions = value;
    }

    /**
     * Ruft den Wert der flags-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DocumentFlags }
     *     
     */
    public DocumentFlags getFlags() {
        return flags;
    }

    /**
     * Legt den Wert der flags-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentFlags }
     *     
     */
    public void setFlags(DocumentFlags value) {
        this.flags = value;
    }

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DocumentVersion }
     *     
     */
    public DocumentVersion getVersion() {
        return version;
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentVersion }
     *     
     */
    public void setVersion(DocumentVersion value) {
        this.version = value;
    }

    /**
     * Gets the value of the textShot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the textShot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTextShot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentContent }
     * 
     * 
     */
    public List<DocumentContent> getTextShot() {
        if (textShot == null) {
            textShot = new ArrayList<DocumentContent>();
        }
        return this.textShot;
    }

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
     * Ruft den Wert der sections-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Sections }
     *     
     */
    public Sections getSections() {
        return sections;
    }

    /**
     * Legt den Wert der sections-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Sections }
     *     
     */
    public void setSections(Sections value) {
        this.sections = value;
    }

    /**
     * Ruft den Wert der preview-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Document.Preview }
     *     
     */
    public Document.Preview getPreview() {
        return preview;
    }

    /**
     * Legt den Wert der preview-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Document.Preview }
     *     
     */
    public void setPreview(Document.Preview value) {
        this.preview = value;
    }

    /**
     * Ruft den Wert der contentType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * Legt den Wert der contentType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentType(String value) {
        this.contentType = value;
    }

    /**
     * Ruft den Wert der fileChunk-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link UploadedFileChunk }
     *     
     */
    public UploadedFileChunk getFileChunk() {
        return fileChunk;
    }

    /**
     * Legt den Wert der fileChunk-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link UploadedFileChunk }
     *     
     */
    public void setFileChunk(UploadedFileChunk value) {
        this.fileChunk = value;
    }

    /**
     * Ruft den Wert der applicationProperties-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link DocumentApplicationProperties }
     *     
     */
    public DocumentApplicationProperties getApplicationProperties() {
        return applicationProperties;
    }

    /**
     * Legt den Wert der applicationProperties-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentApplicationProperties }
     *     
     */
    public void setApplicationProperties(DocumentApplicationProperties value) {
        this.applicationProperties = value;
    }

    /**
     * Ruft den Wert der haveMoreTotalPages-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isHaveMoreTotalPages() {
        if (haveMoreTotalPages == null) {
            return false;
        } else {
            return haveMoreTotalPages;
        }
    }

    /**
     * Legt den Wert der haveMoreTotalPages-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHaveMoreTotalPages(Boolean value) {
        this.haveMoreTotalPages = value;
    }

    /**
     * Ruft den Wert der hasTextAnnotation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isHasTextAnnotation() {
        if (hasTextAnnotation == null) {
            return false;
        } else {
            return hasTextAnnotation;
        }
    }

    /**
     * Legt den Wert der hasTextAnnotation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasTextAnnotation(Boolean value) {
        this.hasTextAnnotation = value;
    }

    /**
     * Ruft den Wert der hasXmlDigitalSignatures-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isHasXmlDigitalSignatures() {
        if (hasXmlDigitalSignatures == null) {
            return false;
        } else {
            return hasXmlDigitalSignatures;
        }
    }

    /**
     * Legt den Wert der hasXmlDigitalSignatures-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasXmlDigitalSignatures(Boolean value) {
        this.hasXmlDigitalSignatures = value;
    }

    /**
     * Ruft den Wert der totalPages-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getTotalPages() {
        if (totalPages == null) {
            return  0;
        } else {
            return totalPages;
        }
    }

    /**
     * Legt den Wert der totalPages-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalPages(Integer value) {
        this.totalPages = value;
    }

    /**
     * Ruft den Wert der id-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getId() {
        if (id == null) {
            return -1;
        } else {
            return id;
        }
    }

    /**
     * Legt den Wert der id-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Ruft den Wert der title-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Legt den Wert der title-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Ruft den Wert der lastModified-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModified() {
        return lastModified;
    }

    /**
     * Legt den Wert der lastModified-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModified(XMLGregorianCalendar value) {
        this.lastModified = value;
    }

    /**
     * Ruft den Wert der createdAt-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedAt() {
        return createdAt;
    }

    /**
     * Legt den Wert der createdAt-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedAt(XMLGregorianCalendar value) {
        this.createdAt = value;
    }

    /**
     * Ruft den Wert der fileSize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public long getFileSize() {
        if (fileSize == null) {
            return  0L;
        } else {
            return fileSize;
        }
    }

    /**
     * Legt den Wert der fileSize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFileSize(Long value) {
        this.fileSize = value;
    }

    /**
     * Ruft den Wert der sectionCount-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getSectionCount() {
        if (sectionCount == null) {
            return  0;
        } else {
            return sectionCount;
        }
    }

    /**
     * Legt den Wert der sectionCount-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSectionCount(Integer value) {
        this.sectionCount = value;
    }

    /**
     * Ruft den Wert der intellixTrust-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link IntellixTrust }
     *     
     */
    public IntellixTrust getIntellixTrust() {
        if (intellixTrust == null) {
            return IntellixTrust.NONE;
        } else {
            return intellixTrust;
        }
    }

    /**
     * Legt den Wert der intellixTrust-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link IntellixTrust }
     *     
     */
    public void setIntellixTrust(IntellixTrust value) {
        this.intellixTrust = value;
    }

    /**
     * Ruft den Wert der versionStatus-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link VersionManagementStatus }
     *     
     */
    public VersionManagementStatus getVersionStatus() {
        if (versionStatus == null) {
            return VersionManagementStatus.DISABLE;
        } else {
            return versionStatus;
        }
    }

    /**
     * Legt den Wert der versionStatus-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link VersionManagementStatus }
     *     
     */
    public void setVersionStatus(VersionManagementStatus value) {
        this.versionStatus = value;
    }


    /**
     * <p>Java-Klasse f�r anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;any processContents='skip'/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class Preview {

        @XmlAnyElement
        protected Element any;

        /**
         * Ruft den Wert der any-Eigenschaft ab.
         * 
         * @return
         *     possible object is
         *     {@link Element }
         *     
         */
        public Element getAny() {
            return any;
        }

        /**
         * Legt den Wert der any-Eigenschaft fest.
         * 
         * @param value
         *     allowed object is
         *     {@link Element }
         *     
         */
        public void setAny(Element value) {
            this.any = value;
        }

    }


	/**
	* Returns a String that represents that instance.
	* 
	* @return	A String representing that instance
	*/
    public String toString() {
	return Extensions.documentToString(this);
    }


	/**
	* Gets the DocumentIndexField with the specified name.
	* 
	* @param fieldName	Name of the Field
	* @return	The documentIndeField
	*/
    public DocumentIndexField getDocumentIndexField(String fieldName) {
	return Extensions.getDocumentIndexFieldByNameFromDocument(this, fieldName);
    }


	/**
	* Sets the DocumentIndexField with the specified name.
	* 
	* @param fieldName	Name of the Field
	* @param value	The value
	*/
    public void setDocumentIndexField(String fieldName,DocumentIndexField value) {
	Extensions.setDocumentIndexFieldByNameFromDocument(this, fieldName, value);
    }


	/**
	* Gets the proxy.
	* 
	* @return	The proxy
	*/
    public HttpClientProxy getProxy() {
	return this.proxy;
    }


	/**
	* Sets the HTTP Communication Proxy which is used in futher HTTP communication.
	* 
	* @param proxy	The new proxy
	*/
    public void setProxy(HttpClientProxy proxy) { 
	this.proxy = proxy;
	if(this.sections!=null) { 
		for (int i = 0; (i < this.sections.getSection().size()); i = (i + 1)) {
			this.sections.getSection().get(i).setProxy(proxy);
		}
	}
       if ((fileChunk != null)) {
           fileChunk.setProxy(proxy);
       }
    }


	/**
	* Adds a section to a document using chunked upload
	*
	* @param file	The file
	* @param chunkSize	[optional/ set this parameter to 0 if you want to use default value] The size of the chunk in bytes
	* @return	The new section's metadata
	*/
    public Section chunkAddSection(java.io.File file,int chunkSize) {
	return FileCabinetExtensionsBase.chunkAddSection(this, FileWrapper.toFileInfoWrapper(file), chunkSize);
    }


	/**
	* Appends one or more new sections to the specified document
	*
	* @param file	The file
	* @return	The modified document
	*/
    public Document addDocumentSection(java.io.File... file) {
	return FileCabinetExtensionsBase.addDocumentSections(this, FileWrapper.toFileInfoWrapper(file));
    }


	/**
	* Appends one or more new sections to the specified document asynchronously
	*
	* @param file	The file
	* @return	A future which uploads the document and returns the uploaded document's metadata.
	*/
    public Future<DeserializedHttpResponseGen<Document>> addDocumentSectionAsync(java.io.File... file) {
	return FileCabinetExtensionsBase.addDocumentSectionsAsync(this, FileWrapper.toFileInfoWrapper(file));
    }


	/**
	* Appends one section to the specified document asynchronously
	*
	* @param file	The file
	* @return	A future which uploads the document and returns the uploaded section's metadata.
	*/
    public Future<DeserializedHttpResponseGen<Section>> uploadSectionAsync(java.io.File file) {
	return FileCabinetExtensionsBase.uploadSectionAsync(this, FileWrapper.toFileInfoWrapper(file));
    }


	/**
	* Gets the base URI of the specified relations instance.
	* 
	* @return	The base URI of the specified relations instance.
	*/
    public URI getBaseUri() { 
	return RelationsWithProxyExtensions.getBaseUri(this); 
    }


	/**
	* Gets the link by its name.
	* 
	* @param relationName	Name of the relation
	* @return	The link, if it exists; null otherwise.
	*/
    public Link getLink(String relationName) {
	return RelationExtension.getLink(this, relationName);
    }


	/**
	* Gets the URI of the relation specified by the name.
	* 
	* @param relationName	Name of the relation
	* @return	The link, if it exists; null otherwise.
	*/
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
    public String getRelationUriOrThrow(String relationName) {
	return RelationExtension.getRelationUriOrThrow(this, relationName);
    }


	/**
	* Determines whether the specified link exists.
	* 
	* @param relationName	Name of the relation
	* @return	 True, if the specified link exists; otherwise, False.
	*/
    public boolean hasRelationUri(String relationName) {
	return RelationExtension.hasRelationUri(this, relationName);
    }

    /**
    * Gets the Uri of the Link for the relation "Self".
    * Returns the Uri of the Link for the relation "Self", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getSelfRelationLink() {
        return MethodInvocation.getLink(this, links, "self");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Self".
    */
    public Document getDocumentFromSelfRelation() {
        return MethodInvocation.<Document>get(this, links, "self", Document.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Self" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Document>> getDocumentFromSelfRelationAsync() {
        return MethodInvocation.<Document>getAsync(this, links, "self", Document.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Self" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Document>> getDocumentFromSelfRelationAsync(CancellationToken ct) {
        return MethodInvocation.<Document>getAsync(this, links, "self", Document.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Self".
    */
    public Document postToSelfRelationForDocument(InputStream data, String bodyContentType) {
        return MethodInvocation.<Document, InputStream>post(this, links, "self", Document.class, data, bodyContentType);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Self" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Document>> postToSelfRelationForDocumentAsync(InputStream data, String bodyContentType) { 
        return MethodInvocation.<Document, InputStream>postAsync(this, links, "self", Document.class, data, bodyContentType);
}

    /**
    * Calls the HTTP post Method on the link for the relation "Self" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Document>> postToSelfRelationForDocumentAsync(InputStream data, String bodyContentType, CancellationToken ct) { 
        return MethodInvocation.<Document, InputStream>postAsync(this, links, "self", Document.class, data, bodyContentType, ct);
}

    /**
    * Calls the HTTP Delete Method on the link for the relation "Self".
    */
    public String deleteSelfRelation() {
        return MethodInvocation.delete(this, links, "self");
    }

    /**
    * Calls the HTTP Delete Method on the link for the relation "Self" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> deleteSelfRelationAsync() {
        return MethodInvocation.deleteAsync(this, links, "self");
    }

    /**
    * Calls the HTTP Delete Method on the link for the relation "Self" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> deleteSelfRelationAsync(CancellationToken ct) {
        return MethodInvocation.deleteAsync(this, links, "self", ct);
    }

    /**
    * Gets the Uri of the Link for the relation "ContentDivideOperation".
    * Returns the Uri of the Link for the relation "ContentDivideOperation", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getContentDivideOperationRelationLink() {
        return MethodInvocation.getLink(this, links, "contentDivideOperation");
    }

    /**
    * Calls the HTTP put Method on the link for the relation "ContentDivideOperation".
    */
    public DocumentsQueryResult putToContentDivideOperationRelationForDocumentsQueryResult(ContentDivideOperationInfo data) {
        return MethodInvocation.<DocumentsQueryResult,ContentDivideOperationInfo>put(this, links, "contentDivideOperation", DocumentsQueryResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ContentDivideOperationInfo"), ContentDivideOperationInfo.class, null, data));
    }

    /**
    * Calls the HTTP put Method on the link for the relation "ContentDivideOperation" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentsQueryResult>> putToContentDivideOperationRelationForDocumentsQueryResultAsync(ContentDivideOperationInfo data) {
        return MethodInvocation.<DocumentsQueryResult, ContentDivideOperationInfo >putAsync(this, links, "contentDivideOperation", DocumentsQueryResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ContentDivideOperationInfo"), ContentDivideOperationInfo.class, null, data));
    }

    /**
    * Calls the HTTP put Method on the link for the relation "ContentDivideOperation" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentsQueryResult>> putToContentDivideOperationRelationForDocumentsQueryResultAsync(ContentDivideOperationInfo data, CancellationToken ct) {
        return MethodInvocation.<DocumentsQueryResult, ContentDivideOperationInfo >putAsync(this, links, "contentDivideOperation", DocumentsQueryResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ContentDivideOperationInfo"), ContentDivideOperationInfo.class, null, data), ct);
    }

    /**
    * Gets the Uri of the Link for the relation "ClippedDocuments".
    * Returns the Uri of the Link for the relation "ClippedDocuments", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getClippedDocumentsRelationLink() {
        return MethodInvocation.getLink(this, links, "clippedDocuments");
    }

    /**
    * Calls the HTTP put Method on the link for the relation "ClippedDocuments".
    */
    public Document putToClippedDocumentsRelationForDocument(IntegerList data) {
        return MethodInvocation.<Document,IntegerList>put(this, links, "clippedDocuments", Document.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "IntegerList"), IntegerList.class, null, data));
    }

    /**
    * Calls the HTTP put Method on the link for the relation "ClippedDocuments" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Document>> putToClippedDocumentsRelationForDocumentAsync(IntegerList data) {
        return MethodInvocation.<Document, IntegerList >putAsync(this, links, "clippedDocuments", Document.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "IntegerList"), IntegerList.class, null, data));
    }

    /**
    * Calls the HTTP put Method on the link for the relation "ClippedDocuments" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Document>> putToClippedDocumentsRelationForDocumentAsync(IntegerList data, CancellationToken ct) {
        return MethodInvocation.<Document, IntegerList >putAsync(this, links, "clippedDocuments", Document.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "IntegerList"), IntegerList.class, null, data), ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Unclip".
    * Returns the Uri of the Link for the relation "Unclip", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getUnclipRelationLink() {
        return MethodInvocation.getLink(this, links, "unclip");
    }

    /**
    * Calls the HTTP put Method on the link for the relation "Unclip".
    */
    public DocumentsQueryResult putToUnclipRelationForDocumentsQueryResult(InputStream data, String bodyContentType) {
        return MethodInvocation.<DocumentsQueryResult, InputStream>put(this, links, "unclip", DocumentsQueryResult.class, data, bodyContentType);
    }

    /**
    * Calls the HTTP put Method on the link for the relation "Unclip" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentsQueryResult>> putToUnclipRelationForDocumentsQueryResultAsync(InputStream data, String bodyContentType) { 
        return MethodInvocation.<DocumentsQueryResult, InputStream>putAsync(this, links, "unclip", DocumentsQueryResult.class, data, bodyContentType);
}

    /**
    * Calls the HTTP put Method on the link for the relation "Unclip" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentsQueryResult>> putToUnclipRelationForDocumentsQueryResultAsync(InputStream data, String bodyContentType, CancellationToken ct) { 
        return MethodInvocation.<DocumentsQueryResult, InputStream>putAsync(this, links, "unclip", DocumentsQueryResult.class, data, bodyContentType, ct);
}

    /**
    * Gets the Uri of the Link for the relation "Positions".
    * Returns the Uri of the Link for the relation "Positions", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getPositionsRelationLink() {
        return MethodInvocation.getLink(this, links, "positions");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Positions".
    */
    public DocumentWordSearchResult getDocumentWordSearchResultFromPositionsRelation() {
        return MethodInvocation.<DocumentWordSearchResult>get(this, links, "positions", DocumentWordSearchResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Positions" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentWordSearchResult>> getDocumentWordSearchResultFromPositionsRelationAsync() {
        return MethodInvocation.<DocumentWordSearchResult>getAsync(this, links, "positions", DocumentWordSearchResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Positions" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentWordSearchResult>> getDocumentWordSearchResultFromPositionsRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DocumentWordSearchResult>getAsync(this, links, "positions", DocumentWordSearchResult.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Positions".
    */
    public DocumentWordSearchResult postToPositionsRelationForDocumentWordSearchResult(SearchPositionQuery data) {
        return MethodInvocation.<DocumentWordSearchResult,SearchPositionQuery>post(this, links, "positions", DocumentWordSearchResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "SearchPositionQuery"), SearchPositionQuery.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Positions" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentWordSearchResult>> postToPositionsRelationForDocumentWordSearchResultAsync(SearchPositionQuery data) {
        return MethodInvocation.<DocumentWordSearchResult, SearchPositionQuery >postAsync(this, links, "positions", DocumentWordSearchResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "SearchPositionQuery"), SearchPositionQuery.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Positions" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentWordSearchResult>> postToPositionsRelationForDocumentWordSearchResultAsync(SearchPositionQuery data, CancellationToken ct) {
        return MethodInvocation.<DocumentWordSearchResult, SearchPositionQuery >postAsync(this, links, "positions", DocumentWordSearchResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "SearchPositionQuery"), SearchPositionQuery.class, null, data), ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Lock".
    * Returns the Uri of the Link for the relation "Lock", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getLockRelationLink() {
        return MethodInvocation.getLink(this, links, "lock");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Lock".
    */
    public String postToLockRelationForString(LockInfo data) {
        return MethodInvocation.<String,LockInfo>post(this, links, "lock", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "LockInfo"), LockInfo.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Lock" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> postToLockRelationForStringAsync(LockInfo data) {
        return MethodInvocation.<String, LockInfo >postAsync(this, links, "lock", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "LockInfo"), LockInfo.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Lock" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> postToLockRelationForStringAsync(LockInfo data, CancellationToken ct) {
        return MethodInvocation.<String, LockInfo >postAsync(this, links, "lock", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "LockInfo"), LockInfo.class, null, data), ct);
    }

    /**
    * Calls the HTTP Delete Method on the link for the relation "Lock".
    */
    public String deleteLockRelation() {
        return MethodInvocation.delete(this, links, "lock");
    }

    /**
    * Calls the HTTP Delete Method on the link for the relation "Lock" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> deleteLockRelationAsync() {
        return MethodInvocation.deleteAsync(this, links, "lock");
    }

    /**
    * Calls the HTTP Delete Method on the link for the relation "Lock" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> deleteLockRelationAsync(CancellationToken ct) {
        return MethodInvocation.deleteAsync(this, links, "lock", ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Thumbnail".
    * Returns the Uri of the Link for the relation "Thumbnail", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getThumbnailRelationLink() {
        return MethodInvocation.getLink(this, links, "thumbnail");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Thumbnail".
    */
    public URI getURIFromThumbnailRelation() {
        return MethodInvocation.<URI>get(this, links, "thumbnail", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Thumbnail" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromThumbnailRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "thumbnail", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Thumbnail" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromThumbnailRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "thumbnail", URI.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "DeepZoomImage".
    * Returns the Uri of the Link for the relation "DeepZoomImage", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getDeepZoomImageRelationLink() {
        return MethodInvocation.getLink(this, links, "deepZoomImage");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "DeepZoomImage".
    */
    public URI getURIFromDeepZoomImageRelation() {
        return MethodInvocation.<URI>get(this, links, "deepZoomImage", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "DeepZoomImage" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromDeepZoomImageRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "deepZoomImage", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "DeepZoomImage" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromDeepZoomImageRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "deepZoomImage", URI.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "DeepZoomImageWithAnnotation".
    * Returns the Uri of the Link for the relation "DeepZoomImageWithAnnotation", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getDeepZoomImageWithAnnotationRelationLink() {
        return MethodInvocation.getLink(this, links, "deepZoomImageWithAnnotation");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "DeepZoomImageWithAnnotation".
    */
    public URI getURIFromDeepZoomImageWithAnnotationRelation() {
        return MethodInvocation.<URI>get(this, links, "deepZoomImageWithAnnotation", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "DeepZoomImageWithAnnotation" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromDeepZoomImageWithAnnotationRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "deepZoomImageWithAnnotation", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "DeepZoomImageWithAnnotation" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromDeepZoomImageWithAnnotationRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "deepZoomImageWithAnnotation", URI.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "ResultListIcon".
    * Returns the Uri of the Link for the relation "ResultListIcon", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getResultListIconRelationLink() {
        return MethodInvocation.getLink(this, links, "resultListIcon");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "ResultListIcon".
    */
    public URI getURIFromResultListIconRelation() {
        return MethodInvocation.<URI>get(this, links, "resultListIcon", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "ResultListIcon" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromResultListIconRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "resultListIcon", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "ResultListIcon" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromResultListIconRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "resultListIcon", URI.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Fields".
    * Returns the Uri of the Link for the relation "Fields", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getFieldsRelationLink() {
        return MethodInvocation.getLink(this, links, "fields");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Fields".
    */
    public DocumentIndexFields getDocumentIndexFieldsFromFieldsRelation() {
        return MethodInvocation.<DocumentIndexFields>get(this, links, "fields", DocumentIndexFields.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Fields" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentIndexFields>> getDocumentIndexFieldsFromFieldsRelationAsync() {
        return MethodInvocation.<DocumentIndexFields>getAsync(this, links, "fields", DocumentIndexFields.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Fields" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentIndexFields>> getDocumentIndexFieldsFromFieldsRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DocumentIndexFields>getAsync(this, links, "fields", DocumentIndexFields.class, ct);
    }

    /**
    * Calls the HTTP put Method on the link for the relation "Fields".
    */
    public DocumentIndexFields putToFieldsRelationForDocumentIndexFields(DocumentIndexFields data) {
        return MethodInvocation.<DocumentIndexFields,DocumentIndexFields>put(this, links, "fields", DocumentIndexFields.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentIndexFields"), DocumentIndexFields.class, null, data));
    }

    /**
    * Calls the HTTP put Method on the link for the relation "Fields" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentIndexFields>> putToFieldsRelationForDocumentIndexFieldsAsync(DocumentIndexFields data) {
        return MethodInvocation.<DocumentIndexFields, DocumentIndexFields >putAsync(this, links, "fields", DocumentIndexFields.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentIndexFields"), DocumentIndexFields.class, null, data));
    }

    /**
    * Calls the HTTP put Method on the link for the relation "Fields" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentIndexFields>> putToFieldsRelationForDocumentIndexFieldsAsync(DocumentIndexFields data, CancellationToken ct) {
        return MethodInvocation.<DocumentIndexFields, DocumentIndexFields >putAsync(this, links, "fields", DocumentIndexFields.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentIndexFields"), DocumentIndexFields.class, null, data), ct);
    }

    /**
    * Calls the HTTP put Method on the link for the relation "Fields".
    */
    public DocumentIndexFields putToFieldsRelationForDocumentIndexFields(UpdateIndexFieldsInfo data) {
        return MethodInvocation.<DocumentIndexFields,UpdateIndexFieldsInfo>put(this, links, "fields", DocumentIndexFields.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "UpdateIndexFieldsInfo"), UpdateIndexFieldsInfo.class, null, data));
    }

    /**
    * Calls the HTTP put Method on the link for the relation "Fields" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentIndexFields>> putToFieldsRelationForDocumentIndexFieldsAsync(UpdateIndexFieldsInfo data) {
        return MethodInvocation.<DocumentIndexFields, UpdateIndexFieldsInfo >putAsync(this, links, "fields", DocumentIndexFields.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "UpdateIndexFieldsInfo"), UpdateIndexFieldsInfo.class, null, data));
    }

    /**
    * Calls the HTTP put Method on the link for the relation "Fields" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentIndexFields>> putToFieldsRelationForDocumentIndexFieldsAsync(UpdateIndexFieldsInfo data, CancellationToken ct) {
        return MethodInvocation.<DocumentIndexFields, UpdateIndexFieldsInfo >putAsync(this, links, "fields", DocumentIndexFields.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "UpdateIndexFieldsInfo"), UpdateIndexFieldsInfo.class, null, data), ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Suggestions".
    * Returns the Uri of the Link for the relation "Suggestions", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getSuggestionsRelationLink() {
        return MethodInvocation.getLink(this, links, "suggestions");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Suggestions".
    */
    public SuggestionFields getSuggestionFieldsFromSuggestionsRelation() {
        return MethodInvocation.<SuggestionFields>get(this, links, "suggestions", SuggestionFields.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Suggestions" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<SuggestionFields>> getSuggestionFieldsFromSuggestionsRelationAsync() {
        return MethodInvocation.<SuggestionFields>getAsync(this, links, "suggestions", SuggestionFields.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Suggestions" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<SuggestionFields>> getSuggestionFieldsFromSuggestionsRelationAsync(CancellationToken ct) {
        return MethodInvocation.<SuggestionFields>getAsync(this, links, "suggestions", SuggestionFields.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Sections".
    * Returns the Uri of the Link for the relation "Sections", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getSectionsRelationLink() {
        return MethodInvocation.getLink(this, links, "sections");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Sections".
    */
    public Sections getSectionsFromSectionsRelation() {
        return MethodInvocation.<Sections>get(this, links, "sections", Sections.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Sections" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Sections>> getSectionsFromSectionsRelationAsync() {
        return MethodInvocation.<Sections>getAsync(this, links, "sections", Sections.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Sections" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Sections>> getSectionsFromSectionsRelationAsync(CancellationToken ct) {
        return MethodInvocation.<Sections>getAsync(this, links, "sections", Sections.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Sections".
    */
    public Section postToSectionsRelationForSection(InputStream data, String bodyContentType) {
        return MethodInvocation.<Section, InputStream>post(this, links, "sections", Section.class, data, bodyContentType);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Sections" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Section>> postToSectionsRelationForSectionAsync(InputStream data, String bodyContentType) { 
        return MethodInvocation.<Section, InputStream>postAsync(this, links, "sections", Section.class, data, bodyContentType);
}

    /**
    * Calls the HTTP post Method on the link for the relation "Sections" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Section>> postToSectionsRelationForSectionAsync(InputStream data, String bodyContentType, CancellationToken ct) { 
        return MethodInvocation.<Section, InputStream>postAsync(this, links, "sections", Section.class, data, bodyContentType, ct);
}

    /**
    * Gets the Uri of the Link for the relation "Content".
    * Returns the Uri of the Link for the relation "Content", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getContentRelationLink() {
        return MethodInvocation.getLink(this, links, "content");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Content".
    */
    public URI getURIFromContentRelation() {
        return MethodInvocation.<URI>get(this, links, "content", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Content" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromContentRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "content", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Content" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromContentRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "content", URI.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Content".
    */
    public String postToContentRelationForString(IntegerList data) {
        return MethodInvocation.<String,IntegerList>post(this, links, "content", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "IntegerList"), IntegerList.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Content" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> postToContentRelationForStringAsync(IntegerList data) {
        return MethodInvocation.<String, IntegerList >postAsync(this, links, "content", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "IntegerList"), IntegerList.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Content" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> postToContentRelationForStringAsync(IntegerList data, CancellationToken ct) {
        return MethodInvocation.<String, IntegerList >postAsync(this, links, "content", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "IntegerList"), IntegerList.class, null, data), ct);
    }

    /**
    * Gets the Uri of the Link for the relation "FileDownload".
    * Returns the Uri of the Link for the relation "FileDownload", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getFileDownloadRelationLink() {
        return MethodInvocation.getLink(this, links, "fileDownload");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "FileDownload".
    */
    public URI getURIFromFileDownloadRelation() {
        return MethodInvocation.<URI>get(this, links, "fileDownload", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "FileDownload" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromFileDownloadRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "fileDownload", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "FileDownload" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromFileDownloadRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "fileDownload", URI.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "FileDownload".
    */
    public String postToFileDownloadRelationForString(FileDownload data) {
        return MethodInvocation.<String,FileDownload>post(this, links, "fileDownload", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "FileDownload"), FileDownload.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "FileDownload" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> postToFileDownloadRelationForStringAsync(FileDownload data) {
        return MethodInvocation.<String, FileDownload >postAsync(this, links, "fileDownload", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "FileDownload"), FileDownload.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "FileDownload" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> postToFileDownloadRelationForStringAsync(FileDownload data, CancellationToken ct) {
        return MethodInvocation.<String, FileDownload >postAsync(this, links, "fileDownload", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "FileDownload"), FileDownload.class, null, data), ct);
    }

    /**
    * Gets the Uri of the Link for the relation "TextAnnotation".
    * Returns the Uri of the Link for the relation "TextAnnotation", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getTextAnnotationRelationLink() {
        return MethodInvocation.getLink(this, links, "textAnnotation");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "TextAnnotation".
    */
    public URI getURIFromTextAnnotationRelation() {
        return MethodInvocation.<URI>get(this, links, "textAnnotation", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "TextAnnotation" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromTextAnnotationRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "textAnnotation", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "TextAnnotation" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromTextAnnotationRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "textAnnotation", URI.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "TextAnnotation".
    */
    public String postToTextAnnotationRelationForString(InputStream data, String bodyContentType) {
        return MethodInvocation.<String, InputStream>post(this, links, "textAnnotation", String.class, data, bodyContentType);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "TextAnnotation" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> postToTextAnnotationRelationForStringAsync(InputStream data, String bodyContentType) { 
        return MethodInvocation.<String, InputStream>postAsync(this, links, "textAnnotation", String.class, data, bodyContentType);
}

    /**
    * Calls the HTTP post Method on the link for the relation "TextAnnotation" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> postToTextAnnotationRelationForStringAsync(InputStream data, String bodyContentType, CancellationToken ct) { 
        return MethodInvocation.<String, InputStream>postAsync(this, links, "textAnnotation", String.class, data, bodyContentType, ct);
}

    /**
    * Gets the Uri of the Link for the relation "ChecksumStatus".
    * Returns the Uri of the Link for the relation "ChecksumStatus", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getChecksumStatusRelationLink() {
        return MethodInvocation.getLink(this, links, "checksumStatus");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "ChecksumStatus".
    */
    public URI getURIFromChecksumStatusRelation() {
        return MethodInvocation.<URI>get(this, links, "checksumStatus", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "ChecksumStatus" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromChecksumStatusRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "checksumStatus", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "ChecksumStatus" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromChecksumStatusRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "checksumStatus", URI.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "XmlDSigContent".
    * Returns the Uri of the Link for the relation "XmlDSigContent", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getXmlDSigContentRelationLink() {
        return MethodInvocation.getLink(this, links, "xmlDSigContent");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "XmlDSigContent".
    */
    public URI getURIFromXmlDSigContentRelation() {
        return MethodInvocation.<URI>get(this, links, "xmlDSigContent", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "XmlDSigContent" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromXmlDSigContentRelationAsync() {
        return MethodInvocation.<URI>getAsync(this, links, "xmlDSigContent", URI.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "XmlDSigContent" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<URI>> getURIFromXmlDSigContentRelationAsync(CancellationToken ct) {
        return MethodInvocation.<URI>getAsync(this, links, "xmlDSigContent", URI.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Rights".
    * Returns the Uri of the Link for the relation "Rights", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getRightsRelationLink() {
        return MethodInvocation.getLink(this, links, "rights");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Rights".
    */
    public Section postToRightsRelationForSection(InputStream data, String bodyContentType) {
        return MethodInvocation.<Section, InputStream>post(this, links, "rights", Section.class, data, bodyContentType);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Rights" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Section>> postToRightsRelationForSectionAsync(InputStream data, String bodyContentType) { 
        return MethodInvocation.<Section, InputStream>postAsync(this, links, "rights", Section.class, data, bodyContentType);
}

    /**
    * Calls the HTTP post Method on the link for the relation "Rights" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Section>> postToRightsRelationForSectionAsync(InputStream data, String bodyContentType, CancellationToken ct) { 
        return MethodInvocation.<Section, InputStream>postAsync(this, links, "rights", Section.class, data, bodyContentType, ct);
}

    /**
    * Gets the Uri of the Link for the relation "ProcessDocumentAction".
    * Returns the Uri of the Link for the relation "ProcessDocumentAction", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getProcessDocumentActionRelationLink() {
        return MethodInvocation.getLink(this, links, "processDocumentAction");
    }

    /**
    * Calls the HTTP put Method on the link for the relation "ProcessDocumentAction".
    */
    public Document putToProcessDocumentActionRelationForDocument(DocumentActionInfo data) {
        return MethodInvocation.<Document,DocumentActionInfo>put(this, links, "processDocumentAction", Document.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentActionInfo"), DocumentActionInfo.class, null, data));
    }

    /**
    * Calls the HTTP put Method on the link for the relation "ProcessDocumentAction" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Document>> putToProcessDocumentActionRelationForDocumentAsync(DocumentActionInfo data) {
        return MethodInvocation.<Document, DocumentActionInfo >putAsync(this, links, "processDocumentAction", Document.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentActionInfo"), DocumentActionInfo.class, null, data));
    }

    /**
    * Calls the HTTP put Method on the link for the relation "ProcessDocumentAction" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Document>> putToProcessDocumentActionRelationForDocumentAsync(DocumentActionInfo data, CancellationToken ct) {
        return MethodInvocation.<Document, DocumentActionInfo >putAsync(this, links, "processDocumentAction", Document.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentActionInfo"), DocumentActionInfo.class, null, data), ct);
    }

    /**
    * Gets the Uri of the Link for the relation "AppProperties".
    * Returns the Uri of the Link for the relation "AppProperties", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getAppPropertiesRelationLink() {
        return MethodInvocation.getLink(this, links, "appProperties");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "AppProperties".
    */
    public DocumentApplicationProperties getDocumentApplicationPropertiesFromAppPropertiesRelation() {
        return MethodInvocation.<DocumentApplicationProperties>get(this, links, "appProperties", DocumentApplicationProperties.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "AppProperties" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentApplicationProperties>> getDocumentApplicationPropertiesFromAppPropertiesRelationAsync() {
        return MethodInvocation.<DocumentApplicationProperties>getAsync(this, links, "appProperties", DocumentApplicationProperties.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "AppProperties" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentApplicationProperties>> getDocumentApplicationPropertiesFromAppPropertiesRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DocumentApplicationProperties>getAsync(this, links, "appProperties", DocumentApplicationProperties.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "AppProperties".
    */
    public DocumentApplicationProperties postToAppPropertiesRelationForDocumentApplicationProperties(DocumentApplicationProperties data) {
        return MethodInvocation.<DocumentApplicationProperties,DocumentApplicationProperties>post(this, links, "appProperties", DocumentApplicationProperties.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentApplicationProperties"), DocumentApplicationProperties.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "AppProperties" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentApplicationProperties>> postToAppPropertiesRelationForDocumentApplicationPropertiesAsync(DocumentApplicationProperties data) {
        return MethodInvocation.<DocumentApplicationProperties, DocumentApplicationProperties >postAsync(this, links, "appProperties", DocumentApplicationProperties.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentApplicationProperties"), DocumentApplicationProperties.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "AppProperties" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentApplicationProperties>> postToAppPropertiesRelationForDocumentApplicationPropertiesAsync(DocumentApplicationProperties data, CancellationToken ct) {
        return MethodInvocation.<DocumentApplicationProperties, DocumentApplicationProperties >postAsync(this, links, "appProperties", DocumentApplicationProperties.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentApplicationProperties"), DocumentApplicationProperties.class, null, data), ct);
    }

    /**
    * Gets the Uri of the Link for the relation "DocumentLinks".
    * Returns the Uri of the Link for the relation "DocumentLinks", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getDocumentLinksRelationLink() {
        return MethodInvocation.getLink(this, links, "documentLinks");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "DocumentLinks".
    */
    public DocumentLinks getDocumentLinksFromDocumentLinksRelation() {
        return MethodInvocation.<DocumentLinks>get(this, links, "documentLinks", DocumentLinks.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "DocumentLinks" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentLinks>> getDocumentLinksFromDocumentLinksRelationAsync() {
        return MethodInvocation.<DocumentLinks>getAsync(this, links, "documentLinks", DocumentLinks.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "DocumentLinks" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentLinks>> getDocumentLinksFromDocumentLinksRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DocumentLinks>getAsync(this, links, "documentLinks", DocumentLinks.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "LatestVersion".
    * Returns the Uri of the Link for the relation "LatestVersion", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getLatestVersionRelationLink() {
        return MethodInvocation.getLink(this, links, "latestVersion");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "LatestVersion".
    */
    public Document getDocumentFromLatestVersionRelation() {
        return MethodInvocation.<Document>get(this, links, "latestVersion", Document.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "LatestVersion" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Document>> getDocumentFromLatestVersionRelationAsync() {
        return MethodInvocation.<Document>getAsync(this, links, "latestVersion", Document.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "LatestVersion" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Document>> getDocumentFromLatestVersionRelationAsync(CancellationToken ct) {
        return MethodInvocation.<Document>getAsync(this, links, "latestVersion", Document.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "VersionHistory".
    * Returns the Uri of the Link for the relation "VersionHistory", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getVersionHistoryRelationLink() {
        return MethodInvocation.getLink(this, links, "versionHistory");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "VersionHistory".
    */
    public DocumentsQueryResult getDocumentsQueryResultFromVersionHistoryRelation() {
        return MethodInvocation.<DocumentsQueryResult>get(this, links, "versionHistory", DocumentsQueryResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "VersionHistory" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentsQueryResult>> getDocumentsQueryResultFromVersionHistoryRelationAsync() {
        return MethodInvocation.<DocumentsQueryResult>getAsync(this, links, "versionHistory", DocumentsQueryResult.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "VersionHistory" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentsQueryResult>> getDocumentsQueryResultFromVersionHistoryRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DocumentsQueryResult>getAsync(this, links, "versionHistory", DocumentsQueryResult.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "VersionHistory".
    */
    public DocumentsQueryResult postToVersionHistoryRelationForDocumentsQueryResult(ResultListQuery data) {
        return MethodInvocation.<DocumentsQueryResult,ResultListQuery>post(this, links, "versionHistory", DocumentsQueryResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ResultListQuery"), ResultListQuery.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "VersionHistory" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentsQueryResult>> postToVersionHistoryRelationForDocumentsQueryResultAsync(ResultListQuery data) {
        return MethodInvocation.<DocumentsQueryResult, ResultListQuery >postAsync(this, links, "versionHistory", DocumentsQueryResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ResultListQuery"), ResultListQuery.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "VersionHistory" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentsQueryResult>> postToVersionHistoryRelationForDocumentsQueryResultAsync(ResultListQuery data, CancellationToken ct) {
        return MethodInvocation.<DocumentsQueryResult, ResultListQuery >postAsync(this, links, "versionHistory", DocumentsQueryResult.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ResultListQuery"), ResultListQuery.class, null, data), ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Intellix".
    * Returns the Uri of the Link for the relation "Intellix", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getIntellixRelationLink() {
        return MethodInvocation.getLink(this, links, "intellix");
    }

    /**
    * Gets the Uri of the Link for the relation "CheckoutDocument".
    * Returns the Uri of the Link for the relation "CheckoutDocument", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getCheckoutDocumentRelationLink() {
        return MethodInvocation.getLink(this, links, "checkoutDocument");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "CheckoutDocument".
    */
    public String postToCheckoutDocumentRelationForString(CheckOutToFileSystemInfo data) {
        return MethodInvocation.<String,CheckOutToFileSystemInfo>post(this, links, "checkoutDocument", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "CheckOutToFileSystemInfo"), CheckOutToFileSystemInfo.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "CheckoutDocument" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> postToCheckoutDocumentRelationForStringAsync(CheckOutToFileSystemInfo data) {
        return MethodInvocation.<String, CheckOutToFileSystemInfo >postAsync(this, links, "checkoutDocument", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "CheckOutToFileSystemInfo"), CheckOutToFileSystemInfo.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "CheckoutDocument" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> postToCheckoutDocumentRelationForStringAsync(CheckOutToFileSystemInfo data, CancellationToken ct) {
        return MethodInvocation.<String, CheckOutToFileSystemInfo >postAsync(this, links, "checkoutDocument", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "CheckOutToFileSystemInfo"), CheckOutToFileSystemInfo.class, null, data), ct);
    }

    /**
    * Gets the Uri of the Link for the relation "CheckoutToFileSystem".
    * Returns the Uri of the Link for the relation "CheckoutToFileSystem", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getCheckoutToFileSystemRelationLink() {
        return MethodInvocation.getLink(this, links, "checkoutToFileSystem");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "CheckoutToFileSystem".
    */
    public String postToCheckoutToFileSystemRelationForString(CheckOutToFileSystemInfo data) {
        return MethodInvocation.<String,CheckOutToFileSystemInfo>post(this, links, "checkoutToFileSystem", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "CheckOutToFileSystemInfo"), CheckOutToFileSystemInfo.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "CheckoutToFileSystem" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> postToCheckoutToFileSystemRelationForStringAsync(CheckOutToFileSystemInfo data) {
        return MethodInvocation.<String, CheckOutToFileSystemInfo >postAsync(this, links, "checkoutToFileSystem", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "CheckOutToFileSystemInfo"), CheckOutToFileSystemInfo.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "CheckoutToFileSystem" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> postToCheckoutToFileSystemRelationForStringAsync(CheckOutToFileSystemInfo data, CancellationToken ct) {
        return MethodInvocation.<String, CheckOutToFileSystemInfo >postAsync(this, links, "checkoutToFileSystem", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "CheckOutToFileSystemInfo"), CheckOutToFileSystemInfo.class, null, data), ct);
    }

    /**
    * Gets the Uri of the Link for the relation "CheckInFromFileSystem".
    * Returns the Uri of the Link for the relation "CheckInFromFileSystem", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getCheckInFromFileSystemRelationLink() {
        return MethodInvocation.getLink(this, links, "checkInFromFileSystem");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "CheckInFromFileSystem".
    */
    public Document postToCheckInFromFileSystemRelationForDocument(InputStream data, String bodyContentType) {
        return MethodInvocation.<Document, InputStream>post(this, links, "checkInFromFileSystem", Document.class, data, bodyContentType);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "CheckInFromFileSystem" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Document>> postToCheckInFromFileSystemRelationForDocumentAsync(InputStream data, String bodyContentType) { 
        return MethodInvocation.<Document, InputStream>postAsync(this, links, "checkInFromFileSystem", Document.class, data, bodyContentType);
}

    /**
    * Calls the HTTP post Method on the link for the relation "CheckInFromFileSystem" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Document>> postToCheckInFromFileSystemRelationForDocumentAsync(InputStream data, String bodyContentType, CancellationToken ct) { 
        return MethodInvocation.<Document, InputStream>postAsync(this, links, "checkInFromFileSystem", Document.class, data, bodyContentType, ct);
}

    /**
    * Gets the Uri of the Link for the relation "DownloadAsArchive".
    * Returns the Uri of the Link for the relation "DownloadAsArchive", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getDownloadAsArchiveRelationLink() {
        return MethodInvocation.getLink(this, links, "downloadAsArchive");
    }

    /**
    * Calls the HTTP post Method on the link for the relation "DownloadAsArchive".
    */
    public String postToDownloadAsArchiveRelationForString(ExportSettings data) {
        return MethodInvocation.<String,ExportSettings>post(this, links, "downloadAsArchive", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ExportSettings"), ExportSettings.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "DownloadAsArchive" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> postToDownloadAsArchiveRelationForStringAsync(ExportSettings data) {
        return MethodInvocation.<String, ExportSettings >postAsync(this, links, "downloadAsArchive", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ExportSettings"), ExportSettings.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "DownloadAsArchive" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> postToDownloadAsArchiveRelationForStringAsync(ExportSettings data, CancellationToken ct) {
        return MethodInvocation.<String, ExportSettings >postAsync(this, links, "downloadAsArchive", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "ExportSettings"), ExportSettings.class, null, data), ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Annotation".
    * Returns the Uri of the Link for the relation "Annotation", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getAnnotationRelationLink() {
        return MethodInvocation.getLink(this, links, "annotation");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Annotation".
    */
    public DocumentAnnotations getDocumentAnnotationsFromAnnotationRelation() {
        return MethodInvocation.<DocumentAnnotations>get(this, links, "annotation", DocumentAnnotations.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Annotation" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentAnnotations>> getDocumentAnnotationsFromAnnotationRelationAsync() {
        return MethodInvocation.<DocumentAnnotations>getAsync(this, links, "annotation", DocumentAnnotations.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Annotation" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentAnnotations>> getDocumentAnnotationsFromAnnotationRelationAsync(CancellationToken ct) {
        return MethodInvocation.<DocumentAnnotations>getAsync(this, links, "annotation", DocumentAnnotations.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Annotation".
    */
    public DocumentAnnotations postToAnnotationRelationForDocumentAnnotations(DocumentAnnotationsPlacement data) {
        return MethodInvocation.<DocumentAnnotations,DocumentAnnotationsPlacement>post(this, links, "annotation", DocumentAnnotations.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentAnnotationsPlacement"), DocumentAnnotationsPlacement.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Annotation" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentAnnotations>> postToAnnotationRelationForDocumentAnnotationsAsync(DocumentAnnotationsPlacement data) {
        return MethodInvocation.<DocumentAnnotations, DocumentAnnotationsPlacement >postAsync(this, links, "annotation", DocumentAnnotations.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentAnnotationsPlacement"), DocumentAnnotationsPlacement.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "Annotation" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<DocumentAnnotations>> postToAnnotationRelationForDocumentAnnotationsAsync(DocumentAnnotationsPlacement data, CancellationToken ct) {
        return MethodInvocation.<DocumentAnnotations, DocumentAnnotationsPlacement >postAsync(this, links, "annotation", DocumentAnnotations.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "DocumentAnnotationsPlacement"), DocumentAnnotationsPlacement.class, null, data), ct);
    }



}
