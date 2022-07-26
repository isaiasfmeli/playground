package com.github.isaiasfmeli.playground.modulo7.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
public class Genres {
    //id - int UN AI PK
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    //created_at -timestamp
    private LocalDateTime created_at;
    //updated_at - timestamp
    private LocalDateTime updated_at;
    //name - varchar(100)
    private String name;
    //ranking - int UN
    private Integer ranking;
    //active - tinyint(1)
    private Boolean active;
}
