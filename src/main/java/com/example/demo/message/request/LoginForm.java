package com.example.demo.message.request;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class LoginForm implements Serializable {

    private String name;

    private String password;
    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public LoginForm(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
