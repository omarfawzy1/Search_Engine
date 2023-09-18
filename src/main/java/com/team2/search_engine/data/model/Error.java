package com.team2.search_engine.data.model;

import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public class Error {
    private String message;
    private String uri;
//    private HttpStatus status;
    private LocalDateTime timeStamp;

    public Error() {
        this.timeStamp = LocalDateTime.now();
    }

    public Error(String message, String uri) {
        this();
        this.message = message;
        this.uri = uri;
//        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }
}
