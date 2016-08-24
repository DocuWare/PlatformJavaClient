

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
@XmlType(name = "DocumentsTransferInfo", propOrder = {
"proxy",
    "documents"
})
public class DocumentsTransferInfo  implements IHttpClientProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Documents", required = true)
    protected DocumentsTransferInfo.Documents documents;
    @XmlAttribute(name = "SourceFileCabinetId", required = true)
    protected String sourceFileCabinetId;
    @XmlAttribute(name = "UseDefaultDialog")
    protected Boolean useDefaultDialog;
    @XmlAttribute(name = "KeepSource")
    protected Boolean keepSource;
    @XmlAttribute(name = "FillIntellix")
    protected Boolean fillIntellix;

    /**Gets information for the transfered documents (document id, new index entries, etc.). If the new index entries are empty then the original entries from the source document are used.*/
    @Eagle
    public DocumentsTransferInfo.Documents getDocuments() {
        return documents;
    }

    /**Gets information for the transfered documents (document id, new index entries, etc.). If the new index entries are empty then the original entries from the source document are used.*/
    @Eagle
    public void setDocuments(DocumentsTransferInfo.Documents value) {
        this.documents = value;
    }

    /**Gets the id of the file cabinet which contains the document to be copied/moved.*/
    @Eagle
    public String getSourceFileCabinetId() {
        return sourceFileCabinetId;
    }

    /**Gets the id of the file cabinet which contains the document to be copied/moved.*/
    @Eagle
    public void setSourceFileCabinetId(String value) {
        this.sourceFileCabinetId = value;
    }

    /**Gets a value indicating whether a default store dialog, if such dialog is assing to the user, to be used.*/
    public boolean isUseDefaultDialog() {
        if (useDefaultDialog == null) {
            return false;
        } else {
            return useDefaultDialog;
        }
    }

    /**Gets a value indicating whether a default store dialog, if such dialog is assing to the user, to be used.*/
    public void setUseDefaultDialog(Boolean value) {
        this.useDefaultDialog = value;
    }

    /**If this flag is true the source documents remain in the source file cabinet; otherwise they are removed from the source file cabinet.*/
    @Eagle
    public boolean isKeepSource() {
        if (keepSource == null) {
            return false;
        } else {
            return keepSource;
        }
    }

    /**If this flag is true the source documents remain in the source file cabinet; otherwise they are removed from the source file cabinet.*/
    @Eagle
    public void setKeepSource(Boolean value) {
        this.keepSource = value;
    }

    /**If this flag is true the source document's metadata is adjusted with intellix suggestions using the intellix map for the default assigned file cabinet.*/
    @Eagle
    public boolean isFillIntellix() {
        if (fillIntellix == null) {
            return false;
        } else {
            return fillIntellix;
        }
    }

    /**If this flag is true the source document's metadata is adjusted with intellix suggestions using the intellix map for the default assigned file cabinet.*/
    @Eagle
    public void setFillIntellix(Boolean value) {
        this.fillIntellix = value;
    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "document"
    })
    public static class Documents {

        @XmlElement(name = "Document")
        protected List<Document> document;

    /**Gets information for the transfered documents (document id, new index entries, etc.). If the new index entries are empty then the original entries from the source document are used.*/
    @Eagle
        public List<Document> getDocument() {
            if (document == null) {
                document = new ArrayList<Document>();
            }
            return this.document;
        }

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
	if(this.documents!=null) {  
        for (int i = 0; (i < this.documents.getDocument().size()); i = (i + 1)) {
            this.documents.getDocument().get(i).setProxy(proxy);
        }
	}
    }



}
