package com.example.shoppinglistcreator.users;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/slc/user")
@AllArgsConstructor
public class UserController {
    UserService userService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserDto create(@RequestBody @Valid UserDto userDTO) {
        return userService.create(userDTO);
    }
}
