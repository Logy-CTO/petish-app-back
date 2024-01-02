package com.example.demo.User;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    public User signupDtoToUser(SignupDto signupDto);
}
