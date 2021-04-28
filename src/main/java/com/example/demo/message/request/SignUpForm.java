package com.example.demo.message.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


import java.io.Serializable;
import java.util.Set;
@Getter
@Setter

public class SignUpForm implements Serializable {


    private String username;

    private String email;

    private String password;

    private Set<String> role;


    public SignUpForm(String username, String email, String password, Set<String> role) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role;
    }
}
