package com.example.shoppinglistcreator.infrastructure.mappers;

import com.example.shoppinglistcreator.users.User;
import com.example.shoppinglistcreator.users.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {
    User UserDtoToUser(UserDto userDto);

    UserDto UserToUserDto(User user);
}