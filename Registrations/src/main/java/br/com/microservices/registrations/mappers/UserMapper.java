package br.com.microservices.registrations.mappers;


import br.com.microservices.registrations.dtos.UserDto;
import br.com.microservices.registrations.models.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto userToUserGetDto(User user);

    List<UserDto> convertedToDto(List<User> user);
}
