package com.example.demo.User.ServiceImpl;

import com.example.demo.User.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper usermapper;

    @Override
    @Transactional
    public Long signUp(SignupDto signupDto) throws Exception {
        if(userRepository.findByPhone(signupDto.getPhone_number()).isPresent()){
            throw new Exception("이미 존재하는 사용자입니다.");
        }


        User user = userRepository.save(usermapper.signupDtoToUser(signupDto));


        return user.getUser_id();
    }

}
