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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Settings for post submission options
 * 
 * <p>Java-Klasse f�r SubmissionOptions complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="SubmissionOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubmissionMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RedirectUrl" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ShowReturnToForm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="ShowLinkToStoredDocument" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Redirect" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="RedirectImmediately" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="RedirectDelaySeconds" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RedirectType" type="{http://dev.docuware.com/schema/public/services/platform}RedirectType"/>
 *         &lt;element name="ShowSubmissionMessage" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubmissionOptions", propOrder = {
    "submissionMessage",
    "redirectUrl",
    "showReturnToForm",
    "showLinkToStoredDocument",
    "redirect",
    "redirectImmediately",
    "redirectDelaySeconds",
    "redirectType",
    "showSubmissionMessage"
})
public class SubmissionOptions  {

    @XmlElement(name = "SubmissionMessage", required = true)
    protected String submissionMessage;
    @XmlElement(name = "RedirectUrl", required = true)
    protected String redirectUrl;
    @XmlElement(name = "ShowReturnToForm")
    protected boolean showReturnToForm;
    @XmlElement(name = "ShowLinkToStoredDocument")
    protected boolean showLinkToStoredDocument;
    @XmlElement(name = "Redirect")
    protected boolean redirect;
    @XmlElement(name = "RedirectImmediately")
    protected boolean redirectImmediately;
    @XmlElement(name = "RedirectDelaySeconds")
    protected int redirectDelaySeconds;
    @XmlElement(name = "RedirectType", required = true)
    @XmlSchemaType(name = "string")
    protected RedirectType redirectType;
    @XmlElement(name = "ShowSubmissionMessage")
    protected boolean showSubmissionMessage;

    /**
     * Ruft den Wert der submissionMessage-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmissionMessage() {
        return submissionMessage;
    }

    /**
     * Legt den Wert der submissionMessage-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmissionMessage(String value) {
        this.submissionMessage = value;
    }

    /**
     * Ruft den Wert der redirectUrl-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedirectUrl() {
        return redirectUrl;
    }

    /**
     * Legt den Wert der redirectUrl-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedirectUrl(String value) {
        this.redirectUrl = value;
    }

    /**
     * Ruft den Wert der showReturnToForm-Eigenschaft ab.
     * 
     */
    public boolean isShowReturnToForm() {
        return showReturnToForm;
    }

    /**
     * Legt den Wert der showReturnToForm-Eigenschaft fest.
     * 
     */
    public void setShowReturnToForm(boolean value) {
        this.showReturnToForm = value;
    }

    /**
     * Ruft den Wert der showLinkToStoredDocument-Eigenschaft ab.
     * 
     */
    public boolean isShowLinkToStoredDocument() {
        return showLinkToStoredDocument;
    }

    /**
     * Legt den Wert der showLinkToStoredDocument-Eigenschaft fest.
     * 
     */
    public void setShowLinkToStoredDocument(boolean value) {
        this.showLinkToStoredDocument = value;
    }

    /**
     * Ruft den Wert der redirect-Eigenschaft ab.
     * 
     */
    public boolean isRedirect() {
        return redirect;
    }

    /**
     * Legt den Wert der redirect-Eigenschaft fest.
     * 
     */
    public void setRedirect(boolean value) {
        this.redirect = value;
    }

    /**
     * Ruft den Wert der redirectImmediately-Eigenschaft ab.
     * 
     */
    public boolean isRedirectImmediately() {
        return redirectImmediately;
    }

    /**
     * Legt den Wert der redirectImmediately-Eigenschaft fest.
     * 
     */
    public void setRedirectImmediately(boolean value) {
        this.redirectImmediately = value;
    }

    /**
     * Ruft den Wert der redirectDelaySeconds-Eigenschaft ab.
     * 
     */
    public int getRedirectDelaySeconds() {
        return redirectDelaySeconds;
    }

    /**
     * Legt den Wert der redirectDelaySeconds-Eigenschaft fest.
     * 
     */
    public void setRedirectDelaySeconds(int value) {
        this.redirectDelaySeconds = value;
    }

    /**
     * Ruft den Wert der redirectType-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link RedirectType }
     *     
     */
    public RedirectType getRedirectType() {
        return redirectType;
    }

    /**
     * Legt den Wert der redirectType-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link RedirectType }
     *     
     */
    public void setRedirectType(RedirectType value) {
        this.redirectType = value;
    }

    /**
     * Ruft den Wert der showSubmissionMessage-Eigenschaft ab.
     * 
     */
    public boolean isShowSubmissionMessage() {
        return showSubmissionMessage;
    }

    /**
     * Legt den Wert der showSubmissionMessage-Eigenschaft fest.
     * 
     */
    public void setShowSubmissionMessage(boolean value) {
        this.showSubmissionMessage = value;
    }



}
