package com.github.isaiasfmeli.playground.modulo7.controller;

import com.github.isaiasfmeli.playground.modulo7.model.Movies;
import com.github.isaiasfmeli.playground.modulo7.model.Users;
import com.github.isaiasfmeli.playground.modulo7.service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/movies")
public class MoviesController {

    @Autowired
    MoviesService service;

    @GetMapping()
    public ResponseEntity<List<Movies>> findAll() {
        List<Movies> movies = service.findAll();
        if(movies.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(movies);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movies> read(@PathVariable Long id) {
        Optional<Movies> user = service.findById(id);
        if(user.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(user.get());
    }
}
