/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docuware.dev.Extensions;

import com.docuware.dev.settings.interop.DWProductTypes;
import com.sun.jersey.client.apache.ApacheHttpClientHandler;
import javax.ws.rs.core.MultivaluedMap;

/**
 *
 * @author Patrick
 */
public class ServiceConnectionLoginData extends ServiceConnectionLicenseBoundData {
        /// <summary>
    /// Gets or sets the organization which the client wants to log in.
    /// </summary>
    /// <remarks>In case there is only a single organization in the system or in case the client wants to connect with a system account, the value can be set to null.
    /// </remarks>
    /// <value>
    /// The organization.
    /// </value>

    public String Organization;

    public String getOrganization() {
        return Organization;
    }

    public void setOrganization(String Organization) {
        this.Organization = Organization;
    }

        /// <summary>
    /// Adds the login form data.
    /// </summary>
    /// <param name="formData">The form data.</param>
    void AddLoginFormData(MultivaluedMap<String, String> formData) {
        super.AddLoginFormData(formData);
        if (Organization != null && !Organization.isEmpty()) {
            formData.putSingle("Organization", Organization);
        }
    }

    static ServiceConnectionLoginData Create(String organization, DWProductTypes licenseType, ApacheHttpClientHandler httpClientHandler, String[] userAgent) {
        ServiceConnectionTransportData sctd = new ServiceConnectionTransportData();
        sctd.setHttpClientHandler(httpClientHandler);
        sctd.setUserAgent(userAgent);
        ServiceConnectionLoginData scld = new ServiceConnectionLoginData();
        scld.setOrganization(organization);
        scld.setTransport(sctd);
        scld.setLicenseType(licenseType);
        return scld;
    }
}
