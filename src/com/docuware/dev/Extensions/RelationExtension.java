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
        /// <summary>
    /// Gets the link by its name.
    /// </summary>
    /// <param name="links">The links.</param>
    /// <param name="relationName">Name of the relation.</param>
    /// <returns>The link, if it exists; <c>null</c> otherwise.</returns>

    public static Link getLink(Links links, String relationName) {
        for (Link l : links.getLink()) {
            if (l.getRel().equals(relationName)) {
                return l;
            }
        }
        return null;
    }

        /// <summary>
    /// Gets the link by its name.
    /// </summary>
    /// <param name="linkable">The linkable.</param>
    /// <param name="relationName">Name of the relation.</param>
    /// <returns>The link, if it exists; <c>null</c> otherwise.</returns>
    public static Link getLink(IRelations linkable, String relationName) {
        Links links = linkable.getLinks();
        if (links == null) {
            return null;
        }
        return RelationExtension.getLink(links, relationName);
    }

        /// <summary>
    /// Gets the URI of the relation specified by the name.
    /// </summary>
    /// <param name="relations">The relations.</param>
    /// <param name="relationName">Name of the relation.</param>
    /// <returns>The link, if it exists; <c>null</c> otherwise.</returns>
    static public String getRelationUri(IRelations relations, String relationName) {
        Link result = RelationExtension.getLink(relations, relationName);
        return result == null ? null : result.getHref();
    }

        /// <summary>
    /// Gets the URI of the relation specified by the name.
    /// </summary>
    /// <param name="relations">The relations.</param>
    /// <param name="relationName">Name of the relation.</param>
    /// <returns></returns>
    /// <exception cref="System.ArgumentException">The specified link is not found.</exception>
    static public String getRelationUriOrThrow(IRelations relations, String relationName) {
        String result = RelationExtension.getRelationUri(relations, relationName);
        if (result == null) {
            throw new RuntimeException("The specified link is not found.");
        }
        return result;
    }

        /// <summary>
    /// Determines whether the specified link exists.
    /// </summary>
    /// <param name="relations">The relations.</param>
    /// <param name="relationName">Name of the relation.</param>
    /// <returns>
    ///   <c>true</c> if the specified link exists; otherwise, <c>false</c>.
    /// </returns>
    static public boolean hasRelationUri(IRelations relations, String relationName) {
        Link result = RelationExtension.getLink(relations, relationName);
        return result != null;
    }
}
