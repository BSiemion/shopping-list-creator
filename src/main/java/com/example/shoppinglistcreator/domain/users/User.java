package com.example.shoppinglistcreator.domain.users;

import com.example.shoppinglistcreator.domain.parameters.Parameters;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user", schema = "public")
public class User {

    public static final String USER = "Użytkownik";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String lastName;
    private String email;
    private String password;
    private Integer age;
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(foreignKey = @ForeignKey(name = "fk_user_parameters"))
    private Parameters parameters;
    private LocalDateTime creationDate;

//    List<Product> like;
//    List<Product> doNotLike;
}
