package com.example.shoppinglistcreator.domain.users;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user", schema = "public")
public class User {

    public static final String USER = "Użytkownik";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String lastName;
    String email;
    String password;
    Integer age;
    Float weight;
    Float growth;
    Integer activityLevel;
    LocalDateTime creationDate;

//    List<Product> like;
//    List<Product> doNotLike;
}
