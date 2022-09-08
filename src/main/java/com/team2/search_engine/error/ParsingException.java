package com.team2.search_engine.error;

import org.springframework.http.HttpStatus;

public class ParsingException extends ParsingBaseException{
    public ParsingException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getStatusCode() {
        return HttpStatus.NOT_ACCEPTABLE;
    }
}
