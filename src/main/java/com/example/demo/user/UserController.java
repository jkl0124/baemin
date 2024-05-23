package com.example.demo.user;

import static com.example.demo.utils.ResponseEntityApi.error;
import com.example.demo.utils.ResponseEntityApi;
import com.example.demo.utils.Validator;
import com.fasterxml.jackson.databind.ObjectMapper;
import exercise.exception.CustomException;
import jakarta.validation.Valid;
import java.util.HashMap;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {
    UserService userService;
    ObjectMapper objectMapper = new ObjectMapper();
    @Autowired
    UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/signup")
    public ResponseEntityApi.ResponseEntity<?> signup(@RequestBody @Valid UserDTO user)
//        Errors errors)
    {
        if(!Validator.isAlpha(user.getUserId())){
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        UserDTO resultUser;
        try{
//            if(userService.checkValidation(user.getUserId())){
//                return error("overlap");
//            }
            resultUser = userService.signup(user);
            Map<String,String> map = new HashMap<>();
            map.put("userId",resultUser.getUserId());
            return ResponseEntityApi.success(map);
        }catch (NullPointerException exception){
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            return error("asd");
        }
    }

    @PostMapping("/login")
    public ResponseEntityApi.ResponseEntity<?> login(@RequestBody Map<String, String> user){
        try{
            User resultUser = userService.login(user.get("userId"),user.get("password"));
            log.info(resultUser.getUserId());
            Map<String,String> map = new HashMap<>();
            map.put("userId",resultUser.getUserId());
            return ResponseEntityApi.success(map);
//            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }catch (NullPointerException nullPointerException){
            return ResponseEntityApi.error(nullPointerException);
        }
    }

//    @PostMapping("/validation")
//    public ResponseEntity<Boolean> check(@RequestBody String userId){
//        try{
//            Boolean result = userService.checkValidation(userId);
//            return new ResponseEntity<>(result,HttpStatus.OK);
//        }catch (Exception e){
//            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
    @GetMapping("/datasource")
    public void makeConnection(){
//        userService.makeConnection();
    }

//    @PutMapping("/users")
//    public ResponseEntity putUesr(@RequestBody Map<String,String> user){
//        try{
//            User resultUser = userService.putUser(user);
//        }
//    }
}
