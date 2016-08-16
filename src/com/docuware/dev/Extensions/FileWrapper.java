/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docuware.dev.Extensions;

import java.io.ByteArrayOutputStream;
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
public class FileWrapper implements IFileUploadInfo {

    private File file;

    FileWrapper(File fileInfo) {
        this.file = fileInfo;
    }

    File getFile() {
        return file;
    }

    public File toFile(FileWrapper wrapper) {
        return wrapper.getFile();
    }

    public static FileWrapper[] toFileInfoWrapper(File[] fileInfo) {
        FileWrapper[] fw = new FileWrapper[fileInfo.length];
        for (int i = 0; i < fileInfo.length; i++) {
            fw[i] = FileWrapper.toFileInfoWrapper(fileInfo[i]);
        }
        return fw;
    }

    public static FileWrapper toFileInfoWrapper(File fileInfo) {
        return new FileWrapper(fileInfo);
    }

    public static FileWrapper Create(File fileInfo) {
        return new FileWrapper(fileInfo);
    }

    public InputStream createStream() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException ex) {
        }
        return fis;
    }

    public String getContentType() {
        int posOfDot = file.getName().lastIndexOf(".");
        String extension = file.getName().substring(posOfDot);
        return ContentTypeMapping.getDefault().getContentTypeFromFileExtension(extension);
    }

    public String getName() {
        return file.getName();
    }

    public long getLength() {
        return file.length();
    }

    public Date getLastWriteTimeUtc() {
        Long t = file.lastModified();
        Date d = new Date(t);
        return d;
    }

    /// <summary>
    /// Some wrappers for file info structures.
    /// </summary>
}
