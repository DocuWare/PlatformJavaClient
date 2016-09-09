/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docuware.dev.Extensions;

import com.docuware.dev.settings.interop.DWProductTypes;
import com.sun.jersey.client.apache.ApacheHttpClientHandler;

/**
 *
 * @author Patrick
 */
class ServiceConnectionTokenLoginData extends ServiceConnectionLicenseBoundData {

    static ServiceConnectionTokenLoginData Create(DWProductTypes licenseType, ApacheHttpClientHandler httpClientHandler, String[] userAgent) {
        ServiceConnectionTokenLoginData sctld = new ServiceConnectionTokenLoginData();
        sctld.setLicenseType(licenseType);
        ServiceConnectionTransportData sctd = new ServiceConnectionTransportData();
        sctd.setUserAgent(userAgent);
        sctd.setHttpClientHandler(httpClientHandler);
        sctld.setTransport(sctd);
        return sctld;
    }
}
