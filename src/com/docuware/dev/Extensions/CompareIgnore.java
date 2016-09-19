/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docuware.dev.Extensions;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation is just for Developers. 
 * It tells you, if a class should be ignored, when you compare the Java-client with the .Net-Client
 * @author Patrick
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@CompareIgnore
public @interface CompareIgnore {
    
}
