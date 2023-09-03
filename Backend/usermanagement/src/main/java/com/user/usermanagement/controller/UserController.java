package com.user.usermanagement.controller;

import com.user.usermanagement.entity.User;
import com.user.usermanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService uservice;

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable("id") Long id)
    {
        System.out.println(uservice.getUser(id));
        User u = uservice.getUser(id);

        return new ResponseEntity<>(u,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<User> saveUser(@RequestBody User user)
    {
        return new ResponseEntity<>(uservice.saveUser(user), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<User> findUser(@RequestParam String email, @RequestParam String password)
    {
        return new ResponseEntity<>(uservice.findUser(email, password), HttpStatus.OK);
    }
}
