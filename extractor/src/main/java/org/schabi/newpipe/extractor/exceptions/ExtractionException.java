package org.schabi.newpipe.extractor.exceptions;

/*
 * Created by Christian Schabesberger on 30.01.16.
 *
 * Copyright (C) Christian Schabesberger 2016 <chris.schabesberger@mailbox.org>
 * ExtractionException.java is part of NewPipe.
 *
 * NewPipe is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * NewPipe is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with NewPipe.  If not, see <http://www.gnu.org/licenses/>.
 */

import org.jsoup.nodes.Document;

public class ExtractionException extends Exception implements ParsedDocumentInfo {

    private String document;

    public ExtractionException(String message) {
        super(message);
    }

    public ExtractionException(String message, Document document) {
        this(message, document.toString());
    }

    public ExtractionException(String message, String document) {
        super(message);
        this.document = document;
    }

    public ExtractionException(Throwable cause) {
        super(cause);
    }

    public ExtractionException(Throwable cause, String document) {
        super(cause);
        this.document = document;
    }
    public ExtractionException(String message, Throwable cause) {
        super(message, cause);
    }

    public ExtractionException(String message, Throwable cause, String document) {
        super(message, cause);
        this.document = document;
    }

    public String getDocument() {
        return document;
    }

}