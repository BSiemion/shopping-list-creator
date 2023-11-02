package com.example.shoppinglistcreator.infrastructure.exceptions.entity;

import lombok.Getter;

import java.util.List;

@Getter
public class EntityValidationException extends RuntimeException {
    private final List<String> errors;

    public EntityValidationException(List<String> errors) {
        this.errors = errors;
    }
}