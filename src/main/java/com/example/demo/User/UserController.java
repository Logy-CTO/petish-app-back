package com.example.demo.User;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @PostMapping("/Signup")
    @ResponseStatus(HttpStatus.OK)
    public Long join(@Valid @RequestBody SignupDto signupDto) throws Exception {
        return userService.signUp(signupDto);
    }
}
