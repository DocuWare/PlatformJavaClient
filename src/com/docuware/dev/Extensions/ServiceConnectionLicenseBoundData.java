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
abstract class ServiceConnectionLicenseBoundData {

    ServiceConnectionTransportData transport;

    /**
     * Gets the transport data
     * @return The transport data
     */
    public ServiceConnectionTransportData getTransport() {
        if (transport == null) {
            transport = new ServiceConnectionTransportData();
        }
        return transport;
    }

    /**
     * Sets the transport data
     * @param value The new Transport data
     */
    public void setTransport(ServiceConnectionTransportData value) {
        transport = value;
    }

    public DWProductTypes LicenseType;

    /**
     * Gets the type of the license used for the login
     * @return  The type of the license
     */
    public DWProductTypes getLicenseType() {
        return LicenseType;
    }

    /**
     * Sets the type of the license used for the login
     * @param LicenseType   The type of the license 
     */
    public void setLicenseType(DWProductTypes LicenseType) {
        this.LicenseType = LicenseType;
    }

    /**
     * Adds the login form data
     * @param formData  The form data
     */
    void AddLoginFormData(MultivaluedMap<String, String> formData) {
        if (LicenseType != null) {
            formData.putSingle("LicenseType", LicenseType.toString());
        }
    }
}
