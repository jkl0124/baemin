package com.example.demo.user;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import jdk.jfr.Name;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Getter
//@JsonNaming(value = PropertyNamingStrategy.SnakeCaseStrategy.class)
@NoArgsConstructor
public class UserDTO {
    @NotNull(message = "아이디 입력값은 필수입니다.")
    private String userId;
    @NotBlank
    @Pattern(regexp = "(?=.*[0-9])(?=.*[a-zA-Z])(?=.*\\W)(?=\\S+$).{8,16}")
    private String password;
    @Email
    private String email;
    @NotNull
    private String name;
    @Min(12)
    private String contact;

    public UserDTO(String userId, String password, String email, String name, String contact) {
        this.userId = userId;
        this.password = password;
        this.email = email;
        this.name = name;
        this.contact = contact;
    }
    public UserDTO(User user){
        this.userId = user.getUserId();
        this.password = user.getPassword();
        this.email = user.getEmail();
        this.name = user.getName();
        this.contact = user.getContact();
    }

    public User toEntity(){
        return new User(this);
    }
    public UserDTO toDTO(User user){
        return new UserDTO(user);
    }
}
