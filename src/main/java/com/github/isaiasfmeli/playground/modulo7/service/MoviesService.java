package com.github.isaiasfmeli.playground.modulo7.service;

import com.github.isaiasfmeli.playground.modulo7.model.Movies;
import com.github.isaiasfmeli.playground.modulo7.repository.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class MoviesService {

    @Autowired
    private MoviesRepository repo;

    public List<Movies> findAll() {
        return repo.findAll();
    }

    public Optional<Movies> findById(Long id) {
        return repo.findById(id);
    }

    public List<Movies> findAllByTitle(String title) {
        return repo.findAllByTitle(title);
    }
}
