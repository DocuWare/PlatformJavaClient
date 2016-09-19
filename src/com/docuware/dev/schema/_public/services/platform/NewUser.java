

package com.docuware.dev.schema._public.services.platform;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.CompletableFuture;
import java.util.*;
import com.docuware.dev.schema._public.services.Link;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NewUser")
public class NewUser  {

    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "DbName", required = true)
    protected String dbName;
    @XmlAttribute(name = "Email")
    protected String email;
    @XmlAttribute(name = "NetworkId")
    protected String networkId;
    @XmlAttribute(name = "Password", required = true)
    protected String password;

    /**The Name of the user.*/
    public String getName() {
        return name;
    }

    /**The Name of the user.*/
    public void setName(String value) {
        this.name = value;
    }

    /**The Database Name of the user.*/
    public String getDbName() {
        return dbName;
    }

    /**The Database Name of the user.*/
    public void setDbName(String value) {
        this.dbName = value;
    }

    /**The Email of the user.*/
    public String getEmail() {
        return email;
    }

    /**The Email of the user.*/
    public void setEmail(String value) {
        this.email = value;
    }

    /**The NetworkId of the user.*/
    public String getNetworkId() {
        return networkId;
    }

    /**The NetworkId of the user.*/
    public void setNetworkId(String value) {
        this.networkId = value;
    }

    /**The Password of the user.*/
    public String getPassword() {
        return password;
    }

    /**The Password of the user.*/
    public void setPassword(String value) {
        this.password = value;
    }



}
