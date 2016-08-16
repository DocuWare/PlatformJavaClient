/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docuware.dev.Extensions;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Patrick
 */
class TarArchiveFileUploadInfo implements IFileUploadInfo, AutoCloseable {

    private IFileUploadInfo[] _files;
    private TarStream _stream;

    public TarArchiveFileUploadInfo(IFileUploadInfo... files) {
        _files = files;
    }

    public InputStream createStream() {
        if (_stream == null) {
            try {
                _stream = new TarStream(_files);
            } catch (IOException ex) {
                Logger.getLogger(TarArchiveFileUploadInfo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return _stream;
    }

    public String getContentType() {
        return "application/vnd.docuware.platform.filescontainer+tar";
    }

    public String getName() {
        return "tar.tar";
    }

    public long getLength() {
        return _stream.getLength();

    }

    public Date getLastWriteTimeUtc() {
        Date currentTime = new Date();
        SimpleDateFormat year = new SimpleDateFormat("yyyy");
        year.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat month = new SimpleDateFormat("MM");
        month.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat day = new SimpleDateFormat("dd");
        day.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat hour = new SimpleDateFormat("hh");
        hour.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat min = new SimpleDateFormat("mm");
        min.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat sec = new SimpleDateFormat("ss");
        sec.setTimeZone(TimeZone.getTimeZone("UTC"));
        GregorianCalendar d = new GregorianCalendar();
        d.set(Integer.parseInt(year.format(currentTime)),
                Integer.parseInt(month.format(currentTime)) - 1,
                Integer.parseInt(day.format(currentTime)),
                Integer.parseInt(hour.format(currentTime)),
                Integer.parseInt(min.format(currentTime)),
                Integer.parseInt(sec.format(currentTime))
        );
        Date e = new Date(d.toInstant().toEpochMilli());
        return e;
    }

    public void finalize() {
        close(false);
    }

    boolean disposed = false;

    void close(boolean disposing) {
        if (disposing && !this.disposed) {
            if (_stream != null) {
                try {
                    _stream.close();
                } catch (IOException e) {
                    throw new RuntimeException(e.getCause());
                }
            }
        }
    }

    public void close() throws IOException {
        close(true);
    }

}