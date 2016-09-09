/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docuware.dev.Extensions;

/**
 *
 * @author Patrick
 */
public enum TarEntryType {

    File(0),
    OldFile((byte) '0'),
    HardLink((byte) '1'),
    SymLink((byte) '2'),
    CharDevice((byte) '3'),
    BlockDevice((byte) '4'),
    Directory((byte) '5'),
    Fifo((byte) '6'),
    LongLink((byte) 'K'),
    LongName((byte) 'L'),
    SparseFile((byte) 'S'),
    VolumeHeader((byte) 'V');

    private final byte _statusCode;

    TarEntryType(final int statusCode) {
        this._statusCode = (byte) statusCode;
    }

    byte toByte() {
        return _statusCode;
    }
}
