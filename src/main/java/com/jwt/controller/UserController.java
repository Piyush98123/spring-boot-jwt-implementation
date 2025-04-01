package com.jwt.controller;


import com.jwt.dto.User;
import com.jwt.service.UserService;
import com.jwt.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JwtUtil jwtUtil;

    @PostMapping("/signup")
    public void signUp(@RequestBody User user){
        userService.saveUser(user);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<User>> getUser(){
        return ResponseEntity.ok(userService.getUser());
    }

    @GetMapping("/current-user")
    public ResponseEntity<String> getCurrentUser(Principal principal){
        return ResponseEntity.ok(principal.getName());
    }

}
