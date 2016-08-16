/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docuware.dev.Extensions;

import com.docuware.dev.schema._public.services.UriTemplateDescription;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Patrick
 */
public class UriTemplateExtensions {
        /// <summary>
    /// Finds the specified URI template from the list.
    /// </summary>
    /// <param name="templates">The templates.</param>
    /// <param name="templateName">Name of the template.</param>
    /// <returns></returns>

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
    public static String CreateUrl(Iterable<UriTemplateDescription> templates, String templateName, Object parameters) {
        HashMap _parameters = new HashMap<String, Object>();

        Field[] propInfos = parameters.getClass().getDeclaredFields();
        //var propInfos = parameters.GetType().GetProperties();
        for (int i = 0; i < propInfos.length; i++) {
            try {
                    // System.out.println(propInfos[i].getName());
                // System.out.println(propInfos[i].get(parameters));
                _parameters.put(propInfos[i].getName(), propInfos[i].get(parameters));
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        };
        /*var _parameters = 
         from propertyInfo in parameters.GetType().GetProperties()
         where propertyInfo.CanRead
         select new KeyValuePair<string, object>(propertyInfo.Name, propertyInfo.GetValue(parameters, null));*/

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
    public static String CreateUrl(Iterable<UriTemplateDescription> templates, String templateName, Map<String, Object> parameters) {
        UriTemplateDescription template = UriTemplateExtensions.FindTemplate(templates, templateName);
        if (template == null) {
            throw new RuntimeException(String.format("The specified template '{0}' cannot be found.", templateName));
        }
        return UriPattern.Resolve(template.getUriPattern(), parameters);
    }
}
