/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docuware.dev.Extensions;

import java.io.InputStream;
import java.util.Date;

/**
 *
 * @author Patrick
 */
public interface IFileUploadInfo {
  
    InputStream createInputStream();

    String getContentType();
    
    String getName();

    long getLength();

    Date getLastWriteTimeUtc();
}
