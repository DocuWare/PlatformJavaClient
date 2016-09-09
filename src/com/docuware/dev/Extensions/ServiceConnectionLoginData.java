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
class ServiceConnectionLoginData extends ServiceConnectionLicenseBoundData {
        
    public String Organization;

    /**
     * Gets the organization which the client wants to log in
     * @return The organization
     */
    public String getOrganization() {
        return Organization;
    }

    /**
     * Sets the organization <p>
     * 
     * Remarks: In case there is only a single organization in the system or in case the client wants to connect with a system account, the value can be set to null
     * @param Organization The organization which the client wants to login
     */
    public void setOrganization(String Organization) {
        this.Organization = Organization;
    }

    /**
     * Add the login form data
     * @param formData  The form data
     */
    @Override
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
