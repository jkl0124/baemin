package com.example.demo.user;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Data
@Entity
@NoArgsConstructor
@JsonNaming(value = PropertyNamingStrategy.SnakeCaseStrategy.class)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String userId;
    private String password;
    private String email;
    private String name;
    private String contact;

    public User(String userId, String password, String email, String name, String contact) {
        this.userId = userId;
        this.password = password;
        this.email = email;
        this.name = name;
        this.contact = contact;
    }

    public User(UserDTO userDTO){
        this.userId = userDTO.getUserId();
        this.password = userDTO.getPassword();
        this.email = userDTO.getEmail();
        this.name = userDTO.getName();
        this.contact = userDTO.getContact();
    }

    public UserDTO toDTO(){
        return new UserDTO(this);
    }
}
