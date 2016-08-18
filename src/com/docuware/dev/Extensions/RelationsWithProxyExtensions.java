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
      
    /**
     * Gets the base Uri of the specified relations instance
     * 
     * @param relationsWithProxy The relations with proxy
     * @return The base Uri lf the specified relations instance
     */
    static public URI getBaseUri(IRelationsWithProxy relationsWithProxy) {
        return relationsWithProxy.getProxy().getBaseAddress();
    }
}
