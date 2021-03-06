package com.github.isaiasfmeli.playground.modulo3.controller;

import com.github.isaiasfmeli.playground.modulo3.model.User;
import com.github.isaiasfmeli.playground.modulo3.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    final UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping()
    public List<User> index()
    {
        return repository.getUsers();
    }

    @GetMapping("/{name}")
    public ResponseEntity<User> getUser(@PathVariable String name)
    {
        return new ResponseEntity(this.repository.getUser(name), HttpStatus.OK);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void saveUser(@RequestBody User user)
    {
        repository.saveUser(user);
    }
}
