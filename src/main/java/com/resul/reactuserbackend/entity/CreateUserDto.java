package com.resul.reactuserbackend.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserDto {
    private String username;
    private String email;
    private String password;
}
