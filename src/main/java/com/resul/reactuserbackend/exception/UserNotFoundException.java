package com.resul.reactuserbackend.exception;

public class UserNotFoundException extends NotFoundException{
    public UserNotFoundException(String message){
        super(message);
    }
}
