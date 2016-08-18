/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docuware.dev.Extensions;

import com.docuware.dev.schema._public.services.UriTemplateDescription;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Patrick
 */
public class UriTemplateExtensions {
   
    /**
     * Finds the specified URI template from the list
     * 
     * @param templates The templates
     * @param templateName  Name of the templates
     * @return 
     */
    public static UriTemplateDescription FindTemplate(Iterable<UriTemplateDescription> templates, String templateName) {
        for (UriTemplateDescription t : templates) {
            if (t.getName().equals(templateName)) {
                return t;
            }
        }
        return null; //default wert
    }

        /// <summary>
    /// Creates the URL for the specified template and binds parameters.
    /// </summary>
    /// <param name="templates">The templates.</param>
    /// <param name="templateName">Name of the template.</param>
    /// <param name="parameters">The parameters.</param>
    /// <returns>The URL with bound parameters.</returns>
    /// <exception cref="System.ArgumentException">The specified template '{0}' cannot be found.;templateName</exception>
    /**
     *  Creates the URL for the specified template and binds parameters
     * 
     * @param templates The templates
     * @param templateName  Name of the template
     * @param parameters    The parameters
     * @return  The URL with bound parameters
     * @throws  RuntimeException
     */
    public static String CreateUrl(Iterable<UriTemplateDescription> templates, String templateName, Object parameters) {
        HashMap _parameters = new HashMap<>();

        Field[] propInfos = parameters.getClass().getDeclaredFields();
        for (Field propInfo : propInfos) {
            try {
                _parameters.put(propInfo.getName(), propInfo.get(parameters));
            }catch (IllegalArgumentException | IllegalAccessException ex) {
                throw new RuntimeException(ex.getMessage());
            }
        }
        return CreateUrl(templates, templateName, _parameters);
    }

        /// <summary>
    /// Creates the URL for the specified template and binds parameters.
    /// </summary>
    /// <param name="templates">The templates.</param>
    /// <param name="templateName">Name of the template.</param>
    /// <param name="parameters">The parameters.</param>
    /// <returns>The URL with bound parameters.</returns>
    /// <exception cref="System.ArgumentException">The specified template '{0}' cannot be found.;templateName</exception>
   /**
    * Creates the URL for the specified template and binds parameters
    * 
    * @param templates  The templates
    * @param templateName   Name of the template
    * @param parameters The parameters
    * @return   The URL with bound parameters
    * @throws RuntimeException: The specified template cannot be found
    */
    public static String CreateUrl(Iterable<UriTemplateDescription> templates, String templateName, Map<String, Object> parameters) {
        UriTemplateDescription template = UriTemplateExtensions.FindTemplate(templates, templateName);
        if (template == null) {
            throw new RuntimeException(String.format("The specified template '{0}' cannot be found.", templateName));
        }
        return UriPattern.Resolve(template.getUriPattern(), parameters);
    }
}
