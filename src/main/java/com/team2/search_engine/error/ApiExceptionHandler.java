package com.team2.search_engine.error;

import com.team2.search_engine.data.model.Error;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ApiExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ApiBaseException.class)
    public ResponseEntity<Error> handelApiExceptions(ApiBaseException ex, WebRequest webRequest) {
        Error error = new Error(ex.getMessage(),webRequest.getDescription(false));
        return new ResponseEntity<>(error, ex.getStatusCode());
    }
    @ExceptionHandler(ParsingBaseException.class)
    public ResponseEntity<Error> handelParsingExceptions(ParsingBaseException ex, WebRequest webRequest) {
        Error error = new Error(ex.getMessage(),webRequest.getDescription(false));
        return new ResponseEntity<>(error, ex.getStatusCode());
    }

}
