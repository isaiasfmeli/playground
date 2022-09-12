package com.github.isaiasfmeli.playground.modulo7.controller;

import com.github.isaiasfmeli.playground.modulo7.model.Article;
import com.github.isaiasfmeli.playground.modulo7.model.Users;
import com.github.isaiasfmeli.playground.modulo7.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/articles")
public class ArticlesController {

    @Autowired
    ArticleRepository service;

    @GetMapping()
    public ResponseEntity<Iterable<Article>> list() {
        Iterable<Article> articles = service.findAll();
        return ResponseEntity.ok(articles);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Article> read(@PathVariable Integer id) {
        Optional<Article> article = service.findById(id);
        if(article.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(article.get());
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<Page<Article>> getPageByName(@PathVariable String name, Pageable pg) {
        Page<Article> article = service.findByName(name, pg);
        return ResponseEntity.ok(article);
    }

    @PostMapping()
    public ResponseEntity<Article> create(@RequestBody Article article) {
        Article articleSaved = service.save(article);
        return ResponseEntity.ok(articleSaved);
    }

    @DeleteMapping
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
         service.deleteById(id);
         return ResponseEntity.ok().build();
     }
}
