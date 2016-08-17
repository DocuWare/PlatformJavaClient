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
 *
 * @author Patrick
 */
public class CancellationToken {
    
    List<Future> fut = new LinkedList();
    Boolean cancellationRequested;
    
    CancellationToken(Future fut) {
        this.fut.add(fut);
    }
    
    public boolean isCancellationRequested() {
        return cancellationRequested;
    }
   
    CancellationToken(){
            cancellationRequested = false;
            };
    
    void addFuture(Future fut) {
       this.fut.add(fut);
    }
    
    void cancel() {
        cancellationRequested = true;
        for(Future f: fut)
        f.cancel(true);
        try {
            this.finalize();
        } catch (Throwable ex) {
            Logger.getLogger(CancellationToken.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
