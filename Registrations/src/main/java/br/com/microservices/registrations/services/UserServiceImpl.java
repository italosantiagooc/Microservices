package br.com.microservices.registrations.services;

import br.com.microservices.registrations.dtos.UserDto;
import br.com.microservices.registrations.exceptions.UserNotFoundException;
import br.com.microservices.registrations.mappers.UserMapper;
import br.com.microservices.registrations.models.User;
import br.com.microservices.registrations.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final UserMapper userMapper;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public User saveUser(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public UserDto userToUserGetDto(Integer id) {
        return userMapper.userToUserGetDto(userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException()));
    }

    @Override
    public List<UserDto> getAll(List<User> users) {
        return userMapper.convertedToDto(userRepository.findAll());
    }

}
