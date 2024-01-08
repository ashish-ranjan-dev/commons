package com.outing.commons.api.exception;

import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

public class OutingExceptionModel {

    private final List<String> messages=new ArrayList<>();
    private final int httpStatusCode;
    private final String httpStatusName;
    private final ZonedDateTime timestamp;

    public OutingExceptionModel(ZonedDateTime timestamp, HttpStatus httpStatus, List<String> messages) {
        this.timestamp = timestamp;
        this.httpStatusCode = httpStatus.value();
        this.httpStatusName=httpStatus.name();
        this.messages.addAll(messages);
    }

    public List<String> getMessages() {
        return messages;
    }

    public int getHttpStatus() {
        return httpStatusCode;
    }

    public ZonedDateTime getTimestamp() {
        return timestamp;
    }

    public String getHttpStatusName() {
        return httpStatusName;
    }
}
