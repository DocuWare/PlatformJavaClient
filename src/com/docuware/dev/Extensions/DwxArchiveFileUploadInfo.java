/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docuware.dev.Extensions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Patrick
 */
public class DwxArchiveFileUploadInfo implements IFileUploadInfo {

    private File _file;

    public DwxArchiveFileUploadInfo(File file) {
        _file = file;
    }

    public DwxArchiveFileUploadInfo() {
    }

    public InputStream createStream() {
        try {
            return new FileInputStream(_file);
        } catch (FileNotFoundException ex) {
            throw new RuntimeException("Fil not Found");
        }
    }

    public String getContentType() {
        return "application/vnd.docuware.platform.filescontainer+dwx";
    }

    public String getName() {
        return "dwx.dwx";
    }

    public long getLength() {
        return _file.length();

    }

    public Date getLastWriteTimeUtc() {
        return new Date();
    }

}
