package com.example.shoppinglistcreator.infrastructure.exceptions;

import com.example.shoppinglistcreator.infrastructure.exceptions.entity.EntityNotFoundException;
import com.example.shoppinglistcreator.infrastructure.exceptions.entity.EntityUniqueKeyExistsException;
import com.example.shoppinglistcreator.infrastructure.exceptions.entity.EntityValidationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import static org.springframework.http.HttpStatus.*;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleException(Exception e) {
        return new ResponseEntity<>("Wystąpił nieobsłużony wyjątek: " + e.getClass().getSimpleName(), INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(EntityUniqueKeyExistsException.class)
    public final ResponseEntity<Object> handleEntityUniqueKeyExistsException(EntityUniqueKeyExistsException e) {
        return new ResponseEntity<>(e.getMessage(), BAD_REQUEST);
    }

    @ExceptionHandler(EntityValidationException.class)
    public final ResponseEntity<Object> handleEntityValidationException(EntityValidationException e) {
        return new ResponseEntity<>(e.getErrors(), BAD_REQUEST);
    }

    @ExceptionHandler(EntityNotFoundException.class)
    public final ResponseEntity<Object> handleEntityNotFoundException(EntityNotFoundException e) {
        return new ResponseEntity<>(e.getMessage(), NOT_FOUND);
    }
}
