package com.example.intern.controller;

import com.example.intern.entity.User;
import com.example.intern.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") // for CORS
public class UserController {

  @Autowired
  private UserService userService;

  @PostMapping("/register")
  public String registerUser(@RequestBody User user) {
    userService.saveUser(user);
    return "User registered successfully!";
  }

  @GetMapping("/users")
  public List<User> getAllUsers() {
    return userService.getAllUsers();
  }
}
