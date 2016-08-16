package com.docuware.dev.Extensions;

import com.docuware.dev.settings.interop.DWProductTypes;
import javax.ws.rs.core.MultivaluedMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Patrick
 */
public abstract class ServiceConnectionLicenseBoundData {

    ServiceConnectionTransportData transport;

        /// <summary>
    /// Gets or sets the transport data.
    /// </summary>
    /// <value>
    /// The transport data.
    /// </value>
    public ServiceConnectionTransportData getTransport() {
        if (transport == null) {
            transport = new ServiceConnectionTransportData();
        }
        return transport;
    }

    public void setTransport(ServiceConnectionTransportData value) {
        transport = value;
    }

        /// <summary>
    /// Gets or sets the type of the license used for the login.
    /// </summary>
    /// <value>
    /// The type of the license.
    /// </value>
    public DWProductTypes LicenseType;

    public DWProductTypes getLicenseType() {
        return LicenseType;
    }

    public void setLicenseType(DWProductTypes LicenseType) {
        this.LicenseType = LicenseType;
    }

        /// <summary>
    /// Adds the login form data.
    /// </summary>
    /// <param name="formData">The form data.</param>
    void AddLoginFormData(MultivaluedMap<String, String> formData) {
        if (LicenseType != null) {
            formData.putSingle("LicenseType", LicenseType.toString());
        }
    }
}
