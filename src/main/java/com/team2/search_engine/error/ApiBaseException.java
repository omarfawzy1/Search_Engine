package com.team2.search_engine.error;

import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.springframework.http.HttpStatus;

public abstract class ApiBaseException extends RuntimeException {
    public ApiBaseException(String message) {
        super(message);
    }
    public abstract HttpStatus getStatusCode();
}
