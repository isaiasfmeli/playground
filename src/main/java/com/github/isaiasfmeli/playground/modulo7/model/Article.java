package com.github.isaiasfmeli.playground.modulo7.model;

import lombok.*;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import javax.persistence.Id;
import java.util.List;

@Getter @Setter
@Document(indexName = "playground")
public class Article {

    @Id
    private int id;
    private String name;
    @Field(type = FieldType.Nested, includeInParent = true)
    private List<Author> authors;
}
