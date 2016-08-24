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
public class FileNameExtensions {

    final static int MAX_FILE_NAME_SIZE = 80;

    private static int findExt(String path) {
        if (path != null) {
            int iLastDot = path.lastIndexOf('.');
            int iLastSep = path.lastIndexOf('/');

            if (iLastDot > iLastSep) {
                return iLastDot;
            }
        }
        return -1;
    }

    private static String getExtension(String path) {
        if (path == null) {
            return null;
        }
        int iExt = findExt(path);

        if (iExt > -1) {
            if (iExt < path.length() - 1) {
                return path.substring(iExt);
            }
        }
        return "";
    }

    private static String getFileNameWithoutExtension(String path) {
        if (findExt(path) > 0) {
            String s = path.substring(0, findExt(path) - 1);
            return s;
        }
        return "";
    }
  
    /**
     * Creates a name of of the checkout file which contains the encoded document address
     * 
     * @param fileName  Name of the file
     * @param fileCabinetId he file cabinet identifier
     * @param docId The document identifier
     * @return  A file name which contains the address of the document
     */
    public static String CreateCheckoutFileName(String fileName, String fileCabinetId, int docId) {
        fileName = MakeFileNameSane(fileName) == null ? "" : MakeFileNameSane(fileName);
        String ext = getExtension(fileName);
        fileName = getFileNameWithoutExtension(fileName).replaceAll("[^\\w\\d\\s]", "_");
        String finalName = String.format("%s+%s+%s", docId, fileCabinetId, (fileName));

        int maxFileNameSize = MAX_FILE_NAME_SIZE - ext.length();
        if (finalName.length() > maxFileNameSize) {
            finalName = finalName.substring(0, maxFileNameSize);
        }
        return String.format("%s%s", finalName, ext);
    }
    
    /**
     * Strips the address of a checked out file from its name
     * 
     * @param encodedName   Encoded name of the file
     * @param fileName  Name of the file
     * @param fileCabinetId The file cabinet identifier
     * @param docId The document identifier
     */
    public static void DecodeCheckoutFileName(String encodedName, String fileName, String fileCabinetId, int docId) {
        if (!TryDecodeCheckoutFileName(encodedName, fileName, fileCabinetId, docId)) {
            throw new RuntimeException("The file name cannot be decoded by the checkin/checkout encoding/decoding rules. Did you modify the file name?");
        }
    }

     /**
     * Tries decode the file name of a checkout file
     * 
     * @param encodedName   Name of the encoded
     * @param fileName  Name of the file
     * @param fileCabinetId The file cabinet identifier
     * @param docId The document identifier
     * @return True if the file namee could be decoded. If this case the decoded parts of the file name is in the other parameters
     */
    public static boolean TryDecodeCheckoutFileName(String encodedName, String fileName, String fileCabinetId,
            int docId) {
        String ext = getExtension(encodedName);
        String encodedFileName = getFileNameWithoutExtension(encodedName) == null ? "" : getFileNameWithoutExtension(encodedName);
        String[] splits = encodedFileName.split("\\+", 3);
        if (splits.length == 3)// && int.TryParse(splits[0], NumberStyles.Any, CultureInfo.InvariantCulture, out docId))
        {
            try {
                docId = Integer.parseInt(splits[0]);
                fileCabinetId = splits[1];
                fileName = splits[2] + ext;
                return true;
            } catch (Exception e) {
            }
        }
        fileName = encodedName;
        fileCabinetId = "";
        docId = 0;
        return false;
    }

        /// <summary>
    /// Makes the file name sane.
    /// </summary>
    /// <param name="fileName">Name of the file.</param>
    /// <returns>The file name without not allowed characters.</returns>
    /// <remarks>This function removes any not supported character from a file name.</remarks>
    /**
     *  Makes the file name sane    <p>
     * 
     * Remarks: This function removes any not supported character from a file name
     * 
     * @param fileName  Name of the file
     * @return  The file name without not allowed characters
     */
    public static String MakeFileNameSane(String fileName) {

        Character[] invalidChars = {'\u0022', '\u003C', '\u003E', '\u007C', '\u0000', '\u0001', '\u0002', '\u0003', '\u0004', '\u0005', '\u0006', '\u0007',
            '\u0008', '\u0009', '\n', '\u000B', '\u000C', '\r', '\u000E', '\u000F', '\u0010', '\u0011', '\u0012',
            '\u0013', '\u0014', '\u0015', '\u0016', '\u0017', '\u0018', '\u0019', '\u001A', '\u001B', '\u001C', '\u001D',
            '\u001E', '\u001F'};

        if (fileName != null && !fileName.isEmpty()) {
            if (fileName.startsWith("\"")) {
                fileName = fileName.substring(1);
            }
            if (fileName.endsWith("\"")) {
                fileName = fileName.substring(0, fileName.length() - 1);
            }
            for (Character invalidChar : invalidChars) {
                {
                    fileName = fileName.replace("" + invalidChar, "_");
                }
                return fileName;
            }
        }
        return fileName;

    }

}
