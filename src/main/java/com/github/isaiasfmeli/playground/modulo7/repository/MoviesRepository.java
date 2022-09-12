package com.github.isaiasfmeli.playground.modulo7.repository;

import com.github.isaiasfmeli.playground.modulo7.model.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface MoviesRepository extends JpaRepository<Movies, Long> {

    List<Movies> findAllByTitle(String name);
}
