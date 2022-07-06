package br.com.microservices.registrations.mappers;

import br.com.microservices.registrations.dtos.UserDto;
import br.com.microservices.registrations.models.User;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-05T14:01:34-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.15 (Debian)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserDto userToUserGetDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setEmail( user.getEmail() );
        userDto.setFullName( user.getFullName() );

        return userDto;
    }

    @Override
    public List<UserDto> convertedToDto(List<User> user) {
        if ( user == null ) {
            return null;
        }

        List<UserDto> list = new ArrayList<UserDto>( user.size() );
        for ( User user1 : user ) {
            list.add( userToUserGetDto( user1 ) );
        }

        return list;
    }
}
