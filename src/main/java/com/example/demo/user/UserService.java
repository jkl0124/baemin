package com.example.demo.user;

import exercise.exception.CustomException;
import java.util.Map;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class UserService {
    UserRepository userRepository;

    @Autowired
    UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Transactional
    UserDTO signup(UserDTO userDto){
        User user = userDto.toEntity();
        userRepository.save(user);
        log.info(user.toString());
        Optional<User> user2 = userRepository.findByUserId(user.getUserId());
        return user2.get().toDTO();
    }
    User login(String userId,String password){
//        return userRepository.login(userId,password);
        return new User();
    }

//    User putUser(Map<String,String> user){
//        return userRepository.putUser(user);
//    }
//    Boolean checkValidation(String userId) throws CustomException {
//        User user = userRepository.findByUserId(userId);
//        if(user!=null){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }
//    public void makeConnection(){
//        userRepository.makeConnection();
//    }
}
