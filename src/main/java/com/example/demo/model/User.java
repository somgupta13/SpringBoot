package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Repository;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Repository
@Document(collection = "user")
public class User {


//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;
    private String username;
    private ArrayList<String> roles;


    private String password;
    public User(){this.id=1;}
    User(String username, String password, ArrayList<String> roles){
        this.id=1;
        this.username=username;this.password=password;
        this.roles = roles;
    }


}