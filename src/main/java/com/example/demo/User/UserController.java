package com.example.demo.User;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @PostMapping("/Signup")
    @ResponseStatus(HttpStatus.OK)
    public Long join(@Valid @RequestBody SignupDto signupDto) throws Exception {
        return userService.signUp(signupDto);
    }

    //DTO 없이 테스트 HTS
    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}
