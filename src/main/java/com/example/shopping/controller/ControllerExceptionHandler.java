package com.example.shopping.controller;

import com.example.shopping.dto.Error;
import com.example.shopping.exception.ResourceNotPresentException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(ResourceNotPresentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Error returnResourceNotFoundException(ResourceNotPresentException ex) {
        return Error.builder()
                .status(HttpStatus.BAD_REQUEST)
                .timestamp(LocalDateTime.now())
                .errorMessage(ex.getMessage())
                .build();
    }

}
