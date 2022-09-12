package com.github.isaiasfmeli.playground.modulo7.repository;

import com.github.isaiasfmeli.playground.modulo7.model.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ArticleRepository extends ElasticsearchRepository<Article, Integer> {

    @Query("{\"match\": {\"name\": {\"query\": \"?0\"}}}")
    Page<Article> findByName(String title, Pageable pg);
}
