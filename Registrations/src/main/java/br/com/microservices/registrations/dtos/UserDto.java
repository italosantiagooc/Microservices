package br.com.microservices.registrations.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class UserDto {
    @JsonProperty("email")
    private String email;
    @JsonProperty("fullName")
    private String fullName;
}
