package com.example.controller;

import com.example.exceptions.ExceptionsDetails;
import com.example.exceptions.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ExceptionsDetails> resourceNotFoundException(ResourceNotFoundException ex) {
        ExceptionsDetails message = new ExceptionsDetails(new Date(), HttpStatus.NOT_FOUND.value() ,ex.getMessage());
        return new ResponseEntity<ExceptionsDetails>(message, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ExceptionsDetails> globalInternalError(Exception ex) {
        ExceptionsDetails message = new ExceptionsDetails(new Date(), HttpStatus.INTERNAL_SERVER_ERROR.value(), ex.getMessage());
        return new ResponseEntity<ExceptionsDetails>(message, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
