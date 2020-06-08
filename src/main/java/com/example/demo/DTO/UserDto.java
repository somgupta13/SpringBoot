package com.example.demo.DTO;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class UserDto {
    private String username;
    private String password;
    private ArrayList<String> roles;

}
