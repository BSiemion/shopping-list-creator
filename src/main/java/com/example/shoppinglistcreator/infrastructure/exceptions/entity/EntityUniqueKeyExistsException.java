package com.example.shoppinglistcreator.infrastructure.exceptions.entity;

import java.util.Arrays;

public class EntityUniqueKeyExistsException extends RuntimeException {
    public EntityUniqueKeyExistsException(String entityName, String keyName, String keyValue) {
        super(String.format("Obiekt klasy %s o unikalnym polu %s z wartością %s istnieje już w bazie danych.",
                entityName, keyName, keyValue));
    }

    public EntityUniqueKeyExistsException(String entityName, String[] keyNames, String[] values) {
        super(String.format("Obiekt klasy %s o unikalnych polach %s z wartościami %s istnieje już w bazie danych.",
                entityName,
                Arrays.toString(keyNames),
                Arrays.toString(values))
        );
    }
}
