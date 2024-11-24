package com.ajay.SpringSec.controllers;

import com.ajay.SpringSec.models.Users;
import com.ajay.SpringSec.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/hello")
    public String greet(){
        return "hello";
    }


    @PostMapping("/signup")
    public Users signup(@RequestBody Users user){

        return userService.create(user);

    }



   @PostMapping("/login")
    public String login(@RequestBody Users user){

       return  userService.verify(user);
    }
}
