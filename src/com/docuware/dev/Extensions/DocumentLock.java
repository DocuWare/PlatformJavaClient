/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docuware.dev.Extensions;

import com.docuware.dev.schema._public.services.platform.LockInfo;
import java.io.Closeable;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Patrick
 */
public class DocumentLock implements Closeable {

    private Timer timer;
    private boolean disposed = false;
    private boolean isClosed;
    private boolean isClosing;
    private Throwable exception;
    int exceptionCount;
    private LockInfo lockInfo;
    CompletableFuture<String> currentLockTask = null;
    CompletableFuture<String> closingTask = null;
    private IDocumentLockRequestHandler documentLockRequestHandler;
    Consumer<Throwable> onError = (Throwable ex) -> {
    };
    ReentrantReadWriteLock isClosingLock = new ReentrantReadWriteLock();

    /**
     * Gets the throwable in case the last lock could not be acquired. It might
     * happen that a single lock request can not be sucessfully executet. In
     * this case this property contains the last throwable. If the next lock can
     * be acquired successfully, the value of this property is null again.
     *
     * @return the throwable
     */
    public Throwable getException() {
        return exception;
    }

    /**
     * Gets the timer. This is for testing purposes only.
     *
     * @return The timer. This is for testing purposes only
     */
    Timer getTimer() {
        return timer;
    }

    /**
     * Gets a value indicating whether this instance is closing. This is for
     * testing purposes only.
     *
     * @return true, if this instance is closing; otherwise false. This is for
     * testing purposes only.
     */
    boolean isIsClosing() {
        return isClosing;
    }

        /// <summary>
    /// Gets a value indicating whether this instance is closed. This is for testing purposes only.
    /// </summary>
    /// <value>
    ///   <c>true</c> if this instance is closed; otherwise, <c>false</c>. This is for testing purposes only.
    /// </value>
    /**
     * Gets a value indicating whether this instance is closed. This is for
     * testing purposes only.
     *
     * @return true, if this instance is closed; otherwise, false. This is for
     * testing purposes only.
     */
    boolean isIsClosed() {
        return isClosed;
    }

        /// <summary>
    /// Gets the exception count. This is the number of exceptions which occured while this instance was aquiring a lock. The last exception can be accessed by <see cref="Exception"/>.
    /// </summary>
    /// <value>
    /// The exception count. This is the number of exceptions which occured while this instance was aquiring a lock. The last exception can be accessed by <see cref="Exception"/>.
    /// </value>
    /**
     * Gets the exception count. This is the number of exceptions which occured
     * while this instance was aquiring a lock. The last exception can be
     * accessed by getException().
     *
     * @return The exception count. This is the number of exceptions which
     * occured while this instance was aquiring a lock. The last exception can
     * be accessed by getException().
     */
    public int getExceptionCount() {
        return exceptionCount;
    }

    /**
     * Gets action which is called on error.
     *
     * @return The action called on error.
     */
    public Consumer<Throwable> getOnError() {
        return onError;
    }

    /**
     * Sets the action which is called on error
     *
     * @param value The action called on error
     */
    public void setOnError(Consumer<Throwable> value) {
        onError = value;
    }

    /**
     * Initializes a new instance of the DocumentLock class. Loks the document
     * for 60 secondes and re-new this lock on each 30 seconds.
     *
     * @param lockInfo The lock information
     * @param onError Action which is called on error
     * @param documentLockRequestHandler The document lock request handler
     */
    private DocumentLock(LockInfo lockInfo, Consumer<Throwable> onError, IDocumentLockRequestHandler documentLockRequestHandler) {
        this.lockInfo = lockInfo;
        if (onError != null) {
            this.onError = onError;
        }
        this.documentLockRequestHandler = documentLockRequestHandler;
        createTimer();
    }

    /**
     * Creates a new Instance of the DocumentLock class Asynchronously
     *
     * @param operation
     * @param documentLockRequestHandler
     * @return
     */
    static CompletableFuture<DocumentLock> createAsync(String operation, IDocumentLockRequestHandler documentLockRequestHandler) {
        return createAsync(operation, null, documentLockRequestHandler);
    }

    /**
     * Creates a new Instance of the DocumentLock class Asynchronously
     *
     * @param operation
     * @param onError
     * @param documentLockRequestHandler
     * @return
     */
    static CompletableFuture<DocumentLock> createAsync(String operation, Consumer<Throwable> onError, IDocumentLockRequestHandler documentLockRequestHandler) {
        LockInfo li = new LockInfo();
        li.setInterval("" + documentLockRequestHandler.getLockInterval());
        li.setOperation(operation);
        return documentLockRequestHandler.sendLock(li).thenApply(t -> {
            String content = t;
            if (content != null) {
                return new DocumentLock(li, onError, documentLockRequestHandler);
            } else {
                throw new RuntimeException("Do not expect empty content when acquiring a lock.");
            }
        });
    }

    void acquireNewLock() {
        dropTimer();

        this.currentLockTask = documentLockRequestHandler.sendLock(lockInfo);
        this.currentLockTask.whenComplete(
                (s, x) -> {
                    this.currentLockTask = null;
                    if (x == null) {
                        this.exception = null;
                    } else {
                        setError(x);
                    }
                })
                .thenRun(() -> createTimer());
    }

    void setError(Throwable x) {
        this.exceptionCount = this.exceptionCount + 1;
        this.exception = x;
        onError.accept(this.exception);
    }

    void createTimer() {
        if (!isClosing) {
            this.timer = new Timer();
            timer.schedule(new TimerTask() {

                @Override
                public void run() {
                    isClosingLock.readLock().lock();
                    try {
                        if (!isClosing && timer != null) {
                            try {
                                acquireNewLock();
                            } catch (Exception ex) {
                                setError(ex);
                            }
                        }
                    } finally {
                        isClosingLock.readLock().unlock();
                    }
                }
            }, documentLockRequestHandler.getLockInterval() / 2);
        }
    }

    private void dropTimer() {
        timer = null;
    }

    /**
     * Unlocks the target document
     * @return
     */
    public CompletableFuture<String> closeAsync() {
        _close();
        return this.closingTask;
    }

    void _close() {
        // We lock this code section in order to ensure that the isClosing flag is protected.
        isClosingLock.writeLock().lock();
        try {
            if (this.isClosed || this.isClosing) {
                return;
            }

            this.isClosing = true;
        } finally {
            isClosingLock.writeLock().unlock();
        }

        // 1. Stop the timer so that the timer is not interfering while releasing it.
        dropTimer();

        // In case there is a pending lock task, we wait until the lock task is finished and continue with the unlock task.
        CompletableFuture<String> myClosingTask = this.currentLockTask != null
                ? CompletableFuture.<String>supplyAsync(() -> {
                    try {
                        currentLockTask.get();
                        return documentLockRequestHandler.deleteLock().get();
                    } catch (Exception x) {
                        throw new RuntimeException(x.getMessage());
                    }
                })
                : this.documentLockRequestHandler.deleteLock();

        this.closingTask = myClosingTask.handle(
                (r, x) -> {
                    if (x != null) {
                        this.exception = x;
                    } else {
                        this.isClosed = true;
                    }
                    return r;
                });
    }

    /**
     * Releases all resources used by the current instance of DocumentLock.
     */
    public void close() {
        close(true);
    }

    /**
     * Finalizes this instance
     */
    protected void finalize() {
        close(false);
    }

    private void close(boolean disposing) {
        if (!this.disposed) {
            try {
                _close();
                 this.closingTask.get();
            } catch (ExecutionException ex) {
                Logger.getLogger(DocumentLock.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(DocumentLock.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                this.disposed = true;
            }
        }
    }

}
