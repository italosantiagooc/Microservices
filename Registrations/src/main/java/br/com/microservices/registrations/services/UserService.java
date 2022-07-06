package br.com.microservices.registrations.services;

import br.com.microservices.registrations.dtos.UserDto;
import br.com.microservices.registrations.models.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    UserDto userToUserGetDto(Integer id);

    List<UserDto> getAll(List<User> users);

}
