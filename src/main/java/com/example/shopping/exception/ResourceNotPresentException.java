package com.example.shopping.exception;

public class ResourceNotPresentException extends RuntimeException {
    public ResourceNotPresentException(String errorMessage) {
        super(errorMessage);
    }
}
