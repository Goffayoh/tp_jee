package com.example.demo.controller;

import com.example.demo.dto.createUserDTO;
import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/user")
    public void postUser(@RequestBody createUserDTO user)  {
        userService.createUser(user);
    }


    @GetMapping("/user")
    public List<UserEntity> getUser() {
        return userService.getUsers();
    }

    @DeleteMapping("/user")
    public void deleteUser(@RequestBody createUserDTO user)  {
        userService.deleteUser(user);
    }

}
