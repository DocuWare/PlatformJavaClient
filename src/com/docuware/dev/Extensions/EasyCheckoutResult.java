/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docuware.dev.Extensions;

import java.io.Closeable;
import java.io.InputStream;

/**
 *
 * @author Patrick
 */
public class EasyCheckoutResult implements Closeable {

    private String EncodedFileName;

    public String getEncodedFileName() {
        return EncodedFileName;
    }

    void setEncodedFileName(String data) {
        EncodedFileName = data;
    }

    private DeserializedHttpResponseGen<InputStream> response;

    public DeserializedHttpResponseGen<InputStream> getResponse() {
        return response;
    }

    void setResponse(DeserializedHttpResponseGen<InputStream> data) {
        response = data;
    }

    @Override
    public void close() {
        this.response.close();
    }
}
