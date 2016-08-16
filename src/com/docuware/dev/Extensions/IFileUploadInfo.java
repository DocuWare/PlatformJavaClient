/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docuware.dev.Extensions;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Patrick
 */
public interface IFileUploadInfo {
        /// <summary>
    /// Creates the stream representing the content of the instance.
    /// </summary>
    /// <returns></returns>

    InputStream createStream();

        /// <summary>
    /// Gets the content type (MIME type, Internet Media type).
    /// </summary>
    /// <value>
    /// The type of the content (MIME type, Internet Media type).
    /// </value>
    String getContentType();
        /// <summary>
    /// Gets the name of the file.
    /// </summary>
    /// <value>
    /// The name of the file.
    /// </value>

    String getName();

        /// <summary>
    /// Gets the length (in bytes) of the file.
    /// </summary>
    /// <value>
    /// The size of the file in bytes.
    /// </value>
    long getLength();
        /// <summary>
    /// Gets the last write time in UTC.
    /// </summary>
    /// <value>
    /// The last write time in UTC.
    /// </value>

    Date getLastWriteTimeUtc();
}
