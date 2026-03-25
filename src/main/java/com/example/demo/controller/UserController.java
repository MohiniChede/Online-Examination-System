package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    // User save karnyathi (POST request)
    @PostMapping("/save")
    public User saveUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    // ID ne user shodhnyasathi (GET request)
    @GetMapping("/{id}")
    public User getUser(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    // Sarv users chi list bghnyathi
    @GetMapping("/all")
    public List<User> getAll() {
        return userService.getAllUsers();
    }
}