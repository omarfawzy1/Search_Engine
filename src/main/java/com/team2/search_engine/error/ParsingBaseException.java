package com.team2.search_engine.error;

import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.springframework.http.HttpStatus;

public abstract class ParsingBaseException extends ParseCancellationException {
    public ParsingBaseException(String message) {
        super(message);
    }

    public abstract HttpStatus getStatusCode();

}
