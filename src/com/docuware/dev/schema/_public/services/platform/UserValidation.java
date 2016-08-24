

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserValidation")
public class UserValidation  {

    @XmlAttribute(name = "Password", required = true)
    protected String password;

    /**Password to validate*/
    @Dolphin
    public String getPassword() {
        return password;
    }

    /**Password to validate*/
    @Dolphin
    public void setPassword(String value) {
        this.password = value;
    }



}
