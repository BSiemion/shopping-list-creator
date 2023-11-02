package com.example.shoppinglistcreator.infrastructure.exceptions.entity;

public class EntityNotFoundException extends RuntimeException {
    public EntityNotFoundException(String entityName, Long id) {
        super(String.format("Obiekt klasy %s o numerze ID %s nie został odnaleziony.", entityName, id.toString()));
    }

    public EntityNotFoundException(String entityName, String name, String value) {
        super(String.format("Obiekt klasy %s z polem %s o wartości %s nie został odnaleziony.", entityName, name, value));
    }
}