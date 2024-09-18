package com.resul.reactuserbackend.mapper;

import com.resul.reactuserbackend.dto.UserDto;
import com.resul.reactuserbackend.entity.CreateUserDto;
import com.resul.reactuserbackend.entity.UpdateUserDto;
import com.resul.reactuserbackend.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    List<UserDto> toUserDtoList(List<UserEntity> userEntities);
    UserDto toUserDto(UserEntity userEntity);
    UserEntity toUserEntity(CreateUserDto createUserDto);
    void updateUserEntity(UpdateUserDto updateUserDto, @MappingTarget UserEntity userEntity);
}
