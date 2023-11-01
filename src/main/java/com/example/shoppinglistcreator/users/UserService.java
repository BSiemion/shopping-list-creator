package com.example.shoppinglistcreator.users;

import com.example.shoppinglistcreator.infrastructure.exceptions.entity.EntityUniqueKeyExistsException;
import com.example.shoppinglistcreator.infrastructure.mappers.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class UserService {

    UserMapper userMapper;
    UserRepository userRepository;

    public UserDto create(UserDto userDTO) {
        User user = userMapper.UserDtoToUser(userDTO);
        if (userRepository.existsByEmail(user.getEmail())) {
            throw new EntityUniqueKeyExistsException(User.USER, "email", user.getEmail());
        }
        user.setCreationDate(LocalDateTime.now());
        userRepository.save(user);
        return userMapper.UserToUserDto(user);
    }
}