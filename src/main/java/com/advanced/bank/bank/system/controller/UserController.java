package com.advanced.bank.bank.system.controller;

import com.advanced.bank.bank.system.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
public class UserController {
    @PostMapping
    public void createUser(@RequestBody User user){

    }

    @GetMapping
    public List<User> getUser(){return null;}

    @GetMapping("/{userId}")
        public List<User> getUser(@PathVariable("userId") Long userId){

        return null;
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable("userId") Long userId){

    }

    @PutMapping
    public  void updateUser(@RequestBody User user){

    }
}
