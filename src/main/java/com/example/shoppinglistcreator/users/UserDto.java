package com.example.shoppinglistcreator.users;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@NotEmpty
public class UserDto {
    String name;
    String lastName;
    @Email
    String email;
    @Pattern(regexp = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{6,}$\n", message = "hasło nie spełnia kryterii")
    String password;
    @Max(120)
    @Min(10)
    Integer age;
    @Max(250)
    @Min(30)
    Float weight;
    @Max(250)
    @Min(100)
    Float growth;
    @Max(5)
    @Min(1)
    Integer activityLevel;

//    List<Product> like;
//    List<Product> doNotLike;
}
