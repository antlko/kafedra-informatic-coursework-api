package com.example.exceptions;

import lombok.Getter;

import java.util.Date;

@Getter
public class ExceptionsDetails {
    private final Date timestamp;
    private final int status;
    private final String message;

    public ExceptionsDetails(Date timestamp, int status, String message) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.status = status;
    }
}
