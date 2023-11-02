package com.example.shoppinglistcreator.domain.users;

import com.example.shoppinglistcreator.infrastructure.validation.Validation;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/slc/user")
@AllArgsConstructor
public class UserController {
    UserService userService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserDto create(@RequestBody @Valid UserDto userDTO, BindingResult bindingResult) {
        Validation.valid(bindingResult);
        return userService.create(userDTO);
    }

    @GetMapping("/{id}")
    public UserDto getOne(@PathVariable Long id) {
        return userService.getOne(id);
    }
}
