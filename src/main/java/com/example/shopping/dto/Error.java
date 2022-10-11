package com.example.shopping.dto;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@Builder
public class Error {
    private LocalDateTime timestamp;
    private String errorMessage;
    private HttpStatus status;
}
