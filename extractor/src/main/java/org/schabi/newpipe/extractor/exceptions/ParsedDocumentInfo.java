package org.schabi.newpipe.extractor.exceptions;

/**
 * Collect information on the parsed or to parse document when an error occurs to track down the cause later.
 **/
public interface ParsedDocumentInfo {

    /**
     * @return String the parsed or to parse document where to error occurred;
     * this should be either a HTML or JSON string.
     */
    String getDocument();

}