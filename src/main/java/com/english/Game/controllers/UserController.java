package com.english.Game.controllers;

import com.english.Game.dtos.UserDTO;
import com.english.Game.entities.UserEntity;
import com.english.Game.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping
    public ResponseEntity<UserEntity> createUser(@RequestBody UserDTO userDTO) {
        UserEntity user = userService.createUser(userDTO);
        return ResponseEntity.ok(user);
    }

    @GetMapping
    public ResponseEntity<List<UserEntity>> listUsers() {
        List<UserEntity> users = userService.listUsers();
        return ResponseEntity.ok().body(users);
    }
}
