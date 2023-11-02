package com.example.shoppinglistcreator.domain.users;

import com.example.shoppinglistcreator.domain.parameters.Parameters;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDto {
    private String name;
    private String lastName;
    @Email
    private String email;
    @Pattern(regexp = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$", message = "nie spełnia kryteriów")
    private String password;
    @Max(120)
    @Min(10)
    private Integer age;
    @Max(250)
    @Min(30)
    private Float weight;
    @Max(250)
    @Min(100)
    private Float growth;
    @Max(5)
    @Min(1)
    Integer activityLevel;
    private Parameters parameters;

//    List<Product> like;
//    List<Product> doNotLike;
}
