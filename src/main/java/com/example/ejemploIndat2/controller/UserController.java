package com.example.ejemploIndat2.controller;

import com.example.ejemploIndat2.entity.UserEntity;
import com.example.ejemploIndat2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/hello")
    public String hello(){
        return "hola mundo";
    }
    @GetMapping("/allUser")
   public List<UserEntity> getAllUser(){
        return userService.findAll();
    }
//Metodo Post para crear un usuario
    @PostMapping("/saveUser")
    public String postUser(@RequestBody UserEntity user){
        return userService.created(user);
    }

    @GetMapping("/user/{id}")
    public Optional<UserEntity> findById(@PathVariable Integer ID){
        return userService.findById(Long.valueOf(ID));
    }

}
