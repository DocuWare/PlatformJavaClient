

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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

    public String getSubmissionMessage() {
        return submissionMessage;
    }

    public void setSubmissionMessage(String value) {
        this.submissionMessage = value;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String value) {
        this.redirectUrl = value;
    }

    public boolean isShowReturnToForm() {
        return showReturnToForm;
    }

    public void setShowReturnToForm(boolean value) {
        this.showReturnToForm = value;
    }

    public boolean isShowLinkToStoredDocument() {
        return showLinkToStoredDocument;
    }

    public void setShowLinkToStoredDocument(boolean value) {
        this.showLinkToStoredDocument = value;
    }

    public boolean isRedirect() {
        return redirect;
    }

    public void setRedirect(boolean value) {
        this.redirect = value;
    }

    public boolean isRedirectImmediately() {
        return redirectImmediately;
    }

    public void setRedirectImmediately(boolean value) {
        this.redirectImmediately = value;
    }

    public int getRedirectDelaySeconds() {
        return redirectDelaySeconds;
    }

    public void setRedirectDelaySeconds(int value) {
        this.redirectDelaySeconds = value;
    }

    public RedirectType getRedirectType() {
        return redirectType;
    }

    public void setRedirectType(RedirectType value) {
        this.redirectType = value;
    }

    public boolean isShowSubmissionMessage() {
        return showSubmissionMessage;
    }

    public void setShowSubmissionMessage(boolean value) {
        this.showSubmissionMessage = value;
    }



}
