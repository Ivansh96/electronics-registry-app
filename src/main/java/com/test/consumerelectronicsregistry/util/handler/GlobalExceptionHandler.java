package com.test.consumerelectronicsregistry.util.handler;

import com.test.consumerelectronicsregistry.util.exception.ElectronicsTypeAlreadyExists;
import com.test.consumerelectronicsregistry.util.exception.ModelAlreadyExistsException;
import com.test.consumerelectronicsregistry.util.exception.ModelNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@RestControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(ModelNotFoundException.class)
    public ResponseEntity<ErrorResponse> modelNotFoundException(ModelNotFoundException e) {
        ErrorResponse response = new ErrorResponse("Модель не найдена!");
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(ModelAlreadyExistsException.class)
    public ResponseEntity<ErrorResponse> modelAlreadyExistsException(ModelAlreadyExistsException e) {
        ErrorResponse response = new ErrorResponse("Такая модель уже существует!");
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(ElectronicsTypeAlreadyExists.class)
    public ResponseEntity<ErrorResponse> electronicsTypeAlreadyExist(ElectronicsTypeAlreadyExists e) {
        ErrorResponse response = new ErrorResponse("Такой тип техники уже существует!");
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }
}
