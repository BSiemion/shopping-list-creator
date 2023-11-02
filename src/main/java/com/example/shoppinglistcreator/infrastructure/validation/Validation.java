package com.example.shoppinglistcreator.infrastructure.validation;

import com.example.shoppinglistcreator.infrastructure.exceptions.entity.EntityValidationException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.List;
import java.util.stream.Collectors;

public class Validation {

    public static void valid(BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            List<String> errors = bindingResult.getAllErrors().stream()
                    .map(error -> {
                        String fieldName = "";
                        if (error instanceof FieldError) {
                            fieldName = "Pole '" + ((FieldError) error).getField() + "' ";
                        }
                        return fieldName + error.getDefaultMessage();
                    })
                    .collect(Collectors.toList());
            throw new EntityValidationException(errors);
        }
    }
}