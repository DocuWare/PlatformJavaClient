/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.docuware.dev.Extensions;

import com.docuware.dev.schema._public.services.platform.UploadedFileChunk;

/**
 *
 * @author Patrick
 */
public interface IChunkable {

    public UploadedFileChunk getFileChunk();
}
