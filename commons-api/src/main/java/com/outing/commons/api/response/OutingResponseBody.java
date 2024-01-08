package com.outing.commons.api.response;

import org.springframework.lang.Nullable;

import java.util.List;

public class OutingResponseBody<T> {

    private final T body;
    private final List<String> messages;

    public OutingResponseBody(T body, @Nullable List<String> messages) {
        this.body = body;
        this.messages = messages;
    }

    public T getBody() {
        return body;
    }

    public List<String> getMessages() {
        return messages;
    }

}
