/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docuware.dev.Extensions;

import com.docuware.dev.schema._public.services.platform.Document;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

/**
 *
 * @author Patrick
 */
public class DocumentLockExtensions {

    /**
     *  Locks this instance and returns a DocumentLock object which can be used to unlock this document later.
     * 
     * @param document  The document.
     * @param operation A client identifier associated with lock operation
     * @param lockIntervalInSeconds 
     * @return 
     */
    public static CompletableFuture<DocumentLock> lockAsync(Document document, String operation, int lockIntervalInSeconds) {
        DocumentLockRequestHandler dlrh = new DocumentLockRequestHandler(document);
        dlrh.setLockIntervalInSeconds(lockIntervalInSeconds);
        return DocumentLock.createAsync(operation, dlrh);
    }

    /**
     *  Locks this instance and returns a DocumentLock object which can be used to unlock this document later.
     * 
     * @param document  The document.
     * @param operation A client identifier associated with lock operation
     * @return 
     */
    @Overloaded
    public static CompletableFuture<DocumentLock> lockAsync(Document document, String operation) {
        DocumentLockRequestHandler dlrh = new DocumentLockRequestHandler(document);
        dlrh.setLockIntervalInSeconds(60);
        return DocumentLock.createAsync(operation, dlrh);
    }

    /**
     * Locks this instance and returns a DocumentLock object which can be used to unlock this document later.
     * 
     * @param document  The document
     * @param onError   Action which is called on error
     * @param operation A client identifier associated with lock operation
     * @param lockIntervalInSeconds 
     * @return A DcumentLock which can be used to unlock this document later
     */
    public static CompletableFuture<DocumentLock> lockAsync(Document document, Consumer<Throwable> onError, String operation, int lockIntervalInSeconds) {
        DocumentLockRequestHandler dlrh = new DocumentLockRequestHandler(document);
        dlrh.setLockIntervalInSeconds(lockIntervalInSeconds);
        return DocumentLock.createAsync(operation, onError, dlrh);
    }

    /**
     * Locks this instance and returns a DocumentLock object which can be used to unlock this document later.
     * 
     * @param document  The document
     * @param onError   Action which is called on error
     * @param operation A client identifier associated with lock operation
     * @return A DcumentLock which can be used to unlock this document later
     */
    @Overloaded
    public static CompletableFuture<DocumentLock> lockAsync(Document document, Consumer<Throwable> onError, String operation) {
        DocumentLockRequestHandler dlrh = new DocumentLockRequestHandler(document);
        dlrh.setLockIntervalInSeconds(60);
        return DocumentLock.createAsync(operation, onError, dlrh);
    }
}
