package org.schabi.newpipe.extractor.exceptions;

/*
 * Created by Christian Schabesberger on 31.01.16.
 *
 * Copyright (C) Christian Schabesberger 2016 <chris.schabesberger@mailbox.org>
 * ParsingException.java is part of NewPipe.
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

import javax.print.Doc;

public class ParsingException extends ExtractionException {

    private String document;

    public ParsingException(String message) {
        super(message);
    }

    public ParsingException(String message, Throwable cause) {
        super(message, cause);
    }

    public ParsingException(String message, Document document) {
        this(message, document.toString());
    }

    public ParsingException(String message, String document) {
        super(message);
        this.document = document;
    }

    public ParsingException(String message, Throwable cause, Document document) {
        this(message, cause, document.toString());
    }

    public ParsingException(String message, Throwable cause, String document) {
        super(message, cause);
        this.document = document;
    }

    public String getDocument() {
        return document;
    }
}