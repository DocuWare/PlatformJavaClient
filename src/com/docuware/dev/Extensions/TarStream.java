/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docuware.dev.Extensions;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Patrick
 */
public class TarStream extends InputStream {

    private final Queue<InputStream> streams;
    private InputStream current;
    private long length;

    public TarStream(IFileUploadInfo[] files) throws IOException {
        /*A tar archive consists of a series of file objects. Each file object includes any file data, and is preceded by a 512-byte header record. 
         * The file data is written unaltered except that its length is rounded up to a multiple of 512 bytes. 
         * The end of an archive is marked by at least two consecutive zero-filled records. The final block of an archive is padded out to full length with zeros.
         * See https://en.wikipedia.org/wiki/Tar_(computing) for details on file format.
         */
        ArrayList<ByteArrayInputStream> streamList = new ArrayList<>();
        for (IFileUploadInfo file : files) {
            ByteArrayOutputStream headerStream = new ByteArrayOutputStream();
            ByteArrayOutputStream padStream = new ByteArrayOutputStream();
            InputStream entryStream = file.createInputStream();
            ByteArrayOutputStream entryOut = new ByteArrayOutputStream();
            byte[] Buffer = new byte[1];
            while (entryStream.available() > 0) {
                entryStream.read(Buffer);
                entryOut.write(Buffer);
            }

            //Creating header of the file
            TarHeader header = new TarHeader();
            header.lastModifiedTime = file.getLastWriteTimeUtc().after(TarHeader.epoch) == true ? file.getLastWriteTimeUtc() : TarHeader.epoch;
            header.name = file.getName();
            header.size = file.getLength();
            header.Write(headerStream);

            //Creating stream with empty bytes to pad to 512 bytes after the file
            padTo512(file.getLength(), padStream);

            this.length = length + headerStream.size() + entryOut.size() + padStream.size();
            ByteArrayInputStream headerInStream = new ByteArrayInputStream(headerStream.toByteArray());
            ByteArrayInputStream padInStream = new ByteArrayInputStream(padStream.toByteArray());
            ByteArrayInputStream entryInStream = new ByteArrayInputStream(entryOut.toByteArray());
            streamList.add(headerInStream);
            streamList.add(entryInStream);
            streamList.add(padInStream);
        }
        streams = new LinkedList<>(streamList);
    }

    public boolean canRead() {
        return true;
    }

    @Override
    public int available() {
        return (int) length;
    }

    public long getLength() {
        return this.length;
    }

    @Override
    public int read(byte[] buffer, int offset, int count) throws IOException {
        if (this.current == null && streams.size() == 0) {
            return -1;
        }

        if (this.current == null) {
            this.current = streams.poll();
        }

        int totalRead = 0;
        while (totalRead < count) {
            int read = current.read(buffer, offset + totalRead, count - totalRead);
            if (read <= 0) {
                if (streams.size() == 0) {
                    length = 0;
                    return totalRead;
                } else {
                    totalRead++;
                    this.current = streams.poll();
                }
            }
            totalRead += read;
        }
        length = length - totalRead;

        return totalRead;
    }

    private void padTo512(long size, OutputStream stream) throws IOException {
        int zeros = (int) size % 512;
        if (zeros == 0) {
            return;
        }

        zeros = 512 - zeros;
        stream.write(new byte[zeros], 0, zeros);
    }

    @Override
    public int read() throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
