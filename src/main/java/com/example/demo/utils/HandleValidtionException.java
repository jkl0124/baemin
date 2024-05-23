package com.example.demo.utils;

import static com.example.demo.utils.ResponseEntityApi.error;

import java.util.HashMap;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class HandleValidtionException {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public static ResponseEntityApi.ResponseEntity<Map<String,String>> handleValidationExceptions(MethodArgumentNotValidException errors) {

        Map<String, String> errorMap = new HashMap<>();
        errors.getAllErrors().forEach(objectError ->
        {
            FieldError fieldError = (FieldError) objectError;
            String errorMessage = objectError.getDefaultMessage();
            errorMap.put(fieldError.getField(),errorMessage);
        });
        log.info(errorMap.toString());
        return error(errorMap);
    }

}
