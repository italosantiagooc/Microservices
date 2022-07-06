package br.com.microservices.registrations.exceptions;

import org.springframework.http.HttpStatus;

public class UserNotFoundException extends BusinessAbstractException{
    public UserNotFoundException() {
        super("User Not Found!", HttpStatus.NOT_FOUND);
    }
}
