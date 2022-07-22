package com.github.isaiasfmeli.playground.modulo7.controller;

import com.github.isaiasfmeli.playground.modulo7.model.Users;
import com.github.isaiasfmeli.playground.modulo7.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/users")
public class UsersController {

    @Autowired
    private UsersService service;

    @GetMapping()
    public ResponseEntity<List<Users>> list() {
        List<Users> users = service.findAll();
        if(users.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Users> read(@PathVariable Long id) {
        Optional<Users> user = service.findById(id);
        if(user.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(user.get());
    }

    @PostMapping()
    public ResponseEntity<Users> create(@RequestBody Users user) {
        Users userSaved = service.create(user);
        return ResponseEntity.ok(userSaved);
    }

    @PutMapping()
    public ResponseEntity<Users> update(@RequestBody Users user) {
        Users userUpdated = service.update(user);
        return ResponseEntity.ok(userUpdated);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Users> updatePatch(
            @PathVariable Long id,
            @RequestBody Map<String, String> updates) {
        return ResponseEntity.ok(service.updatePartial(id, updates).get());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Users> delete(@PathVariable Long id) {
        service.delete(service.findById(id).get());
        return ResponseEntity.ok().build();
    }

}
