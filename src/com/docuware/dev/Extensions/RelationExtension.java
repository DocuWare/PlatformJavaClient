/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docuware.dev.Extensions;

import com.docuware.dev.schema._public.services.Link;
import com.docuware.dev.schema._public.services.Links;

/**
 *
 * @author Patrick
 */
public class RelationExtension {
      
    /**
     * Gets the link by its name
     * 
     * @param links The links
     * @param relationName  Name of the relation
     * @return  The link, if it exists; null otherwise
     */
    public static Link getLink(Links links, String relationName) {
        for (Link l : links.getLink()) {
            if (l.getRel().equals(relationName)) {
                return l;
            }
        }
        return null;
    }

    /**
     * Gets the link by its name
     * 
     * @param linkable  The linkable
     * @param relationName  Name of the relation
     * @return  The link, if it exists; null otherwise
     */
    public static Link getLink(IRelations linkable, String relationName) {
        Links links = linkable.getLinks();
        if (links == null) {
            return null;
        }
        return RelationExtension.getLink(links, relationName);
    }

    /**
     * Gets the URI of the relation specified by the name
     * 
     * @param relations The relations
     * @param relationName  Name of the relation
     * @return  The link, if it exists; null otherwise
     */
    static public String getRelationUri(IRelations relations, String relationName) {
        Link result = RelationExtension.getLink(relations, relationName);
        return result == null ? null : result.getHref();
    }

    /**
     * Gets the URI of the relation specified by the name
     * 
     * @param relations The relations
     * @param relationName  Name of the relation
     * @return  The link
     * @throws RuntimeException: The specified link is not found
     */
    static public String getRelationUriOrThrow(IRelations relations, String relationName) {
        String result = RelationExtension.getRelationUri(relations, relationName);
        if (result == null) {
            throw new RuntimeException("The specified link is not found.");
        }
        return result;
    }

    /**
     * Determines whether the specified link exists
     * 
     * @param relations The relations
     * @param relationName  Name of the relation
     * @return true if the specified link exists; otherwise false;
     */
    static public boolean hasRelationUri(IRelations relations, String relationName) {
        Link result = RelationExtension.getLink(relations, relationName);
        return result != null;
    }
}
