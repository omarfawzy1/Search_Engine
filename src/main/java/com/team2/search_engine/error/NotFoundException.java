package com.team2.search_engine.error;

import org.springframework.http.HttpStatus;

public class NotFoundException extends ApiBaseException {
    public NotFoundException(String s) {
        super(s);
    }
    public HttpStatus getStatusCode() {
        return HttpStatus.NOT_FOUND;
    }
}
