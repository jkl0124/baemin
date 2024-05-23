package com.example.demo.utils;

import com.example.demo.product.ProductDTO;
import lombok.Getter;
import org.springframework.http.HttpStatus;

public class ResponseEntityApi<T> {


    public static <T> ResponseEntity<T> success(T data){
        return new ResponseEntity(true,data,null);
    }
    public static <T> ResponseEntity<T> error(T message){
        return new ResponseEntity<>(false,null,new ApiError(message,HttpStatus.CONFLICT));
    }

    @Getter
    public static class ResponseEntity<T>{
        private boolean success;
        private T data;
        private ApiError error;
        public ResponseEntity(boolean success, T data, ApiError error) {
            this.success = success;
            this.data = data;
            this.error = error;
        }

    }
    @Getter
    public static class ApiError<T> {

        T message;
        HttpStatus httpStatus;

        public ApiError(T message, HttpStatus httpStatus) {
            this.message = message;
            this.httpStatus = httpStatus;
        }
    }
}
