package com.outing.commons.api.exception;

import org.springframework.http.HttpStatus;

import java.util.ArrayList;
import java.util.List;

public class OutingException extends RuntimeException{

    private List<String> messages=new ArrayList<>();
    private final HttpStatus httpStatus;

    public OutingException(String message, HttpStatus httpStatus) {
        this.messages.add(message);
        this.httpStatus = httpStatus;
    }

    public OutingException(List<String> messages, HttpStatus httpStatus) {
        this.messages.addAll(messages);
        this.httpStatus = httpStatus;
    }

    public List<String> getMessages() {
        return messages;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

}
