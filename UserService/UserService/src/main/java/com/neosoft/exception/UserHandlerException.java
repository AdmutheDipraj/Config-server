package com.neosoft.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class UserHandlerException {

    @ExceptionHandler(value={UserGlobalException.class})
    public ResponseEntity<Object> handleEmployee(UserGlobalException UserGlobalException){

        UserException employeeException=new UserException(UserGlobalException.getMessage(),
                UserGlobalException.getCause(), HttpStatus.NOT_FOUND);

        return new ResponseEntity<>(employeeException,HttpStatus.NOT_FOUND);
    }

}
