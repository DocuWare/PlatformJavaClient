package com.docuware.dev.Extensions;

import com.docuware.dev.schema._public.services.platform.CheckInActionParameters;
import com.docuware.dev.schema._public.services.platform.CheckOutToFileSystemInfo;
import com.docuware.dev.schema._public.services.platform.Document;
import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataBodyPart;
import com.sun.jersey.multipart.MultiPart;
import com.sun.jersey.multipart.file.FileDataBodyPart;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.ParseException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Patrick
 */
public class EasyCheckoutCheckinExtensionsBase {

    public static String createEasyCheckoutFileName(DeserializedHttpResponseGen<InputStream> checkoutResponse, String fileCabinetId, int docId) {
        return FileNameExtensions.CreateCheckoutFileName(DeserializedHttpResponseGen.getFileName(checkoutResponse), fileCabinetId, docId);
    }

        /// <summary>
    /// Checks out the specified file and saves it to the file system asynchronously.
    /// </summary>
    /// <param name="serviceConnection">The service connection.</param>
    /// <param name="fileCabinetId">The file cabinet identifier.</param>
    /// <param name="docId">The document identifier.</param>
    /// <returns>A task producung an instance of <see cref="EasyCheckoutResult"/>.</returns>
    public static Future<EasyCheckoutResult> easyCheckOutToFileSystemAsync(ServiceConnection serviceConnection, String fileCabinetId, int docId) {
        return CompletableFuture.<EasyCheckoutResult>supplyAsync(() -> {
            DeserializedHttpResponseGen<InputStream> t;
            try {
                t = serviceConnection.postToCheckoutForStreamAsync(docId, fileCabinetId, new CheckOutToFileSystemInfo()).get();
            } catch (Exception x) {
                throw new RuntimeException(x.getMessage());
            }

            EasyCheckoutResult ecr = new EasyCheckoutResult();
            String s = EasyCheckoutCheckinExtensionsBase.createEasyCheckoutFileName(t, fileCabinetId, docId);
            System.out.println("1" + s);
            ecr.setEncodedFileName(s);
            System.out.println("2" + ecr.getEncodedFileName());
            ecr.setResponse(t);
            return ecr;
        });
    }

        /// <summary>
    /// Checks the specified file in.
    /// </summary>
    /// <param name="serviceConnection">The service connection.</param>
    /// <param name="fileToCheckin">The file to checkin.</param>
    /// <returns>A task producing the checked-in response of the check-in operation.</returns>
    /// <remarks>The name of <paramref name="fileToCheckin"/> must be taken from <see cref="EasyCheckOutToFileSystemAsync"/>.</remarks>
    public static Future<DeserializedHttpResponseGen<Document>> easyCheckInFromFileSystemAsync(ServiceConnection serviceConnection, IFileUploadInfo fileToCheckin) {
        return easyCheckInFromFileSystemAsync(serviceConnection, fileToCheckin, null);
    }

        /// <summary>
    /// Checks the specified file in.
    /// </summary>
    /// <param name="serviceConnection">The service connection.</param>
    /// <param name="fileToCheckin">The file to checkin.</param>
    /// <param name="checkInParams">The check in parameters.</param>
    /// <returns>A task producing the checked-in response of the check-in operation.</returns>
    /// <remarks>The name of <paramref name="fileToCheckin"/> must be taken from <see cref="EasyCheckOutToFileSystemAsync"/>.</remarks>
    public static Future<DeserializedHttpResponseGen<Document>> easyCheckInFromFileSystemAsync(ServiceConnection serviceConnection, IFileUploadInfo fileToCheckin, CheckInActionParameters checkInParams) {
        MultiPart multipartForm = new MultiPart();

        if (checkInParams == null) {
            checkInParams = new CheckInActionParameters();
        }

        int docid = 0;
        String fileCabinetId = "";
        String originalFileName = "";
        FileNameExtensions.DecodeCheckoutFileName(fileToCheckin.getName(), originalFileName, fileCabinetId, docid);

        FormDataBodyPart f1 = new FormDataBodyPart();
        try {
            f1.setFormDataContentDisposition(new FormDataContentDisposition("form-data; name=\"params\"; filename=\"params.xml\""));
        } catch (ParseException ex) {
        }
        JAXBElement<CheckInActionParameters> jax = new JAXBElement(new QName("http://dev.docuware.com/schema/public/services/platform", "CheckInActionParameters"), CheckInActionParameters.class, null, checkInParams);
        f1.setEntity(jax);
        f1.setMediaType(MediaType.APPLICATION_XML_TYPE);
        multipartForm.bodyPart(f1);

            //var f2 = new StreamContent(fileToCheckin.Open(FileMode.Open, FileAccess.Read, FileShare.ReadWrite));
        //var contentType = ContentTypeMapping.Default.GetContentTypeFromFileExtension(fileToCheckin.Extension);
        if (fileToCheckin instanceof FileWrapper) {
            File file = ((FileWrapper) fileToCheckin).getFile();
            FileDataBodyPart f = new FileDataBodyPart("content", file);
            FormDataContentDisposition fdcd = null;
            try {
                fdcd = new FormDataContentDisposition("form-data; name=\"file\"; filename=\"" + originalFileName + "\"");
            } catch (ParseException ex) {
            }
            f.setContentDisposition(fdcd);
            multipartForm.bodyPart(f);
        } else {
            InputStream is = fileToCheckin.createStream();
            byte[] buffer = new byte[1024];
            try {
                File temp = File.createTempFile("tempfile", null);
                FileOutputStream fos = new FileOutputStream(temp);
                int read = 0;
                while ((read = is.read(buffer)) != -1) {
                    fos.write(buffer, 0, read);
                }
                FileDataBodyPart f = new FileDataBodyPart("content", temp);
                FormDataContentDisposition fdcd = null;
                try {
                    fdcd = new FormDataContentDisposition("form-data; name=\"" + fileToCheckin.getName() + "\"; filename=\"" + fileToCheckin.getName() + "\"");
                } catch (ParseException ex) {
                    throw new RuntimeException(ex.getMessage());
                }
                f.setContentDisposition(fdcd);
                multipartForm.bodyPart(f);
                is.close();
                fos.close();

            } catch (Exception e) {
                throw new RuntimeException(e.getLocalizedMessage() + e.getCause());
            }
        }

        return serviceConnection.postToCheckinForDocumentAsync(docid, fileCabinetId, multipartForm);
    }
}
