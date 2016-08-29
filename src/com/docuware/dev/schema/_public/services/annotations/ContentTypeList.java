

package com.docuware.dev.schema._public.services.annotations;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.namespace.QName;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContentTypeList", propOrder = {
    "contentTypeOrSchemaTypeOrComplexType"
})
public class ContentTypeList  {

    @XmlElements({
        @XmlElement(name = "ContentType", type = ContentTypeList.ContentType.class),
        @XmlElement(name = "SchemaType", type = ContentTypeList.SchemaType.class),
        @XmlElement(name = "ComplexType", type = ContentTypeList.ComplexType.class)
    })
    protected List<Object> contentTypeOrSchemaTypeOrComplexType;
    @XmlAttribute(name = "IntroducedIn")
    protected String introducedIn;

    public List<Object> getContentTypeOrSchemaTypeOrComplexType() {
        if (contentTypeOrSchemaTypeOrComplexType == null) {
            contentTypeOrSchemaTypeOrComplexType = new ArrayList<Object>();
        }
        return this.contentTypeOrSchemaTypeOrComplexType;
    }

    public String getIntroducedIn() {
        return introducedIn;
    }

    public void setIntroducedIn(String value) {
        this.introducedIn = value;
    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class ComplexType {

        @XmlAnyElement(lax = true)
        protected XElementWrapper any;
        @XmlAttribute(name = "IntroducedIn")
        protected String introducedIn;

        public XElementWrapper getAny() {
            return any;
        }

        public void setAny(XElementWrapper value) {
            this.any = value;
        }

        public String getIntroducedIn() {
            return introducedIn;
        }

        public void setIntroducedIn(String value) {
            this.introducedIn = value;
        }

    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class ContentType {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "IntroducedIn")
        protected String introducedIn;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getIntroducedIn() {
            return introducedIn;
        }

        public void setIntroducedIn(String value) {
            this.introducedIn = value;
        }

    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class SchemaType {

        @XmlValue
        protected QName value;
        @XmlAttribute(name = "IntroducedIn")
        protected String introducedIn;

        public QName getValue() {
            return value;
        }

        public void setValue(QName value) {
            this.value = value;
        }

        public String getIntroducedIn() {
            return introducedIn;
        }

        public void setIntroducedIn(String value) {
            this.introducedIn = value;
        }

    }



}
