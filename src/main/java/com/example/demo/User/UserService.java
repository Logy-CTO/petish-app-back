package com.example.demo.User;

import java.util.List;

public interface UserService {
    public Long signUp(SignupDto signupDto) throws Exception;

    List<User> getAllUsers();
}
