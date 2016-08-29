/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docuware.dev.Extensions;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class represents a cancellation token. This token is used to get an easy way to cancel a future. Therefore you just call
 * the Method and give it a CancellationToken. If you want to cancel the future you then just cancel your token. 
 * A CancellationToken is created by a CancellationTokenSource.
 */
public class CancellationToken {
    
    List<Future> fut = new LinkedList();
    Boolean cancellationRequested;
    
    CancellationToken(Future fut) {
        this.fut.add(fut);
    }
    
    /**
     * Gets cancellationRequested-Attribute
     * @return cancellationRequested
     */
    public boolean isCancellationRequested() {
        return cancellationRequested;
    }
   
    CancellationToken(){
            cancellationRequested = false;
            };
    
    /**
     * Give the token the controll over the Future. Afterwards if the token is cancelled, it will try to cancel the future, too.
     * 
     * @param fut   The future which should be controlled 
     */
    void addFuture(Future fut) {
       this.fut.add(fut);
    }
    
    /**
     * Cancel all Futures under the control of the Token and finalize the token
     */
    void cancel() {
        cancellationRequested = true;
        fut.stream().forEach((f) -> {
            f.cancel(true);
        });
        try {
            this.finalize();
        } catch (Throwable ex) {
            Logger.getLogger(CancellationToken.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
