package com.test.consumerelectronicsregistry.util.handler;

import com.test.consumerelectronicsregistry.util.exception.ModelNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(ModelNotFoundException.class)
    public ResponseEntity<ErrorResponse> ModelNotFoundException(ModelNotFoundException e) {
        ErrorResponse response = new ErrorResponse("Модель не найдена!");
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}
