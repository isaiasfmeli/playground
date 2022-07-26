package com.github.isaiasfmeli.playground.modulo7.repository;

import com.github.isaiasfmeli.playground.modulo7.model.Article;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ArticleRepository extends ElasticsearchRepository<Article, Integer> {
}
