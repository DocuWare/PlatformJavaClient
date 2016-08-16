/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docuware.dev.Extensions;

import java.net.URI;

/**
 *
 * @author Patrick
 */
public class RelationsWithProxyExtensions {
        /// <summary>
    /// Gets the base URI of the specified relations instance.
    /// </summary>
    /// <param name="relationsWithProxy">The relations with proxy.</param>
    /// <returns>The base URI of the specified relations instance.</returns>

    static public URI getBaseUri(IRelationsWithProxy relationsWithProxy) {
        return relationsWithProxy.getProxy().getBaseAddress();
    }
}
