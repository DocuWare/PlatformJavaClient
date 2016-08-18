/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docuware.dev.Extensions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Patrick
 */
public class CancellationTokenSource {
    
    private final CancellationToken cancellationToken;
    
    public CancellationTokenSource() {
        cancellationToken = new CancellationToken();
    }
    
    /**
     * Get the CancellationToken of the Tokensource
     * @return the cancellationToken
     */
    public CancellationToken token() {
        return cancellationToken;
    }
    
    /**
     * cancel the CancellationToken
     */
    public void cancel() {
        cancellationToken.cancel();
    }
    
    /**
     * Wait the time and then try to cancel the Future
     * @param time  The time to wait in milliSeconds
     */
    public void cancelAfter(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException ex) {
            Logger.getLogger(CancellationTokenSource.class.getName()).log(Level.SEVERE, null, ex);
        }
        cancel();
    }
}
