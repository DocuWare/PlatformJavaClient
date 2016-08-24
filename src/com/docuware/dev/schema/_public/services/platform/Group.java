

package com.docuware.dev.schema._public.services.platform;

import java.net.URI;
import com.docuware.dev.Extensions.*;
import java.util.concurrent.Future;
import com.docuware.dev.schema._public.services.Link;
import com.docuware.dev.schema._public.services.platform.Group;
import com.docuware.dev.schema._public.services.platform.Users;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.docuware.dev.schema._public.services.Links;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Group", propOrder = {
"proxy",
    "links"
})
public class Group  implements IRelationsWithProxy {
private HttpClientProxy proxy;//test


    @XmlElement(name = "Links", namespace = "http://dev.docuware.com/schema/public/services", required = true)
    protected Links links;
    @XmlAttribute(name = "Id")
    protected String id;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "Active", required = true)
    protected boolean active;

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links value) {
        this.links = value;
    }

    /**The role id.*/
    public String getId() {
        return id;
    }

    /**The role id.*/
    public void setId(String value) {
        this.id = value;
    }

    /**The name of the group.*/
    public String getName() {
        return name;
    }

    /**The name of the group.*/
    public void setName(String value) {
        this.name = value;
    }

    /**Is group active flag.*/
    public boolean isActive() {
        return active;
    }

    /**Is group active flag.*/
    public void setActive(boolean value) {
        this.active = value;
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
    public Group getGroupFromSelfRelation() {
        return MethodInvocation.<Group>get(this, links, "self", Group.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Self" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Group>> getGroupFromSelfRelationAsync() {
        return MethodInvocation.<Group>getAsync(this, links, "self", Group.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Self" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Group>> getGroupFromSelfRelationAsync(CancellationToken ct) {
        return MethodInvocation.<Group>getAsync(this, links, "self", Group.class, ct);
    }

    /**
    * Gets the Uri of the Link for the relation "Users".
    * Returns the Uri of the Link for the relation "Users", if this links exists, or null, if this link does not exists. The returned link can be relative or absolute. If it is a relative link you must set it in the right context yourself.
    * @return  the requested URI
    */
    public URI getUsersRelationLink() {
        return MethodInvocation.getLink(this, links, "users");
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Users".
    */
    public Users getUsersFromUsersRelation() {
        return MethodInvocation.<Users>get(this, links, "users", Users.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Users" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Users>> getUsersFromUsersRelationAsync() {
        return MethodInvocation.<Users>getAsync(this, links, "users", Users.class);
    }

    /**
    * Calls the HTTP Get Method on the link for the relation "Users" asynchronously.
    */
    public Future<DeserializedHttpResponseGen<Users>> getUsersFromUsersRelationAsync(CancellationToken ct) {
        return MethodInvocation.<Users>getAsync(this, links, "users", Users.class, ct);
    }



}
