package com.example.exceptions;

public class ResourceNotFoundException extends Exception {
    private static final long SERIAL_VERSION_UID = 1L;

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
