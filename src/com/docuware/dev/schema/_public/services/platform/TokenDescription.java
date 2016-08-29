

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import com.docuware.dev.settings.interop.DWProductTypes;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TokenDescription", propOrder = {
    "targetProducts"
})
public class TokenDescription  {

    @XmlElement(name = "TargetProducts")
    @XmlSchemaType(name = "string")
    protected List<DWProductTypes> targetProducts;
    @XmlAttribute(name = "Usage", required = true)
    protected TokenUsage usage;
    @XmlAttribute(name = "Lifetime", required = true)
    protected Duration lifetime;

    /**The token can be used multiple times*/
    public List<DWProductTypes> getTargetProducts() {
        if (targetProducts == null) {
            targetProducts = new ArrayList<DWProductTypes>();
        }
        return this.targetProducts;
    }

    /**Define the usage of the token.*/
    public TokenUsage getUsage() {
        return usage;
    }

    /**Define the usage of the token.*/
    public void setUsage(TokenUsage value) {
        this.usage = value;
    }

    /**Lifetime of the token. After lifetime expires token cannot be used anymore. This parameter contains a time interval specification in the form:
          [ws][-]{ d | [d.]hh:mm[:ss[.ff]] }[ws]
          Elements in square brackets ([ and ]) are optional. One selection from the list of alternatives enclosed in braces ({ and }) and separated by vertical bars (|) is required.
          For more details check http://msdn.microsoft.com/en-us/library/se73z7b9.aspx*/
    public Duration getLifetime() {
        return lifetime;
    }

    /**Lifetime of the token. After lifetime expires token cannot be used anymore. This parameter contains a time interval specification in the form:
          [ws][-]{ d | [d.]hh:mm[:ss[.ff]] }[ws]
          Elements in square brackets ([ and ]) are optional. One selection from the list of alternatives enclosed in braces ({ and }) and separated by vertical bars (|) is required.
          For more details check http://msdn.microsoft.com/en-us/library/se73z7b9.aspx*/
    public void setLifetime(Duration value) {
        this.lifetime = value;
    }



}
