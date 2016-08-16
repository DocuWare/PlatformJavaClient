/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docuware.dev.Extensions;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author Patrick
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Error", propOrder = {
"message",
    "exception",
    "uri",
    "method",
    "statusCode",
    "status",
    "internalCode"
})
 public class Error {
        
    @XmlElement(name = "Message")
        private String message;
     @XmlElement(name = "Exception")   
        private String exception;
        @XmlAttribute(name = "Uri")
        private String uri;
     @XmlAttribute(name = "Method")   
        private String method;
        @XmlAttribute(name = "StatusCode")
        private int statusCode;
        @XmlAttribute(name = "Status")
        private String status;
        @XmlAttribute(name = "InternalCode")
        private int internalCode;
        
        /// <summary>
        /// Creates a new instance of this class
        /// </summary>
        public Error() {
            this.method = "GET";
            this.internalCode = 0;
        }
        
        public String getMessage() {
            return this.message;
            }
         public void setMessage(String value) {
                this.message = value;
        }
        
        public String getException() {
                return this.exception;
            }
        public void setException(String value) {
                this.exception = value;
            }
        
        
        public String getUri() {
                return this.uri;
            }
        public void setUri(String value) {
                this.uri = value;
            }
        
        
        public String getMethod() {
                return this.method;
            }
        public void setMethod(String value) {
                this.method = value;
            }
        
        
        public int getStatusCode() {
                return this.statusCode;
            }
        public  void setStatusCode(int value) {
                this.statusCode = value;
            }
        
        
        public String getStatus() {
                return this.status;
            }
        public void setStatus(String value) {
                this.status = value;
            }
        
        
        public int getInternalCode() {
                return this.internalCode;
            }
        public void setInternalCode(int value) {
                this.internalCode = value;
            }
        }
    
