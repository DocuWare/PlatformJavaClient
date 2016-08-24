

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;
import java.io.InputStream;
import com.docuware.dev.schema._public.services.platform.FormFieldValues;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.schema._public.services.Links;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Stamp", propOrder = {
"proxy",
    "formField",
    "fields",
    "headFont",
    "textStampOrStrokeStampOrBitmapStamp",
    "links"
})
public class Stamp  implements IRelationsWithProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "FormField")
    protected List<StampFormField> formField;
    @XmlElement(name = "Fields")
    protected List<StampField> fields;
    @XmlElement(name = "HeadFont", required = true)
    protected Font headFont;
    @XmlElements({
        @XmlElement(name = "TextStamp", type = TextStamp.class),
        @XmlElement(name = "StrokeStamp", type = StrokeStamp.class),
        @XmlElement(name = "BitmapStamp", type = BitmapStamp.class)
    })
    protected Object textStampOrStrokeStampOrBitmapStamp;
    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;
    @XmlAttribute(name = "PasswordProtected", required = true)
    protected boolean passwordProtected;
    @XmlAttribute(name = "Signature", required = true)
    protected StampSignatureType signature;
    @XmlAttribute(name = "Color", required = true)
    protected String color;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "DisplayName", required = true)
    protected String displayName;
    @XmlAttribute(name = "Overwrite")
    protected Boolean overwrite;
    @XmlAttribute(name = "Id", required = true)
    protected String id;
    @XmlAttribute(name = "IsHidden")
    protected Boolean isHidden;
    @XmlAttribute(name = "Autosave")
    protected Integer autosave;
    @XmlAttribute(name = "CloseAfterStampSet")
    protected Boolean closeAfterStampSet;
    @XmlAttribute(name = "AutomaticallyOpenNextDocument")
    protected Boolean automaticallyOpenNextDocument;
    @XmlAttribute(name = "KeepStampActive")
    protected Boolean keepStampActive;

    /**List of the stamp form fields.*/
    public List<StampFormField> getFormField() {
        if (formField == null) {
            formField = new ArrayList<StampFormField>();
        }
        return this.formField;
    }

    /**List of the stamp fields.*/
    public List<StampField> getFields() {
        if (fields == null) {
            fields = new ArrayList<StampField>();
        }
        return this.fields;
    }

    /**Font for the additional items of information.*/
    public Font getHeadFont() {
        return headFont;
    }

    /**Font for the additional items of information.*/
    public void setHeadFont(Font value) {
        this.headFont = value;
    }

    public Object getTextStampOrStrokeStampOrBitmapStamp() {
        return textStampOrStrokeStampOrBitmapStamp;
    }

    public void setTextStampOrStrokeStampOrBitmapStamp(Object value) {
        this.textStampOrStrokeStampOrBitmapStamp = value;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links value) {
        this.links = value;
    }

    /**If this flag is true password is needed to place the stamp.*/
    @Dolphin
    public boolean isPasswordProtected() {
        return passwordProtected;
    }

    /**If this flag is true password is needed to place the stamp.*/
    @Dolphin
    public void setPasswordProtected(boolean value) {
        this.passwordProtected = value;
    }

    /**The type of the stamp signature if there is any.*/
    public StampSignatureType getSignature() {
        return signature;
    }

    /**The type of the stamp signature if there is any.*/
    public void setSignature(StampSignatureType value) {
        this.signature = value;
    }

    /**The color of the stamp content*/
    public String getColor() {
        return color;
    }

    /**The color of the stamp content*/
    public void setColor(String value) {
        this.color = value;
    }

    /**The name of the stamp.*/
    public String getName() {
        return name;
    }

    /**The name of the stamp.*/
    public void setName(String value) {
        this.name = value;
    }

    /**The name of the stamp.*/
    public String getDisplayName() {
        return displayName;
    }

    /**The name of the stamp.*/
    public void setDisplayName(String value) {
        this.displayName = value;
    }

    /**If this flag is true the system will overwrite existing database entries with the stamp entries.*/
    public boolean isOverwrite() {
        if (overwrite == null) {
            return false;
        } else {
            return overwrite;
        }
    }

    /**If this flag is true the system will overwrite existing database entries with the stamp entries.*/
    public void setOverwrite(Boolean value) {
        this.overwrite = value;
    }

    /**The id of the stamp, which is a GUID usually.*/
    public String getId() {
        return id;
    }

    /**The id of the stamp, which is a GUID usually.*/
    public void setId(String value) {
        this.id = value;
    }

    /**Determines whether the stamp is visible.*/
    public boolean isIsHidden() {
        if (isHidden == null) {
            return false;
        } else {
            return isHidden;
        }
    }

    /**Determines whether the stamp is visible.*/
    public void setIsHidden(Boolean value) {
        this.isHidden = value;
    }

    /**Automatically save the stamp after specified period in seconds. Value -1 mean the stamp have to be saved on user action.*/
    public int getAutosave() {
        if (autosave == null) {
            return -1;
        } else {
            return autosave;
        }
    }

    /**Automatically save the stamp after specified period in seconds. Value -1 mean the stamp have to be saved on user action.*/
    public void setAutosave(Integer value) {
        this.autosave = value;
    }

    /**Automatically close the window after stamp is placed in a document*/
    public boolean isCloseAfterStampSet() {
        if (closeAfterStampSet == null) {
            return false;
        } else {
            return closeAfterStampSet;
        }
    }

    /**Automatically close the window after stamp is placed in a document*/
    public void setCloseAfterStampSet(Boolean value) {
        this.closeAfterStampSet = value;
    }

    /**Determines whether the stamp remains active after being stored.*/
    @Dolphin
    public boolean isAutomaticallyOpenNextDocument() {
        if (automaticallyOpenNextDocument == null) {
            return false;
        } else {
            return automaticallyOpenNextDocument;
        }
    }

    /**Determines whether the stamp remains active after being stored.*/
    @Dolphin
    public void setAutomaticallyOpenNextDocument(Boolean value) {
        this.automaticallyOpenNextDocument = value;
    }

    /**Determines whether next document is opened automatically after the stamp is stored.*/
    @Dolphin
    public boolean isKeepStampActive() {
        if (keepStampActive == null) {
            return false;
        } else {
            return keepStampActive;
        }
    }

    /**Determines whether next document is opened automatically after the stamp is stored.*/
    @Dolphin
    public void setKeepStampActive(Boolean value) {
        this.keepStampActive = value;
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
	if(this.proxy!=null) { 
        for (int i = 0; (i < this.formField.size()); i = (i + 1)) {
            this.formField.get(i).setProxy(proxy);
        }
	}
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
    * Gets the Uri of the Link for the relation "AsBitmap".
    * Returns the Uri of the Link for the relation "AsBitmap", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getAsBitmapRelationLink() {
        return MethodInvocation.getLink(this, links, "asBitmap");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "AsBitmap".
    */
    public InputStream getInputStreamFromAsBitmapRelation() {
        return MethodInvocation.<InputStream>get(this, links, "asBitmap", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "AsBitmap" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<InputStream>> getInputStreamFromAsBitmapRelationAsync() {
        return MethodInvocation.<InputStream>getAsync(this, links, "asBitmap", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "AsBitmap" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<InputStream>> getInputStreamFromAsBitmapRelationAsync(CancellationToken ct) {
        return MethodInvocation.<InputStream>getAsync(this, links, "asBitmap", InputStream.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "AsBitmap".
    */
    public String postToAsBitmapRelationForString(FormFieldValues data) {
        return MethodInvocation.<String,FormFieldValues>post(this, links, "asBitmap", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "StampFormFields"), FormFieldValues.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "AsBitmap" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> postToAsBitmapRelationForStringAsync(FormFieldValues data) {
        return MethodInvocation.<String, FormFieldValues >postAsync(this, links, "asBitmap", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "StampFormFields"), FormFieldValues.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "AsBitmap" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> postToAsBitmapRelationForStringAsync(FormFieldValues data, CancellationToken ct) {
        return MethodInvocation.<String, FormFieldValues >postAsync(this, links, "asBitmap", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "StampFormFields"), FormFieldValues.class, null, data), ct);
    }

    /**
    * Gets the Uri of the Link for the relation "AsSvg".
    * Returns the Uri of the Link for the relation "AsSvg", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getAsSvgRelationLink() {
        return MethodInvocation.getLink(this, links, "asSvg");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "AsSvg".
    */
    public InputStream getInputStreamFromAsSvgRelation() {
        return MethodInvocation.<InputStream>get(this, links, "asSvg", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "AsSvg" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<InputStream>> getInputStreamFromAsSvgRelationAsync() {
        return MethodInvocation.<InputStream>getAsync(this, links, "asSvg", InputStream.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "AsSvg" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<InputStream>> getInputStreamFromAsSvgRelationAsync(CancellationToken ct) {
        return MethodInvocation.<InputStream>getAsync(this, links, "asSvg", InputStream.class, ct);
    }

    /**
    * Calls the HTTP post Method on the link for the relation "AsSvg".
    */
    public String postToAsSvgRelationForString(FormFieldValues data) {
        return MethodInvocation.<String,FormFieldValues>post(this, links, "asSvg", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "StampFormFields"), FormFieldValues.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "AsSvg" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> postToAsSvgRelationForStringAsync(FormFieldValues data) {
        return MethodInvocation.<String, FormFieldValues >postAsync(this, links, "asSvg", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "StampFormFields"), FormFieldValues.class, null, data));
    }

    /**
    * Calls the HTTP post Method on the link for the relation "AsSvg" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<String>> postToAsSvgRelationForStringAsync(FormFieldValues data, CancellationToken ct) {
        return MethodInvocation.<String, FormFieldValues >postAsync(this, links, "asSvg", String.class, new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "StampFormFields"), FormFieldValues.class, null, data), ct);
    }



}
