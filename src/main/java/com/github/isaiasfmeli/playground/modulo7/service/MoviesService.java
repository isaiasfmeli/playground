package com.github.isaiasfmeli.playground.modulo7.service;

import com.github.isaiasfmeli.playground.modulo7.model.Movies;
import com.github.isaiasfmeli.playground.modulo7.repository.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.*;

@Service
public class MoviesService {

    @Autowired
    MoviesRepository repo;

    public List<Movies> findAll() {
        return repo.findAll();
    }

    public Optional<Movies> findById(Long id) {
        return repo.findById(id);
    }
}
