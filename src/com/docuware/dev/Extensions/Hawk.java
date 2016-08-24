/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docuware.dev.Extensions;

/**
 *
 * @author Patrick
 */
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 *
 * @author Patrick
 */
@Target(ElementType.METHOD)
public @interface Hawk{
    
    String minimumVersion() default "6.10";
}